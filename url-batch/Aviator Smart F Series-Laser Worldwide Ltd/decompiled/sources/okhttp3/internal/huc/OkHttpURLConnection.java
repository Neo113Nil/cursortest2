package okhttp3.internal.huc;

import com.baidu.mapapi.http.wrapper.HttpManager;
import com.yanzhenjie.kalle.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.URLFilter;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.c;

/* loaded from: classes5.dex */
public final class OkHttpURLConnection extends HttpURLConnection implements Callback {
    Call call;
    private Throwable callFailure;
    OkHttpClient client;
    boolean connectPending;
    private boolean executed;
    private long fixedContentLength;
    Handshake handshake;
    private final Object lock;
    private final NetworkInterceptor networkInterceptor;
    Response networkResponse;
    Proxy proxy;
    private Headers.Builder requestHeaders;
    private Response response;
    private Headers responseHeaders;
    URLFilter urlFilter;
    public static final String SELECTED_PROTOCOL = Platform.get().getPrefix() + "-Selected-Protocol";
    public static final String RESPONSE_SOURCE = Platform.get().getPrefix() + "-Response-Source";
    private static final Set<String> METHODS = new LinkedHashSet(Arrays.asList("OPTIONS", HttpManager.HTTP_GET, "HEAD", HttpManager.HTTP_POST, HttpManager.HTTP_PUT, HttpManager.HTTP_DELETE, "TRACE", "PATCH"));

    final class NetworkInterceptor implements Interceptor {
        private boolean proceed;

        NetworkInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            URLFilter uRLFilter = OkHttpURLConnection.this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(request.url().url());
            }
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection okHttpURLConnection = OkHttpURLConnection.this;
                okHttpURLConnection.connectPending = false;
                okHttpURLConnection.proxy = chain.connection().route().proxy();
                OkHttpURLConnection.this.handshake = chain.connection().handshake();
                OkHttpURLConnection.this.lock.notifyAll();
                while (!this.proceed) {
                    try {
                        OkHttpURLConnection.this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            if (request.body() instanceof OutputStreamRequestBody) {
                request = ((OutputStreamRequestBody) request.body()).prepareToSendRequest(request);
            }
            Response proceed = chain.proceed(request);
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection okHttpURLConnection2 = OkHttpURLConnection.this;
                okHttpURLConnection2.networkResponse = proceed;
                ((HttpURLConnection) okHttpURLConnection2).url = proceed.request().url().url();
            }
            return proceed;
        }

