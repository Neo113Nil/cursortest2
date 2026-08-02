package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0625g {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f11894a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f11895b;

    /* renamed from: c, reason: collision with root package name */
    public final Uk f11896c;

    /* renamed from: d, reason: collision with root package name */
    public final Pk f11897d;

    /* renamed from: e, reason: collision with root package name */
    public final Ra f11898e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f11899f;

    public AbstractC0625g(X4 x4, Qk qk, Uk uk, Pk pk, Ra ra, SystemTimeProvider systemTimeProvider) {
        this.f11894a = x4;
        this.f11895b = qk;
        this.f11896c = uk;
        this.f11897d = pk;
        this.f11898e = ra;
        this.f11899f = systemTimeProvider;
    }

    public final /* bridge */ Dk a(Object obj) {
        return a((Ek) obj);
    }

    public final Dk b() {
        if (this.f11896c.h()) {
            return new Dk(this.f11894a, this.f11896c, a(), this.f11899f);
        }
        return null;
    }

    public final Dk a(Ek ek) {
        if (this.f11896c.h()) {
            this.f11898e.reportEvent("create session with non-empty storage");
        }
        X4 x4 = this.f11894a;
        Uk uk = this.f11896c;
        long a3 = this.f11895b.a();
        Uk uk2 = this.f11896c;
        uk2.a(Uk.f11063f, Long.valueOf(a3));
        uk2.a(Uk.f11061d, Long.valueOf(ek.f10260a));
        uk2.a(Uk.f11065h, Long.valueOf(ek.f10260a));
        uk2.a(Uk.f11064g, 0L);
        uk2.a(Uk.f11066i, Boolean.TRUE);
        uk2.b();
        this.f11894a.f11226e.a(a3, this.f11897d.f10828a, TimeUnit.MILLISECONDS.toSeconds(ek.f10261b));
        return new Dk(x4, uk, a(), new SystemTimeProvider());
    }

    public final Gk a() {
        Fk fk = new Fk(this.f11897d);
        fk.f10292g = this.f11896c.i();
        fk.f10291f = this.f11896c.f11069c.a(Uk.f11064g);
        fk.f10289d = this.f11896c.f11069c.a(Uk.f11065h);
        fk.f10288c = this.f11896c.f11069c.a(Uk.f11063f);
        fk.f10293h = this.f11896c.f11069c.a(Uk.f11061d);
        fk.f10286a = this.f11896c.f11069c.a(Uk.f11062e);
        return new Gk(fk);
    }
}
