package com.cmplay.base.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: RuntimeCheck.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4063a = null;

    /* renamed from: b, reason: collision with root package name */
    protected static Handler f4064b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f4065c = ":service";

    /* renamed from: d, reason: collision with root package name */
    private static String f4066d = ":inner";
    private static String e = ":web";
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;

    public static void a(Runnable runnable, long j2) {
        if (f4064b == null) {
            return;
        }
        f4064b.postDelayed(runnable, j2);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        h.a("zzb_pro", "set服务进程名：" + str);
        f4065c = str;
    }

    public static boolean a() {
        return f;
    }

    public static boolean b() {
        return h;
    }

    public static boolean c() {
        return g;
    }

    public static boolean d() {
        return i;
    }

    public static void e() {
        if (!a()) {
            throw new RuntimeException("Must run in Service Process");
        }
    }

    public static void f() {
        if (!d()) {
            throw new RuntimeException("Must run in Web Process");
        }
    }

    public static void a(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        f4063a = context;
        if (j) {
            return;
        }
        if (f4064b == null) {
            f4064b = new Handler(Looper.getMainLooper());
        }
        a(context.getPackageName() + ":service");
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
            String string = bundle.getString("SERVICE_PROCESS_NAME");
            if (!TextUtils.isEmpty(string)) {
                f4065c = string;
            }
        }
        String b2 = b(context);
        h.a("zzb_pro", "当前processName=" + b2);
        if (b2 == null) {
            return;
        }
        if (b2.contains(f4065c)) {
            f = true;
        }
        if (b2.contains(f4066d)) {
            g = true;
        }
        if (!b2.contains(":")) {
            h = true;
        }
        if (b2.contains(e)) {
            i = true;
        }
        j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    public static String b(Context context) {
        BufferedReader bufferedReader;
        String readLine;
        boolean isEmpty;
        File file = new File("/proc/self/cmdline");
        if (file.exists() && !file.isDirectory()) {
            BufferedReader bufferedReader2 = null;
            bufferedReader2 = null;
            bufferedReader2 = null;
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                readLine = bufferedReader.readLine();
                isEmpty = TextUtils.isEmpty(readLine);
            } catch (Exception e4) {
                e = e4;
                bufferedReader2 = bufferedReader;
                e.printStackTrace();
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                    bufferedReader2 = bufferedReader2;
                }
                return context.getApplicationInfo().processName;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
            if (isEmpty == 0) {
                String trim = readLine.trim();
                try {
                    bufferedReader.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                return trim;
            }
            bufferedReader.close();
            bufferedReader2 = isEmpty;
        }
        return context.getApplicationInfo().processName;
    }

    public static String c(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        } catch (Exception unused) {
            return "";
        }
    }
}
