package com.appsflyer.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFc1uSDK;
import com.google.common.net.HttpHeaders;
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
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u0000 \u00012\u00020\u0013:\u0001\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0003\u0010\rR\u0012\u0010\u0003\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\u0007\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFc1rSDK;", "AFa1ySDK", "", "AFInAppEventType", "[B", "", "", "AFKeystoreWrapper", "Ljava/util/Map;", "values", "", "I", "", "()Z", "p0", "p1", "p2", "<init>", "([BLjava/util/Map;I)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1rSDK {
    public byte[] AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public Map<String, String> values;

    /* renamed from: values, reason: from kotlin metadata */
    public int AFKeystoreWrapper;
    public static String AFInAppEventParameterName = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    public AFc1rSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.values = map;
        this.AFKeystoreWrapper = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0189, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFInAppEventType() {
        InputStream errorStream;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String format = String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName());
            Intrinsics.checkNotNullExpressionValue(format, "");
            Intrinsics.checkNotNullParameter(format, "");
            URLConnection openConnection = new URL(format).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                try {
                    httpURLConnection2.setRequestMethod(ShareTarget.METHOD_POST);
                    StringBuilder sb = new StringBuilder(new StringBuilder().append(httpURLConnection2.getRequestMethod()).append(':').append(httpURLConnection2.getURL()).toString());
                    sb.append("\n length: ").append(new String(this.AFInAppEventType, Charsets.UTF_8).length());
                    Map<String, String> map = this.values;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
                        }
                    }
                    String obj = new StringBuilder("HTTP: [").append(httpURLConnection2.hashCode()).append("] ").append((Object) sb).toString();
                    Intrinsics.checkNotNullParameter(obj, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setReadTimeout(this.AFKeystoreWrapper);
                    httpURLConnection2.setConnectTimeout(this.AFKeystoreWrapper);
                    httpURLConnection2.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                    Map<String, String> map2 = this.values;
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                            httpURLConnection2.addRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(this.AFInAppEventType.length));
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    Intrinsics.checkNotNullExpressionValue(outputStream, "");
                    BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                    bufferedOutputStream.write(this.AFInAppEventType);
                    bufferedOutputStream.close();
                    if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2)) {
                        errorStream = httpURLConnection2.getInputStream();
                    } else {
                        errorStream = httpURLConnection2.getErrorStream();
                    }
                    if (errorStream != null) {
                        Intrinsics.checkNotNullExpressionValue(errorStream, "");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
                        str = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
                        bufferedReader.close();
                    }
                    str = "";
                    String obj2 = new StringBuilder("HTTP: [").append(httpURLConnection2.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(' ').append(httpURLConnection2.getResponseMessage()).append("\n\tbody:").append(str).append("\n\ttook ").append(System.currentTimeMillis() - currentTimeMillis).append("ms").toString()).toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj2)));
                    boolean AFKeystoreWrapper = AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(httpURLConnection2);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return AFKeystoreWrapper;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    try {
                        String obj3 = new StringBuilder("HTTP: [").append(httpURLConnection != null ? httpURLConnection.hashCode() : 0).append("] ").append(new StringBuilder("error: ").append(th).append("\n\ttook ").append(System.currentTimeMillis() - currentTimeMillis).append("ms\n\t").append(th.getMessage()).toString()).toString();
                        Intrinsics.checkNotNullParameter(obj3, "");
                        AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj3)));
                        return false;
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
