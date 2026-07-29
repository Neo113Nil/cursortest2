package com.cmplay.kinfoc.report.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.kinfoc.report.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: RuntimeCheck.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f4407a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f4408b = ":service";

    /* renamed from: c, reason: collision with root package name */
    private static String f4409c = ":inner";

    /* renamed from: d, reason: collision with root package name */
    private static String f4410d = ":web";
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (e.f4415a) {
            Log.d("drpt_runtime", "set服务进程名：" + str);
        }
        f4408b = str;
    }

    public static boolean a() {
        return e;
    }

    public static boolean b() {
        return g;
    }

    public static void a(Context context) {
        ApplicationInfo applicationInfo;
        f4407a = context;
        if (i) {
            return;
        }
        a(context.getPackageName() + ":service");
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            String string = bundle.getString("SERVICE_PROCESS_NAME");
            if (!TextUtils.isEmpty(string)) {
                f4408b = string;
            }
        }
        String b2 = b(context);
        if (e.f4415a) {
            Log.d("drpt_runtime", "当前processName=" + b2);
        }
        if (b2 == null) {
            return;
        }
        if (b2.contains(f4408b)) {
            e = true;
        }
        if (b2.contains(f4409c)) {
            f = true;
        }
        if (!b2.contains(":")) {
            g = true;
        }
        if (b2.contains(f4410d)) {
            h = true;
        }
        i = true;
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
}
