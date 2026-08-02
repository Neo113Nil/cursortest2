package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public abstract class Hd implements InterfaceC0528go, InterfaceC0790r2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6081b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0890uo f6082c;

    /* renamed from: d, reason: collision with root package name */
    public final R2 f6083d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f6084e = PublicLogger.getAnonymousInstance();

    public Hd(int i3, String str, InterfaceC0890uo interfaceC0890uo, R2 r22) {
        this.f6081b = i3;
        this.f6080a = str;
        this.f6082c = interfaceC0890uo;
        this.f6083d = r22;
    }

    public final C0554ho a() {
        C0554ho c0554ho = new C0554ho();
        c0554ho.f7488b = this.f6081b;
        c0554ho.f7487a = this.f6080a.getBytes();
        c0554ho.f7490d = new C0605jo();
        c0554ho.f7489c = new C0579io();
        return c0554ho;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0528go
    public abstract /* synthetic */ void a(C0502fo c0502fo);

    public final R2 b() {
        return this.f6083d;
    }

    public final String c() {
        return this.f6080a;
    }

    public final InterfaceC0890uo d() {
        return this.f6082c;
    }

    public final int e() {
        return this.f6081b;
    }

    public final boolean f() {
        C0838so a3 = this.f6082c.a(this.f6080a);
        if (a3.f8327a) {
            return true;
        }
        this.f6084e.warning("Attribute " + this.f6080a + " of type " + ((String) Qn.f6530a.get(this.f6081b)) + " is skipped because " + a3.f8328b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.f6084e = publicLogger;
    }
}
