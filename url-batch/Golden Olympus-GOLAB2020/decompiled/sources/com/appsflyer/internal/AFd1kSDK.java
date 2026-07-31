package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import com.ironsource.ge;
import io.appmetrica.analytics.BuildConfig;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1kSDK implements AFd1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long areAllFieldsValid = 0;
    private static char copy = 0;
    private static int equals = 1;
    private static final int getRevenue;
    private static int hashCode;
    private static int toString;
    private final AFc1dSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMonetizationNetwork = true;
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean component2 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMediationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getRevenue = 98166;
        int i4 = equals + 117;
        toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public AFd1kSDK(AFc1dSDK aFc1dSDK) {
        this.component1 = aFc1dSDK;
    }

    private void AFInAppEventParameterName() {
        toString = (equals + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.component1.component2().getMonetizationNetwork("participantInProxy");
        equals = (toString + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i4, char c4, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            int i5 = $11 + 31;
            $10 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != 0) {
            cArr2 = str2.toCharArray();
            $10 = ($11 + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c4);
        cArr6[2] = (char) (cArr6[2] + ((char) i4));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        aFk1jSDK.getMediationNetwork = 0;
        while (true) {
            int i6 = aFk1jSDK.getMediationNetwork;
            if (i6 >= length3) {
                objArr[0] = new String(cArr7);
                return;
            }
            int i7 = (i6 + 3) % 4;
            int i8 = cArr5[i6 % 4] * 32718;
            char c5 = cArr6[(i6 + 2) % 4];
            char c6 = (char) ((i8 + c5) % 65535);
            aFk1jSDK.AFAdRevenueData = c6;
            cArr6[i7] = (char) (((cArr5[i7] * 32718) + c5) / 65535);
            cArr5[i7] = c6;
            cArr7[i6] = (char) ((((cArr4[i6] ^ c6) ^ (areAllFieldsValid ^ (-866183138771165766L))) ^ ((int) (hashCode ^ (-866183138771165766L)))) ^ ((char) (copy ^ (-866183138771165766L))));
            aFk1jSDK.getMediationNetwork = i6 + 1;
        }
    }

    private synchronized void areAllFieldsValid() {
        int i4 = toString + 63;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (toString + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    private static String component1() {
        int i4 = toString;
        int i5 = i4 + 77;
        equals = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
        equals = (i4 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return "6.17.0";
    }

    private float component2() {
        equals = (toString + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        float nextFloat = this.component3.nextFloat();
        int i4 = equals + 119;
        toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return nextFloat;
    }

    static void component3() {
        areAllFieldsValid = -866183138771165766L;
        hashCode = 1193057722;
        copy = (char) 29794;
    }

    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        equals = (toString + 47) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.AFAdRevenueData.put("data", this.getCurrencyIso4217Code);
        equals();
        map = this.AFAdRevenueData;
        toString = (equals + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return map;
    }

    private boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1999031441, 1999031443, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void equals() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMediationNetwork = 0;
        toString = (equals + BuildConfig.API_LEVEL) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = (~(i7 | i10)) | i9 | (~(i8 | i10));
        int i12 = i4 | i5;
        int i13 = (i4 * 85) + (i5 * 85) + ((i11 | (~(i12 | i6))) * (-84));
        int i14 = i4 | (~(i6 | i8));
        int i15 = ~(i5 | i10);
        int i16 = i13 + ((i14 | i15) * (-84)) + (((~i12) | i15) * 84);
        if (i16 == 1) {
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            String str = (String) objArr[1];
            String[] strArr = (String[]) objArr[2];
            equals = (toString + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFd1kSDK.getCurrencyIso4217Code("public_api_call", str, strArr);
            toString = (equals + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        if (i16 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i16 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        boolean AFAdRevenueData = aFd1kSDK2.AFAdRevenueData(getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.getCurrencyIso4217Code), getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (!AFAdRevenueData) {
            aFd1kSDK2.getRevenue();
            aFd1kSDK2.getMediationNetwork();
        } else {
            equals = (toString + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFd1kSDK2.areAllFieldsValid();
        }
        equals = (toString + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return Boolean.valueOf(AFAdRevenueData);
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i4 = equals + 95;
        toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
            copy();
            throw null;
        }
        q_(str, packageManager, this.component1.registerClient(), this.component1.afInfoLog());
        Map<String, Object> copy2 = copy();
        int i5 = equals + 29;
        toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            return copy2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r3 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        getMediationNetwork(r5.component1.getRevenue().AFAdRevenueData(), r8.getRevenue(), r9.AFAdRevenueData);
        r8 = new java.lang.StringBuilder("6.17.0.");
        r8.append(com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork);
        getCurrencyIso4217Code(r8.toString(), r5.component1.registerClient().getMediationNetwork(), r1.getString("KSAppsFlyerId"), com.appsflyer.internal.AFb1iSDK.getRevenue(r5.component1.getRevenue().getMonetizationNetwork));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        r7 = r7.getPackageInfo(r6, 0).versionCode;
        getMonetizationNetwork(r6, java.lang.String.valueOf(r7), r1.getString(com.appsflyer.AppsFlyerProperties.CHANNEL), r1.getString("preInstallName"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r5.AFAdRevenueData.putAll(com.appsflyer.internal.AFg1lSDK.getMonetizationNetwork(new org.json.JSONObject(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        if (r3 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void q_(String str, PackageManager packageManager, AFf1gSDK aFf1gSDK, AFc1kSDK aFc1kSDK) {
        AppsFlyerProperties appsFlyerProperties;
        String string;
        try {
            int i4 = toString + 43;
            equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                appsFlyerProperties = AppsFlyerProperties.getInstance();
                string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
                int i5 = 38 / 0;
            } else {
                appsFlyerProperties = AppsFlyerProperties.getInstance();
                string = appsFlyerProperties.getString("remote_debug_static_data");
                this.AFAdRevenueData.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.AFAdRevenueData).toString());
        equals = (toString + 43) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
        this.AFAdRevenueData.put("launch_counter", String.valueOf(this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
    }

    private boolean registerClient() {
        int i4 = toString + 9;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i5 = i4 % 2;
        return this.component1.component2().getMediationNetwork("participantInProxy", false);
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void AFAdRevenueData() {
        toString = (equals + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.AFAdRevenueData.clear();
        this.getCurrencyIso4217Code.clear();
        this.getMediationNetwork = 0;
        int i4 = toString + 105;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean component4() {
        int i4 = equals;
        int i5 = i4 + InterfaceC1490j3.d.b.f16812d;
        toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
        boolean z4 = this.component4;
        toString = (i4 + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return z4;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i4 = toString + 17;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i5 = toString + InterfaceC1490j3.d.b.f16810b;
        equals = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(Throwable th) {
        StackTraceElement[] stackTrace;
        equals = (toString + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            int i4 = equals + 73;
            toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                th.getStackTrace();
                throw null;
            }
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (toString + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        getCurrencyIso4217Code("exception", simpleName, getRevenue(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, int i4, String str2) {
        equals = (toString + 29) % UserVerificationMethods.USER_VERIFY_PATTERN;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i4), str2);
        int i5 = equals + 121;
        toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void o_(String str, PackageManager packageManager) {
        int i4 = equals + 117;
        toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i4 % 2 != 0) {
                this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
                throw null;
            }
            final AFd1mSDK revenue = this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
            if (revenue == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            this.component1.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1mSDK.this.getMonetizationNetwork();
                }
            });
            int i5 = toString + 19;
            equals = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code() {
        int i4 = toString + 23;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        equals = i5;
        this.component2 = i4 % 2 == 0;
        int i6 = i5 + 63;
        toString = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getRevenue() {
        equals = (toString + 125) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.getMonetizationNetwork = false;
        AFAdRevenueData();
        equals();
        toString = (equals + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    private synchronized boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        boolean z4 = false;
        if (aFi1xSDK == null) {
            AFInAppEventParameterName();
            return false;
        }
        if (!aFi1xSDK.getCurrencyIso4217Code()) {
            int i4 = toString + 77;
            equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) <= aFi1xSDK.getMonetizationNetwork) {
            if (!getRevenue(aFi1xSDK, aFi1xSDK2)) {
                return false;
            }
            if (!AFAdRevenueData(aFi1xSDK.AFAdRevenueData)) {
                int i5 = equals;
                int i6 = i5 + 113;
                toString = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i6 % 2 == 0) {
                    z4 = true;
                }
                boolean z5 = !z4;
                toString = (i5 + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return z5;
            }
            if (getCurrencyIso4217Code(aFi1xSDK.component2)) {
                return true;
            }
            int i7 = toString + 113;
            equals = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            return i7 % 2 == 0;
        }
        toString = (equals + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return false;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        if (aFd1kSDK.component2) {
            int i4 = equals;
            toString = (i4 + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (aFd1kSDK.getMonetizationNetwork || aFd1kSDK.component4) {
                int i5 = i4 + 57;
                toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i5 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r5.length() > 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r6.length() > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0025, code lost:
    
        if (r4.length() > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        try {
            this.AFAdRevenueData.put(HianalyticsBaseData.SDK_VERSION, str);
            if (str2 != null) {
                int i4 = toString + 61;
                equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 == 0) {
                    int i5 = 47 / 0;
                    if (str2.length() > 0) {
                        this.AFAdRevenueData.put("devkey", str2);
                    }
                }
            }
            if (str3 != null) {
                int i6 = toString + 19;
                equals = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i6 % 2 == 0) {
                    int i7 = 74 / 0;
                    if (str3.length() > 0) {
                        this.AFAdRevenueData.put("originalAppsFlyerId", str3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (str4 != null) {
            int i8 = toString + 61;
            equals = i8 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i8 % 2 == 0) {
                int i9 = 79 / 0;
                if (str4.length() > 0) {
                    this.AFAdRevenueData.put("uid", str4);
                }
            }
        }
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i4 = toString;
        equals = (i4 + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (stackTraceElementArr != null) {
            String[] strArr = new String[stackTraceElementArr.length + 1];
            strArr[0] = str;
            for (int i5 = 1; i5 < stackTraceElementArr.length; i5++) {
                strArr[i5] = stackTraceElementArr[i5].toString();
            }
            return strArr;
        }
        int i6 = i4 + 91;
        equals = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            return new String[]{str};
        }
        String[] strArr2 = new String[0];
        strArr2[1] = str;
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i4 = toString + 53;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        } else {
            getCurrencyIso4217Code(null, str, str2);
        }
        int i5 = equals + 45;
        toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        try {
            int i4 = toString;
            int i5 = i4 + 71;
            equals = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            try {
                if (i5 % 2 != 0) {
                    if (str != null) {
                        equals = (i4 + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (str.length() > 0) {
                            int i6 = toString + InterfaceC1490j3.d.b.f16815g;
                            equals = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i6 % 2 == 0) {
                                this.AFAdRevenueData.put("app_id", str);
                                int i7 = 52 / 0;
                            } else {
                                this.AFAdRevenueData.put("app_id", str);
                            }
                        }
                    }
                    if (str2 != null && str2.length() > 0) {
                        this.AFAdRevenueData.put("app_version", str2);
                    }
                    if (str3 != null && str3.length() > 0) {
                        this.AFAdRevenueData.put(AppsFlyerProperties.CHANNEL, str3);
                        toString = (equals + 55) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    if (str4 != null && str4.length() > 0) {
                        this.AFAdRevenueData.put("preInstall", str4);
                    }
                } else {
                    throw null;
                }
            } catch (Throwable unused) {
            }
        } finally {
        }
    }

    private boolean getRevenue(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        equals = (toString + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            equals = (toString + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return registerClient();
        }
        boolean monetizationNetwork = getMonetizationNetwork(aFi1xSDK.getRevenue);
        getMediationNetwork(new Object[]{this, Boolean.valueOf(monetizationNetwork)}, 124011145, -124011142, System.identityHashCode(this));
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getMediationNetwork() {
        int i4 = (toString + 35) % UserVerificationMethods.USER_VERIFY_PATTERN;
        equals = i4;
        if (!this.component4) {
            int i5 = i4 + 23;
            toString = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                if (!this.getMonetizationNetwork) {
                    return;
                }
            } else {
                throw null;
            }
        }
        this.component4 = false;
        this.getMonetizationNetwork = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String obj;
        if (copydefault()) {
            equals = (toString + 75) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (this.getMediationNetwork < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.17.0 [");
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
                        sb2.append("/AppsFlyer_6.17.0 ");
                        sb2.append(join);
                        obj = sb2.toString();
                        toString = (equals + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    int length = this.getMediationNetwork + (obj.length() << 1);
                    int i4 = getRevenue;
                    boolean z4 = false;
                    if (length > i4) {
                        obj = obj.substring(0, (i4 - this.getMediationNetwork) / 2);
                        z4 = true;
                    }
                    this.getCurrencyIso4217Code.add(obj);
                    this.getMediationNetwork += obj.length() << 1;
                    if (z4) {
                        int i5 = toString + 47;
                        equals = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i5 % 2 == 0) {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 7164;
                        } else {
                            this.getCurrencyIso4217Code.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            this.getMediationNetwork += 138;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private boolean AFAdRevenueData(String str) {
        int i4 = equals + 125;
        toString = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
            if (AFk1ySDK.getCurrencyIso4217Code(str)) {
                return true;
            }
        } else if (AFk1ySDK.getCurrencyIso4217Code(str)) {
            return true;
        }
        Context context = this.component1.getRevenue().getRevenue.getMonetizationNetwork;
        boolean equals2 = str.equals(AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
        int i6 = toString + 93;
        equals = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 == 0) {
            int i7 = 13 / 0;
        }
        return equals2;
    }

    private boolean getMonetizationNetwork(float f4) {
        double d4 = f4;
        if (d4 >= 1.0d) {
            return true;
        }
        if (d4 <= 0.0d) {
            equals = (toString + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        if (component2() > f4) {
            return false;
        }
        toString = (equals + 67) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return true;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.AFAdRevenueData;
            Object[] objArr = new Object[1];
            a(428417108 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (45453 - TextUtils.indexOf((CharSequence) "", '0', 0)), "嗊褠踙\ue7b1", "ᒸي醼뇗ൎ", "\u0000\u0000\u0000\u0000", objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.AFAdRevenueData.put("model", Build.MODEL);
            this.AFAdRevenueData.put(ge.f16399G, b9.f15266d);
            this.AFAdRevenueData.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                equals = (toString + InterfaceC1490j3.d.b.f16817i) % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (str.length() > 0) {
                    this.AFAdRevenueData.put("advertiserId", str);
                }
            }
            if (str2 != null) {
                int i4 = toString + 27;
                equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    if (str2.length() > 0) {
                        this.AFAdRevenueData.put("imei", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.AFAdRevenueData.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i4 = toString + 41;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", booleanValue);
            int i5 = 89 / 0;
        } else {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", booleanValue);
        }
        toString = (equals + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    private static boolean getCurrencyIso4217Code(String str) {
        toString = (equals + 65) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (!AFk1ySDK.getCurrencyIso4217Code(str)) {
            new AFd1sSDK();
            return AFd1sSDK.getMediationNetwork(component1(), str);
        }
        int i4 = toString + 97;
        equals = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        return i4 % 2 != 0;
    }

    private void getMonetizationNetwork(boolean z4) {
        getMediationNetwork(new Object[]{this, Boolean.valueOf(z4)}, 124011145, -124011142, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1790300573, 1790300573, System.identityHashCode(this))).booleanValue();
    }

    private static AFi1xSDK getCurrencyIso4217Code(AFi1wSDK aFi1wSDK) {
        if (aFi1wSDK != null) {
            int i4 = equals + 49;
            int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            toString = i5;
            if (i4 % 2 == 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                if (aFh1cSDK != null) {
                    AFi1xSDK aFi1xSDK = aFh1cSDK.AFAdRevenueData;
                    equals = (i5 + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    return aFi1xSDK;
                }
            } else {
                AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str, String... strArr) {
        getMediationNetwork(new Object[]{this, str, strArr}, 595413115, -595413114, System.identityHashCode(this));
    }
}
