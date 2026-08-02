package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902qh extends Rg {
    public C0902qh(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        ((C0734k5) this.f10886a.f11235p).e();
        Rk rk = this.f10886a.f11231j;
        synchronized (rk) {
            try {
                Dk b4 = rk.b(p5);
                if (b4.f10213g) {
                    b4.f10213g = false;
                    Uk uk = b4.f10208b;
                    uk.a(Uk.f11066i, Boolean.FALSE);
                    uk.b();
                }
                if (rk.f10895g != 1) {
                    rk.b(rk.f10894f, p5);
                }
                rk.f10895g = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
