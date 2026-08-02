package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0503g {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f7342a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f7343b;

    /* renamed from: c, reason: collision with root package name */
    public final Zk f7344c;

    /* renamed from: d, reason: collision with root package name */
    public final Uk f7345d;

    /* renamed from: e, reason: collision with root package name */
    public final Ya f7346e;
    public final SystemTimeProvider f;

    public AbstractC0503g(C0457e5 c0457e5, Vk vk, Zk zk, Uk uk, Ya ya, SystemTimeProvider systemTimeProvider) {
        this.f7342a = c0457e5;
        this.f7343b = vk;
        this.f7344c = zk;
        this.f7345d = uk;
        this.f7346e = ya;
        this.f = systemTimeProvider;
    }

    public final /* bridge */ Ik a(Object obj) {
        return a((Jk) obj);
    }

    public final Ik b() {
        if (this.f7344c.h()) {
            return new Ik(this.f7342a, this.f7344c, a(), this.f);
        }
        return null;
    }

    public final Ik a(Jk jk) {
        if (this.f7344c.h()) {
            this.f7346e.reportEvent("create session with non-empty storage");
        }
        C0457e5 c0457e5 = this.f7342a;
        Zk zk = this.f7344c;
        long a3 = this.f7343b.a();
        Zk zk2 = this.f7344c;
        zk2.a(Zk.f, Long.valueOf(a3));
        zk2.a(Zk.f6956d, Long.valueOf(jk.f6216a));
        zk2.a(Zk.f6959h, Long.valueOf(jk.f6216a));
        zk2.a(Zk.f6958g, 0L);
        zk2.a(Zk.f6960i, Boolean.TRUE);
        zk2.b();
        this.f7342a.f7229e.a(a3, this.f7345d.f6770a, TimeUnit.MILLISECONDS.toSeconds(jk.f6217b));
        return new Ik(c0457e5, zk, a(), new SystemTimeProvider());
    }

    public final Lk a() {
        Kk kk = new Kk(this.f7345d);
        kk.f6243g = this.f7344c.i();
        kk.f = this.f7344c.f6963c.a(Zk.f6958g);
        kk.f6241d = this.f7344c.f6963c.a(Zk.f6959h);
        kk.f6240c = this.f7344c.f6963c.a(Zk.f);
        kk.f6244h = this.f7344c.f6963c.a(Zk.f6956d);
        kk.f6238a = this.f7344c.f6963c.a(Zk.f6957e);
        return new Lk(kk);
    }
}
