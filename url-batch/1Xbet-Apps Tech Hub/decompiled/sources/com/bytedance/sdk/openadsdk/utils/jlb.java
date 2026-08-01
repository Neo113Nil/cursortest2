package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.common.ArbitrageLoadingLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolUtils.java */
/* loaded from: classes2.dex */
public class jlb {
    public static Integer pvs;
    private static final HashSet<String> qh;
    private static final ExecutorService icD = Executors.newSingleThreadExecutor();
    private static volatile boolean vG = false;
    private static final AtomicInteger Jd = new AtomicInteger(0);
    private static volatile String NB = "";
    private static final ReentrantLock sUS = new ReentrantLock();
    private static String yiw = null;
    private static String so = null;
    private static String Mxy = null;
    private static final HashSet<String> Wyp = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    public static boolean Jd(int i) {
        return i == 4;
    }

    public static boolean NB(int i) {
        return i == 5;
    }

    public static String icD(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? "unknow" : "rewarded_video_landingpage" : "fullscreen_interstitial_ad" : "splash_ad_landingpage" : "interaction_landingpage" : "banner_ad_landingpage" : "embeded_ad_landingpage";
    }

    public static String pvs(int i) {
        if (i == 1) {
            return "embeded_ad";
        }
        if (i == 2) {
            return "banner_ad";
        }
        if (i == 3) {
            return "interaction";
        }
        if (i == 4) {
            return "open_ad";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, View view) {
    }

    public static boolean sUS(int i) {
        return i == 6;
    }

    public static String vG(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static int yiw(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i;
        }
        return 5;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        qh = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        pvs = null;
    }

    public static Intent pvs(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean icD(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean pvs(Context context, Intent intent) {
        return vG(context, intent) > 0;
    }

    public static icD icD(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
            return new icD(null, 0);
        }
        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
        if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
            return new icD(new ComponentName(activityInfo.packageName, activityInfo.name), queryIntentActivities.size());
        }
        return new icD(null, queryIntentActivities.size());
    }

    /* compiled from: ToolUtils.java */
    public static class icD {
        public final int icD;
        public final ComponentName pvs;

        public icD(ComponentName componentName, int i) {
            this.pvs = componentName;
            this.icD = i;
        }
    }

    public static int vG(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean pvs() {
        return (com.bytedance.sdk.openadsdk.core.IP.pvs() == null || com.bytedance.sdk.openadsdk.core.IP.pvs().Jd()) ? false : true;
    }

    public static boolean vG(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.icD.pvs(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar == null) {
            return null;
        }
        try {
            return vG(cRVar.VLm());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int pvs(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static String icD() {
        String icD2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                icD2 = com.bytedance.sdk.openadsdk.multipro.Jd.pvs.icD("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                icD2 = com.bytedance.sdk.openadsdk.core.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).icD("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (icD2 != null && !"unKnow".equals(icD2)) {
            return icD2;
        }
        FutureTask futureTask = new FutureTask(new pvs(2));
        icD.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.Ju.pvs("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String vG() {
        if (!TextUtils.isEmpty(NB)) {
            return NB;
        }
        com.bytedance.sdk.openadsdk.multipro.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        String pvs2 = com.bytedance.sdk.openadsdk.core.so.pvs("sdk_local_web_ua", 86400000L);
        NB = pvs2;
        if (TextUtils.isEmpty(pvs2)) {
            ReentrantLock reentrantLock = sUS;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(NB)) {
                            NB = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.mnm.pvs());
                        }
                        com.bytedance.sdk.openadsdk.core.so.pvs("sdk_local_web_ua", NB);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "", e);
                        return NB;
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "", e2);
                        return NB;
                    }
                }
            } finally {
                sUS.unlock();
            }
        }
        return NB;
    }

