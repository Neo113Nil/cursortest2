package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.ironsource.C4913ua;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
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

/* loaded from: classes8.dex */
public class oub {
    private static String cn;
    private static final byte[] klz;
    private static final byte[] mw;
    private static final HashSet<String> rc;
    private static String rt;
    public static Integer zmn;
    private static final ExecutorService fs = Executors.newSingleThreadExecutor();
    private static volatile boolean zn = false;
    private static final AtomicInteger fb = new AtomicInteger(0);
    private static volatile String btk = "";
    private static final ReentrantLock hhw = new ReentrantLock();
    private static String nps = null;
    private static String zg = null;
    private static String bvs = null;
    private static final HashSet<String> iv = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    public static boolean btk(int i) {
        return i == 5;
    }

    public static boolean fb(int i) {
        return i == 4;
    }

    public static boolean fb(Context context) {
        return false;
    }

    public static boolean hhw(int i) {
        return i == 6;
    }

    public static int nps(int i) {
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

    public static void zmn(@NonNull com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, @NonNull View view) {
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        rc = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        zmn = null;
        klz = new byte[]{108, 111, 97, 100, 105, 110, 103};
        mw = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static Intent zmn(Context context, String str) {
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

    @NonNull
    public static fs zmn(Context context, Intent intent) {
        return new fs(null, 0);
    }

    public static class fs {
        public final int fs;
        public final ComponentName zmn;

        public fs(ComponentName componentName, int i) {
            this.zmn = componentName;
            this.fs = i;
        }
    }

    public static boolean zmn() {
        return (com.bytedance.sdk.openadsdk.core.cyb.zmn() == null || com.bytedance.sdk.openadsdk.core.cyb.zmn().fb()) ? false : true;
    }

    public static boolean fs(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.fs.zmn(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String zmn(int i) {
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

    public static String fs(int i) {
        if (i == 1) {
            return "embeded_ad_landingpage";
        }
        if (i == 2) {
            return "banner_ad_landingpage";
        }
        if (i == 3) {
            return "interaction_landingpage";
        }
        if (i == 4) {
            return "splash_ad_landingpage";
        }
        if (i == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i == 7) {
            return "rewarded_video_landingpage";
        }
        return "unknow";
    }

    public static String zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            return null;
        }
        try {
            return zn(nqiVar.ldx());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            return -1;
        }
        int ldx = nqiVar.ldx();
        int i = 1;
        if (ldx == 1) {
            return 2;
        }
        if (ldx == 3) {
            return 4;
        }
        if (ldx != 5) {
            i = 7;
            if (ldx != 7) {
                return ldx != 8 ? -1 : 5;
            }
        }
        return i;
    }

    public static int zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.hashCode();
        switch (str) {
        }
        return 1;
    }

    public static String zn(int i) {
        if (i == 1) {
            return "banner_ad";
        }
        if (i == 2) {
            return "interaction";
        }
        if (i == 3 || i == 4) {
            return "open_ad";
        }
        if (i == 7) {
            return "rewarded_video";
        }
        if (i == 8) {
            return "fullscreen_interstitial_ad";
        }
        return "embeded_ad";
    }

    public static String fs() {
        String fs2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        try {
            fs2 = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (fs2 != null && !"unKnow".equals(fs2)) {
            return fs2;
        }
        FutureTask futureTask = new FutureTask(new zmn(2));
        fs.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.iqz.zn("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static void zn() {
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.utils.oub.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", oub.so());
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("recycle_version_not_valid").fs(jSONObject.toString());
            }
        });
    }

    public static String fb() {
        if (!TextUtils.isEmpty(btk)) {
            return btk;
        }
        com.bytedance.sdk.openadsdk.kw.zmn.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        String zmn2 = com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_local_web_ua", 86400000L);
        btk = zmn2;
        if (TextUtils.isEmpty(zmn2)) {
            ReentrantLock reentrantLock = hhw;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(btk)) {
                            btk = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.kgc.zmn());
                        }
                        com.bytedance.sdk.openadsdk.core.iv.zmn("sdk_local_web_ua", btk);
                        reentrantLock.unlock();
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "", e);
                        hhw.unlock();
                        return btk;
                    } catch (NoClassDefFoundError e2) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "", e2);
                        hhw.unlock();
                        return btk;
                    }
                }
            } catch (Throwable th) {
                hhw.unlock();
                throw th;
            }
        }
        return btk;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.oub$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(oub.btk)) {
                    com.bytedance.sdk.component.bvs.nps npsVar = new com.bytedance.sdk.component.bvs.nps(com.bytedance.sdk.openadsdk.core.kgc.zmn(), nps.zn.USER_AGENT);
                    npsVar.setWebViewClient(new nps.zmn());
                    String unused = oub.btk = npsVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.zak.zmn(npsVar);
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "", e);
            } catch (NoClassDefFoundError e2) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String fkt() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            webView.setWebViewClient(new nps.zmn());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static class zmn implements Callable<String> {
        private final int zmn;

        zmn(int i) {
            this.zmn = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String str;
            try {
                str = "unKnow";
                int i = this.zmn;
                if (i == 1) {
                    str = zn();
                } else if (i == 2) {
                    str = fs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return str;
        }

        private String fs() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("android_system_ua", str);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.iqz.zn("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        private synchronized String zn() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.oub.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = oub.fkt();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", e.getMessage());
            }
            return strArr[0];
        }
    }

    public static String btk() {
        return kjb.zmn();
    }

    public static synchronized String hhw() {
        String str;
        Context zmn2;
        synchronized (oub.class) {
            try {
                if (TextUtils.isEmpty(nps) && (zmn2 = com.bytedance.sdk.openadsdk.core.kgc.zmn()) != null) {
                    try {
                        nps = zmn2.getPackageName();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                    }
                }
                str = nps;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static synchronized String nps() {
        String str;
        synchronized (oub.class) {
            try {
                if (TextUtils.isEmpty(zg) && com.bytedance.sdk.openadsdk.core.kgc.zmn() != null) {
                    try {
                        PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.kgc.zmn().getPackageManager().getPackageInfo(hhw(), 0);
                        zg = String.valueOf(packageInfo.versionCode);
                        bvs = packageInfo.versionName;
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                    }
                }
                str = zg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static synchronized String zg() {
        String str;
        synchronized (oub.class) {
            try {
                if (TextUtils.isEmpty(bvs) && com.bytedance.sdk.openadsdk.core.kgc.zmn() != null) {
                    try {
                        PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.kgc.zmn().getPackageManager().getPackageInfo(hhw(), 0);
                        zg = String.valueOf(packageInfo.versionCode);
                        bvs = packageInfo.versionName;
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                    }
                }
                str = bvs;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static String zmn(Context context) {
        String fs2 = com.bytedance.sdk.openadsdk.core.zn.zmn().fs("total_memory", (String) null);
        if (fs2 == null || fs(fs2) <= 0) {
            fs2 = zn("MemTotal");
            if (fs(fs2) <= 0) {
                fs2 = bvs();
            }
            com.bytedance.sdk.openadsdk.core.zn.zmn().zmn("total_memory", fs2);
        }
        return fs2;
    }

    public static long fs(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String bvs() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.totalMem;
            if (j > 0) {
                return String.valueOf(j / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String iv() {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("total_memory", "0");
    }

    public static String rc() {
        return zn("MemTotal");
    }

    public static String zn(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
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
                            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.getMessage());
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

    public static long fs(Context context) {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("total_internal_storage", 0L).longValue();
    }

    public static long klz() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long mw() {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("free_internal_storage", 0L).longValue();
    }

    public static long rt() {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("total_sdcard_storage", 0L).longValue();
    }

    public static long cn() {
        try {
            if (!hgd()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    private static boolean hgd() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int cyb() {
        return com.bytedance.sdk.openadsdk.core.zn.zmn().fs("is_root", -1);
    }

    public static boolean olo() {
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

    public static String fb(String str) {
        return zmn(str, false, false);
    }

    public static String zmn(@NonNull String str, boolean z, boolean z2) {
        String kgc;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z2) {
            kgc = phc();
        } else {
            kgc = kgc();
        }
        if (TextUtils.isEmpty(kgc)) {
            kgc = "api16-access-ttp.tiktokpangle.us";
        }
        String str2 = d.u + kgc + str;
        if (!TextUtils.isEmpty(str) && (str.equals("/api/ad/union/sdk/compliance_status/") || str.equals("/api/ad/union/sdk/register_status/"))) {
            return str2;
        }
        if (hgd.zmn() && !z) {
            str2 = hgd.zmn(str2);
        }
        return z ? rt(str2) : str2;
    }

    public static List<String> zmn(@NonNull String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        Set<String> hip = com.bytedance.sdk.openadsdk.core.kgc.fb().hip();
        if (hip != null && !hip.isEmpty()) {
            for (String str2 : hip) {
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = d.u + str2 + str;
                    if (hgd.zmn() && !z) {
                        str3 = hgd.zmn(str3);
                    }
                    if (z) {
                        str3 = rt(str3);
                    }
                    arrayList.add(str3);
                }
            }
        }
        return arrayList;
    }

    public static String kgc() {
        String ww = com.bytedance.sdk.openadsdk.core.kgc.fb().ww();
        return TextUtils.isEmpty(ww) ? nqi.zmn() : ww;
    }

    public static String kw() {
        String hsp = com.bytedance.sdk.openadsdk.core.kgc.fb().hsp();
        if (!TextUtils.isEmpty(hsp)) {
            return hsp;
        }
        String zmn2 = nqi.zmn();
        if (TextUtils.isEmpty(zmn2)) {
            return hsp;
        }
        return d.u + zmn2 + "/service/2/dual_events/";
    }

    public static List<String> iqz() {
        ArrayList arrayList = new ArrayList();
        Set<String> utx = com.bytedance.sdk.openadsdk.core.kgc.fb().utx();
        if (utx != null && !utx.isEmpty()) {
            for (String str : utx) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String phc() {
        String mrt = com.bytedance.sdk.openadsdk.core.settings.rc.mrt();
        if (!TextUtils.isEmpty(mrt)) {
            return mrt;
        }
        String oub = com.bytedance.sdk.openadsdk.core.kgc.fb().oub();
        return TextUtils.isEmpty(oub) ? nqi.zmn() : oub;
    }

    private static String rt(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(C4913ua.b, "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", nps()).toString();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", e.getMessage());
            return str;
        }
    }

    public static String btk(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.kgc.fb().jy();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? d.u.concat(str) : str;
    }

    public static String hhw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.startsWith("http") ? d.u.concat(str) : str;
    }

    public static String doe() {
        return String.format(Constants.BASE_URL_NO_SUB_DOMAIN_FORMAT, "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String nqi() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static String uqh() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int bjh() {
        try {
            String id = TimeZone.getDefault().getID();
            if (iv.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/")) {
                if (!rc.contains(id)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String zn(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", e.toString());
            return "";
        }
    }

    public static int rp() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static String kjb() {
        int i = -rp();
        if (i >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i));
        }
        return "Etc/GMT".concat(String.valueOf(i));
    }

    public static JSONObject zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, long j, com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
        if (nqiVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", nqiVar.ji());
            jSONObject.put("buffers_time", j);
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
            if (mrt != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, mrt.btk());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, mrt.bvs());
            }
            zmn(jSONObject, zmnVar);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "getVideoAction json error", e);
        }
        return jSONObject;
    }

    private static void zmn(JSONObject jSONObject, com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || zmnVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(zmnVar.fb()), Integer.valueOf(zmnVar.btk())));
        } catch (Throwable unused) {
        }
    }

    public static boolean nps(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            return true;
        }
        int fs2 = com.bytedance.sdk.openadsdk.core.kgc.fb().fs(nqiVar.qvo());
        int zn2 = com.bytedance.sdk.component.utils.kgc.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        if (fs2 == 1) {
            return fb(zn2);
        }
        if (fs2 == 2) {
            return btk(zn2) || fb(zn2) || hhw(zn2);
        }
        if (fs2 != 3) {
            return fs2 != 5 || fb(zn2) || hhw(zn2);
        }
        return false;
    }

    public static boolean zg(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static String bvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void zmn(String str, String str2, Context context) {
        int i;
        if (TextUtils.isEmpty(str2) || !btk(context)) {
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

    public static boolean btk(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static int hhw(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static long nps(Context context) {
        int i;
        try {
            i = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.getMessage());
            i = -1;
        }
        return i;
    }

    public static long iv(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            for (int i = 1; i < split.length; i++) {
                String str2 = split[i];
                if (!zg(str2)) {
                    return 0L;
                }
                if (str2.length() == 1) {
                    sb.append("0");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
                if (sb.length() > 18) {
                    return 0L;
                }
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return 0L;
            }
            return Long.parseLong(sb2);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", e.getMessage());
            return 0L;
        }
    }

    public static boolean rc(String str) {
        if (com.bytedance.sdk.openadsdk.core.cn.btk()) {
            return true;
        }
        com.bytedance.sdk.component.utils.iqz.zn("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static void klz(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.iqz.zn("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static int zg(Context context) {
        return nps(com.bytedance.sdk.component.utils.rp.zmn(context, 0L));
    }

    public static boolean zak() {
        return fb.get() == 1;
    }

    public static void bvs(Context context) {
        try {
            AtomicInteger atomicInteger = fb;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.cyb.fb.zmn().zn();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            fb.set(2);
        }
    }

    public static boolean zg(int i) {
        if (i <= 0) {
            return false;
        }
        return i >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i;
    }

    public static void zmn(StringBuilder sb, String str, String str2) {
        int indexOf;
        if (sb == null || TextUtils.isEmpty(str) || (indexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(indexOf, str.length() + indexOf, str2);
    }

    public static int iv(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = zmn;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = queryIntentActivities.size();
        zmn = Integer.valueOf(size);
        return size;
    }

    public static com.bytedance.sdk.openadsdk.common.btk zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, com.bytedance.sdk.component.bvs.nps npsVar, Context context, String str) {
        int ljl = nqiVar.ljl();
        if (!nqiVar.lwz() || (ljl != 1 && ljl != 3)) {
            return null;
        }
        npsVar.zmn(true, (View) new com.bytedance.sdk.openadsdk.common.fb(context));
        return new com.bytedance.sdk.openadsdk.common.btk(nqiVar, npsVar, str, false);
    }

    public static void zmn(JSONObject jSONObject) {
        int intValue;
        try {
            Pair<String, Long> fb2 = com.bytedance.sdk.openadsdk.core.iv.fb("oem_store");
            int i = -1;
            if (fb2 != null && ((intValue = Integer.valueOf((String) fb2.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) fb2.second).longValue() < com.bytedance.sdk.openadsdk.uqh.btk.zmn("oem_store_state_time", 259200000))) {
                i = intValue;
            }
            jSONObject.put("oem_store", i);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, com.bytedance.sdk.component.bvs.nps npsVar) {
        zmn(nqiVar, npsVar, false);
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, com.bytedance.sdk.component.bvs.nps npsVar, boolean z) {
        com.bytedance.sdk.openadsdk.core.model.zg bjh;
        List<Integer> list;
        if (nqiVar == null || npsVar == null) {
            return;
        }
        int ljl = nqiVar.ljl();
        if (nqiVar.lwz() && ((ljl == 2 || ljl == 3 || ljl == 5) && (bjh = nqiVar.bjh()) != null)) {
            List<Integer> hhw2 = bjh.hhw();
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (int i = 0; i < hhw2.size(); i++) {
                    arrayList.add(Integer.valueOf(hhw2.get(i).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = hhw2;
            }
            npsVar.zmn(true, bjh.fb(), bjh.btk(), list, bjh.nps(), bjh.zn());
        }
        int hw = nqiVar.hw();
        long wj = nqiVar.wj();
        if ((hw == 1 || hw == 2) && wj > 0) {
            npsVar.zmn(hw, wj);
        }
    }

    public static boolean fb(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        return nqiVar != null && nqiVar.va() == 3 && nqiVar.lwz() && (nqiVar.ljl() == 4 || nqiVar.ljl() == 5);
    }

    public static String am() {
        String str = rt;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(klz);
        rt = str2;
        return str2;
    }

    public static String yj() {
        String str = cn;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(mw);
        cn = str2;
        return str2;
    }

    public static int zmn(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            int size = copyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject zmn(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static int so() {
        return zn.zmn;
    }

    private static class zn {
        private static final int zmn;

        static {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i = 2;
            try {
                int i2 = RecyclerView.ViewHolder.$r8$clinit;
                if (RecyclerView.ViewHolder.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i = 0;
                }
            } catch (ClassNotFoundException unused) {
                i = 1;
            } catch (NoSuchMethodException unused2) {
            }
            zmn = i;
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i)));
        }
    }
}
