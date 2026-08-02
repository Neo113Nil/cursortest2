package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import b2.C0195i;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class Ch implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final Bh f5853d = new Bh();

    /* renamed from: a, reason: collision with root package name */
    public final C0737p0 f5854a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0448dl f5855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5856c;

    public Ch(C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl) {
        this.f5854a = c0737p0;
        this.f5855b = interfaceC0448dl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0737p0 b() {
        return this.f5854a;
    }

    public boolean c() {
        C0737p0 c0737p0 = this.f5854a;
        synchronized (c0737p0) {
            try {
                if (c0737p0.f8044d == null) {
                    c0737p0.f8045e = new CountDownLatch(1);
                    Intent a3 = Ek.a(c0737p0.f8041a);
                    try {
                        c0737p0.f8046g.b(c0737p0.f8041a);
                        c0737p0.f8041a.bindService(a3, c0737p0.f8048i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f5854a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C0195i.f2555a;
    }

    public final boolean d() {
        return this.f5856c;
    }

    public final void a(boolean z) {
        this.f5856c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f5856c) {
                return;
            }
            this.f5856c = true;
            int i3 = 0;
            do {
                C0737p0 c0737p0 = this.f5854a;
                synchronized (c0737p0) {
                    iAppMetricaService = c0737p0.f8044d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0448dl interfaceC0448dl = this.f5855b;
                        if (interfaceC0448dl != null && !((C0703ni) interfaceC0448dl).a()) {
                            return;
                        }
                        this.f5854a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i3++;
                if (!c() || X1.f6848e.get()) {
                    return;
                }
            } while (i3 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
