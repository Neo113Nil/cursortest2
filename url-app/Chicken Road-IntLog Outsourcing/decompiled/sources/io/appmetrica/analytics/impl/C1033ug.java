package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1033ug {

    /* renamed from: a, reason: collision with root package name */
    public final Ua f9408a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0904pg f9409b;

    /* renamed from: c, reason: collision with root package name */
    public final Sa f9410c;

    public C1033ug(Ua ua, InterfaceC0904pg interfaceC0904pg, Sa sa) {
        this.f9408a = ua;
        this.f9409b = interfaceC0904pg;
        this.f9410c = sa;
    }

    public final void a(C0981sg c0981sg) {
        if (this.f9408a.a(c0981sg)) {
            this.f9409b.a(c0981sg);
            this.f9410c.a();
        }
    }

    public final InterfaceC0904pg b() {
        return this.f9409b;
    }

    public final Sa c() {
        return this.f9410c;
    }

    public final Ua a() {
        return this.f9408a;
    }
}
