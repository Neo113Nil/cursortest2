package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0654g {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f8211a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f8212b;

    /* renamed from: c, reason: collision with root package name */
    public final Zk f8213c;

    /* renamed from: d, reason: collision with root package name */
    public final Uk f8214d;

    /* renamed from: e, reason: collision with root package name */
    public final Ya f8215e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f8216f;

    public AbstractC0654g(C0608e5 c0608e5, Vk vk, Zk zk, Uk uk, Ya ya, SystemTimeProvider systemTimeProvider) {
        this.f8211a = c0608e5;
        this.f8212b = vk;
        this.f8213c = zk;
        this.f8214d = uk;
        this.f8215e = ya;
        this.f8216f = systemTimeProvider;
    }

    public final /* bridge */ Ik a(Object obj) {
        return a((Jk) obj);
    }

    public final Ik b() {
        if (this.f8213c.h()) {
            return new Ik(this.f8211a, this.f8213c, a(), this.f8216f);
        }
        return null;
    }

    public final Ik a(Jk jk) {
        if (this.f8213c.h()) {
            this.f8215e.reportEvent("create session with non-empty storage");
        }
        C0608e5 c0608e5 = this.f8211a;
        Zk zk = this.f8213c;
        long a6 = this.f8212b.a();
        Zk zk2 = this.f8213c;
        zk2.a(Zk.f7798f, Long.valueOf(a6));
        zk2.a(Zk.f7796d, Long.valueOf(jk.f7019a));
        zk2.a(Zk.f7800h, Long.valueOf(jk.f7019a));
        zk2.a(Zk.f7799g, 0L);
        zk2.a(Zk.f7801i, Boolean.TRUE);
        zk2.b();
        this.f8211a.f8089e.a(a6, this.f8214d.f7602a, TimeUnit.MILLISECONDS.toSeconds(jk.f7020b));
        return new Ik(c0608e5, zk, a(), new SystemTimeProvider());
    }

    public final Lk a() {
        Kk kk = new Kk(this.f8214d);
        kk.f7048g = this.f8213c.i();
        kk.f7047f = this.f8213c.f7804c.a(Zk.f7799g);
        kk.f7045d = this.f8213c.f7804c.a(Zk.f7800h);
        kk.f7044c = this.f8213c.f7804c.a(Zk.f7798f);
        kk.f7049h = this.f8213c.f7804c.a(Zk.f7796d);
        kk.f7042a = this.f8213c.f7804c.a(Zk.f7797e);
        return new Lk(kk);
    }
}
