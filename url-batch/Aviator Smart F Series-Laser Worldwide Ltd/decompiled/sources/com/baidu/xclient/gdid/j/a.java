package com.baidu.xclient.gdid.j;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Display;
import android.view.WindowManager;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.baidu.xclient.gdid.k.d;
import com.google.android.material.internal.ViewUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f10751a;

    /* renamed from: b, reason: collision with root package name */
    public static long f10752b;

    /* renamed from: c, reason: collision with root package name */
    public static long f10753c;

    /* renamed from: d, reason: collision with root package name */
    public static long f10754d;

    public static int a(long j8) {
        try {
            if (g()) {
                String upperCase = Build.BOARD.trim().toUpperCase();
                if (upperCase.startsWith("SQW100-")) {
                    return 3072;
                }
                if (!upperCase.startsWith("SQC100-") && !upperCase.startsWith("SQK100-") && !upperCase.startsWith("SQN100-") && !upperCase.startsWith("SQR100-") && !upperCase.startsWith("STA100-") && !upperCase.startsWith("STK100-") && !upperCase.startsWith("STL100-") && !upperCase.startsWith("STR100-")) {
                    if (upperCase.startsWith("STJ100-")) {
                        return 1536;
                    }
                }
                return 2048;
            }
            float f8 = j8 / 1024.0f;
            if (f8 > 10.0f) {
                return 12288;
            }
            if (f8 > 8.0f) {
                return 10240;
            }
            if (f8 > 7.0f) {
                return 8192;
            }
            if (f8 > 5.0f) {
                return BmLocated.HALF_LEFT_BOTTOM;
            }
            if (f8 > 4.0f) {
                return BmLocated.HALF_LEFT_TOP;
            }
            if (f8 > 3.0f) {
                return 4096;
            }
            if (f8 > 2.0f) {
                return 3072;
            }
            if (f8 > 1.0f) {
                return 2048;
            }
            if (f8 > 0.75f) {
                return 1024;
            }
            return f8 > 0.5f ? ViewUtils.EDGE_TO_EDGE_FLAGS : f8 > 0.25f ? 512 : 0;
        } catch (Throwable th) {
            d.a(th);
            return 0;
        }
    }

    public static long b() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return -1L;
            }
            if (f10754d == 0) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f10754d = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            return f10754d;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static long c() {
        try {
            if (f10751a == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f10751a = statFs.getBlockSize() * statFs.getBlockCount();
            }
            return f10751a;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static int d(Context context) {
        try {
            return context.getResources().getConfiguration().orientation == 2 ? 0 : 1;
        } catch (Throwable th) {
            d.a(th);
            return 1;
        }
    }

    public static int e(Context context) {
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager == null) {
                return 0;
            }
            return batteryManager.getIntProperty(4);
        } catch (Throwable th) {
            d.a(th);
            return 0;
        }
    }

    public static String f() {
        try {
            return Build.MANUFACTURER.trim();
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public static long g(Context context) {
        try {
            long h8 = h(context);
            return h8 <= 0 ? e() : h8;
        } catch (Throwable th) {
            d.a(th);
            return 0L;
        }
    }

    @SuppressLint({"NewApi"})
    public static long h(Context context) {
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager == null) {
                    return 0L;
                }
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return 0L;
    }

    public static long a() {
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return -1L;
            }
            if (f10753c == 0) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f10753c = statFs.getBlockSize() * statFs.getBlockCount();
            }
            return f10753c;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    public static String b(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            int i8 = (int) (memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            return i8 % 1024 == 0 ? String.format("%d %s", Integer.valueOf(i8 / 1024), "GB") : (i8 < 1024 || i8 % 512 != 0) ? a(Long.valueOf(i8)) : String.format("%.1f %s", Float.valueOf(i8 / 1024.0f), "GB");
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }

    public static String c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return "";
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int i8 = point.x;
        return point.y + "X" + i8;
    }

    public static long d() {
        try {
            if (f10752b == 0) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                f10752b = statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
            return f10752b;
        } catch (Throwable th) {
            d.a(th);
            return -1L;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static long e() {
        BufferedReader bufferedReader;
        String readLine;
        File a8 = com.baidu.mshield.b.e.a.a(com.baidu.xclient.gdid.d.f10722b, "/proc/meminfo");
        long j8 = 0;
        if (a8 != null && a8.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(a8));
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            d.a(th);
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    d.a(th2);
                                }
                            }
                        }
                    }
                } while (!readLine.startsWith("MemTotal:"));
                String upperCase = readLine.substring(9).trim().toUpperCase();
                int indexOf = upperCase.indexOf(" KB");
                if (indexOf > 0) {
                    long a9 = a(upperCase.substring(0, indexOf));
                    if (a9 > 0) {
                        j8 = a9 / 1024;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        }
        return j8;
    }

    public static boolean f(Context context) {
        try {
            int intExtra = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("status", -1);
            return intExtra == 2 || intExtra == 5;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static boolean g() {
        try {
            if (!f().toUpperCase().equals("BLACKBERRY")) {
                if (!f().equals("RIM")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            d.a(th);
            return false;
        }
    }

    public static long a(String str) {
        try {
            return Long.valueOf(str).longValue();
        } catch (NumberFormatException e8) {
            d.a(e8);
            return Long.MIN_VALUE;
        }
    }

    public static String a(Context context) {
        try {
            int a8 = a(g(context));
            if (a8 <= 0) {
                return null;
            }
            return a8 % 1024 == 0 ? String.format("%d %s", Integer.valueOf(a8 / 1024), "GB") : (a8 < 1024 || a8 % 512 != 0) ? a(Long.valueOf(a8)) : String.format("%.1f %s", Float.valueOf(a8 / 1024.0f), "GB");
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public static String a(Long l8) {
        try {
            return l8.longValue() >= 10240 ? String.format("%.2f %s", Float.valueOf(l8.longValue() / 1024.0f), "GB") : String.format("%d %s", l8, "MB");
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }
}
