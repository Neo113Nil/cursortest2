package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2637g {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f39016a;

    /* renamed from: b, reason: collision with root package name */
    public final Rk f39017b;

    /* renamed from: c, reason: collision with root package name */
    public final Vk f39018c;

    /* renamed from: d, reason: collision with root package name */
    public final Qk f39019d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2804mb f39020e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f39021f;

    public AbstractC2637g(@NonNull C2953s5 c2953s5, @NonNull Rk rk, @NonNull Vk vk, @NonNull Qk qk, @NonNull InterfaceC2804mb interfaceC2804mb, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f39016a = c2953s5;
        this.f39017b = rk;
        this.f39018c = vk;
        this.f39019d = qk;
        this.f39020e = interfaceC2804mb;
        this.f39021f = systemTimeProvider;
    }

    @NonNull
    public final /* bridge */ Ek a(@NonNull Object obj) {
        return a((Fk) obj);
    }

    public final Ek b() {
        if (this.f39018c.h()) {
            return new Ek(this.f39016a, this.f39018c, a(), this.f39021f);
        }
        return null;
    }

    @NonNull
    public final Ek a(@NonNull Fk fk) {
        if (this.f39018c.h()) {
            this.f39020e.reportEvent("create session with non-empty storage");
        }
        C2953s5 c2953s5 = this.f39016a;
        Vk vk = this.f39018c;
        long a4 = this.f39017b.a();
        Vk vk2 = this.f39018c;
        vk2.a(Vk.f38438f, Long.valueOf(a4));
        vk2.a(Vk.f38436d, Long.valueOf(fk.f37541a));
        vk2.a(Vk.f38440h, Long.valueOf(fk.f37541a));
        vk2.a(Vk.f38439g, 0L);
        vk2.a(Vk.f38441i, Boolean.TRUE);
        vk2.b();
        this.f39016a.f39769e.a(a4, this.f39019d.f38176a, TimeUnit.MILLISECONDS.toSeconds(fk.f37542b));
        return new Ek(c2953s5, vk, a(), new SystemTimeProvider());
    }

    public final Hk a() {
        Gk gk = new Gk(this.f39019d);
        gk.f37587g = this.f39018c.i();
        gk.f37586f = this.f39018c.f38444c.a(Vk.f38439g);
        gk.f37584d = this.f39018c.f38444c.a(Vk.f38440h);
        gk.f37583c = this.f39018c.f38444c.a(Vk.f38438f);
        gk.f37588h = this.f39018c.f38444c.a(Vk.f38436d);
        gk.f37581a = this.f39018c.f38444c.a(Vk.f38437e);
        return new Hk(gk);
    }
}
