package V2;

import S2.f;

/* loaded from: classes3.dex */
public class Y extends f.a {
    public Y(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public S2.f a(S2.f fVar) {
        S2.d dVar;
        S2.d dVar2;
        S2.d dVar3;
        S2.d dVar4;
        S2.d dVar5;
        S2.d dVar6;
        if (o()) {
            return fVar;
        }
        if (fVar.o()) {
            return this;
        }
        S2.c g4 = g();
        S2.d dVar7 = this.f9273b;
        S2.d j4 = fVar.j();
        if (dVar7.h()) {
            return j4.h() ? g4.q() : fVar.a(this);
        }
        S2.d dVar8 = this.f9274c;
        S2.d dVar9 = this.f9275d[0];
        S2.d k4 = fVar.k();
        S2.d n4 = fVar.n(0);
        boolean g5 = dVar9.g();
        if (g5) {
            dVar = j4;
            dVar2 = k4;
        } else {
            dVar = j4.i(dVar9);
            dVar2 = k4.i(dVar9);
        }
        boolean g6 = n4.g();
        if (g6) {
            dVar3 = dVar8;
        } else {
            dVar7 = dVar7.i(n4);
            dVar3 = dVar8.i(n4);
        }
        S2.d a4 = dVar3.a(dVar2);
        S2.d a5 = dVar7.a(dVar);
        if (a5.h()) {
            return a4.h() ? w() : g4.q();
        }
        if (j4.h()) {
            S2.f s4 = s();
            S2.d l4 = s4.l();
            S2.d m4 = s4.m();
            S2.d d4 = m4.a(k4).d(l4);
            dVar4 = d4.n().a(d4).a(l4).a(g4.k());
            if (dVar4.h()) {
                return new Y(g4, dVar4, g4.l().m(), this.f9276e);
            }
            S2.d a6 = d4.i(l4.a(dVar4)).a(dVar4).a(m4).d(dVar4).a(dVar4);
            dVar6 = g4.j(S2.b.f9240b);
            dVar5 = a6;
        } else {
            S2.d n5 = a5.n();
            S2.d i4 = a4.i(dVar7);
            S2.d i5 = a4.i(dVar);
            S2.d i6 = i4.i(i5);
            if (i6.h()) {
                return new Y(g4, i6, g4.l().m(), this.f9276e);
            }
            S2.d i7 = a4.i(n5);
            S2.d i8 = !g6 ? i7.i(n4) : i7;
            S2.d o4 = i5.a(n5).o(i8, dVar8.a(dVar9));
            if (!g5) {
                i8 = i8.i(dVar9);
            }
            dVar4 = i6;
            dVar5 = o4;
            dVar6 = i8;
        }
        return new Y(g4, dVar4, dVar5, new S2.d[]{dVar6}, this.f9276e);
    }

    @Override // S2.f
    public S2.d m() {
        S2.d dVar = this.f9273b;
        S2.d dVar2 = this.f9274c;
        if (o() || dVar.h()) {
            return dVar2;
        }
        S2.d i4 = dVar2.a(dVar).i(dVar);
        S2.d dVar3 = this.f9275d[0];
        return !dVar3.g() ? i4.d(dVar3) : i4;
    }

    @Override // S2.f
    public S2.f r() {
        if (!o()) {
            S2.d dVar = this.f9273b;
            if (!dVar.h()) {
                S2.d dVar2 = this.f9274c;
                S2.d dVar3 = this.f9275d[0];
                return new Y(this.f9272a, dVar, dVar2.a(dVar3), new S2.d[]{dVar3}, this.f9276e);
            }
        }
        return this;
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        S2.d dVar = this.f9273b;
        if (dVar.h()) {
            return g4.q();
        }
        S2.d dVar2 = this.f9274c;
        S2.d dVar3 = this.f9275d[0];
        boolean g5 = dVar3.g();
        S2.d i4 = g5 ? dVar2 : dVar2.i(dVar3);
        S2.d n4 = g5 ? dVar3 : dVar3.n();
        S2.d k4 = g4.k();
        if (!g5) {
            k4 = k4.i(n4);
        }
        S2.d a4 = dVar2.n().a(i4).a(k4);
        if (a4.h()) {
            return new Y(g4, a4, g4.l().m(), this.f9276e);
        }
        S2.d n5 = a4.n();
        S2.d i5 = g5 ? a4 : a4.i(n4);
        if (!g5) {
            dVar = dVar.i(dVar3);
        }
        return new Y(g4, n5, dVar.o(a4, i4).a(n5).a(i5), new S2.d[]{i5}, this.f9276e);
    }

    public Y(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    Y(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
