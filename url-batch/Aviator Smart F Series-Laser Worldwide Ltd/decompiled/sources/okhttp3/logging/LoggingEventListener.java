package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes5.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            s.checkNotNullParameter(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            s.checkNotNullParameter(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i8, o oVar) {
            this((i8 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, o oVar) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response cachedResponse) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(cachedResponse, "cachedResponse");
        logWithTime(s.stringPlus("cacheConditionalHit: ", cachedResponse));
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
        logWithTime(s.stringPlus("cacheHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
        logWithTime(s.stringPlus("callFailed: ", ioe));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        s.checkNotNullParameter(call, "call");
        this.startNs = System.nanoTime();
        logWithTime(s.stringPlus("callStart: ", call.request()));
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
        logWithTime(s.stringPlus("connectEnd: ", protocol));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
        s.checkNotNullParameter(ioe, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(connection, "connection");
        logWithTime(s.stringPlus("connectionAcquired: ", connection));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String domainName, List<? extends InetAddress> inetAddressList) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(domainName, "domainName");
        s.checkNotNullParameter(inetAddressList, "inetAddressList");
        logWithTime(s.stringPlus("dnsEnd: ", inetAddressList));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String domainName) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(domainName, "domainName");
        logWithTime(s.stringPlus("dnsStart: ", domainName));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl url, List<? extends Proxy> proxies) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(url, "url");
        s.checkNotNullParameter(proxies, "proxies");
        logWithTime(s.stringPlus("proxySelectEnd: ", proxies));
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl url) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(url, "url");
        logWithTime(s.stringPlus("proxySelectStart: ", url));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j8) {
        s.checkNotNullParameter(call, "call");
        logWithTime(s.stringPlus("requestBodyEnd: byteCount=", Long.valueOf(j8)));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
        logWithTime(s.stringPlus("requestFailed: ", ioe));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j8) {
        s.checkNotNullParameter(call, "call");
        logWithTime(s.stringPlus("responseBodyEnd: byteCount=", Long.valueOf(j8)));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
        logWithTime(s.stringPlus("responseFailed: ", ioe));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
        logWithTime(s.stringPlus("responseHeadersEnd: ", response));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
        logWithTime(s.stringPlus("satisfactionFailure: ", response));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        s.checkNotNullParameter(call, "call");
        logWithTime(s.stringPlus("secureConnectEnd: ", handshake));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        s.checkNotNullParameter(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
