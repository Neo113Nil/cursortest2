package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class AFg1xSDK {
    public final AFg1zSDK AFInAppEventParameterName;
    public final AFd1nSDK AFKeystoreWrapper;
    public volatile String AFLogger;
    public volatile String unregisterClient;
    public long valueOf;
    Map<String, Object> values;
    public boolean AFInAppEventType = false;
    public volatile boolean d = false;

    public AFg1xSDK(AFd1nSDK aFd1nSDK, AFg1zSDK aFg1zSDK) {
        this.AFKeystoreWrapper = aFd1nSDK;
        this.AFInAppEventParameterName = aFg1zSDK;
    }

    public final boolean AFInAppEventType() {
        return this.d;
    }

    public final String values(AFd1xSDK aFd1xSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFInAppEventType = aFd1xSDK.AFInAppEventType("imeiCached", (String) null);
        if (!z || !AFc1vSDK.AFKeystoreWrapper(this.AFLogger)) {
            if (this.AFLogger != null) {
                str = this.AFLogger;
            }
            str = null;
        } else {
            Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
            if (context != null && AFInAppEventType(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFInAppEventType)));
                    } else {
                        AFInAppEventType = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ").append(e.getMessage()).toString(), e);
                } catch (Exception e2) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFInAppEventType)));
                    } else {
                        AFInAppEventType = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI: other reason: ").append(e2.getMessage()).toString(), e2);
                }
                if (str == null) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFInAppEventType)));
                    } else {
                        AFInAppEventType = null;
                    }
                    str = AFInAppEventType;
                }
            }
            str = null;
        }
        if (!AFc1vSDK.AFKeystoreWrapper(str)) {
            aFd1xSDK.valueOf("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final Map<String, Object> AFInAppEventType(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFKeystoreWrapper.AFKeystoreWrapper};
                Object obj = AFc1gSDK.afErrorLog.get(-468878467);
                if (obj == null) {
                    obj = ((Class) AFc1gSDK.values(Color.argb(0, 0, 0, 0) + WebSocketProtocol.PAYLOAD_SHORT, 37 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getDeclaredConstructor(Map.class, Context.class);
                    AFc1gSDK.afErrorLog.put(-468878467, obj);
                }
                return (Map) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", e);
            return new HashMap();
        }
    }

    public final Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        if (valueOf()) {
            hashMap.put("lvl", this.values);
            return hashMap;
        }
        if (this.AFInAppEventType) {
            this.values = new HashMap();
            AFInAppEventParameterName();
            this.values.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "pending LVL response");
            hashMap.put("lvl", this.values);
        }
        return hashMap;
    }

    private boolean valueOf() {
        Map<String, Object> map = this.values;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType && !valueOf();
    }

    final void AFInAppEventParameterName() {
        this.values.put("ttr", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.values.put("lvl_timestamp", Long.valueOf(this.valueOf));
    }

    private static boolean AFInAppEventType(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1tSDK.AFInAppEventType();
        return !AFb1tSDK.AFInAppEventParameterName(context);
    }
}
