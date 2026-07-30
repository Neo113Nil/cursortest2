package com.appsflyer.internal;

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
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\f\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0006\u0010\u000bR\u0012\u0010\u0006\u001a\u00020\fX\u0087\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\r\u001a\u00020\u0016X\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFd1mSDK;", "", "", "AFKeystoreWrapper", "()Z", "", "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "", "p0", "(Ljava/net/HttpURLConnection;J)Z", "", "AFInAppEventParameterName", "[B", "Lcom/appsflyer/internal/AFe1uSDK;", "values", "()Lcom/appsflyer/internal/AFe1uSDK;", "", "valueOf", "Ljava/util/Map;", "Z", "", "I", "()Ljava/lang/String;", "AFLogger", "p1", "p2", "<init>", "([BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AFd1mSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public byte[] AFInAppEventType;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final boolean AFKeystoreWrapper;
    public Map<String, String> valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    public int AFInAppEventParameterName;

    public abstract String AFInAppEventParameterName();

    public abstract String AFInAppEventType(String str);

    /* renamed from: values */
    public abstract AFe1uSDK getAFInAppEventParameterName();

    public AFd1mSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.valueOf = map;
        this.AFInAppEventParameterName = i;
        this.AFKeystoreWrapper = true;
    }

    /* renamed from: AFInAppEventType, reason: from getter */
    public boolean getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFKeystoreWrapper() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFInAppEventParameterName = AFInAppEventParameterName();
            Intrinsics.checkNotNullParameter(AFInAppEventParameterName, "");
            URLConnection openConnection = new URL(AFInAppEventParameterName).openConnection();
            if (openConnection != null) {
                httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    boolean AFInAppEventType = AFInAppEventType(httpURLConnection, currentTimeMillis);
                    if (httpURLConnection == null) {
                        return AFInAppEventType;
                    }
                    httpURLConnection.disconnect();
                    return AFInAppEventType;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        String AFInAppEventType2 = AFInAppEventType(new StringBuilder("HTTP: [").append(httpURLConnection != null ? httpURLConnection.hashCode() : 0).append("] ").append(new StringBuilder("error: ").append(th).append("\n\ttook ").append(System.currentTimeMillis() - currentTimeMillis).append("ms\n\t").append(th.getMessage()).toString()).toString());
                        if (getAFKeystoreWrapper()) {
                            AFLogger.afRDLog(AFInAppEventType2);
                        } else {
                            AFLogger.afVerboseLog(AFInAppEventType2);
                        }
                        return false;
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }

    private final boolean AFInAppEventType(HttpURLConnection httpURLConnection, long j) {
        InputStream errorStream;
        String str = "";
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(new StringBuilder().append(httpURLConnection.getRequestMethod()).append(AbstractJsonLexerKt.COLON).append(httpURLConnection.getURL()).toString());
        sb.append("\n length: ").append(new String(this.AFInAppEventType, Charsets.UTF_8).length());
        Map<String, String> map = this.valueOf;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        String AFInAppEventType = AFInAppEventType(new StringBuilder("HTTP: [").append(httpURLConnection.hashCode()).append("] ").append((Object) sb).toString());
        if (getAFKeystoreWrapper()) {
            AFLogger.afRDLog(AFInAppEventType);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFInAppEventParameterName);
        httpURLConnection.setConnectTimeout(this.AFInAppEventParameterName);
        httpURLConnection.addRequestProperty("Content-Type", getAFInAppEventParameterName().AFInAppEventType);
        Map<String, String> map2 = this.valueOf;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventType.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.AFInAppEventType);
        bufferedOutputStream.close();
        if (AFd1eSDK.values(httpURLConnection)) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream != null) {
            Intrinsics.checkNotNullExpressionValue(errorStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
            String joinToString$default = CollectionsKt.joinToString$default(TextStreamsKt.readLines(bufferedReader), null, null, null, 0, null, null, 63, null);
            bufferedReader.close();
            if (joinToString$default != null) {
                str = joinToString$default;
            }
        }
        String AFInAppEventType2 = AFInAppEventType(new StringBuilder("HTTP: [").append(httpURLConnection.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection.getResponseCode()).append(' ').append(httpURLConnection.getResponseMessage()).append("\n\tbody:").append(str).append("\n\ttook ").append(System.currentTimeMillis() - j).append("ms").toString()).toString());
        if (getAFKeystoreWrapper()) {
            AFLogger.afRDLog(AFInAppEventType2);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType2);
        }
        return AFd1eSDK.values(httpURLConnection);
    }
}
