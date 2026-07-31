package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractCallableC0657yh implements Callable {
    public static final C0632xh d = new C0632xh();

    /* renamed from: a, reason: collision with root package name */
    public final C0416p0 f1587a;
    public final InterfaceC0053al b;
    public boolean c;

    public AbstractCallableC0657yh(C0416p0 c0416p0, InterfaceC0053al interfaceC0053al) {
        this.f1587a = c0416p0;
        this.b = interfaceC0053al;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0416p0 b() {
        return this.f1587a;
    }

    public boolean c() {
        C0416p0 c0416p0 = this.f1587a;
        synchronized (c0416p0) {
            if (c0416p0.d == null) {
                c0416p0.e = new CountDownLatch(1);
                Intent a2 = c0416p0.h.a(c0416p0.f1423a);
                try {
                    c0416p0.g.b(c0416p0.f1423a);
                    c0416p0.f1423a.bindService(a2, c0416p0.j, 1);
                } catch (Throwable unused) {
                }
            }
        }
        this.f1587a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.INSTANCE;
    }

    public final boolean d() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.c) {
                return;
            }
            this.c = true;
            int i = 0;
            do {
                C0416p0 c0416p0 = this.f1587a;
                synchronized (c0416p0) {
                    iAppMetricaService = c0416p0.d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0053al interfaceC0053al = this.b;
                        if (interfaceC0053al == null || ((C0282ji) interfaceC0053al).a()) {
                            this.f1587a.c();
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i++;
                if (!c()) {
                    return;
                }
                AtomicBoolean atomicBoolean = P1.e;
                if (P1.e.get()) {
                    return;
                }
            } while (i < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
