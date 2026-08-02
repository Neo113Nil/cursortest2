package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zn extends A4 {

    /* renamed from: b, reason: collision with root package name */
    public final E6 f11402b;

    public Zn(C1070x4 c1070x4, E6 e6) {
        super(c1070x4);
        this.f11402b = e6;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final boolean a(P5 p5, C0992u4 c0992u4) {
        C0837o4 c0837o4 = c0992u4.f12801b.f13002d.f13106a;
        this.f11402b.a(c0837o4.f12492i);
        Kb m4 = C0817na.f12417I.m();
        if (Boolean.TRUE.equals(c0837o4.f12485b)) {
            m4.a(true);
        } else {
            if (Boolean.FALSE.equals(c0837o4.f12485b)) {
                m4.a(false);
            }
        }
        m4.a(c0837o4.f12486c);
        Boolean bool = c0837o4.n;
        C0817na.f12417I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
