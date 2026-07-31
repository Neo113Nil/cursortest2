package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class R5 extends AbstractC0544u4 {
    public R5(String str, double d) {
        super(2, str, Double.valueOf(d), new C0476rb(), new C0519t4(new Hb(new C0370n4(100))));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0544u4
    public final void a(C0211go c0211go) {
        C0262io c0262io = c0211go.d;
        c0262io.c = ((Double) this.f).doubleValue() + c0262io.c;
    }
}
