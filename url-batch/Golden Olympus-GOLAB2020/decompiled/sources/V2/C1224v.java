package V2;

import S2.f;

/* renamed from: V2.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1224v extends f.b {
    public C1224v(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public S2.f a(S2.f fVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (o()) {
            return fVar;
        }
        if (fVar.o()) {
            return this;
        }
        if (this == fVar) {
            return w();
        }
        S2.c g4 = g();
        C1222u c1222u = (C1222u) this.f9273b;
        C1222u c1222u2 = (C1222u) this.f9274c;
        C1222u c1222u3 = (C1222u) fVar.l();
        C1222u c1222u4 = (C1222u) fVar.m();
        C1222u c1222u5 = (C1222u) this.f9275d[0];
        C1222u c1222u6 = (C1222u) fVar.n(0);
        int[] g5 = Y2.e.g();
        int[] e4 = Y2.e.e();
        int[] e5 = Y2.e.e();
        int[] e6 = Y2.e.e();
        boolean g6 = c1222u5.g();
        if (g6) {
            iArr = c1222u3.f9573g;
            iArr2 = c1222u4.f9573g;
        } else {
            AbstractC1220t.j(c1222u5.f9573g, e5);
            AbstractC1220t.e(e5, c1222u3.f9573g, e4);
            AbstractC1220t.e(e5, c1222u5.f9573g, e5);
            AbstractC1220t.e(e5, c1222u4.f9573g, e5);
            iArr = e4;
            iArr2 = e5;
        }
        boolean g7 = c1222u6.g();
        if (g7) {
            iArr3 = c1222u.f9573g;
            iArr4 = c1222u2.f9573g;
        } else {
            AbstractC1220t.j(c1222u6.f9573g, e6);
            AbstractC1220t.e(e6, c1222u.f9573g, g5);
            AbstractC1220t.e(e6, c1222u6.f9573g, e6);
            AbstractC1220t.e(e6, c1222u2.f9573g, e6);
            iArr3 = g5;
            iArr4 = e6;
        }
        int[] e7 = Y2.e.e();
        AbstractC1220t.m(iArr3, iArr, e7);
        AbstractC1220t.m(iArr4, iArr2, e4);
        if (Y2.e.s(e7)) {
            return Y2.e.s(e4) ? w() : g4.q();
        }
        AbstractC1220t.j(e7, e5);
        int[] e8 = Y2.e.e();
        AbstractC1220t.e(e5, e7, e8);
        AbstractC1220t.e(e5, iArr3, e5);
        AbstractC1220t.g(e8, e8);
        Y2.e.v(iArr4, e8, g5);
        AbstractC1220t.i(Y2.e.b(e5, e5, e8), e8);
        C1222u c1222u7 = new C1222u(e6);
        AbstractC1220t.j(e4, c1222u7.f9573g);
        int[] iArr5 = c1222u7.f9573g;
        AbstractC1220t.m(iArr5, e8, iArr5);
        C1222u c1222u8 = new C1222u(e8);
        AbstractC1220t.m(e5, c1222u7.f9573g, c1222u8.f9573g);
        AbstractC1220t.f(c1222u8.f9573g, e4, g5);
        AbstractC1220t.h(g5, c1222u8.f9573g);
        C1222u c1222u9 = new C1222u(e7);
        if (!g6) {
            int[] iArr6 = c1222u9.f9573g;
            AbstractC1220t.e(iArr6, c1222u5.f9573g, iArr6);
        }
        if (!g7) {
            int[] iArr7 = c1222u9.f9573g;
            AbstractC1220t.e(iArr7, c1222u6.f9573g, iArr7);
        }
        return new C1224v(g4, c1222u7, c1222u8, new S2.d[]{c1222u9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new C1224v(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1222u c1222u = (C1222u) this.f9274c;
        if (c1222u.h()) {
            return g4.q();
        }
        C1222u c1222u2 = (C1222u) this.f9273b;
        C1222u c1222u3 = (C1222u) this.f9275d[0];
        int[] e4 = Y2.e.e();
        int[] e5 = Y2.e.e();
        int[] e6 = Y2.e.e();
        AbstractC1220t.j(c1222u.f9573g, e6);
        int[] e7 = Y2.e.e();
        AbstractC1220t.j(e6, e7);
        boolean g5 = c1222u3.g();
        int[] iArr = c1222u3.f9573g;
        if (!g5) {
            AbstractC1220t.j(iArr, e5);
            iArr = e5;
        }
        AbstractC1220t.m(c1222u2.f9573g, iArr, e4);
        AbstractC1220t.a(c1222u2.f9573g, iArr, e5);
        AbstractC1220t.e(e5, e4, e5);
        AbstractC1220t.i(Y2.e.b(e5, e5, e5), e5);
        AbstractC1220t.e(e6, c1222u2.f9573g, e6);
        AbstractC1220t.i(Y2.m.F(6, e6, 2, 0), e6);
        AbstractC1220t.i(Y2.m.G(6, e7, 3, 0, e4), e4);
        C1222u c1222u4 = new C1222u(e7);
        AbstractC1220t.j(e5, c1222u4.f9573g);
        int[] iArr2 = c1222u4.f9573g;
        AbstractC1220t.m(iArr2, e6, iArr2);
        int[] iArr3 = c1222u4.f9573g;
        AbstractC1220t.m(iArr3, e6, iArr3);
        C1222u c1222u5 = new C1222u(e6);
        AbstractC1220t.m(e6, c1222u4.f9573g, c1222u5.f9573g);
        int[] iArr4 = c1222u5.f9573g;
        AbstractC1220t.e(iArr4, e5, iArr4);
        int[] iArr5 = c1222u5.f9573g;
        AbstractC1220t.m(iArr5, e4, iArr5);
        C1222u c1222u6 = new C1222u(e5);
        AbstractC1220t.n(c1222u.f9573g, c1222u6.f9573g);
        if (!g5) {
            int[] iArr6 = c1222u6.f9573g;
            AbstractC1220t.e(iArr6, c1222u3.f9573g, iArr6);
        }
        return new C1224v(g4, c1222u4, c1222u5, new S2.d[]{c1222u6}, this.f9276e);
    }

    public C1224v(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    C1224v(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
