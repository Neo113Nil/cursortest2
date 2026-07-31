package m2;

import H2.AbstractC0080b;
import L1.z;
import M1.B;
import k2.w0;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0626a f5976o;

    public p(int i3, EnumC0626a enumC0626a, Y1.c cVar) {
        super(i3, cVar);
        this.f5976o = enumC0626a;
        if (enumC0626a != EnumC0626a.f5929d) {
            if (i3 < 1) {
                throw new IllegalArgumentException(AbstractC0080b.i("Buffered channel capacity must be at least 1, but ", i3, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Z1.u.a(e.class).b() + " instead").toString());
        }
    }

    public final Object G(Object obj, boolean z3) {
        m mVar;
        Y1.c cVar;
        L1.f b2;
        EnumC0626a enumC0626a = EnumC0626a.f5931f;
        z zVar = z.f2729a;
        if (this.f5976o == enumC0626a) {
            Object g3 = super.g(obj);
            if (!(g3 instanceof k) || (g3 instanceof j)) {
                return g3;
            }
            if (!z3 || (cVar = this.f5949e) == null || (b2 = p2.a.b(cVar, obj, null)) == null) {
                return zVar;
            }
            throw b2;
        }
        j1.o oVar = g.f5954d;
        m mVar2 = (m) e.f5943j.get(this);
        while (true) {
            long andIncrement = e.f5939f.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean v3 = v(andIncrement, false);
            int i3 = g.f5952b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (mVar2.f6806c != j5) {
                m b3 = e.b(this, j5, mVar2);
                if (b3 != null) {
                    mVar = b3;
                } else if (v3) {
                    return new j(s());
                }
            } else {
                mVar = mVar2;
            }
            int h3 = e.h(this, mVar, i4, obj, j3, oVar, v3);
            if (h3 == 0) {
                mVar.a();
                return zVar;
            }
            if (h3 == 1) {
                return zVar;
            }
            if (h3 == 2) {
                if (v3) {
                    mVar.h();
                    return new j(s());
                }
                w0 w0Var = oVar instanceof w0 ? (w0) oVar : null;
                if (w0Var != null) {
                    w0Var.a(mVar, i4 + i3);
                }
                n((mVar.f6806c * j4) + i4);
                return zVar;
            }
            if (h3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (h3 == 4) {
                if (j3 < e.f5940g.get(this)) {
                    mVar.a();
                }
                return new j(s());
            }
            if (h3 == 5) {
                mVar.a();
            }
            mVar2 = mVar;
        }
    }

    @Override // m2.e, m2.t
    public final Object d(P1.d dVar, Object obj) {
        L1.f b2;
        if (!(G(obj, true) instanceof j)) {
            return z.f2729a;
        }
        Y1.c cVar = this.f5949e;
        if (cVar == null || (b2 = p2.a.b(cVar, obj, null)) == null) {
            throw s();
        }
        B.o(b2, s());
        throw b2;
    }

    @Override // m2.e, m2.t
    public final Object g(Object obj) {
        return G(obj, false);
    }

    @Override // m2.e
    public final boolean w() {
        return this.f5976o == EnumC0626a.f5930e;
    }
}
