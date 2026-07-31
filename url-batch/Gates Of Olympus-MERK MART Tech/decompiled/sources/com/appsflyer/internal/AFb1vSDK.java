package com.appsflyer.internal;

import android.graphics.Color;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.google.firebase.messaging.Constants;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class AFb1vSDK {
    private final AFb1bSDK AFInAppEventParameterName;
    private final AFh1zSDK AFInAppEventType;

    public AFb1vSDK(AFh1zSDK aFh1zSDK, AFb1bSDK aFb1bSDK) {
        this.AFInAppEventType = aFh1zSDK;
        this.AFInAppEventParameterName = aFb1bSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection AFKeystoreWrapper(String str) {
        HttpURLConnection httpURLConnection;
        int i;
        String str2 = this.AFInAppEventType.registerClient;
        String jSONObject = AFa1oSDK.AFInAppEventParameterName((Map<String, ?>) this.AFInAppEventType.AFKeystoreWrapper()).toString();
        boolean v = this.AFInAppEventType.v();
        boolean afInfoLog = this.AFInAppEventType.afInfoLog();
        boolean i2 = this.AFInAppEventType.i();
        boolean AFInAppEventType = this.AFInAppEventType.AFInAppEventType();
        String str3 = "";
        byte[] bytes = jSONObject.getBytes(Charset.defaultCharset());
        HttpURLConnection httpURLConnection2 = null;
        if (v) {
            return null;
        }
        int i3 = 1;
        try {
            URL url = new URL(str2);
            if (i2) {
                this.AFInAppEventParameterName.AFInAppEventParameterName(url.toString(), jSONObject);
                int length = jSONObject.getBytes(Charset.defaultCharset()).length;
                AFb1hSDK.AFInAppEventType(new StringBuilder("call = ").append(url).append("; size = ").append(length).append(" byte").append(length > 1 ? "s" : "").append("; body = ").append(jSONObject).toString());
            }
            TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Type", AFInAppEventType ? "application/octet-stream" : "application/json");
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    if (AFInAppEventType) {
                        try {
                            Object[] objArr = {str};
                            Object obj = AFa1uSDK.afVerboseLog.get(1599165826);
                            if (obj != null) {
                                i = 0;
                            } else {
                                i = 0;
                                try {
                                    obj = ((Class) AFa1uSDK.valueOf((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, 37 - View.MeasureSpec.getMode(0))).getMethod("values", String.class);
                                    AFa1uSDK.afVerboseLog.put(1599165826, obj);
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            Object invoke = ((Method) obj).invoke(null, objArr);
                            try {
                                Object[] objArr2 = {bytes};
                                Object obj2 = AFa1uSDK.afVerboseLog.get(61655839);
                                if (obj2 == null) {
                                    Class cls = (Class) AFa1uSDK.valueOf((char) (ViewConfiguration.getLongPressTimeout() >> 16), 36 - (ViewConfiguration.getEdgeSlop() >> 16), Color.red(i) + 37);
                                    Class<?>[] clsArr = new Class[1];
                                    clsArr[i] = byte[].class;
                                    obj2 = cls.getDeclaredMethod("AFKeystoreWrapper", clsArr);
                                    AFa1uSDK.afVerboseLog.put(61655839, obj2);
                                }
                                bytes = (byte[]) ((Method) obj2).invoke(invoke, objArr2);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        i = 0;
                    }
                    outputStream.write(bytes);
                } catch (Exception e) {
                    AFLogger.afErrorLogForExcManagerOnly("AFCrypto: reflection init failed", e);
                }
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (afInfoLog) {
                    str3 = AFb1tSDK.valueOf(httpURLConnection);
                }
                if (i2) {
                    this.AFInAppEventParameterName.AFInAppEventParameterName(url.toString(), responseCode, str3);
                }
                if (responseCode == 200) {
                    AFLogger.afInfoLog("Status 200 ok");
                    i3 = i;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection2 = httpURLConnection;
                AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(str2)), th);
                httpURLConnection = httpURLConnection2;
                AFLogger.afInfoLog(new StringBuilder("Connection ").append(i3 == 0 ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : "call succeeded").append(": ").append(str3).toString());
                return httpURLConnection;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        AFLogger.afInfoLog(new StringBuilder("Connection ").append(i3 == 0 ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : "call succeeded").append(": ").append(str3).toString());
        return httpURLConnection;
    }
}
