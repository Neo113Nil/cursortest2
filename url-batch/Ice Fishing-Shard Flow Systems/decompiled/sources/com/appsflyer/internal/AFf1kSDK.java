package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.text.AndroidCharacter;
import android.util.Base64;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1jSDK;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AFf1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int toString = 1;
    private final AFc1fSDK AFAdRevenueData;
    private volatile String component1;
    private volatile String getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private long getRevenue;
    private static char[] component3 = {28704, 28722, 28716, 28702, 28712, 28711, 28721, 28708, 28725};
    private static char areAllFieldsValid = 17880;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component4 = false;

    public AFf1kSDK(AFc1fSDK aFc1fSDK) {
        this.AFAdRevenueData = aFc1fSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r13 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0015, code lost:
    
        r13 = r13.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0013, code lost:
    
        if (r13 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b7, String str, int i2, Object[] objArr) {
        int i5;
        int i7 = $11 + 97;
        $10 = i7 % 128;
        char[] cArr = str;
        if (i7 % 2 != 0) {
            int i8 = 77 / 0;
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = component3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                cArr4[i9] = (char) (cArr3[i9] ^ 3069006688033654235L);
                i9++;
                $10 = ($11 + 41) % 128;
            }
            cArr3 = cArr4;
        }
        char c7 = (char) (3069006688033654235L ^ areAllFieldsValid);
        char[] cArr5 = new char[i2];
        if (i2 % 2 != 0) {
            i5 = i2 - 1;
            cArr5[i5] = (char) (cArr2[i5] - b7);
        } else {
            i5 = i2;
        }
        if (i5 > 1) {
            $10 = ($11 + 5) % 128;
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i10 = aFk1oSDK.AFAdRevenueData;
                if (i10 >= i5) {
                    break;
                }
                char c8 = cArr2[i10];
                aFk1oSDK.getCurrencyIso4217Code = c8;
                char c9 = cArr2[i10 + 1];
                aFk1oSDK.getRevenue = c9;
                if (c8 == c9) {
                    cArr5[i10] = (char) (c8 - b7);
                    cArr5[i10 + 1] = (char) (c9 - b7);
                    $11 = ($10 + 15) % 128;
                } else {
                    int i11 = c8 / c7;
                    aFk1oSDK.getMonetizationNetwork = i11;
                    int i12 = c8 % c7;
                    aFk1oSDK.component3 = i12;
                    int i13 = c9 / c7;
                    aFk1oSDK.getMediationNetwork = i13;
                    int i14 = c9 % c7;
                    aFk1oSDK.component1 = i14;
                    if (i12 == i14) {
                        int i15 = ((i11 + c7) - 1) % c7;
                        aFk1oSDK.getMonetizationNetwork = i15;
                        int i16 = ((i13 + c7) - 1) % c7;
                        aFk1oSDK.getMediationNetwork = i16;
                        cArr5[i10] = cArr3[(i15 * c7) + i12];
                        cArr5[i10 + 1] = cArr3[(i16 * c7) + i14];
                    } else if (i11 == i13) {
                        int i17 = ((i12 + c7) - 1) % c7;
                        aFk1oSDK.component3 = i17;
                        int i18 = ((i14 + c7) - 1) % c7;
                        aFk1oSDK.component1 = i18;
                        cArr5[i10] = cArr3[(i11 * c7) + i17];
                        cArr5[i10 + 1] = cArr3[(i13 * c7) + i18];
                    } else {
                        cArr5[i10] = cArr3[(i11 * c7) + i14];
                        cArr5[i10 + 1] = cArr3[(i13 * c7) + i12];
                    }
                }
                aFk1oSDK.AFAdRevenueData = i10 + 2;
            }
        }
        int i19 = 0;
        while (i19 < i2) {
            int i20 = $10 + 15;
            $11 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr5[i19] = (char) (cArr5[i19] ^ 23386);
                i19 += 116;
            } else {
                cArr5[i19] = (char) (cArr5[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private long component2() {
        int i2 = component2;
        long j = this.getRevenue;
        int i5 = i2 + 69;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i7 = 56 / 0;
        }
        return j;
    }

    private boolean component3() {
        int i2 = toString;
        component2 = (i2 + 119) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null) {
            return false;
        }
        component2 = (i2 + 83) % 128;
        if (map.isEmpty()) {
            return false;
        }
        toString = (component2 + 37) % 128;
        return true;
    }

    private static AFf1jSDK component4() {
        AFf1jSDK aFf1jSDK = new AFf1jSDK();
        int i2 = toString + 43;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return aFf1jSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1kSDK aFf1kSDK = (AFf1kSDK) objArr[0];
        int i2 = component2 + 115;
        toString = i2 % 128;
        int i5 = i2 % 2;
        String str = aFf1kSDK.component1;
        if (i5 == 0) {
            throw null;
        }
        toString = (component2 + 113) % 128;
        return str;
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i2, int i5, int i7) {
        int i8 = ~i7;
        int i9 = ((i5 | i7) * 521) + (((~(i8 | i5)) | i2) * (-1042)) + (i5 * (-520)) + (i2 * 522);
        int i10 = ~i2;
        int i11 = (((~(i2 | i8 | i5)) | (~(i7 | i10)) | (~((~i5) | i10))) * 521) + i9;
        if (i11 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i11 != 2) {
            return i11 != 3 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr);
        }
        AFf1kSDK aFf1kSDK = (AFf1kSDK) objArr[0];
        String str = (String) objArr[1];
        toString = (component2 + 35) % 128;
        aFf1kSDK.component1 = str;
        component2 = (toString + 3) % 128;
        return null;
    }

    public final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        AFc1hSDK aFc1hSDK = new AFc1hSDK(map, this.AFAdRevenueData.getCurrencyIso4217Code);
        int i2 = toString + 115;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return aFc1hSDK;
    }

    public final void areAllFieldsValid() {
        int i2 = component2 + 17;
        toString = i2 % 128;
        this.getMediationNetwork.put("ttr", Long.valueOf(i2 % 2 == 0 ? System.currentTimeMillis() & this.getRevenue : System.currentTimeMillis() - this.getRevenue));
        this.getMediationNetwork.put("lvl_timestamp", Long.valueOf(component2()));
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFAdRevenueData.getCurrencyIso4217Code};
                Map map2 = AFa1kSDK.f4295i;
                Object obj = map2.get(1656961623);
                if (obj == null) {
                    obj = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 11, 123 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1656961623, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                component2 = (toString + 69) % 128;
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

    public final void getRevenue(String str) {
        component2 = (toString + 93) % 128;
        this.getCurrencyIso4217Code = str;
        toString = (component2 + 5) % 128;
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap hashMap = new HashMap();
        if (component3()) {
            component2 = (toString + 53) % 128;
            hashMap.put("lvl", this.getMediationNetwork);
            component2 = (toString + 59) % 128;
            return hashMap;
        }
        if (this.getMonetizationNetwork) {
            this.getMediationNetwork = new HashMap();
            areAllFieldsValid();
            this.getMediationNetwork.put("error", "pending LVL response");
            hashMap.put("lvl", this.getMediationNetwork);
        }
        return hashMap;
    }

    public final void AFAdRevenueData(AFc1kSDK aFc1kSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.getMonetizationNetwork = component4().getMediationNetwork(getMonetizationNetwork(aFc1kSDK), this.AFAdRevenueData.getCurrencyIso4217Code, new AFf1jSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFf1kSDK.3
            @Override // com.appsflyer.internal.AFf1jSDK.AFa1ySDK
            public final void getMonetizationNetwork(String str, Exception exc) {
                AFf1kSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1kSDK.this.areAllFieldsValid();
                AFf1kSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }

            @Override // com.appsflyer.internal.AFf1jSDK.AFa1ySDK
            public final void getRevenue(String str, String str2) {
                AFf1kSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1kSDK.this.getMediationNetwork.put("signedData", str);
                AFf1kSDK.this.getMediationNetwork.put("signature", str2);
                AFf1kSDK.this.areAllFieldsValid();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }
        });
        component2 = (toString + 53) % 128;
    }

    public final boolean getRevenue() {
        toString = (component2 + 7) % 128;
        boolean z7 = this.component4;
        toString = (component2 + 111) % 128;
        return z7;
    }

    public final void getRevenue(boolean z7) {
        toString = (component2 + 87) % 128;
        this.component4 = z7;
        int i2 = component2 + 109;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final String getMonetizationNetwork() {
        int i2 = component2 + 3;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getCurrencyIso4217Code;
        }
        int i5 = 56 / 0;
        return this.getCurrencyIso4217Code;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        try {
            new AFb1sSDK((AFh1sSDK) objArr[0], (byte[]) objArr[1]).afInfoLog();
            component2 = (toString + 97) % 128;
            return null;
        } catch (Exception e7) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e7, false, false, true);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
    
        if (r3.getMonetizationNetwork != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3.getMonetizationNetwork != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (component3() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = com.appsflyer.internal.AFf1kSDK.component2 + 103;
        com.appsflyer.internal.AFf1kSDK.toString = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getMediationNetwork() {
        int i2 = toString + ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (com.appsflyer.internal.AFk1zSDK.getMediationNetwork(r7.component1) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        r1 = r7.AFAdRevenueData.getCurrencyIso4217Code;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (getMediationNetwork(r1) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        r1 = (android.telephony.TelephonyManager) r1.getSystemService("phone");
        r1 = (java.lang.String) r1.getClass().getMethod("getDeviceId", null).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r0 = new java.lang.StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
        r0.append(r1.getMessage());
        com.appsflyer.AFLogger.afErrorLog(r0.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        r0 = new java.lang.StringBuilder("WARNING: Can't collect IMEI: other reason: ");
        r0.append(r1.getMessage());
        com.appsflyer.AFLogger.afErrorLog(r0.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0030, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00bb, code lost:
    
        if (r7.component1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bd, code lost:
    
        com.appsflyer.internal.AFf1kSDK.toString = (com.appsflyer.internal.AFf1kSDK.component2 + 109) % 128;
        r1 = r7.component1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getRevenue(AFc1jSDK aFc1jSDK) {
        String revenue;
        String str;
        int i2 = toString + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z7 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, true);
            revenue = aFc1jSDK.getRevenue("imeiCached", (String) null);
        } else {
            boolean z8 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
            revenue = aFc1jSDK.getRevenue("imeiCached", (String) null);
        }
        if (AFk1zSDK.getMediationNetwork(str)) {
            int i5 = toString + 125;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                aFc1jSDK.getMediationNetwork("imeiCached", str);
                return str;
            }
            aFc1jSDK.getMediationNetwork("imeiCached", str);
            throw null;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
        str = revenue;
        if (AFk1zSDK.getMediationNetwork(str)) {
        }
    }

    private static boolean getMediationNetwork(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            toString = (component2 + 77) % 128;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFa1tSDK.getMediationNetwork();
                return !AFa1tSDK.getRevenue(context);
            }
        }
        toString = (component2 + 75) % 128;
    }

    public final String AFAdRevenueData() {
        return (String) getMonetizationNetwork(new Object[]{this}, -211782084, 211782085, System.identityHashCode(this));
    }

    private long getMonetizationNetwork(AFc1kSDK aFc1kSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1iSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code));
        sb.append(component2());
        long AFAdRevenueData = AFj1jSDK.AFAdRevenueData(AFj1jSDK.AFAdRevenueData(sb.toString()));
        int i2 = component2 + 119;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return AFAdRevenueData;
        }
        throw null;
    }

    public final void getCurrencyIso4217Code(String str) {
        getMonetizationNetwork(new Object[]{this, str}, 1176564115, -1176564113, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        String str;
        AFh1sSDK aFh1sSDK = (AFh1sSDK) objArr[0];
        AFc1kSDK aFc1kSDK = (AFc1kSDK) objArr[1];
        if (!AFk1zSDK.getMediationNetwork(aFc1kSDK.AFAdRevenueData)) {
            str = aFc1kSDK.AFAdRevenueData;
            component2 = (toString + 67) % 128;
        } else {
            String monetizationNetwork = aFc1kSDK.getMonetizationNetwork("com.appsflyer.security.uuid");
            if (!AFk1zSDK.getMediationNetwork(monetizationNetwork)) {
                String substring = monetizationNetwork.substring(0, 8);
                aFc1kSDK.AFAdRevenueData = substring;
                str = substring;
            } else {
                component2 = (toString + 39) % 128;
                str = null;
            }
        }
        if (str != null) {
            component2 = (toString + 97) % 128;
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
                    Object[] objArr2 = new Object[1];
                    a((byte) (104 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u0002\u0003\u0005\u0006\u0005\u0001\u0001\u0004\u0006\u0002\u0000\b", '<' - AndroidCharacter.getMirror('0'), objArr2);
                    long parseLong = Long.parseLong(String.valueOf(map.get(((String) objArr2[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i2 = ((int) (parseLong % 94)) + 33;
                    for (int i5 = 0; i5 < charArray.length; i5++) {
                        charArray[i5] = (char) (charArray[i5] ^ i2);
                    }
                    aFh1sSDK.getRevenue.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    return Boolean.TRUE;
                } catch (Exception e7) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e7);
                }
            }
        }
        component2 = (toString + 43) % 128;
        return Boolean.FALSE;
    }

    public static void getMonetizationNetwork(AFh1sSDK aFh1sSDK, byte[] bArr) {
        getMonetizationNetwork(new Object[]{aFh1sSDK, bArr}, -254860318, 254860321, (int) System.currentTimeMillis());
    }

    public static boolean getRevenue(AFh1sSDK aFh1sSDK, AFc1kSDK aFc1kSDK) {
        return ((Boolean) getMonetizationNetwork(new Object[]{aFh1sSDK, aFc1kSDK}, 2120438480, -2120438480, (int) System.currentTimeMillis())).booleanValue();
    }
}
