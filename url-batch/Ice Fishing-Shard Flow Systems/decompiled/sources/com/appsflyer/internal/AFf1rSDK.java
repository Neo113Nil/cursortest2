package com.appsflyer.internal;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1rSDK extends AFe1bSDK<String> {
    private static final AFe1lSDK[] registerClient = {AFe1lSDK.DLSDK, AFe1lSDK.ONELINK, AFe1lSDK.REGISTER};
    private final AFc1fSDK AFInAppEventParameterName;
    private final AFf1gSDK AFLogger;
    protected final AFc1jSDK component2;
    private final AFc1kSDK copy;
    private final AFf1mSDK copydefault;
    protected final AFg1vSDK equals;
    private final AFe1vSDK hashCode;
    private final AFh1sSDK toString;

    public AFf1rSDK(AFh1sSDK aFh1sSDK, AFd1zSDK aFd1zSDK) {
        this(aFh1sSDK, aFd1zSDK, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x0040, B:8:0x0046, B:9:0x004f, B:11:0x005a, B:15:0x0066, B:18:0x006e, B:19:0x0079, B:21:0x007f, B:23:0x0099, B:24:0x009e, B:26:0x00b3, B:27:0x00ba, B:29:0x00be, B:32:0x00c5, B:33:0x00cc, B:34:0x009c, B:35:0x00cf, B:37:0x00d9, B:38:0x00e6, B:46:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x001e, B:5:0x0024, B:6:0x0040, B:8:0x0046, B:9:0x004f, B:11:0x005a, B:15:0x0066, B:18:0x006e, B:19:0x0079, B:21:0x007f, B:23:0x0099, B:24:0x009e, B:26:0x00b3, B:27:0x00ba, B:29:0x00be, B:32:0x00c5, B:33:0x00cc, B:34:0x009c, B:35:0x00cf, B:37:0x00d9, B:38:0x00e6, B:46:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        boolean z7;
        try {
            try {
                getRevenue(aFh1sSDK);
                getMonetizationNetwork(aFh1sSDK);
                getMediationNetwork(aFh1sSDK);
                getCurrencyIso4217Code(aFh1sSDK);
                component3(aFh1sSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1sSDK.getMonetizationNetwork()) {
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.AFAdRevenueData(aFh1sSDK.AFAdRevenueData));
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.getMediationNetwork(aFh1sSDK.AFAdRevenueData));
            }
            if (aFh1sSDK.component4()) {
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.getCurrencyIso4217Code());
            }
            Set<AFe1lSDK> set = this.getRevenue;
            if (!set.contains(AFe1lSDK.LAUNCH) && !set.contains(AFe1lSDK.CONVERSION)) {
                z7 = false;
                if (component3() && z7) {
                    aFh1sSDK.getMonetizationNetwork(this.component2.getCurrencyIso4217Code("appsFlyerCount", 0));
                }
                if (aFh1sSDK.component3()) {
                    Map<String, Object> AFAdRevenueData = AFj1cSDK.AFAdRevenueData(aFh1sSDK.AFAdRevenueData);
                    AFe1vSDK aFe1vSDK = this.hashCode;
                    AFe1zSDK aFe1zSDK = new AFe1zSDK(aFe1vSDK.getCurrencyIso4217Code(), aFe1vSDK.getMonetizationNetwork(), AFe1vSDK.getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1zSDK.getRevenue);
                    AFe1sSDK aFe1sSDK = aFe1zSDK.getMonetizationNetwork;
                    if (aFe1sSDK != AFe1sSDK.DEFAULT) {
                        jSONObject.put("method", aFe1sSDK.AFAdRevenueData);
                    }
                    String str = aFe1zSDK.getCurrencyIso4217Code;
                    if (str != null && !StringsKt.z(str)) {
                        jSONObject.put("prefix", aFe1zSDK.getCurrencyIso4217Code);
                    }
                    AFAdRevenueData.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, jSONObject);
                }
                if (this.copy.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
                    AFj1cSDK.AFAdRevenueData(aFh1sSDK.AFAdRevenueData).put("preinstall_disabled", Boolean.TRUE);
                }
                this.AFLogger.getCurrencyIso4217Code(aFh1sSDK.AFAdRevenueData, aFh1sSDK.getRevenue());
            }
            z7 = true;
            if (component3()) {
                aFh1sSDK.getMonetizationNetwork(this.component2.getCurrencyIso4217Code("appsFlyerCount", 0));
            }
            if (aFh1sSDK.component3()) {
            }
            if (this.copy.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
            }
            this.AFLogger.getCurrencyIso4217Code(aFh1sSDK.AFAdRevenueData, aFh1sSDK.getRevenue());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return this.toString.getCurrencyIso4217Code;
    }

    public void component3(AFh1sSDK aFh1sSDK) {
        this.equals.getRevenue(aFh1sSDK);
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public boolean copy() {
        return true;
    }

    public void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        this.equals.getMonetizationNetwork(aFh1sSDK);
    }

    public void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        this.equals.getMediationNetwork(aFh1sSDK);
    }

    public void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        this.equals.getRevenue(aFh1sSDK.AFAdRevenueData);
    }

    public void getRevenue(AFh1sSDK aFh1sSDK) {
        this.equals.getCurrencyIso4217Code(aFh1sSDK);
    }

    public AFf1rSDK(AFh1sSDK aFh1sSDK, AFd1zSDK aFd1zSDK, String str) {
        super(aFh1sSDK.getRevenue(), new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.toString = aFh1sSDK;
        this.hashCode = aFd1zSDK.AFInAppEventType();
        this.component2 = aFd1zSDK.getMediationNetwork();
        this.copydefault = aFd1zSDK.component3();
        this.AFInAppEventParameterName = aFd1zSDK.registerClient();
        this.copy = aFd1zSDK.AFAdRevenueData();
        this.equals = aFd1zSDK.areAllFieldsValid();
        this.AFLogger = aFd1zSDK.force();
        for (AFe1lSDK aFe1lSDK : registerClient) {
            if (this.getMonetizationNetwork == aFe1lSDK) {
                return;
            }
        }
        int i2 = this.toString.component1;
        AFe1lSDK aFe1lSDK2 = this.getMonetizationNetwork;
        if (i2 > 0) {
            this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
        } else {
            AFe1lSDK aFe1lSDK3 = AFe1lSDK.CONVERSION;
            if (aFe1lSDK2 != aFe1lSDK3) {
                this.getRevenue.add(aFe1lSDK3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    @Override // com.appsflyer.internal.AFe1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFd1fSDK<String> getRevenue(String str) {
        double d7;
        JSONObject jSONObject;
        String str2;
        String str3;
        Exception exc;
        String replaceAll;
        String str4;
        AFAdRevenueData(this.toString);
        if (this.toString.AFAdRevenueData.containsKey("meta")) {
            try {
                d7 = this.copydefault.getCurrencyIso4217Code.AFAdRevenueData.getMediationNetwork.getMonetizationNetwork.getCurrencyIso4217Code;
            } catch (NullPointerException unused) {
                d7 = 1.0d;
            }
            if (AFh1sSDK.getMonetizationNetwork(d7)) {
                this.toString.AFAdRevenueData.remove("meta");
            }
        }
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        AFd1fSDK<String> aFd1fSDK = (AFd1fSDK) AFd1mSDK.getCurrencyIso4217Code(new Object[]{aFd1mSDK, this.toString, str, this.AFInAppEventParameterName}, -846475552, 846475554, System.identityHashCode(aFd1mSDK));
        Map<String, Object> map = this.toString.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                str2 = jSONObject.toString();
            } catch (NullPointerException e7) {
                e = e7;
                str2 = null;
            } catch (Throwable th) {
                th = th;
                str2 = null;
            }
        } catch (NullPointerException e8) {
            e = e8;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
            str2 = null;
        }
        try {
        } catch (NullPointerException e9) {
            e = e9;
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
            try {
                Object[] objArr = {map};
                Map map2 = AFa1kSDK.f4295i;
                Object obj = map2.get(2037700457);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getMediationNetwork((char) TextUtils.indexOf("", ""), (ViewConfiguration.getTouchSlop() >> 8) + 37, (Process.myPid() >> 22) + 197)).getMethod("getRevenue", Map.class);
                    map2.put(2037700457, obj);
                }
                String str5 = (String) ((Method) obj).invoke(null, objArr);
                try {
                } catch (NullPointerException e10) {
                    e = e10;
                    str2 = str5;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                } catch (Exception e11) {
                    exc = e11;
                    str2 = str5;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb2.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str5;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(this);
                    sb22.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb22.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                }
                if (str5 == null) {
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                }
                replaceAll = str5.replaceAll("\\p{C}", "*Non-printing character*");
                str2 = str5;
                str3 = replaceAll;
                if (str2 != null) {
                }
                if (str3.equals(str4)) {
                }
                StringBuilder sb222 = new StringBuilder();
                sb222.append(this);
                sb222.append(": preparing data: ");
                AFg1fSDK.AFAdRevenueData(sb222.toString(), jSONObject);
                ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                return aFd1fSDK;
            } catch (Throwable th4) {
                try {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                } catch (NullPointerException e12) {
                    e = e12;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222 = new StringBuilder();
                    sb2222.append(this);
                    sb2222.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb2222.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                } catch (Exception e13) {
                    exc = e13;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb22222 = new StringBuilder();
                    sb22222.append(this);
                    sb22222.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb22222.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                } catch (Throwable th5) {
                    th = th5;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb222222 = new StringBuilder();
                    sb222222.append(this);
                    sb222222.append(": preparing data: ");
                    AFg1fSDK.AFAdRevenueData(sb222222.toString(), jSONObject);
                    ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
                    return aFd1fSDK;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
            str3 = "";
            if (str2 != null) {
            }
            if (str3.equals(str4)) {
            }
            StringBuilder sb2222222 = new StringBuilder();
            sb2222222.append(this);
            sb2222222.append(": preparing data: ");
            AFg1fSDK.AFAdRevenueData(sb2222222.toString(), jSONObject);
            ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
            return aFd1fSDK;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        replaceAll = str2.replaceAll("\\p{C}", "*Non-printing character*");
        str3 = replaceAll;
        str4 = str2 != null ? str2 : "";
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e14) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e14);
            }
        }
        StringBuilder sb22222222 = new StringBuilder();
        sb22222222.append(this);
        sb22222222.append(": preparing data: ");
        AFg1fSDK.AFAdRevenueData(sb22222222.toString(), jSONObject);
        ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(aFd1fSDK != null ? aFd1fSDK.getMediationNetwork.AFAdRevenueData : null, str3);
        return aFd1fSDK;
    }
}
