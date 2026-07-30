package x1;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import t1.u;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1000b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8318a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f8319b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f8320c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f8321d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f8322e;

    /* renamed from: f, reason: collision with root package name */
    public static String f8323f;

    /* renamed from: g, reason: collision with root package name */
    public static int f8324g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f8325h;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f8323f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f8323f = processName;
            } else {
                int i2 = f8324g;
                if (i2 == 0) {
                    i2 = Process.myPid();
                    f8324g = i2;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i2 > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 14);
                        sb.append("/proc/");
                        sb.append(i2);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
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
                        u.f(readLine);
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
                f8323f = str;
            }
        }
        return f8323f;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f8319b == null) {
            f8319b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f8319b.booleanValue();
        if (f8320c == null) {
            f8320c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f8320c.booleanValue()) {
            return !b() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
