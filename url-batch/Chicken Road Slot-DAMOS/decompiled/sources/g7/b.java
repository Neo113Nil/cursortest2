package g7;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import c4.o;
import c7.c0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z6.i;
import z6.j;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4277a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f4278b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f4279c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f4280d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f4281e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f4282f;
    public static String g;

    /* renamed from: h, reason: collision with root package name */
    public static int f4283h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f4284i;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                g = processName;
            } else {
                int i3 = f4283h;
                if (i3 == 0) {
                    i3 = Process.myPid();
                    f4283h = i3;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i3 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i3);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb3));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        c0.g(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                g = str;
            }
        }
        return g;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context, int i3) {
        if (f(i3, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j a9 = j.a(context);
                a9.getClass();
                if (packageInfo != null) {
                    if (!j.d(packageInfo, false)) {
                        if (j.d(packageInfo, true)) {
                            if (!i.a((Context) a9.f10890b)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f4279c == null) {
            f4279c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f4279c.booleanValue();
        if (f4280d == null) {
            f4280d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f4280d.booleanValue()) {
            return !b() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static List e(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    public static boolean f(int i3, Context context, String str) {
        o a9 = i7.b.a(context);
        a9.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a9.f1772d.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i3, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
