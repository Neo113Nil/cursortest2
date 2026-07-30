package com.appsflyer.internal;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@Deprecated
/* loaded from: classes.dex */
public final class AFa1uSDK {
    private final AFb1wSDK AFInAppEventParameterName;
    private final AFe1fSDK values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface AFa1xSDK {
        void AFInAppEventParameterName(String str);

        void AFInAppEventType(String str, String str2, String str3);
    }

    public AFa1uSDK(AFe1fSDK aFe1fSDK, AFb1wSDK aFb1wSDK) {
        this.values = aFe1fSDK;
        this.AFInAppEventParameterName = aFb1wSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection AFInAppEventType(String str) {
        HttpURLConnection httpURLConnection;
        boolean z;
        int responseCode;
        AFe1fSDK aFe1fSDK = this.values;
        String str2 = aFe1fSDK.afInfoLog;
        String jSONObject = AFa1rSDK.values((Map<String, ?>) aFe1fSDK.AFInAppEventType()).toString();
        boolean afWarnLog = this.values.afWarnLog();
        boolean AFVersionDeclaration = this.values.AFVersionDeclaration();
        boolean level = this.values.getLevel();
        boolean AFKeystoreWrapper = this.values.AFKeystoreWrapper();
        String str3 = BuildConfig.FLAVOR;
        byte[] bytes = jSONObject.getBytes(Charset.defaultCharset());
        HttpURLConnection httpURLConnection2 = null;
        if (afWarnLog) {
            return null;
        }
        try {
            URL url = new URL(str2);
            if (level) {
                this.AFInAppEventParameterName.valueOf(url.toString(), jSONObject);
                int length = jSONObject.getBytes(Charset.defaultCharset()).length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(url);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? "s" : BuildConfig.FLAVOR);
                sb.append("; body = ");
                sb.append(jSONObject);
                AFc1pSDK.AFKeystoreWrapper(sb.toString());
            }
            TrafficStats.setThreadStatsTag(82339054);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", AFKeystoreWrapper ? "application/octet-stream" : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (AFKeystoreWrapper) {
                    try {
                        try {
                            bytes = (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(36 - View.MeasureSpec.getMode(0), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'))).getDeclaredMethod("AFKeystoreWrapper", byte[].class).invoke(((Class) AFa1wSDK.AFKeystoreWrapper(37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (char) ('0' - AndroidCharacter.getMirror('0')))).getMethod("AFInAppEventType", String.class).invoke(null, str), bytes);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (AFVersionDeclaration) {
                    str3 = AFa1dSDK.AFInAppEventType(httpURLConnection);
                }
                if (level) {
                    this.AFInAppEventParameterName.values(url.toString(), responseCode, str3);
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str2)), th);
                httpURLConnection = httpURLConnection2;
                z = true;
                StringBuilder sb2 = new StringBuilder("Connection ");
                sb2.append(z ? "error" : "call succeeded");
                sb2.append(": ");
                sb2.append(str3);
                AFLogger.afInfoLog(sb2.toString());
                return httpURLConnection;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (responseCode == 200) {
            AFLogger.afInfoLog("Status 200 ok");
            z = false;
            StringBuilder sb22 = new StringBuilder("Connection ");
            sb22.append(z ? "error" : "call succeeded");
            sb22.append(": ");
            sb22.append(str3);
            AFLogger.afInfoLog(sb22.toString());
            return httpURLConnection;
        }
        z = true;
        StringBuilder sb222 = new StringBuilder("Connection ");
        sb222.append(z ? "error" : "call succeeded");
        sb222.append(": ");
        sb222.append(str3);
        AFLogger.afInfoLog(sb222.toString());
        return httpURLConnection;
    }

    public AFa1uSDK() {
    }
}
