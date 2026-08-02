package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C1090xo f11188b;

    public Wg(X4 x4) {
        this(x4, x4.u());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f10886a;
        if (this.f11188b.c()) {
            return false;
        }
        if (!this.f11188b.d()) {
            C0738k9 c0738k9 = x4.n;
            c0738k9.f12204c.b(P5.a(p5, EnumC0508bb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C1090xo c1090xo = this.f11188b;
        synchronized (c1090xo) {
            C1116yo c1116yo = c1090xo.f13040a;
            c1116yo.a(c1116yo.a().put("first_event_done", true));
        }
        return false;
    }

    public Wg(X4 x4, C1090xo c1090xo) {
        super(x4);
        this.f11188b = c1090xo;
    }
}
