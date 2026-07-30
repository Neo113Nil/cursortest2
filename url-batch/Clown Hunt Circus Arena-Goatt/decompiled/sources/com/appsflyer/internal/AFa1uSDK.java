package com.appsflyer.internal;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class AFa1uSDK {
    private final AFb1wSDK AFInAppEventParameterName;
    private final AFe1fSDK values;

    public interface AFa1xSDK {
        void AFInAppEventParameterName(String str);

        void AFInAppEventType(String str, String str2, String str3);
    }

    AFa1uSDK() {
    }

    public AFa1uSDK(AFe1fSDK aFe1fSDK, AFb1wSDK aFb1wSDK) {
        this.values = aFe1fSDK;
        this.AFInAppEventParameterName = aFb1wSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection AFInAppEventType(String str) {
        HttpURLConnection httpURLConnection;
        boolean z;
        String str2 = this.values.afInfoLog;
        String jSONObject = AFa1rSDK.values((Map<String, ?>) this.values.AFInAppEventType()).toString();
        boolean afWarnLog = this.values.afWarnLog();
        boolean AFVersionDeclaration = this.values.AFVersionDeclaration();
        boolean level = this.values.getLevel();
        boolean AFKeystoreWrapper = this.values.AFKeystoreWrapper();
        String str3 = "";
        byte[] bytes = jSONObject.getBytes(Charset.defaultCharset());
        HttpURLConnection httpURLConnection2 = null;
        if (afWarnLog) {
            return null;
        }
        boolean z2 = true;
        try {
            URL url = new URL(str2);
            if (level) {
                this.AFInAppEventParameterName.valueOf(url.toString(), jSONObject);
                int length = jSONObject.getBytes(Charset.defaultCharset()).length;
                AFc1pSDK.AFKeystoreWrapper(new StringBuilder("call = ").append(url).append("; size = ").append(length).append(" byte").append(length > 1 ? "s" : "").append("; body = ").append(jSONObject).toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, AFKeystoreWrapper ? "application/octet-stream" : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (AFKeystoreWrapper) {
                    try {
                        z = false;
                        try {
                            bytes = (byte[]) ((Class) AFa1wSDK.AFKeystoreWrapper(36 - View.MeasureSpec.getMode(0), 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'))).getDeclaredMethod("AFKeystoreWrapper", byte[].class).invoke(((Class) AFa1wSDK.AFKeystoreWrapper(37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - TextUtils.getCapsMode("", 0, 0), (char) ('0' - AndroidCharacter.getMirror('0')))).getMethod("AFInAppEventType", String.class).invoke(null, str), bytes);
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
                } else {
                    z = false;
                }
                outputStream.write(bytes);
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (AFVersionDeclaration) {
                    str3 = AFa1dSDK.AFInAppEventType(httpURLConnection);
                }
                if (level) {
                    this.AFInAppEventParameterName.values(url.toString(), responseCode, str3);
                }
                if (responseCode == 200) {
                    AFLogger.afInfoLog("Status 200 ok");
                    z2 = z;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str2)), th);
                httpURLConnection = httpURLConnection2;
                AFLogger.afInfoLog(new StringBuilder("Connection ").append(!z2 ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : "call succeeded").append(": ").append(str3).toString());
                return httpURLConnection;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        AFLogger.afInfoLog(new StringBuilder("Connection ").append(!z2 ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : "call succeeded").append(": ").append(str3).toString());
        return httpURLConnection;
    }
}
