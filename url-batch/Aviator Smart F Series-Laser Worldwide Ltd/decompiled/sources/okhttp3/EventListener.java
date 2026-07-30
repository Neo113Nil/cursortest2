package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void callEnd(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void canceled(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
        s.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        s.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(domainName, "domainName");
        s.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(url, "url");
        s.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(Call call, long j8) {
        s.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(Call call, long j8) {
        s.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        s.checkNotNullParameter(call, "call");
        s.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        s.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(Call call) {
        s.checkNotNullParameter(call, "call");
    }
}
