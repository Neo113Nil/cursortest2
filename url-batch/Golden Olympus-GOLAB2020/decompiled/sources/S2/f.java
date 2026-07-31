package S2;

import S2.d;
import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: g, reason: collision with root package name */
    protected static S2.d[] f9271g = new S2.d[0];

    /* renamed from: a, reason: collision with root package name */
    protected S2.c f9272a;

    /* renamed from: b, reason: collision with root package name */
    protected S2.d f9273b;

    /* renamed from: c, reason: collision with root package name */
    protected S2.d f9274c;

    /* renamed from: d, reason: collision with root package name */
    protected S2.d[] f9275d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f9276e;

    /* renamed from: f, reason: collision with root package name */
    protected Hashtable f9277f;

    public static abstract class a extends f {
        protected a(S2.c cVar, S2.d dVar, S2.d dVar2) {
            super(cVar, dVar, dVar2);
        }

        @Override // S2.f
        protected boolean v() {
            S2.d k4;
            S2.d o4;
            S2.c g4 = g();
            S2.d dVar = this.f9273b;
            S2.d k5 = g4.k();
            S2.d l4 = g4.l();
            int n4 = g4.n();
            if (n4 != 6) {
                S2.d dVar2 = this.f9274c;
                S2.d i4 = dVar2.a(dVar).i(dVar2);
                if (n4 != 0) {
                    if (n4 != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    S2.d dVar3 = this.f9275d[0];
                    if (!dVar3.g()) {
                        S2.d i5 = dVar3.i(dVar3.n());
                        i4 = i4.i(dVar3);
                        k5 = k5.i(dVar3);
                        l4 = l4.i(i5);
                    }
                }
                return i4.equals(dVar.a(k5).i(dVar.n()).a(l4));
            }
            S2.d dVar4 = this.f9275d[0];
            boolean g5 = dVar4.g();
            if (dVar.h()) {
                S2.d n5 = this.f9274c.n();
                if (!g5) {
                    l4 = l4.i(dVar4.n());
                }
                return n5.equals(l4);
            }
            S2.d dVar5 = this.f9274c;
            S2.d n6 = dVar.n();
            if (g5) {
                k4 = dVar5.n().a(dVar5).a(k5);
                o4 = n6.n().a(l4);
            } else {
                S2.d n7 = dVar4.n();
                S2.d n8 = n7.n();
                k4 = dVar5.a(dVar4).k(dVar5, k5, n7);
                o4 = n6.o(l4, n8);
            }
            return k4.i(n6).equals(o4);
        }

        protected a(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr) {
            super(cVar, dVar, dVar2, dVarArr);
        }
    }

    public static abstract class b extends f {
        protected b(S2.c cVar, S2.d dVar, S2.d dVar2) {
            super(cVar, dVar, dVar2);
        }

        @Override // S2.f
        protected boolean v() {
            S2.d dVar = this.f9273b;
            S2.d dVar2 = this.f9274c;
            S2.d k4 = this.f9272a.k();
            S2.d l4 = this.f9272a.l();
            S2.d n4 = dVar2.n();
            int h4 = h();
            if (h4 != 0) {
                if (h4 == 1) {
                    S2.d dVar3 = this.f9275d[0];
                    if (!dVar3.g()) {
                        S2.d n5 = dVar3.n();
                        S2.d i4 = dVar3.i(n5);
                        n4 = n4.i(dVar3);
                        k4 = k4.i(n5);
                        l4 = l4.i(i4);
                    }
                } else {
                    if (h4 != 2 && h4 != 3 && h4 != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    S2.d dVar4 = this.f9275d[0];
                    if (!dVar4.g()) {
                        S2.d n6 = dVar4.n();
                        S2.d n7 = n6.n();
                        S2.d i5 = n6.i(n7);
                        k4 = k4.i(n7);
                        l4 = l4.i(i5);
                    }
                }
            }
            return n4.equals(dVar.n().a(k4).i(dVar).a(l4));
        }

        protected b(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr) {
            super(cVar, dVar, dVar2, dVarArr);
        }
    }

    public static class c extends a {
        public c(S2.c cVar, S2.d dVar, S2.d dVar2) {
            this(cVar, dVar, dVar2, false);
        }

        @Override // S2.f
        public f a(f fVar) {
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
            int n4 = g4.n();
            S2.d dVar7 = this.f9273b;
            S2.d dVar8 = fVar.f9273b;
            if (n4 == 0) {
                S2.d dVar9 = this.f9274c;
                S2.d dVar10 = fVar.f9274c;
                S2.d a4 = dVar7.a(dVar8);
                S2.d a5 = dVar9.a(dVar10);
                if (a4.h()) {
                    return a5.h() ? w() : g4.q();
                }
                S2.d d4 = a5.d(a4);
                S2.d a6 = d4.n().a(d4).a(a4).a(g4.k());
                return new c(g4, a6, d4.i(dVar7.a(a6)).a(a6).a(dVar9), this.f9276e);
            }
            if (n4 == 1) {
                S2.d dVar11 = this.f9274c;
                S2.d dVar12 = this.f9275d[0];
                S2.d dVar13 = fVar.f9274c;
                S2.d dVar14 = fVar.f9275d[0];
                boolean g5 = dVar14.g();
                S2.d a7 = dVar12.i(dVar13).a(g5 ? dVar11 : dVar11.i(dVar14));
                S2.d a8 = dVar12.i(dVar8).a(g5 ? dVar7 : dVar7.i(dVar14));
                if (a8.h()) {
                    return a7.h() ? w() : g4.q();
                }
                S2.d n5 = a8.n();
                S2.d i4 = n5.i(a8);
                if (!g5) {
                    dVar12 = dVar12.i(dVar14);
                }
                S2.d a9 = a7.a(a8);
                S2.d a10 = a9.k(a7, n5, g4.k()).i(dVar12).a(i4);
                S2.d i5 = a8.i(a10);
                if (!g5) {
                    n5 = n5.i(dVar14);
                }
                return new c(g4, i5, a7.k(dVar7, a8, dVar11).k(n5, a9, a10), new S2.d[]{i4.i(dVar12)}, this.f9276e);
            }
            if (n4 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (dVar7.h()) {
                return dVar8.h() ? g4.q() : fVar.a(this);
            }
            S2.d dVar15 = this.f9274c;
            S2.d dVar16 = this.f9275d[0];
            S2.d dVar17 = fVar.f9274c;
            S2.d dVar18 = fVar.f9275d[0];
            boolean g6 = dVar16.g();
            if (g6) {
                dVar = dVar8;
                dVar2 = dVar17;
            } else {
                dVar = dVar8.i(dVar16);
                dVar2 = dVar17.i(dVar16);
            }
            boolean g7 = dVar18.g();
            if (g7) {
                dVar3 = dVar15;
            } else {
                dVar7 = dVar7.i(dVar18);
                dVar3 = dVar15.i(dVar18);
            }
            S2.d a11 = dVar3.a(dVar2);
            S2.d a12 = dVar7.a(dVar);
            if (a12.h()) {
                return a11.h() ? w() : g4.q();
            }
            if (dVar8.h()) {
                f s4 = s();
                S2.d l4 = s4.l();
                S2.d m4 = s4.m();
                S2.d d5 = m4.a(dVar17).d(l4);
                dVar5 = d5.n().a(d5).a(l4).a(g4.k());
                if (dVar5.h()) {
                    return new c(g4, dVar5, g4.l().m(), this.f9276e);
                }
                S2.d a13 = d5.i(l4.a(dVar5)).a(dVar5).a(m4).d(dVar5).a(dVar5);
                dVar6 = g4.j(S2.b.f9240b);
                dVar4 = a13;
            } else {
                S2.d n6 = a12.n();
                S2.d i6 = a11.i(dVar7);
                S2.d i7 = a11.i(dVar);
                S2.d i8 = i6.i(i7);
                if (i8.h()) {
                    return new c(g4, i8, g4.l().m(), this.f9276e);
                }
                S2.d i9 = a11.i(n6);
                S2.d i10 = !g7 ? i9.i(dVar18) : i9;
                S2.d o4 = i7.a(n6).o(i10, dVar15.a(dVar16));
                if (!g6) {
                    i10 = i10.i(dVar16);
                }
                dVar4 = o4;
                dVar5 = i8;
                dVar6 = i10;
            }
            return new c(g4, dVar5, dVar4, new S2.d[]{dVar6}, this.f9276e);
        }

        @Override // S2.f
        public S2.d m() {
            int h4 = h();
            if (h4 != 5 && h4 != 6) {
                return this.f9274c;
            }
            S2.d dVar = this.f9273b;
            S2.d dVar2 = this.f9274c;
            if (o() || dVar.h()) {
                return dVar2;
            }
            S2.d i4 = dVar2.a(dVar).i(dVar);
            if (6 == h4) {
                S2.d dVar3 = this.f9275d[0];
                if (!dVar3.g()) {
                    return i4.d(dVar3);
                }
            }
            return i4;
        }

        @Override // S2.f
        public f r() {
            if (!o()) {
                S2.d dVar = this.f9273b;
                if (!dVar.h()) {
                    int h4 = h();
                    if (h4 == 0) {
                        return new c(this.f9272a, dVar, this.f9274c.a(dVar), this.f9276e);
                    }
                    if (h4 == 1) {
                        return new c(this.f9272a, dVar, this.f9274c.a(dVar), new S2.d[]{this.f9275d[0]}, this.f9276e);
                    }
                    if (h4 == 5) {
                        return new c(this.f9272a, dVar, this.f9274c.b(), this.f9276e);
                    }
                    if (h4 != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    S2.d dVar2 = this.f9274c;
                    S2.d dVar3 = this.f9275d[0];
                    return new c(this.f9272a, dVar, dVar2.a(dVar3), new S2.d[]{dVar3}, this.f9276e);
                }
            }
            return this;
        }

        @Override // S2.f
        public f w() {
            S2.d a4;
            if (o()) {
                return this;
            }
            S2.c g4 = g();
            S2.d dVar = this.f9273b;
            if (dVar.h()) {
                return g4.q();
            }
            int n4 = g4.n();
            if (n4 == 0) {
                S2.d a5 = this.f9274c.d(dVar).a(dVar);
                S2.d a6 = a5.n().a(a5).a(g4.k());
                return new c(g4, a6, dVar.o(a6, a5.b()), this.f9276e);
            }
            if (n4 == 1) {
                S2.d dVar2 = this.f9274c;
                S2.d dVar3 = this.f9275d[0];
                boolean g5 = dVar3.g();
                S2.d i4 = g5 ? dVar : dVar.i(dVar3);
                if (!g5) {
                    dVar2 = dVar2.i(dVar3);
                }
                S2.d n5 = dVar.n();
                S2.d a7 = n5.a(dVar2);
                S2.d n6 = i4.n();
                S2.d a8 = a7.a(i4);
                S2.d k4 = a8.k(a7, n6, g4.k());
                return new c(g4, i4.i(k4), n5.n().k(i4, k4, a8), new S2.d[]{i4.i(n6)}, this.f9276e);
            }
            if (n4 != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            S2.d dVar4 = this.f9274c;
            S2.d dVar5 = this.f9275d[0];
            boolean g6 = dVar5.g();
            S2.d i5 = g6 ? dVar4 : dVar4.i(dVar5);
            S2.d n7 = g6 ? dVar5 : dVar5.n();
            S2.d k5 = g4.k();
            S2.d i6 = g6 ? k5 : k5.i(n7);
            S2.d a9 = dVar4.n().a(i5).a(i6);
            if (a9.h()) {
                return new c(g4, a9, g4.l().m(), this.f9276e);
            }
            S2.d n8 = a9.n();
            S2.d i7 = g6 ? a9 : a9.i(n7);
            S2.d l4 = g4.l();
            if (l4.c() < (g4.p() >> 1)) {
                S2.d n9 = dVar4.a(dVar).n();
                a4 = n9.a(a9).a(n7).i(n9).a(l4.g() ? i6.a(n7).n() : i6.o(l4, n7.n())).a(n8);
                if (k5.h()) {
                    a4 = a4.a(i7);
                } else if (!k5.g()) {
                    a4 = a4.a(k5.b().i(i7));
                }
            } else {
                if (!g6) {
                    dVar = dVar.i(dVar5);
                }
                a4 = dVar.o(a9, i5).a(n8).a(i7);
            }
            return new c(g4, n8, a4, new S2.d[]{i7}, this.f9276e);
        }

        public c(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
            super(cVar, dVar, dVar2);
            if ((dVar == null) != (dVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (dVar != null) {
                d.a.s(this.f9273b, this.f9274c);
                if (cVar != null) {
                    d.a.s(this.f9273b, this.f9272a.k());
                }
            }
            this.f9276e = z4;
        }

        c(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
            super(cVar, dVar, dVar2, dVarArr);
            this.f9276e = z4;
        }
    }

    public static class d extends b {
        public d(S2.c cVar, S2.d dVar, S2.d dVar2) {
            this(cVar, dVar, dVar2, false);
        }

        protected S2.d A() {
            S2.d[] dVarArr = this.f9275d;
            S2.d dVar = dVarArr[1];
            if (dVar != null) {
                return dVar;
            }
            S2.d x4 = x(dVarArr[0], null);
            dVarArr[1] = x4;
            return x4;
        }

        protected S2.d B(S2.d dVar) {
            return D(dVar).a(dVar);
        }

        protected d C(boolean z4) {
            S2.d dVar = this.f9273b;
            S2.d dVar2 = this.f9274c;
            S2.d dVar3 = this.f9275d[0];
            S2.d A4 = A();
            S2.d a4 = B(dVar.n()).a(A4);
            S2.d D4 = D(dVar2);
            S2.d i4 = D4.i(dVar2);
            S2.d D5 = D(dVar.i(i4));
            S2.d p4 = a4.n().p(D(D5));
            S2.d D6 = D(i4.n());
            S2.d p5 = a4.i(D5.p(p4)).p(D6);
            S2.d D7 = z4 ? D(D6.i(A4)) : null;
            if (!dVar3.g()) {
                D4 = D4.i(dVar3);
            }
            return new d(g(), p4, p5, new S2.d[]{D4, D7}, this.f9276e);
        }

        protected S2.d D(S2.d dVar) {
            return dVar.a(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
        @Override // S2.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f a(f fVar) {
            char c4;
            int i4;
            S2.d i5;
            S2.d dVar;
            S2.d dVar2;
            S2.d dVar3;
            S2.d[] dVarArr;
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
            int n4 = g4.n();
            S2.d dVar4 = this.f9273b;
            S2.d dVar5 = this.f9274c;
            S2.d dVar6 = fVar.f9273b;
            S2.d dVar7 = fVar.f9274c;
            if (n4 == 0) {
                S2.d p4 = dVar6.p(dVar4);
                S2.d p5 = dVar7.p(dVar5);
                if (p4.h()) {
                    return p5.h() ? w() : g4.q();
                }
                S2.d d4 = p5.d(p4);
                S2.d p6 = d4.n().p(dVar4).p(dVar6);
                return new d(g4, p6, d4.i(dVar4.p(p6)).p(dVar5), this.f9276e);
            }
            if (n4 == 1) {
                S2.d dVar8 = this.f9275d[0];
                S2.d dVar9 = fVar.f9275d[0];
                boolean g5 = dVar8.g();
                boolean g6 = dVar9.g();
                if (!g5) {
                    dVar7 = dVar7.i(dVar8);
                }
                if (!g6) {
                    dVar5 = dVar5.i(dVar9);
                }
                S2.d p7 = dVar7.p(dVar5);
                if (!g5) {
                    dVar6 = dVar6.i(dVar8);
                }
                if (!g6) {
                    dVar4 = dVar4.i(dVar9);
                }
                S2.d p8 = dVar6.p(dVar4);
                if (p8.h()) {
                    return p7.h() ? w() : g4.q();
                }
                if (g5) {
                    dVar8 = dVar9;
                } else if (!g6) {
                    dVar8 = dVar8.i(dVar9);
                }
                S2.d n5 = p8.n();
                S2.d i6 = n5.i(p8);
                S2.d i7 = n5.i(dVar4);
                S2.d p9 = p7.n().i(dVar8).p(i6).p(D(i7));
                return new d(g4, p8.i(p9), i7.p(p9).j(p7, dVar5, i6), new S2.d[]{i6.i(dVar8)}, this.f9276e);
            }
            if (n4 != 2 && n4 != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            S2.d dVar10 = this.f9275d[0];
            S2.d dVar11 = fVar.f9275d[0];
            boolean g7 = dVar10.g();
            if (g7 || !dVar10.equals(dVar11)) {
                if (!g7) {
                    S2.d n6 = dVar10.n();
                    dVar6 = n6.i(dVar6);
                    dVar7 = n6.i(dVar10).i(dVar7);
                }
                boolean g8 = dVar11.g();
                if (g8) {
                    c4 = 0;
                } else {
                    c4 = 0;
                    S2.d n7 = dVar11.n();
                    dVar4 = n7.i(dVar4);
                    dVar5 = n7.i(dVar11).i(dVar5);
                }
                S2.d p10 = dVar4.p(dVar6);
                S2.d p11 = dVar5.p(dVar7);
                if (p10.h()) {
                    return p11.h() ? w() : g4.q();
                }
                S2.d n8 = p10.n();
                S2.d i8 = n8.i(p10);
                S2.d i9 = n8.i(dVar4);
                i4 = 1;
                S2.d p12 = p11.n().a(i8).p(D(i9));
                S2.d j4 = i9.p(p12).j(p11, i8, dVar5);
                S2.d i10 = !g7 ? p10.i(dVar10) : p10;
                i5 = !g8 ? i10.i(dVar11) : i10;
                dVar = j4;
                dVar2 = p12;
                if (i5 == p10) {
                    dVar3 = n8;
                    if (n4 != 4) {
                        S2.d x4 = x(i5, dVar3);
                        dVarArr = new S2.d[2];
                        dVarArr[c4] = i5;
                        dVarArr[i4] = x4;
                    } else {
                        dVarArr = new S2.d[i4];
                        dVarArr[c4] = i5;
                    }
                    return new d(g4, dVar2, dVar, dVarArr, this.f9276e);
                }
            } else {
                S2.d p13 = dVar4.p(dVar6);
                S2.d p14 = dVar5.p(dVar7);
                if (p13.h()) {
                    return p14.h() ? w() : g4.q();
                }
                S2.d n9 = p13.n();
                S2.d i11 = dVar4.i(n9);
                S2.d i12 = dVar6.i(n9);
                S2.d i13 = i11.p(i12).i(dVar5);
                S2.d p15 = p14.n().p(i11).p(i12);
                S2.d p16 = i11.p(p15).i(p14).p(i13);
                i5 = p13.i(dVar10);
                dVar = p16;
                dVar2 = p15;
                i4 = 1;
                c4 = 0;
            }
            dVar3 = null;
            if (n4 != 4) {
            }
            return new d(g4, dVar2, dVar, dVarArr, this.f9276e);
        }

        @Override // S2.f
        public S2.d n(int i4) {
            return (i4 == 1 && 4 == h()) ? A() : super.n(i4);
        }

        @Override // S2.f
        public f r() {
            if (o()) {
                return this;
            }
            S2.c g4 = g();
            return g4.n() != 0 ? new d(g4, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e) : new d(g4, this.f9273b, this.f9274c.l(), this.f9276e);
        }

        @Override // S2.f
        public f w() {
            S2.d dVar;
            S2.d z4;
            if (o()) {
                return this;
            }
            S2.c g4 = g();
            S2.d dVar2 = this.f9274c;
            if (dVar2.h()) {
                return g4.q();
            }
            int n4 = g4.n();
            S2.d dVar3 = this.f9273b;
            if (n4 == 0) {
                S2.d d4 = B(dVar3.n()).a(g().k()).d(D(dVar2));
                S2.d p4 = d4.n().p(D(dVar3));
                return new d(g4, p4, d4.i(dVar3.p(p4)).p(dVar2), this.f9276e);
            }
            if (n4 == 1) {
                S2.d dVar4 = this.f9275d[0];
                boolean g5 = dVar4.g();
                S2.d k4 = g4.k();
                if (!k4.h() && !g5) {
                    k4 = k4.i(dVar4.n());
                }
                S2.d a4 = k4.a(B(dVar3.n()));
                S2.d i4 = g5 ? dVar2 : dVar2.i(dVar4);
                S2.d n5 = g5 ? dVar2.n() : i4.i(dVar2);
                S2.d z5 = z(dVar3.i(n5));
                S2.d p5 = a4.n().p(D(z5));
                S2.d D4 = D(i4);
                S2.d i5 = p5.i(D4);
                S2.d D5 = D(n5);
                return new d(g4, i5, z5.p(p5).i(a4).p(D(D5.n())), new S2.d[]{D(g5 ? D(D5) : D4.n()).i(i4)}, this.f9276e);
            }
            if (n4 != 2) {
                if (n4 == 4) {
                    return C(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            S2.d dVar5 = this.f9275d[0];
            boolean g6 = dVar5.g();
            S2.d n6 = dVar2.n();
            S2.d n7 = n6.n();
            S2.d k5 = g4.k();
            S2.d l4 = k5.l();
            if (l4.r().equals(BigInteger.valueOf(3L))) {
                S2.d n8 = g6 ? dVar5 : dVar5.n();
                dVar = B(dVar3.a(n8).i(dVar3.p(n8)));
                z4 = z(n6.i(dVar3));
            } else {
                S2.d B4 = B(dVar3.n());
                if (g6) {
                    dVar = B4.a(k5);
                } else if (k5.h()) {
                    dVar = B4;
                } else {
                    S2.d n9 = dVar5.n().n();
                    dVar = l4.c() < k5.c() ? B4.p(n9.i(l4)) : B4.a(n9.i(k5));
                }
                z4 = z(dVar3.i(n6));
            }
            S2.d p6 = dVar.n().p(D(z4));
            S2.d p7 = z4.p(p6).i(dVar).p(y(n7));
            S2.d D6 = D(dVar2);
            if (!g6) {
                D6 = D6.i(dVar5);
            }
            return new d(g4, p6, p7, new S2.d[]{D6}, this.f9276e);
        }

        protected S2.d x(S2.d dVar, S2.d dVar2) {
            S2.d k4 = g().k();
            if (k4.h() || dVar.g()) {
                return k4;
            }
            if (dVar2 == null) {
                dVar2 = dVar.n();
            }
            S2.d n4 = dVar2.n();
            S2.d l4 = k4.l();
            return l4.c() < k4.c() ? n4.i(l4).l() : n4.i(k4);
        }

        protected S2.d y(S2.d dVar) {
            return z(D(dVar));
        }

        protected S2.d z(S2.d dVar) {
            return D(D(dVar));
        }

        public d(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
            super(cVar, dVar, dVar2);
            if ((dVar == null) != (dVar2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.f9276e = z4;
        }

        d(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
            super(cVar, dVar, dVar2, dVarArr);
            this.f9276e = z4;
        }
    }

    protected f(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, i(cVar));
    }

    protected static S2.d[] i(S2.c cVar) {
        int n4 = cVar == null ? 0 : cVar.n();
        if (n4 == 0 || n4 == 5) {
            return f9271g;
        }
        S2.d j4 = cVar.j(S2.b.f9240b);
        if (n4 != 1 && n4 != 2) {
            if (n4 == 3) {
                return new S2.d[]{j4, j4, j4};
            }
            if (n4 == 4) {
                return new S2.d[]{j4, cVar.k()};
            }
            if (n4 != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new S2.d[]{j4};
    }

    public abstract f a(f fVar);

    protected void b() {
        if (!p()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    protected f c(S2.d dVar, S2.d dVar2) {
        return g().f(j().i(dVar), k().i(dVar2), this.f9276e);
    }

    public boolean d(f fVar) {
        f fVar2;
        if (fVar == null) {
            return false;
        }
        S2.c g4 = g();
        S2.c g5 = fVar.g();
        boolean z4 = g4 == null;
        boolean z5 = g5 == null;
        boolean o4 = o();
        boolean o5 = fVar.o();
        if (o4 || o5) {
            return o4 && o5 && (z4 || z5 || g4.i(g5));
        }
        if (!z4 || !z5) {
            if (!z4) {
                if (z5) {
                    fVar2 = s();
                } else {
                    if (!g4.i(g5)) {
                        return false;
                    }
                    f[] fVarArr = {this, g4.s(fVar)};
                    g4.t(fVarArr);
                    fVar2 = fVarArr[0];
                    fVar = fVarArr[1];
                }
                return !fVar2.l().equals(fVar.l()) && fVar2.m().equals(fVar.m());
            }
            fVar = fVar.s();
        }
        fVar2 = this;
        if (fVar2.l().equals(fVar.l())) {
        }
    }

    public S2.d e() {
        b();
        return l();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return d((f) obj);
        }
        return false;
    }

    public S2.d f() {
        b();
        return m();
    }

    public S2.c g() {
        return this.f9272a;
    }

    protected int h() {
        S2.c cVar = this.f9272a;
        if (cVar == null) {
            return 0;
        }
        return cVar.n();
    }

    public int hashCode() {
        S2.c g4 = g();
        int i4 = g4 == null ? 0 : ~g4.hashCode();
        if (o()) {
            return i4;
        }
        f s4 = s();
        return (i4 ^ (s4.l().hashCode() * 17)) ^ (s4.m().hashCode() * 257);
    }

    public final S2.d j() {
        return this.f9273b;
    }

    public final S2.d k() {
        return this.f9274c;
    }

    public S2.d l() {
        return this.f9273b;
    }

    public S2.d m() {
        return this.f9274c;
    }

    public S2.d n(int i4) {
        if (i4 < 0) {
            return null;
        }
        S2.d[] dVarArr = this.f9275d;
        if (i4 >= dVarArr.length) {
            return null;
        }
        return dVarArr[i4];
    }

    public boolean o() {
        if (this.f9273b == null || this.f9274c == null) {
            return true;
        }
        S2.d[] dVarArr = this.f9275d;
        return dVarArr.length > 0 && dVarArr[0].h();
    }

    public boolean p() {
        int h4 = h();
        return h4 == 0 || h4 == 5 || o() || this.f9275d[0].g();
    }

    public boolean q() {
        return o() || g() == null || (v() && u());
    }

    public abstract f r();

    public f s() {
        int h4;
        if (!o() && (h4 = h()) != 0 && h4 != 5) {
            S2.d n4 = n(0);
            if (!n4.g()) {
                return t(n4.f());
            }
        }
        return this;
    }

    f t(S2.d dVar) {
        int h4 = h();
        if (h4 != 1) {
            if (h4 == 2 || h4 == 3 || h4 == 4) {
                S2.d n4 = dVar.n();
                return c(n4, n4.i(dVar));
            }
            if (h4 != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return c(dVar, dVar);
    }

    public String toString() {
        if (o()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(j());
        stringBuffer.append(',');
        stringBuffer.append(k());
        for (int i4 = 0; i4 < this.f9275d.length; i4++) {
            stringBuffer.append(',');
            stringBuffer.append(this.f9275d[i4]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    protected boolean u() {
        BigInteger m4 = this.f9272a.m();
        return m4 == null || m4.equals(S2.b.f9240b) || !S2.a.f(this, m4).o();
    }

    protected abstract boolean v();

    public abstract f w();

    protected f(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr) {
        this.f9277f = null;
        this.f9272a = cVar;
        this.f9273b = dVar;
        this.f9274c = dVar2;
        this.f9275d = dVarArr;
    }
}
