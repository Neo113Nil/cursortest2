package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import c3.C0297i;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1083xh implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final C1057wh f13031d = new C1057wh();

    /* renamed from: a, reason: collision with root package name */
    public final C0859p0 f13032a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f13033b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13034c;

    public AbstractCallableC1083xh(C0859p0 c0859p0, Zk zk) {
        this.f13032a = c0859p0;
        this.f13033b = zk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(Throwable th) {
    }

    public final C0859p0 b() {
        return this.f13032a;
    }

    public boolean c() {
        C0859p0 c0859p0 = this.f13032a;
        synchronized (c0859p0) {
            try {
                if (c0859p0.f12543d == null) {
                    c0859p0.f12544e = new CountDownLatch(1);
                    Intent a3 = c0859p0.f12547h.a(c0859p0.f12540a);
                    try {
                        c0859p0.f12546g.b(c0859p0.f12540a);
                        c0859p0.f12540a.bindService(a3, c0859p0.f12549j, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f13032a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return C0297i.f5732a;
    }

    public final boolean d() {
        return this.f13034c;
    }

    public final void a(boolean z) {
        this.f13034c = z;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f13034c) {
                return;
            }
            this.f13034c = true;
            int i4 = 0;
            do {
                C0859p0 c0859p0 = this.f13032a;
                synchronized (c0859p0) {
                    iAppMetricaService = c0859p0.f12543d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Zk zk = this.f13033b;
                        if (zk != null && !((C0695ii) zk).a()) {
                            return;
                        }
                        this.f13032a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i4++;
                if (!c() || O1.f10734e.get()) {
                    return;
                }
            } while (i4 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
