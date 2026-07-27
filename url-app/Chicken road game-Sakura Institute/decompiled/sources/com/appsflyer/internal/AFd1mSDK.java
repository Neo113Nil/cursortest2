package com.appsflyer.internal;

import J2.q;
import com.appsflyer.AFLogger;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import z2.C1403G;

@Metadata
/* loaded from: classes.dex */
public abstract class AFd1mSDK {
    public byte[] AFInAppEventParameterName;
    private final boolean AFInAppEventType;
    public Map<String, String> valueOf;
    public int values;

    public AFd1mSDK(byte[] bArr, Map<String, String> map, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventParameterName = bArr;
        this.valueOf = map;
        this.values = i2;
        this.AFInAppEventType = true;
    }

    public abstract String AFInAppEventParameterName();

    public abstract String AFInAppEventType(String str);

    public boolean AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean AFKeystoreWrapper() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFInAppEventParameterName = AFInAppEventParameterName();
            Intrinsics.checkNotNullParameter(AFInAppEventParameterName, "");
            URLConnection openConnection = new URL(AFInAppEventParameterName).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) openConnection;
            try {
                boolean AFInAppEventType = AFInAppEventType(httpURLConnection, currentTimeMillis);
                httpURLConnection.disconnect();
                return AFInAppEventType;
            } catch (Throwable th2) {
                th = th2;
                try {
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb = new StringBuilder("error: ");
                    sb.append(th);
                    sb.append("\n\ttook ");
                    sb.append(currentTimeMillis2);
                    sb.append("ms\n\t");
                    sb.append(th.getMessage());
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder("HTTP: [");
                    sb2.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                    sb2.append("] ");
                    sb2.append(obj);
                    String AFInAppEventType2 = AFInAppEventType(sb2.toString());
                    if (AFInAppEventType()) {
                        AFLogger.afRDLog(AFInAppEventType2);
                    } else {
                        AFLogger.afVerboseLog(AFInAppEventType2);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th3) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            httpURLConnection = null;
            th = th4;
        }
    }

    public abstract AFe1uSDK values();

    private final boolean AFInAppEventType(HttpURLConnection httpURLConnection, long j4) {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder();
        sb.append(httpURLConnection.getRequestMethod());
        sb.append(':');
        sb.append(httpURLConnection.getURL());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append("\n length: ");
        sb2.append(new String(this.AFInAppEventParameterName, Charsets.UTF_8).length());
        Map<String, String> map = this.valueOf;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        StringBuilder sb3 = new StringBuilder("HTTP: [");
        sb3.append(httpURLConnection.hashCode());
        sb3.append("] ");
        sb3.append((Object) sb2);
        String AFInAppEventType = AFInAppEventType(sb3.toString());
        if (AFInAppEventType()) {
            AFLogger.afRDLog(AFInAppEventType);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.values);
        httpURLConnection.setConnectTimeout(this.values);
        httpURLConnection.addRequestProperty("Content-Type", values().valueOf);
        Map<String, String> map2 = this.valueOf;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventParameterName.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.AFInAppEventParameterName);
        bufferedOutputStream.close();
        InputStream inputStream = AFd1eSDK.values(httpURLConnection) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (inputStream != null) {
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            String w4 = C1403G.w(q.b(bufferedReader), null, null, null, null, 63);
            bufferedReader.close();
            if (w4 != null) {
                str = w4;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - j4;
        StringBuilder sb4 = new StringBuilder("response code:");
        sb4.append(httpURLConnection.getResponseCode());
        sb4.append(' ');
        sb4.append(httpURLConnection.getResponseMessage());
        sb4.append("\n\tbody:");
        sb4.append(str);
        sb4.append("\n\ttook ");
        sb4.append(currentTimeMillis);
        sb4.append("ms");
        String obj = sb4.toString();
        StringBuilder sb5 = new StringBuilder("HTTP: [");
        sb5.append(httpURLConnection.hashCode());
        sb5.append("] ");
        sb5.append(obj);
        String AFInAppEventType2 = AFInAppEventType(sb5.toString());
        if (AFInAppEventType()) {
            AFLogger.afRDLog(AFInAppEventType2);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType2);
        }
        return AFd1eSDK.values(httpURLConnection);
    }
}
