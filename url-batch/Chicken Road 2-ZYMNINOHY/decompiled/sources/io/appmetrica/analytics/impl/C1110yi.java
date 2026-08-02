package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110yi implements InterfaceC0569dk {

    /* renamed from: e, reason: collision with root package name */
    public static final C1084xi f13059e = new C1084xi();

    /* renamed from: f, reason: collision with root package name */
    public static final long f13060f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f13061g;

    /* renamed from: a, reason: collision with root package name */
    public final C0859p0 f13062a;

    /* renamed from: b, reason: collision with root package name */
    public final Yj f13063b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f13064c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f13065d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f13060f = timeUnit.toMillis(1L);
        f13061g = timeUnit.toMillis(4L);
    }

    public C1110yi(C0859p0 c0859p0, Yj yj, TimeProvider timeProvider) {
        this.f13062a = c0859p0;
        this.f13063b = yj;
        this.f13064c = timeProvider;
        this.f13065d = C0501b4.l().g().b();
    }

    public final void a(C1031vh c1031vh) {
        Callable pg;
        ICommonExecutor iCommonExecutor = this.f13065d;
        if (c1031vh.f12894b) {
            Yj yj = this.f13063b;
            pg = new C0529c6(yj.f11314a, yj.f11315b, yj.f11316c, c1031vh);
        } else {
            Yj yj2 = this.f13063b;
            pg = new Pg(yj2.f11315b, yj2.f11316c, c1031vh);
        }
        iCommonExecutor.submit(pg);
    }

    public final void b(C1031vh c1031vh) {
        long uptimeMillis = this.f13064c.uptimeMillis();
        Yj yj = this.f13063b;
        C0529c6 c0529c6 = new C0529c6(yj.f11314a, yj.f11315b, yj.f11316c, c1031vh);
        long j4 = kotlin.jvm.internal.i.a(Looper.myLooper(), Looper.getMainLooper()) ? f13060f : f13061g;
        if (this.f13062a.a()) {
            try {
                this.f13065d.submit(c0529c6).get(j4, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c0529c6.f13034c) {
            return;
        }
        try {
            c0529c6.a();
            Thread.sleep(Math.max(0L, j4 - (this.f13064c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0569dk
    public final void reportData(int i4, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f13065d;
        Yj yj = this.f13063b;
        iCommonExecutor.submit(new Nn(yj.f11315b, yj.f11316c, i4, bundle));
    }

    public C1110yi(C0859p0 c0859p0, Yj yj) {
        this(c0859p0, yj, new SystemTimeProvider());
    }

    public final void a(Bf bf) {
        ICommonExecutor iCommonExecutor = this.f13065d;
        Yj yj = this.f13063b;
        iCommonExecutor.submit(new C0924re(yj.f11315b, yj.f11316c, bf));
    }

    public final void b(Bf bf) {
        ICommonExecutor iCommonExecutor = this.f13065d;
        Yj yj = this.f13063b;
        iCommonExecutor.submit(new Ei(yj.f11315b, yj.f11316c, bf));
    }
}
