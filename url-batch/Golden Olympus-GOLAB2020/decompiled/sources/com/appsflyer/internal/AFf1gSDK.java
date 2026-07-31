package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1eSDK;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.IronSourceSegment;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component1 = {63633, 62277, 61193, 56317, 55253, 50050, 48743, 43590, 42524, 37626, 36515, 31377};
    private static long component3 = -7623911999770266845L;
    private static int copydefault = 0;
    private static int hashCode = 1;
    private long AFAdRevenueData;
    private volatile String component2;
    private volatile String component4;
    private final AFf1eSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1iSDK getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean areAllFieldsValid = false;

    public AFf1gSDK(AFc1iSDK aFc1iSDK, AFf1eSDK aFf1eSDK) {
        this.getRevenue = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    private static void a(int i4, int i5, char c4, Object[] objArr) {
        int i6;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i4];
        aFk1hSDK.getMediationNetwork = 0;
        $10 = ($11 + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        while (true) {
            int i7 = aFk1hSDK.getMediationNetwork;
            if (i7 >= i4) {
                break;
            }
            $11 = ($10 + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            jArr[i7] = (((char) (component1[i5 + i7] ^ (-750476924154939152L))) ^ (i7 * ((-750476924154939152L) ^ component3))) ^ c4;
            aFk1hSDK.getMediationNetwork = i7 + 1;
        }
        char[] cArr = new char[i4];
        while (true) {
            aFk1hSDK.getMediationNetwork = 0;
            while (true) {
                i6 = aFk1hSDK.getMediationNetwork;
                if (i6 >= i4) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i8 = $10 + 83;
                $11 = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i8 % 2 == 0) {
                    break;
                }
                cArr[i6] = (char) jArr[i6];
                aFk1hSDK.getMediationNetwork = i6 + 1;
            }
            cArr[i6] = (char) jArr[i6];
        }
    }

    private boolean component1() {
        copydefault = (hashCode + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        int i4 = hashCode + 117;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private long component2() {
        int i4 = (copydefault + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        hashCode = i4;
        long j4 = this.AFAdRevenueData;
        int i5 = i4 + 9;
        copydefault = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            return j4;
        }
        throw null;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = (i4 * 46) + (i5 * 46) + (((~(i7 | i8)) | i4) * (-90)) + (((~(i5 | i4)) | (~(i7 | i6))) * (-45)) + (((~(i4 | i8)) | (~((~i4) | i6)) | i7) * 45);
        return i9 != 1 ? i9 != 2 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr) : getMediationNetwork(objArr);
    }

    public final void AFAdRevenueData(String str) {
        copydefault = (hashCode + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.component4 = str;
        copydefault = (hashCode + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    final void areAllFieldsValid() {
        getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
    }

    public final void getMediationNetwork(String str) {
        int i4 = hashCode + InterfaceC1490j3.d.b.f16815g;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            this.component2 = str;
        } else {
            this.component2 = str;
            int i5 = 29 / 0;
        }
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getRevenue.getMonetizationNetwork};
                Map map2 = AFa1kSDK.f13355i;
                Object obj = map2.get(611220697);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 122, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(611220697, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                int i4 = copydefault + 45;
                hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    return map3;
                }
                throw null;
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

    public final String getRevenue() {
        int i4 = hashCode + 43;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.component2;
        copydefault = (hashCode + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: Exception -> 0x005f, InvocationTargetException -> 0x0061, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x0061, Exception -> 0x005f, blocks: (B:12:0x0043, B:23:0x007d, B:28:0x0063), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str;
        AFf1gSDK aFf1gSDK = (AFf1gSDK) objArr[0];
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[1];
        boolean z4 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFAdRevenueData = aFc1qSDK.AFAdRevenueData("imeiCached", (String) null);
        if (z4 && AFk1ySDK.getMediationNetwork(aFf1gSDK.component2)) {
            Context context = aFf1gSDK.getRevenue.getMonetizationNetwork;
            if (context != null && getMonetizationNetwork(context)) {
                int i4 = copydefault + 93;
                hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                try {
                } catch (InvocationTargetException e4) {
                    if (AFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFAdRevenueData));
                    } else {
                        AFAdRevenueData = null;
                    }
                    StringBuilder sb = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb.append(e4.getMessage());
                    AFLogger.afErrorLog(sb.toString(), e4);
                } catch (Exception e5) {
                    if (AFAdRevenueData != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFAdRevenueData));
                    } else {
                        AFAdRevenueData = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb2.append(e5.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e5);
                }
                if (i4 % 2 == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[1]).invoke(telephonyManager, new Object[1]);
                    if (str != null) {
                    }
                    if (AFAdRevenueData == null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(AFAdRevenueData)));
                        copydefault = (hashCode + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else {
                        AFAdRevenueData = null;
                    }
                    str = AFAdRevenueData;
                } else {
                    TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager2.getClass().getMethod("getDeviceId", null).invoke(telephonyManager2, null);
                    if (str != null) {
                    }
                    if (AFAdRevenueData == null) {
                    }
                    str = AFAdRevenueData;
                }
            }
            str = null;
        } else {
            if (aFf1gSDK.component2 != null) {
                str = aFf1gSDK.component2;
            }
            str = null;
        }
        if (AFk1ySDK.getMediationNetwork(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        hashCode = (copydefault + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFc1qSDK.getMediationNetwork("imeiCached", str);
        return str;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        try {
            new AFb1sSDK((AFh1rSDK) objArr[0]).afInfoLog();
            copydefault = (hashCode + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e4);
            return null;
        }
    }

    public final boolean AFAdRevenueData() {
        int i4 = copydefault + 59;
        hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return this.areAllFieldsValid;
        }
        throw null;
    }

    public static void getRevenue(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        int i4 = hashCode + 15;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 0;
            if (AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork)) {
                String currencyIso4217Code = aFc1pSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
                if (AFk1ySDK.getMediationNetwork(currencyIso4217Code)) {
                    int i6 = copydefault + 121;
                    hashCode = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i6 % 2 != 0) {
                        currencyIso4217Code = AFc1pSDK.getRevenue();
                    } else {
                        AFc1pSDK.getRevenue();
                        throw null;
                    }
                }
                aFc1pSDK.getMediationNetwork = currencyIso4217Code.substring(0, 8);
            }
            String str = aFc1pSDK.getMediationNetwork;
            try {
                Object[] objArr = new Object[1];
                a(12 - Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) TextUtils.indexOf("", "", 0), objArr);
                long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                char[] charArray = str.toCharArray();
                int i7 = ((int) (parseLong % 94)) + 33;
                while (i5 < charArray.length) {
                    int i8 = copydefault + 61;
                    hashCode = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i8 % 2 == 0) {
                        charArray[i5] = (char) (charArray[i5] ^ i7);
                        i5 += 117;
                    } else {
                        charArray[i5] = (char) (charArray[i5] ^ i7);
                        i5++;
                    }
                }
                map.put("sbid", new String(charArray));
                int i9 = copydefault + 9;
                hashCode = i9 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i9 % 2 == 0) {
                    throw null;
                }
                return;
            } catch (Exception e4) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e4);
                return;
            }
        }
        AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork);
        throw null;
    }

    public final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        AFc1gSDK aFc1gSDK = new AFc1gSDK(map, this.getRevenue.getMonetizationNetwork);
        int i4 = copydefault + 19;
        hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return aFc1gSDK;
        }
        throw null;
    }

    public final String getMediationNetwork() {
        int i4 = copydefault + 39;
        hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return this.component4;
        }
        throw null;
    }

    public final void getMediationNetwork(boolean z4) {
        hashCode = (copydefault + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.areAllFieldsValid = z4;
        int i4 = hashCode + 59;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    public final void AFAdRevenueData(AFc1pSDK aFc1pSDK) {
        this.AFAdRevenueData = System.currentTimeMillis();
        this.getMonetizationNetwork = this.getCurrencyIso4217Code.getMediationNetwork(getMediationNetwork(aFc1pSDK), this.getRevenue.getMonetizationNetwork, new AFf1eSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1gSDK.5
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, String str2) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1gSDK.this.getMediationNetwork.put("signedData", str);
                AFf1gSDK.this.getMediationNetwork.put("signature", str2);
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFf1gSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        hashCode = (copydefault + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public final boolean getMonetizationNetwork() {
        int i4 = copydefault;
        hashCode = (i4 + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.getMonetizationNetwork) {
            int i5 = i4 + 81;
            hashCode = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
                if (!component1()) {
                    return true;
                }
            } else if (!component1()) {
                return true;
            }
        }
        int i7 = hashCode + 113;
        copydefault = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private long getMediationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb.append(component2());
        long mediationNetwork = AFj1cSDK.getMediationNetwork(AFj1cSDK.getCurrencyIso4217Code(sb.toString()));
        hashCode = (copydefault + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return mediationNetwork;
    }

    private static boolean getMonetizationNetwork(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i4 = hashCode + 79;
            copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0 ? (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                if (!(!AFa1tSDK.getCurrencyIso4217Code(context))) {
                    return false;
                }
            }
        }
        hashCode = (copydefault + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    public static void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1gSDK aFf1gSDK = (AFf1gSDK) objArr[0];
        copydefault = (hashCode + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
        aFf1gSDK.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - aFf1gSDK.AFAdRevenueData));
        aFf1gSDK.getMediationNetwork.put("lvl_timestamp", Long.valueOf(aFf1gSDK.component2()));
        int i4 = hashCode + 15;
        copydefault = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final String getMediationNetwork(AFc1qSDK aFc1qSDK) {
        return (String) getCurrencyIso4217Code(new Object[]{this, aFc1qSDK}, -1198101809, 1198101809, System.identityHashCode(this));
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap hashMap = new HashMap();
        if (!component1()) {
            if (this.getMonetizationNetwork) {
                this.getMediationNetwork = new HashMap();
                getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
                this.getMediationNetwork.put("error", "pending LVL response");
                hashMap.put(IronSourceSegment.LEVEL, this.getMediationNetwork);
                copydefault = (hashCode + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            return hashMap;
        }
        int i4 = copydefault + 13;
        hashCode = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            hashMap.put(IronSourceSegment.LEVEL, this.getMediationNetwork);
            return hashMap;
        }
        hashMap.put(IronSourceSegment.LEVEL, this.getMediationNetwork);
        throw null;
    }
}
