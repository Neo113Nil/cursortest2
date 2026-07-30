package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFd1gSDK extends AFd1eSDK {
    private static long AppsFlyer2dXConversionCallback = 6533378919008962864L;
    private static int init = 1;
    private static int onInstallConversionFailureNative;
    private final String AFVersionDeclaration;
    private final AFe1tSDK afErrorLogForExcManagerOnly;
    private final AFb1bSDK afWarnLog;
    private final AFb1cSDK getLevel;

    public AFd1gSDK(String str, AFc1zSDK aFc1zSDK) {
        super(new AFe1qSDK(aFc1zSDK.onAppOpenAttributionNative().AFInAppEventParameterName), aFc1zSDK, str);
        this.getLevel = aFc1zSDK.AFInAppEventParameterName();
        this.afWarnLog = aFc1zSDK.onAppOpenAttributionNative();
        this.AFVersionDeclaration = str;
        this.afErrorLogForExcManagerOnly = aFc1zSDK.afRDLog();
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        int i = 2 % 2;
        super.valueOf();
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork != null) {
            int i2 = init + 45;
            onInstallConversionFailureNative = i2 % 128;
            int i3 = i2 % 2;
            if (responseNetwork.isSuccessful()) {
                int i4 = onInstallConversionFailureNative + 121;
                init = i4 % 128;
                int i5 = i4 % 2;
                AFLogger$LogLevel();
                if (i5 == 0) {
                    int i6 = 99 / 0;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    protected final void values(AFa1qSDK aFa1qSDK) {
        int i = 2 % 2;
        int i2 = onInstallConversionFailureNative + 27;
        init = i2 % 128;
        if (i2 % 2 == 0) {
            super.values(aFa1qSDK);
            Context context = this.afWarnLog.AFInAppEventParameterName;
            AFa1dSDK.valueOf();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        super.values(aFa1qSDK);
        Context context2 = this.afWarnLog.AFInAppEventParameterName;
        AFa1dSDK valueOf = AFa1dSDK.valueOf();
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        if (valueOf.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFa1qSDK.AFInAppEventParameterName("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFInAppEventParameterName("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFInAppEventParameterName("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFa1qSDK.AFInAppEventParameterName("installDate", AFa1dSDK.values(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.afErrorLogForExcManagerOnly.valueOf(aFa1qSDK.AFInAppEventType());
        String values = AFa1dSDK.values();
        if (values != null) {
            aFa1qSDK.AFInAppEventParameterName("appUserId", values);
        }
        try {
            aFa1qSDK.AFInAppEventParameterName("model", Build.MODEL);
            Object[] objArr = new Object[1];
            AFInAppEventType("祪龊叕刣礈雈䇔䧝巎", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
            aFa1qSDK.AFInAppEventParameterName(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i3 = onInstallConversionFailureNative + 39;
            init = i3 % 128;
            int i4 = i3 % 2;
            aFa1qSDK.AFInAppEventParameterName(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            int i5 = init + 119;
            onInstallConversionFailureNative = i5 % 128;
            int i6 = i5 % 2;
        }
        AFc1uSDK.AFa1wSDK values2 = AFa1bSDK.values(context2.getContentResolver());
        if (values2 != null) {
            int i7 = init + 91;
            onInstallConversionFailureNative = i7 % 128;
            if (i7 % 2 != 0) {
                aFa1qSDK.AFInAppEventParameterName("amazon_aid", values2.AFInAppEventParameterName);
                aFa1qSDK.AFInAppEventParameterName("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
                int i8 = 80 / 0;
            } else {
                aFa1qSDK.AFInAppEventParameterName("amazon_aid", values2.AFInAppEventParameterName);
                aFa1qSDK.AFInAppEventParameterName("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
            }
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            aFa1qSDK.AFInAppEventParameterName("advertiserId", string);
        }
        aFa1qSDK.AFInAppEventParameterName("devkey", ((AFd1nSDK) this).afRDLog.AFInAppEventType);
        aFa1qSDK.AFInAppEventParameterName("uid", AFa1aSDK.AFInAppEventParameterName(this.afWarnLog, this.AFLogger$LogLevel));
        aFa1qSDK.AFInAppEventParameterName("af_gcm_token", this.AFVersionDeclaration);
        aFa1qSDK.AFInAppEventParameterName("launch_counter", Integer.toString(this.AFLogger$LogLevel.AFInAppEventType("appsFlyerCount", 0)));
        aFa1qSDK.AFInAppEventParameterName("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String AFKeystoreWrapper = this.getLevel.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            aFa1qSDK.AFInAppEventParameterName(AppsFlyerProperties.CHANNEL, AFKeystoreWrapper);
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK, com.appsflyer.internal.AFd1nSDK
    protected final boolean afRDLog() {
        int i = 2 % 2;
        int i2 = onInstallConversionFailureNative + 61;
        int i3 = i2 % 128;
        init = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        onInstallConversionFailureNative = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return false;
    }

    private void AFLogger$LogLevel() {
        int i = 2 % 2;
        int i2 = init + 115;
        onInstallConversionFailureNative = i2 % 128;
        int i3 = i2 % 2;
        this.AFLogger$LogLevel.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i4 = init + 11;
        onInstallConversionFailureNative = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static void AFInAppEventType(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1nSDK.AFInAppEventParameterName) {
            char[] valueOf = AFg1nSDK.valueOf(AppsFlyer2dXConversionCallback, cArr2, i);
            AFg1nSDK.AFKeystoreWrapper = 4;
            while (AFg1nSDK.AFKeystoreWrapper < valueOf.length) {
                AFg1nSDK.AFInAppEventType = AFg1nSDK.AFKeystoreWrapper - 4;
                valueOf[AFg1nSDK.AFKeystoreWrapper] = (char) ((valueOf[AFg1nSDK.AFKeystoreWrapper] ^ valueOf[AFg1nSDK.AFKeystoreWrapper % 4]) ^ (AFg1nSDK.AFInAppEventType * AppsFlyer2dXConversionCallback));
                AFg1nSDK.AFKeystoreWrapper++;
            }
            str2 = new String(valueOf, 4, valueOf.length - 4);
        }
        objArr[0] = str2;
    }
}