        public void proceed() {
            synchronized (OkHttpURLConnection.this.lock) {
                this.proceed = true;
                OkHttpURLConnection.this.lock.notifyAll();
            }
        }
    }

    static final class UnexpectedException extends IOException {
        static final Interceptor INTERCEPTOR = new Interceptor() { // from class: okhttp3.internal.huc.OkHttpURLConnection.UnexpectedException.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                try {
                    return chain.proceed(chain.request());
                } catch (Error | RuntimeException e8) {
                    throw new UnexpectedException(e8);
                }
            }
        };

        UnexpectedException(Throwable th) {
            super(th);
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.networkInterceptor = new NetworkInterceptor();
        this.requestHeaders = new Headers.Builder();
        this.fixedContentLength = -1L;
        this.lock = new Object();
        this.connectPending = true;
        this.client = okHttpClient;
    }

    private Call buildCall() {
        OutputStreamRequestBody outputStreamRequestBody;
        Call call = this.call;
        if (call != null) {
            return call;
        }
        boolean z7 = true;
        ((HttpURLConnection) this).connected = true;
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals(HttpManager.HTTP_GET)) {
                ((HttpURLConnection) this).method = HttpManager.HTTP_POST;
            } else if (!HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
                throw new ProtocolException(((HttpURLConnection) this).method + " does not support writing");
            }
        }
        if (this.requestHeaders.get("User-Agent") == null) {
            this.requestHeaders.add("User-Agent", defaultUserAgent());
        }
        if (HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
            if (this.requestHeaders.get("Content-Type") == null) {
                this.requestHeaders.add("Content-Type", i.VALUE_APPLICATION_URLENCODED);
            }
            long j8 = -1;
            if (this.fixedContentLength == -1 && ((HttpURLConnection) this).chunkLength <= 0) {
                z7 = false;
            }
            String str = this.requestHeaders.get("Content-Length");
            long j9 = this.fixedContentLength;
            if (j9 != -1) {
                j8 = j9;
            } else if (str != null) {
                j8 = Long.parseLong(str);
            }
            outputStreamRequestBody = z7 ? new StreamedRequestBody(j8) : new BufferedRequestBody(j8);
            outputStreamRequestBody.timeout().timeout(this.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        } else {
            outputStreamRequestBody = null;
        }
        try {
            Request build = new Request.Builder().url(HttpUrl.get(getURL().toString())).headers(this.requestHeaders.build()).method(((HttpURLConnection) this).method, outputStreamRequestBody).build();
            URLFilter uRLFilter = this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(build.url().url());
            }
            OkHttpClient.Builder newBuilder = this.client.newBuilder();
            newBuilder.interceptors().clear();
            newBuilder.interceptors().add(UnexpectedException.INTERCEPTOR);
            newBuilder.networkInterceptors().clear();
            newBuilder.networkInterceptors().add(this.networkInterceptor);
            newBuilder.dispatcher(new Dispatcher(this.client.dispatcher().executorService()));
            if (!getUseCaches()) {
                newBuilder.cache(null);
            }
            Call newCall = newBuilder.build().newCall(build);
            this.call = newCall;
            return newCall;
        } catch (IllegalArgumentException e8) {
            if (Internal.instance.isInvalidHttpUrlHost(e8)) {
                UnknownHostException unknownHostException = new UnknownHostException();
                unknownHostException.initCause(e8);
                throw unknownHostException;
            }
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e8);
            throw malformedURLException;
        }
    }

    private String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        return property != null ? toHumanReadableAscii(property) : Version.userAgent();
    }

    private Headers getHeaders() {
        if (this.responseHeaders == null) {
            Response response = getResponse(true);
            this.responseHeaders = response.headers().newBuilder().add(SELECTED_PROTOCOL, response.protocol().toString()).add(RESPONSE_SOURCE, responseSourceHeader(response)).build();
        }
        return this.responseHeaders;
    }

    private Response getResponse(boolean z7) {
        Response response;
        synchronized (this.lock) {
            try {
                Response response2 = this.response;
                if (response2 != null) {
                    return response2;
                }
                Throwable th = this.callFailure;
                if (th != null) {
                    if (!z7 || (response = this.networkResponse) == null) {
                        throw propagate(th);
                    }
                    return response;
                }
                Call buildCall = buildCall();
                this.networkInterceptor.proceed();
                OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall.request().body();
                if (outputStreamRequestBody != null) {
                    outputStreamRequestBody.outputStream().close();
                }
                if (this.executed) {
                    synchronized (this.lock) {
                        while (this.response == null && this.callFailure == null) {
                            try {
                                this.lock.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                } else {
                    this.executed = true;
                    try {
                        onResponse(buildCall, buildCall.execute());
                    } catch (IOException e8) {
                        onFailure(buildCall, e8);
                    }
                }
                synchronized (this.lock) {
                    try {
                        Throwable th2 = this.callFailure;
                        if (th2 != null) {
                            throw propagate(th2);
                        }
                        Response response3 = this.response;
                        if (response3 != null) {
                            return response3;
                        }
                        throw new AssertionError();
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    private static IOException propagate(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new AssertionError();
    }

    private static String responseSourceHeader(Response response) {
        if (response.networkResponse() == null) {
            if (response.cacheResponse() == null) {
                return "NONE";
            }
            return "CACHE " + response.code();
        }
        if (response.cacheResponse() == null) {
            return "NETWORK " + response.code();
        }
        return "CONDITIONAL_CACHE " + response.networkResponse().code();
    }

    private static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int codePointAt = str.codePointAt(i8);
            if (codePointAt <= 31 || codePointAt >= 127) {
                c cVar = new c();
                cVar.writeUtf8(str, 0, i8);
                cVar.writeUtf8CodePoint(63);
                while (true) {
                    i8 += Character.charCount(codePointAt);
                    if (i8 >= length) {
                        return cVar.readUtf8();
                    }
                    codePointAt = str.codePointAt(i8);
                    cVar.writeUtf8CodePoint((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                }
            } else {
                i8 += Character.charCount(codePointAt);
            }
        }
        return str;
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 != null) {
            this.requestHeaders.add(str, str2);
            return;
        }
        Platform.get().log(5, "Ignoring header " + str + " because its value was null.", (Throwable) null);
    }

    @Override // java.net.URLConnection
    public void connect() {
        if (this.executed) {
            return;
        }
        Call buildCall = buildCall();
        this.executed = true;
        buildCall.enqueue(this);
        synchronized (this.lock) {
            while (this.connectPending && this.response == null && this.callFailure == null) {
                try {
                    try {
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Throwable th2 = this.callFailure;
            if (th2 != null) {
                throw propagate(th2);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (this.call == null) {
            return;
        }
        this.networkInterceptor.proceed();
        this.call.cancel();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.client.connectTimeoutMillis();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            Response response = getResponse(true);
            if (HttpHeaders.hasBody(response) && response.code() >= 400) {
                return response.body().byteStream();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i8) {
        try {
            Headers headers = getHeaders();
            if (i8 >= 0 && i8 < headers.size()) {
                return headers.value(i8);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i8) {
        try {
            Headers headers = getHeaders();
            if (i8 >= 0 && i8 < headers.size()) {
                return headers.name(i8);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            return JavaNetHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        if (!((HttpURLConnection) this).doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        Response response = getResponse(false);
        if (response.code() < 400) {
            return response.body().byteStream();
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.client.followRedirects();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall().request().body();
        if (outputStreamRequestBody == null) {
            throw new ProtocolException("method does not support a request body: " + ((HttpURLConnection) this).method);
        }
        if (outputStreamRequestBody instanceof StreamedRequestBody) {
            connect();
            this.networkInterceptor.proceed();
        }
        if (outputStreamRequestBody.isClosed()) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return outputStreamRequestBody.outputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        URL url = getURL();
        String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : HttpUrl.defaultPort(url.getProtocol());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.proxy().address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + port, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.client.readTimeoutMillis();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null);
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.requestHeaders.get(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return getResponse(true).code();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return getResponse(true).message();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        synchronized (this.lock) {
            try {
                boolean z7 = iOException instanceof UnexpectedException;
                Throwable th = iOException;
                if (z7) {
                    th = iOException.getCause();
                }
                this.callFailure = th;
                this.lock.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        synchronized (this.lock) {
            this.response = response;
            this.handshake = response.handshake();
            ((HttpURLConnection) this).url = response.request().url().url();
            this.lock.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i8) {
        this.client = this.client.newBuilder().connectTimeout(i8, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i8) {
        setFixedLengthStreamingMode(i8);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j8) {
        super.setIfModifiedSince(j8);
        if (((HttpURLConnection) this).ifModifiedSince != 0) {
            this.requestHeaders.set("If-Modified-Since", HttpDate.format(new Date(((HttpURLConnection) this).ifModifiedSince)));
        } else {
            this.requestHeaders.removeAll("If-Modified-Since");
        }
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z7) {
        this.client = this.client.newBuilder().followRedirects(z7).build();
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i8) {
        this.client = this.client.newBuilder().readTimeout(i8, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        Set<String> set = METHODS;
        if (set.contains(str)) {
            ((HttpURLConnection) this).method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + set + " but was " + str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 != null) {
            this.requestHeaders.set(str, str2);
            return;
        }
        Platform.get().log(5, "Ignoring header " + str + " because its value was null.", (Throwable) null);
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        if (this.proxy != null) {
            return true;
        }
        Proxy proxy = this.client.proxy();
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j8) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (((HttpURLConnection) this).chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j8 < 0) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.fixedContentLength = j8;
        ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j8, 2147483647L);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        String str2;
        try {
            if (str == null) {
                str2 = StatusLine.get(getResponse(true)).toString();
            } else {
                str2 = getHeaders().get(str);
            }
            return str2;
        } catch (IOException unused) {
            return null;
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient, URLFilter uRLFilter) {
        this(url, okHttpClient);
        this.urlFilter = uRLFilter;
    }
}
