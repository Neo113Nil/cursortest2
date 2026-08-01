package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1dSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char areAllFieldsValid = 28972;
    private static char component4 = 39723;
    private static char copydefault = 3892;
    private static int equals = 0;
    private static int hashCode = 1;
    private static char toString = 50688;
    private volatile String component1;
    private volatile String component2;
    private final AFf1dSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1hSDK getMonetizationNetwork;
    private long getRevenue;
    private boolean AFAdRevenueData = false;
    private volatile boolean component3 = false;

    public AFf1eSDK(AFc1hSDK aFc1hSDK, AFf1dSDK aFf1dSDK) {
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1dSDK;
    }

    private static void a(String str, int i3, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr = new char[charArray.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i10 = aFk1qSDK.getRevenue;
            if (i10 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i3);
                return;
            }
            $10 = ($11 + 39) % 128;
            cArr2[0] = charArray[i10];
            cArr2[1] = charArray[i10 + 1];
            int i11 = 58224;
            for (int i12 = 0; i12 < 16; i12++) {
                $11 = ($10 + 91) % 128;
                char c10 = cArr2[1];
                char c11 = cArr2[0];
                char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + ((char) (copydefault ^ (-1199070254561146252L))))) ^ ((c11 >>> 5) + ((char) (toString ^ (-1199070254561146252L))))));
                cArr2[1] = c12;
                cArr2[0] = (char) (c11 - (((c12 >>> 5) + ((char) (areAllFieldsValid ^ (-1199070254561146252L)))) ^ ((c12 + i11) ^ ((c12 << 4) + ((char) (component4 ^ (-1199070254561146252L)))))));
                i11 -= 40503;
            }
            int i13 = aFk1qSDK.getRevenue;
            cArr[i13] = cArr2[0];
            cArr[i13 + 1] = cArr2[1];
            aFk1qSDK.getRevenue = i13 + 2;
        }
    }

    private boolean component1() {
        int i3 = hashCode;
        equals = (i3 + 83) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null) {
            return false;
        }
        equals = (i3 + 69) % 128;
        if (map.isEmpty()) {
            return false;
        }
        hashCode = (equals + 47) % 128;
        return true;
    }

    private long component2() {
        return ((Long) getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this))).longValue();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i3, int i10, int i11) {
        int i12 = ~i3;
        int i13 = ~((~i11) | i12);
        int i14 = (((~(i3 | i10 | i11)) | i13) * 338) + ((~(i12 | i10)) * 338) + (((~((~i10) | i3)) | i13 | (~(i3 | i11))) * (-338)) + (i10 * 339) + (i3 * (-337));
        if (i14 == 1) {
            AFf1eSDK aFf1eSDK = (AFf1eSDK) objArr[0];
            AFc1oSDK aFc1oSDK = (AFc1oSDK) objArr[1];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFb1kSDK.getCurrencyIso4217Code(aFc1oSDK.getMediationNetwork));
            sb2.append(((Long) getCurrencyIso4217Code(new Object[]{aFf1eSDK}, -518249890, 518249890, System.identityHashCode(aFf1eSDK))).longValue());
            long revenue = AFj1dSDK.getRevenue(AFj1dSDK.AFAdRevenueData(sb2.toString()));
            equals = (hashCode + 35) % 128;
            return Long.valueOf(revenue);
        }
        if (i14 != 2) {
            AFf1eSDK aFf1eSDK2 = (AFf1eSDK) objArr[0];
            int i15 = hashCode;
            equals = (i15 + 117) % 128;
            long j = aFf1eSDK2.getRevenue;
            equals = (i15 + 51) % 128;
            return Long.valueOf(j);
        }
        AFf1eSDK aFf1eSDK3 = (AFf1eSDK) objArr[0];
        String str = (String) objArr[1];
        equals = (hashCode + 91) % 128;
        aFf1eSDK3.component2 = str;
        hashCode = (equals + 53) % 128;
        return null;
    }

    public static boolean getRevenue(AFh1mSDK aFh1mSDK, AFc1oSDK aFc1oSDK) {
        String str;
        equals = (hashCode + 115) % 128;
        if (AFk1wSDK.getMonetizationNetwork(aFc1oSDK.AFAdRevenueData)) {
            String currencyIso4217Code = aFc1oSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
            if (AFk1wSDK.getMonetizationNetwork(currencyIso4217Code)) {
                str = null;
            } else {
                String substring = currencyIso4217Code.substring(0, 8);
                aFc1oSDK.AFAdRevenueData = substring;
                str = substring;
            }
        } else {
            str = aFc1oSDK.AFAdRevenueData;
            hashCode = (equals + 1) % 128;
        }
        if (str != null) {
            hashCode = (equals + 83) % 128;
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                    Object[] objArr = new Object[1];
                    a("颸╊Џ誢䚯ྸ\uf0ec⣑缞腁羥燓", '<' - AndroidCharacter.getMirror('0'), objArr);
                    long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i3 = ((int) (parseLong % 94)) + 33;
                    for (int i10 = 0; i10 < charArray.length; i10++) {
                        charArray[i10] = (char) (charArray[i10] ^ i3);
                    }
                    aFh1mSDK.getMediationNetwork.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    return true;
                } catch (Exception e2) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e2);
                }
            }
        }
        return false;
    }

    public final String AFAdRevenueData() {
        int i3 = equals + 89;
        hashCode = i3 % 128;
        int i10 = i3 % 2;
        String str = this.component2;
        if (i10 == 0) {
            throw null;
        }
        int i11 = equals + 81;
        hashCode = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void component4() {
        Map<String, Object> map;
        Object currencyIso4217Code;
        int i3 = equals + 55;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() / this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) currencyIso4217Code).longValue()));
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getMonetizationNetwork.getMonetizationNetwork};
                Map map2 = AFa1hSDK.f2044d;
                Object obj = map2.get(-532394666);
                if (obj == null) {
                    obj = ((Class) AFa1hSDK.getRevenue(Process.getGidForName("") + 126, (char) TextUtils.getCapsMode("", 0, 0), 36 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-532394666, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                hashCode = (equals + 115) % 128;
                return map3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false, true);
            return new HashMap();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: Exception -> 0x005d, InvocationTargetException -> 0x005f, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x005f, Exception -> 0x005d, blocks: (B:12:0x0042, B:25:0x007a, B:29:0x0061), top: B:10:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getMonetizationNetwork(AFc1qSDK aFc1qSDK) {
        String str;
        hashCode = (equals + 81) % 128;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("imeiCached", (String) null);
        if (z10 && AFk1wSDK.getMonetizationNetwork(this.component2)) {
            Context context = this.getMonetizationNetwork.getMonetizationNetwork;
            if (context != null && getRevenue(context)) {
                int i3 = hashCode + 123;
                equals = i3 % 128;
                try {
                } catch (InvocationTargetException e2) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2);
                } catch (Exception e9) {
                    if (monetizationNetwork != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e9.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e9);
                }
                if (i3 % 2 != 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", null).invoke(telephonyManager, new Object[1]);
                    if (str != null) {
                    }
                    if (monetizationNetwork == null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(monetizationNetwork));
                    } else {
                        monetizationNetwork = null;
                    }
                    str = monetizationNetwork;
                } else {
                    TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager2.getClass().getMethod("getDeviceId", null).invoke(telephonyManager2, null);
                    if (str != null) {
                    }
                    if (monetizationNetwork == null) {
                    }
                    str = monetizationNetwork;
                }
            }
            str = null;
        } else {
            if (this.component2 != null) {
                str = this.component2;
            }
            str = null;
        }
        if (AFk1wSDK.getMonetizationNetwork(str)) {
            AFLogger.afInfoLog("IMEI was not collected.");
            return null;
        }
        aFc1qSDK.getRevenue("imeiCached", str);
        int i10 = equals + 57;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void AFAdRevenueData(String str) {
        int i3 = equals + 17;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            this.component1 = str;
            int i10 = 0 / 0;
        } else {
            this.component1 = str;
        }
    }

    public final String getMediationNetwork() {
        int i3 = equals + 51;
        hashCode = i3 % 128;
        int i10 = i3 % 2;
        String str = this.component1;
        if (i10 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean getCurrencyIso4217Code() {
        int i3 = hashCode + 39;
        equals = i3 % 128;
        int i10 = i3 % 2;
        boolean z10 = this.component3;
        if (i10 != 0) {
            throw null;
        }
        hashCode = (equals + 39) % 128;
        return z10;
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getMonetizationNetwork);
        int i3 = hashCode + 77;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return aFc1iSDK;
        }
        throw null;
    }

    private long getCurrencyIso4217Code(AFc1oSDK aFc1oSDK) {
        return ((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue();
    }

    public final Map<String, Object> getRevenue() {
        HashMap hashMap = new HashMap();
        if (component1()) {
            hashCode = (equals + 53) % 128;
            hashMap.put("lvl", this.getMediationNetwork);
            hashCode = (equals + 55) % 128;
            return hashMap;
        }
        if (this.AFAdRevenueData) {
            this.getMediationNetwork = new HashMap();
            component4();
            this.getMediationNetwork.put("error", "pending LVL response");
            hashMap.put("lvl", this.getMediationNetwork);
        }
        return hashMap;
    }

    public final void getRevenue(AFc1oSDK aFc1oSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.AFAdRevenueData = this.getCurrencyIso4217Code.getRevenue(((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue(), this.getMonetizationNetwork.getMonetizationNetwork, new AFf1dSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1eSDK.3
            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getMonetizationNetwork(String str, String str2) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1eSDK.this.getMediationNetwork.put("signedData", str);
                AFf1eSDK.this.getMediationNetwork.put("signature", str2);
                AFf1eSDK.this.component4();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getRevenue(String str, Exception exc) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1eSDK.this.component4();
                AFf1eSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i3 = equals + 69;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            int i10 = 61 / 0;
        }
    }

    private static boolean getRevenue(Context context) {
        equals = (hashCode + 63) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        equals = (hashCode + 3) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        equals = (hashCode + 123) % 128;
        AFa1ySDK.getRevenue();
        if (!AFa1ySDK.getRevenue(context)) {
            return true;
        }
        hashCode = (equals + 75) % 128;
        return false;
    }

    public final void getRevenue(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, -1410448561, 1410448563, System.identityHashCode(this));
    }

    public final void getMonetizationNetwork(boolean z10) {
        int i3 = equals + 47;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            this.component3 = z10;
            int i10 = 23 / 0;
        } else {
            this.component3 = z10;
        }
    }

    public static void getMonetizationNetwork(AFh1mSDK aFh1mSDK, byte[] bArr) {
        try {
            new AFb1sSDK(aFh1mSDK, bArr).afInfoLog();
            hashCode = (equals + 105) % 128;
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e2, false, false, true);
        }
    }

    public final boolean getMonetizationNetwork() {
        equals = (hashCode + 37) % 128;
        if (!this.AFAdRevenueData || component1()) {
            return false;
        }
        equals = (hashCode + 21) % 128;
        return true;
    }
}
