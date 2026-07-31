package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class AFf1hSDK extends AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char afDebugLog = 18239;
    private static char afErrorLog = 62691;
    private static int afErrorLogForExcManagerOnly = 1;
    private static int afLogForce = 0;
    private static char afRDLog = 54648;
    private static char afWarnLog = 47612;
    private final AFd1nSDK afInfoLog;
    private final AFg1sSDK afVerboseLog;
    private final AFd1pSDK i;
    private final String v;

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final void AFInAppEventParameterName(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 107;
        afLogForce = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final void values(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 81;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AFf1hSDK(String str, AFd1mSDK aFd1mSDK) {
        super(new AFg1uSDK(aFd1mSDK.v().AFKeystoreWrapper), aFd1mSDK, str);
        this.i = aFd1mSDK.values();
        this.afInfoLog = aFd1mSDK.v();
        this.v = str;
        this.afVerboseLog = aFd1mSDK.unregisterClient();
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        int i = 2 % 2;
        int i2 = afLogForce + 51;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 != 0) {
            super.AFInAppEventType();
            ResponseNetwork responseNetwork = ((AFf1rSDK) this).d;
            if (responseNetwork == null || !responseNetwork.isSuccessful()) {
                return;
            }
            w();
            int i3 = afLogForce + 75;
            afErrorLogForExcManagerOnly = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
                return;
            }
            return;
        }
        super.AFInAppEventType();
        ResponseNetwork responseNetwork2 = ((AFf1rSDK) this).d;
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    protected final void AFKeystoreWrapper(AFa1rSDK aFa1rSDK) {
        int i = 2 % 2;
        int i2 = afLogForce + 11;
        afErrorLogForExcManagerOnly = i2 % 128;
        if (i2 % 2 != 0) {
            super.AFKeystoreWrapper(aFa1rSDK);
            Context context = this.afInfoLog.AFKeystoreWrapper;
            AFb1tSDK AFInAppEventType = AFb1tSDK.AFInAppEventType();
            if (context == null) {
                throw new IllegalStateException("Context is not provided, can't send register request");
            }
            if (AFInAppEventType.AFInAppEventParameterName()) {
                AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
                throw new IllegalStateException("CustomerUserId not set, register is not sent");
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                aFa1rSDK.valueOf("app_version_code", Integer.toString(packageInfo.versionCode));
                aFa1rSDK.valueOf("app_version_name", packageInfo.versionName);
                aFa1rSDK.valueOf("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                aFa1rSDK.valueOf("installDate", AFb1tSDK.valueOf(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while collecting application version info.", th);
            }
            this.afVerboseLog.AFKeystoreWrapper(aFa1rSDK.AFKeystoreWrapper());
            aFa1rSDK.AFKeystoreWrapper().remove("ivc");
            String AFKeystoreWrapper = AFb1tSDK.AFKeystoreWrapper();
            if (AFKeystoreWrapper != null) {
                aFa1rSDK.valueOf("appUserId", AFKeystoreWrapper);
                int i3 = afErrorLogForExcManagerOnly + 113;
                afLogForce = i3 % 128;
                int i4 = i3 % 2;
            }
            try {
                aFa1rSDK.valueOf("model", Build.MODEL);
                Object[] objArr = new Object[1];
                a("貁凧컳怂狉䣆", 5 - TextUtils.indexOf("", ""), objArr);
                aFa1rSDK.valueOf(((String) objArr[0]).intern(), Build.BRAND);
                int i5 = afLogForce + 79;
                afErrorLogForExcManagerOnly = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
            }
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                aFa1rSDK.valueOf(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            }
            AFa1bSDK AFInAppEventType2 = AFb1qSDK.AFInAppEventType(context.getContentResolver());
            if (AFInAppEventType2 != null) {
                aFa1rSDK.valueOf("amazon_aid", AFInAppEventType2.valueOf);
                aFa1rSDK.valueOf("amazon_aid_limit", String.valueOf(AFInAppEventType2.AFInAppEventType));
            }
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string != null) {
                aFa1rSDK.valueOf("advertiserId", string);
            }
            aFa1rSDK.valueOf("devkey", ((AFf1rSDK) this).unregisterClient.unregisterClient);
            aFa1rSDK.valueOf("uid", AFb1iSDK.AFKeystoreWrapper(this.afInfoLog, this.w));
            aFa1rSDK.valueOf("af_gcm_token", this.v);
            aFa1rSDK.valueOf("launch_counter", Integer.toString(this.w.AFKeystoreWrapper("appsFlyerCount", 0)));
            aFa1rSDK.valueOf("sdk", Integer.toString(Build.VERSION.SDK_INT));
            String AFInAppEventParameterName = this.i.AFInAppEventParameterName();
            if (AFInAppEventParameterName != null) {
                aFa1rSDK.valueOf(AppsFlyerProperties.CHANNEL, AFInAppEventParameterName);
                return;
            }
            return;
        }
        super.AFKeystoreWrapper(aFa1rSDK);
        Context context2 = this.afInfoLog.AFKeystoreWrapper;
        AFb1tSDK.AFInAppEventType();
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        int i = 2 % 2;
        int i2 = afLogForce;
        int i3 = i2 + 31;
        afErrorLogForExcManagerOnly = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        afErrorLogForExcManagerOnly = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private void w() {
        AFd1xSDK aFd1xSDK;
        boolean z;
        int i = 2 % 2;
        int i2 = afErrorLogForExcManagerOnly + 85;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            aFd1xSDK = this.w;
            z = false;
        } else {
            aFd1xSDK = this.w;
            z = true;
        }
        aFd1xSDK.AFInAppEventParameterName("sentRegisterRequestToAF", z);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFj1uSDK aFj1uSDK = new AFj1uSDK();
        char[] cArr = new char[charArray.length];
        aFj1uSDK.values = 0;
        char[] cArr2 = new char[2];
        while (aFj1uSDK.values < charArray.length) {
            cArr2[0] = charArray[aFj1uSDK.values];
            cArr2[1] = charArray[aFj1uSDK.values + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10;
                int i6 = i5 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (afErrorLog ^ (-7551638670892174108L))))) ^ ((c2 >>> 5) + ((char) (afWarnLog ^ (-7551638670892174108L))))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (afRDLog ^ (-7551638670892174108L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (afDebugLog ^ (-7551638670892174108L)))))));
                i3 -= 40503;
                i4++;
                int i8 = i5 + 27;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr[aFj1uSDK.values] = cArr2[0];
            cArr[aFj1uSDK.values + 1] = cArr2[1];
            aFj1uSDK.values += 2;
            int i10 = $10 + 49;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }
}
