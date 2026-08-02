package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Di implements InterfaceC0575ik {

    /* renamed from: e, reason: collision with root package name */
    public static final Ci f5900e = new Ci();
    public static final long f = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: a, reason: collision with root package name */
    public final C0737p0 f5901a;

    /* renamed from: b, reason: collision with root package name */
    public final C0447dk f5902b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f5903c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f5904d;

    public Di(C0737p0 c0737p0, C0447dk c0447dk, TimeProvider timeProvider) {
        this.f5901a = c0737p0;
        this.f5902b = c0447dk;
        this.f5903c = timeProvider;
        this.f5904d = C0585j4.l().g().b();
    }

    public final void a(Ah ah) {
        Callable ug;
        ICommonExecutor iCommonExecutor = this.f5904d;
        if (ah.f5754b) {
            C0447dk c0447dk = this.f5902b;
            ug = new C0587j6(c0447dk.f7193a, c0447dk.f7194b, c0447dk.f7195c, ah);
        } else {
            C0447dk c0447dk2 = this.f5902b;
            ug = new Ug(c0447dk2.f7194b, c0447dk2.f7195c, ah);
        }
        iCommonExecutor.submit(ug);
    }

    public final void b(Ah ah) {
        long uptimeMillis = this.f5903c.uptimeMillis();
        C0447dk c0447dk = this.f5902b;
        C0587j6 c0587j6 = new C0587j6(c0447dk.f7193a, c0447dk.f7194b, c0447dk.f7195c, ah);
        if (this.f5901a.a()) {
            try {
                this.f5904d.submit(c0587j6).get(f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c0587j6.f5856c) {
            try {
                c0587j6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f - (this.f5903c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0575ik
    public final void reportData(int i3, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f5904d;
        C0447dk c0447dk = this.f5902b;
        iCommonExecutor.submit(new Pn(c0447dk.f7194b, c0447dk.f7195c, i3, bundle));
    }

    public Di(C0737p0 c0737p0, C0447dk c0447dk) {
        this(c0737p0, c0447dk, new SystemTimeProvider());
    }

    public final void a(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f5904d;
        C0447dk c0447dk = this.f5902b;
        iCommonExecutor.submit(new C0958xe(c0447dk.f7194b, c0447dk.f7195c, gf));
    }

    public final void b(Gf gf) {
        ICommonExecutor iCommonExecutor = this.f5904d;
        C0447dk c0447dk = this.f5902b;
        iCommonExecutor.submit(new Ji(c0447dk.f7194b, c0447dk.f7195c, gf));
    }
}
