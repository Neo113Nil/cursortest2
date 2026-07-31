package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class zak {
    private static String btk = null;
    public static boolean fs = false;
    private static int hhw = Integer.MAX_VALUE;
    public static boolean zmn;
    private static final CharSequence zn = "amigo";
    private static final CharSequence fb = "funtouch";
    private static final ConcurrentHashMap<String, String> nps = new ConcurrentHashMap<>();

    public static String zmn() {
        if (!TextUtils.isEmpty(btk)) {
            return btk;
        }
        String zmn2 = com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_local_rom_info", 604800000L);
        btk = zmn2;
        if (TextUtils.isEmpty(zmn2)) {
            String nqi = nqi();
            btk = nqi;
            com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_local_rom_info", nqi);
        }
        return btk;
    }

    public static boolean fs() {
        try {
            String zmn2 = zmn();
            if (TextUtils.isEmpty(zmn2) || !zmn2.startsWith("miui")) {
                return false;
            }
            String str = Build.VERSION.INCREMENTAL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.toLowerCase().startsWith("v12");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String nqi() {
        if (cyb()) {
            return olo();
        }
        if (hhw()) {
            return mw();
        }
        if (zn()) {
            return kgc();
        }
        if (kw()) {
            return iqz();
        }
        String rt = rt();
        if (!TextUtils.isEmpty(rt)) {
            return rt;
        }
        if (zg()) {
            return nps();
        }
        if (bvs()) {
            return iv();
        }
        if (btk()) {
            return fb();
        }
        String rc = rc();
        return !TextUtils.isEmpty(rc) ? rc : Build.DISPLAY;
    }

    public static boolean zn() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static String fb() {
        return fb("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean btk() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean hhw() {
        if (!fs) {
            try {
                Class.forName("miui.os.Build");
                zmn = true;
                fs = true;
                return true;
            } catch (Exception unused) {
                fs = true;
            }
        }
        return zmn;
    }

    public static String nps() {
        return fb("ro.vivo.os.build.display.id") + "_" + fb("ro.vivo.product.version");
    }

    public static boolean zg() {
        String fb2 = fb("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(fb2) && fb2.toLowerCase().contains(fb);
    }

    public static boolean bvs() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(zn);
    }

    public static String iv() {
        return Build.DISPLAY + "_" + fb("ro.gn.sv.version");
    }

    public static String rc() {
        if (klz()) {
            return "eui_" + fb("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean klz() {
        return !TextUtils.isEmpty(fb("ro.letv.release.version"));
    }

    public static String mw() {
        if (hhw()) {
            return "miui_" + fb("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static String rt() {
        String cn = cn();
        if (cn != null && cn.toLowerCase().contains("emotionui")) {
            return cn + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static String cn() {
        return fb("ro.build.version.emui");
    }

    public static boolean cyb() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String olo() {
        if (cyb()) {
            try {
                return "smartisan_".concat(String.valueOf(fb("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String kgc() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean kw() {
        if (hhw == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String bvs = oub.bvs("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(bvs)) {
                hhw = 1;
            } else {
                hhw = 0;
            }
        }
        return hhw == 1;
    }

    public static String iqz() {
        if (kw()) {
            return "coloros_" + fb(oub.bvs("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean phc() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            str = cn();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || phc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zn(String str) {
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
                    com.bytedance.sdk.component.utils.iqz.zmn("ToolUtils", "Exception while closing InputStream", e);
                }
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
        } catch (IllegalThreadStateException unused2) {
            bufferedReader = null;
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
                com.bytedance.sdk.component.utils.iqz.zmn("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                return str2;
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        com.bytedance.sdk.component.utils.iqz.zmn("ToolUtils", "Exception while closing InputStream", e2);
                    }
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String fb(String str) {
        String str2;
        String str3 = nps.get(str);
        if (str3 != null) {
            return str3;
        }
        if (TextUtils.isEmpty("")) {
            final com.bytedance.sdk.component.zg.fs.fs fsVar = new com.bytedance.sdk.component.zg.fs.fs(new zmn(str), 5, 2);
            nu.zn((Runnable) new com.bytedance.sdk.component.zg.fs.zn("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.zak.1
                @Override // java.lang.Runnable
                public void run() {
                    fsVar.run();
                }
            });
            str2 = (String) fsVar.get(1L, TimeUnit.SECONDS);
            return str2 != null ? "" : str2;
        }
        str2 = "";
        if (str2 != null) {
        }
    }

    public static class zmn implements Callable<String> {
        private final String zmn;

        public zmn(String str) {
            this.zmn = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) zak.nps.get(this.zmn);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String zn = zak.zn(this.zmn);
            System.currentTimeMillis();
            if (zn != null) {
                zak.nps.put(this.zmn, zn);
            }
            return zn;
        }
    }
}
