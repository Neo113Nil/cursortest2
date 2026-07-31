package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* compiled from: RomUtils.java */
/* loaded from: classes4.dex */
public final class l {
    private static final CharSequence a = "amigo";
    private static final CharSequence b = "funtouch";

    public static String a() {
        String str;
        String str2 = "";
        if (!d.b()) {
            if (!d.c()) {
                if (b()) {
                    if (!b()) {
                        return "";
                    }
                    return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
                }
                String a2 = d.a();
                if (a2 == null || !a2.toLowerCase(Locale.getDefault()).contains("emotionui")) {
                    str = "";
                } else {
                    str = a2 + "_" + Build.DISPLAY;
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
                String a3 = a("ro.vivo.os.build.display.id");
                if (!TextUtils.isEmpty(a3) && a3.toLowerCase(Locale.getDefault()).contains(b)) {
                    return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
                }
                String str3 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str3) && str3.toLowerCase(Locale.getDefault()).contains(a)) {
                    return str3 + "_" + a("ro.gn.sv.version");
                }
                String str4 = Build.MANUFACTURER + Build.BRAND;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.getDefault());
                    if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                        return a("ro.build.uiversion") + "_" + str3;
                    }
                }
                if (!TextUtils.isEmpty(a("ro.letv.release.version"))) {
                    str2 = "eui_" + a("ro.letv.release.version") + "_" + str3;
                }
                return !TextUtils.isEmpty(str2) ? str2 : str3;
            }
            String str5 = Build.DISPLAY;
            return (str5 == null || !str5.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str5;
        }
        if (!d.b()) {
            return "";
        }
        return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    private static String a(String str) {
        BufferedReader bufferedReader;
        String str2 = "";
        try {
            Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader.readLine();
                exec.destroy();
                com.apm.insight.a.a((Closeable) bufferedReader);
                return str2;
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }
}
