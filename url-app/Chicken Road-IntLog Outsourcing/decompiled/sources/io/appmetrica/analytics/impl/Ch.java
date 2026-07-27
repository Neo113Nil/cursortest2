package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import com.onesignal.debug.internal.crash.AnrConstants;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public abstract class Ch implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final Bh f6636d = new Bh();

    /* renamed from: a, reason: collision with root package name */
    public final C0888p0 f6637a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0599dl f6638b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6639c;

    public Ch(C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl) {
        this.f6637a = c0888p0;
        this.f6638b = interfaceC0599dl;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0888p0 b() {
        return this.f6637a;
    }

    public boolean c() {
        C0888p0 c0888p0 = this.f6637a;
        synchronized (c0888p0) {
            try {
                if (c0888p0.f8967d == null) {
                    c0888p0.f8968e = new CountDownLatch(1);
                    Intent a6 = Ek.a(c0888p0.f8964a);
                    try {
                        c0888p0.f8970g.b(c0888p0.f8964a);
                        c0888p0.f8964a.bindService(a6, c0888p0.f8972i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f6637a.a(Long.valueOf(AnrConstants.DEFAULT_ANR_THRESHOLD_MS));
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return f4.v.f5689a;
    }

    public final boolean d() {
        return this.f6639c;
    }

    public final void a(boolean z) {
        this.f6639c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f6639c) {
                return;
            }
            this.f6639c = true;
            int i2 = 0;
            do {
                C0888p0 c0888p0 = this.f6637a;
                synchronized (c0888p0) {
                    iAppMetricaService = c0888p0.f8967d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        InterfaceC0599dl interfaceC0599dl = this.f6638b;
                        if (interfaceC0599dl != null && !((C0854ni) interfaceC0599dl).a()) {
                            return;
                        }
                        this.f6637a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i2++;
                if (!c() || X1.f7685e.get()) {
                    return;
                }
            } while (i2 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
