package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;

/* loaded from: classes.dex */
public final class AFf1sSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventType = 0;
    private static long AFKeystoreWrapper = -7016867683534703567L;
    private static int AFLogger = 1;
    private final AFc1fSDK copy;
    private final AFg1vSDK copydefault;
    private final String hashCode;
    private final AFc1kSDK toString;

    public AFf1sSDK(String str, AFd1zSDK aFd1zSDK) {
        super(new AFf1aSDK(), aFd1zSDK, str);
        this.toString = aFd1zSDK.AFAdRevenueData();
        this.copy = aFd1zSDK.registerClient();
        this.hashCode = str;
        this.copydefault = aFd1zSDK.areAllFieldsValid();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i2, int i5, int i7) {
        int i8 = ~((~i2) | (~i5));
        int i9 = ~i7;
        int i10 = ((i8 | (~(i9 | i2 | i5))) * (-828)) + (i5 * 829) + (i2 * 829);
        int i11 = i2 | i5;
        if (((~i11) * 828) + ((i11 | i9) * (-828)) + i10 == 1) {
            return getMediationNetwork(objArr);
        }
        AFf1sSDK aFf1sSDK = (AFf1sSDK) objArr[0];
        int i12 = AFInAppEventType + 9;
        AFLogger = i12 % 128;
        int i13 = i12 % 2;
        ((AFf1rSDK) aFf1sSDK).component2.getRevenue("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFInAppEventType = (AFLogger + 5) % 128;
        return null;
    }

    private static void a(String str, int i2, Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        aFk1qSDK.getMonetizationNetwork = i2;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i5 = aFk1qSDK.getMediationNetwork;
            if (i5 >= cArr2.length) {
                break;
            }
            $11 = ($10 + 45) % 128;
            jArr[i5] = (cArr2[i5] ^ (i5 * aFk1qSDK.getMonetizationNetwork)) ^ (AFKeystoreWrapper ^ 4058599813193289363L);
            aFk1qSDK.getMediationNetwork = i5 + 1;
        }
        char[] cArr3 = new char[length];
        aFk1qSDK.getMediationNetwork = 0;
        while (true) {
            int i7 = aFk1qSDK.getMediationNetwork;
            if (i7 >= cArr2.length) {
                break;
            }
            $10 = ($11 + 1) % 128;
            cArr3[i7] = (char) jArr[i7];
            aFk1qSDK.getMediationNetwork = i7 + 1;
        }
        String str2 = new String(cArr3);
        int i8 = $11 + 7;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private void copydefault() {
        AFAdRevenueData(new Object[]{this}, 2011239149, -2011239149, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1sSDK aFf1sSDK = (AFf1sSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        int i2 = AFLogger + 13;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            ApplicationInfo applicationInfo = aFf1sSDK.toString.n_().applicationInfo;
            throw null;
        }
        ApplicationInfo applicationInfo2 = aFf1sSDK.toString.n_().applicationInfo;
        if (applicationInfo2 == null) {
            AFInAppEventType = (AFLogger + 15) % 128;
            return "";
        }
        String charSequence = packageManager.getApplicationLabel(applicationInfo2).toString();
        AFInAppEventType = (AFLogger + 59) % 128;
        return charSequence;
    }

    private String s_(PackageManager packageManager) {
        return (String) AFAdRevenueData(new Object[]{this, packageManager}, -1805871763, 1805871764, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void component3(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 31) % 128;
        String monetizationNetwork = this.toString.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            int i2 = AFInAppEventType + 91;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                aFh1sSDK.getMonetizationNetwork("advertiserId", monetizationNetwork);
                throw null;
            }
            aFh1sSDK.getMonetizationNetwork("advertiserId", monetizationNetwork);
        }
        AFLogger = (AFInAppEventType + 29) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        int i2 = (AFInAppEventType + 7) % 128;
        AFLogger = i2;
        int i5 = i2 + 85;
        AFInAppEventType = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        AFLogger = (AFInAppEventType + 115) % 128;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        AFLogger = (AFInAppEventType + 61) % 128;
        super.getMonetizationNetwork();
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            AFInAppEventType = (AFLogger + 97) % 128;
            if (responseNetwork.isSuccessful()) {
                AFLogger = (AFInAppEventType + 47) % 128;
                AFAdRevenueData(new Object[]{this}, 2011239149, -2011239149, System.identityHashCode(this));
            }
        }
        AFInAppEventType = (AFLogger + 95) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getRevenue(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 19) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x016c, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0178, code lost:
    
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r9.getMonetizationNetwork("app_version_code", java.lang.Integer.toString(r8.toString.n_().versionCode));
        r9.getMonetizationNetwork("app_version_name", r8.toString.n_().versionName);
        r9.getMonetizationNetwork("app_name", (java.lang.String) AFAdRevenueData(new java.lang.Object[]{r8, r0.getPackageManager()}, -1805871763, 1805871764, java.lang.System.identityHashCode(r8)));
        r9.getMonetizationNetwork("installDate", com.appsflyer.internal.AFa1tSDK.getCurrencyIso4217Code(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r8.toString.n_().firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0180, code lost:
    
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r2.getCurrencyIso4217Code() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1rSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        Context context;
        AFa1tSDK mediationNetwork;
        AFb1mSDK l_;
        String component1;
        int i2 = AFLogger + 117;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 != 0) {
            super.AFAdRevenueData(aFh1sSDK);
            context = this.copy.getCurrencyIso4217Code;
            mediationNetwork = AFa1tSDK.getMediationNetwork();
            int i5 = 61 / 0;
        } else {
            super.AFAdRevenueData(aFh1sSDK);
            context = this.copy.getCurrencyIso4217Code;
            mediationNetwork = AFa1tSDK.getMediationNetwork();
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            aFh1sSDK.getMonetizationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        l_ = AFb1jSDK.l_(context.getContentResolver());
        if (l_ != null) {
            aFh1sSDK.getMonetizationNetwork("amazon_aid", l_.getRevenue);
            aFh1sSDK.getMonetizationNetwork("amazon_aid_limit", String.valueOf(l_.getMonetizationNetwork));
            AFInAppEventType = (AFLogger + 59) % 128;
        }
        aFh1sSDK.getMonetizationNetwork("devkey", ((AFe1bSDK) this).component1.getMonetizationNetwork());
        aFh1sSDK.getMonetizationNetwork("uid", AFb1iSDK.getCurrencyIso4217Code(this.toString.getCurrencyIso4217Code));
        aFh1sSDK.getMonetizationNetwork("af_gcm_token", this.hashCode);
        aFh1sSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1rSDK) this).component2.getCurrencyIso4217Code("appsFlyerCount", 0)));
        aFh1sSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        component1 = this.toString.component1();
        if (component1 == null) {
            AFLogger = (AFInAppEventType + 33) % 128;
            aFh1sSDK.getMonetizationNetwork(AppsFlyerProperties.CHANNEL, component1);
            return;
        }
        return;
        this.copydefault.getCurrencyIso4217Code(aFh1sSDK.AFAdRevenueData);
        aFh1sSDK.AFAdRevenueData.remove("ivc");
        String AFAdRevenueData = AFa1tSDK.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            int i7 = AFLogger + 55;
            AFInAppEventType = i7 % 128;
            if (i7 % 2 != 0) {
                aFh1sSDK.getMonetizationNetwork("appUserId", AFAdRevenueData);
                int i8 = 94 / 0;
            } else {
                aFh1sSDK.getMonetizationNetwork("appUserId", AFAdRevenueData);
            }
        }
        try {
            aFh1sSDK.getMonetizationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a("뫀矡₡\udd5f踂", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 52529, objArr);
            aFh1sSDK.getMonetizationNetwork(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
        }
        l_ = AFb1jSDK.l_(context.getContentResolver());
        if (l_ != null) {
        }
        aFh1sSDK.getMonetizationNetwork("devkey", ((AFe1bSDK) this).component1.getMonetizationNetwork());
        aFh1sSDK.getMonetizationNetwork("uid", AFb1iSDK.getCurrencyIso4217Code(this.toString.getCurrencyIso4217Code));
        aFh1sSDK.getMonetizationNetwork("af_gcm_token", this.hashCode);
        aFh1sSDK.getMonetizationNetwork("launch_counter", Integer.toString(((AFf1rSDK) this).component2.getCurrencyIso4217Code("appsFlyerCount", 0)));
        aFh1sSDK.getMonetizationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        component1 = this.toString.component1();
        if (component1 == null) {
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        AFInAppEventType = (AFLogger + 125) % 128;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        AFLogger = (AFInAppEventType + 7) % 128;
    }
}
