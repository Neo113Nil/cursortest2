package Y0;

import U0.t;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3083a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3084b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3085c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f3086d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f3087e;

    /* renamed from: f, reason: collision with root package name */
    public static String f3088f;

    /* renamed from: g, reason: collision with root package name */
    public static int f3089g;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f3088f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f3088f = processName;
            } else {
                int i7 = f3089g;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    f3089g = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        String str2 = "/proc/" + i7 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                t.f(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f3088f = str;
            }
        }
        return f3088f;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3084b == null) {
            f3084b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f3084b.booleanValue();
        if (f3085c == null) {
            f3085c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f3085c.booleanValue()) {
            return !b() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
