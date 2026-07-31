package V2;

import S2.f;

/* loaded from: classes3.dex */
public class W0 extends f.a {
    public W0(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public S2.f a(S2.f fVar) {
        char c4;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        S0 s02;
        S0 s03;
        S0 s04;
        if (o()) {
            return fVar;
        }
        if (fVar.o()) {
            return this;
        }
        S2.c g4 = g();
        S0 s05 = (S0) this.f9273b;
        S0 s06 = (S0) fVar.j();
        if (s05.h()) {
            return s06.h() ? g4.q() : fVar.a(this);
        }
        S0 s07 = (S0) this.f9274c;
        S0 s08 = (S0) this.f9275d[0];
        S0 s09 = (S0) fVar.k();
        S0 s010 = (S0) fVar.n(0);
        long[] a4 = Y2.l.a();
        long[] a5 = Y2.l.a();
        long[] a6 = Y2.l.a();
        long[] a7 = Y2.l.a();
        long[] o4 = s08.g() ? null : R0.o(s08.f9515g);
        if (o4 == null) {
            jArr = s06.f9515g;
            c4 = 0;
            jArr2 = s09.f9515g;
        } else {
            c4 = 0;
            R0.n(s06.f9515g, o4, a5);
            R0.n(s09.f9515g, o4, a7);
            jArr = a5;
            jArr2 = a7;
        }
        long[] o5 = s010.g() ? null : R0.o(s010.f9515g);
        if (o5 == null) {
            jArr3 = s05.f9515g;
            jArr4 = s07.f9515g;
        } else {
            R0.n(s05.f9515g, o5, a4);
            R0.n(s07.f9515g, o5, a6);
            jArr3 = a4;
            jArr4 = a6;
        }
        R0.b(jArr4, jArr2, a6);
        R0.b(jArr3, jArr, a7);
        if (Y2.l.f(a7)) {
            return Y2.l.f(a6) ? w() : g4.q();
        }
        if (s06.h()) {
            S2.f s4 = s();
            S0 s011 = (S0) s4.l();
            S2.d m4 = s4.m();
            S2.d d4 = m4.a(s09).d(s011);
            s02 = (S0) d4.n().a(d4).a(s011).b();
            if (s02.h()) {
                return new W0(g4, s02, V0.f9520k, this.f9276e);
            }
            S0 s012 = (S0) d4.i(s011.a(s02)).a(s02).a(m4).d(s02).a(s02);
            s03 = (S0) g4.j(S2.b.f9240b);
            s04 = s012;
        } else {
            R0.s(a7, a7);
            long[] o6 = R0.o(a6);
            R0.n(jArr3, o6, a4);
            R0.n(jArr, o6, a5);
            s02 = new S0(a4);
            R0.l(a4, a5, s02.f9515g);
            if (s02.h()) {
                return new W0(g4, s02, V0.f9520k, this.f9276e);
            }
            S0 s013 = new S0(a6);
            R0.n(a7, o6, s013.f9515g);
            if (o5 != null) {
                long[] jArr5 = s013.f9515g;
                R0.n(jArr5, o5, jArr5);
            }
            long[] b4 = Y2.l.b();
            R0.b(a5, a7, a7);
            R0.t(a7, b4);
            R0.b(s07.f9515g, s08.f9515g, a7);
            R0.m(a7, s013.f9515g, b4);
            S0 s014 = new S0(a7);
            R0.p(b4, s014.f9515g);
            if (o4 != null) {
                long[] jArr6 = s013.f9515g;
                R0.n(jArr6, o4, jArr6);
            }
            s03 = s013;
            s04 = s014;
        }
        S0 s015 = s02;
        S2.d[] dVarArr = new S2.d[1];
        dVarArr[c4] = s03;
        return new W0(g4, s015, s04, dVarArr, this.f9276e);
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
                return new W0(this.f9272a, dVar, dVar2.a(dVar3), new S2.d[]{dVar3}, this.f9276e);
            }
        }
        return this;
    }

    @Override // S2.f
    public S2.f w() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        S0 s02 = (S0) this.f9273b;
        if (s02.h()) {
            return g4.q();
        }
        S0 s03 = (S0) this.f9274c;
        S0 s04 = (S0) this.f9275d[0];
        long[] a4 = Y2.l.a();
        long[] a5 = Y2.l.a();
        long[] o4 = s04.g() ? null : R0.o(s04.f9515g);
        if (o4 == null) {
            jArr = s03.f9515g;
            jArr2 = s04.f9515g;
        } else {
            R0.n(s03.f9515g, o4, a4);
            R0.s(s04.f9515g, a5);
            jArr = a4;
            jArr2 = a5;
        }
        long[] a6 = Y2.l.a();
        R0.s(s03.f9515g, a6);
        R0.d(jArr, jArr2, a6);
        if (Y2.l.f(a6)) {
            return new W0(g4, new S0(a6), V0.f9520k, this.f9276e);
        }
        long[] b4 = Y2.l.b();
        R0.m(a6, jArr, b4);
        long[] jArr4 = jArr2;
        S0 s05 = new S0(a4);
        R0.s(a6, s05.f9515g);
        S0 s06 = new S0(a6);
        if (o4 != null) {
            long[] jArr5 = s06.f9515g;
            R0.l(jArr5, jArr4, jArr5);
        }
        if (o4 == null) {
            jArr3 = s02.f9515g;
        } else {
            R0.n(s02.f9515g, o4, a5);
            jArr3 = a5;
        }
        R0.t(jArr3, b4);
        R0.p(b4, a5);
        R0.d(s05.f9515g, s06.f9515g, a5);
        return new W0(g4, s05, new S0(a5), new S2.d[]{s06}, this.f9276e);
    }

    public W0(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    W0(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
