package com.huawei.hms.framework.common.hianalytics;

import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.common.CommonActivityUtil;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import io.appmetrica.analytics.impl.Ca;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class HianalyticsHelper {

    /* renamed from: l, reason: collision with root package name */
    private static volatile HianalyticsHelper f14157l;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14158a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14159b;

    /* renamed from: g, reason: collision with root package name */
    private ReportCallBack f14164g;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14168k;

    /* renamed from: c, reason: collision with root package name */
    private String f14160c = "hms_hwid";

    /* renamed from: d, reason: collision with root package name */
    private HiAnalyticsInstance f14161d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14162e = false;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f14163f = ExecutorsUtils.newSingleThreadExecutor("report");

    /* renamed from: h, reason: collision with root package name */
    private boolean f14165h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14166i = true;

    /* renamed from: j, reason: collision with root package name */
    private final int f14167j = new SecureRandom().nextInt(1000);

    private static class HianalyticsRunnable implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final HianalyticsBaseData f14169b;

        /* renamed from: c, reason: collision with root package name */
        private final String f14170c;

        HianalyticsRunnable(HianalyticsBaseData hianalyticsBaseData, String str) {
            this.f14169b = hianalyticsBaseData;
            this.f14170c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            HianalyticsHelper.getInstance().onEvent(this.f14169b.get(), this.f14170c);
        }
    }

    public interface ReportCallBack {
        void onReport(int i4, String str, LinkedHashMap<String, String> linkedHashMap);
    }

    private HianalyticsHelper() {
        boolean z4 = true;
        try {
            HiAnalyticsManager.getInitFlag("_default_config_tag");
            this.f14158a = true;
        } catch (Throwable unused) {
            Logger.i("HianalyticsHelper", "Hianalytics sdk not found");
            this.f14158a = false;
        }
        if (!this.f14158a) {
            d(ContextHolder.getAppContext());
        }
        try {
            if (ContextHolder.getAppContext().getPackageManager().getPackageInfo("com.huawei.works", 0) == null) {
                z4 = false;
            }
            this.f14168k = z4;
        } catch (Exception unused2) {
            this.f14168k = false;
        }
        Logger.v("HianalyticsHelper", "this time the ha %s, mini %s", Boolean.valueOf(this.f14158a), Boolean.valueOf(this.f14159b));
    }

    private boolean a(Context context, boolean z4, boolean z5) {
        if (this.f14164g != null) {
            return true;
        }
        if (z4 && ((z5 && !this.f14166i) || (!z5 && !this.f14165h))) {
            return false;
        }
        if (this.f14159b) {
            return true;
        }
        if (!this.f14158a) {
            return false;
        }
        if (this.f14162e) {
            return b();
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", -1) == 1) {
                return b();
            }
        } catch (IllegalStateException unused) {
            Logger.w("HianalyticsHelper", "the setting has illegalStateException");
        } catch (Throwable unused2) {
            Logger.w("HianalyticsHelper", "the setting has other error");
        }
        Logger.i("HianalyticsHelper", "user experience involved needs to be opened");
        return false;
    }

    private boolean b() {
        if (this.f14161d != null) {
            return true;
        }
        if (HiAnalyticsManager.getInitFlag("_default_config_tag")) {
            this.f14161d = HiAnalyticsManager.getInstanceByTag("_default_config_tag");
        } else {
            this.f14161d = HiAnalyticsManager.getInstanceByTag(this.f14160c);
        }
        return this.f14161d != null;
    }

    private void c(Context context, String str, Map map, int i4) {
        if (context == null || map == null) {
            return;
        }
        Logger.v("HianalyticsHelper", "data = %s", map);
        try {
            HiAnalyticsUtils.getInstance().onNewEvent(context, str, map, i4);
        } catch (NoSuchMethodError unused) {
            Logger.w("HianalyticsHelper", "may be you need upgrade stats sdk");
        } catch (Throwable unused2) {
            Logger.i("HianalyticsHelper", "the stats has other error,pls check it");
        }
    }

    private void d(Context context) {
        if (context == null) {
            Logger.i("HianalyticsHelper", "the appContext hasn't init");
            return;
        }
        try {
            HMSBIInitializer.getInstance(context).initBI();
            this.f14159b = true;
        } catch (NoClassDefFoundError unused) {
            Logger.w("HianalyticsHelper", "maybe you need add base sdk!");
        } catch (Throwable unused2) {
            Logger.w("HianalyticsHelper", "the hms base has other error!");
        }
    }

    public static HianalyticsHelper getInstance() {
        if (f14157l == null) {
            synchronized (HianalyticsHelper.class) {
                try {
                    if (f14157l == null) {
                        f14157l = new HianalyticsHelper();
                    }
                } finally {
                }
            }
        }
        return f14157l;
    }

    public void enablePrivacyPolicy(boolean z4) {
        this.f14162e = z4;
    }

    public void executeReportHa(HianalyticsBaseData hianalyticsBaseData, String str) {
        getReportExecutor().execute(new HianalyticsRunnable(hianalyticsBaseData, str));
    }

    public ExecutorService getReportExecutor() {
        return this.f14163f;
    }

    public boolean inRate() {
        return this.f14165h;
    }

    public boolean isEnableReport(Context context) {
        return a(context, true, false);
    }

    public boolean isEnableReportNoSeed(Context context) {
        return a(context, false, false);
    }

    public boolean isQuicEnableReport(Context context) {
        return a(context, true, true);
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        onEvent(linkedHashMap, str, 1);
    }

    public void reportData(Context context, LinkedHashMap<String, String> linkedHashMap, String str, int i4) {
        if (isEnableReportNoSeed(context)) {
            onEvent(linkedHashMap, str, i4);
        }
    }

    public void reportException(final Throwable th, final String str) {
        if (getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
            final String name = Thread.currentThread().getName();
            InitReport.reportWhenInit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    CrashHianalyticsData crashHianalyticsData = new CrashHianalyticsData();
                    crashHianalyticsData.put(HianalyticsBaseData.SDK_VERSION, "8.0.1.304");
                    crashHianalyticsData.put(CrashHianalyticsData.CRASH_TYPE, "exception");
                    crashHianalyticsData.put(CrashHianalyticsData.THREAD_NAME, name);
                    crashHianalyticsData.put(CrashHianalyticsData.EXCEPTION_NAME, th.getClass().getName());
                    crashHianalyticsData.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(th.getMessage()));
                    crashHianalyticsData.put(CrashHianalyticsData.STACK_TRACE, StringUtils.getTraceInfo(th));
                    HianalyticsHelper.getInstance().onEvent(crashHianalyticsData.get(), str);
                }
            });
        }
    }

    public void setHaTag(String str) {
        this.f14160c = str;
    }

    public void setQuicRate(int i4) {
        boolean z4 = true;
        if (i4 < 0 || i4 >= 1000) {
            this.f14166i = true;
            return;
        }
        if (this.f14167j >= i4 && !this.f14168k) {
            z4 = false;
        }
        this.f14166i = z4;
    }

    public void setRate(int i4) {
        boolean z4 = true;
        if (i4 < 0 || i4 >= 1000) {
            this.f14165h = true;
            return;
        }
        if (this.f14167j >= i4 && !this.f14168k) {
            z4 = false;
        }
        this.f14165h = z4;
        Logger.i("HianalyticsHelper", "bReportable = " + this.f14165h + ", inuser = " + this.f14168k + ", rate = " + i4);
    }

    public void setReportCallback(ReportCallBack reportCallBack) {
        this.f14164g = reportCallBack;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str, int i4) {
        if (linkedHashMap == null) {
            return;
        }
        linkedHashMap.put("in_user", "" + (this.f14168k ? 1 : 0));
        if (CommonActivityUtil.getInstance().isRegistered()) {
            linkedHashMap.put(Ca.f37288g, "" + (CommonActivityUtil.getInstance().isForeground() ? 1 : 0));
        }
        Logger.v("HianalyticsHelper", "data = %s", linkedHashMap);
        ReportCallBack reportCallBack = this.f14164g;
        if (reportCallBack != null) {
            reportCallBack.onReport(i4, str, linkedHashMap);
            return;
        }
        if (this.f14159b) {
            c(ContextHolder.getAppContext(), str, linkedHashMap, i4);
        } else if (i4 == 0) {
            Logger.v("HianalyticsHelper", "the base sdk isn't exsit, and reportType is %s", Integer.valueOf(i4));
            return;
        }
        if (this.f14158a) {
            HiAnalyticsInstance hiAnalyticsInstance = this.f14161d;
            if (hiAnalyticsInstance != null) {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
            } else {
                Logger.e("HianalyticsHelper", "the ha has error,has init but is null!");
            }
        }
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, HianalyticsBaseData.EVENT_ID);
    }
}
