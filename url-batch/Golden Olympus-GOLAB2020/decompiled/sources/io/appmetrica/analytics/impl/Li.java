package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Li implements InterfaceC2787lk {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Ki f37924e = new Ki();

    /* renamed from: f, reason: collision with root package name */
    public static final long f37925f = TimeUnit.SECONDS.toMillis(4);

    /* renamed from: a, reason: collision with root package name */
    public final C2793m0 f37926a;

    /* renamed from: b, reason: collision with root package name */
    public final C2709ik f37927b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeProvider f37928c;

    /* renamed from: d, reason: collision with root package name */
    public final ICommonExecutor f37929d;

    public Li(@NotNull C2793m0 c2793m0, @NotNull C2709ik c2709ik, @NotNull TimeProvider timeProvider) {
        this.f37926a = c2793m0;
        this.f37927b = c2709ik;
        this.f37928c = timeProvider;
        this.f37929d = C3082x4.l().g().b();
    }

    public final void a(@NotNull Ih ih) {
        Kh c2548ch;
        ICommonExecutor iCommonExecutor = this.f37929d;
        if (ih.f37764b) {
            C2709ik c2709ik = this.f37927b;
            c2548ch = new C3110y6(c2709ik.f39208a, c2709ik.f39209b, c2709ik.f39210c, ih);
        } else {
            C2709ik c2709ik2 = this.f37927b;
            c2548ch = new C2548ch(c2709ik2.f39209b, c2709ik2.f39210c, ih);
        }
        iCommonExecutor.submit(c2548ch);
    }

    public final void b(@NotNull Ih ih) {
        long uptimeMillis = this.f37928c.uptimeMillis();
        C2709ik c2709ik = this.f37927b;
        C3110y6 c3110y6 = new C3110y6(c2709ik.f39208a, c2709ik.f39209b, c2709ik.f39210c, ih);
        if (this.f37926a.a()) {
            try {
                this.f37929d.submit(c3110y6).get(f37925f, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!c3110y6.f37897c) {
            try {
                c3110y6.a();
            } catch (Throwable unused2) {
            }
        }
        try {
            Thread.sleep(Math.max(0L, f37925f - (this.f37928c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused3) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2787lk
    public final void reportData(int i4, @NotNull Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.f37929d;
        C2709ik c2709ik = this.f37927b;
        iCommonExecutor.submit(new Kn(c2709ik.f39209b, c2709ik.f39210c, i4, bundle));
    }

    public Li(@NotNull C2793m0 c2793m0, @NotNull C2709ik c2709ik) {
        this(c2793m0, c2709ik, new SystemTimeProvider());
    }

    public final void a(@NotNull Pf pf) {
        ICommonExecutor iCommonExecutor = this.f37929d;
        C2709ik c2709ik = this.f37927b;
        iCommonExecutor.submit(new Fe(c2709ik.f39209b, c2709ik.f39210c, pf));
    }

    public final void b(@NotNull Pf pf) {
        ICommonExecutor iCommonExecutor = this.f37929d;
        C2709ik c2709ik = this.f37927b;
        iCommonExecutor.submit(new Ri(c2709ik.f39209b, c2709ik.f39210c, pf));
    }
}
