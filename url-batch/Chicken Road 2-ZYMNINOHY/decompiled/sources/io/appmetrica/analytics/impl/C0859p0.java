package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859p0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f12539k = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f12540a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f12541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12542c;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f12543d;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f12544e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12545f;

    /* renamed from: g, reason: collision with root package name */
    public final F1 f12546g;

    /* renamed from: h, reason: collision with root package name */
    public final G1 f12547h;

    /* renamed from: i, reason: collision with root package name */
    public final RunnableC0807n0 f12548i;

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnectionC0833o0 f12549j;

    public C0859p0(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C0501b4.l().e(), new G1());
    }

    public final synchronized boolean a() {
        return this.f12543d != null;
    }

    public final void b() {
        synchronized (this.f12545f) {
            this.f12541b.remove(this.f12548i);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f12541b;
        synchronized (this.f12545f) {
            try {
                iCommonExecutor.remove(this.f12548i);
                if (!this.f12542c) {
                    iCommonExecutor.executeDelayed(this.f12548i, f12539k);
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
                    CountDownLatch countDownLatch = this.f12544e;
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

    public C0859p0(Context context, ICommonExecutor iCommonExecutor, F1 f12, G1 g12) {
        this.f12543d = null;
        this.f12545f = new Object();
        this.f12548i = new RunnableC0807n0(this);
        this.f12549j = new ServiceConnectionC0833o0(this);
        this.f12540a = context.getApplicationContext();
        this.f12541b = iCommonExecutor;
        this.f12542c = false;
        this.f12546g = f12;
        this.f12547h = g12;
    }
}
