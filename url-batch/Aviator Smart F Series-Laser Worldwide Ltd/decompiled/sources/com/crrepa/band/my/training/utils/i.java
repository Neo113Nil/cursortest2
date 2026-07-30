package com.crrepa.band.my.training.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;
import androidx.core.content.ContextCompat;

/* loaded from: classes3.dex */
public class i {
    public static final int GPS_REQUEST_CODE = 17;

    public static boolean isEnable(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public static boolean isLocationEnable(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean isPermission(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static void startLocationSetting(Activity activity, int i8) {
        activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i8);
    }
}
