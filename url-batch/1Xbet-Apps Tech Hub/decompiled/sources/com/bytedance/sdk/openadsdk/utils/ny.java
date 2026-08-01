package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: RomUtils.java */
/* loaded from: classes2.dex */
public class ny {
    private static String NB = null;
    public static boolean icD = false;
    public static boolean pvs = false;
    private static int sUS = Integer.MAX_VALUE;
    private static final CharSequence vG = "amigo";
    private static final CharSequence Jd = "funtouch";
    private static final ConcurrentHashMap<String, String> yiw = new ConcurrentHashMap<>();

    public static String pvs() {
        if (!TextUtils.isEmpty(NB)) {
            return NB;
        }
        String pvs2 = com.bytedance.sdk.openadsdk.core.so.pvs("sdk_local_rom_info", 604800000L);
        NB = pvs2;
        if (TextUtils.isEmpty(pvs2)) {
            String OT = OT();
            NB = OT;
            com.bytedance.sdk.openadsdk.core.so.pvs("sdk_local_rom_info", OT);
        }
        return NB;
    }

    private static String OT() {
        if (bNS()) {
            return mnm();
        }
        if (NB()) {
            return kj();
        }
        if (icD()) {
            return vA();
        }
        if (cR()) {
            return zM();
        }
        String Ju = Ju();
        if (!TextUtils.isEmpty(Ju)) {
            return Ju;
        }
        if (yiw()) {
            return sUS();
        }
        if (so()) {
            return Mxy();
        }
        if (Jd()) {
            return vG();
        }
        String Wyp = Wyp();
        return !TextUtils.isEmpty(Wyp) ? Wyp : Build.DISPLAY;
    }

    public static boolean icD() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String vG() {
        return Jd("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean Jd() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean NB() {
        if (!icD) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    pvs = true;
                    icD = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            icD = true;
        }
        return pvs;
    }

    public static String sUS() {
        return Jd("ro.vivo.os.build.display.id") + "_" + Jd("ro.vivo.product.version");
    }

    public static boolean yiw() {
        String Jd2 = Jd("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(Jd2) && Jd2.toLowerCase().contains(Jd);
    }

    public static boolean so() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(vG);
    }

    public static String Mxy() {
        return Build.DISPLAY + "_" + Jd("ro.gn.sv.version");
    }

    public static String Wyp() {
        return qh() ? "eui_" + Jd("ro.letv.release.version") + "_" + Build.DISPLAY : "";
    }

    public static boolean qh() {
        return !TextUtils.isEmpty(Jd("ro.letv.release.version"));
    }

    public static String kj() {
        return NB() ? "miui_" + Jd("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL : "";
    }

    public static String Ju() {
        String IP = IP();
        return (IP == null || !IP.toLowerCase().contains("emotionui")) ? "" : IP + "_" + Build.DISPLAY;
    }

    public static String IP() {
        return Jd("ro.build.version.emui");
    }

    public static boolean bNS() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String mnm() {
        if (bNS()) {
            try {
                return "smartisan_".concat(String.valueOf(Jd("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String vA() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean cR() {
        if (sUS == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String yiw2 = jlb.yiw("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(yiw2)) {
                sUS = 1;
            } else {
                sUS = 0;
            }
        }
        return sUS == 1;
    }

    public static String zM() {
        if (!cR()) {
            return "";
        }
        return "coloros_" + Jd(jlb.yiw("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean uc() {
        try {
            if (TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) {
                if (TextUtils.isEmpty(Build.MANUFACTURER)) {
                    return false;
                }
                if (!Build.MANUFACTURER.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            str = IP();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || uc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String vG(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        Process exec;
        String str2 = "";
        Process process = null;
        try {
            try {
                try {
                    exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
                    } catch (IllegalThreadStateException unused) {
                        bufferedReader = null;
                    }
                } catch (IOException e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("ToolUtils", "Exception while closing InputStream", e);
                }
            } catch (IllegalThreadStateException unused2) {
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            str2 = bufferedReader.readLine();
            exec.exitValue();
            bufferedReader.close();
        } catch (IllegalThreadStateException unused3) {
            process = exec;
            try {
                process.destroy();
            } catch (Throwable unused4) {
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return str2;
        } catch (Throwable th3) {
            th = th3;
            try {
                com.bytedance.sdk.component.utils.Ju.pvs("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return str2;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        com.bytedance.sdk.component.utils.Ju.pvs("ToolUtils", "Exception while closing InputStream", e2);
                    }
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String Jd(String str) {
        String str2;
        Object[] objArr = new Object[3];
        String str3 = yiw.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.so.yiw yiwVar = new com.bytedance.sdk.component.so.yiw(new pvs(str), 5, 2);
            ae.icD(new com.bytedance.sdk.component.so.so("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.ny.1
                @Override // java.lang.Runnable
                public void run() {
                    yiwVar.run();
                }
            });
            str2 = (String) yiwVar.get(1L, TimeUnit.SECONDS);
            return str2 != null ? "" : str2;
        }
        str2 = "";
        if (str2 != null) {
        }
    }

    /* compiled from: RomUtils.java */
    public static class pvs implements Callable<String> {
        private final String pvs;

        public pvs(String str) {
            this.pvs = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) ny.yiw.get(this.pvs);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String vG = ny.vG(this.pvs);
            System.currentTimeMillis();
            if (vG != null) {
                ny.yiw.put(this.pvs, vG);
            }
            return vG;
        }
    }
}
