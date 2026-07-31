package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.ge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1tSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int AFLogger;
    private final AFg1qSDK AFInAppEventType;
    private final AFc1pSDK copydefault;
    private final String equals;
    private final AFc1iSDK hashCode;
    private static char[] AFInAppEventParameterName = {10790, 10789, 10800, 10806, 10786, 10791, 10805, 10788, 10810};
    private static char registerClient = 8141;

    public AFf1tSDK(String str, AFc1dSDK aFc1dSDK) {
        super(new AFg1wSDK(), aFc1dSDK, str);
        this.copydefault = aFc1dSDK.getRevenue();
        this.hashCode = aFc1dSDK.AFInAppEventType();
        this.equals = str;
        this.AFInAppEventType = aFc1dSDK.component3();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i4, int i5, int i6) {
        return getRevenue(objArr);
    }

    private static void a(byte b4, String str, int i4, Object[] objArr) {
        int i5;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c4 = (char) ((-374623853307093042L) ^ registerClient);
        char[] cArr3 = new char[i4];
        if (i4 % 2 != 0) {
            int i7 = $10 + 67;
            $11 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 == 0) {
                i5 = i4 + 123;
                cArr3[i5] = (char) (charArray[i5] - b4);
            } else {
                i5 = i4 - 1;
                cArr3[i5] = (char) (charArray[i5] - b4);
            }
        } else {
            i5 = i4;
        }
        if (i5 > 1) {
            aFk1mSDK.AFAdRevenueData = 0;
            $11 = ($10 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            while (true) {
                int i8 = aFk1mSDK.AFAdRevenueData;
                if (i8 >= i5) {
                    break;
                }
                char c5 = charArray[i8];
                aFk1mSDK.getMonetizationNetwork = c5;
                char c6 = charArray[i8 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c6;
                if (c5 == c6) {
                    cArr3[i8] = (char) (c5 - b4);
                    cArr3[i8 + 1] = (char) (c6 - b4);
                } else {
                    int i9 = c5 / c4;
                    aFk1mSDK.getMediationNetwork = i9;
                    int i10 = c5 % c4;
                    aFk1mSDK.component1 = i10;
                    int i11 = c6 / c4;
                    aFk1mSDK.getRevenue = i11;
                    int i12 = c6 % c4;
                    aFk1mSDK.component2 = i12;
                    if (i10 == i12) {
                        $11 = ($10 + 83) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        int i13 = ((i9 + c4) - 1) % c4;
                        aFk1mSDK.getMediationNetwork = i13;
                        int i14 = ((i11 + c4) - 1) % c4;
                        aFk1mSDK.getRevenue = i14;
                        cArr3[i8] = cArr[(i13 * c4) + i10];
                        cArr3[i8 + 1] = cArr[(i14 * c4) + i12];
                    } else if (i9 == i11) {
                        int i15 = ((i10 + c4) - 1) % c4;
                        aFk1mSDK.component1 = i15;
                        int i16 = ((i12 + c4) - 1) % c4;
                        aFk1mSDK.component2 = i16;
                        cArr3[i8] = cArr[(i9 * c4) + i15];
                        cArr3[i8 + 1] = cArr[(i11 * c4) + i16];
                        $11 = ($10 + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else {
                        cArr3[i8] = cArr[(i9 * c4) + i12];
                        cArr3[i8 + 1] = cArr[(i11 * c4) + i10];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i8 + 2;
            }
        }
        $10 = ($11 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        int i17 = 0;
        while (i17 < i4) {
            int i18 = $11 + 67;
            $10 = i18 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 % 2 != 0) {
                cArr3[i17] = (char) (cArr3[i17] ^ 31812);
                i17 += 84;
            } else {
                cArr3[i17] = (char) (cArr3[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void copy() {
        AFc1qSDK aFc1qSDK;
        boolean z4;
        int i4 = AFLogger + InterfaceC1490j3.d.b.f16810b;
        AFKeystoreWrapper = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            aFc1qSDK = this.copy;
            z4 = false;
        } else {
            aFc1qSDK = this.copy;
            z4 = true;
        }
        aFc1qSDK.getCurrencyIso4217Code("sentRegisterRequestToAF", z4);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFLogger = (AFKeystoreWrapper + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void component3(AFh1rSDK aFh1rSDK) {
        int i4 = AFKeystoreWrapper + InterfaceC1490j3.d.b.f16817i;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            this.copydefault.AFAdRevenueData();
            throw null;
        }
        String AFAdRevenueData = this.copydefault.AFAdRevenueData();
        if (AFAdRevenueData != null) {
            AFLogger = (AFKeystoreWrapper + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFh1rSDK.getMediationNetwork("advertiserId", AFAdRevenueData);
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    protected final boolean copydefault() {
        int i4 = AFKeystoreWrapper + 95;
        int i5 = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger = i5;
        boolean z4 = !(i4 % 2 == 0);
        int i6 = i5 + 73;
        AFKeystoreWrapper = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i6 % 2 != 0) {
            return z4;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        AFLogger = (AFKeystoreWrapper + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        AFKeystoreWrapper = (AFLogger + InterfaceC1490j3.d.b.f16812d) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        int i4 = AFLogger + 21;
        AFKeystoreWrapper = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork != null) {
            AFKeystoreWrapper = (AFLogger + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (responseNetwork.isSuccessful()) {
                int i4 = AFLogger + 117;
                AFKeystoreWrapper = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i4 % 2 != 0) {
                    copy();
                } else {
                    copy();
                    throw null;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        int i4 = AFKeystoreWrapper + 57;
        AFLogger = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            super.AFAdRevenueData(aFh1rSDK);
            Context context = this.hashCode.getMonetizationNetwork;
            throw null;
        }
        super.AFAdRevenueData(aFh1rSDK);
        Context context2 = this.hashCode.getMonetizationNetwork;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (aFa1tSDK.getMediationNetwork()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFh1rSDK.getMediationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1rSDK.getMediationNetwork(CommonUrlParts.APP_VERSION, packageInfo.versionName);
            aFh1rSDK.getMediationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1rSDK.getMediationNetwork("installDate", AFa1tSDK.getRevenue(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            AFKeystoreWrapper = (AFLogger + 37) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFInAppEventType.AFAdRevenueData(aFh1rSDK.AFAdRevenueData);
        aFh1rSDK.AFAdRevenueData.remove("ivc");
        String revenue = AFa1tSDK.getRevenue();
        if (revenue != null) {
            aFh1rSDK.getMediationNetwork("appUserId", revenue);
        }
        try {
            aFh1rSDK.getMediationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a((byte) (124 - TextUtils.lastIndexOf("", '0', 0)), "\u0006\u0003\u0007\u0006㙻", 5 - TextUtils.indexOf("", "", 0), objArr);
            aFh1rSDK.getMediationNetwork(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i5 = AFKeystoreWrapper + 75;
            AFLogger = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 != 0) {
                aFh1rSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.ironsource.mediationsdk.metadata.a.f17681g);
                int i6 = 86 / 0;
            } else {
                aFh1rSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, com.ironsource.mediationsdk.metadata.a.f17681g);
            }
        }
        AFb1mSDK k_ = AFb1jSDK.k_(context2.getContentResolver());
        if (k_ != null) {
            int i7 = AFLogger + 113;
            AFKeystoreWrapper = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i7 % 2 == 0) {
                aFh1rSDK.getMediationNetwork("amazon_aid", k_.getMonetizationNetwork);
                aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(k_.getMediationNetwork));
                throw null;
            }
            aFh1rSDK.getMediationNetwork("amazon_aid", k_.getMonetizationNetwork);
            aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(k_.getMediationNetwork));
        }
        aFh1rSDK.getMediationNetwork("devkey", ((AFe1dSDK) this).component3.getMediationNetwork());
        aFh1rSDK.getMediationNetwork("uid", AFb1iSDK.getRevenue(this.copydefault.getMonetizationNetwork));
        aFh1rSDK.getMediationNetwork("af_gcm_token", this.equals);
        aFh1rSDK.getMediationNetwork("launch_counter", Integer.toString(this.copy.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1rSDK.getMediationNetwork(ge.f16386A1, Integer.toString(Build.VERSION.SDK_INT));
        String component2 = this.copydefault.component2();
        if (component2 != null) {
            AFKeystoreWrapper = (AFLogger + 19) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFh1rSDK.getMediationNetwork(AppsFlyerProperties.CHANNEL, component2);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i4 = AFLogger + 53;
        AFKeystoreWrapper = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getRevenue(AFh1rSDK aFh1rSDK) {
        AFAdRevenueData(new Object[]{this, aFh1rSDK}, 2011239149, -2011239149, System.identityHashCode(this));
    }
}
