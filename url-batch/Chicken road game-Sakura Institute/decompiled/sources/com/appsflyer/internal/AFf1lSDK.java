package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AFf1lSDK extends AFf1nSDK<String> {
    private static final AFf1zSDK[] afDebugLog = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFg1tSDK afErrorLog;
    private final AFe1gSDK afInfoLog;
    private final AFd1lSDK afRDLog;
    private final AFf1bSDK force;
    private final AFd1sSDK i;
    public final AFa1qSDK unregisterClient;
    protected final AFg1mSDK v;
    protected final AFd1qSDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    protected boolean i() {
        return true;
    }

    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1qSDK, aFd1kSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK, String str) {
        super(aFa1qSDK.values(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = aFa1qSDK;
        this.afInfoLog = aFd1kSDK.afVerboseLog();
        this.w = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.registerClient();
        this.afRDLog = aFd1kSDK.w();
        this.i = aFd1kSDK.AFInAppEventType();
        this.v = aFd1kSDK.e();
        this.afErrorLog = aFd1kSDK.getPurchaseType();
        for (AFf1zSDK aFf1zSDK : afDebugLog) {
            if (this.AFInAppEventType == aFf1zSDK) {
                return;
            }
        }
        int i = this.unregisterClient.AFLogger;
        AFf1zSDK aFf1zSDK2 = this.AFInAppEventType;
        if (i <= 0) {
            if (aFf1zSDK2 != AFf1zSDK.CONVERSION) {
                this.valueOf.add(AFf1zSDK.CONVERSION);
                return;
            }
            return;
        }
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        double d;
        String str2;
        String str3;
        String str4;
        valueOf(this.unregisterClient);
        if (this.unregisterClient.AFInAppEventParameterName().containsKey("meta")) {
            try {
                d = this.force.valueOf.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.AFKeystoreWrapper;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1qSDK.AFInAppEventType(d)) {
                this.unregisterClient.AFInAppEventParameterName().remove("meta");
            }
        }
        String str5 = this.unregisterClient.registerClient;
        Map<String, Object> AFInAppEventParameterName = this.unregisterClient.AFInAppEventParameterName();
        String str6 = null;
        try {
            str2 = new JSONObject(AFInAppEventParameterName).toString();
            try {
            } catch (NullPointerException e) {
                e = e;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    Object[] objArr = {AFInAppEventParameterName};
                    Object obj = AFa1uSDK.afRDLog.get(423593458);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (View.MeasureSpec.getMode(0) + 28425), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 73 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("AFInAppEventParameterName", Map.class);
                        AFa1uSDK.afRDLog.put(423593458, obj);
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
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str7;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Throwable th) {
                        th = th;
                        str2 = str7;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    }
                    if (str7 != null) {
                        str3 = str7.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str7;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
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
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Exception e5) {
                        e = e5;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                        ((AFf1nSDK) this).e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
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
                AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
                ((AFf1nSDK) this).e.valueOf(str5, str3);
                return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
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
            AFb1mSDK.AFKeystoreWrapper(new StringBuilder().append(this).append(": preparing data: ").append(str3).toString());
            ((AFf1nSDK) this).e.valueOf(str5, str3);
            return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    protected void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        this.v.AFInAppEventType(aFa1qSDK.AFInAppEventParameterName());
    }

    protected void values(AFa1qSDK aFa1qSDK) {
        this.v.AFInAppEventType(aFa1qSDK);
    }

    protected void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        this.v.values(aFa1qSDK);
    }

    private static Map<String, Object> registerClient(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.AFInAppEventParameterName().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1qSDK.AFInAppEventParameterName().put("meta", hashMap);
        return hashMap;
    }

    protected void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        this.v.AFKeystoreWrapper(aFa1qSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:4:0x0015, B:6:0x001b, B:8:0x0044, B:10:0x0046, B:13:0x0050, B:14:0x0055, B:16:0x005b, B:17:0x0064, B:19:0x006e, B:23:0x007a, B:26:0x0082, B:27:0x008d, B:29:0x0093, B:31:0x00ab, B:32:0x00b0, B:34:0x00c5, B:35:0x00ce, B:37:0x00d4, B:40:0x00db, B:41:0x00e2, B:42:0x00ae, B:43:0x00e5, B:45:0x00ef, B:46:0x00fa, B:56:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef A[Catch: all -> 0x0108, TryCatch #1 {all -> 0x0108, blocks: (B:4:0x0015, B:6:0x001b, B:8:0x0044, B:10:0x0046, B:13:0x0050, B:14:0x0055, B:16:0x005b, B:17:0x0064, B:19:0x006e, B:23:0x007a, B:26:0x0082, B:27:0x008d, B:29:0x0093, B:31:0x00ab, B:32:0x00b0, B:34:0x00c5, B:35:0x00ce, B:37:0x00d4, B:40:0x00db, B:41:0x00e2, B:42:0x00ae, B:43:0x00e5, B:45:0x00ef, B:46:0x00fa, B:56:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z;
        AFe1eSDK aFe1eSDK;
        try {
            try {
                AFInAppEventType(aFa1qSDK);
                AFInAppEventParameterName(aFa1qSDK);
                values(aFa1qSDK);
                AFKeystoreWrapper(aFa1qSDK);
            } catch (Throwable th) {
                AFLogger.afErrorLog("Error while collecting payload params", th, true, false);
            }
            if (aFa1qSDK.d()) {
                aFa1qSDK.valueOf(new AFd1rSDK(aFa1qSDK.AFInAppEventParameterName(), ((AFf1nSDK) this).d.AFKeystoreWrapper.AFKeystoreWrapper));
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).d.valueOf(aFa1qSDK.AFInAppEventParameterName()));
                if (this.i.AFInAppEventParameterName("com.appsflyer.security.enable")) {
                    AFg1wSDK aFg1wSDK = ((AFf1nSDK) this).d;
                    try {
                        new AFb1sSDK(aFa1qSDK).afInfoLog();
                    } catch (Exception e) {
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                    }
                }
            }
            if (aFa1qSDK.e()) {
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).d.AFInAppEventParameterName());
            }
            Set<AFf1zSDK> set = this.valueOf;
            if (!set.contains(AFf1zSDK.LAUNCH) && !set.contains(AFf1zSDK.CONVERSION)) {
                z = false;
                if (d() && z) {
                    aFa1qSDK.AFInAppEventType(this.w.valueOf("appsFlyerCount", 0));
                }
                if (aFa1qSDK.unregisterClient()) {
                    Map<String, Object> registerClient = registerClient(aFa1qSDK);
                    AFe1gSDK aFe1gSDK = this.afInfoLog;
                    String AFInAppEventParameterName = aFe1gSDK.AFInAppEventParameterName();
                    String AFInAppEventType = aFe1gSDK.AFInAppEventType();
                    if (AFe1gSDK.valueOf()) {
                        aFe1eSDK = AFe1eSDK.DEFAULT;
                    } else {
                        aFe1eSDK = AFe1eSDK.API;
                    }
                    AFe1hSDK aFe1hSDK = new AFe1hSDK(AFInAppEventParameterName, AFInAppEventType, aFe1eSDK);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, aFe1hSDK.values);
                    if (aFe1hSDK.AFInAppEventType != AFe1eSDK.DEFAULT) {
                        jSONObject.put("method", aFe1hSDK.AFInAppEventType.AFKeystoreWrapper);
                    }
                    String str = aFe1hSDK.AFInAppEventParameterName;
                    if (str != null && !StringsKt.isBlank(str)) {
                        jSONObject.put("prefix", aFe1hSDK.AFInAppEventParameterName);
                    }
                    registerClient.put("host", jSONObject);
                }
                if (this.i.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
                    registerClient(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.afErrorLog.values(aFa1qSDK.AFInAppEventParameterName(), aFa1qSDK.values());
            }
            z = true;
            if (d()) {
                aFa1qSDK.AFInAppEventType(this.w.valueOf("appsFlyerCount", 0));
            }
            if (aFa1qSDK.unregisterClient()) {
            }
            if (this.i.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
            }
            this.afErrorLog.values(aFa1qSDK.AFInAppEventParameterName(), aFa1qSDK.values());
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Error while preparing to send event", th2, true, false);
        }
    }
}
