package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1lSDK extends AFf1nSDK<String> {
    private static final AFf1zSDK[] afDebugLog = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFg1tSDK afErrorLog;
    private final AFe1gSDK afInfoLog;
    private final AFd1lSDK afRDLog;
    private final AFf1bSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1sSDK f5908i;
    public final AFa1qSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    protected final AFg1mSDK f5909v;

    /* renamed from: w, reason: collision with root package name */
    protected final AFd1qSDK f5910w;

    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1qSDK, aFd1kSDK, null);
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

    public void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        this.f5909v.values(aFa1qSDK);
    }

    public void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        this.f5909v.AFInAppEventType(aFa1qSDK.AFInAppEventParameterName());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0109  */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        double d4;
        String str2;
        String str3;
        String str4;
        valueOf(this.unregisterClient);
        if (this.unregisterClient.AFInAppEventParameterName().containsKey("meta")) {
            try {
                d4 = this.force.valueOf.valueOf.AFInAppEventParameterName.AFKeystoreWrapper.AFKeystoreWrapper;
            } catch (NullPointerException unused) {
                d4 = 1.0d;
            }
            if (AFa1qSDK.AFInAppEventType(d4)) {
                this.unregisterClient.AFInAppEventParameterName().remove("meta");
            }
        }
        AFa1qSDK aFa1qSDK = this.unregisterClient;
        String str5 = aFa1qSDK.registerClient;
        Map<String, Object> AFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        String str6 = null;
        try {
            str2 = new JSONObject(AFInAppEventParameterName).toString();
            try {
            } catch (NullPointerException e4) {
                e = e4;
                AFLogger.afErrorLog("JSONObject return null String object. Trying to create AFJsonObject.", e, true);
                try {
                    Object[] objArr = {AFInAppEventParameterName};
                    Map<Integer, Object> map = AFa1uSDK.afRDLog;
                    Object obj = map.get(423593458);
                    if (obj == null) {
                        obj = ((Class) AFa1uSDK.values((char) (View.MeasureSpec.getMode(0) + 28425), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 73 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("AFInAppEventParameterName", Map.class);
                        map.put(423593458, obj);
                    }
                    String str7 = (String) ((Method) obj).invoke(null, objArr);
                    try {
                    } catch (NullPointerException e5) {
                        e = e5;
                        str2 = str7;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(this);
                        sb.append(": preparing data: ");
                        sb.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Exception e6) {
                        e = e6;
                        str2 = str7;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this);
                        sb2.append(": preparing data: ");
                        sb2.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb2.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
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
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append(this);
                        sb22.append(": preparing data: ");
                        sb22.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb22.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
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
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append(this);
                    sb222.append(": preparing data: ");
                    sb222.append(str3);
                    AFb1mSDK.AFKeystoreWrapper(sb222.toString());
                    ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                    return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                } catch (Throwable th2) {
                    try {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    } catch (NullPointerException e7) {
                        e = e7;
                        AFLogger.afErrorLog("AFJsonObject return null String object.", e, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb2222 = new StringBuilder();
                        sb2222.append(this);
                        sb2222.append(": preparing data: ");
                        sb2222.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb2222.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Exception e8) {
                        e = e8;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb22222 = new StringBuilder();
                        sb22222.append(this);
                        sb22222.append(": preparing data: ");
                        sb22222.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb22222.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
                    } catch (Throwable th3) {
                        th = th3;
                        AFLogger.afErrorLog("Unexpected error", th, true);
                        str3 = "";
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb222222 = new StringBuilder();
                        sb222222.append(this);
                        sb222222.append(": preparing data: ");
                        sb222222.append(str3);
                        AFb1mSDK.AFKeystoreWrapper(sb222222.toString());
                        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
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
                StringBuilder sb2222222 = new StringBuilder();
                sb2222222.append(this);
                sb2222222.append(": preparing data: ");
                sb2222222.append(str3);
                AFb1mSDK.AFKeystoreWrapper(sb2222222.toString());
                ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
                return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
            }
        } catch (NullPointerException e9) {
            e = e9;
            str2 = null;
        } catch (Throwable th5) {
            th = th5;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
        str4 = str2 != null ? str2 : "";
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.afWarnLog("Payload contains non-printing characters");
        }
        StringBuilder sb22222222 = new StringBuilder();
        sb22222222.append(this);
        sb22222222.append(": preparing data: ");
        sb22222222.append(str3);
        AFb1mSDK.AFKeystoreWrapper(sb22222222.toString());
        ((AFf1nSDK) this).f5912e.valueOf(str5, str3);
        return ((AFf1nSDK) this).AFLogger.AFKeystoreWrapper(this.unregisterClient, str, this.afRDLog);
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public boolean i() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:4:0x0015, B:6:0x001b, B:9:0x0044, B:12:0x0051, B:13:0x0056, B:15:0x005c, B:16:0x0065, B:18:0x006f, B:22:0x007b, B:25:0x0083, B:26:0x008e, B:28:0x0094, B:30:0x00ac, B:31:0x00b1, B:33:0x00c6, B:34:0x00cd, B:36:0x00d1, B:39:0x00d8, B:40:0x00df, B:41:0x00af, B:42:0x00e2, B:44:0x00ec, B:45:0x00f7, B:55:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:4:0x0015, B:6:0x001b, B:9:0x0044, B:12:0x0051, B:13:0x0056, B:15:0x005c, B:16:0x0065, B:18:0x006f, B:22:0x007b, B:25:0x0083, B:26:0x008e, B:28:0x0094, B:30:0x00ac, B:31:0x00b1, B:33:0x00c6, B:34:0x00cd, B:36:0x00d1, B:39:0x00d8, B:40:0x00df, B:41:0x00af, B:42:0x00e2, B:44:0x00ec, B:45:0x00f7, B:55:0x0010, B:3:0x0002), top: B:2:0x0002, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z4;
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
                aFa1qSDK.valueOf(new AFd1rSDK(aFa1qSDK.AFInAppEventParameterName(), ((AFf1nSDK) this).f5911d.AFKeystoreWrapper.AFKeystoreWrapper));
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).f5911d.valueOf(aFa1qSDK.AFInAppEventParameterName()));
                if (this.f5908i.AFInAppEventParameterName("com.appsflyer.security.enable")) {
                    try {
                        new AFb1sSDK(aFa1qSDK).afInfoLog();
                    } catch (Exception e4) {
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e4);
                    }
                }
            }
            if (aFa1qSDK.e()) {
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).f5911d.AFInAppEventParameterName());
            }
            Set<AFf1zSDK> set = this.valueOf;
            if (!set.contains(AFf1zSDK.LAUNCH) && !set.contains(AFf1zSDK.CONVERSION)) {
                z4 = false;
                if (d() && z4) {
                    aFa1qSDK.AFInAppEventType(this.f5910w.valueOf("appsFlyerCount", 0));
                }
                if (aFa1qSDK.unregisterClient()) {
                    Map<String, Object> registerClient = registerClient(aFa1qSDK);
                    AFe1gSDK aFe1gSDK = this.afInfoLog;
                    AFe1hSDK aFe1hSDK = new AFe1hSDK(aFe1gSDK.AFInAppEventParameterName(), aFe1gSDK.AFInAppEventType(), AFe1gSDK.valueOf() ? AFe1eSDK.DEFAULT : AFe1eSDK.API);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1hSDK.AFKeystoreWrapper);
                    AFe1eSDK aFe1eSDK = aFe1hSDK.values;
                    if (aFe1eSDK != AFe1eSDK.DEFAULT) {
                        jSONObject.put("method", aFe1eSDK.AFInAppEventType);
                    }
                    String str = aFe1hSDK.AFInAppEventType;
                    if (str != null && !y.x(str)) {
                        jSONObject.put("prefix", aFe1hSDK.AFInAppEventType);
                    }
                    registerClient.put("host", jSONObject);
                }
                if (this.f5908i.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
                    registerClient(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.afErrorLog.values(aFa1qSDK.AFInAppEventParameterName(), aFa1qSDK.values());
            }
            z4 = true;
            if (d()) {
                aFa1qSDK.AFInAppEventType(this.f5910w.valueOf("appsFlyerCount", 0));
            }
            if (aFa1qSDK.unregisterClient()) {
            }
            if (this.f5908i.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
            }
            this.afErrorLog.values(aFa1qSDK.AFInAppEventParameterName(), aFa1qSDK.values());
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Error while preparing to send event", th2, true, false);
        }
    }

    public void values(AFa1qSDK aFa1qSDK) {
        this.f5909v.AFInAppEventType(aFa1qSDK);
    }

    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK, String str) {
        super(aFa1qSDK.values(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = aFa1qSDK;
        this.afInfoLog = aFd1kSDK.afVerboseLog();
        this.f5910w = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.registerClient();
        this.afRDLog = aFd1kSDK.w();
        this.f5908i = aFd1kSDK.AFInAppEventType();
        this.f5909v = aFd1kSDK.e();
        this.afErrorLog = aFd1kSDK.getPurchaseType();
        for (AFf1zSDK aFf1zSDK : afDebugLog) {
            if (this.AFInAppEventType == aFf1zSDK) {
                return;
            }
        }
        int i2 = this.unregisterClient.AFLogger;
        AFf1zSDK aFf1zSDK2 = this.AFInAppEventType;
        if (i2 > 0) {
            this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
        } else {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.valueOf.add(aFf1zSDK3);
            }
        }
    }

    public void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        this.f5909v.AFKeystoreWrapper(aFa1qSDK);
    }
}
