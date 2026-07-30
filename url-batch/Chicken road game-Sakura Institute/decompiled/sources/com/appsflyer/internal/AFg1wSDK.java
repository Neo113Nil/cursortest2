package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFg1wSDK {
    public final AFg1uSDK AFInAppEventParameterName;
    Map<String, Object> AFInAppEventType;
    public final AFd1lSDK AFKeystoreWrapper;
    public volatile String AFLogger;
    public volatile String unregisterClient;
    public long valueOf;
    public boolean values = false;
    public volatile boolean registerClient = false;

    public AFg1wSDK(AFd1lSDK aFd1lSDK, AFg1uSDK aFg1uSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
        this.AFInAppEventParameterName = aFg1uSDK;
    }

    public final boolean AFKeystoreWrapper() {
        return this.registerClient;
    }

    public final String AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        String str;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("imeiCached", (String) null);
        if (!z || !AFc1tSDK.values(this.unregisterClient)) {
            if (this.unregisterClient != null) {
                str = this.unregisterClient;
            }
            str = null;
        } else {
            Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
            if (context != null && AFKeystoreWrapper(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFKeystoreWrapper)));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ").append(e.getMessage()).toString(), e);
                } catch (Exception e2) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFKeystoreWrapper)));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    AFLogger.afErrorLog(new StringBuilder("WARNING: Can't collect IMEI: other reason: ").append(e2.getMessage()).toString(), e2);
                }
                if (str == null) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFKeystoreWrapper)));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    str = AFKeystoreWrapper;
                }
            }
            str = null;
        }
        if (!AFc1tSDK.values(str)) {
            aFd1qSDK.AFInAppEventParameterName("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final Map<String, Object> valueOf(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFKeystoreWrapper.AFKeystoreWrapper};
                Object obj = AFc1fSDK.afDebugLog.get(1237996881);
                if (obj == null) {
                    obj = ((Class) AFc1fSDK.valueOf(KeyEvent.getDeadChar(0, 0) + 37, 125 - Color.red(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)))).getDeclaredConstructor(Map.class, Context.class);
                    AFc1fSDK.afDebugLog.put(1237996881, obj);
                }
                return (Map) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventType()) {
            hashMap.put("lvl", this.AFInAppEventType);
        } else if (this.values) {
            this.AFInAppEventType = new HashMap();
            values();
            this.AFInAppEventType.put("error", "pending LVL response");
            hashMap.put("lvl", this.AFInAppEventType);
        }
        return hashMap;
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFInAppEventType;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean valueOf() {
        return this.values && !AFInAppEventType();
    }

    final void values() {
        this.AFInAppEventType.put("ttr", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFInAppEventType.put("lvl_timestamp", Long.valueOf(this.valueOf));
    }

    private static boolean AFKeystoreWrapper(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1vSDK.AFKeystoreWrapper();
        return !AFb1vSDK.values(context);
    }
}
