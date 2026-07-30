package O0;

import M0.l0;
import R0.AbstractC0068a;
import u0.C0247g;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: p, reason: collision with root package name */
    public final int f745p;

    public m(int i2, int i3, E0.l lVar) {
        super(i2, lVar);
        this.f745p = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + F0.q.a(b.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    public final Object D(Object obj, boolean z2) {
        j jVar;
        E0.l lVar;
        M.c b2;
        C0247g c0247g = C0247g.f3005a;
        if (this.f745p == 3) {
            Object l2 = super.l(obj);
            if (!(l2 instanceof h) || (l2 instanceof g)) {
                return l2;
            }
            if (!z2 || (lVar = this.f718f) == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
                return c0247g;
            }
            throw b2;
        }
        J.e eVar = d.f723d;
        j jVar2 = (j) b.f712k.get(this);
        while (true) {
            long andIncrement = b.f708g.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f721b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar2.f938g != j4) {
                j b3 = b.b(this, j4, jVar2);
                if (b3 != null) {
                    jVar = b3;
                } else if (r) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int e2 = b.e(this, jVar, i3, obj, j2, eVar, r);
            if (e2 == 0) {
                jVar.a();
                return c0247g;
            }
            if (e2 == 1) {
                return c0247g;
            }
            if (e2 == 2) {
                if (r) {
                    jVar.h();
                    return new g(o());
                }
                l0 l0Var = eVar instanceof l0 ? (l0) eVar : null;
                if (l0Var != null) {
                    l0Var.a(jVar, i3 + i2);
                }
                i((jVar.f938g * j3) + i3);
                return c0247g;
            }
            if (e2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e2 == 4) {
                if (j2 < b.f709h.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (e2 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // O0.b, O0.r
    public final Object d(Object obj, w0.d dVar) {
        M.c b2;
        if (!(D(obj, true) instanceof g)) {
            return C0247g.f3005a;
        }
        E0.l lVar = this.f718f;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            throw o();
        }
        o.g.a(b2, o());
        throw b2;
    }

    @Override // O0.b, O0.r
    public final Object l(Object obj) {
        return D(obj, false);
    }

    @Override // O0.b
    public final boolean t() {
        return this.f745p == 2;
    }
}