    /* compiled from: ToolUtils.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.jlb$1, reason: invalid class name */
    static class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(jlb.NB)) {
                    SSWebView sSWebView = new SSWebView(com.bytedance.sdk.openadsdk.core.mnm.pvs());
                    sSWebView.setWebViewClient(new SSWebView.pvs());
                    String unused = jlb.NB = sSWebView.getUserAgentString();
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ny() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.mnm.pvs());
            webView.setWebViewClient(new SSWebView.pvs());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                    com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* compiled from: ToolUtils.java */
    public static class pvs implements Callable<String> {
        private final int pvs;

        pvs(int i) {
            this.pvs = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            int i = this.pvs;
            if (i == 1) {
                str = vG();
            } else if (i == 2) {
                str = icD();
            }
            return str;
        }

        private String icD() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                                com.bytedance.sdk.openadsdk.multipro.Jd.pvs.pvs("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                com.bytedance.sdk.openadsdk.core.vG.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()).pvs("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.Ju.pvs("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        private synchronized String vG() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.jlb.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = jlb.ny();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }
    }

    public static String Jd() {
        return rCZ.pvs();
    }

    public static synchronized String NB() {
        String str;
        Context pvs2;
        synchronized (jlb.class) {
            if (TextUtils.isEmpty(yiw) && (pvs2 = com.bytedance.sdk.openadsdk.core.mnm.pvs()) != null) {
                try {
                    yiw = pvs2.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
            str = yiw;
        }
        return str;
    }

    public static synchronized String sUS() {
        String str;
        synchronized (jlb.class) {
            if (TextUtils.isEmpty(so) && com.bytedance.sdk.openadsdk.core.mnm.pvs() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.mnm.pvs().getPackageManager().getPackageInfo(NB(), 0);
                    so = String.valueOf(packageInfo.versionCode);
                    Mxy = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
            str = so;
        }
        return str;
    }

    public static synchronized String yiw() {
        String str;
        synchronized (jlb.class) {
            if (TextUtils.isEmpty(Mxy) && com.bytedance.sdk.openadsdk.core.mnm.pvs() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.mnm.pvs().getPackageManager().getPackageInfo(NB(), 0);
                    so = String.valueOf(packageInfo.versionCode);
                    Mxy = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
            str = Mxy;
        }
        return str;
    }

    public static String pvs(Context context) {
        String icD2 = com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("total_memory", (String) null);
        if (icD2 == null || icD(icD2) <= 0) {
            icD2 = vG("MemTotal");
            if (icD(icD2) <= 0) {
                icD2 = so();
            }
            com.bytedance.sdk.openadsdk.core.vG.pvs(context).pvs("total_memory", icD2);
        }
        return icD2;
    }

    public static long icD(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String so() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String icD(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("total_memory", "0");
    }

    public static String Mxy() {
        return vG("MemTotal");
    }

    public static String vG(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = readLine.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static long vG(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("total_internal_storage", 0L).longValue();
    }

    public static long Wyp() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long Jd(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("free_internal_storage", 0L).longValue();
    }

    public static long NB(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("total_sdcard_storage", 0L).longValue();
    }

    public static long qh() {
        try {
            if (!ZhG()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static boolean ZhG() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int sUS(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("is_root", -1);
    }

    public static boolean kj() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String Jd(String str) {
        return pvs(str, false);
    }

    public static String pvs(String str, boolean z) {
        String str2;
        String Pj = com.bytedance.sdk.openadsdk.core.mnm.Jd().Pj();
        if (TextUtils.isEmpty(Pj)) {
            int mnm = mnm();
            if (mnm == 1) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else if (mnm == 2) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return Gp.pvs(str2);
            }
            return kj(str2);
        }
        String str3 = "https://" + Pj + str;
        if (Gp.pvs() && !z) {
            str3 = Gp.pvs(str3);
        }
        return z ? kj(str3) : str3;
    }

    private static String kj(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", sUS()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String NB(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.mnm.Jd().cRf();
        }
        return TextUtils.isEmpty(str) ? mnm() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/" : !str.startsWith("http") ? "https://".concat(String.valueOf(str)) : str;
    }

    public static String Ju() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String IP() {
        int mnm = mnm();
        return (mnm == 1 || mnm == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String bNS() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int mnm() {
        try {
            String id = TimeZone.getDefault().getID();
            if (Wyp.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/")) {
                if (!qh.contains(id)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String yiw(Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int vA() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String cR() {
        int i = -vA();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    public static JSONObject pvs(boolean z, com.bytedance.sdk.openadsdk.core.model.cR cRVar, long j, long j2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", cRVar.neB());
            jSONObject.put("load_time", j);
            com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
            if (od != null) {
                jSONObject.put("video_size", od.NB());
                jSONObject.put("video_resolution", od.Mxy());
            }
            if (!z) {
                jSONObject.put("error_code", j2);
                if (TextUtils.isEmpty(str)) {
                    str = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "getVideoDownload json error", e);
        }
        return jSONObject;
    }

    public static JSONObject pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, long j, com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
        if (cRVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", cRVar.neB());
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
            if (od != null) {
                jSONObject.put("video_size", od.NB());
                jSONObject.put("video_resolution", od.Mxy());
            }
            pvs(jSONObject, pvsVar);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    private static void pvs(JSONObject jSONObject, com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
        if (jSONObject.has("video_resolution") || pvsVar == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(pvsVar.Jd()), Integer.valueOf(pvsVar.NB())));
        } catch (Throwable unused) {
        }
    }

    public static boolean sUS(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str) {
        if (cRVar != null) {
            try {
                String CjQ = cRVar.CjQ();
                if (TextUtils.isEmpty(CjQ) && cRVar.Zm() != null && cRVar.Zm().vG() == 1 && !TextUtils.isEmpty(cRVar.Zm().icD())) {
                    CjQ = cRVar.Zm().icD();
                }
                String str2 = CjQ;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.ae.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), str2, cRVar, pvs(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean icD(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        if (cRVar == null) {
            return true;
        }
        int icD2 = com.bytedance.sdk.openadsdk.core.mnm.Jd().icD(cRVar.yTz());
        int vG2 = com.bytedance.sdk.component.utils.mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs());
        if (icD2 == 1) {
            return Jd(vG2);
        }
        if (icD2 == 2) {
            return NB(vG2) || Jd(vG2) || sUS(vG2);
        }
        if (icD2 != 3) {
            return icD2 != 5 || Jd(vG2) || sUS(vG2);
        }
        return false;
    }

    public static boolean so(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static String yiw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void pvs(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !Mxy(context)) {
            return;
        }
        int length = str2.length();
        int i2 = 1;
        if (length % 3572 == 0) {
            i = length / 3572;
        } else {
            i = (length / 3572) + 1;
        }
        int i3 = 3572;
        int i4 = 0;
        while (i2 <= i) {
            if (i3 < length) {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4, i3));
                i2++;
                i4 = i3;
                i3 += 3572;
            } else {
                Log.d(str, i + "-" + i2 + ":" + str2.substring(i4));
                return;
            }
        }
    }

    public static boolean Mxy(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static long Wyp(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            Object[] objArr = new Object[2];
            Integer.valueOf(i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static long qh(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().minSdkVersion;
            Object[] objArr = new Object[2];
            Integer.valueOf(i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.ToolUtils", th.getMessage());
        }
        return i;
    }

    public static void so(final String str) {
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs();
        com.bytedance.sdk.openadsdk.Wyp.vG.pvs("reportMultiLog", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.utils.jlb.2
            @Override // com.bytedance.sdk.openadsdk.Wyp.icD
            public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                if (jlb.vG || !com.bytedance.sdk.openadsdk.core.mnm.Jd().OyE()) {
                    return null;
                }
                boolean unused = jlb.vG = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("reportMultiLog").icD(jSONObject.toString());
            }
        });
    }

    public static boolean Mxy(String str) {
        if (com.bytedance.sdk.openadsdk.core.Ju.NB()) {
            return true;
        }
        com.bytedance.sdk.component.utils.Ju.icD("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static void Wyp(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.Ju.icD("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int kj(Context context) {
        return yiw(com.bytedance.sdk.component.utils.ny.pvs(context, 0L));
    }

    public static boolean zM() {
        return Jd.get() == 1;
    }

    public static void Ju(Context context) {
        try {
            AtomicInteger atomicInteger = Jd;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs().vG();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            Jd.set(2);
        }
    }

    public static boolean so(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static void pvs(StringBuilder sb, String str, String str2) {
        int indexOf;
        if (sb == null || TextUtils.isEmpty(str) || (indexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(indexOf, str.length() + indexOf, str2);
    }

    public static int IP(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = pvs;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        pvs = valueOf;
        return valueOf.intValue();
    }

    public static com.bytedance.sdk.openadsdk.common.icD pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, SSWebView sSWebView, Context context, String str) {
        int sq = cRVar.sq();
        if (cRVar == null || !cRVar.yWX() || (sq != 1 && sq != 3)) {
            return null;
        }
        sSWebView.pvs(true, (View) new ArbitrageLoadingLayout(context));
        return new com.bytedance.sdk.openadsdk.common.icD(cRVar, sSWebView, str, false);
    }

    public static void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, SSWebView sSWebView) {
        com.bytedance.sdk.openadsdk.core.model.NB Wyp2;
        if (cRVar == null || sSWebView == null) {
            return;
        }
        int sq = cRVar.sq();
        if (cRVar.yWX()) {
            if ((sq == 2 || sq == 3) && (Wyp2 = cRVar.Wyp()) != null) {
                sSWebView.pvs(true, Wyp2.icD(), Wyp2.vG(), Wyp2.Jd(), Wyp2.NB(), Wyp2.pvs());
            }
        }
    }
}
