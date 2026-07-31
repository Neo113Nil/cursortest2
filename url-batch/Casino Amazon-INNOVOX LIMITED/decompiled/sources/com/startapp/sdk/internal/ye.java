package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ye extends HttpURLConnection {
    public static HttpURLConnection a(String str, String str2) {
        try {
            URLDecoder.decode(str, CharEncoding.UTF_8);
            try {
                str = a(str);
            } catch (Exception unused) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setConnectTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            httpURLConnection.setReadTimeout(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND);
            return httpURLConnection;
        } catch (UnsupportedEncodingException unused2) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public static String a(String str) {
        URI uri;
        try {
            new URI(str);
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            URL url = new URL(str);
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        return uri.toURL().toString();
    }
}
