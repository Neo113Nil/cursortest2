package com.mopub.common;

import com.mopub.common.logging.MoPubLog;
import com.mopub.network.Networking;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public abstract class MoPubHttpUrlConnection extends HttpURLConnection {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final int READ_TIMEOUT = 10000;

    private MoPubHttpUrlConnection(URL url) {
        super(url);
    }

    public static HttpURLConnection getHttpUrlConnection(String str) throws IOException {
        Preconditions.checkNotNull(str);
        if (isUrlImproperlyEncoded(str)) {
            throw new IllegalArgumentException("URL is improperly encoded: " + str);
        }
        try {
            str = urlEncode(str);
        } catch (Exception unused) {
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("User-Agent", Networking.getCachedUserAgent());
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        return httpURLConnection;
    }

    public static String urlEncode(String str) throws Exception {
        URI uri;
        Preconditions.checkNotNull(str);
        if (isUrlImproperlyEncoded(str)) {
            throw new UnsupportedEncodingException("URL is improperly encoded: " + str);
        }
        if (isUrlUnencoded(str)) {
            uri = encodeUrl(str);
        } else {
            uri = new URI(str);
        }
        return uri.toURL().toString();
    }

    static boolean isUrlImproperlyEncoded(String str) {
        try {
            URLDecoder.decode(str, "UTF-8");
            return false;
        } catch (UnsupportedEncodingException unused) {
            MoPubLog.w("Url is improperly encoded: " + str);
            return true;
        }
    }

    static boolean isUrlUnencoded(String str) {
        try {
            new URI(str);
            return false;
        } catch (URISyntaxException unused) {
            return true;
        }
    }

    static URI encodeUrl(String str) throws Exception {
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } catch (Exception e) {
            MoPubLog.w("Failed to encode url: " + str);
            throw e;
        }
    }
}
