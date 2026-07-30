package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.s;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes5.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        s.checkNotNullParameter(builder, "builder");
        s.checkNotNullParameter(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z7) {
        s.checkNotNullParameter(connectionSpec, "connectionSpec");
        s.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z7);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        s.checkNotNullParameter(cache, "cache");
        s.checkNotNullParameter(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z7) {
        s.checkNotNullParameter(cookie, "cookie");
        return cookie.toString$okhttp(z7);
    }

    public static final Cookie parseCookie(long j8, HttpUrl url, String setCookie) {
        s.checkNotNullParameter(url, "url");
        s.checkNotNullParameter(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j8, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        s.checkNotNullParameter(builder, "builder");
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
