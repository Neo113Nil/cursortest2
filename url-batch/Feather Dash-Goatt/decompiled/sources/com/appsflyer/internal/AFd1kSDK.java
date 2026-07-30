package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1kSDK implements AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static int copydefault = 1;
    private static final int getRevenue;
    private static long hashCode;
    private static int toString;
    private final AFd1zSDK component4;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMediationNetwork = true;
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component1 = false;

    static {
        component2();
        getRevenue = 98166;
        toString = (copydefault + 75) % 128;
    }

    public AFd1kSDK(AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private synchronized void AFAdRevenueData(String str, String str2, String... strArr) {
        String obj;
        try {
            if (copy()) {
                copydefault = (toString + 123) % 128;
                if (this.getMonetizationNetwork < 98304) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        String join = TextUtils.join(", ", strArr);
                        if (str != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append(" ");
                            sb.append(Thread.currentThread().getId());
                            sb.append(" _/AppsFlyer_6.18.0 [");
                            sb.append(str);
                            sb.append("] ");
                            sb.append(str2);
                            sb.append(" ");
                            sb.append(join);
                            obj = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append(" ");
                            sb2.append(Thread.currentThread().getId());
                            sb2.append(" ");
                            sb2.append(str2);
                            sb2.append("/AppsFlyer_6.18.0 ");
                            sb2.append(join);
                            obj = sb2.toString();
                        }
                        int length = this.getMonetizationNetwork + (obj.length() << 1);
                        int i = getRevenue;
                        boolean z = false;
                        if (length > i) {
                            copydefault = (toString + 25) % 128;
                            obj = obj.substring(0, (i - this.getMonetizationNetwork) / 2);
                            z = true;
                        }
                        this.getCurrencyIso4217Code.add(obj);
                        this.getMonetizationNetwork += obj.length() << 1;
                        if (z) {
                            int i2 = copydefault + 1;
                            toString = i2 % 128;
                            int i3 = i2 % 2;
                            List<String> list = this.getCurrencyIso4217Code;
                            if (i3 != 0) {
                                list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMonetizationNetwork >>= 1297;
                            } else {
                                list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                                this.getMonetizationNetwork += 138;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } finally {
        }
    }

    private void AFInAppEventParameterName() {
        copydefault = (toString + 101) % 128;
        this.component4.getMediationNetwork().getCurrencyIso4217Code("participantInProxy");
        toString = (copydefault + 3) % 128;
    }

    private boolean AFInAppEventType() {
        int i = copydefault + 49;
        toString = i % 128;
        int i2 = i % 2;
        AFc1jSDK mediationNetwork = this.component4.getMediationNetwork();
        if (i2 != 0) {
            mediationNetwork.getRevenue("participantInProxy");
            throw null;
        }
        boolean revenue = mediationNetwork.getRevenue("participantInProxy");
        int i3 = copydefault + 71;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        long[] jArr = new long[i];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i3 = aFk1kSDK.getMediationNetwork;
            if (i3 >= i) {
                break;
            }
            int i4 = $10;
            $11 = (i4 + 85) % 128;
            jArr[i3] = (((char) (component3[i2 + i3] ^ 5211070536272185776L)) ^ (i3 * (5211070536272185776L ^ hashCode))) ^ c;
            aFk1kSDK.getMediationNetwork = i3 + 1;
            $11 = (i4 + 121) % 128;
        }
        char[] cArr = new char[i];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i5 = aFk1kSDK.getMediationNetwork;
            if (i5 >= i) {
                objArr[0] = new String(cArr);
                return;
            } else {
                cArr[i5] = (char) jArr[i5];
                aFk1kSDK.getMediationNetwork = i5 + 1;
            }
        }
    }

    private synchronized void areAllFieldsValid() {
        int i = toString;
        copydefault = (i + 113) % 128;
        if (this.component1) {
            copydefault = (i + 69) % 128;
            return;
        }
        this.component1 = true;
        try {
            AFAdRevenueData("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
        }
    }

    private float component1() {
        copydefault = (toString + 51) % 128;
        float nextFloat = this.areAllFieldsValid.nextFloat();
        int i = toString + 21;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return nextFloat;
        }
        throw null;
    }

    public static void component2() {
        component3 = new char[]{62651, 61828, 65254, 64314, 57345};
        hashCode = 266560491673881759L;
    }

    private static String component4() {
        int i = copydefault + 107;
        toString = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
        return "6.18.0";
    }

    private boolean copy() {
        if (!this.component2) {
            return false;
        }
        int i = toString;
        copydefault = (i + 119) % 128;
        if (this.getMediationNetwork) {
            return true;
        }
        int i2 = i + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component1;
        if (i3 != 0) {
            return z;
        }
        throw null;
    }

    private synchronized Map<String, Object> copydefault() {
        toString = (copydefault + 91) % 128;
        this.AFAdRevenueData.put("data", this.getCurrencyIso4217Code);
        equals();
        Map<String, Object> map = this.AFAdRevenueData;
        int i = toString + 111;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        int i2 = 89 / 0;
        return map;
    }

    private synchronized void equals() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMonetizationNetwork = 0;
        copydefault = (toString + 41) % 128;
    }

    private boolean getCurrencyIso4217Code(AFi1zSDK aFi1zSDK, AFi1zSDK aFi1zSDK2) {
        boolean z;
        int i = toString + 73;
        copydefault = i % 128;
        if (i % 2 == 0) {
            aFi1zSDK.equals(aFi1zSDK2);
            throw null;
        }
        if (aFi1zSDK.equals(aFi1zSDK2)) {
            z = AFInAppEventType();
        } else {
            boolean revenue = getRevenue(aFi1zSDK.AFAdRevenueData);
            AFAdRevenueData(revenue);
            z = revenue;
        }
        int i2 = toString + 9;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        int i = copydefault + 107;
        toString = i % 128;
        if (i % 2 != 0) {
            aFd1kSDK.getRevenue(getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.AFAdRevenueData), getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.getMonetizationNetwork));
            throw null;
        }
        boolean revenue = aFd1kSDK.getRevenue(getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.AFAdRevenueData), getRevenue(aFd1kSDK.component4.component3().getCurrencyIso4217Code.getMonetizationNetwork));
        if (revenue) {
            aFd1kSDK.areAllFieldsValid();
            copydefault = (toString + 73) % 128;
        } else {
            aFd1kSDK.getMediationNetwork();
            aFd1kSDK.AFAdRevenueData();
        }
        return Boolean.valueOf(revenue);
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.getMode(0) + 5, ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 64874), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFAdRevenueData.put("model", Build.MODEL);
            this.AFAdRevenueData.put("platform", "Android");
            this.AFAdRevenueData.put("platform_version", Build.VERSION.RELEASE);
            if (str != null && str.length() > 0) {
                int i = toString + 87;
                copydefault = i % 128;
                int i2 = i % 2;
                Map<String, Object> map2 = this.AFAdRevenueData;
                if (i2 == 0) {
                    map2.put("advertiserId", str);
                    throw null;
                }
                map2.put("advertiserId", str);
            }
            if (str2 != null) {
                int i3 = toString + 15;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                if (str2.length() > 0) {
                    int i4 = toString + 75;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    Map<String, Object> map3 = this.AFAdRevenueData;
                    if (i5 == 0) {
                        map3.put("imei", str2);
                        throw null;
                    }
                    map3.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.AFAdRevenueData.put("android_id", str3);
                copydefault = (toString + 89) % 128;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0020, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        int i = toString + 117;
        copydefault = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.AFAdRevenueData;
        try {
            if (i2 == 0) {
                map.put("sdk_version", str);
                int i3 = 68 / 0;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        this.AFAdRevenueData.put("devkey", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                }
                if (str4 != null && str4.length() > 0) {
                    this.AFAdRevenueData.put("uid", str4);
                }
                int i4 = toString + 67;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } else {
                map.put("sdk_version", str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final boolean component3() {
        int i = (toString + 79) % 128;
        copydefault = i;
        boolean z = this.component1;
        int i2 = i + 41;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void q_(String str, PackageManager packageManager) {
        copydefault = (toString + 9) % 128;
        try {
            AFd1nSDK AFAdRevenueData = this.component4.getRevenue().AFAdRevenueData(getMediationNetwork(str), this.component4.AFInAppEventParameterName().getMonetizationNetwork());
            if (AFAdRevenueData == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.component4.getCurrencyIso4217Code().execute(new f(2, AFAdRevenueData));
                copydefault = (toString + 103) % 128;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        String str = (String) objArr[1];
        String[] strArr = (String[]) objArr[2];
        toString = (copydefault + 91) % 128;
        aFd1kSDK.AFAdRevenueData("public_api_call", str, strArr);
        int i = copydefault + 65;
        toString = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void getCurrencyIso4217Code() {
        try {
            int i = copydefault + 31;
            toString = i % 128;
            int i2 = i % 2;
            Map<String, Object> map = this.AFAdRevenueData;
            if (i2 != 0) {
                map.clear();
                this.getCurrencyIso4217Code.clear();
                this.getMonetizationNetwork = 1;
            } else {
                map.clear();
                this.getCurrencyIso4217Code.clear();
                this.getMonetizationNetwork = 0;
            }
            copydefault = (toString + 49) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getCurrencyIso4217Code(Throwable th) {
        AFAdRevenueData(new Object[]{this, th}, 1500974607, -1500974606, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getRevenue(String str, int i, String str2) {
        toString = (copydefault + 107) % 128;
        AFAdRevenueData("server_response", str, String.valueOf(i), str2);
        int i2 = copydefault + 41;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i = copydefault + 113;
        int i2 = i % 128;
        toString = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        copydefault = (i2 + 97) % 128;
        for (int i3 = 1; i3 < stackTraceElementArr.length; i3++) {
            toString = (copydefault + 9) % 128;
            strArr[i3] = stackTraceElementArr[i3].toString();
        }
        return strArr;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMediationNetwork(String str, String str2) {
        int i = toString + 107;
        copydefault = i % 128;
        if (i % 2 != 0) {
            AFAdRevenueData((String) null, str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        AFAdRevenueData((String) null, str, strArr);
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void getMediationNetwork() {
        try {
            int i = copydefault + 17;
            toString = i % 128;
            if (i % 2 != 0) {
                this.getMediationNetwork = false;
            } else {
                this.getMediationNetwork = false;
            }
            getCurrencyIso4217Code();
            equals();
            toString = (copydefault + 17) % 128;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean getRevenue(AFi1zSDK aFi1zSDK, AFi1zSDK aFi1zSDK2) {
        if (aFi1zSDK == null) {
            AFInAppEventParameterName();
            return false;
        }
        if (!aFi1zSDK.getMonetizationNetwork()) {
            toString = (copydefault + 71) % 128;
            return false;
        }
        if (this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= aFi1zSDK.getCurrencyIso4217Code) {
            int i = toString + 63;
            copydefault = i % 128;
            if (i % 2 != 0) {
                if (!getCurrencyIso4217Code(aFi1zSDK, aFi1zSDK2)) {
                    return false;
                }
                if (getMonetizationNetwork(aFi1zSDK.getMonetizationNetwork)) {
                    return getRevenue(aFi1zSDK.getRevenue);
                }
                return false;
            }
        }
        copydefault = (toString + 17) % 128;
        return false;
    }

    private Map<String, Object> getMediationNetwork(String str) {
        toString = (copydefault + 113) % 128;
        AFAdRevenueData(str, this.component4.AFInAppEventParameterName(), this.component4.e());
        Map<String, Object> copydefault2 = copydefault();
        int i = toString + 103;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return copydefault2;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMediationNetwork(String str, String... strArr) {
        AFAdRevenueData(new Object[]{this, str, strArr}, 1230732210, -1230732210, System.identityHashCode(this));
    }

    private static boolean getRevenue(String str) {
        if (AFk1zSDK.getRevenue(str)) {
            toString = (copydefault + 73) % 128;
            return true;
        }
        new AFd1rSDK();
        return AFd1rSDK.getRevenue(component4(), str);
    }

    private boolean getRevenue(float f) {
        double d = f;
        if (d < 1.0d) {
            return d > 0.0d && component1() <= f;
        }
        int i = copydefault + 47;
        toString = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static AFi1zSDK getRevenue(AFh1cSDK aFh1cSDK) {
        if (aFh1cSDK != null) {
            int i = toString + 89;
            copydefault = i % 128;
            if (i % 2 != 0) {
                AFh1aSDK aFh1aSDK = aFh1cSDK.getMediationNetwork;
                if (aFh1aSDK != null) {
                    return aFh1aSDK.AFAdRevenueData;
                }
            } else {
                AFh1aSDK aFh1aSDK2 = aFh1cSDK.getMediationNetwork;
                throw null;
            }
        }
        int i2 = copydefault + 77;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final boolean getRevenue() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 2123307937, -2123307935, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMonetizationNetwork(String str, String str2) {
        toString = (copydefault + 99) % 128;
        AFAdRevenueData("server_request", str, str2);
        int i = copydefault + 105;
        toString = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private boolean getMonetizationNetwork(String str) {
        copydefault = (toString + 85) % 128;
        if (AFk1zSDK.getRevenue(str)) {
            return true;
        }
        boolean equals = str.equals(this.component4.AFAdRevenueData().n_().versionName);
        int i = toString + 71;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return equals;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final void getMonetizationNetwork() {
        AFAdRevenueData(new Object[]{this}, -1717475168, 1717475171, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1lSDK
    public final synchronized void AFAdRevenueData() {
        if (!this.component1) {
            int i = (toString + 89) % 128;
            copydefault = i;
            if (!this.getMediationNetwork) {
                toString = (i + 99) % 128;
                return;
            }
        }
        this.component1 = false;
        this.getMediationNetwork = false;
        try {
            AFAdRevenueData("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.length() > 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void AFAdRevenueData(String str, String str2, String str3, String str4) {
        int i = toString + 113;
        copydefault = i % 128;
        try {
            if (i % 2 != 0) {
                if (str != null && str.length() > 0) {
                    int i2 = toString + 57;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Map<String, Object> map = this.AFAdRevenueData;
                    if (i3 == 0) {
                        map.put("app_id", str);
                        throw null;
                    }
                    map.put("app_id", str);
                }
                if (str2 != null) {
                    int i4 = toString + 41;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 41 / 0;
                        if (str2.length() > 0) {
                            this.AFAdRevenueData.put("app_version", str2);
                        }
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFAdRevenueData.put(AppsFlyerProperties.CHANNEL, str3);
                }
                if (str4 != null) {
                    toString = (copydefault + 51) % 128;
                    if (str4.length() > 0) {
                        this.AFAdRevenueData.put("preInstall", str4);
                        copydefault = (toString + 3) % 128;
                    }
                }
            } else {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        String message;
        int i4 = ~i3;
        int i5 = (((~((~i) | i2)) | (~(i2 | i4))) * 560) + ((~(i3 | (~i2) | i)) * (-560)) + ((~(i4 | i)) * (-560)) + (i2 * 561) + (i * (-559));
        if (i5 != 1) {
            if (i5 == 2) {
                return getMediationNetwork(objArr);
            }
            if (i5 != 3) {
                return getCurrencyIso4217Code(objArr);
            }
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            int i6 = copydefault + 29;
            toString = i6 % 128;
            int i7 = i6 % 2;
            aFd1kSDK.component2 = false;
            return null;
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        copydefault = (toString + 49) % 128;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            copydefault = (toString + 35) % 128;
            message = th.getMessage();
        } else {
            message = cause.getMessage();
        }
        aFd1kSDK2.AFAdRevenueData("exception", simpleName, getRevenue(message, cause == null ? th.getStackTrace() : cause.getStackTrace()));
        return null;
    }

    private synchronized void AFAdRevenueData(String str, AFf1kSDK aFf1kSDK, AFc1gSDK aFc1gSDK) {
        toString = (copydefault + 37) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.AFAdRevenueData.clear();
        if (string != null) {
            try {
                this.AFAdRevenueData.putAll(AFg1lSDK.getMediationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            getMonetizationNetwork(this.component4.AFAdRevenueData().getMonetizationNetwork(), (String) AFf1kSDK.getMonetizationNetwork(new Object[]{aFf1kSDK}, -211782084, 211782085, System.identityHashCode(aFf1kSDK)), aFc1gSDK.getCurrencyIso4217Code);
            StringBuilder sb = new StringBuilder("6.18.0.");
            sb.append(AFa1tSDK.getMonetizationNetwork);
            getRevenue(sb.toString(), this.component4.AFInAppEventParameterName().getMonetizationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1iSDK.getCurrencyIso4217Code(this.component4.AFAdRevenueData().getCurrencyIso4217Code));
            try {
                int i = this.component4.AFAdRevenueData().n_().versionCode;
                AFAdRevenueData(str, String.valueOf(i), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
            toString = (copydefault + 117) % 128;
        }
        this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0)));
        copydefault = (toString + 71) % 128;
    }

    private void AFAdRevenueData(boolean z) {
        copydefault = (toString + 23) % 128;
        this.component4.getMediationNetwork().getRevenue("participantInProxy", z);
        int i = copydefault + 29;
        toString = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
