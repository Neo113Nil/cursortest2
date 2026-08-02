package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399bo extends H4 {

    /* renamed from: b, reason: collision with root package name */
    public final L6 f7107b;

    public C0399bo(E4 e4, L6 l6) {
        super(e4);
        this.f7107b = l6;
    }

    @Override // io.appmetrica.analytics.impl.H4
    public final boolean a(W5 w5, B4 b4) {
        C0896v4 c0896v4 = b4.f5803b.f5937d.f5964a;
        this.f7107b.a(c0896v4.f8484i);
        Rb m3 = C0876ua.f8420H.m();
        if (Boolean.TRUE.equals(c0896v4.f8478b)) {
            m3.a(true);
        } else {
            if (Boolean.FALSE.equals(c0896v4.f8478b)) {
                m3.a(false);
            }
        }
        m3.a(c0896v4.f8479c);
        Boolean bool = c0896v4.f8489n;
        C0876ua.f8420H.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
