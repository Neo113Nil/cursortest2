package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0875pg {

    /* renamed from: a, reason: collision with root package name */
    public final Na f12583a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0745kg f12584b;

    /* renamed from: c, reason: collision with root package name */
    public final La f12585c;

    public C0875pg(Na na, InterfaceC0745kg interfaceC0745kg, La la) {
        this.f12583a = na;
        this.f12584b = interfaceC0745kg;
        this.f12585c = la;
    }

    public final void a(C0823ng c0823ng) {
        if (this.f12583a.a(c0823ng)) {
            this.f12584b.a(c0823ng);
            this.f12585c.a();
        }
    }

    public final InterfaceC0745kg b() {
        return this.f12584b;
    }

    public final La c() {
        return this.f12585c;
    }

    public final Na a() {
        return this.f12583a;
    }
}
