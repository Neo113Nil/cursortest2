package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class X5 extends A4 {
    public X5(String str, double d6) {
        super(2, str, Double.valueOf(d6), new C1106xb(), new C1149z4(new Nb(new C0995t4(100))));
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C0705ho c0705ho) {
        C0756jo c0756jo = c0705ho.f8372d;
        c0756jo.f8593c = ((Double) this.f6499f).doubleValue() + c0756jo.f8593c;
    }
}
