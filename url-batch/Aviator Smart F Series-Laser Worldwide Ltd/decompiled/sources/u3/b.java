package u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

/* loaded from: classes2.dex */
public class b {
    public static boolean isIgnoredBatteryOptimizations(Context context) {
        boolean isIgnoringBatteryOptimizations;
        String packageName = context.getPackageName();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        isIgnoringBatteryOptimizations = ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(packageName);
        return isIgnoringBatteryOptimizations;
    }

    public static boolean isOpenAllowLocationAllTime(Context context) {
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 29 ? ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0 : i8 < 23 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static void startApplicationDetailsSettingsAction(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @RequiresApi(api = 23)
    @SuppressLint({"BatteryLife"})
    public static void startIgnoreBatteryOptimizationsAction(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent();
        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + packageName));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void startSystemSettingsAction(Context context) {
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
