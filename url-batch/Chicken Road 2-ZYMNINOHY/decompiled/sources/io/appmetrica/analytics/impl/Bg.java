package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Bg implements Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10114a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f10115b;

    /* renamed from: c, reason: collision with root package name */
    public final R4 f10116c;

    /* renamed from: d, reason: collision with root package name */
    public final Am f10117d;

    /* renamed from: e, reason: collision with root package name */
    public final Pa f10118e;

    public Bg(Context context, Q4 q4, C0863p4 c0863p4, Y4 y4, R4 r4, Hl hl) {
        this.f10114a = context;
        this.f10115b = q4;
        this.f10116c = r4;
        Am a3 = hl.a(context, q4, c0863p4.f12558a);
        this.f10117d = a3;
        this.f10118e = y4.a(context, q4, c0863p4.f12559b, a3);
        hl.a(q4, this);
    }

    public final Q4 a() {
        return this.f10115b;
    }

    public final Context b() {
        return this.f10114a;
    }

    public final void a(InterfaceC0604f4 interfaceC0604f4) {
        this.f10116c.f10870a.add(interfaceC0604f4);
    }

    public final void b(InterfaceC0604f4 interfaceC0604f4) {
        this.f10116c.f10870a.remove(interfaceC0604f4);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C0622fm c0622fm) {
        ((X4) this.f10118e).a(c0622fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0622fm c0622fm) {
        ((X4) this.f10118e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(C0863p4 c0863p4) {
        this.f10117d.a(c0863p4.f12558a);
        this.f10118e.a(c0863p4.f12559b);
    }

    public Bg(Context context, Q4 q4, C0863p4 c0863p4, Y4 y4) {
        this(context, q4, c0863p4, y4, new R4(), Hl.a());
    }

    public final void a(P5 p5, C0863p4 c0863p4) {
        if (!AbstractC1049w9.f12926c.contains(EnumC0508bb.a(p5.f10797d))) {
            this.f10118e.a(c0863p4.f12559b);
        }
        ((X4) this.f10118e).a(p5);
    }
}
