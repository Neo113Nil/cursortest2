package com.huawei.hms.framework.common;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public class PowerUtils {

    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context == null) {
            Logger.i("PowerUtils", "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        Object systemService = context.getSystemService("usagestats");
        if (systemService instanceof UsageStatsManager) {
            UsageStatsManager usageStatsManager = (UsageStatsManager) systemService;
            if (usageStatsManager != null) {
                return usageStatsManager.isAppInactive(packageName);
            }
            Logger.i("PowerUtils", "isAppIdleMode statsManager is null!");
        }
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        if (context == null) {
            Logger.i("PowerUtils", "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            Logger.i("PowerUtils", "isDozeIdleMode powerManager is null!");
            return false;
        }
        try {
            return powerManager.isDeviceIdleMode();
        } catch (RuntimeException e4) {
            Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e4);
            return false;
        }
    }

    public static boolean isInteractive(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        if (!(systemService instanceof PowerManager)) {
            return false;
        }
        try {
            return ((PowerManager) systemService).isInteractive();
        } catch (RuntimeException e4) {
            Logger.i("PowerUtils", "getActiveNetworkInfo failed, exception:" + e4.getClass().getSimpleName() + e4.getMessage());
            return false;
        }
    }

    public static boolean isWhilteList(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        String packageName = context.getPackageName();
        if (powerManager == null) {
            return false;
        }
        try {
            return powerManager.isIgnoringBatteryOptimizations(packageName);
        } catch (RuntimeException e4) {
            Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e4);
            return false;
        }
    }

    public static int readDataSaverMode(Context context) {
        if (context == null) {
            Logger.i("PowerUtils", "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i("PowerUtils", "readDataSaverMode Context is null!");
            return 0;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        if (connectivityManager.isActiveNetworkMetered()) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        Logger.v("PowerUtils", "ConnectType is not Mobile Network!");
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.i("PowerUtils", "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), "SmartModeStatus", 0);
        if (systemInt != 0) {
            return systemInt;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return systemInt;
        }
        try {
            return powerManager.isPowerSaveMode() ? 4 : 0;
        } catch (RuntimeException e4) {
            Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e4);
            return systemInt;
        }
    }
}
