package com.appsflyer.internal;

import android.graphics.Color;
import android.view.Gravity;
import android.view.MotionEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFf1rSDK extends AFe1dSDK<String> {
    private static final AFe1mSDK[] AFInAppEventType = {AFe1mSDK.DLSDK, AFe1mSDK.ONELINK, AFe1mSDK.REGISTER};
    private final AFf1dSDK AFKeystoreWrapper;
    private final AFc1iSDK AFLogger;
    public final AFh1rSDK component2;
    protected final AFc1qSDK copy;
    private final AFc1pSDK copydefault;
    private final AFe1zSDK equals;
    private final AFf1oSDK hashCode;
    protected final AFg1qSDK toString;

    public AFf1rSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK) {
        this(aFh1rSDK, aFc1dSDK, null);
    }

    protected static Map<String, Object> component1(AFh1rSDK aFh1rSDK) {
        Map<String, Object> map = (Map) aFh1rSDK.AFAdRevenueData.get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFh1rSDK.AFAdRevenueData.put("meta", hashMap);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0045, B:8:0x005d, B:10:0x0063, B:11:0x006c, B:13:0x0076, B:17:0x0082, B:20:0x008a, B:21:0x0095, B:23:0x009b, B:25:0x00b3, B:26:0x00b8, B:28:0x00cd, B:29:0x00d4, B:31:0x00d8, B:34:0x00df, B:35:0x00e6, B:36:0x00b6, B:37:0x00e9, B:39:0x00f3, B:40:0x00fe, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0045, B:8:0x005d, B:10:0x0063, B:11:0x006c, B:13:0x0076, B:17:0x0082, B:20:0x008a, B:21:0x0095, B:23:0x009b, B:25:0x00b3, B:26:0x00b8, B:28:0x00cd, B:29:0x00d4, B:31:0x00d8, B:34:0x00df, B:35:0x00e6, B:36:0x00b6, B:37:0x00e9, B:39:0x00f3, B:40:0x00fe, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        boolean z4;
        try {
            try {
                getCurrencyIso4217Code(aFh1rSDK);
                getRevenue(aFh1rSDK);
                getMediationNetwork(aFh1rSDK);
                getMonetizationNetwork(aFh1rSDK);
                component3(aFh1rSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1rSDK.getRevenue()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.AFAdRevenueData(aFh1rSDK.AFAdRevenueData));
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getMonetizationNetwork(aFh1rSDK.AFAdRevenueData));
                if (this.copydefault.getMonetizationNetwork("com.appsflyer.security.enable", false)) {
                    AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
                }
            }
            if (aFh1rSDK.component2()) {
                aFh1rSDK.getMediationNetwork(((AFe1dSDK) this).component3.getCurrencyIso4217Code());
            }
            Set<AFe1mSDK> set = this.getCurrencyIso4217Code;
            if (!set.contains(AFe1mSDK.LAUNCH) && !set.contains(AFe1mSDK.CONVERSION)) {
                z4 = false;
                if (areAllFieldsValid() && z4) {
                    aFh1rSDK.AFAdRevenueData(this.copy.AFAdRevenueData("appsFlyerCount", 0));
                }
                if (aFh1rSDK.areAllFieldsValid()) {
                    Map<String, Object> component1 = component1(aFh1rSDK);
                    AFe1zSDK aFe1zSDK = this.equals;
                    AFe1xSDK aFe1xSDK = new AFe1xSDK(aFe1zSDK.getMediationNetwork(), aFe1zSDK.getCurrencyIso4217Code(), AFe1zSDK.AFAdRevenueData() ? AFe1wSDK.DEFAULT : AFe1wSDK.API);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1xSDK.getMediationNetwork);
                    AFe1wSDK aFe1wSDK = aFe1xSDK.AFAdRevenueData;
                    if (aFe1wSDK != AFe1wSDK.DEFAULT) {
                        jSONObject.put("method", aFe1wSDK.getCurrencyIso4217Code);
                    }
                    String str = aFe1xSDK.getRevenue;
                    if (str != null && !StringsKt.z(str)) {
                        jSONObject.put("prefix", aFe1xSDK.getRevenue);
                    }
                    component1.put("host", jSONObject);
                }
                if (this.copydefault.getMonetizationNetwork("AF_PREINSTALL_DISABLED", false)) {
                    component1(aFh1rSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.AFKeystoreWrapper.AFAdRevenueData(aFh1rSDK.AFAdRevenueData, aFh1rSDK.getCurrencyIso4217Code());
            }
            z4 = true;
            if (areAllFieldsValid()) {
                aFh1rSDK.AFAdRevenueData(this.copy.AFAdRevenueData("appsFlyerCount", 0));
            }
            if (aFh1rSDK.areAllFieldsValid()) {
            }
            if (this.copydefault.getMonetizationNetwork("AF_PREINSTALL_DISABLED", false)) {
            }
            this.AFKeystoreWrapper.AFAdRevenueData(aFh1rSDK.AFAdRevenueData, aFh1rSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected final AppsFlyerRequestListener component3() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    protected boolean copydefault() {
        return true;
    }

    protected void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        this.toString.getMediationNetwork(aFh1rSDK);
    }

    protected void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getMonetizationNetwork(aFh1rSDK);
    }

    protected void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0142  */
    @Override // com.appsflyer.internal.AFe1dSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFd1nSDK<String> getRevenue(String str) {
        double d4;
        JSONObject jSONObject;
        String str2;
        String str3;
        Exception exc;
        String str4;
        AFAdRevenueData(this.component2);
        if (this.component2.AFAdRevenueData.containsKey("meta")) {
            try {
                d4 = this.hashCode.getMediationNetwork.getCurrencyIso4217Code.getMonetizationNetwork.getCurrencyIso4217Code.getMonetizationNetwork;
            } catch (NullPointerException unused) {
                d4 = 1.0d;
            }
            if (AFh1rSDK.getCurrencyIso4217Code(d4)) {
                this.component2.AFAdRevenueData.remove("meta");
            }
        }
        AFd1nSDK<String> currencyIso4217Code = this.component4.getCurrencyIso4217Code(this.component2, str, this.AFLogger);
        Map<String, Object> map = this.component2.AFAdRevenueData;
        try {
            jSONObject = new JSONObject(map);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e4) {
                    e = e4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1kSDK.f13355i;
                        Object obj = map2.get(-1183302619);
                        if (obj == null) {
                            obj = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) Color.green(0), 36 - MotionEvent.axisFromString(""))).getMethod("getCurrencyIso4217Code", Map.class);
                            map2.put(-1183302619, obj);
                        }
                        String str5 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e5) {
                            e = e5;
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
                            AFh1ySDK.getCurrencyIso4217Code(sb.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Exception e6) {
                            exc = e6;
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
                            AFh1ySDK.getCurrencyIso4217Code(sb2.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Throwable th) {
                            th = th;
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
                            AFh1ySDK.getCurrencyIso4217Code(sb22.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        }
                        if (str5 == null) {
                            throw new NullPointerException("JSON toString of eventParams map returns null");
                        }
                        str3 = str5.replaceAll("\\p{C}", "*Non-printing character*");
                        str2 = str5;
                        if (str2 != null) {
                        }
                        if (str3.equals(str4)) {
                        }
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append(this);
                        sb222.append(": preparing data: ");
                        AFh1ySDK.getCurrencyIso4217Code(sb222.toString(), jSONObject);
                        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                        return currencyIso4217Code;
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e7) {
                            e = e7;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(this);
                            sb2222.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb2222.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Exception e8) {
                            exc = e8;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append(this);
                            sb22222.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb22222.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            StringBuilder sb222222 = new StringBuilder();
                            sb222222.append(this);
                            sb222222.append(": preparing data: ");
                            AFh1ySDK.getCurrencyIso4217Code(sb222222.toString(), jSONObject);
                            ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    str3 = "";
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    StringBuilder sb2222222 = new StringBuilder();
                    sb2222222.append(this);
                    sb2222222.append(": preparing data: ");
                    AFh1ySDK.getCurrencyIso4217Code(sb2222222.toString(), jSONObject);
                    ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
                    return currencyIso4217Code;
                }
            } catch (NullPointerException e9) {
                e = e9;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                str2 = null;
            }
        } catch (NullPointerException e10) {
            e = e10;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            str2 = null;
        }
        if (str2 == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
        str4 = str2 != null ? str2 : "";
        if (str3.equals(str4)) {
            str3 = str4;
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e11) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e11);
            }
        }
        StringBuilder sb22222222 = new StringBuilder();
        sb22222222.append(this);
        sb22222222.append(": preparing data: ");
        AFh1ySDK.getCurrencyIso4217Code(sb22222222.toString(), jSONObject);
        ((AFe1dSDK) this).areAllFieldsValid.getCurrencyIso4217Code(currencyIso4217Code != null ? currencyIso4217Code.getRevenue.getMonetizationNetwork : null, str3);
        return currencyIso4217Code;
    }

    public AFf1rSDK(AFh1rSDK aFh1rSDK, AFc1dSDK aFc1dSDK, String str) {
        super(aFh1rSDK.getCurrencyIso4217Code(), new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1dSDK, str);
        this.component2 = aFh1rSDK;
        this.equals = aFc1dSDK.AFKeystoreWrapper();
        this.copy = aFc1dSDK.component2();
        this.hashCode = aFc1dSDK.component1();
        this.AFLogger = aFc1dSDK.AFInAppEventType();
        this.copydefault = aFc1dSDK.getRevenue();
        this.toString = aFc1dSDK.component3();
        this.AFKeystoreWrapper = aFc1dSDK.afErrorLog();
        for (AFe1mSDK aFe1mSDK : AFInAppEventType) {
            if (this.getMonetizationNetwork == aFe1mSDK) {
                return;
            }
        }
        int i4 = this.component2.component2;
        AFe1mSDK aFe1mSDK2 = this.getMonetizationNetwork;
        if (i4 > 0) {
            this.AFAdRevenueData.add(AFe1mSDK.CONVERSION);
        } else {
            AFe1mSDK aFe1mSDK3 = AFe1mSDK.CONVERSION;
            if (aFe1mSDK2 != aFe1mSDK3) {
                this.getCurrencyIso4217Code.add(aFe1mSDK3);
            }
        }
    }

    protected void component3(AFh1rSDK aFh1rSDK) {
        this.toString.AFAdRevenueData(aFh1rSDK);
    }

    protected void getRevenue(AFh1rSDK aFh1rSDK) {
        this.toString.getRevenue(aFh1rSDK.AFAdRevenueData);
    }
}
