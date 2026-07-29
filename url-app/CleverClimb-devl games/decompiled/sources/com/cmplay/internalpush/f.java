package com.cmplay.internalpush;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.cmplay.base.util.x;
import com.cmplay.kinfoc.report.KInfocReportClient;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.cmplay.kinfoc.report.service.NetWorkChangeReceiver;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: CMPlaySDK.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static String f4254a = "gp";

    /* renamed from: b, reason: collision with root package name */
    public static String f4255b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f4256c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f4257d = 5;
    public static String e = "gp";
    public static String f = "gp";
    public static String g = "";
    public static String h = "";
    public static String i = "";
    public static String j = "";
    public static int k = 0;
    public static String l = "";
    public static int m = 0;
    public static int n = 2;
    public static int o = 0;
    public static boolean p = false;
    public static String q = "";
    public static Context r;
    public static boolean s;
    private static NetWorkChangeReceiver t = new NetWorkChangeReceiver();
    private static NetWorkChangeReceiver.a u = new NetWorkChangeReceiver.a() { // from class: com.cmplay.internalpush.f.1
        @Override // com.cmplay.kinfoc.report.service.NetWorkChangeReceiver.a
        public void a(int i2) {
            com.cmplay.base.util.h.a("internal_push", "NetworkChangeNotify  type:" + i2);
            d.a(i2);
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:61:0x019f, code lost:
    
        if (r4 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bc, code lost:
    
        if (r4 != 0) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.res.AssetManager] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context) {
        long currentTimeMillis;
        InputStreamReader inputStreamReader;
        if (r != null) {
            com.cmplay.base.util.h.a("internal_push", "CMPlaySDK.init return  ##have init before##\nUI 进程:" + x.b() + "\nservice 进程:" + x.a() + "\ninner 进程:" + x.c());
            return;
        }
        currentTimeMillis = System.currentTimeMillis();
        r = context.getApplicationContext();
        try {
            boolean z = r.getPackageManager().getApplicationInfo(r.getPackageName(), 128).metaData.getBoolean("SET_PROMOTION_LOG");
            Log.d("zzb_log", "isDebug =" + z);
            if (z) {
                com.cmplay.base.util.h.a(true);
                com.ijinshan.cloudconfig.d.a.f6687a = true;
            }
        } catch (Exception e2) {
            Log.d("zzb_log", "isDebug =" + e2.getMessage());
            e2.printStackTrace();
        }
        com.cmplay.base.util.n nVar = new com.cmplay.base.util.n();
        ?? assets = r.getAssets();
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                try {
                    assets = assets.open("cmplaysdkcfg.dat");
                    try {
                        inputStreamReader = new InputStreamReader((InputStream) assets, AudienceNetworkActivity.WEBVIEW_ENCODING);
                    } catch (IOException e3) {
                        e = e3;
                    }
                    try {
                        nVar.a(inputStreamReader);
                        String a2 = nVar.a("common", "CHANNELID");
                        if (!TextUtils.isEmpty(a2)) {
                            f4254a = a2;
                            e = a2;
                        }
                        String a3 = nVar.a("common", "CHILD_CHANNELID");
                        if (!TextUtils.isEmpty(a3)) {
                            f = a3;
                        }
                        String a4 = nVar.a("common", "CLOUD_PRODUCT_NAME");
                        if (!TextUtils.isEmpty(a4)) {
                            f4255b = a4;
                        }
                        String a5 = nVar.a("common", "CLOUD_PACKAGE_NAME");
                        if (!TextUtils.isEmpty(a5)) {
                            f4256c = a5;
                        }
                        int b2 = nVar.b("common", "CLOUD_INNER_PUSH_FUNCTION_TYPE");
                        if (b2 > 0) {
                            f4257d = b2;
                        }
                        String a6 = nVar.a("common", "KINFOC_KFMT_PATH");
                        if (!TextUtils.isEmpty(a6)) {
                            h = a6;
                        }
                        String a7 = nVar.a("common", "KINFOC_PRODUCT_NAME");
                        if (!TextUtils.isEmpty(a7)) {
                            g = a7;
                        }
                        String a8 = nVar.a("common", "KINFOC_REPORT_URL");
                        if (!TextUtils.isEmpty(a8)) {
                            i = a8;
                        }
                        String a9 = nVar.a("common", "KINFOC_REPORT_URL_FOR_TEST");
                        if (!TextUtils.isEmpty(a9)) {
                            j = a9;
                        }
                        k = nVar.b("common", "KINFOC_PRODUCT_ID");
                        String a10 = nVar.a("common", "UNITY_MSG_RECEIVER");
                        if (!TextUtils.isEmpty(a10)) {
                            l = a10;
                        }
                        m = nVar.b("common", "FEEDBACK_APP_ID");
                        int b3 = nVar.b("common", "FEEDBACK_PRODUCT_ID");
                        if (b3 > 0) {
                            n = b3;
                        }
                        o = nVar.b("common", "DEFAULT_DELAY_TIME");
                        if (1 == nVar.b("common", "PLAY_REWARD_VIDEO_INDEPENDENT_PROCESS")) {
                            p = true;
                        } else {
                            p = false;
                        }
                        String a11 = nVar.a("common", "ADS_REPORT_TABLE_NAME");
                        if (!TextUtils.isEmpty(a11)) {
                            q = a11;
                        }
                        inputStreamReader.close();
                    } catch (IOException e4) {
                        e = e4;
                        inputStreamReader2 = inputStreamReader;
                        e.printStackTrace();
                        if (inputStreamReader2 != null) {
                            inputStreamReader2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (Exception unused) {
                                throw th;
                            }
                        }
                        if (assets != 0) {
                            assets.close();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (IOException e5) {
                e = e5;
                assets = 0;
            } catch (Throwable th2) {
                th = th2;
                assets = 0;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
        com.ijinshan.cloudconfig.a.f6674b = f4256c;
        com.cmplay.base.util.j.a(KInfocReportManager.KINFOC_TABLE_NAME_PREFIX);
        com.cmplay.base.util.j.b(l);
        com.cmplay.base.util.j.a(f4257d);
        com.cmplay.base.util.j.b(o);
        com.cmplay.base.util.j.a(p);
        x.a(context);
        com.cmplay.internalpush.a.d.a(context);
        e(context);
        b(context);
        d(context);
        WebViewActivity.init(context, m, n);
        if (x.a()) {
            t.a().a(context);
        }
        if (x.b()) {
            com.cmplay.base.util.p.b(r);
            r.registerReceiver(t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetWorkChangeReceiver.a(u);
        }
        com.cmplay.base.util.h.a("zzb", "内推初始化时间：" + (System.currentTimeMillis() - currentTimeMillis));
        com.cmplay.base.util.h.a("internal_push", "CMPlaySDK.init finish  \nandroid_id:" + KInfocReportManager.getInstance().getAndroidID() + "\nUI 进程:" + x.b() + "\nservice 进程:" + x.a() + "\ninner 进程:" + x.c() + "\nSDK version code:" + q.f4278b + "\nCLOUD_CHANNELID:" + f4254a + "\nCLOUD_PRODUCT_NAME:" + f4255b + "\nCLOUD_PACKAGE_NAME:" + f4256c + "\nCLOUD_INNER_PUSH_FUNCTION_TYPE:" + f4257d + "\nKINFOC_CHANNELID:" + e + "\nKINFOC_CHILD_CHANNELID:" + f + "\nKINFOC_PRODUCT_NAME:" + g + "\nKINFOC_KFMT_PATH:" + h + "\nKINFOC_REPORT_URL:" + i + "\nKINFOC_REPORT_URL_FOR_TEST:" + j + "\nKINFOC_PRODUCT_ID:" + k + "\nFEEDBACK_APP_ID:" + m + "\nFEEDBACK_PRODUCT_ID:" + n + "\nUNITY_MSG_RECEIVER:" + l + "\nDEFAULT_DELAY_TIME:" + o + "\nPLAY_REWARD_VIDEO_INDEPENDENT_PROCESS:" + p);
    }

    public static void b(Context context) {
        if (x.b() || x.a() || x.c()) {
            g.a(context, f4254a, f4255b, x.b(), x.a());
            k.a(context, new c());
        }
        if (x.b()) {
            c(context);
        }
    }

    public static void c(Context context) {
        Intent intent = new Intent(context, (Class<?>) InnerPushService.class);
        intent.putExtra("command_key", "pull_cloud_config");
        if (x.b()) {
            com.dancingbogo.skyrolline.util.d.b(context, intent);
        }
    }

    public static void d(Context context) {
        e a2 = e.a();
        com.cmplay.internalpush.video.e.a(context, true, (com.cmplay.internalpush.video.b.a) a2, (com.cmplay.base.util.c.c) a2);
        com.cmplay.internalpush.video.f.a(context, true, (com.cmplay.internalpush.video.b.a) a2, (com.cmplay.base.util.c.c) a2);
        com.cmplay.internalpush.video.g.a(context, true, (com.cmplay.internalpush.video.b.a) a2, (com.cmplay.base.util.c.c) a2);
        com.ijinshan.cloudconfig.a.a(com.cmplay.internalpush.video.h.c());
        if (x.b()) {
            e.a().a(context);
        }
    }

    public static void e(Context context) {
        com.cmplay.base.util.h.a("KInfoc", "initKInfoc  BuildConfig.DEBUG=false");
        String str = "";
        try {
            str = com.appsflyer.i.c().c(context);
        } catch (Exception unused) {
        }
        KInfocReportManager.setAppsflyerDeviceId(str);
        if (!TextUtils.isEmpty(j)) {
            KInfocReportManager.setTestReportUrl(j);
        }
        KInfocReportManager.setProductName(g);
        KInfocReportManager.setSdkVer(q.f4278b + "");
        KInfocReportManager.setmChannel(NativeUtil.getInstance().getChannel());
        KInfocReportManager.setmChildChannel(NativeUtil.getInstance().getChildChannel());
        KInfocReportManager.initReport(context, h, "infoc/innerkfmt.dat", true, k, 207, k, 207, i, "http://helpcmplaysdk1.ksmobile.com/c/v2/");
        if (x.b()) {
            try {
                KInfocReportManager.getInstance().startReportService();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            } catch (SecurityException e3) {
                e3.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static void a(final String str, final String str2, boolean z) {
        com.cmplay.base.util.e.a(new Runnable() { // from class: com.cmplay.internalpush.f.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str3 = str2;
                    if (!TextUtils.isEmpty(str3) && !str3.contains("network")) {
                        str3 = str3 + "&network=" + String.valueOf(com.cmplay.base.util.s.a(k.f4264a));
                    }
                    if (str.contains(com.cmplay.base.util.j.a())) {
                        KInfocReportClient CreateInnerClient = KInfocReportManager.getInstance().CreateInnerClient();
                        CreateInnerClient.SetTable(str);
                        CreateInnerClient.AddInfo(str3);
                        KInfocReportManager.getInstance().ReportInner(CreateInnerClient);
                        com.cmplay.base.util.h.a("Kinfoc_rpt", "CMPlaySDK.reportNeituiSdkApp  cmplaysdk strTableName:" + str + "  data:" + str3);
                        return;
                    }
                    KInfocReportClient CreateClient = KInfocReportManager.getInstance().CreateClient();
                    CreateClient.SetTable(str);
                    CreateClient.AddInfo(str3);
                    KInfocReportManager.getInstance().Report(CreateClient);
                    com.cmplay.base.util.h.a("Kinfoc_rpt", "CMPlaySDK.reportNeituiSdkApp  game   strTableName:" + str + "  data:" + str3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    public static void a(String str, String str2) {
        try {
            KInfocReportManager.getInstance();
            KInfocReportManager.reportData(str, str2);
            com.cmplay.base.util.h.a("Kinfoc_rpt", "CMPlaySDK.reportData  strTableName:" + str + "  data:" + str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
