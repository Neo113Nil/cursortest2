package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0056ao extends B4 {
    public final F6 b;

    public C0056ao(C0644y4 c0644y4, F6 f6) {
        super(c0644y4);
        this.b = f6;
    }

    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(Q5 q5, C0569v4 c0569v4) {
        C0420p4 c0420p4 = c0569v4.b.d.f764a;
        this.b.a(c0420p4.i);
        Lb m = C0401oa.I.m();
        if (Boolean.TRUE.equals(c0420p4.b)) {
            m.a(true);
        } else {
            if (Boolean.FALSE.equals(c0420p4.b)) {
                m.a(false);
            }
        }
        m.a(c0420p4.c);
        Boolean bool = c0420p4.n;
        C0401oa.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
