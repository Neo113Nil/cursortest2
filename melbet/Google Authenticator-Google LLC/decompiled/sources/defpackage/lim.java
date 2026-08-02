package defpackage;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lim extends UrlResponseInfo {
    private final android.net.http.UrlResponseInfo a;
    private final String b;

    private lim(android.net.http.UrlResponseInfo urlResponseInfo, String str) {
        this.a = urlResponseInfo;
        this.b = str;
    }

    public static lim a(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new lim(urlResponseInfo, null);
    }

    public static lim b(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (c(urlResponseInfo)) {
            return null;
        }
        return new lim(urlResponseInfo, ":0");
    }

    private static boolean c(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return true;
        }
        try {
            urlResponseInfo.getUrl();
            return false;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        HeaderBlock headers;
        Map asMap;
        headers = this.a.getHeaders();
        asMap = headers.getAsMap();
        return asMap;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        HeaderBlock headers;
        List asList;
        headers = this.a.getHeaders();
        asList = headers.getAsList();
        return asList;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        int httpStatusCode;
        httpStatusCode = this.a.getHttpStatusCode();
        return httpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        String httpStatusText;
        httpStatusText = this.a.getHttpStatusText();
        return httpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        String negotiatedProtocol;
        negotiatedProtocol = this.a.getNegotiatedProtocol();
        return negotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        long receivedByteCount;
        receivedByteCount = this.a.getReceivedByteCount();
        return receivedByteCount;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        String url;
        url = this.a.getUrl();
        return url;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        List urlChain;
        urlChain = this.a.getUrlChain();
        return urlChain;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        boolean wasCached;
        wasCached = this.a.wasCached();
        return wasCached;
    }
}
