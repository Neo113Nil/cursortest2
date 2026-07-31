package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2793m0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f39421j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f39422a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f39423b;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f39426e;

    /* renamed from: g, reason: collision with root package name */
    public final N1 f39428g;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f39425d = null;

    /* renamed from: f, reason: collision with root package name */
    public final Object f39427f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC2741k0 f39429h = new RunnableC2741k0(this);

    /* renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC2767l0 f39430i = new ServiceConnectionC2767l0(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f39424c = false;

    public C2793m0(Context context, ICommonExecutor iCommonExecutor, N1 n12) {
        this.f39422a = context.getApplicationContext();
        this.f39423b = iCommonExecutor;
        this.f39428g = n12;
    }

    public final synchronized boolean a() {
        return this.f39425d != null;
    }

    public final void b() {
        synchronized (this.f39427f) {
            this.f39423b.remove(this.f39429h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f39423b;
        synchronized (this.f39427f) {
            try {
                iCommonExecutor.remove(this.f39429h);
                if (!this.f39424c) {
                    iCommonExecutor.executeDelayed(this.f39429h, f39421j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l4) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f39426e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l4.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
