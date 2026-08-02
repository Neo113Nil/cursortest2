package okhttp3.internal.http;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.measurement.internal.zzhf;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.GzipSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Utf8;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public final class BridgeInterceptor implements Interceptor {
    public static final BridgeInterceptor INSTANCE = new BridgeInterceptor(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BridgeInterceptor(int i) {
        this.$r8$classId = i;
    }

    public static Request followUpRequest(Response response, Exchange exchange, RealInterceptorChain realInterceptorChain) {
        HttpUrl resolve;
        RequestBody requestBody;
        Response response2;
        Route route = exchange != null ? exchange.getConnection$okhttp().route : null;
        int i = response.code;
        Request request = response.request;
        String str = request.method;
        if (i != 307 && i != 308) {
            if (i == 401) {
                realInterceptorChain.authenticator.getClass();
                return null;
            }
            if (i == 421) {
                RequestBody requestBody2 = request.body;
                if ((requestBody2 == null || !requestBody2.isOneShot()) && exchange != null && !Intrinsics.areEqual(((ExchangeFinder) exchange.finder).getRoutePlanner().address.url.host, ((ExchangeCodec) exchange.codec).getCarrier().getRoute().address.url.host)) {
                    RealConnection connection$okhttp = exchange.getConnection$okhttp();
                    synchronized (connection$okhttp) {
                        connection$okhttp.noCoalescedConnections = true;
                    }
                    return response.request;
                }
            } else if (i == 503) {
                Response response3 = response.priorResponse;
                if ((response3 == null || response3.code != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                    return response.request;
                }
            } else {
                if (i == 407) {
                    route.getClass();
                    if (route.proxy.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    realInterceptorChain.proxyAuthenticator.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (realInterceptorChain.retryOnConnectionFailure && (((requestBody = request.body) == null || !requestBody.isOneShot()) && (((response2 = response.priorResponse) == null || response2.code != 408) && retryAfter(response, 0) <= 0))) {
                    return response.request;
                }
            }
            return null;
        }
        if (realInterceptorChain.call.client.followRedirects) {
            String str2 = response.headers.get("Location");
            if (str2 == null) {
                str2 = null;
            }
            Request request2 = response.request;
            if (str2 != null && (resolve = request2.url.resolve(str2)) != null && (Intrinsics.areEqual(resolve.scheme, request2.url.scheme) || realInterceptorChain.call.client.followSslRedirects)) {
                Request.Builder newBuilder = request2.newBuilder();
                if (SafeTrace.permitsRequestBody(str)) {
                    int i2 = response.code;
                    boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                    if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                        newBuilder.method(str, z ? request2.body : null);
                    } else {
                        newBuilder.method("GET", null);
                    }
                    if (!z) {
                        newBuilder.headers.removeAll("Transfer-Encoding");
                        newBuilder.headers.removeAll("Content-Length");
                        newBuilder.headers.removeAll("Content-Type");
                    }
                }
                if (!_UtilJvmKt.canReuseConnectionFor(request2.url, resolve)) {
                    newBuilder.headers.removeAll("Authorization");
                }
                newBuilder.url = resolve;
                return new Request(newBuilder);
            }
        }
        return null;
    }

    public static boolean recover(IOException iOException, RealCall realCall, RealInterceptorChain realInterceptorChain, Request request) {
        RequestBody requestBody;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!realInterceptorChain.retryOnConnectionFailure) {
            return false;
        }
        if ((!z && (((requestBody = request.body) != null && requestBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Exchange exchange = realCall.exchange;
        if (exchange == null || !exchange.hasFailure) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.exchangeFinder;
        exchangeFinder.getClass();
        RealRoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
        Exchange exchange2 = realCall.exchange;
        return routePlanner.hasNext(exchange2 != null ? exchange2.getConnection$okhttp() : null);
    }

    public static int retryAfter(Response response, int i) {
        String str = response.headers.get("Retry-After");
        if (str == null) {
            str = null;
        }
        if (str == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(str)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(str);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bc, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0424, code lost:
    
        if ("close".equalsIgnoreCase(r2) != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0118, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0360 A[Catch: IOException -> 0x032d, TryCatch #5 {IOException -> 0x032d, blocks: (B:144:0x0314, B:146:0x031d, B:153:0x0330, B:157:0x0357, B:159:0x0360, B:161:0x036d, B:169:0x0386, B:173:0x039d, B:178:0x03ac, B:179:0x03b3, B:182:0x03b6, B:185:0x03bf, B:190:0x03cd, B:191:0x0406, B:193:0x0417, B:196:0x0420, B:203:0x0439, B:205:0x0446, B:206:0x046a, B:207:0x0426, B:208:0x03ef), top: B:143:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039d A[Catch: IOException -> 0x032d, TryCatch #5 {IOException -> 0x032d, blocks: (B:144:0x0314, B:146:0x031d, B:153:0x0330, B:157:0x0357, B:159:0x0360, B:161:0x036d, B:169:0x0386, B:173:0x039d, B:178:0x03ac, B:179:0x03b3, B:182:0x03b6, B:185:0x03bf, B:190:0x03cd, B:191:0x0406, B:193:0x0417, B:196:0x0420, B:203:0x0439, B:205:0x0446, B:206:0x046a, B:207:0x0426, B:208:0x03ef), top: B:143:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03b6 A[Catch: IOException -> 0x032d, TryCatch #5 {IOException -> 0x032d, blocks: (B:144:0x0314, B:146:0x031d, B:153:0x0330, B:157:0x0357, B:159:0x0360, B:161:0x036d, B:169:0x0386, B:173:0x039d, B:178:0x03ac, B:179:0x03b3, B:182:0x03b6, B:185:0x03bf, B:190:0x03cd, B:191:0x0406, B:193:0x0417, B:196:0x0420, B:203:0x0439, B:205:0x0446, B:206:0x046a, B:207:0x0426, B:208:0x03ef), top: B:143:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0417 A[Catch: IOException -> 0x032d, TryCatch #5 {IOException -> 0x032d, blocks: (B:144:0x0314, B:146:0x031d, B:153:0x0330, B:157:0x0357, B:159:0x0360, B:161:0x036d, B:169:0x0386, B:173:0x039d, B:178:0x03ac, B:179:0x03b3, B:182:0x03b6, B:185:0x03bf, B:190:0x03cd, B:191:0x0406, B:193:0x0417, B:196:0x0420, B:203:0x0439, B:205:0x0446, B:206:0x046a, B:207:0x0426, B:208:0x03ef), top: B:143:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0473  */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46, types: [okhttp3.internal.http.ExchangeCodec] */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        int i;
        String str;
        boolean z;
        boolean z2;
        Response.Builder builder;
        IOException iOException;
        Response build;
        int i2;
        boolean z3;
        boolean z4;
        Response build2;
        Request request;
        ?? r4;
        boolean z5;
        RealCall realCall;
        boolean z6;
        boolean z7;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        switch (this.$r8$classId) {
            case 0:
                int i3 = 1;
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
                Request request2 = realInterceptorChain.request;
                Request.Builder newBuilder = request2.newBuilder();
                HttpUrl httpUrl = request2.url;
                Headers headers = request2.headers;
                RequestBody requestBody = request2.body;
                if (requestBody != null) {
                    MediaType contentType = requestBody.contentType();
                    if (contentType != null) {
                        newBuilder.header("Content-Type", contentType.mediaType);
                    }
                    long contentLength = requestBody.contentLength();
                    if (contentLength != -1) {
                        newBuilder.header("Content-Length", String.valueOf(contentLength));
                        newBuilder.headers.removeAll("Transfer-Encoding");
                    } else {
                        newBuilder.header("Transfer-Encoding", "chunked");
                        newBuilder.headers.removeAll("Content-Length");
                    }
                }
                if (headers.get("Host") == null) {
                    i = 0;
                    newBuilder.header("Host", _UtilJvmKt.toHostHeader(httpUrl, false));
                } else {
                    i = 0;
                }
                if (headers.get("Connection") == null) {
                    newBuilder.header("Connection", "Keep-Alive");
                }
                if (headers.get("Accept-Encoding") == null && headers.get("Range") == null) {
                    newBuilder.header("Accept-Encoding", "gzip");
                } else {
                    i3 = i;
                }
                CookieJar cookieJar = realInterceptorChain.cookieJar;
                List loadForRequest = cookieJar.loadForRequest(httpUrl);
                if (loadForRequest.isEmpty()) {
                    str = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (Object obj : loadForRequest) {
                        int i4 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Cookie cookie = (Cookie) obj;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(cookie.name());
                        sb.append('=');
                        sb.append(cookie.value());
                        i = i4;
                    }
                    str = null;
                    newBuilder.header("Cookie", sb.toString());
                }
                if (headers.get("User-Agent") == null) {
                    newBuilder.header("User-Agent", "okhttp/5.4.0");
                }
                Request request3 = new Request(newBuilder);
                Response proceed = realInterceptorChain.proceed(request3);
                Headers headers2 = proceed.headers;
                HttpHeaders.receiveHeaders(cookieJar, request3.url, headers2);
                Response.Builder newBuilder2 = proceed.newBuilder();
                newBuilder2.request = request3;
                if (i3 != 0) {
                    String str2 = headers2.get("Content-Encoding");
                    if (str2 == null) {
                        str2 = str;
                    }
                    if ("gzip".equalsIgnoreCase(str2) && HttpHeaders.promisesBody(proceed)) {
                        GzipSource gzipSource = new GzipSource(proceed.body.source());
                        Headers.Builder newBuilder3 = headers2.newBuilder();
                        newBuilder3.removeAll("Content-Encoding");
                        newBuilder3.removeAll("Content-Length");
                        newBuilder2.headers = newBuilder3.build().newBuilder();
                        String str3 = headers2.get("Content-Type");
                        newBuilder2.body = new RealResponseBody(str3 == null ? str : str3, -1L, new RealBufferedSource(gzipSource));
                    }
                }
                return newBuilder2.build();
            case 1:
                RealInterceptorChain realInterceptorChain2 = (RealInterceptorChain) chain;
                Exchange exchange = realInterceptorChain2.exchange;
                exchange.getClass();
                Request request4 = realInterceptorChain2.request;
                RequestBody requestBody2 = request4.body;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z8 = SafeTrace.permitsRequestBody(request4.method) && requestBody2 != null;
                boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(request4.headers.get("Connection"));
                try {
                    exchange.writeRequestHeaders(request4);
                    if (z8) {
                        boolean equalsIgnoreCase2 = "100-continue".equalsIgnoreCase(request4.headers.get("Expect"));
                        try {
                            if (equalsIgnoreCase2) {
                                try {
                                    ((ExchangeCodec) exchange.codec).flushRequest();
                                    Response.Builder readResponseHeaders = exchange.readResponseHeaders(true);
                                    try {
                                        EventListener eventListener = ((RealCall) exchange.call).eventListener;
                                        eventListener.responseHeadersStart((RealCall) exchange.call);
                                        builder = readResponseHeaders;
                                        z2 = false;
                                        r4 = eventListener;
                                    } catch (IOException e) {
                                        e = e;
                                        builder = readResponseHeaders;
                                        z2 = true;
                                        z = true;
                                        if (e instanceof ConnectionShutdownException) {
                                        }
                                    }
                                } catch (IOException e2) {
                                    ((RealCall) exchange.call).eventListener.requestFailed((RealCall) exchange.call, e2);
                                    exchange.trackFailure(e2);
                                    throw e2;
                                }
                            } else {
                                builder = null;
                                z2 = true;
                                r4 = equalsIgnoreCase2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            builder = null;
                        }
                        try {
                            if (builder == null) {
                                try {
                                    r4 = requestBody2.isDuplex();
                                    if (r4 != 0) {
                                        try {
                                            r4 = (ExchangeCodec) exchange.codec;
                                            r4.flushRequest();
                                            z5 = true;
                                            requestBody2.writeTo(new RealBufferedSink(exchange.createRequestBody(request4, true)));
                                        } catch (IOException e4) {
                                            ((RealCall) exchange.call).eventListener.requestFailed((RealCall) exchange.call, e4);
                                            exchange.trackFailure(e4);
                                            throw e4;
                                        }
                                    } else {
                                        z5 = true;
                                        RealBufferedSink realBufferedSink = new RealBufferedSink(exchange.createRequestBody(request4, false));
                                        requestBody2.writeTo(realBufferedSink);
                                        realBufferedSink.close();
                                    }
                                    z = z5;
                                } catch (IOException e5) {
                                    e = e5;
                                    r4 = 1;
                                    z = r4;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                            } else {
                                z = true;
                                try {
                                    ((RealCall) exchange.call).messageDone$okhttp(exchange, true, false, false, false, null);
                                    if (!(exchange.getConnection$okhttp().http2Connection != null)) {
                                        ((ExchangeCodec) exchange.codec).getCarrier().noNewExchanges();
                                    }
                                } catch (IOException e6) {
                                    e = e6;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                            }
                        } catch (IOException e7) {
                            e = e7;
                            z = r4;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.hasFailure) {
                                throw e;
                            }
                            iOException = e;
                            if (builder == null) {
                            }
                            builder.request = request4;
                            builder.handshake = exchange.getConnection$okhttp().handshake;
                            builder.sentRequestAtMillis = currentTimeMillis;
                            builder.receivedResponseAtMillis = System.currentTimeMillis();
                            build = builder.build();
                            i2 = build.code;
                            while (true) {
                                if (i2 != 100) {
                                }
                                Response.Builder readResponseHeaders2 = exchange.readResponseHeaders(false);
                                readResponseHeaders2.getClass();
                                if (!z2) {
                                }
                                readResponseHeaders2.request = request4;
                                readResponseHeaders2.handshake = exchange.getConnection$okhttp().handshake;
                                readResponseHeaders2.sentRequestAtMillis = currentTimeMillis;
                                readResponseHeaders2.receivedResponseAtMillis = System.currentTimeMillis();
                                build = readResponseHeaders2.build();
                                i2 = build.code;
                            }
                            ((RealCall) exchange.call).eventListener.responseHeadersEnd((RealCall) exchange.call, build);
                            if (i2 != 101) {
                            }
                            if (z3) {
                            }
                            if (z3) {
                            }
                            z4 = false;
                            if (equalsIgnoreCase) {
                            }
                            RealResponseBody openResponseBody = exchange.openResponseBody(build);
                            Response.Builder newBuilder4 = build.newBuilder();
                            newBuilder4.body = openResponseBody;
                            newBuilder4.trailersSource = new OkHttpCall.AnonymousClass1(20, exchange, openResponseBody);
                            build2 = newBuilder4.build();
                            request = build2.request;
                            request.getClass();
                            if (!"close".equalsIgnoreCase(request.headers.get("Connection"))) {
                            }
                            ((ExchangeCodec) exchange.codec).getCarrier().noNewExchanges();
                            if (i2 == 204) {
                            }
                            throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + build2.body.contentLength());
                        }
                    } else {
                        z = true;
                        try {
                            ((RealCall) exchange.call).messageDone$okhttp(exchange, true, false, false, false, null);
                            z2 = true;
                            builder = null;
                        } catch (IOException e8) {
                            e = e8;
                            z2 = z;
                            builder = null;
                            if (e instanceof ConnectionShutdownException) {
                            }
                        }
                    }
                    if (requestBody2 == null || !requestBody2.isDuplex()) {
                        try {
                            ((ExchangeCodec) exchange.codec).finishRequest();
                        } catch (IOException e9) {
                            ((RealCall) exchange.call).eventListener.requestFailed((RealCall) exchange.call, e9);
                            exchange.trackFailure(e9);
                            throw e9;
                        }
                    }
                    iOException = null;
                } catch (IOException e10) {
                    e = e10;
                    z = true;
                }
                if (builder == null) {
                    try {
                        builder = exchange.readResponseHeaders(false);
                        builder.getClass();
                        if (z2) {
                            ((RealCall) exchange.call).eventListener.responseHeadersStart((RealCall) exchange.call);
                            z2 = false;
                        }
                    } catch (IOException e11) {
                        if (iOException == null) {
                            throw e11;
                        }
                        ExceptionsKt__ExceptionsKt.addSuppressed(iOException, e11);
                        throw iOException;
                    }
                }
                builder.request = request4;
                builder.handshake = exchange.getConnection$okhttp().handshake;
                builder.sentRequestAtMillis = currentTimeMillis;
                builder.receivedResponseAtMillis = System.currentTimeMillis();
                build = builder.build();
                i2 = build.code;
                while (true) {
                    if (i2 != 100 && (102 > i2 || i2 >= 200)) {
                    }
                    Response.Builder readResponseHeaders22 = exchange.readResponseHeaders(false);
                    readResponseHeaders22.getClass();
                    if (!z2) {
                        ((RealCall) exchange.call).eventListener.responseHeadersStart((RealCall) exchange.call);
                    }
                    readResponseHeaders22.request = request4;
                    readResponseHeaders22.handshake = exchange.getConnection$okhttp().handshake;
                    readResponseHeaders22.sentRequestAtMillis = currentTimeMillis;
                    readResponseHeaders22.receivedResponseAtMillis = System.currentTimeMillis();
                    build = readResponseHeaders22.build();
                    i2 = build.code;
                }
                ((RealCall) exchange.call).eventListener.responseHeadersEnd((RealCall) exchange.call, build);
                z3 = i2 != 101 ? z : false;
                if (z3) {
                    if (exchange.getConnection$okhttp().http2Connection != null ? z : false) {
                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                    }
                }
                if (z3) {
                    String str4 = build.headers.get("Connection");
                    if (str4 == null) {
                        str4 = null;
                    }
                    if ("upgrade".equalsIgnoreCase(str4)) {
                        z4 = z;
                        if (equalsIgnoreCase || !z4) {
                            RealResponseBody openResponseBody2 = exchange.openResponseBody(build);
                            Response.Builder newBuilder42 = build.newBuilder();
                            newBuilder42.body = openResponseBody2;
                            newBuilder42.trailersSource = new OkHttpCall.AnonymousClass1(20, exchange, openResponseBody2);
                            build2 = newBuilder42.build();
                        } else {
                            Response.Builder newBuilder5 = build.newBuilder();
                            newBuilder5.body = new UnreadableResponseBody(build.body.contentType(), build.body.contentLength());
                            newBuilder5.socket = exchange.upgradeToSocket();
                            build2 = newBuilder5.build();
                        }
                        request = build2.request;
                        request.getClass();
                        if (!"close".equalsIgnoreCase(request.headers.get("Connection"))) {
                            String str5 = build2.headers.get("Connection");
                            if (str5 == null) {
                                str5 = null;
                            }
                            break;
                        }
                        ((ExchangeCodec) exchange.codec).getCarrier().noNewExchanges();
                        if ((i2 == 204 && i2 != 205) || build2.body.contentLength() <= 0) {
                            return build2;
                        }
                        throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + build2.body.contentLength());
                    }
                }
                z4 = false;
                if (equalsIgnoreCase) {
                }
                RealResponseBody openResponseBody22 = exchange.openResponseBody(build);
                Response.Builder newBuilder422 = build.newBuilder();
                newBuilder422.body = openResponseBody22;
                newBuilder422.trailersSource = new OkHttpCall.AnonymousClass1(20, exchange, openResponseBody22);
                build2 = newBuilder422.build();
                request = build2.request;
                request.getClass();
                if (!"close".equalsIgnoreCase(request.headers.get("Connection"))) {
                }
                ((ExchangeCodec) exchange.codec).getCarrier().noNewExchanges();
                if (i2 == 204) {
                }
                throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + build2.body.contentLength());
            default:
                RealInterceptorChain realInterceptorChain3 = (RealInterceptorChain) chain;
                Request request5 = realInterceptorChain3.request;
                RealCall realCall2 = realInterceptorChain3.call;
                List list = EmptyList.INSTANCE;
                Response response = null;
                int i5 = 0;
                Request request6 = request5;
                while (true) {
                    boolean z9 = true;
                    while (true) {
                        request6.getClass();
                        if (realCall2.interceptorScopedExchange != null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        synchronized (realCall2) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                realCall = realCall2;
                            }
                            try {
                                if (realCall2.responseBodyOpen) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (realCall2.requestBodyOpen || realCall2.socketSourceOpen || realCall2.socketSinkOpen) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (z9) {
                            OkHttpClient okHttpClient = realCall2.client;
                            TaskRunner taskRunner = okHttpClient.taskRunner;
                            RealConnectionPool realConnectionPool = (RealConnectionPool) realInterceptorChain3.connectionPool.delegate;
                            int i6 = realInterceptorChain3.readTimeoutMillis;
                            int i7 = realInterceptorChain3.writeTimeoutMillis;
                            int i8 = realInterceptorChain3.connectTimeoutMillis;
                            int i9 = okHttpClient.pingIntervalMillis;
                            boolean z10 = realInterceptorChain3.retryOnConnectionFailure;
                            boolean z11 = okHttpClient.fastFallback;
                            HttpUrl httpUrl2 = request6.url;
                            httpUrl2.getClass();
                            if (httpUrl2.isHttps()) {
                                SSLSocketFactory sSLSocketFactory2 = realInterceptorChain3.sslSocketFactoryOrNull;
                                HostnameVerifier hostnameVerifier2 = realInterceptorChain3.hostnameVerifier;
                                certificatePinner = realInterceptorChain3.certificatePinner;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                certificatePinner = null;
                            }
                            String str6 = httpUrl2.host;
                            int i10 = httpUrl2.port;
                            Dns dns = realInterceptorChain3.dns;
                            SocketFactory socketFactory = realInterceptorChain3.socketFactory;
                            HttpUrl.Companion companion = realInterceptorChain3.proxyAuthenticator;
                            OkHttpClient okHttpClient2 = realInterceptorChain3.call.client;
                            Request request7 = request6;
                            RealCall realCall3 = realCall2;
                            RealRoutePlanner realRoutePlanner = new RealRoutePlanner(taskRunner, realConnectionPool, i6, i7, i8, i6, i9, z10, z11, new Address(str6, i10, dns, socketFactory, sSLSocketFactory, hostnameVerifier, certificatePinner, companion, okHttpClient2.protocols, okHttpClient2.connectionSpecs, realInterceptorChain3.proxySelector), realCall2.client.routeDatabase, realCall3, request7);
                            realCall = realCall3;
                            request6 = request7;
                            OkHttpClient okHttpClient3 = realCall.client;
                            realCall.exchangeFinder = okHttpClient3.fastFallback ? new zzhf(realRoutePlanner, okHttpClient3.taskRunner) : new MatchResult.Destructured(realRoutePlanner);
                        } else {
                            realCall = realCall2;
                        }
                        try {
                            if (realCall.canceled) {
                                throw new IOException("Canceled");
                            }
                            try {
                                Response.Builder newBuilder6 = realInterceptorChain3.proceed(request6).newBuilder();
                                newBuilder6.request = request6;
                                newBuilder6.priorResponse = response != null ? Utf8.stripBody(response) : null;
                                Response build3 = newBuilder6.build();
                                Exchange exchange2 = realCall.interceptorScopedExchange;
                                request6 = followUpRequest(build3, exchange2, (RealInterceptorChain) chain);
                                try {
                                    if (request6 == null) {
                                        if (exchange2 != null && exchange2.isDuplex) {
                                            if (realCall.timeoutEarlyExit) {
                                                throw new IllegalStateException("Check failed.");
                                            }
                                            realCall.timeoutEarlyExit = true;
                                            realCall.timeout.exit();
                                        }
                                        realCall.eventListener.followUpDecision(realCall, build3, null);
                                        z7 = false;
                                        break;
                                    } else {
                                        RequestBody requestBody3 = request6.body;
                                        if (requestBody3 != null && requestBody3.isOneShot()) {
                                            realCall.eventListener.followUpDecision(realCall, build3, null);
                                            z7 = false;
                                            break;
                                        } else {
                                            _UtilCommonKt.closeQuietly(build3.body);
                                            int i11 = i5 + 1;
                                            EventListener eventListener2 = realCall.eventListener;
                                            if (i11 > 20) {
                                                eventListener2.followUpDecision(realCall, build3, null);
                                                throw new ProtocolException("Too many follow-up requests: " + i11);
                                            }
                                            eventListener2.followUpDecision(realCall, build3, request6);
                                            realCall.exitNetworkInterceptorExchange$okhttp(true);
                                            response = build3;
                                            realCall2 = realCall;
                                            i5 = i11;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z6 = false;
                                    realCall.exitNetworkInterceptorExchange$okhttp(z6);
                                    throw th;
                                }
                            } catch (IOException e12) {
                                boolean recover = recover(e12, realCall, (RealInterceptorChain) chain, request6);
                                realCall.eventListener.retryDecision(realCall, e12, recover);
                                if (!recover) {
                                    byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                                    list.getClass();
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ExceptionsKt__ExceptionsKt.addSuppressed(e12, (Exception) it.next());
                                    }
                                    throw e12;
                                }
                                list = CollectionsKt.plus((Collection) list, (Object) e12);
                                realCall.exitNetworkInterceptorExchange$okhttp(true);
                                realCall2 = realCall;
                                z9 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z6 = true;
                        }
                    }
                }
                break;
        }
    }
}
