package com.cmplay.kinfoc.report;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import com.cmplay.kinfoc.report.ScreenObserver;
import com.cmplay.kinfoc.report.service.KinfocReportSerivce;
import com.cmplay.kinfoc.report.service.NetWorkChangeReceiver;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class KInfocReportManager {
    private static final String APPSFLYER_DEVICE_ID = "appsflyer_device_id";
    private static final String FIRST_PLAY_GAME = "first_play_game";
    private static final String GAME_SHARE_PREF_NAME = "com.cmplay.kinfoc.game";
    private static final String HTTP = "http";
    private static final String HTTPS = "https";
    private static final String KEY_AD_ID = "key_ad_id";
    private static final String KEY_GP_CHANNEL_ID = "key_gp_channel_id";
    private static final String KFMT_APP_PATH = "infoc/kfmt.dat";
    private static final String KFMT_INNER_PATH = "infoc/innerkfmt.dat";
    private static final String KFMT_PUBLIC = "_public";
    public static final String KINFOC_TABLE_NAME_PREFIX = "cmplaysdk";
    private static final String LIB_FILE_NAME = "libinfoc.so";
    private static final String LIB_NAME = "infoc";
    private static final String PROTOCOL_VERSION = "v2/";
    public static final String SET_LOG = "SET_PROMOTION_LOG";
    private static final String TAG = "drpt";
    private static final String TEST_URL_IP_235 = "118.89.55.235";
    private static final String TEST_URL_IP_242 = "111.230.84.242";
    public static boolean loadSo = false;
    private static final ConcurrentHashMap<String, String> mKfmtMap = new ConcurrentHashMap<>();
    private static long mNativeInnerReportMgr = 0;
    private static String s_AppsflyerDeviceId = null;
    private static String s_Channel = null;
    private static String s_ChildChannel = null;
    private static String s_DebugUser = null;
    private static String s_FmtPath = null;
    private static String s_GpChannel = null;
    private static KInfocReportManager s_Instance = null;
    private static String s_MagicVer = "";
    private static String s_ProductName = null;
    private static String s_SdkVer = "";
    public static boolean s_doReport = true;
    private static String s_gaid = "";
    private static String s_inner_fmtPath = null;
    private static b s_inner_mConfig = null;
    private static int s_inner_nCommonID = 0;
    private static int s_inner_nMyID = 0;
    private static String s_inner_rptUrl = null;
    private static b s_mConfig = null;
    private static Context s_mContext = null;
    private static int s_nCommonID = 0;
    private static int s_nMyId = 0;
    private static String s_rptUrl = null;
    private static String s_testUrl = "https://debug.ksmobile.com/c/v2/";
    private long mNativeReportMgr;
    private boolean mRunReport;
    private ScreenObserver mScreenObserver;
    private long mResumeTime = 0;
    private boolean isReported = false;
    private a mWaitingRunner = null;
    private Handler mMessageHandler = new Handler(s_mContext.getMainLooper());

    private native void createNativeCreateReportService(long j);

    private native long createNativeReportClient(long j);

    private native long createNativeReportManager(Context context, AssetManager assetManager, String str, String str2, boolean z, int i, int i2, String str3);

    private static boolean loadInfoSo() {
        return true;
    }

    private native void nativeOnCacheRefresh(long j, String str);

    private native void nativeOnNetworkGone(long j);

    private native void nativeOnNetworkOk(long j);

    private native void nativeRelease(long j);

    private native void nativeReloadPublicTable(long j);

    private native void nativeReportBackgroudActive(long j);

    private native void nativeReportEvent(long j, int i, int i2, int i3, int i4);

    private native void nativeReportGameShow(long j, boolean z, int i, int i2);

    private native void nativeReportInnerBackgroudActive(long j);

    private native void nativeReportInnerShow(long j, boolean z, int i, int i2);

    private native void natvieReport(long j, long j2);

    private native void natvieSetPublicTable(long j, long j2);

    private KInfocReportManager() {
    }

    public static synchronized void initReport(Context context, String str, String str2, boolean z, int i, int i2, int i3, int i4, String str3, String str4) {
        synchronized (KInfocReportManager.class) {
            s_mContext = context;
            com.cmplay.kinfoc.report.a.c.a(context);
            s_MagicVer = com.cmplay.kinfoc.report.a.c.a("local_version", "");
            if (s_Instance == null) {
                s_nCommonID = i;
                s_nMyId = i3;
                s_rptUrl = str3;
                s_FmtPath = str;
                s_inner_nCommonID = i2;
                s_inner_nMyID = i4;
                s_inner_rptUrl = str4;
                s_inner_fmtPath = str2;
                doLoadNativeLibraries();
                s_Instance = new KInfocReportManager();
                s_Instance.init();
                s_Instance.saveAppsflyerDeviceId(s_AppsflyerDeviceId);
                NetWorkChangeReceiver.a(s_mContext);
            }
        }
    }

    public static synchronized void setDoReport(boolean z) {
        synchronized (KInfocReportManager.class) {
            s_doReport = z;
        }
    }

    public static synchronized void setProductName(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_ProductName = str;
            }
        }
    }

    public static synchronized void setSdkVer(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_SdkVer = str;
            }
        }
    }

    public static synchronized void setAppsflyerDeviceId(String str) {
        synchronized (KInfocReportManager.class) {
            if (e.f4415a) {
                Log.d("infoc_ypc", "setAppsflyerDeviceId:" + str);
            }
            s_AppsflyerDeviceId = str;
            forceUpdateAppsflyerDeviceId(str);
        }
    }

    public static synchronized void setTestReportUrl(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_testUrl = str;
            }
        }
    }

    public static synchronized void setmChannel(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_Channel = str;
            }
        }
    }

    public static synchronized void setmChildChannel(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_ChildChannel = str;
            }
        }
    }

    public static synchronized void setDebugUser(String str) {
        synchronized (KInfocReportManager.class) {
            if (s_Instance == null) {
                s_DebugUser = str;
            }
        }
    }

    public static KInfocReportManager getInstance() {
        return s_Instance;
    }

    public void startReportService() {
        Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
        intent.setAction("start_service");
        startServiceSafe(intent);
    }

    public void startReportService(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, String str6) {
        Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
        intent.setAction("start_service");
        intent.putExtra("from_unity", true);
        intent.putExtra("channel", str);
        intent.putExtra("childChannel", str2);
        intent.putExtra("fmtPath", str3);
        intent.putExtra("inner_fmtPath", str4);
        intent.putExtra("nCommonID", i);
        intent.putExtra("inner_nCommonID", i2);
        intent.putExtra("nMyID", i3);
        intent.putExtra("inner_nMyID", i4);
        intent.putExtra("rptUrl", str5);
        intent.putExtra("inner_rptUrl", str6);
        startServiceSafe(intent);
    }

    private boolean init() {
        com.cmplay.kinfoc.report.a.b.a(s_mContext);
        try {
            e.f4415a = s_mContext.getPackageManager().getApplicationInfo(s_mContext.getPackageName(), 128).metaData.getBoolean("SET_PROMOTION_LOG");
            com.cmplay.kinfoc.report.a.a.a(e.f4415a);
            if (e.f4415a) {
                Log.d(TAG, "调用了KInfocReportManager.init, s_mContext=" + s_mContext + "   UnityInfocUtil.isLog:" + e.f4415a);
            }
            if (e.f4415a) {
                Log.d(TAG, "init  协议版本，https检查修正前     \n游戏配置的上报链接:" + s_rptUrl + "\n内推SDK配置的上报链接:" + s_inner_rptUrl + "\n测试网页的上报链接:" + s_testUrl);
            }
            if (!s_testUrl.endsWith(PROTOCOL_VERSION)) {
                s_testUrl += PROTOCOL_VERSION;
            }
            if (!s_rptUrl.endsWith(PROTOCOL_VERSION)) {
                s_rptUrl += PROTOCOL_VERSION;
            }
            if (!s_inner_rptUrl.endsWith(PROTOCOL_VERSION)) {
                s_inner_rptUrl += PROTOCOL_VERSION;
            }
            if (!s_rptUrl.startsWith("https")) {
                s_rptUrl = s_rptUrl.replace("http", "https");
            }
            if (!s_inner_rptUrl.startsWith("https")) {
                s_inner_rptUrl = s_inner_rptUrl.replace("http", "https");
            }
            if (e.f4415a) {
                Log.d(TAG, "init  协议版本，https检查修正后    \n游戏配置的上报链接:" + s_rptUrl + "\n内推SDK配置的上报链接:" + s_inner_rptUrl + "\n测试网页的上报链接:" + s_testUrl);
            }
            if (e.f4415a) {
                if (e.f4415a) {
                    Log.d(TAG, "init  上报到测试网页 " + s_testUrl);
                }
                this.mNativeReportMgr = createNativeReportManager(s_mContext, s_mContext.getAssets(), s_FmtPath, "", false, s_nCommonID, s_nMyId, s_testUrl);
                mNativeInnerReportMgr = s_Instance.createNativeReportManager(s_mContext, s_mContext.getAssets(), s_inner_fmtPath, "", false, s_inner_nCommonID, s_inner_nMyID, s_testUrl);
            } else {
                if (e.f4415a) {
                    Log.d(TAG, "init  上报到正式服务器    \n游戏最终的上报链接:" + s_rptUrl + "\n内推SDK最终的上报链接:" + s_inner_rptUrl);
                }
                this.mNativeReportMgr = createNativeReportManager(s_mContext, s_mContext.getAssets(), s_FmtPath, "", false, s_nCommonID, s_nMyId, s_rptUrl);
                mNativeInnerReportMgr = s_Instance.createNativeReportManager(s_mContext, s_mContext.getAssets(), s_inner_fmtPath, "", false, s_inner_nCommonID, s_inner_nMyID, s_inner_rptUrl);
            }
            if (e.f4415a) {
                Log.d(TAG, "init() loadStringFromAssetsFile");
            }
            loadStringFromAssetsFile(KFMT_APP_PATH);
            loadStringFromAssetsFile(KFMT_INNER_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        if (e.f4415a) {
            Log.d(TAG, this.mNativeReportMgr + "init");
        }
        if (s_mConfig != null) {
            KInfocReportClient CreateClient = CreateClient();
            CreateClient.SetTable(s_mConfig.a());
            for (String str : s_mConfig.b()) {
                CreateClient.AddString(str, s_mConfig.a(str));
            }
            SetPublicTable(CreateClient);
        }
        delayInitAlarm();
        return true;
    }

    public long getmNativeReportMgr() {
        return this.mNativeReportMgr;
    }

    public long getmNativeInnerReportMgr() {
        return mNativeInnerReportMgr;
    }

    public boolean IsReportSerivce() {
        return this.mRunReport;
    }

    public String GetPublicTableName() {
        return s_mConfig.a();
    }

    public String GetPublicValue(String str) {
        return s_mConfig.a(str);
    }

    public String GetInnerPublicTableName() {
        return s_inner_mConfig.a();
    }

    public String GetInnerPublicValue(String str) {
        return s_inner_mConfig.a(str);
    }

    public void NotifyCacheRefresh(String str) {
        Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
        intent.setAction("start_service");
        intent.putExtra("extra_type", 3);
        intent.putExtra("table", str);
        startServiceSafe(intent);
    }

    public void NotifyUpdateChannel(String str, String str2, String str3) {
        Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
        intent.setAction("start_service");
        intent.putExtra("extra_type", 4);
        intent.putExtra("channel", str);
        intent.putExtra("appsflyerDeviceId", str2);
        intent.putExtra("adId", str3);
        startServiceSafe(intent);
    }

    public String GetWritablePath() {
        return s_mContext.getFilesDir().getAbsolutePath();
    }

    private static boolean loadFromParent(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        if (applicationInfo == null || packageInfo == null) {
            return false;
        }
        try {
            String str = s_mContext.getFilesDir().getParentFile().getAbsolutePath() + "/lib/libinfoc.so";
            if (!new File(str).exists()) {
                return false;
            }
            System.load(str);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean loadFromNativeDir(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        if (applicationInfo == null || packageInfo == null) {
            return false;
        }
        try {
            String str = applicationInfo.nativeLibraryDir + File.separator + LIB_FILE_NAME;
            if (!new File(str).exists()) {
                return false;
            }
            System.load(str);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean loadByExtract(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        if (applicationInfo == null || packageInfo == null) {
            return false;
        }
        try {
            File extractLibFromApk = extractLibFromApk(applicationInfo.sourceDir, packageInfo.lastUpdateTime, packageInfo.versionCode);
            if (extractLibFromApk == null || !extractLibFromApk.exists()) {
                return false;
            }
            System.load(extractLibFromApk.getAbsolutePath());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void doLoadNativeLibraries() {
        PackageInfo packageInfo;
        if (loadSo) {
            return;
        }
        ApplicationInfo applicationInfo = null;
        try {
            s_mContext.getApplicationInfo();
            s_mContext.getPackageName();
            ApplicationInfo applicationInfo2 = s_mContext.getApplicationInfo();
            try {
                packageInfo = s_mContext.getPackageManager().getPackageInfo(s_mContext.getPackageName(), 64);
            } catch (Exception e) {
                packageInfo = null;
                applicationInfo = applicationInfo2;
                e = e;
            } catch (UnsatisfiedLinkError e2) {
                packageInfo = null;
                applicationInfo = applicationInfo2;
                e = e2;
            }
            try {
                String str = applicationInfo2.nativeLibraryDir;
                Bundle bundle = applicationInfo2.metaData;
                System.loadLibrary(LIB_NAME);
                loadSo = true;
                applicationInfo = applicationInfo2;
            } catch (Exception e3) {
                e = e3;
                applicationInfo = applicationInfo2;
                loadSo = false;
                e.printStackTrace();
                if (!loadSo) {
                }
                if (loadSo) {
                }
            } catch (UnsatisfiedLinkError e4) {
                e = e4;
                applicationInfo = applicationInfo2;
                loadSo = false;
                e.printStackTrace();
                if (!loadSo) {
                }
                if (loadSo) {
                }
            }
        } catch (Exception e5) {
            e = e5;
            packageInfo = null;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            packageInfo = null;
        }
        if (!loadSo) {
            if (loadFromParent(applicationInfo, packageInfo)) {
                loadSo = true;
            } else if (loadFromNativeDir(applicationInfo, packageInfo)) {
                loadSo = true;
            } else if (loadByExtract(applicationInfo, packageInfo)) {
                loadSo = true;
            }
        }
        if (loadSo) {
            return;
        }
        Log.e(TAG, "doLoadNativeLibraries loadSo:" + loadSo);
    }

    private static void clearSoInDir(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getAbsolutePath().endsWith(LIB_FILE_NAME)) {
                    file2.delete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static File extractLibFromApk(String str, long j, int i) {
        FileOutputStream fileOutputStream;
        String str2 = s_mContext.getFilesDir().getParentFile().getAbsolutePath() + "/selflib";
        File file = new File(str2 + File.separator + String.valueOf(j) + "_" + String.valueOf(i) + "_" + LIB_FILE_NAME);
        if (file.exists()) {
            return file;
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!file2.exists()) {
            return null;
        }
        clearSoInDir(file2);
        Random random = new Random();
        random.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        String str3 = File.separator;
        sb.append(str3);
        sb.append(String.valueOf(random.nextInt()));
        sb.append(".so");
        File file3 = new File(sb.toString());
        boolean z = false;
        try {
        } catch (Throwable th) {
            th = th;
            fileOutputStream2 = str3;
        }
        try {
            try {
                ZipFile zipFile = new ZipFile(str);
                ZipEntry entry = zipFile.getEntry("lib/armeabi-v7a/libinfoc.so");
                if (entry == null) {
                    entry = zipFile.getEntry("lib/x86/libinfoc.so");
                }
                if (entry != null) {
                    InputStream inputStream = zipFile.getInputStream(entry);
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        z = true;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (z) {
                        }
                        return null;
                    }
                } else {
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        if (z) {
            file3.renameTo(file);
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public void SetPublicTable(KInfocReportClient kInfocReportClient) {
        if (this.mNativeReportMgr != 0) {
            natvieSetPublicTable(this.mNativeReportMgr, kInfocReportClient.mNativeClient);
            kInfocReportClient.mNativeClient = 0L;
        }
    }

    public void SetInnerPublicTable(KInfocReportClient kInfocReportClient) {
        if (mNativeInnerReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "SetInnerPublicTable " + mNativeInnerReportMgr + " " + kInfocReportClient.mNativeClient);
            }
            natvieSetPublicTable(mNativeInnerReportMgr, kInfocReportClient.mNativeClient);
            kInfocReportClient.mNativeClient = 0L;
        }
    }

    public static void reportData(String str, String str2) {
        try {
            if (com.cmplay.kinfoc.report.a.b.a()) {
                if (str.contains(KINFOC_TABLE_NAME_PREFIX)) {
                    KInfocReportClient CreateInnerClient = getInstance().CreateInnerClient();
                    CreateInnerClient.SetTable(str);
                    CreateInnerClient.AddInfo(str2);
                    getInstance().ReportInner(CreateInnerClient);
                    if (e.f4415a) {
                        Log.d(TAG, "KInfocReportManager.reportData  cmplaysdk strTableName:" + str + "  strParams:" + str2);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(str2) && !str2.contains("network")) {
                    str2 = str2 + "&network=" + String.valueOf(d.a(s_mContext));
                }
                KInfocReportClient CreateClient = getInstance().CreateClient();
                CreateClient.SetTable(str);
                CreateClient.AddInfo(str2);
                getInstance().Report(CreateClient);
                if (e.f4415a) {
                    Log.d(TAG, "KInfocReportManager.reportData  game   strTableName:" + str + "  data:" + str2);
                    return;
                }
                return;
            }
            Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
            intent.setAction("start_service");
            intent.putExtra("extra_type", 5);
            intent.putExtra("tableName", str);
            intent.putExtra("data", str2);
            startServiceSafe(intent);
            if (e.f4415a) {
                Log.d(TAG, "KInfocReportManager.reportData  KinfocReportSerivce");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Report(KInfocReportClient kInfocReportClient) {
        if (this.mNativeReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "Report");
            }
            natvieReport(this.mNativeReportMgr, kInfocReportClient.mNativeClient);
            kInfocReportClient.mNativeClient = 0L;
        }
    }

    public void ReportInner(KInfocReportClient kInfocReportClient) {
        if (mNativeInnerReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "ReportInner");
            }
            natvieReport(mNativeInnerReportMgr, kInfocReportClient.mNativeClient);
            kInfocReportClient.mNativeClient = 0L;
        }
    }

    public KInfocReportClient CreateClient() {
        if (this.mNativeReportMgr != 0) {
            return new KInfocReportClient(createNativeReportClient(this.mNativeReportMgr));
        }
        return null;
    }

    public KInfocReportClient CreateInnerClient() {
        if (mNativeInnerReportMgr != 0) {
            return new KInfocReportClient(createNativeReportClient(mNativeInnerReportMgr));
        }
        return null;
    }

    public void OnNetworkOk() {
        if (e.f4415a) {
            Log.d(TAG, "KInfocReportManager.OnNetworkOk");
        }
        if (this.mNativeReportMgr != 0) {
            nativeOnNetworkOk(this.mNativeReportMgr);
            nativeOnNetworkOk(mNativeInnerReportMgr);
        }
    }

    public void OnNetworkGone() {
        if (e.f4415a) {
            Log.d(TAG, "KInfocReportManager.OnNetworkGone");
        }
        if (this.mNativeReportMgr != 0) {
            nativeOnNetworkGone(this.mNativeReportMgr);
            nativeOnNetworkGone(mNativeInnerReportMgr);
        }
    }

    public void OnCacheRefresh(String str) {
        if (this.mNativeReportMgr != 0) {
            nativeOnCacheRefresh(this.mNativeReportMgr, str);
        }
        if (mNativeInnerReportMgr != 0) {
            nativeOnCacheRefresh(mNativeInnerReportMgr, str);
        }
    }

    public void Release() {
        if (this.mNativeReportMgr != 0) {
            nativeRelease(this.mNativeReportMgr);
            this.mNativeReportMgr = 0L;
        }
        if (mNativeInnerReportMgr != 0) {
            nativeRelease(mNativeInnerReportMgr);
            mNativeInnerReportMgr = 0L;
        }
        if (e.f4415a) {
            Log.d(TAG, "Release-------");
        }
    }

    public void ReportBackgroundActive() {
        if (this.mNativeReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "报后台活-------");
            }
            nativeReportBackgroudActive(this.mNativeReportMgr);
        }
        if (mNativeInnerReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "inner报后台活-------");
            }
            nativeReportInnerBackgroudActive(mNativeInnerReportMgr);
        }
    }

    public void CreateReportService() {
        if (this.mNativeReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "CreateReportService-------");
            }
            createNativeCreateReportService(this.mNativeReportMgr);
        }
        if (mNativeInnerReportMgr != 0) {
            if (e.f4415a) {
                Log.d(TAG, "CreateInnerReportService-------");
            }
            createNativeCreateReportService(mNativeInnerReportMgr);
        }
    }

    public String getAppVer() {
        return c.a(s_mContext);
    }

    public static synchronized void forceUpdateChannel(String str) {
        synchronized (KInfocReportManager.class) {
            if (e.f4415a) {
                Log.d("infoc_ypc", "forceUpdateChannel");
            }
            if (s_Instance != null) {
                s_Channel = str;
                s_GpChannel = str;
                s_Instance.saveGpChannelId(str);
                s_Instance.ReloadPublicTable();
                s_Instance.NotifyUpdateChannel(str, s_Instance.getAppsflyerDeviceId(), s_Instance.getAdId());
            }
        }
    }

    public static synchronized void notifyedUpdateChannel(String str, String str2, String str3) {
        synchronized (KInfocReportManager.class) {
            if (e.f4415a) {
                Log.d("infoc_ypc", "notifyedUpdateChannel");
            }
            if (s_Instance != null) {
                s_Channel = str;
                s_GpChannel = str;
                s_AppsflyerDeviceId = str2;
                s_gaid = str3;
                s_Instance.saveGpChannelId(str);
                s_Instance.saveAppsflyerDeviceId(str2);
                s_Instance.saveAdId(str3);
                s_Instance.ReloadPublicTable();
            }
        }
    }

    public static synchronized void forceUpdateAppsflyerDeviceId(String str) {
        synchronized (KInfocReportManager.class) {
            if (e.f4415a) {
                Log.d("infoc_ypc", "forceUpdateAppsflyerDeviceId");
            }
            if (s_Instance != null) {
                s_AppsflyerDeviceId = str;
                s_Instance.saveAppsflyerDeviceId(str);
                s_Instance.ReloadPublicTable();
                s_Instance.NotifyUpdateChannel(s_Channel, str, s_Instance.getAdId());
            }
        }
    }

    public static synchronized void forceUpdateAdId(String str) {
        synchronized (KInfocReportManager.class) {
            if (e.f4415a) {
                Log.d("infoc_ypc", "forceUpdateAppsflyerDeviceId");
            }
            if (s_Instance != null) {
                s_gaid = str;
                s_Instance.saveAdId(str);
                s_Instance.ReloadPublicTable();
                s_Instance.NotifyUpdateChannel(s_Channel, s_Instance.getAppsflyerDeviceId(), str);
            }
        }
    }

    public synchronized void ReloadPublicTable() {
        if (this.mNativeReportMgr != 0) {
            nativeReloadPublicTable(this.mNativeReportMgr);
        }
        if (mNativeInnerReportMgr != 0) {
            nativeReloadPublicTable(mNativeInnerReportMgr);
        }
    }

    public boolean getDoReport() {
        return s_doReport;
    }

    public String getChannel() {
        return s_Channel;
    }

    public String getProductName() {
        return s_ProductName;
    }

    public String getSdkVer() {
        if (e.f4415a) {
            Log.d("infoc_ypc", "getSdkVer()=" + s_SdkVer);
        }
        return s_SdkVer;
    }

    public String getMagicVer() {
        return s_MagicVer;
    }

    public String getChildChannel() {
        return s_ChildChannel;
    }

    public String getMcc() {
        String simOperator;
        Context context = s_mContext;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 0, 3);
        return sb.toString();
    }

    public String getLanguage() {
        Context context = s_mContext;
        return Locale.getDefault().getLanguage();
    }

    public String getCountry() {
        Context context = s_mContext;
        return Locale.getDefault().getCountry();
    }

    public String getImei() {
        Context context = s_mContext;
        return getAndroidID();
    }

    public String getBrand() {
        return c.e(s_mContext).j;
    }

    public String getModel() {
        return c.e(s_mContext).t;
    }

    public String getAndroidID() {
        if (s_DebugUser != null) {
            return s_DebugUser;
        }
        return Settings.Secure.getString(s_mContext.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
    }

    public static void setAdId(String str) {
        s_gaid = str;
        forceUpdateAdId(s_gaid);
        if (e.f4415a) {
            Log.d("infoc_ypc", "setGAID()=" + s_gaid);
        }
    }

    public String getUUID() {
        String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10);
        try {
            return new UUID(str.hashCode(), Build.class.getField("SERIAL").get(null).toString().hashCode()).toString();
        } catch (Exception unused) {
            return new UUID(str.hashCode(), getAndroidID().hashCode()).toString();
        }
    }

    public String getMnc() {
        String simOperator;
        Context context = s_mContext;
        if (context == null || (simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator()) == null || simOperator.length() < 5) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) simOperator, 3, 5);
        return sb.toString();
    }

    public String getPackageName() {
        return s_mContext.getPackageName();
    }

    public int getScreenWidth() {
        Resources resources = s_mContext.getResources();
        if (resources != null) {
            return resources.getDisplayMetrics().widthPixels;
        }
        WindowManager windowManager = (WindowManager) s_mContext.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getWidth();
    }

    public int getScreenHeight() {
        Resources resources = s_mContext.getResources();
        if (resources != null) {
            return resources.getDisplayMetrics().heightPixels;
        }
        WindowManager windowManager = (WindowManager) s_mContext.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getHeight();
    }

    public String getX86() {
        return Build.CPU_ABI == "x86" ? "1" : "2";
    }

    public String getCpu() {
        String str;
        BufferedReader bufferedReader;
        String str2;
        int indexOf;
        str = "";
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
            try {
                char[] cArr = new char[2048];
                bufferedReader.read(cArr, 0, 2048);
                str2 = new String(cArr);
                indexOf = str2.indexOf("Hardware");
            } finally {
                bufferedReader.close();
            }
        } catch (IOException unused) {
        }
        if (indexOf <= 0) {
            return "";
        }
        String[] split = str2.substring(indexOf).split("\\s+");
        str = split.length > 2 ? split[2] : "";
        bufferedReader.close();
        return str;
    }

    public String getInstalltime() {
        try {
            return Long.toString(s_mContext.getPackageManager().getPackageInfo(s_mContext.getPackageName(), 64).firstInstallTime / 1000);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "0";
        }
    }

    public String getOsVer() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public int getNetworkStatus() {
        return d.a(s_mContext);
    }

    public String getCurTimeFormatGMT() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    }

    public String loadStringFromAssetsFile(String str) {
        if (e.f4415a) {
            com.cmplay.kinfoc.report.a.a.a(TAG, "loadStringFromAssetsFile filePath:" + str);
        }
        String str2 = mKfmtMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            try {
                c.a("chmod 777 " + str);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s_mContext.getAssets().open(str), "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                    if (!TextUtils.isEmpty(readLine) && readLine.contains(KFMT_PUBLIC) && KFMT_APP_PATH.equalsIgnoreCase(str)) {
                        String substring = readLine.substring(0, readLine.indexOf(KFMT_PUBLIC));
                        if (e.f4415a) {
                            com.cmplay.kinfoc.report.a.a.a(TAG, "loadStringFromAssetsFile   config s_ProductName:" + s_ProductName + "    by kfmt.dat reset s_ProductName to:" + substring);
                        }
                        s_ProductName = substring;
                    }
                }
                bufferedReader.close();
                mKfmtMap.put(str, sb.toString());
            } catch (Exception e) {
                Log.d(TAG, "loadStringFromAssetsFile  error  " + e.getMessage());
                e.printStackTrace();
                if (KFMT_APP_PATH.equalsIgnoreCase(str)) {
                    s_ProductName = getPackageName();
                    if (e.f4415a) {
                        com.cmplay.kinfoc.report.a.a.a(TAG, "loadStringFromAssetsFile   reset s_ProductName to pkgName:" + s_ProductName);
                    }
                }
            }
            if (e.f4415a) {
                com.cmplay.kinfoc.report.a.a.a(TAG, "KPlatformHelperBase::readFormatData   java   loadStringFromAssetsFile  $$$load from Assets$$$  len:" + sb.toString().length() + ":\n" + sb.toString());
            }
            return sb.toString();
        }
        if (e.f4415a) {
            com.cmplay.kinfoc.report.a.a.a(TAG, "KPlatformHelperBase::readFormatData   java   loadStringFromAssetsFile  $$$load from Map$$$  len:" + str2.length() + ":\n" + str2);
        }
        return str2;
    }

    public String getGameStoreString(String str, String str2) {
        SharedPreferences sharedPreferences = s_mContext.getSharedPreferences(GAME_SHARE_PREF_NAME, 0);
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : "";
    }

    public void setGameStoreString(String str, String str2) {
        SharedPreferences sharedPreferences = s_mContext.getSharedPreferences(GAME_SHARE_PREF_NAME, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, str2);
            applyToEditor(edit);
        }
    }

    public int getFirstPlayGame() {
        SharedPreferences sharedPreferences = s_mContext.getSharedPreferences(GAME_SHARE_PREF_NAME, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(FIRST_PLAY_GAME, 1);
        }
        return 1;
    }

    public void setFirstPlayGame(int i) {
        SharedPreferences sharedPreferences = s_mContext.getSharedPreferences(GAME_SHARE_PREF_NAME, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(FIRST_PLAY_GAME, i);
            applyToEditor(edit);
        }
    }

    public String getAppsflyerDeviceId() {
        String gameStoreString;
        if (!TextUtils.isEmpty(s_AppsflyerDeviceId)) {
            gameStoreString = s_AppsflyerDeviceId;
        } else {
            gameStoreString = getGameStoreString(APPSFLYER_DEVICE_ID, "");
        }
        if (e.f4415a) {
            Log.d("infoc_ypc", "getAppsflyerDeviceId:" + gameStoreString + "   s_AppsflyerDeviceId:" + s_AppsflyerDeviceId);
        }
        return gameStoreString;
    }

    public void saveAppsflyerDeviceId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setGameStoreString(APPSFLYER_DEVICE_ID, str);
        if (e.f4415a) {
            Log.d("infoc_ypc", "saveAppsflyerDeviceId:" + str + "   after save getAppsflyerDeviceId():" + getGameStoreString(APPSFLYER_DEVICE_ID, ""));
        }
    }

    public void saveGpChannelId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setGameStoreString(KEY_GP_CHANNEL_ID, str);
        if (e.f4415a) {
            Log.d("infoc_ypc", "saveGpChannelId:" + str + "   after save getGpChannel():" + getGameStoreString(KEY_GP_CHANNEL_ID, ""));
        }
    }

    public String getGpChannel() {
        String gameStoreString;
        if (!TextUtils.isEmpty(s_GpChannel)) {
            gameStoreString = s_GpChannel;
        } else {
            gameStoreString = getGameStoreString(KEY_GP_CHANNEL_ID, "");
        }
        if (e.f4415a) {
            Log.d("infoc_ypc", "getGpChannel:" + gameStoreString + "   s_GpChannel:" + s_GpChannel);
        }
        return gameStoreString;
    }

    public void saveAdId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setGameStoreString(KEY_AD_ID, str);
        if (e.f4415a) {
            Log.d("infoc_ypc", "saveAdId()  adId:" + str + "   after save getAdId():" + getGameStoreString(KEY_AD_ID, ""));
        }
    }

    public String getAdId() {
        String str = TextUtils.isEmpty(s_gaid) ? "0" : s_gaid;
        if (e.f4415a) {
            Log.d("infoc_ypc", "getGaid()  adId:" + str + "   s_gaid:" + s_gaid);
        }
        return str;
    }

    private void applyToEditor(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private long f4396b;

        public a(long j) {
            this.f4396b = 0L;
            this.f4396b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            KInfocReportManager.this.reportGameStop(this.f4396b);
        }
    }

    public void reportGameShow() {
        if (this.mNativeReportMgr != 0) {
            nativeReportGameShow(this.mNativeReportMgr, true, 0, getFirstPlayGame());
        }
    }

    public void reportEvent(int i) {
        if (this.mNativeReportMgr != 0) {
            nativeReportEvent(this.mNativeReportMgr, i, 0, 0, 0);
        }
    }

    public synchronized void onGameResume() {
        if (this.mScreenObserver == null) {
            this.mScreenObserver = new ScreenObserver(s_mContext);
            this.mScreenObserver.requestScreenStateUpdate(new ScreenObserver.b() { // from class: com.cmplay.kinfoc.report.KInfocReportManager.1
                @Override // com.cmplay.kinfoc.report.ScreenObserver.b
                public void a() {
                }

                @Override // com.cmplay.kinfoc.report.ScreenObserver.b
                public void b() {
                    KInfocReportManager.this.onGamePause();
                }
            });
        }
        if (this.mWaitingRunner != null) {
            this.mMessageHandler.removeCallbacks(this.mWaitingRunner);
            this.mWaitingRunner = null;
        }
        if (this.mResumeTime == 0) {
            this.mResumeTime = System.currentTimeMillis();
        }
        if (!this.isReported && this.mNativeReportMgr != 0) {
            nativeReportGameShow(this.mNativeReportMgr, true, 0, getFirstPlayGame());
            nativeReportInnerShow(mNativeInnerReportMgr, true, 0, getFirstPlayGame());
            this.isReported = true;
        }
        setFirstPlayGame(0);
    }

    public synchronized void onGamePause() {
        if (this.mResumeTime > 0 && this.mWaitingRunner == null) {
            this.mWaitingRunner = new a(System.currentTimeMillis() - this.mResumeTime);
            this.mMessageHandler.postDelayed(this.mWaitingRunner, 30000L);
        }
    }

    public synchronized void onGameStop() {
        if (this.mWaitingRunner != null) {
            this.mMessageHandler.removeCallbacks(this.mWaitingRunner);
            this.mWaitingRunner = null;
        }
        if (this.mResumeTime != 0) {
            reportGameStop(System.currentTimeMillis() - this.mResumeTime);
        }
    }

    public synchronized void onGameExit() {
        long currentTimeMillis = System.currentTimeMillis() - this.mResumeTime;
        Intent intent = new Intent(s_mContext, (Class<?>) KinfocReportSerivce.class);
        intent.setAction("start_service");
        intent.putExtra("extra_type", 2);
        intent.putExtra("time", currentTimeMillis);
        startServiceSafe(intent);
        if (this.mScreenObserver != null) {
            this.mScreenObserver.stopScreenStateUpdate();
        }
    }

    public void reportGameStop(long j) {
        if (this.mNativeReportMgr != 0) {
            int i = (int) (j / 1000);
            nativeReportGameShow(this.mNativeReportMgr, false, i, getFirstPlayGame());
            nativeReportInnerShow(mNativeInnerReportMgr, false, i, getFirstPlayGame());
        }
        this.mWaitingRunner = null;
        this.mResumeTime = 0L;
    }

    public static void startServiceSafe(Intent intent) {
        try {
            s_mContext.startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void delayInitAlarm() {
        if (com.cmplay.kinfoc.report.a.b.b()) {
            this.mMessageHandler.postDelayed(new Runnable() { // from class: com.cmplay.kinfoc.report.KInfocReportManager.2
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent(KInfocReportManager.s_mContext, (Class<?>) KinfocReportSerivce.class);
                    intent.setAction("start_service");
                    intent.putExtra("extra_type", 6);
                    KInfocReportManager.startServiceSafe(intent);
                }
            }, 3000L);
        }
    }
}
