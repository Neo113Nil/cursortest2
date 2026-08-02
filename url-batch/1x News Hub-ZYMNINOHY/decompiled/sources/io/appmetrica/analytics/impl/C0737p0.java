package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737p0 {

    /* renamed from: j, reason: collision with root package name */
    public static final long f8040j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    public final Context f8041a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f8042b;

    /* renamed from: e, reason: collision with root package name */
    public CountDownLatch f8045e;

    /* renamed from: g, reason: collision with root package name */
    public final Q1 f8046g;

    /* renamed from: d, reason: collision with root package name */
    public IAppMetricaService f8044d = null;
    public final Object f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC0685n0 f8047h = new RunnableC0685n0(this);

    /* renamed from: i, reason: collision with root package name */
    public final ServiceConnectionC0711o0 f8048i = new ServiceConnectionC0711o0(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f8043c = false;

    public C0737p0(Context context, ICommonExecutor iCommonExecutor, Q1 q12) {
        this.f8041a = context.getApplicationContext();
        this.f8042b = iCommonExecutor;
        this.f8046g = q12;
    }

    public final synchronized boolean a() {
        return this.f8044d != null;
    }

    public final void b() {
        synchronized (this.f) {
            this.f8042b.remove(this.f8047h);
        }
    }

    public final void c() {
        ICommonExecutor iCommonExecutor = this.f8042b;
        synchronized (this.f) {
            try {
                iCommonExecutor.remove(this.f8047h);
                if (!this.f8043c) {
                    iCommonExecutor.executeDelayed(this.f8047h, f8040j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Long l3) {
        try {
            synchronized (this) {
                try {
                    CountDownLatch countDownLatch = this.f8045e;
                    if (countDownLatch == null) {
                        return;
                    }
                    countDownLatch.await(l3.longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException unused) {
        }
    }
}
