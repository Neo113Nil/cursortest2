package com.appsflyer.internal;

import com.appsflyer.AFLogger;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\r\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u000b\u001a\u00020\rX\u0087\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013X\u0087\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0011\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000e\u0010\u0004R\u0011\u0010\u000e\u001a\u00020\u0016X\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFd1oSDK;", "", "", "values", "()Z", "", "AFKeystoreWrapper", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "", "p0", "valueOf", "(Ljava/net/HttpURLConnection;J)Z", "", "AFInAppEventParameterName", "[B", "Lcom/appsflyer/internal/AFe1uSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFe1uSDK;", "", "Ljava/util/Map;", "Z", "", "I", "()Ljava/lang/String;", "e", "p1", "p2", "<init>", "([BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AFd1oSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public byte[] valueOf;
    private final boolean AFInAppEventType;

    /* renamed from: valueOf, reason: from kotlin metadata */
    public Map<String, String> AFKeystoreWrapper;

    /* renamed from: values, reason: from kotlin metadata */
    public int AFInAppEventParameterName;

    /* renamed from: AFInAppEventType */
    public abstract AFe1uSDK getValueOf();

    public abstract String AFKeystoreWrapper();

    public abstract String AFKeystoreWrapper(String str);

    public AFd1oSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.valueOf = bArr;
        this.AFKeystoreWrapper = map;
        this.AFInAppEventParameterName = i;
        this.AFInAppEventType = true;
    }

    /* renamed from: AFInAppEventParameterName, reason: from getter */
    public boolean getAFInAppEventType() {
        return this.AFInAppEventType;
    }

    public final boolean values() {
        HttpURLConnection httpURLConnection;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFKeystoreWrapper = AFKeystoreWrapper();
            Intrinsics.checkNotNullParameter(AFKeystoreWrapper, "");
            URLConnection openConnection = new URL(AFKeystoreWrapper).openConnection();
            if (openConnection != null) {
                httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    return valueOf(httpURLConnection, currentTimeMillis);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        String AFKeystoreWrapper2 = this.AFKeystoreWrapper(new StringBuilder("HTTP: [").append(httpURLConnection != null ? httpURLConnection.hashCode() : 0).append("] ").append(new StringBuilder("error: ").append(th).append("\n\ttook ").append(System.currentTimeMillis() - currentTimeMillis).append("ms\n\t").append(th.getMessage()).toString()).toString());
                        if (this.getAFInAppEventType()) {
                            AFLogger.afRDLog(AFKeystoreWrapper2);
                        } else {
                            AFLogger.afVerboseLog(AFKeystoreWrapper2);
                        }
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
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }

    private final boolean valueOf(HttpURLConnection httpURLConnection, long j) {
        InputStream errorStream;
        String str = "";
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(new StringBuilder().append(httpURLConnection.getRequestMethod()).append(AbstractJsonLexerKt.COLON).append(httpURLConnection.getURL()).toString());
        sb.append("\n length: ").append(new String(this.valueOf, Charsets.UTF_8).length());
        Map<String, String> map = this.AFKeystoreWrapper;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        String AFKeystoreWrapper = AFKeystoreWrapper(new StringBuilder("HTTP: [").append(httpURLConnection.hashCode()).append("] ").append((Object) sb).toString());
        if (getAFInAppEventType()) {
            AFLogger.afRDLog(AFKeystoreWrapper);
        } else {
            AFLogger.afVerboseLog(AFKeystoreWrapper);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFInAppEventParameterName);
        httpURLConnection.setConnectTimeout(this.AFInAppEventParameterName);
        httpURLConnection.addRequestProperty("Content-Type", getValueOf().valueOf);
        Map<String, String> map2 = this.AFKeystoreWrapper;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(this.valueOf.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.valueOf);
        bufferedOutputStream.close();
        if (AFd1cSDK.values(httpURLConnection)) {
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
        String AFKeystoreWrapper2 = AFKeystoreWrapper(new StringBuilder("HTTP: [").append(httpURLConnection.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection.getResponseCode()).append(' ').append(httpURLConnection.getResponseMessage()).append("\n\tbody:").append(str).append("\n\ttook ").append(System.currentTimeMillis() - j).append("ms").toString()).toString());
        if (getAFInAppEventType()) {
            AFLogger.afRDLog(AFKeystoreWrapper2);
        } else {
            AFLogger.afVerboseLog(AFKeystoreWrapper2);
        }
        return AFd1cSDK.values(httpURLConnection);
    }
}
