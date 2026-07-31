package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class Kh implements Callable {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Jh f37894d = new Jh();

    /* renamed from: a, reason: collision with root package name */
    public final C2793m0 f37895a;

    /* renamed from: b, reason: collision with root package name */
    public final Zk f37896b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37897c;

    public Kh(C2793m0 c2793m0, Zk zk) {
        this.f37895a = c2793m0;
        this.f37896b = zk;
    }

    public abstract void a(IAppMetricaService iAppMetricaService);

    public void a(@Nullable Throwable th) {
    }

    @NotNull
    public final C2793m0 b() {
        return this.f37895a;
    }

    public boolean c() {
        C2793m0 c2793m0 = this.f37895a;
        synchronized (c2793m0) {
            try {
                if (c2793m0.f39425d == null) {
                    c2793m0.f39426e = new CountDownLatch(1);
                    Intent a4 = Ak.a(c2793m0.f39422a);
                    try {
                        c2793m0.f39428g.b(c2793m0.f39422a);
                        c2793m0.f39422a.bindService(a4, c2793m0.f39430i, 1);
                    } catch (Throwable unused) {
                    }
                }
            } finally {
            }
        }
        this.f37895a.a(5000L);
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        a();
        return Unit.f41027a;
    }

    public final boolean d() {
        return this.f37897c;
    }

    public final void a(boolean z4) {
        this.f37897c = z4;
    }

    public void a() {
        IAppMetricaService iAppMetricaService;
        try {
            if (this.f37897c) {
                return;
            }
            this.f37897c = true;
            int i4 = 0;
            do {
                C2793m0 c2793m0 = this.f37895a;
                synchronized (c2793m0) {
                    iAppMetricaService = c2793m0.f39425d;
                }
                if (iAppMetricaService != null) {
                    try {
                        a(iAppMetricaService);
                        Zk zk = this.f37896b;
                        if (zk != null && !((C3044vi) zk).a()) {
                            return;
                        }
                        this.f37895a.c();
                        return;
                    } catch (RemoteException unused) {
                    }
                }
                i4++;
                if (!c() || U1.f38342e.get()) {
                    return;
                }
            } while (i4 < 3);
        } catch (Throwable th) {
            a(th);
        }
    }
}
