package android.support.constraint.a.a;

import android.support.constraint.a.a.a;
import android.support.constraint.a.a.b;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class c extends h {
    static boolean ac = true;
    int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    private g ak;
    protected android.support.constraint.a.e aa = new android.support.constraint.a.e();
    protected android.support.constraint.a.e ab = null;
    private int al = 0;
    private int am = 0;
    private b[] an = new b[4];
    private b[] ao = new b[4];
    private b[] ap = new b[4];
    private int aq = 2;
    private boolean[] ar = new boolean[3];
    private b[] as = new b[4];
    private boolean at = false;
    private boolean au = false;

    public boolean G() {
        return false;
    }

    public void m(int i) {
        this.aq = i;
    }

    @Override // android.support.constraint.a.a.h, android.support.constraint.a.a.b
    public void a() {
        this.aa.a();
        this.af = 0;
        this.ah = 0;
        this.ag = 0;
        this.ai = 0;
        super.a();
    }

    public boolean D() {
        return this.at;
    }

    public boolean E() {
        return this.au;
    }

    public boolean c(android.support.constraint.a.e eVar, int i) {
        boolean z;
        a(eVar, i);
        int size = this.aj.size();
        if (this.aq == 2 || this.aq == 4) {
            if (a(eVar)) {
                return false;
            }
            z = false;
        } else {
            z = true;
        }
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.aj.get(i2);
            if (bVar instanceof c) {
                b.a aVar = bVar.G;
                b.a aVar2 = bVar.H;
                if (aVar == b.a.WRAP_CONTENT) {
                    bVar.a(b.a.FIXED);
                }
                if (aVar2 == b.a.WRAP_CONTENT) {
                    bVar.b(b.a.FIXED);
                }
                bVar.a(eVar, i);
                if (aVar == b.a.WRAP_CONTENT) {
                    bVar.a(aVar);
                }
                if (aVar2 == b.a.WRAP_CONTENT) {
                    bVar.b(aVar2);
                }
            } else {
                if (z) {
                    e.a(this, eVar, bVar);
                }
                bVar.a(eVar, i);
            }
        }
        if (this.al > 0) {
            b(eVar);
        }
        if (this.am > 0) {
            c(eVar);
        }
        return true;
    }

    private boolean a(android.support.constraint.a.e eVar) {
        int size = this.aj.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.aj.get(i);
            bVar.f1412a = -1;
            bVar.f1413b = -1;
            if (bVar.G == b.a.MATCH_CONSTRAINT || bVar.H == b.a.MATCH_CONSTRAINT) {
                bVar.f1412a = 1;
                bVar.f1413b = 1;
            }
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                b bVar2 = this.aj.get(i6);
                if (bVar2.f1412a == -1) {
                    if (this.G == b.a.WRAP_CONTENT) {
                        bVar2.f1412a = 1;
                    } else {
                        e.b(this, eVar, bVar2);
                    }
                }
                if (bVar2.f1413b == -1) {
                    if (this.H == b.a.WRAP_CONTENT) {
                        bVar2.f1413b = 1;
                    } else {
                        e.c(this, eVar, bVar2);
                    }
                }
                if (bVar2.f1413b == -1) {
                    i4++;
                }
                if (bVar2.f1412a == -1) {
                    i5++;
                }
            }
            if ((i4 == 0 && i5 == 0) || (i2 == i4 && i3 == i5)) {
                z = true;
            }
            i2 = i4;
            i3 = i5;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            b bVar3 = this.aj.get(i9);
            if (bVar3.f1412a == 1 || bVar3.f1412a == -1) {
                i7++;
            }
            if (bVar3.f1413b == 1 || bVar3.f1413b == -1) {
                i8++;
            }
        }
        return i7 == 0 && i8 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(android.support.constraint.a.e eVar) {
        int i;
        android.support.constraint.a.e eVar2;
        b bVar;
        boolean z;
        b bVar2;
        boolean z2;
        b bVar3;
        b bVar4;
        b bVar5;
        android.support.constraint.a.e eVar3;
        int i2;
        int i3;
        int i4;
        c cVar = this;
        android.support.constraint.a.e eVar4 = eVar;
        int i5 = 0;
        int i6 = 0;
        while (i6 < cVar.al) {
            b bVar6 = cVar.ap[i6];
            int a2 = a(eVar, cVar.as, cVar.ap[i6], 0, cVar.ar);
            b bVar7 = cVar.as[2];
            if (bVar7 != null) {
                if (cVar.ar[1]) {
                    int n = bVar6.n();
                    while (bVar7 != null) {
                        eVar4.a(bVar7.i.f, n);
                        b bVar8 = bVar7.Y;
                        n += bVar7.i.d() + bVar7.h() + bVar7.k.d();
                        bVar7 = bVar8;
                    }
                } else {
                    boolean z3 = bVar6.S == 0;
                    boolean z4 = bVar6.S == 2;
                    boolean z5 = cVar.G == b.a.WRAP_CONTENT;
                    if ((cVar.aq != 2 && cVar.aq != 8) || !cVar.ar[i5] || !bVar6.U || z4 || z5 || bVar6.S != 0) {
                        char c2 = 3;
                        if (a2 != 0 && !z4) {
                            b bVar9 = null;
                            float f = 0.0f;
                            while (bVar7 != null) {
                                if (bVar7.G != b.a.MATCH_CONSTRAINT) {
                                    int d2 = bVar7.i.d();
                                    if (bVar9 != null) {
                                        d2 += bVar9.k.d();
                                    }
                                    eVar4.a(bVar7.i.f, bVar7.i.f1398c.f, d2, bVar7.i.f1398c.f1396a.G == b.a.MATCH_CONSTRAINT ? 2 : 3);
                                    int d3 = bVar7.k.d();
                                    if (bVar7.k.f1398c.f1396a.i.f1398c != null && bVar7.k.f1398c.f1396a.i.f1398c.f1396a == bVar7) {
                                        d3 += bVar7.k.f1398c.f1396a.i.d();
                                    }
                                    eVar4.b(bVar7.k.f, bVar7.k.f1398c.f, -d3, bVar7.k.f1398c.f1396a.G == b.a.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += bVar7.W;
                                    if (bVar7.k.f1398c != null) {
                                        i4 = bVar7.k.d();
                                        if (bVar7 != cVar.as[3]) {
                                            i4 += bVar7.k.f1398c.f1396a.i.d();
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    eVar4.a(bVar7.k.f, bVar7.i.f, i5, 1);
                                    eVar4.b(bVar7.k.f, bVar7.k.f1398c.f, -i4, 1);
                                }
                                bVar9 = bVar7;
                                bVar7 = bVar7.Y;
                            }
                            if (a2 != 1) {
                                int i7 = 0;
                                while (true) {
                                    int i8 = a2 - 1;
                                    if (i7 >= i8) {
                                        break;
                                    }
                                    b bVar10 = cVar.an[i7];
                                    i7++;
                                    b bVar11 = cVar.an[i7];
                                    android.support.constraint.a.g gVar = bVar10.i.f;
                                    android.support.constraint.a.g gVar2 = bVar10.k.f;
                                    android.support.constraint.a.g gVar3 = bVar11.i.f;
                                    android.support.constraint.a.g gVar4 = bVar11.k.f;
                                    if (bVar11 == cVar.as[c2]) {
                                        gVar4 = cVar.as[1].k.f;
                                    }
                                    int d4 = bVar10.i.d();
                                    if (bVar10.i.f1398c != null && bVar10.i.f1398c.f1396a.k.f1398c != null && bVar10.i.f1398c.f1396a.k.f1398c.f1396a == bVar10) {
                                        d4 += bVar10.i.f1398c.f1396a.k.d();
                                    }
                                    int i9 = a2;
                                    eVar4.a(gVar, bVar10.i.f1398c.f, d4, 2);
                                    int d5 = bVar10.k.d();
                                    if (bVar10.k.f1398c != null && bVar10.Y != null) {
                                        d5 += bVar10.Y.i.f1398c != null ? bVar10.Y.i.d() : 0;
                                    }
                                    eVar4.b(gVar2, bVar10.k.f1398c.f, -d5, 2);
                                    if (i7 == i8) {
                                        int d6 = bVar11.i.d();
                                        if (bVar11.i.f1398c != null && bVar11.i.f1398c.f1396a.k.f1398c != null && bVar11.i.f1398c.f1396a.k.f1398c.f1396a == bVar11) {
                                            d6 += bVar11.i.f1398c.f1396a.k.d();
                                        }
                                        eVar4.a(gVar3, bVar11.i.f1398c.f, d6, 2);
                                        a aVar = bVar11.k;
                                        if (bVar11 == cVar.as[3]) {
                                            aVar = cVar.as[1].k;
                                        }
                                        int d7 = aVar.d();
                                        if (aVar.f1398c != null && aVar.f1398c.f1396a.i.f1398c != null && aVar.f1398c.f1396a.i.f1398c.f1396a == bVar11) {
                                            d7 += aVar.f1398c.f1396a.i.d();
                                        }
                                        i3 = 2;
                                        eVar4.b(gVar4, aVar.f1398c.f, -d7, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    if (bVar6.f > 0) {
                                        eVar4.b(gVar2, gVar, bVar6.f, i3);
                                    }
                                    android.support.constraint.a.b b2 = eVar.b();
                                    b2.a(bVar10.W, f, bVar11.W, gVar, bVar10.i.d(), gVar2, bVar10.k.d(), gVar3, bVar11.i.d(), gVar4, bVar11.k.d());
                                    eVar4.a(b2);
                                    a2 = i9;
                                    c2 = 3;
                                }
                            } else {
                                b bVar12 = cVar.an[i5];
                                int d8 = bVar12.i.d();
                                if (bVar12.i.f1398c != null) {
                                    d8 += bVar12.i.f1398c.d();
                                }
                                int d9 = bVar12.k.d();
                                if (bVar12.k.f1398c != null) {
                                    d9 += bVar12.k.f1398c.d();
                                }
                                android.support.constraint.a.g gVar5 = bVar6.k.f1398c.f;
                                if (bVar12 == cVar.as[3]) {
                                    gVar5 = cVar.as[1].k.f1398c.f;
                                }
                                if (bVar12.f1414c == 1) {
                                    eVar4.a(bVar6.i.f, bVar6.i.f1398c.f, d8, 1);
                                    eVar4.b(bVar6.k.f, gVar5, -d9, 1);
                                    eVar4.c(bVar6.k.f, bVar6.i.f, bVar6.h(), 2);
                                } else {
                                    eVar4.c(bVar12.i.f, bVar12.i.f1398c.f, d8, 1);
                                    eVar4.c(bVar12.k.f, gVar5, -d9, 1);
                                }
                            }
                        } else {
                            b bVar13 = bVar7;
                            b bVar14 = null;
                            b bVar15 = null;
                            boolean z6 = false;
                            while (bVar13 != null) {
                                b bVar16 = bVar13.Y;
                                if (bVar16 == null) {
                                    bVar = cVar.as[1];
                                    z = true;
                                } else {
                                    bVar = bVar14;
                                    z = z6;
                                }
                                if (z4) {
                                    a aVar2 = bVar13.i;
                                    int d10 = aVar2.d();
                                    if (bVar15 != null) {
                                        d10 += bVar15.k.d();
                                    }
                                    eVar4.a(aVar2.f, aVar2.f1398c.f, d10, bVar7 != bVar13 ? 3 : 1);
                                    if (bVar13.G == b.a.MATCH_CONSTRAINT) {
                                        a aVar3 = bVar13.k;
                                        if (bVar13.f1414c == 1) {
                                            eVar4.c(aVar3.f, aVar2.f, Math.max(bVar13.e, bVar13.h()), 3);
                                        } else {
                                            eVar4.a(aVar2.f, aVar2.f1398c.f, aVar2.f1399d, 3);
                                            eVar4.b(aVar3.f, aVar2.f, bVar13.e, 3);
                                        }
                                    }
                                } else if (z3 || !z || bVar15 == null) {
                                    if (!z3 && !z && bVar15 == null) {
                                        if (bVar13.i.f1398c == null) {
                                            eVar4.a(bVar13.i.f, bVar13.n());
                                        } else {
                                            eVar4.c(bVar13.i.f, bVar6.i.f1398c.f, bVar13.i.d(), 5);
                                        }
                                    } else {
                                        a aVar4 = bVar13.i;
                                        a aVar5 = bVar13.k;
                                        int d11 = aVar4.d();
                                        int d12 = aVar5.d();
                                        bVar2 = bVar13;
                                        z2 = z3;
                                        eVar4.a(aVar4.f, aVar4.f1398c.f, d11, 1);
                                        int i10 = i6;
                                        eVar4.b(aVar5.f, aVar5.f1398c.f, -d12, 1);
                                        android.support.constraint.a.g gVar6 = aVar4.f1398c != null ? aVar4.f1398c.f : null;
                                        if (bVar15 == null) {
                                            gVar6 = bVar6.i.f1398c != null ? bVar6.i.f1398c.f : null;
                                        }
                                        if (bVar16 == null) {
                                            bVar16 = bVar.k.f1398c != null ? bVar.k.f1398c.f1396a : null;
                                        }
                                        b bVar17 = bVar16;
                                        if (bVar17 != null) {
                                            android.support.constraint.a.g gVar7 = bVar17.i.f;
                                            if (z) {
                                                gVar7 = bVar.k.f1398c != null ? bVar.k.f1398c.f : null;
                                            }
                                            if (gVar6 != null && gVar7 != null) {
                                                android.support.constraint.a.g gVar8 = gVar6;
                                                bVar4 = bVar6;
                                                android.support.constraint.a.g gVar9 = gVar7;
                                                i2 = i10;
                                                bVar5 = bVar;
                                                bVar3 = bVar17;
                                                eVar3 = eVar4;
                                                eVar.a(aVar4.f, gVar8, d11, 0.5f, gVar9, aVar5.f, d12, 4);
                                                if (z) {
                                                    bVar3 = null;
                                                }
                                                bVar6 = bVar4;
                                                z6 = z;
                                                eVar4 = eVar3;
                                                i6 = i2;
                                                bVar14 = bVar5;
                                                bVar15 = bVar2;
                                                z3 = z2;
                                                bVar13 = bVar3;
                                                cVar = this;
                                            }
                                        }
                                        bVar3 = bVar17;
                                        bVar4 = bVar6;
                                        bVar5 = bVar;
                                        eVar3 = eVar4;
                                        i2 = i10;
                                        if (z) {
                                        }
                                        bVar6 = bVar4;
                                        z6 = z;
                                        eVar4 = eVar3;
                                        i6 = i2;
                                        bVar14 = bVar5;
                                        bVar15 = bVar2;
                                        z3 = z2;
                                        bVar13 = bVar3;
                                        cVar = this;
                                    }
                                } else if (bVar13.k.f1398c == null) {
                                    eVar4.a(bVar13.k.f, bVar13.q());
                                } else {
                                    eVar4.c(bVar13.k.f, bVar.k.f1398c.f, -bVar13.k.d(), 5);
                                }
                                bVar2 = bVar13;
                                z2 = z3;
                                bVar3 = bVar16;
                                bVar4 = bVar6;
                                i2 = i6;
                                bVar5 = bVar;
                                eVar3 = eVar4;
                                if (z) {
                                }
                                bVar6 = bVar4;
                                z6 = z;
                                eVar4 = eVar3;
                                i6 = i2;
                                bVar14 = bVar5;
                                bVar15 = bVar2;
                                z3 = z2;
                                bVar13 = bVar3;
                                cVar = this;
                            }
                            b bVar18 = bVar6;
                            i = i6;
                            eVar2 = eVar4;
                            if (z4) {
                                a aVar6 = bVar7.i;
                                a aVar7 = bVar14.k;
                                int d13 = aVar6.d();
                                int d14 = aVar7.d();
                                android.support.constraint.a.g gVar10 = bVar18.i.f1398c != null ? bVar18.i.f1398c.f : null;
                                android.support.constraint.a.g gVar11 = bVar14.k.f1398c != null ? bVar14.k.f1398c.f : null;
                                if (gVar10 != null && gVar11 != null) {
                                    eVar2.b(aVar7.f, gVar11, -d14, 1);
                                    eVar.a(aVar6.f, gVar10, d13, bVar18.E, gVar11, aVar7.f, d14, 4);
                                }
                            }
                            i6 = i + 1;
                            eVar4 = eVar2;
                            cVar = this;
                            i5 = 0;
                        }
                    } else {
                        e.a(cVar, eVar4, a2, bVar6);
                    }
                }
            }
            i = i6;
            eVar2 = eVar4;
            i6 = i + 1;
            eVar4 = eVar2;
            cVar = this;
            i5 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(android.support.constraint.a.e eVar) {
        int i;
        android.support.constraint.a.e eVar2;
        b bVar;
        boolean z;
        b bVar2;
        boolean z2;
        b bVar3;
        b bVar4;
        b bVar5;
        android.support.constraint.a.e eVar3;
        int i2;
        android.support.constraint.a.g gVar;
        android.support.constraint.a.g gVar2;
        int i3;
        int i4;
        c cVar = this;
        android.support.constraint.a.e eVar4 = eVar;
        int i5 = 0;
        int i6 = 0;
        while (i6 < cVar.am) {
            b bVar6 = cVar.ao[i6];
            int a2 = a(eVar, cVar.as, cVar.ao[i6], 1, cVar.ar);
            b bVar7 = cVar.as[2];
            if (bVar7 != null) {
                if (cVar.ar[1]) {
                    int o = bVar6.o();
                    while (bVar7 != null) {
                        eVar4.a(bVar7.j.f, o);
                        b bVar8 = bVar7.Z;
                        o += bVar7.j.d() + bVar7.l() + bVar7.l.d();
                        bVar7 = bVar8;
                    }
                } else {
                    boolean z3 = bVar6.T == 0;
                    boolean z4 = bVar6.T == 2;
                    boolean z5 = cVar.H == b.a.WRAP_CONTENT;
                    if ((cVar.aq != 2 && cVar.aq != 8) || !cVar.ar[i5] || !bVar6.V || z4 || z5 || bVar6.T != 0) {
                        char c2 = 3;
                        if (a2 != 0 && !z4) {
                            b bVar9 = null;
                            float f = 0.0f;
                            while (bVar7 != null) {
                                if (bVar7.H != b.a.MATCH_CONSTRAINT) {
                                    int d2 = bVar7.j.d();
                                    if (bVar9 != null) {
                                        d2 += bVar9.l.d();
                                    }
                                    eVar4.a(bVar7.j.f, bVar7.j.f1398c.f, d2, bVar7.j.f1398c.f1396a.H == b.a.MATCH_CONSTRAINT ? 2 : 3);
                                    int d3 = bVar7.l.d();
                                    if (bVar7.l.f1398c.f1396a.j.f1398c != null && bVar7.l.f1398c.f1396a.j.f1398c.f1396a == bVar7) {
                                        d3 += bVar7.l.f1398c.f1396a.j.d();
                                    }
                                    eVar4.b(bVar7.l.f, bVar7.l.f1398c.f, -d3, bVar7.l.f1398c.f1396a.H == b.a.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += bVar7.X;
                                    if (bVar7.l.f1398c != null) {
                                        i4 = bVar7.l.d();
                                        if (bVar7 != cVar.as[3]) {
                                            i4 += bVar7.l.f1398c.f1396a.j.d();
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    eVar4.a(bVar7.l.f, bVar7.j.f, i5, 1);
                                    eVar4.b(bVar7.l.f, bVar7.l.f1398c.f, -i4, 1);
                                }
                                bVar9 = bVar7;
                                bVar7 = bVar7.Z;
                            }
                            if (a2 != 1) {
                                int i7 = 0;
                                while (true) {
                                    int i8 = a2 - 1;
                                    if (i7 >= i8) {
                                        break;
                                    }
                                    b bVar10 = cVar.an[i7];
                                    i7++;
                                    b bVar11 = cVar.an[i7];
                                    android.support.constraint.a.g gVar3 = bVar10.j.f;
                                    android.support.constraint.a.g gVar4 = bVar10.l.f;
                                    android.support.constraint.a.g gVar5 = bVar11.j.f;
                                    android.support.constraint.a.g gVar6 = bVar11.l.f;
                                    if (bVar11 == cVar.as[c2]) {
                                        gVar6 = cVar.as[1].l.f;
                                    }
                                    int d4 = bVar10.j.d();
                                    if (bVar10.j.f1398c != null && bVar10.j.f1398c.f1396a.l.f1398c != null && bVar10.j.f1398c.f1396a.l.f1398c.f1396a == bVar10) {
                                        d4 += bVar10.j.f1398c.f1396a.l.d();
                                    }
                                    int i9 = a2;
                                    eVar4.a(gVar3, bVar10.j.f1398c.f, d4, 2);
                                    int d5 = bVar10.l.d();
                                    if (bVar10.l.f1398c != null && bVar10.Z != null) {
                                        d5 += bVar10.Z.j.f1398c != null ? bVar10.Z.j.d() : 0;
                                    }
                                    eVar4.b(gVar4, bVar10.l.f1398c.f, -d5, 2);
                                    if (i7 == i8) {
                                        int d6 = bVar11.j.d();
                                        if (bVar11.j.f1398c != null && bVar11.j.f1398c.f1396a.l.f1398c != null && bVar11.j.f1398c.f1396a.l.f1398c.f1396a == bVar11) {
                                            d6 += bVar11.j.f1398c.f1396a.l.d();
                                        }
                                        eVar4.a(gVar5, bVar11.j.f1398c.f, d6, 2);
                                        a aVar = bVar11.l;
                                        if (bVar11 == cVar.as[3]) {
                                            aVar = cVar.as[1].l;
                                        }
                                        int d7 = aVar.d();
                                        if (aVar.f1398c != null && aVar.f1398c.f1396a.j.f1398c != null && aVar.f1398c.f1396a.j.f1398c.f1396a == bVar11) {
                                            d7 += aVar.f1398c.f1396a.j.d();
                                        }
                                        i3 = 2;
                                        eVar4.b(gVar6, aVar.f1398c.f, -d7, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    if (bVar6.h > 0) {
                                        eVar4.b(gVar4, gVar3, bVar6.h, i3);
                                    }
                                    android.support.constraint.a.b b2 = eVar.b();
                                    b2.a(bVar10.X, f, bVar11.X, gVar3, bVar10.j.d(), gVar4, bVar10.l.d(), gVar5, bVar11.j.d(), gVar6, bVar11.l.d());
                                    eVar4.a(b2);
                                    a2 = i9;
                                    c2 = 3;
                                }
                            } else {
                                b bVar12 = cVar.an[i5];
                                int d8 = bVar12.j.d();
                                if (bVar12.j.f1398c != null) {
                                    d8 += bVar12.j.f1398c.d();
                                }
                                int d9 = bVar12.l.d();
                                if (bVar12.l.f1398c != null) {
                                    d9 += bVar12.l.f1398c.d();
                                }
                                android.support.constraint.a.g gVar7 = bVar6.l.f1398c.f;
                                if (bVar12 == cVar.as[3]) {
                                    gVar7 = cVar.as[1].l.f1398c.f;
                                }
                                if (bVar12.f1415d == 1) {
                                    eVar4.a(bVar6.j.f, bVar6.j.f1398c.f, d8, 1);
                                    eVar4.b(bVar6.l.f, gVar7, -d9, 1);
                                    eVar4.c(bVar6.l.f, bVar6.j.f, bVar6.l(), 2);
                                } else {
                                    eVar4.c(bVar12.j.f, bVar12.j.f1398c.f, d8, 1);
                                    eVar4.c(bVar12.l.f, gVar7, -d9, 1);
                                }
                            }
                        } else {
                            b bVar13 = bVar7;
                            b bVar14 = null;
                            b bVar15 = null;
                            boolean z6 = false;
                            while (bVar13 != null) {
                                b bVar16 = bVar13.Z;
                                if (bVar16 == null) {
                                    bVar = cVar.as[1];
                                    z = true;
                                } else {
                                    bVar = bVar14;
                                    z = z6;
                                }
                                if (z4) {
                                    a aVar2 = bVar13.j;
                                    int d10 = aVar2.d();
                                    if (bVar15 != null) {
                                        d10 += bVar15.l.d();
                                    }
                                    int i10 = bVar7 != bVar13 ? 3 : 1;
                                    if (aVar2.f1398c != null) {
                                        gVar = aVar2.f;
                                        gVar2 = aVar2.f1398c.f;
                                    } else if (bVar13.m.f1398c != null) {
                                        gVar = bVar13.m.f;
                                        gVar2 = bVar13.m.f1398c.f;
                                        d10 -= aVar2.d();
                                    } else {
                                        gVar = null;
                                        gVar2 = null;
                                    }
                                    if (gVar != null && gVar2 != null) {
                                        eVar4.a(gVar, gVar2, d10, i10);
                                    }
                                    if (bVar13.H == b.a.MATCH_CONSTRAINT) {
                                        a aVar3 = bVar13.l;
                                        if (bVar13.f1415d == 1) {
                                            eVar4.c(aVar3.f, aVar2.f, Math.max(bVar13.g, bVar13.l()), 3);
                                        } else {
                                            eVar4.a(aVar2.f, aVar2.f1398c.f, aVar2.f1399d, 3);
                                            eVar4.b(aVar3.f, aVar2.f, bVar13.g, 3);
                                        }
                                    }
                                } else if (z3 || !z || bVar15 == null) {
                                    if (!z3 && !z && bVar15 == null) {
                                        if (bVar13.j.f1398c == null) {
                                            eVar4.a(bVar13.j.f, bVar13.o());
                                        } else {
                                            eVar4.c(bVar13.j.f, bVar6.j.f1398c.f, bVar13.j.d(), 5);
                                        }
                                    } else {
                                        a aVar4 = bVar13.j;
                                        a aVar5 = bVar13.l;
                                        int d11 = aVar4.d();
                                        int d12 = aVar5.d();
                                        bVar2 = bVar13;
                                        z2 = z3;
                                        eVar4.a(aVar4.f, aVar4.f1398c.f, d11, 1);
                                        int i11 = i6;
                                        eVar4.b(aVar5.f, aVar5.f1398c.f, -d12, 1);
                                        android.support.constraint.a.g gVar8 = aVar4.f1398c != null ? aVar4.f1398c.f : null;
                                        if (bVar15 == null) {
                                            gVar8 = bVar6.j.f1398c != null ? bVar6.j.f1398c.f : null;
                                        }
                                        if (bVar16 == null) {
                                            bVar16 = bVar.l.f1398c != null ? bVar.l.f1398c.f1396a : null;
                                        }
                                        b bVar17 = bVar16;
                                        if (bVar17 != null) {
                                            android.support.constraint.a.g gVar9 = bVar17.j.f;
                                            if (z) {
                                                gVar9 = bVar.l.f1398c != null ? bVar.l.f1398c.f : null;
                                            }
                                            if (gVar8 != null && gVar9 != null) {
                                                android.support.constraint.a.g gVar10 = gVar8;
                                                bVar4 = bVar6;
                                                android.support.constraint.a.g gVar11 = gVar9;
                                                i2 = i11;
                                                bVar5 = bVar;
                                                bVar3 = bVar17;
                                                eVar3 = eVar4;
                                                eVar.a(aVar4.f, gVar10, d11, 0.5f, gVar11, aVar5.f, d12, 4);
                                                if (z) {
                                                    bVar3 = null;
                                                }
                                                bVar6 = bVar4;
                                                z6 = z;
                                                eVar4 = eVar3;
                                                i6 = i2;
                                                bVar14 = bVar5;
                                                bVar15 = bVar2;
                                                z3 = z2;
                                                bVar13 = bVar3;
                                                cVar = this;
                                            }
                                        }
                                        bVar3 = bVar17;
                                        bVar4 = bVar6;
                                        bVar5 = bVar;
                                        eVar3 = eVar4;
                                        i2 = i11;
                                        if (z) {
                                        }
                                        bVar6 = bVar4;
                                        z6 = z;
                                        eVar4 = eVar3;
                                        i6 = i2;
                                        bVar14 = bVar5;
                                        bVar15 = bVar2;
                                        z3 = z2;
                                        bVar13 = bVar3;
                                        cVar = this;
                                    }
                                } else if (bVar13.l.f1398c == null) {
                                    eVar4.a(bVar13.l.f, bVar13.p());
                                } else {
                                    eVar4.c(bVar13.l.f, bVar.l.f1398c.f, -bVar13.l.d(), 5);
                                }
                                bVar2 = bVar13;
                                z2 = z3;
                                bVar3 = bVar16;
                                bVar4 = bVar6;
                                i2 = i6;
                                bVar5 = bVar;
                                eVar3 = eVar4;
                                if (z) {
                                }
                                bVar6 = bVar4;
                                z6 = z;
                                eVar4 = eVar3;
                                i6 = i2;
                                bVar14 = bVar5;
                                bVar15 = bVar2;
                                z3 = z2;
                                bVar13 = bVar3;
                                cVar = this;
                            }
                            b bVar18 = bVar6;
                            i = i6;
                            eVar2 = eVar4;
                            if (z4) {
                                a aVar6 = bVar7.j;
                                a aVar7 = bVar14.l;
                                int d13 = aVar6.d();
                                int d14 = aVar7.d();
                                android.support.constraint.a.g gVar12 = bVar18.j.f1398c != null ? bVar18.j.f1398c.f : null;
                                android.support.constraint.a.g gVar13 = bVar14.l.f1398c != null ? bVar14.l.f1398c.f : null;
                                if (gVar12 != null && gVar13 != null) {
                                    eVar2.b(aVar7.f, gVar13, -d14, 1);
                                    eVar.a(aVar6.f, gVar12, d13, bVar18.F, gVar13, aVar7.f, d14, 4);
                                }
                            }
                            i6 = i + 1;
                            eVar4 = eVar2;
                            cVar = this;
                            i5 = 0;
                        }
                    } else {
                        e.b(cVar, eVar4, a2, bVar6);
                    }
                }
            }
            i = i6;
            eVar2 = eVar4;
            i6 = i + 1;
            eVar4 = eVar2;
            cVar = this;
            i5 = 0;
        }
    }

    public void a(android.support.constraint.a.e eVar, int i, boolean[] zArr) {
        zArr[2] = false;
        b(eVar, i);
        int size = this.aj.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.aj.get(i2);
            bVar.b(eVar, i);
            if (bVar.G == b.a.MATCH_CONSTRAINT && bVar.h() < bVar.k()) {
                zArr[2] = true;
            }
            if (bVar.H == b.a.MATCH_CONSTRAINT && bVar.l() < bVar.m()) {
                zArr[2] = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    @Override // android.support.constraint.a.a.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F() {
        boolean z;
        boolean z2;
        boolean z3;
        int max;
        int max2;
        int i = this.w;
        int i2 = this.x;
        int max3 = Math.max(0, h());
        int max4 = Math.max(0, l());
        this.at = false;
        this.au = false;
        if (this.r != null) {
            if (this.ak == null) {
                this.ak = new g(this);
            }
            this.ak.a(this);
            b(this.af);
            c(this.ag);
            A();
            a(this.aa.f());
        } else {
            this.w = 0;
            this.x = 0;
        }
        b.a aVar = this.H;
        b.a aVar2 = this.G;
        char c2 = 2;
        if (this.aq == 2 && (this.H == b.a.WRAP_CONTENT || this.G == b.a.WRAP_CONTENT)) {
            a(this.aj, this.ar);
            z = this.ar[0];
            if (max3 > 0 && max4 > 0 && (this.ad > max3 || this.ae > max4)) {
                z = false;
            }
            if (z) {
                if (this.G == b.a.WRAP_CONTENT) {
                    this.G = b.a.FIXED;
                    if (max3 > 0 && max3 < this.ad) {
                        this.at = true;
                        d(max3);
                    } else {
                        d(Math.max(this.B, this.ad));
                    }
                }
                if (this.H == b.a.WRAP_CONTENT) {
                    this.H = b.a.FIXED;
                    if (max4 > 0 && max4 < this.ae) {
                        this.au = true;
                        e(max4);
                    } else {
                        e(Math.max(this.C, this.ae));
                    }
                }
            }
        } else {
            z = false;
        }
        J();
        int size = this.aj.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.aj.get(i3);
            if (bVar instanceof h) {
                ((h) bVar).F();
            }
        }
        boolean z4 = z;
        int i4 = 0;
        boolean z5 = true;
        while (z5) {
            int i5 = i4 + 1;
            try {
                this.aa.a();
                z2 = c(this.aa, Integer.MAX_VALUE);
                if (z2) {
                    try {
                        this.aa.e();
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (!z2) {
                        }
                        if (i5 < 8) {
                        }
                        z3 = false;
                        max = Math.max(this.B, h());
                        if (max > h()) {
                        }
                        max2 = Math.max(this.C, l());
                        if (max2 > l()) {
                        }
                        if (!z4) {
                        }
                        z5 = z3;
                        i4 = i5;
                        c2 = 2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                z2 = z5;
            }
            if (!z2) {
                a(this.aa, Integer.MAX_VALUE, this.ar);
            } else {
                b(this.aa, Integer.MAX_VALUE);
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    b bVar2 = this.aj.get(i6);
                    if (bVar2.G == b.a.MATCH_CONSTRAINT && bVar2.h() < bVar2.k()) {
                        this.ar[c2] = true;
                        break;
                    } else {
                        if (bVar2.H == b.a.MATCH_CONSTRAINT && bVar2.l() < bVar2.m()) {
                            this.ar[c2] = true;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (i5 < 8 || !this.ar[c2]) {
                z3 = false;
            } else {
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    b bVar3 = this.aj.get(i9);
                    i7 = Math.max(i7, bVar3.w + bVar3.h());
                    i8 = Math.max(i8, bVar3.x + bVar3.l());
                }
                int max5 = Math.max(this.B, i7);
                int max6 = Math.max(this.C, i8);
                if (aVar2 != b.a.WRAP_CONTENT || h() >= max5) {
                    z3 = false;
                } else {
                    d(max5);
                    this.G = b.a.WRAP_CONTENT;
                    z3 = true;
                    z4 = true;
                }
                if (aVar == b.a.WRAP_CONTENT && l() < max6) {
                    e(max6);
                    this.H = b.a.WRAP_CONTENT;
                    z3 = true;
                    z4 = true;
                }
            }
            max = Math.max(this.B, h());
            if (max > h()) {
                d(max);
                this.G = b.a.FIXED;
                z3 = true;
                z4 = true;
            }
            max2 = Math.max(this.C, l());
            if (max2 > l()) {
                e(max2);
                this.H = b.a.FIXED;
                z3 = true;
                z4 = true;
            }
            if (!z4) {
                if (this.G == b.a.WRAP_CONTENT && max3 > 0 && h() > max3) {
                    this.at = true;
                    this.G = b.a.FIXED;
                    d(max3);
                    z3 = true;
                    z4 = true;
                }
                if (this.H == b.a.WRAP_CONTENT && max4 > 0 && l() > max4) {
                    this.au = true;
                    this.H = b.a.FIXED;
                    e(max4);
                    z5 = true;
                    z4 = true;
                    i4 = i5;
                    c2 = 2;
                }
            }
            z5 = z3;
            i4 = i5;
            c2 = 2;
        }
        if (this.r != null) {
            int max7 = Math.max(this.B, h());
            int max8 = Math.max(this.C, l());
            this.ak.b(this);
            d(max7 + this.af + this.ah);
            e(max8 + this.ag + this.ai);
        } else {
            this.w = i;
            this.x = i2;
        }
        if (z4) {
            this.G = aVar2;
            this.H = aVar;
        }
        a(this.aa.f());
        if (this == H()) {
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(b bVar, boolean[] zArr) {
        int i;
        b bVar2;
        int i2 = 0;
        if (bVar.G == b.a.MATCH_CONSTRAINT && bVar.H == b.a.MATCH_CONSTRAINT && bVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int i3 = bVar.i();
        if (bVar.G == b.a.MATCH_CONSTRAINT && bVar.H != b.a.MATCH_CONSTRAINT && bVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        boolean z = true;
        bVar.Q = true;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.D() == 1) {
                if (dVar.F() != -1) {
                    i2 = dVar.F();
                } else if (dVar.G() != -1) {
                    i3 = dVar.G();
                }
                i3 = 0;
            } else {
                i2 = i3;
            }
        } else if (!bVar.k.j() && !bVar.i.j()) {
            i2 = i3 + bVar.f();
        } else {
            if (bVar.k.f1398c != null && bVar.i.f1398c != null && (bVar.k.f1398c == bVar.i.f1398c || (bVar.k.f1398c.f1396a == bVar.i.f1398c.f1396a && bVar.k.f1398c.f1396a != bVar.r))) {
                zArr[0] = false;
                return;
            }
            b bVar3 = null;
            if (bVar.k.f1398c != null) {
                bVar2 = bVar.k.f1398c.f1396a;
                i = bVar.k.d() + i3;
                if (!bVar2.b() && !bVar2.Q) {
                    a(bVar2, zArr);
                }
            } else {
                i = i3;
                bVar2 = null;
            }
            if (bVar.i.f1398c != null) {
                bVar3 = bVar.i.f1398c.f1396a;
                i3 += bVar.i.d();
                if (!bVar3.b() && !bVar3.Q) {
                    a(bVar3, zArr);
                }
            }
            if (bVar.k.f1398c != null && !bVar2.b()) {
                if (bVar.k.f1398c.f1397b == a.c.RIGHT) {
                    i += bVar2.K - bVar2.i();
                } else if (bVar.k.f1398c.c() == a.c.LEFT) {
                    i += bVar2.K;
                }
                bVar.N = bVar2.N || !(bVar2.i.f1398c == null || bVar2.k.f1398c == null || bVar2.G == b.a.MATCH_CONSTRAINT);
                if (bVar.N && (bVar2.i.f1398c == null || bVar2.i.f1398c.f1396a != bVar)) {
                    i += i - bVar2.K;
                }
            }
            if (bVar.i.f1398c != null && !bVar3.b()) {
                if (bVar.i.f1398c.c() == a.c.LEFT) {
                    i3 += bVar3.J - bVar3.i();
                } else if (bVar.i.f1398c.c() == a.c.RIGHT) {
                    i3 += bVar3.J;
                }
                if (!bVar3.M && (bVar3.i.f1398c == null || bVar3.k.f1398c == null || bVar3.G == b.a.MATCH_CONSTRAINT)) {
                    z = false;
                }
                bVar.M = z;
                if (bVar.M && (bVar3.k.f1398c == null || bVar3.k.f1398c.f1396a != bVar)) {
                    i2 = i3 + (i3 - bVar3.J);
                    if (bVar.d() == 8) {
                        i2 -= bVar.s;
                        i -= bVar.s;
                    }
                    bVar.J = i2;
                    bVar.K = i;
                }
            }
            i2 = i3;
            if (bVar.d() == 8) {
            }
            bVar.J = i2;
            bVar.K = i;
        }
        i = i3;
        if (bVar.d() == 8) {
        }
        bVar.J = i2;
        bVar.K = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(b bVar, boolean[] zArr) {
        int i;
        b bVar2;
        int i2 = 0;
        if (bVar.H == b.a.MATCH_CONSTRAINT && bVar.G != b.a.MATCH_CONSTRAINT && bVar.u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int j = bVar.j();
        boolean z = true;
        bVar.R = true;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.D() == 0) {
                if (dVar.F() != -1) {
                    i2 = dVar.F();
                } else if (dVar.G() != -1) {
                    j = dVar.G();
                }
                j = 0;
            } else {
                i2 = j;
            }
        } else if (bVar.m.f1398c == null && bVar.j.f1398c == null && bVar.l.f1398c == null) {
            i2 = j + bVar.g();
        } else {
            if (bVar.l.f1398c != null && bVar.j.f1398c != null && (bVar.l.f1398c == bVar.j.f1398c || (bVar.l.f1398c.f1396a == bVar.j.f1398c.f1396a && bVar.l.f1398c.f1396a != bVar.r))) {
                zArr[0] = false;
                return;
            }
            if (bVar.m.j()) {
                b b2 = bVar.m.f1398c.b();
                if (!b2.R) {
                    b(b2, zArr);
                }
                int max = Math.max((b2.I - b2.t) + j, j);
                int max2 = Math.max((b2.L - b2.t) + j, j);
                if (bVar.d() == 8) {
                    max -= bVar.t;
                    max2 -= bVar.t;
                }
                bVar.I = max;
                bVar.L = max2;
                return;
            }
            b bVar3 = null;
            if (bVar.j.j()) {
                bVar2 = bVar.j.f1398c.b();
                i = bVar.j.d() + j;
                if (!bVar2.b() && !bVar2.R) {
                    b(bVar2, zArr);
                }
            } else {
                i = j;
                bVar2 = null;
            }
            if (bVar.l.j()) {
                bVar3 = bVar.l.f1398c.b();
                j += bVar.l.d();
                if (!bVar3.b() && !bVar3.R) {
                    b(bVar3, zArr);
                }
            }
            if (bVar.j.f1398c != null && !bVar2.b()) {
                if (bVar.j.f1398c.c() == a.c.TOP) {
                    i += bVar2.I - bVar2.j();
                } else if (bVar.j.f1398c.c() == a.c.BOTTOM) {
                    i += bVar2.I;
                }
                bVar.O = bVar2.O || !(bVar2.j.f1398c == null || bVar2.j.f1398c.f1396a == bVar || bVar2.l.f1398c == null || bVar2.l.f1398c.f1396a == bVar || bVar2.H == b.a.MATCH_CONSTRAINT);
                if (bVar.O && (bVar2.l.f1398c == null || bVar2.l.f1398c.f1396a != bVar)) {
                    i += i - bVar2.I;
                }
            }
            if (bVar.l.f1398c != null && !bVar3.b()) {
                if (bVar.l.f1398c.c() == a.c.BOTTOM) {
                    j += bVar3.L - bVar3.j();
                } else if (bVar.l.f1398c.c() == a.c.TOP) {
                    j += bVar3.L;
                }
                if (!bVar3.P && (bVar3.j.f1398c == null || bVar3.j.f1398c.f1396a == bVar || bVar3.l.f1398c == null || bVar3.l.f1398c.f1396a == bVar || bVar3.H == b.a.MATCH_CONSTRAINT)) {
                    z = false;
                }
                bVar.P = z;
                if (bVar.P && (bVar3.j.f1398c == null || bVar3.j.f1398c.f1396a != bVar)) {
                    j += j - bVar3.L;
                }
            }
            if (bVar.d() == 8) {
                i -= bVar.t;
                j -= bVar.t;
            }
            bVar.I = i;
            bVar.L = j;
        }
        i = i2;
        if (bVar.d() == 8) {
        }
        bVar.I = i;
        bVar.L = j;
    }

    public void a(ArrayList<b> arrayList, boolean[] zArr) {
        int size = arrayList.size();
        char c2 = 0;
        zArr[0] = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i < size) {
            b bVar = arrayList.get(i);
            if (!bVar.b()) {
                if (!bVar.Q) {
                    a(bVar, zArr);
                }
                if (!bVar.R) {
                    b(bVar, zArr);
                }
                if (!zArr[c2]) {
                    return;
                }
                int h = (bVar.J + bVar.K) - bVar.h();
                int l = (bVar.I + bVar.L) - bVar.l();
                int h2 = bVar.G == b.a.MATCH_PARENT ? bVar.h() + bVar.i.f1399d + bVar.k.f1399d : h;
                int l2 = bVar.H == b.a.MATCH_PARENT ? bVar.l() + bVar.j.f1399d + bVar.l.f1399d : l;
                if (bVar.d() == 8) {
                    h2 = 0;
                    l2 = 0;
                }
                i2 = Math.max(i2, bVar.J);
                i3 = Math.max(i3, bVar.K);
                i6 = Math.max(i6, bVar.L);
                i5 = Math.max(i5, bVar.I);
                int max = Math.max(i4, h2);
                i7 = Math.max(i7, l2);
                i4 = max;
            }
            i++;
            c2 = 0;
        }
        this.ad = Math.max(this.B, Math.max(Math.max(i2, i3), i4));
        this.ae = Math.max(this.C, Math.max(Math.max(i5, i6), i7));
        for (int i8 = 0; i8 < size; i8++) {
            b bVar2 = arrayList.get(i8);
            bVar2.Q = false;
            bVar2.R = false;
            bVar2.M = false;
            bVar2.N = false;
            bVar2.O = false;
            bVar2.P = false;
        }
    }

    private void J() {
        this.al = 0;
        this.am = 0;
    }

    void a(b bVar, int i) {
        if (i == 0) {
            while (bVar.i.f1398c != null && bVar.i.f1398c.f1396a.k.f1398c != null && bVar.i.f1398c.f1396a.k.f1398c == bVar.i && bVar.i.f1398c.f1396a != bVar) {
                bVar = bVar.i.f1398c.f1396a;
            }
            d(bVar);
            return;
        }
        if (i == 1) {
            while (bVar.j.f1398c != null && bVar.j.f1398c.f1396a.l.f1398c != null && bVar.j.f1398c.f1396a.l.f1398c == bVar.j && bVar.j.f1398c.f1396a != bVar) {
                bVar = bVar.j.f1398c.f1396a;
            }
            e(bVar);
        }
    }

    private void d(b bVar) {
        for (int i = 0; i < this.al; i++) {
            if (this.ap[i] == bVar) {
                return;
            }
        }
        if (this.al + 1 >= this.ap.length) {
            this.ap = (b[]) Arrays.copyOf(this.ap, this.ap.length * 2);
        }
        this.ap[this.al] = bVar;
        this.al++;
    }

    private void e(b bVar) {
        for (int i = 0; i < this.am; i++) {
            if (this.ao[i] == bVar) {
                return;
            }
        }
        if (this.am + 1 >= this.ao.length) {
            this.ao = (b[]) Arrays.copyOf(this.ao, this.ao.length * 2);
        }
        this.ao[this.am] = bVar;
        this.am++;
    }

    private int a(android.support.constraint.a.e eVar, b[] bVarArr, b bVar, int i, boolean[] zArr) {
        int i2;
        char c2;
        char c3;
        zArr[0] = true;
        zArr[1] = false;
        b bVar2 = null;
        bVarArr[0] = null;
        bVarArr[2] = null;
        bVarArr[1] = null;
        bVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        int i4 = 8;
        if (i == 0) {
            boolean z = bVar.i.f1398c == null || bVar.i.f1398c.f1396a == this;
            bVar.Y = null;
            b bVar3 = null;
            b bVar4 = bVar.d() != 8 ? bVar : null;
            b bVar5 = bVar4;
            i2 = 0;
            b bVar6 = bVar;
            while (bVar6.k.f1398c != null) {
                bVar6.Y = bVar2;
                if (bVar6.d() != 8) {
                    if (bVar5 == null) {
                        bVar5 = bVar6;
                    }
                    if (bVar4 != null && bVar4 != bVar6) {
                        bVar4.Y = bVar6;
                    }
                    bVar4 = bVar6;
                } else {
                    eVar.c(bVar6.i.f, bVar6.i.f1398c.f, 0, 5);
                    eVar.c(bVar6.k.f, bVar6.i.f, 0, 5);
                }
                if (bVar6.d() != 8 && bVar6.G == b.a.MATCH_CONSTRAINT) {
                    if (bVar6.H == b.a.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (bVar6.u <= f) {
                        zArr[0] = false;
                        int i5 = i2 + 1;
                        if (i5 >= this.an.length) {
                            this.an = (b[]) Arrays.copyOf(this.an, this.an.length * 2);
                        }
                        this.an[i2] = bVar6;
                        i2 = i5;
                    }
                }
                if (bVar6.k.f1398c.f1396a.i.f1398c == null || bVar6.k.f1398c.f1396a.i.f1398c.f1396a != bVar6 || bVar6.k.f1398c.f1396a == bVar6) {
                    break;
                }
                bVar3 = bVar6.k.f1398c.f1396a;
                bVar6 = bVar3;
                bVar2 = null;
                f = 0.0f;
            }
            if (bVar6.k.f1398c != null && bVar6.k.f1398c.f1396a != this) {
                z = false;
            }
            if (bVar.i.f1398c == null || bVar3.k.f1398c == null) {
                c3 = 1;
                zArr[1] = true;
            } else {
                c3 = 1;
            }
            bVar.U = z;
            bVar3.Y = null;
            bVarArr[0] = bVar;
            bVarArr[2] = bVar5;
            bVarArr[c3] = bVar3;
            bVarArr[3] = bVar4;
        } else {
            boolean z2 = bVar.j.f1398c == null || bVar.j.f1398c.f1396a == this;
            b bVar7 = null;
            bVar.Z = null;
            b bVar8 = null;
            b bVar9 = bVar.d() != 8 ? bVar : null;
            b bVar10 = bVar9;
            int i6 = 0;
            b bVar11 = bVar;
            while (bVar11.l.f1398c != null) {
                bVar11.Z = bVar7;
                if (bVar11.d() != i4) {
                    if (bVar9 == null) {
                        bVar9 = bVar11;
                    }
                    if (bVar10 != null && bVar10 != bVar11) {
                        bVar10.Z = bVar11;
                    }
                    bVar10 = bVar11;
                } else {
                    eVar.c(bVar11.j.f, bVar11.j.f1398c.f, 0, i3);
                    eVar.c(bVar11.l.f, bVar11.j.f, 0, i3);
                }
                if (bVar11.d() != i4 && bVar11.H == b.a.MATCH_CONSTRAINT) {
                    if (bVar11.G == b.a.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (bVar11.u <= 0.0f) {
                        zArr[0] = false;
                        int i7 = i6 + 1;
                        if (i7 >= this.an.length) {
                            this.an = (b[]) Arrays.copyOf(this.an, this.an.length * 2);
                        }
                        this.an[i6] = bVar11;
                        i6 = i7;
                    }
                }
                if (bVar11.l.f1398c.f1396a.j.f1398c == null || bVar11.l.f1398c.f1396a.j.f1398c.f1396a != bVar11 || bVar11.l.f1398c.f1396a == bVar11) {
                    break;
                }
                bVar8 = bVar11.l.f1398c.f1396a;
                bVar11 = bVar8;
                bVar7 = null;
                i3 = 5;
                i4 = 8;
            }
            i2 = i6;
            if (bVar11.l.f1398c != null && bVar11.l.f1398c.f1396a != this) {
                z2 = false;
            }
            if (bVar.j.f1398c == null || bVar8.l.f1398c == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            bVar.V = z2;
            bVar8.Z = null;
            bVarArr[0] = bVar;
            bVarArr[2] = bVar9;
            bVarArr[c2] = bVar8;
            bVarArr[3] = bVar10;
        }
        return i2;
    }
}
