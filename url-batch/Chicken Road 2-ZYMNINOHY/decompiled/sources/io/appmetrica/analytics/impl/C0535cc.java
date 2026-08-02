package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
import c3.C0295g;
import c3.InterfaceC0291c;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535cc {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f11601a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0919r9 f11602b;

    /* renamed from: c, reason: collision with root package name */
    public final C0837o4 f11603c;

    /* renamed from: d, reason: collision with root package name */
    public final We f11604d;

    /* renamed from: e, reason: collision with root package name */
    public final N4 f11605e;

    /* renamed from: f, reason: collision with root package name */
    public final C1026vc f11606f = new C1026vc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0291c f11607g = new C0295g(new C0509bc(this));

    public C0535cc(L6 l6, Qg qg, InterfaceC0919r9 interfaceC0919r9, C0837o4 c0837o4, We we) {
        this.f11601a = qg;
        this.f11602b = interfaceC0919r9;
        this.f11603c = c0837o4;
        this.f11604d = we;
        this.f11605e = new N4(l6, qg);
    }

    public final List<F8> a() {
        return this.f11605e.a();
    }

    public final List<F8> b() {
        return d3.i.j0(AbstractC0124a.H(this.f11605e.f10688c), AbstractC0124a.H((F8) ((C0295g) this.f11607g).a()));
    }
}
