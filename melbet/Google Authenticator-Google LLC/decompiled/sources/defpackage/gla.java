package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gla implements jrq {
    public final frv a;
    public final gkw b;
    private final gzp c;
    private final Object d = new Object();
    private final glu e;
    private volatile bmx f;

    public gla(frv frvVar, gzp gzpVar, glu gluVar, gkw gkwVar) {
        this.a = frvVar;
        this.c = gzpVar;
        this.e = gluVar;
        this.b = gkwVar;
    }

    private final bmx b() {
        gzp gzpVar = this.c;
        boolean f = gzpVar.f();
        gkw gkwVar = this.b;
        if (f) {
            bnq a = ((gkz) imq.a(gkwVar.b(this.a), gkz.class)).a();
            a.a = (Activity) gzpVar.b();
            return a.a();
        }
        bnq a2 = ((gkz) imq.a(gkwVar.b(this.a), gkz.class)).a();
        a2.b = this.e;
        return a2.a();
    }

    @Override // defpackage.jrq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmx C() {
        bmx b;
        if (this.f == null) {
            synchronized (this.d) {
                if (this.f == null) {
                    if (gta.u()) {
                        gty aC = hoq.aC(188, "ActAcc#Comp");
                        try {
                            b = b();
                            aC.close();
                        } finally {
                        }
                    } else {
                        b = b();
                    }
                    this.f = b;
                }
            }
        }
        return this.f;
    }
}
