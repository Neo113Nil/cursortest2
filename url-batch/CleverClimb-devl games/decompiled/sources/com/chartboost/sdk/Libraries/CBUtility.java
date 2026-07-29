package com.chartboost.sdk.Libraries;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.chartboost.sdk.Chartboost;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class CBUtility {
    public static boolean a(int i) {
        return i == 0 || i == 2;
    }

    public static boolean b(int i) {
        return i == 1 || i == 3;
    }

    private CBUtility() {
    }

    public static float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int a(int i, Context context) {
        return Math.round(i * a(context));
    }

    public static float a(float f, Context context) {
        return f * a(context);
    }

    public static int a() {
        Context context = com.chartboost.sdk.i.m;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        boolean z = defaultDisplay.getWidth() != defaultDisplay.getHeight() ? defaultDisplay.getWidth() < defaultDisplay.getHeight() : context.getResources().getConfiguration().orientation != 2;
        if (rotation != 0 && rotation != 2) {
            z = !z;
        }
        if (z) {
            switch (rotation) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    return 0;
            }
        }
        switch (rotation) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 0;
            default:
                return 1;
        }
    }

    public static void throwProguardError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            CBLogging.b("CBUtility", "Chartboost library error! Have you used proguard on your application? Make sure to add the line '-keep class com.chartboost.sdk.** { *; }' to your proguard config file.");
        } else if (exc != null && exc.getMessage() != null) {
            CBLogging.b("CBUtility", exc.getMessage());
        } else {
            CBLogging.b("CBUtility", "Unknown Proguard error");
        }
    }

    public static String b() {
        Object[] objArr = new Object[3];
        objArr[0] = "Chartboost-Android-SDK";
        objArr[1] = com.chartboost.sdk.i.f3680d == null ? "" : com.chartboost.sdk.i.f3680d;
        objArr[2] = "7.3.1";
        return String.format("%s %s %s", objArr);
    }

    public static boolean c() {
        return e() || f() || g();
    }

    public static String d() {
        SimpleDateFormat simpleDateFormat;
        if (Build.VERSION.SDK_INT >= 18) {
            simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat("'GMT'ZZZZ", Locale.US);
        }
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    private static boolean e() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean f() {
        return new File("/system/app/Superuser.apk").exists();
    }

    private static boolean g() {
        for (String str : new String[]{"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"}) {
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    public static void a(Activity activity, int i, com.chartboost.sdk.Model.e eVar) {
        if (activity == null || a(activity)) {
            return;
        }
        if ((i == 1 && eVar.y && eVar.C) || (i == 0 && eVar.e && eVar.h)) {
            int a2 = a();
            if (a2 == 0) {
                activity.setRequestedOrientation(1);
                return;
            }
            if (a2 == 2) {
                activity.setRequestedOrientation(9);
            } else if (a2 == 1) {
                activity.setRequestedOrientation(0);
            } else {
                activity.setRequestedOrientation(8);
            }
        }
    }

    public static void b(Activity activity, int i, com.chartboost.sdk.Model.e eVar) {
        if (activity == null || a(activity)) {
            return;
        }
        if ((i == 1 && eVar.y && eVar.C) || (i == 0 && eVar.e && eVar.h)) {
            activity.setRequestedOrientation(-1);
        }
    }

    public static boolean a(Chartboost.CBFramework cBFramework) {
        return com.chartboost.sdk.i.f3680d != null && com.chartboost.sdk.i.f3680d == cBFramework;
    }

    public static ArrayList<File> a(File file, boolean z) {
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && !file2.getName().equals(".nomedia")) {
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z) {
                    arrayList.addAll(a(file2, z));
                }
            }
        }
        return arrayList;
    }

    public static boolean a(Activity activity) {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getBackground() == null) {
            return true;
        }
        return Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && activity.getWindow().getDecorView().getBackground().getAlpha() != 255;
    }
}
