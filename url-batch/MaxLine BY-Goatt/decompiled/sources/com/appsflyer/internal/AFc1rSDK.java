package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFc1uSDK;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.yh2;
import defpackage.yt;
import defpackage.zv;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1rSDK {
    public byte[] AFInAppEventType;
    public Map<String, String> AFKeystoreWrapper;
    public int values;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    public AFc1rSDK(byte[] bArr, Map<String, String> map, int i) {
        bArr.getClass();
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = map;
        this.values = i;
    }

    public final boolean AFInAppEventType() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection openConnection = new URL(String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName())).openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            try {
                httpURLConnection2.setRequestMethod("POST");
                StringBuilder sb = new StringBuilder();
                sb.append(httpURLConnection2.getRequestMethod());
                sb.append(':');
                sb.append(httpURLConnection2.getURL());
                StringBuilder sb2 = new StringBuilder(sb.toString());
                sb2.append("\n length: ");
                sb2.append(new String(this.AFInAppEventType, yt.b).length());
                Map<String, String> map = this.AFKeystoreWrapper;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        sb2.append("\n ");
                        sb2.append(entry.getKey());
                        sb2.append(": ");
                        sb2.append(entry.getValue());
                    }
                }
                StringBuilder sb3 = new StringBuilder("HTTP: [");
                sb3.append(httpURLConnection2.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.afRDLog("[Exception Manager]: ".concat(sb3.toString()));
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setReadTimeout(this.values);
                httpURLConnection2.setConnectTimeout(this.values);
                httpURLConnection2.addRequestProperty("Content-Type", "application/json");
                Map<String, String> map2 = this.AFKeystoreWrapper;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        httpURLConnection2.addRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                }
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventType.length));
                try {
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    outputStream.getClass();
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, Utility.DEFAULT_STREAM_BUFFER_SIZE);
                    bufferedOutputStream.write(this.AFInAppEventType);
                    bufferedOutputStream.close();
                    InputStream inputStream = AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2) ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                    if (inputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, yt.b), Utility.DEFAULT_STREAM_BUFFER_SIZE);
                        str = zv.A(yh2.p(bufferedReader), null, null, null, null, 63);
                        bufferedReader.close();
                    } else {
                        str = BuildConfig.FLAVOR;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb4 = new StringBuilder("response code:");
                    sb4.append(httpURLConnection2.getResponseCode());
                    sb4.append(' ');
                    sb4.append(httpURLConnection2.getResponseMessage());
                    sb4.append("\n\tbody:");
                    sb4.append(str);
                    sb4.append("\n\ttook ");
                    sb4.append(currentTimeMillis2);
                    sb4.append("ms");
                    String obj = sb4.toString();
                    StringBuilder sb5 = new StringBuilder("HTTP: [");
                    sb5.append(httpURLConnection2.hashCode());
                    sb5.append("] ");
                    sb5.append(obj);
                    AFLogger.afRDLog("[Exception Manager]: ".concat(sb5.toString()));
                    boolean AFKeystoreWrapper = AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2);
                    httpURLConnection2.disconnect();
                    return AFKeystoreWrapper;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    StringBuilder sb6 = new StringBuilder("error: ");
                    sb6.append(th);
                    sb6.append("\n\ttook ");
                    sb6.append(currentTimeMillis3);
                    sb6.append("ms\n\t");
                    sb6.append(th.getMessage());
                    String obj2 = sb6.toString();
                    StringBuilder sb7 = new StringBuilder("HTTP: [");
                    sb7.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                    sb7.append("] ");
                    sb7.append(obj2);
                    AFLogger.afRDLog("[Exception Manager]: ".concat(sb7.toString()));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AFa1ySDK {
        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1ySDK() {
        }
    }
}
