package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lu2 extends o81 implements Function2 {
    public final /* synthetic */ pw2 m;
    public final /* synthetic */ pw2 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ so2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ so2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(pw2 pw2Var, pw2 pw2Var2, float f, ez2 ez2Var, Function2 function2, boolean z, ez2 ez2Var2) {
        super(2);
        this.m = pw2Var;
        this.n = pw2Var2;
        this.o = f;
        this.p = ez2Var;
        this.q = function2;
        this.r = z;
        this.s = ez2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ov2 ov2Var;
        e22 e22Var;
        pv2 pv2Var;
        jq0 jq0Var;
        jq0 jq0Var2;
        qv2 qv2Var;
        qv2 qv2Var2;
        dk2 dk2Var;
        dk2 dk2Var2;
        e22 e22Var2;
        e22 e22Var3;
        rv2 rv2Var;
        rv2 rv2Var2;
        a22 a22Var;
        a22 a22Var2;
        boolean z;
        boolean z2;
        a22 a22Var3;
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            pw2 pw2Var = this.m;
            un2 un2Var = pw2Var.a;
            pw2 pw2Var2 = this.n;
            un2 un2Var2 = pw2Var2.a;
            pv2 pv2Var2 = vn2.d;
            pv2 pv2Var3 = un2Var.a;
            pv2 pv2Var4 = un2Var2.a;
            boolean z3 = pv2Var3 instanceof eq;
            ov2 ov2Var2 = ov2.a;
            float f = this.o;
            if (z3 || (pv2Var4 instanceof eq)) {
                ov2Var = ov2Var2;
                e22Var = null;
                if (z3 && (pv2Var4 instanceof eq)) {
                    eq eqVar = (eq) pv2Var3;
                    eq eqVar2 = (eq) pv2Var4;
                    cq cqVar = (cq) vn2.b(eqVar.a, eqVar2.a, f);
                    float K = yk3.K(eqVar.b, eqVar2.b, f);
                    if (cqVar != null) {
                        if (cqVar instanceof nn2) {
                            long i = ij2.i(((nn2) cqVar).a, K);
                            if (i != 16) {
                                pv2Var = new mw(i);
                            }
                        } else {
                            if (!(cqVar instanceof bk2)) {
                                a.b();
                                return null;
                            }
                            pv2Var = new eq((bk2) cqVar, K);
                        }
                    }
                    pv2Var = ov2Var;
                } else {
                    pv2Var = (pv2) vn2.b(pv2Var3, pv2Var4, f);
                }
                pv2 pv2Var5 = pv2Var;
                ip0 ip0Var = (ip0) vn2.b(un2Var.f, un2Var2.f, f);
                long c = vn2.c(f, un2Var.b, un2Var2.b);
                jq0Var = un2Var.c;
                if (jq0Var == null) {
                    jq0Var = jq0.q;
                }
                jq0Var2 = un2Var2.c;
                if (jq0Var2 == null) {
                    jq0Var2 = jq0.q;
                }
                jq0 jq0Var3 = new jq0(d.c(yk3.L(f, jq0Var.m, jq0Var2.m), 1, 1000));
                fq0 fq0Var = (fq0) vn2.b(un2Var.d, un2Var2.d, f);
                gq0 gq0Var = (gq0) vn2.b(un2Var.e, un2Var2.e, f);
                String str = (String) vn2.b(un2Var.g, un2Var2.g, f);
                long c2 = vn2.c(f, un2Var.h, un2Var2.h);
                nn nnVar = un2Var.i;
                float f2 = nnVar != null ? nnVar.a : 0.0f;
                nn nnVar2 = un2Var2.i;
                float K2 = yk3.K(f2, nnVar2 != null ? nnVar2.a : 0.0f, f);
                qv2Var = un2Var.j;
                qv2 qv2Var3 = qv2.c;
                if (qv2Var == null) {
                    qv2Var = qv2Var3;
                }
                qv2Var2 = un2Var2.j;
                if (qv2Var2 != null) {
                    qv2Var3 = qv2Var2;
                }
                qv2 qv2Var4 = new qv2(yk3.K(qv2Var.a, qv2Var3.a, f), yk3.K(qv2Var.b, qv2Var3.b, f));
                sf1 sf1Var = (sf1) vn2.b(un2Var.k, un2Var2.k, f);
                long E = ap.E(f, un2Var.l, un2Var2.l);
                xt2 xt2Var = (xt2) vn2.b(un2Var.m, un2Var2.m, f);
                dk2Var = un2Var.n;
                if (dk2Var == null) {
                    dk2Var = new dk2();
                }
                dk2Var2 = un2Var2.n;
                if (dk2Var2 == null) {
                    dk2Var2 = new dk2();
                }
                long E2 = ap.E(f, dk2Var.a, dk2Var2.a);
                long j = dk2Var.b;
                long j2 = dk2Var2.b;
                dk2 dk2Var3 = new dk2(yk3.K(dk2Var.c, dk2Var2.c, f), E2, (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f)) << 32) | (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f)) & 4294967295L));
                e22Var2 = un2Var.o;
                e22 e22Var4 = un2Var2.o;
                if (e22Var2 == null || e22Var4 != null) {
                    if (e22Var2 == null) {
                        e22Var2 = e22.a;
                    }
                    e22Var3 = e22Var2;
                } else {
                    e22Var3 = e22Var;
                }
                un2 un2Var3 = new un2(pv2Var5, c, jq0Var3, fq0Var, gq0Var, ip0Var, str, c2, new nn(K2), qv2Var4, sf1Var, E, xt2Var, dk2Var3, e22Var3, (ae0) vn2.b(un2Var.p, un2Var2.p, f));
                ez1 ez1Var = pw2Var.b;
                ez1 ez1Var2 = pw2Var2.b;
                int i2 = fz1.b;
                int i3 = ((ut2) vn2.b(new ut2(ez1Var.a), new ut2(ez1Var2.a), f)).a;
                int i4 = ((au2) vn2.b(new au2(ez1Var.b), new au2(ez1Var2.b), f)).a;
                long c3 = vn2.c(f, ez1Var.c, ez1Var2.c);
                rv2Var = ez1Var.d;
                if (rv2Var == null) {
                    rv2Var = rv2.c;
                }
                rv2Var2 = ez1Var2.d;
                if (rv2Var2 == null) {
                    rv2Var2 = rv2.c;
                }
                rv2 rv2Var3 = new rv2(vn2.c(f, rv2Var.a, rv2Var2.a), vn2.c(f, rv2Var.b, rv2Var2.b));
                a22Var = ez1Var.e;
                a22Var2 = ez1Var2.e;
                if (a22Var == null || a22Var2 != null) {
                    a22 a22Var4 = a22.b;
                    a22 a22Var5 = a22Var == null ? a22Var4 : a22Var;
                    z = a22Var5.a;
                    if (a22Var2 == null) {
                        a22Var2 = a22Var4;
                    }
                    z2 = a22Var2.a;
                    if (z != z2) {
                        ((pg0) vn2.b(new pg0(), new pg0(), f)).getClass();
                        a22Var5 = new a22(((Boolean) vn2.b(Boolean.valueOf(z), Boolean.valueOf(z2), f)).booleanValue());
                    }
                    a22Var3 = a22Var5;
                } else {
                    a22Var3 = e22Var;
                }
                pw2 pw2Var3 = new pw2(un2Var3, new ez1(i3, i4, c3, rv2Var3, a22Var3, (ud1) vn2.b(ez1Var.f, ez1Var2.f, f), ((pd1) vn2.b(new pd1(ez1Var.g), new pd1(ez1Var2.g), f)).a, ((mz0) vn2.b(new mz0(ez1Var.h), new mz0(ez1Var2.h), f)).a, (hw2) vn2.b(ez1Var.i, ez1Var2.i, f)));
                if (this.r) {
                    pw2Var3 = pw2.a(pw2Var3, ((aw) this.s.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
                }
                pu2.b(((aw) this.p.getValue()).a, pw2Var3, this.q, a00Var, 0);
            } else {
                ov2Var = ov2Var2;
                e22Var = null;
                long E3 = ap.E(f, pv2Var3.b(), pv2Var4.b());
                if (E3 != 16) {
                    pv2Var = new mw(E3);
                    pv2 pv2Var52 = pv2Var;
                    ip0 ip0Var2 = (ip0) vn2.b(un2Var.f, un2Var2.f, f);
                    long c4 = vn2.c(f, un2Var.b, un2Var2.b);
                    jq0Var = un2Var.c;
                    if (jq0Var == null) {
                    }
                    jq0Var2 = un2Var2.c;
                    if (jq0Var2 == null) {
                    }
                    jq0 jq0Var32 = new jq0(d.c(yk3.L(f, jq0Var.m, jq0Var2.m), 1, 1000));
                    fq0 fq0Var2 = (fq0) vn2.b(un2Var.d, un2Var2.d, f);
                    gq0 gq0Var2 = (gq0) vn2.b(un2Var.e, un2Var2.e, f);
                    String str2 = (String) vn2.b(un2Var.g, un2Var2.g, f);
                    long c22 = vn2.c(f, un2Var.h, un2Var2.h);
                    nn nnVar3 = un2Var.i;
                    if (nnVar3 != null) {
                    }
                    nn nnVar22 = un2Var2.i;
                    float K22 = yk3.K(f2, nnVar22 != null ? nnVar22.a : 0.0f, f);
                    qv2Var = un2Var.j;
                    qv2 qv2Var32 = qv2.c;
                    if (qv2Var == null) {
                    }
                    qv2Var2 = un2Var2.j;
                    if (qv2Var2 != null) {
                    }
                    qv2 qv2Var42 = new qv2(yk3.K(qv2Var.a, qv2Var32.a, f), yk3.K(qv2Var.b, qv2Var32.b, f));
                    sf1 sf1Var2 = (sf1) vn2.b(un2Var.k, un2Var2.k, f);
                    long E4 = ap.E(f, un2Var.l, un2Var2.l);
                    xt2 xt2Var2 = (xt2) vn2.b(un2Var.m, un2Var2.m, f);
                    dk2Var = un2Var.n;
                    if (dk2Var == null) {
                    }
                    dk2Var2 = un2Var2.n;
                    if (dk2Var2 == null) {
                    }
                    long E22 = ap.E(f, dk2Var.a, dk2Var2.a);
                    long j3 = dk2Var.b;
                    long j22 = dk2Var2.b;
                    dk2 dk2Var32 = new dk2(yk3.K(dk2Var.c, dk2Var2.c, f), E22, (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j22 >> 32)), f)) << 32) | (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j22 & 4294967295L)), f)) & 4294967295L));
                    e22Var2 = un2Var.o;
                    e22 e22Var42 = un2Var2.o;
                    if (e22Var2 == null) {
                    }
                    if (e22Var2 == null) {
                    }
                    e22Var3 = e22Var2;
                    un2 un2Var32 = new un2(pv2Var52, c4, jq0Var32, fq0Var2, gq0Var2, ip0Var2, str2, c22, new nn(K22), qv2Var42, sf1Var2, E4, xt2Var2, dk2Var32, e22Var3, (ae0) vn2.b(un2Var.p, un2Var2.p, f));
                    ez1 ez1Var3 = pw2Var.b;
                    ez1 ez1Var22 = pw2Var2.b;
                    int i22 = fz1.b;
                    int i32 = ((ut2) vn2.b(new ut2(ez1Var3.a), new ut2(ez1Var22.a), f)).a;
                    int i42 = ((au2) vn2.b(new au2(ez1Var3.b), new au2(ez1Var22.b), f)).a;
                    long c32 = vn2.c(f, ez1Var3.c, ez1Var22.c);
                    rv2Var = ez1Var3.d;
                    if (rv2Var == null) {
                    }
                    rv2Var2 = ez1Var22.d;
                    if (rv2Var2 == null) {
                    }
                    rv2 rv2Var32 = new rv2(vn2.c(f, rv2Var.a, rv2Var2.a), vn2.c(f, rv2Var.b, rv2Var2.b));
                    a22Var = ez1Var3.e;
                    a22Var2 = ez1Var22.e;
                    if (a22Var == null) {
                    }
                    a22 a22Var42 = a22.b;
                    if (a22Var == null) {
                    }
                    z = a22Var5.a;
                    if (a22Var2 == null) {
                    }
                    z2 = a22Var2.a;
                    if (z != z2) {
                    }
                    a22Var3 = a22Var5;
                    pw2 pw2Var32 = new pw2(un2Var32, new ez1(i32, i42, c32, rv2Var32, a22Var3, (ud1) vn2.b(ez1Var3.f, ez1Var22.f, f), ((pd1) vn2.b(new pd1(ez1Var3.g), new pd1(ez1Var22.g), f)).a, ((mz0) vn2.b(new mz0(ez1Var3.h), new mz0(ez1Var22.h), f)).a, (hw2) vn2.b(ez1Var3.i, ez1Var22.i, f)));
                    if (this.r) {
                    }
                    pu2.b(((aw) this.p.getValue()).a, pw2Var32, this.q, a00Var, 0);
                }
                pv2Var = ov2Var;
                pv2 pv2Var522 = pv2Var;
                ip0 ip0Var22 = (ip0) vn2.b(un2Var.f, un2Var2.f, f);
                long c42 = vn2.c(f, un2Var.b, un2Var2.b);
                jq0Var = un2Var.c;
                if (jq0Var == null) {
                }
                jq0Var2 = un2Var2.c;
                if (jq0Var2 == null) {
                }
                jq0 jq0Var322 = new jq0(d.c(yk3.L(f, jq0Var.m, jq0Var2.m), 1, 1000));
                fq0 fq0Var22 = (fq0) vn2.b(un2Var.d, un2Var2.d, f);
                gq0 gq0Var22 = (gq0) vn2.b(un2Var.e, un2Var2.e, f);
                String str22 = (String) vn2.b(un2Var.g, un2Var2.g, f);
                long c222 = vn2.c(f, un2Var.h, un2Var2.h);
                nn nnVar32 = un2Var.i;
                if (nnVar32 != null) {
                }
                nn nnVar222 = un2Var2.i;
                float K222 = yk3.K(f2, nnVar222 != null ? nnVar222.a : 0.0f, f);
                qv2Var = un2Var.j;
                qv2 qv2Var322 = qv2.c;
                if (qv2Var == null) {
                }
                qv2Var2 = un2Var2.j;
                if (qv2Var2 != null) {
                }
                qv2 qv2Var422 = new qv2(yk3.K(qv2Var.a, qv2Var322.a, f), yk3.K(qv2Var.b, qv2Var322.b, f));
                sf1 sf1Var22 = (sf1) vn2.b(un2Var.k, un2Var2.k, f);
                long E42 = ap.E(f, un2Var.l, un2Var2.l);
                xt2 xt2Var22 = (xt2) vn2.b(un2Var.m, un2Var2.m, f);
                dk2Var = un2Var.n;
                if (dk2Var == null) {
                }
                dk2Var2 = un2Var2.n;
                if (dk2Var2 == null) {
                }
                long E222 = ap.E(f, dk2Var.a, dk2Var2.a);
                long j32 = dk2Var.b;
                long j222 = dk2Var2.b;
                dk2 dk2Var322 = new dk2(yk3.K(dk2Var.c, dk2Var2.c, f), E222, (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j32 >> 32)), Float.intBitsToFloat((int) (j222 >> 32)), f)) << 32) | (Float.floatToRawIntBits(yk3.K(Float.intBitsToFloat((int) (j32 & 4294967295L)), Float.intBitsToFloat((int) (j222 & 4294967295L)), f)) & 4294967295L));
                e22Var2 = un2Var.o;
                e22 e22Var422 = un2Var2.o;
                if (e22Var2 == null) {
                }
                if (e22Var2 == null) {
                }
                e22Var3 = e22Var2;
                un2 un2Var322 = new un2(pv2Var522, c42, jq0Var322, fq0Var22, gq0Var22, ip0Var22, str22, c222, new nn(K222), qv2Var422, sf1Var22, E42, xt2Var22, dk2Var322, e22Var3, (ae0) vn2.b(un2Var.p, un2Var2.p, f));
                ez1 ez1Var32 = pw2Var.b;
                ez1 ez1Var222 = pw2Var2.b;
                int i222 = fz1.b;
                int i322 = ((ut2) vn2.b(new ut2(ez1Var32.a), new ut2(ez1Var222.a), f)).a;
                int i422 = ((au2) vn2.b(new au2(ez1Var32.b), new au2(ez1Var222.b), f)).a;
                long c322 = vn2.c(f, ez1Var32.c, ez1Var222.c);
                rv2Var = ez1Var32.d;
                if (rv2Var == null) {
                }
                rv2Var2 = ez1Var222.d;
                if (rv2Var2 == null) {
                }
                rv2 rv2Var322 = new rv2(vn2.c(f, rv2Var.a, rv2Var2.a), vn2.c(f, rv2Var.b, rv2Var2.b));
                a22Var = ez1Var32.e;
                a22Var2 = ez1Var222.e;
                if (a22Var == null) {
                }
                a22 a22Var422 = a22.b;
                if (a22Var == null) {
                }
                z = a22Var5.a;
                if (a22Var2 == null) {
                }
                z2 = a22Var2.a;
                if (z != z2) {
                }
                a22Var3 = a22Var5;
                pw2 pw2Var322 = new pw2(un2Var322, new ez1(i322, i422, c322, rv2Var322, a22Var3, (ud1) vn2.b(ez1Var32.f, ez1Var222.f, f), ((pd1) vn2.b(new pd1(ez1Var32.g), new pd1(ez1Var222.g), f)).a, ((mz0) vn2.b(new mz0(ez1Var32.h), new mz0(ez1Var222.h), f)).a, (hw2) vn2.b(ez1Var32.i, ez1Var222.i, f)));
                if (this.r) {
                }
                pu2.b(((aw) this.p.getValue()).a, pw2Var322, this.q, a00Var, 0);
            }
        }
        return Unit.a;
    }
}
