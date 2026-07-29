package com.ijinshan.cloudconfig.d;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemProperties;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.ao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: UtilsHelper.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static long f6688a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static String f6689b = "";

    /* renamed from: c, reason: collision with root package name */
    private static Object f6690c = new Object();

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append("0123456789abcdef".charAt((bArr[i] & 240) >>> 4));
            sb.append("0123456789abcdef".charAt(bArr[i] & ao.m));
        }
        return sb.toString();
    }

    public static String a(Context context) {
        Locale locale;
        Resources resources = context.getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            locale = configuration != null ? configuration.locale : null;
            if (locale == null) {
                locale = Locale.getDefault();
            }
        } else {
            locale = Locale.getDefault();
        }
        return locale.getLanguage();
    }

    public static String b(Context context) {
        Locale locale;
        Resources resources = context.getResources();
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            locale = configuration != null ? configuration.locale : null;
            if (locale == null) {
                locale = Locale.getDefault();
            }
        } else {
            locale = Locale.getDefault();
        }
        return locale.getCountry();
    }

    public static String c(Context context) {
        String simOperator;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public static String d(Context context) {
        if (context == null) {
            return null;
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 5) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 3, 5);
        return sb.toString();
    }

    public static String e(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(i);
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    @SuppressLint({"NewApi"})
    public static long f(Context context) {
        long a2;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            a2 = memoryInfo.totalMem;
            Log.d("memory", "MemoryInfo.totalMem   totalMemorySize:" + a2);
        } else {
            a2 = a();
            Log.d("memory", "/proc/meminfo   totalMemorySize:" + a2);
        }
        if (a2 >= 0) {
            return a2;
        }
        long b2 = b();
        Log.d("memory", "totalMemorySize < 0   try again totalMemorySize = " + b2);
        return b2;
    }

    public static long a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            r1 = bufferedReader.readLine().split("\\s+").length == 3 ? Integer.valueOf(r3[1]).intValue() * 1024 : 0L;
            bufferedReader.close();
        } catch (Exception unused) {
        }
        return r1;
    }

    public static long b() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String readLine = bufferedReader.readLine();
            long intValue = Integer.valueOf(readLine.substring(readLine.indexOf(":") + 1, readLine.indexOf("kB")).trim()).intValue();
            bufferedReader.close();
            long j = intValue * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            if (0 < j && f6688a < j && j < 107374182400L) {
                f6688a = j;
            }
            return j;
        } catch (Exception e) {
            Log.e("ProcessMemory", "MemoryInfo-->getTotalMem:" + e.toString());
            if (f6688a < 0) {
                return 1L;
            }
            return f6688a;
        }
    }

    public static int a(long j) {
        return Math.round(j / 1048576.0f);
    }

    public static String g(Context context) {
        return new ComponentName(context, context.getClass()).getPackageName();
    }

    public static String h(Context context) {
        if (TextUtils.isEmpty(f6689b)) {
            synchronized (f6690c) {
                if (TextUtils.isEmpty(f6689b)) {
                    try {
                        String string = Settings.System.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
                        if (!TextUtils.isEmpty(string)) {
                            f6689b = string;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return f6689b;
    }

    public static String c() {
        String str = SystemProperties.get("ro.product.brand");
        if (TextUtils.isEmpty(str)) {
            str = Build.MODEL;
        }
        return !TextUtils.isEmpty(str) ? str : "unknow";
    }

    public static String i(Context context) {
        try {
            return context.getResources().getDisplayMetrics().density + "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static int j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
