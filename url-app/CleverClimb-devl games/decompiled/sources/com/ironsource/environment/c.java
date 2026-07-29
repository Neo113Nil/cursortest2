package com.ironsource.environment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.mopub.common.GpsHelper;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: DeviceStatus.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f6995a;

    public static String e() {
        return TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE;
    }

    public static String[] a(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Object invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(cls, context);
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, new Class[0]);
        return new String[]{method.invoke(invoke, new Object[0]).toString(), "" + ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue()};
    }

    private static long a(File file) {
        long availableBlocksLong;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            availableBlocksLong = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } else {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }
        return availableBlocksLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public static String b(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
    }

    public static String a() {
        return Build.VERSION.RELEASE;
    }

    public static int b() {
        return Build.VERSION.SDK_INT;
    }

    public static String c() {
        return Build.MODEL;
    }

    public static String d() {
        return Build.MANUFACTURER;
    }

    public static boolean f() {
        return b("su");
    }

    private static boolean b(String str) {
        try {
            for (String str2 : new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}) {
                if (new File(str2 + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int c(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static float d(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
    }

    public static int g() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int h() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int e(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    public static int f(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public static float i() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static List<ApplicationInfo> g(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    public static boolean h(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    public static File i(Context context) {
        return context.getExternalCacheDir();
    }

    public static String j(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static long a(String str) {
        return a(new File(str));
    }

    @TargetApi(19)
    public static boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    public static int k(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static synchronized String l(Context context) {
        synchronized (c.class) {
            if (!TextUtils.isEmpty(f6995a)) {
                return f6995a;
            }
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("Mediation_Shared_Preferences", 0);
                if (sharedPreferences.getBoolean("uuidEnabled", true)) {
                    String string = sharedPreferences.getString("cachedUUID", "");
                    if (TextUtils.isEmpty(string)) {
                        f6995a = UUID.randomUUID().toString();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("cachedUUID", f6995a);
                        edit.apply();
                    } else {
                        f6995a = string;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return f6995a;
        }
    }

    private static boolean a(ResolveInfo resolveInfo) {
        return (resolveInfo.activityInfo.applicationInfo.flags & 1) != 0;
    }

    public static JSONObject a(Context context, boolean z) {
        int i;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        JSONObject jSONObject = new JSONObject();
        PackageManager packageManager = context.getPackageManager();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        while (i < queryIntentActivities.size()) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (!z) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i = a(resolveInfo) ? i + 1 : 0;
            }
            String format = simpleDateFormat.format(new Date(packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 4096).firstInstallTime));
            jSONObject.put(format, jSONObject.optInt(format, 0) + 1);
        }
        return jSONObject;
    }
}
