package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    public final C2489ac f38348a;

    public U4() {
        this(Ia.j().k());
    }

    public static Z4 a(S4 s4) {
        return new Z4(new X4(s4), s4);
    }

    public U4(C2489ac c2489ac) {
        this.f38348a = c2489ac;
    }

    public final C2738jn a(S4 s4, Bm bm) {
        C2738jn c2738jn = new C2738jn(s4, new Vg(bm));
        C2489ac c2489ac = this.f38348a;
        synchronized (c2489ac) {
            c2489ac.f38671c.add(c2738jn);
        }
        return c2738jn;
    }
}
