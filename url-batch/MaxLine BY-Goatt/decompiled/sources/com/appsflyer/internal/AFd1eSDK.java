package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1eSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.up2;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFd1eSDK extends AFd1nSDK<String> {
    private static final AFd1vSDK[] onInstallConversionFailureNative = {AFd1vSDK.DLSDK, AFd1vSDK.ONELINK, AFd1vSDK.MONITORSDK, AFd1vSDK.REGISTER};
    protected final AFb1fSDK AFLogger$LogLevel;
    private final AFc1tSDK AFVersionDeclaration;
    private final AFb1cSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFc1cSDK afWarnLog;
    private final AFb1bSDK getLevel;

    public AFd1eSDK(AFa1qSDK aFa1qSDK, AFc1zSDK aFc1zSDK, String str) {
        super(aFa1qSDK.AFInAppEventParameterName(), new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, str);
        this.afInfoLog = aFa1qSDK;
        this.afWarnLog = aFc1zSDK.onInstallConversionDataLoadedNative();
        this.AFLogger$LogLevel = aFc1zSDK.AFKeystoreWrapper();
        this.AFVersionDeclaration = aFc1zSDK.afDebugLog();
        this.getLevel = aFc1zSDK.onAppOpenAttributionNative();
        this.afErrorLogForExcManagerOnly = aFc1zSDK.AFInAppEventParameterName();
        for (AFd1vSDK aFd1vSDK : onInstallConversionFailureNative) {
            if (this.values == aFd1vSDK) {
                return;
            }
        }
        int i = this.afInfoLog.afErrorLog;
        AFd1vSDK aFd1vSDK2 = this.values;
        if (i > 0) {
            this.valueOf.add(AFd1vSDK.CONVERSION);
        } else {
            AFd1vSDK aFd1vSDK3 = AFd1vSDK.CONVERSION;
            if (aFd1vSDK2 != aFd1vSDK3) {
                this.AFInAppEventType.add(aFd1vSDK3);
            }
        }
    }

    private static Map<String, Object> AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.AFInAppEventType().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1qSDK.AFInAppEventType().put("meta", hashMap);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    @Override // com.appsflyer.internal.AFd1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        double d;
        String str2;
        String str3;
        String str4 = BuildConfig.FLAVOR;
        values(this.afInfoLog);
        if (this.afInfoLog.AFInAppEventType().containsKey("meta")) {
            try {
                d = this.AFVersionDeclaration.valueOf().AFInAppEventType.AFInAppEventParameterName.AFInAppEventType;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1qSDK.AFInAppEventParameterName(d)) {
                this.afInfoLog.AFInAppEventType().remove("meta");
            }
        }
        AFa1qSDK aFa1qSDK = this.afInfoLog;
        String str5 = aFa1qSDK.afInfoLog;
        Map<String, Object> AFInAppEventType = aFa1qSDK.AFInAppEventType();
        String str6 = null;
        try {
            str2 = new JSONObject(AFInAppEventType).toString();
        } catch (NullPointerException e) {
            e = e;
            str2 = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
        } catch (NullPointerException e2) {
            e = e2;
            AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
            try {
                String str7 = (String) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", Map.class).invoke(null, AFInAppEventType);
                try {
                } catch (NullPointerException e3) {
                    e = e3;
                    str2 = str7;
                    AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                    str3 = BuildConfig.FLAVOR;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": preparing data: ");
                    sb.append(str3);
                    AFc1pSDK.AFKeystoreWrapper(sb.toString());
                    ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                    return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str7;
                    AFLogger.afErrorLog("Unexpected error", th, true);
                    str3 = BuildConfig.FLAVOR;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": preparing data: ");
                    sb2.append(str3);
                    AFc1pSDK.AFKeystoreWrapper(sb2.toString());
                    ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                    return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                }
                if (str7 == null) {
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                }
                str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                str2 = str7;
                if (str2 != null) {
                }
                if (str3.equals(str4)) {
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append(this);
                sb22.append(": preparing data: ");
                sb22.append(str3);
                AFc1pSDK.AFKeystoreWrapper(sb22.toString());
                ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
            } catch (Throwable th3) {
                try {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                } catch (NullPointerException e4) {
                    e = e4;
                    AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                    str3 = BuildConfig.FLAVOR;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append(this);
                    sb222.append(": preparing data: ");
                    sb222.append(str3);
                    AFc1pSDK.AFKeystoreWrapper(sb222.toString());
                    ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                    return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.afErrorLog("Unexpected error", th, true);
                    str3 = BuildConfig.FLAVOR;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append(this);
                    sb2222.append(": preparing data: ");
                    sb2222.append(str3);
                    AFc1pSDK.AFKeystoreWrapper(sb2222.toString());
                    ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                    return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            str6 = str2;
            AFLogger.afErrorLog("Unexpected error", th, true);
            str3 = BuildConfig.FLAVOR;
            str2 = str6;
            if (str2 != null) {
            }
            if (str3.equals(str4)) {
            }
            StringBuilder sb22222 = new StringBuilder();
            sb22222.append(this);
            sb22222.append(": preparing data: ");
            sb22222.append(str3);
            AFc1pSDK.AFKeystoreWrapper(sb22222.toString());
            ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
            return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
        if (str2 != null) {
            str4 = str2;
        }
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.afWarnLog("Payload contains non-printing characters");
        }
        StringBuilder sb222222 = new StringBuilder();
        sb222222.append(this);
        sb222222.append(": preparing data: ");
        sb222222.append(str3);
        AFc1pSDK.AFKeystoreWrapper(sb222222.toString());
        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public boolean afRDLog() {
        return true;
    }

    public void values(AFa1qSDK aFa1qSDK) {
        boolean z = true;
        if (aFa1qSDK.afInfoLog()) {
            aFa1qSDK.AFInAppEventType(new AFb1eSDK.AFa1xSDK(aFa1qSDK.AFInAppEventType(), ((AFd1nSDK) this).afRDLog.AFKeystoreWrapper.AFInAppEventParameterName));
            try {
                aFa1qSDK.AFInAppEventType((Map) ((Class) AFb1pSDK.values((char) (56427 - Color.green(0)), (ViewConfiguration.getTouchSlop() >> 8) + 37, 87 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredConstructor(Map.class, Context.class).newInstance(aFa1qSDK.AFInAppEventType(), ((AFd1nSDK) this).afRDLog.AFKeystoreWrapper.AFInAppEventParameterName));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (aFa1qSDK.afErrorLog()) {
            aFa1qSDK.AFInAppEventType(((AFd1nSDK) this).afRDLog.AFKeystoreWrapper());
        }
        Set<AFd1vSDK> set = this.AFInAppEventType;
        if (!set.contains(AFd1vSDK.LAUNCH) && !set.contains(AFd1vSDK.CONVERSION)) {
            z = false;
        }
        if (AFLogger() && z) {
            aFa1qSDK.valueOf(this.AFLogger$LogLevel.AFInAppEventType("appsFlyerCount", 0));
        }
        try {
            if (aFa1qSDK.AFInAppEventType().containsKey("appsflyerKey") && aFa1qSDK.afInfoLog()) {
                new AFb1zSDK();
                aFa1qSDK.AFInAppEventParameterName("af_v", AFb1zSDK.values(aFa1qSDK.AFInAppEventType()));
                new AFb1zSDK();
                aFa1qSDK.AFInAppEventParameterName("af_v2", AFb1zSDK.AFKeystoreWrapper(aFa1qSDK.AFInAppEventType()));
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th2)), th2);
        }
        if (aFa1qSDK.afRDLog()) {
            Map<String, Object> AFInAppEventParameterName = AFInAppEventParameterName(aFa1qSDK);
            AFc1cSDK aFc1cSDK = this.afWarnLog;
            AFc1bSDK aFc1bSDK = new AFc1bSDK(aFc1cSDK.AFInAppEventType(), aFc1cSDK.valueOf(), AFc1cSDK.AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", aFc1bSDK.AFKeystoreWrapper);
            AFc1aSDK aFc1aSDK = aFc1bSDK.valueOf;
            if (aFc1aSDK != AFc1aSDK.DEFAULT) {
                jSONObject.put(FirebaseAnalytics.Param.METHOD, aFc1aSDK.AFInAppEventParameterName);
            }
            String str = aFc1bSDK.AFInAppEventType;
            if (str != null && !up2.y(str)) {
                jSONObject.put("prefix", aFc1bSDK.AFInAppEventType);
            }
            AFInAppEventParameterName.put("host", jSONObject);
        }
        if (this.afErrorLogForExcManagerOnly.AFInAppEventType("AF_PREINSTALL_DISABLED")) {
            AFInAppEventParameterName(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }

    public AFd1eSDK(AFa1qSDK aFa1qSDK, AFc1zSDK aFc1zSDK) {
        this(aFa1qSDK, aFc1zSDK, null);
    }
}
