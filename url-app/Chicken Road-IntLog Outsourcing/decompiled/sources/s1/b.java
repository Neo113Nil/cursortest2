package s1;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import o1.u;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11801a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f11802b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f11803c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f11804d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f11805e;

    /* renamed from: f, reason: collision with root package name */
    public static String f11806f;

    /* renamed from: g, reason: collision with root package name */
    public static int f11807g;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f11806f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f11806f = processName;
            } else {
                int i2 = f11807g;
                if (i2 == 0) {
                    i2 = Process.myPid();
                    f11807g = i2;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i2 > 0) {
                    try {
                        String str2 = "/proc/" + i2 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                u.g(readLine);
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
                f11806f = str;
            }
        }
        return f11806f;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11802b == null) {
            f11802b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f11802b.booleanValue();
        if (f11803c == null) {
            f11803c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f11803c.booleanValue()) {
            return !b() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
