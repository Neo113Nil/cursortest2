package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0882ug {

    /* renamed from: a, reason: collision with root package name */
    public final Ua f8459a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0753pg f8460b;

    /* renamed from: c, reason: collision with root package name */
    public final Sa f8461c;

    public C0882ug(Ua ua, InterfaceC0753pg interfaceC0753pg, Sa sa) {
        this.f8459a = ua;
        this.f8460b = interfaceC0753pg;
        this.f8461c = sa;
    }

    public final void a(C0830sg c0830sg) {
        if (this.f8459a.a(c0830sg)) {
            this.f8460b.a(c0830sg);
            this.f8461c.a();
        }
    }

    public final InterfaceC0753pg b() {
        return this.f8460b;
    }

    public final Sa c() {
        return this.f8461c;
    }

    public final Ua a() {
        return this.f8459a;
    }
}
