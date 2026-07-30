package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1eSDK;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFd1eSDK extends AFd1nSDK<String> {
    private static final AFd1vSDK[] onInstallConversionFailureNative = {AFd1vSDK.DLSDK, AFd1vSDK.ONELINK, AFd1vSDK.MONITORSDK, AFd1vSDK.REGISTER};
    protected final AFb1fSDK AFLogger$LogLevel;
    private final AFc1tSDK AFVersionDeclaration;
    private final AFb1cSDK afErrorLogForExcManagerOnly;
    public final AFa1qSDK afInfoLog;
    private final AFc1cSDK afWarnLog;
    private final AFb1bSDK getLevel;

    @Override // com.appsflyer.internal.AFd1nSDK
    protected boolean afRDLog() {
        return true;
    }

    public AFd1eSDK(AFa1qSDK aFa1qSDK, AFc1zSDK aFc1zSDK) {
        this(aFa1qSDK, aFc1zSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
        if (i <= 0) {
            if (aFd1vSDK2 != AFd1vSDK.CONVERSION) {
                this.AFInAppEventType.add(AFd1vSDK.CONVERSION);
                return;
            }
            return;
        }
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    @Override // com.appsflyer.internal.AFd1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        double d;
        String str2;
        String str3;
        String str4;
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
        String str5 = this.afInfoLog.afInfoLog;
        Map<String, Object> AFInAppEventType = this.afInfoLog.AFInAppEventType();
        String str6 = null;
        try {
            str2 = new JSONObject(AFInAppEventType).toString();
            try {
            } catch (NullPointerException e) {
                e = e;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    String str7 = (String) ((Class) AFa1wSDK.AFKeystoreWrapper(74 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("values", Map.class).invoke(null, AFInAppEventType);
                    try {
                    } catch (NullPointerException e2) {
                        e = e2;
                        str2 = str7;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    } catch (Throwable th) {
                        th = th;
                        str2 = str7;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    }
                    if (str7 != null) {
                        str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str7;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    }
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                } catch (Throwable th2) {
                    try {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    } catch (NullPointerException e3) {
                        e = e3;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                        return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str6 = str2;
                AFLogger.afErrorLog("Unexpected error", th, true);
                str3 = "";
                str2 = str6;
                if (str2 != null) {
                }
                if (str3.equals(str4)) {
                }
                AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
                return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
            }
        } catch (NullPointerException e4) {
            e = e4;
            str2 = null;
        } catch (Throwable th5) {
            th = th5;
        }
        if (str2 != null) {
            str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
            str4 = str2 != null ? str2 : "";
            if (str3.equals(str4)) {
                str3 = str4;
            } else {
                AFLogger.afWarnLog("Payload contains non-printing characters");
            }
            AFc1pSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
            ((AFd1nSDK) this).afDebugLog.valueOf(str5, str3);
            return ((AFd1nSDK) this).afErrorLog.AFKeystoreWrapper(this.afInfoLog, str, this.getLevel);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    protected final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    protected void values(AFa1qSDK aFa1qSDK) {
        AFc1aSDK aFc1aSDK;
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
            String AFInAppEventType = aFc1cSDK.AFInAppEventType();
            String valueOf = aFc1cSDK.valueOf();
            if (AFc1cSDK.AFInAppEventParameterName()) {
                aFc1aSDK = AFc1aSDK.DEFAULT;
            } else {
                aFc1aSDK = AFc1aSDK.API;
            }
            AFc1bSDK aFc1bSDK = new AFc1bSDK(AFInAppEventType, valueOf, aFc1aSDK);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aFc1bSDK.AFInAppEventType);
            if (aFc1bSDK.valueOf != AFc1aSDK.DEFAULT) {
                jSONObject.put(FirebaseAnalytics.Param.METHOD, aFc1bSDK.valueOf.AFKeystoreWrapper);
            }
            String str = aFc1bSDK.AFInAppEventParameterName;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObject.put("prefix", aFc1bSDK.AFInAppEventParameterName);
            }
            AFInAppEventParameterName.put("host", jSONObject);
        }
        if (this.afErrorLogForExcManagerOnly.AFInAppEventType("AF_PREINSTALL_DISABLED")) {
            AFInAppEventParameterName(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
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
}
