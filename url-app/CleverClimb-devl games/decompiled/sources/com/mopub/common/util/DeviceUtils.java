package com.mopub.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.StatFs;
import android.support.v4.content.ContextCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CreativeOrientation;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.net.SocketException;

/* loaded from: classes2.dex */
public class DeviceUtils {
    private static final int MAX_DISK_CACHE_SIZE = 104857600;
    private static final int MAX_MEMORY_CACHE_SIZE = 31457280;
    private static final int MIN_DISK_CACHE_SIZE = 31457280;

    @Deprecated
    public enum IP {
        IPv4,
        IPv6
    }

    @Deprecated
    public static String getHashedUdid(Context context) {
        return null;
    }

    @Deprecated
    public static String getIpAddress(IP ip) throws SocketException {
        return null;
    }

    private DeviceUtils() {
    }

    public enum ForceOrientation {
        FORCE_PORTRAIT(TJAdUnitConstants.String.PORTRAIT),
        FORCE_LANDSCAPE(TJAdUnitConstants.String.LANDSCAPE),
        DEVICE_ORIENTATION(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX),
        UNDEFINED("");

        private final String mKey;

        ForceOrientation(String str) {
            this.mKey = str;
        }

        public static ForceOrientation getForceOrientation(String str) {
            for (ForceOrientation forceOrientation : values()) {
                if (forceOrientation.mKey.equalsIgnoreCase(str)) {
                    return forceOrientation;
                }
            }
            return UNDEFINED;
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        if (context == null || !isPermissionGranted(context, "android.permission.INTERNET")) {
            return false;
        }
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().isConnected();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static int memoryCacheSizeBytes(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        long memoryClass = activityManager.getMemoryClass();
        try {
            if (Utils.bitMaskContainsFlag(context.getApplicationInfo().flags, ApplicationInfo.class.getDeclaredField("FLAG_LARGE_HEAP").getInt(null))) {
                memoryClass = ((Integer) new Reflection.MethodBuilder(activityManager, "getLargeMemoryClass").execute()).intValue();
            }
        } catch (Exception unused) {
            MoPubLog.d("Unable to reflectively determine large heap size.");
        }
        return (int) Math.min(31457280L, (memoryClass / 8) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public static long diskCacheSizeBytes(File file, long j) {
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCount() * statFs.getBlockSize()) / 50;
        } catch (IllegalArgumentException unused) {
            MoPubLog.d("Unable to calculate 2% of available disk space, defaulting to minimum");
        }
        return Math.max(Math.min(j, 104857600L), 31457280L);
    }

    public static long diskCacheSizeBytes(File file) {
        return diskCacheSizeBytes(file, 31457280L);
    }

    public static int getScreenOrientation(Activity activity) {
        return getScreenOrientationFromRotationAndOrientation(activity.getWindowManager().getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
    }

    static int getScreenOrientationFromRotationAndOrientation(int i, int i2) {
        if (1 == i2) {
            switch (i) {
                case 1:
                case 2:
                    return 9;
                default:
                    return 1;
            }
        }
        if (2 != i2) {
            MoPubLog.d("Unknown screen orientation. Defaulting to portrait.");
            return 9;
        }
        switch (i) {
            case 2:
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    public static void lockOrientation(Activity activity, CreativeOrientation creativeOrientation) {
        if (Preconditions.NoThrow.checkNotNull(creativeOrientation) && Preconditions.NoThrow.checkNotNull(activity)) {
            int screenOrientationFromRotationAndOrientation = getScreenOrientationFromRotationAndOrientation(((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation(), activity.getResources().getConfiguration().orientation);
            int i = 8;
            if (CreativeOrientation.PORTRAIT == creativeOrientation) {
                i = 9 == screenOrientationFromRotationAndOrientation ? 9 : 1;
            } else {
                if (CreativeOrientation.LANDSCAPE != creativeOrientation) {
                    return;
                }
                if (8 != screenOrientationFromRotationAndOrientation) {
                    i = 0;
                }
            }
            activity.setRequestedOrientation(i);
        }
    }

    @TargetApi(17)
    public static Point getDeviceDimensions(Context context) {
        Integer num;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Integer num2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Integer valueOf = Integer.valueOf(point.x);
            num2 = Integer.valueOf(point.y);
            num = valueOf;
        } else {
            try {
                num = (Integer) new Reflection.MethodBuilder(defaultDisplay, "getRawWidth").execute();
            } catch (Exception e) {
                e = e;
                num = null;
            }
            try {
                num2 = (Integer) new Reflection.MethodBuilder(defaultDisplay, "getRawHeight").execute();
            } catch (Exception e2) {
                e = e2;
                MoPubLog.v("Display#getRawWidth/Height failed.", e);
                if (num != null) {
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                num = Integer.valueOf(displayMetrics.widthPixels);
                num2 = Integer.valueOf(displayMetrics.heightPixels);
                return new Point(num.intValue(), num2.intValue());
            }
        }
        if (num != null || num2 == null) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            num = Integer.valueOf(displayMetrics2.widthPixels);
            num2 = Integer.valueOf(displayMetrics2.heightPixels);
        }
        return new Point(num.intValue(), num2.intValue());
    }

    public static boolean isPermissionGranted(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
