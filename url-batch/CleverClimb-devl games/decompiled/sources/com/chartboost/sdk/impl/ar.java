package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.common.util.DeviceProperties;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.util.UUID;

/* loaded from: classes.dex */
public class ar {
    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i = context.getResources().getConfiguration().uiMode & 15;
        return !packageManager.hasSystemFeature("org.chromium.arc.device_management") ? (Build.BRAND != null && Build.BRAND.equals("chromium") && Build.MANUFACTURER.equals("chromium")) ? "chromebook" : (Build.DEVICE == null || !Build.DEVICE.matches(".+_cheets")) ? (packageManager.hasSystemFeature("android.hardware.type.watch") || i == 6) ? "watch" : (packageManager.hasSystemFeature(DeviceProperties.FEATURE_TV_2) || i == 4) ? ProductRequestItem.Device.TYPE_TV : ((Build.MANUFACTURER == null || !Build.MANUFACTURER.equalsIgnoreCase("Amazon")) && (context.getResources().getConfiguration().screenLayout & 15) != 4) ? "phone" : ProductRequestItem.Device.TYPE_TABLET : "chromebook" : "chromebook";
    }

    public static String b(Context context) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("cb.limit.aid");
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() == 1) {
                    return null;
                }
            }
        } catch (Exception unused) {
        }
        String string = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        String str = "9774d56d682e549c".equals(string) ? null : string;
        return str == null ? c(context) : str;
    }

    private static String c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
        if (sharedPreferences == null) {
            return UUID.randomUUID().toString();
        }
        String string = sharedPreferences.getString("cbUUID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("cbUUID", uuid);
        edit.apply();
        return uuid;
    }
}
