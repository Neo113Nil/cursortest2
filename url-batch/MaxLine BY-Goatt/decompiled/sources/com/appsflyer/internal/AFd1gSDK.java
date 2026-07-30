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
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import defpackage.lh;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
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

    private static void AFInAppEventType(String str, int i, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1nSDK.AFInAppEventParameterName) {
            try {
                char[] valueOf = AFg1nSDK.valueOf(AppsFlyer2dXConversionCallback, cArr2, i);
                AFg1nSDK.AFKeystoreWrapper = 4;
                while (true) {
                    int i2 = AFg1nSDK.AFKeystoreWrapper;
                    if (i2 < valueOf.length) {
                        AFg1nSDK.AFInAppEventType = i2 - 4;
                        valueOf[i2] = (char) ((valueOf[i2] ^ valueOf[i2 % 4]) ^ (r2 * AppsFlyer2dXConversionCallback));
                        AFg1nSDK.AFKeystoreWrapper = i2 + 1;
                    } else {
                        str2 = new String(valueOf, 4, valueOf.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    private void AFLogger$LogLevel() {
        onInstallConversionFailureNative = (init + 115) % 128;
        this.AFLogger$LogLevel.valueOf("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i = init + 11;
        onInstallConversionFailureNative = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK, com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        int i = (onInstallConversionFailureNative + 61) % 128;
        init = i;
        int i2 = i + 111;
        onInstallConversionFailureNative = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        super.valueOf();
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork != null) {
            onInstallConversionFailureNative = (init + 45) % 128;
            if (responseNetwork.isSuccessful()) {
                int i = onInstallConversionFailureNative + 121;
                init = i % 128;
                int i2 = i % 2;
                AFLogger$LogLevel();
                if (i2 == 0) {
                    int i3 = 99 / 0;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        int i = onInstallConversionFailureNative + 27;
        init = i % 128;
        if (i % 2 == 0) {
            super.values(aFa1qSDK);
            Context context = this.afWarnLog.AFInAppEventParameterName;
            AFa1dSDK.valueOf();
            throw null;
        }
        super.values(aFa1qSDK);
        Context context2 = this.afWarnLog.AFInAppEventParameterName;
        AFa1dSDK valueOf = AFa1dSDK.valueOf();
        if (context2 == null) {
            lh.g("Context is not provided, can't send register request");
            return;
        }
        if (valueOf.AFKeystoreWrapper()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            lh.g("CustomerUserId not set, register is not sent");
            return;
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFa1qSDK.AFInAppEventParameterName("app_version_code", Integer.toString(packageInfo.versionCode));
            aFa1qSDK.AFInAppEventParameterName("app_version_name", packageInfo.versionName);
            aFa1qSDK.AFInAppEventParameterName(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
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
            aFa1qSDK.AFInAppEventParameterName(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
            Object[] objArr = new Object[1];
            AFInAppEventType("祪龊叕刣礈雈䇔䧝巎", ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
            aFa1qSDK.AFInAppEventParameterName(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            init = (onInstallConversionFailureNative + 39) % 128;
            aFa1qSDK.AFInAppEventParameterName(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            onInstallConversionFailureNative = (init + 119) % 128;
        }
        AFc1uSDK.AFa1wSDK values2 = AFa1bSDK.values(context2.getContentResolver());
        if (values2 != null) {
            int i2 = init + 91;
            onInstallConversionFailureNative = i2 % 128;
            if (i2 % 2 != 0) {
                aFa1qSDK.AFInAppEventParameterName("amazon_aid", values2.AFInAppEventParameterName);
                aFa1qSDK.AFInAppEventParameterName("amazon_aid_limit", String.valueOf(values2.AFInAppEventType));
                int i3 = 80 / 0;
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
        aFa1qSDK.AFInAppEventParameterName(ServerProtocol.DIALOG_PARAM_SDK_VERSION, Integer.toString(Build.VERSION.SDK_INT));
        String AFKeystoreWrapper = this.getLevel.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            aFa1qSDK.AFInAppEventParameterName(AppsFlyerProperties.CHANNEL, AFKeystoreWrapper);
        }
    }
}
