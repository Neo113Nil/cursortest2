package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final cz f7894a;

    private cr(cz czVar) {
        this.f7894a = czVar;
    }

    public static cr a(cs csVar) {
        cz czVar = (cz) csVar;
        dp.a(csVar, "AdSession is null");
        if (czVar.f7917c.f7955b == null) {
            dp.a(czVar);
            cr crVar = new cr(czVar);
            czVar.f7917c.f7955b = crVar;
            return crVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public final void a() {
        dp.a(this.f7894a);
        if (cw.NATIVE == this.f7894a.f7915a.f7895a) {
            if (!this.f7894a.d()) {
                try {
                    this.f7894a.a();
                } catch (Exception unused) {
                }
            }
            if (this.f7894a.d()) {
                cz czVar = this.f7894a;
                if (czVar.g) {
                    throw new IllegalStateException("Impression event can only be sent once");
                }
                dg.a().a(czVar.f7917c.c(), "publishImpressionEvent", new Object[0]);
                czVar.g = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }
}
