package com.huawei.hms.framework.network.grs;

import F0.c;
import H0.g;
import H0.h;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f14174i = "c";

    /* renamed from: j, reason: collision with root package name */
    private static final ExecutorService f14175j = ExecutorsUtils.newSingleThreadExecutor("GrsInit");

    /* renamed from: k, reason: collision with root package name */
    private static long f14176k = 0;

    /* renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f14177a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14178b;

    /* renamed from: c, reason: collision with root package name */
    private g f14179c;

    /* renamed from: d, reason: collision with root package name */
    private F0.a f14180d;

    /* renamed from: e, reason: collision with root package name */
    private c f14181e;

    /* renamed from: f, reason: collision with root package name */
    private c f14182f;

    /* renamed from: g, reason: collision with root package name */
    private E0.a f14183g;

    /* renamed from: h, reason: collision with root package name */
    private FutureTask f14184h;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    class CallableC0138a implements Callable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f14185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f14186c;

        /* renamed from: com.huawei.hms.framework.network.grs.a$a$a, reason: collision with other inner class name */
        class RunnableC0139a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G0.b f14188b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f14189c;

            RunnableC0139a(G0.b bVar, c cVar) {
                this.f14188b = bVar;
                this.f14189c = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14188b.f(CallableC0138a.this.f14185b.getPackageName(), this.f14189c);
            }
        }

        CallableC0138a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f14185b = context;
            this.f14186c = grsBaseInfo;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            a.this.f14179c = new g();
            a.this.f14181e = new c(this.f14185b, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_conf_");
            a.this.f14182f = new c(this.f14185b, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_services_");
            a aVar = a.this;
            aVar.f14180d = new F0.a(aVar.f14181e, a.this.f14182f, a.this.f14179c);
            a aVar2 = a.this;
            aVar2.f14183g = new E0.a(aVar2.f14177a, a.this.f14180d, a.this.f14179c, a.this.f14182f);
            if (G0.b.a(this.f14185b.getPackageName()) == null) {
                c cVar = new c(this.f14185b, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_local_conf_");
                String a4 = cVar.a(this.f14185b.getPackageName() + "#localConfig", "");
                if (TextUtils.isEmpty(a4) || !new G0.b().g(this.f14185b, a4)) {
                    a.f14175j.execute(new RunnableC0139a(new G0.b(this.f14185b, true), cVar));
                }
            }
            String d4 = new J0.c(this.f14186c, this.f14185b).d();
            Logger.v(a.f14174i, "scan serviceSet is: " + d4);
            String a5 = a.this.f14182f.a("services", "");
            String a6 = h.a(a5, d4);
            if (!TextUtils.isEmpty(a6)) {
                a.this.f14182f.f("services", a6);
                Logger.i(a.f14174i, "postList is:" + StringUtils.anonymizeMessage(a6));
                Logger.d(a.f14174i, "currentServices:" + StringUtils.anonymizeMessage(a5));
                if (!a6.equals(a5)) {
                    a.this.f14179c.h(a.this.f14177a.getGrsParasKey(true, true, this.f14185b));
                    a.this.f14179c.g(new J0.c(this.f14186c, this.f14185b), null, null, a.this.f14182f, a.this.f14177a.getQueryTimeout());
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - a.f14176k;
            if (a.f14176k == 0 || TimeUnit.MILLISECONDS.toHours(elapsedRealtime) > 24) {
                Logger.i(a.f14174i, "Try to clear unUsed sp data.");
                long unused = a.f14176k = SystemClock.elapsedRealtime();
                a aVar3 = a.this;
                aVar3.n(aVar3.f14181e.b());
            }
            a.this.f14180d.h(this.f14186c, this.f14185b);
            return Boolean.TRUE;
        }
    }

    a(Context context, GrsBaseInfo grsBaseInfo) {
        this.f14184h = null;
        this.f14178b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        j(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f14177a;
        FutureTask futureTask = new FutureTask(new CallableC0138a(this.f14178b, grsBaseInfo2));
        this.f14184h = futureTask;
        f14175j.execute(futureTask);
        Logger.i(f14174i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", K0.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    private void j(GrsBaseInfo grsBaseInfo) {
        try {
            this.f14177a = grsBaseInfo.m15clone();
        } catch (CloneNotSupportedException e4) {
            Logger.w(f14174i, "GrsClient catch CloneNotSupportedException", e4);
            this.f14177a = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Map map) {
        if (map == null || map.isEmpty()) {
            Logger.v(f14174i, "sp's content is empty.");
            return;
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            if (str.endsWith(this.f14178b.getPackageName() + CrashHianalyticsData.TIME)) {
                String a4 = this.f14181e.a(str, "");
                long j4 = 0;
                if (!TextUtils.isEmpty(a4) && a4.matches("\\d+")) {
                    try {
                        j4 = Long.parseLong(a4);
                    } catch (NumberFormatException e4) {
                        Logger.w(f14174i, "convert expire time from String to Long catch NumberFormatException.", e4);
                    }
                }
                String substring = str.substring(0, str.length() - 4);
                String str2 = substring + "ETag";
                if (!s(j4) || !keySet.contains(substring) || !keySet.contains(str2)) {
                    Logger.i(f14174i, "init interface auto clear some invalid sp's data: " + str);
                    this.f14181e.d(substring);
                    this.f14181e.d(str);
                    this.f14181e.d(str2);
                }
            }
        }
    }

    private boolean s(long j4) {
        return System.currentTimeMillis() - j4 <= 604800000;
    }

    private boolean z() {
        String str;
        String str2;
        FutureTask futureTask = this.f14184h;
        if (futureTask == null) {
            return false;
        }
        try {
            return ((Boolean) futureTask.get(8L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException e4) {
            e = e4;
            str = f14174i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(f14174i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e5) {
            e = e5;
            str = f14174i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(f14174i, "init compute task timed out");
            return false;
        } catch (Exception e6) {
            e = e6;
            str = f14174i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    String g(String str, String str2, int i4) {
        if (this.f14177a == null || str == null || str2 == null) {
            Logger.w(f14174i, "invalid para!");
            return null;
        }
        if (z()) {
            return this.f14183g.d(str, str2, this.f14178b, i4);
        }
        return null;
    }

    Map h(String str, int i4) {
        if (this.f14177a != null && str != null) {
            return z() ? this.f14183g.g(str, this.f14178b, i4) : new HashMap();
        }
        Logger.w(f14174i, "invalid para!");
        return new HashMap();
    }

    void i() {
        if (z()) {
            String grsParasKey = this.f14177a.getGrsParasKey(true, true, this.f14178b);
            this.f14181e.d(grsParasKey);
            this.f14181e.d(grsParasKey + CrashHianalyticsData.TIME);
            this.f14181e.d(grsParasKey + "ETag");
            this.f14179c.h(grsParasKey);
        }
    }

    void l(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i4) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(f14174i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f14177a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (z()) {
            this.f14183g.j(str, iQueryUrlsCallBack, this.f14178b, i4);
        } else {
            Logger.i(f14174i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    void m(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i4) {
        if (iQueryUrlCallBack == null) {
            Logger.w(f14174i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f14177a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (z()) {
            this.f14183g.k(str, str2, iQueryUrlCallBack, this.f14178b, i4);
        } else {
            Logger.i(f14174i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    boolean o(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass() && (obj instanceof a)) {
            return this.f14177a.compare(((a) obj).f14177a);
        }
        return false;
    }

    boolean r() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!z() || (grsBaseInfo = this.f14177a) == null || (context = this.f14178b) == null) {
            return false;
        }
        this.f14180d.e(grsBaseInfo, context);
        return true;
    }

    a(GrsBaseInfo grsBaseInfo) {
        this.f14184h = null;
        j(grsBaseInfo);
    }
}
