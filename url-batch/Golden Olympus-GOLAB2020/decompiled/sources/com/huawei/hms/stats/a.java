package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f14277f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f14278a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private boolean f14279b = false;

    /* renamed from: c, reason: collision with root package name */
    private final List f14280c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f14281d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f14282e = new RunnableC0140a();

    /* renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    class RunnableC0140a implements Runnable {
        RunnableC0140a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f14277f;
    }

    public void a(Runnable runnable) {
        synchronized (this.f14278a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f14279b) {
                    return;
                }
                if (this.f14280c.size() >= 60) {
                    return;
                }
                this.f14280c.add(runnable);
                this.f14281d.removeCallbacks(this.f14282e);
                this.f14281d.postDelayed(this.f14282e, 10000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f14278a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f14280c.size());
            this.f14279b = true;
            try {
                Iterator it = this.f14280c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                    it.remove();
                }
            } catch (Throwable th) {
                HMSLog.e("AnalyticsCacheManager", "<execCacheBi> failed. " + th.getMessage());
                a();
            }
            this.f14279b = false;
        }
    }

    public void a() {
        synchronized (this.f14278a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f14280c.clear();
        }
    }
}
