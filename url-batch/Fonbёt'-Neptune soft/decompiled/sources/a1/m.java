package a1;

import Y0.l0;
import a.AbstractC0132a;
import d1.AbstractC0184a;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: p, reason: collision with root package name */
    public final int f1329p;

    public m(int i2, int i3, P0.l lVar) {
        super(i2, lVar);
        this.f1329p = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Q0.p.a(b.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    public final Object D(Object obj, boolean z2) {
        j jVar;
        P0.l lVar;
        F0.b a2;
        F0.h hVar = F0.h.f469a;
        if (this.f1329p == 3) {
            Object g2 = super.g(obj);
            if (!(g2 instanceof h) || (g2 instanceof g)) {
                return g2;
            }
            if (!z2 || (lVar = this.f1301f) == null || (a2 = AbstractC0184a.a(lVar, obj, null)) == null) {
                return hVar;
            }
            throw a2;
        }
        N.e eVar = d.f1306d;
        j jVar2 = (j) b.f1295k.get(this);
        while (true) {
            long andIncrement = b.f1291g.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = r(andIncrement, false);
            int i2 = d.f1304b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar2.f2107g != j4) {
                j b2 = b.b(this, j4, jVar2);
                if (b2 != null) {
                    jVar = b2;
                } else if (r2) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int d2 = b.d(this, jVar, i3, obj, j2, eVar, r2);
            if (d2 == 0) {
                jVar.a();
                return hVar;
            }
            if (d2 == 1) {
                return hVar;
            }
            if (d2 == 2) {
                if (r2) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = eVar instanceof l0 ? (l0) eVar : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i3 + i2);
                }
                i((jVar.f2107g * j3) + i3);
                return hVar;
            }
            if (d2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j2 < b.f1292h.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (d2 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // a1.b, a1.r
    public final Object g(Object obj) {
        return D(obj, false);
    }

    @Override // a1.b, a1.r
    public final Object l(H0.d dVar, Object obj) {
        F0.b a2;
        if (!(D(obj, true) instanceof g)) {
            return F0.h.f469a;
        }
        P0.l lVar = this.f1301f;
        if (lVar == null || (a2 = AbstractC0184a.a(lVar, obj, null)) == null) {
            throw o();
        }
        AbstractC0132a.c(a2, o());
        throw a2;
    }

    @Override // a1.b
    public final boolean t() {
        return this.f1329p == 2;
    }
}
