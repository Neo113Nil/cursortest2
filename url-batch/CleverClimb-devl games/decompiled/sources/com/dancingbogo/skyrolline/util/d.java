package com.dancingbogo.skyrolline.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Toast;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.GameApp;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.games.GamesStatusCodes;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;

/* compiled from: Commons.java */
/* loaded from: classes.dex */
public class d {
    public static boolean a(String str) {
        Process exec;
        Process process = null;
        try {
            try {
                exec = Runtime.getRuntime().exec(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            exec.waitFor();
            try {
                exec.destroy();
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return true;
            }
        } catch (Exception e3) {
            process = exec;
            e = e3;
            e.printStackTrace();
            try {
                process.destroy();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return false;
        } catch (Throwable th2) {
            process = exec;
            th = th2;
            try {
                process.destroy();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }

    public static boolean a(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Activity activity, Intent intent, int i) {
        try {
            b.a("camera", "startActivityForResult  request code is " + i);
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            b.a("camera", "startActivityForResult  ActivityNotFoundException request code is " + i);
            return false;
        } catch (NullPointerException e) {
            b.a("camera", "startActivityForResult  NullPointerException request code is " + i);
            b.a("camera", e.getMessage());
            return false;
        } catch (SecurityException e2) {
            b.a("camera", "startActivityForResult  SecurityException request code is " + i);
            b.a("camera", e2.getMessage());
            return false;
        }
    }

    public static boolean b(Context context, Intent intent) {
        try {
            context.startService(intent);
            return true;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            b.c("startService", "startService fail!  error msg:" + e.getMessage());
            return false;
        } catch (SecurityException e2) {
            e2.printStackTrace();
            b.c("startService", "startService fail!  error msg:" + e2.getMessage());
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            b.c("startService", "startService fail!  error msg:" + e3.getMessage());
            return false;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            GameApp.f4485a.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context, String str) {
        if (context == null || str == null || str.length() <= 0) {
            return -1;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
    }

    public static boolean b(Context context) {
        PackageInfo b2;
        return b("com.android.vending") && (b2 = b(context, "com.google.android.gsf")) != null && (b2.applicationInfo.flags & 1) == 1;
    }

    public static PackageInfo b(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context, String str, String str2) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return;
        }
        configuration.locale = new Locale(str, str2);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    public static boolean a(Activity activity, boolean z) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(GameApp.f4485a);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (!z || !googleApiAvailability.isUserResolvableError(isGooglePlayServicesAvailable)) {
            return false;
        }
        googleApiAvailability.getErrorDialog(activity, isGooglePlayServicesAvailable, GamesStatusCodes.STATUS_VIDEO_NOT_ACTIVE).show();
        return false;
    }

    public static void c(final String str) {
        final Activity activityRef = AppActivity.getActivityRef();
        if (activityRef != null) {
            activityRef.runOnUiThread(new Runnable() { // from class: com.dancingbogo.skyrolline.util.d.1
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(activityRef, str, 1).show();
                }
            });
        }
    }
}
