package com.appsflyer.internal;

import android.graphics.Color;
import android.view.View;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AFf1nSDK extends AFf1rSDK<String> {
    private static final AFe1eSDK[] afVerboseLog = {AFe1eSDK.DLSDK, AFe1eSDK.ONELINK, AFe1eSDK.REGISTER};
    private final AFd1pSDK afInfoLog;
    private final AFd1nSDK afWarnLog;
    public final AFa1rSDK e;
    protected final AFg1sSDK force;
    private final AFf1eSDK i;
    private final AFe1gSDK v;
    protected final AFd1xSDK w;

    @Override // com.appsflyer.internal.AFf1rSDK
    protected boolean unregisterClient() {
        return true;
    }

    public AFf1nSDK(AFa1rSDK aFa1rSDK, AFd1mSDK aFd1mSDK) {
        this(aFa1rSDK, aFd1mSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1nSDK(AFa1rSDK aFa1rSDK, AFd1mSDK aFd1mSDK, String str) {
        super(aFa1rSDK.valueOf(), new AFe1eSDK[]{AFe1eSDK.RC_CDN}, aFd1mSDK, str);
        this.e = aFa1rSDK;
        this.v = aFd1mSDK.afErrorLog();
        this.w = aFd1mSDK.valueOf();
        this.i = aFd1mSDK.registerClient();
        this.afWarnLog = aFd1mSDK.v();
        this.afInfoLog = aFd1mSDK.values();
        this.force = aFd1mSDK.unregisterClient();
        for (AFe1eSDK aFe1eSDK : afVerboseLog) {
            if (this.AFInAppEventType == aFe1eSDK) {
                return;
            }
        }
        int i = this.e.AFLogger;
        AFe1eSDK aFe1eSDK2 = this.AFInAppEventType;
        if (i <= 0) {
            if (aFe1eSDK2 != AFe1eSDK.CONVERSION) {
                this.AFInAppEventParameterName.add(AFe1eSDK.CONVERSION);
                return;
            }
            return;
        }
        this.valueOf.add(AFe1eSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105  */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1xSDK<String> values(String str) {
        double d;
        String str2;
        String str3;
        String str4;
        AFKeystoreWrapper(this.e);
        if (this.e.AFKeystoreWrapper().containsKey("meta")) {
            try {
                d = this.i.AFInAppEventParameterName.valueOf.AFInAppEventParameterName.AFInAppEventParameterName.valueOf;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1rSDK.AFInAppEventType(d)) {
                this.e.AFKeystoreWrapper().remove("meta");
            }
        }
        String str5 = this.e.registerClient;
        Map<String, Object> AFKeystoreWrapper = this.e.AFKeystoreWrapper();
        String str6 = null;
        try {
            str2 = new JSONObject(AFKeystoreWrapper).toString();
            try {
            } catch (NullPointerException e) {
                e = e;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    Object[] objArr = {AFKeystoreWrapper};
                    Object obj = AFa1uSDK.afVerboseLog.get(1500917361);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.valueOf((char) (8620 - View.MeasureSpec.getMode(0)), ExpandableListView.getPackedPositionType(0L) + 37, Color.argb(0, 0, 0, 0) + 73)).getMethod("AFInAppEventParameterName", Map.class);
                        AFa1uSDK.afVerboseLog.put(1500917361, obj);
                    }
                    String str7 = (String) ((Method) obj).invoke(null, objArr);
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
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str7;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    } catch (Throwable th) {
                        th = th;
                        str2 = str7;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    }
                    if (str7 != null) {
                        str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str7;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    }
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                } catch (Throwable th2) {
                    try {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    } catch (NullPointerException e4) {
                        e = e4;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    } catch (Exception e5) {
                        e = e5;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                        return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
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
                AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
                return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
            }
        } catch (NullPointerException e6) {
            e = e6;
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
            AFb1hSDK.AFInAppEventType(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
            ((AFf1rSDK) this).registerClient.AFInAppEventParameterName(str5, str3);
            return this.AFLogger.AFInAppEventParameterName(this.e, str, this.afWarnLog);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return this.e.valueOf;
    }

    protected void AFInAppEventParameterName(AFa1rSDK aFa1rSDK) {
        this.force.valueOf(aFa1rSDK.AFKeystoreWrapper());
    }

    protected void values(AFa1rSDK aFa1rSDK) {
        this.force.AFInAppEventParameterName(aFa1rSDK);
    }

    private static Map<String, Object> AFInAppEventType(AFa1rSDK aFa1rSDK) {
        Map<String, Object> map = (Map) aFa1rSDK.AFKeystoreWrapper().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1rSDK.AFKeystoreWrapper().put("meta", hashMap);
        return hashMap;
    }

    protected void AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        AFe1kSDK aFe1kSDK;
        boolean z = true;
        try {
            AFInAppEventParameterName(aFa1rSDK);
            values(aFa1rSDK);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error while collecting payload params", th, true, false);
        }
        if (aFa1rSDK.e()) {
            aFa1rSDK.values(new AFd1rSDK(aFa1rSDK.AFKeystoreWrapper(), ((AFf1rSDK) this).unregisterClient.AFKeystoreWrapper.AFKeystoreWrapper));
            aFa1rSDK.values((Map<String, ?>) ((AFf1rSDK) this).unregisterClient.AFInAppEventType(aFa1rSDK.AFKeystoreWrapper()));
            if (this.afInfoLog.AFKeystoreWrapper("com.appsflyer.security.enable")) {
                AFg1xSDK aFg1xSDK = ((AFf1rSDK) this).unregisterClient;
                try {
                    new AFb1sSDK(aFa1rSDK).afInfoLog();
                } catch (Exception e) {
                    AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                }
            }
        }
        if (aFa1rSDK.d()) {
            aFa1rSDK.values((Map<String, ?>) ((AFf1rSDK) this).unregisterClient.values());
        }
        Set<AFe1eSDK> set = this.AFInAppEventParameterName;
        if (!set.contains(AFe1eSDK.LAUNCH) && !set.contains(AFe1eSDK.CONVERSION)) {
            z = false;
        }
        if (d() && z) {
            aFa1rSDK.AFInAppEventParameterName(this.w.AFKeystoreWrapper("appsFlyerCount", 0));
        }
        if (aFa1rSDK.unregisterClient()) {
            Map<String, Object> AFInAppEventType = AFInAppEventType(aFa1rSDK);
            AFe1gSDK aFe1gSDK = this.v;
            String AFKeystoreWrapper = aFe1gSDK.AFKeystoreWrapper();
            String AFInAppEventParameterName = aFe1gSDK.AFInAppEventParameterName();
            if (AFe1gSDK.AFInAppEventType()) {
                aFe1kSDK = AFe1kSDK.DEFAULT;
            } else {
                aFe1kSDK = AFe1kSDK.API;
            }
            AFe1iSDK aFe1iSDK = new AFe1iSDK(AFKeystoreWrapper, AFInAppEventParameterName, aFe1kSDK);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", aFe1iSDK.valueOf);
            if (aFe1iSDK.values != AFe1kSDK.DEFAULT) {
                jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1iSDK.values.AFInAppEventParameterName);
            }
            String str = aFe1iSDK.AFInAppEventParameterName;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObject.put("prefix", aFe1iSDK.AFInAppEventParameterName);
            }
            AFInAppEventType.put("host", jSONObject);
        }
        if (this.afInfoLog.AFKeystoreWrapper("AF_PREINSTALL_DISABLED")) {
            AFInAppEventType(aFa1rSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }
}
