package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.zi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0683zi implements InterfaceC0155ek {
    public static final C0658yi e = new C0658yi();
    public static final long f;
    public static final long g;

    /* renamed from: a, reason: collision with root package name */
    public final C0416p0 f1599a;
    public final Zj b;
    public final TimeProvider c;
    public final ICommonExecutor d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = timeUnit.toMillis(1L);
        g = timeUnit.toMillis(4L);
    }

    public C0683zi(C0416p0 c0416p0, Zj zj, TimeProvider timeProvider) {
        this.f1599a = c0416p0;
        this.b = zj;
        this.c = timeProvider;
        this.d = C0088c4.l().g().b();
    }

    public final void a(C0607wh c0607wh) {
        AbstractCallableC0657yh qg;
        ICommonExecutor iCommonExecutor = this.d;
        if (c0607wh.b) {
            Zj zj = this.b;
            qg = new C0116d6(zj.f1149a, zj.b, zj.c, c0607wh);
        } else {
            Zj zj2 = this.b;
            qg = new Qg(zj2.b, zj2.c, c0607wh);
        }
        iCommonExecutor.submit(qg);
    }

    public final void b(C0607wh c0607wh) {
        long uptimeMillis = this.c.uptimeMillis();
        Zj zj = this.b;
        C0116d6 c0116d6 = new C0116d6(zj.f1149a, zj.b, zj.c, c0607wh);
        long j = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) ? f : g;
        if (this.f1599a.a()) {
            try {
                this.d.submit(c0116d6).get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c0116d6.c) {
            return;
        }
        try {
            c0116d6.a();
            Thread.sleep(Math.max(0L, j - (this.c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0155ek
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.d;
        Zj zj = this.b;
        iCommonExecutor.submit(new On(zj.b, zj.c, i, bundle));
    }

    public C0683zi(C0416p0 c0416p0, Zj zj) {
        this(c0416p0, zj, new SystemTimeProvider());
    }

    public final void a(Cf cf) {
        ICommonExecutor iCommonExecutor = this.d;
        Zj zj = this.b;
        iCommonExecutor.submit(new C0504se(zj.b, zj.c, cf));
    }

    public final void b(Cf cf) {
        ICommonExecutor iCommonExecutor = this.d;
        Zj zj = this.b;
        iCommonExecutor.submit(new Fi(zj.b, zj.c, cf));
    }
}
