package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p80 extends ra0 {
    public gf k;
    public z7 l;

    @Override // defpackage.ef
    public final void a(ef efVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (o30.i(this.j) == 3) {
            ed edVar = this.b;
            l(edVar.J, edVar.L, 1);
            return;
        }
        pf pfVar = this.e;
        if (pfVar.c && !pfVar.j && this.d == 3) {
            ed edVar2 = this.b;
            int i2 = edVar2.s;
            if (i2 == 2) {
                ed edVar3 = edVar2.T;
                if (edVar3 != null) {
                    if (edVar3.e.e.j) {
                        pfVar.d((int) ((r5.g * edVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                pf pfVar2 = edVar2.d.e;
                if (pfVar2.j) {
                    int i3 = edVar2.X;
                    if (i3 == -1) {
                        f = pfVar2.g;
                        f2 = edVar2.W;
                    } else if (i3 == 0) {
                        f3 = pfVar2.g * edVar2.W;
                        i = (int) (f3 + 0.5f);
                        pfVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        pfVar.d(i);
                    } else {
                        f = pfVar2.g;
                        f2 = edVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    pfVar.d(i);
                }
            }
        }
        gf gfVar = this.h;
        boolean z = gfVar.c;
        ArrayList arrayList = gfVar.l;
        if (z) {
            gf gfVar2 = this.i;
            boolean z2 = gfVar2.c;
            ArrayList arrayList2 = gfVar2.l;
            if (z2) {
                if (gfVar.j && gfVar2.j && pfVar.j) {
                    return;
                }
                if (!pfVar.j && this.d == 3) {
                    ed edVar4 = this.b;
                    if (edVar4.r == 0 && !edVar4.y()) {
                        gf gfVar3 = (gf) arrayList.get(0);
                        gf gfVar4 = (gf) arrayList2.get(0);
                        int i4 = gfVar3.g + gfVar.f;
                        int i5 = gfVar4.g + gfVar2.f;
                        gfVar.d(i4);
                        gfVar2.d(i5);
                        pfVar.d(i5 - i4);
                        return;
                    }
                }
                if (!pfVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    gf gfVar5 = (gf) arrayList.get(0);
                    int i6 = (((gf) arrayList2.get(0)).g + gfVar2.f) - (gfVar5.g + gfVar.f);
                    int i7 = pfVar.m;
                    if (i6 < i7) {
                        pfVar.d(i6);
                    } else {
                        pfVar.d(i7);
                    }
                }
                if (pfVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    gf gfVar6 = (gf) arrayList.get(0);
                    gf gfVar7 = (gf) arrayList2.get(0);
                    int i8 = gfVar6.g;
                    int i9 = gfVar.f + i8;
                    int i10 = gfVar7.g;
                    int i11 = gfVar2.f + i10;
                    float f4 = this.b.e0;
                    if (gfVar6 == gfVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    gfVar.d((int) ((((i10 - i8) - pfVar.g) * f4) + i8 + 0.5f));
                    gfVar2.d(gfVar.g + pfVar.g);
                }
            }
        }
    }

    @Override // defpackage.ra0
    public final void d() {
        ed edVar;
        ed edVar2;
        ed edVar3;
        ed edVar4;
        gf gfVar = this.k;
        ed edVar5 = this.b;
        boolean z = edVar5.a;
        pf pfVar = this.e;
        if (z) {
            pfVar.d(edVar5.k());
        }
        boolean z2 = pfVar.j;
        ArrayList arrayList = pfVar.k;
        ArrayList arrayList2 = pfVar.l;
        gf gfVar2 = this.i;
        gf gfVar3 = this.h;
        if (!z2) {
            ed edVar6 = this.b;
            this.d = edVar6.p0[1];
            if (edVar6.E) {
                this.l = new z7(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (edVar4 = this.b.T) != null && edVar4.p0[1] == 1) {
                    int k = (edVar4.k() - this.b.J.e()) - this.b.L.e();
                    ra0.b(gfVar3, edVar4.e.h, this.b.J.e());
                    ra0.b(gfVar2, edVar4.e.i, -this.b.L.e());
                    pfVar.d(k);
                    return;
                }
                if (i == 1) {
                    pfVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (edVar2 = (edVar = this.b).T) != null && edVar2.p0[1] == 1) {
            ra0.b(gfVar3, edVar2.e.h, edVar.J.e());
            ra0.b(gfVar2, edVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = pfVar.j;
        if (z3) {
            ed edVar7 = this.b;
            if (edVar7.a) {
                pc[] pcVarArr = edVar7.Q;
                pc pcVar = pcVarArr[2];
                pc pcVar2 = pcVar.f;
                if (pcVar2 != null && pcVarArr[3].f != null) {
                    boolean y = edVar7.y();
                    ed edVar8 = this.b;
                    if (y) {
                        gfVar3.f = edVar8.Q[2].e();
                        gfVar2.f = -this.b.Q[3].e();
                    } else {
                        gf h = ra0.h(edVar8.Q[2]);
                        if (h != null) {
                            ra0.b(gfVar3, h, this.b.Q[2].e());
                        }
                        gf h2 = ra0.h(this.b.Q[3]);
                        if (h2 != null) {
                            ra0.b(gfVar2, h2, -this.b.Q[3].e());
                        }
                        gfVar3.b = true;
                        gfVar2.b = true;
                    }
                    ed edVar9 = this.b;
                    if (edVar9.E) {
                        ra0.b(gfVar, gfVar3, edVar9.a0);
                        return;
                    }
                    return;
                }
                if (pcVar2 != null) {
                    gf h3 = ra0.h(pcVar);
                    if (h3 != null) {
                        ra0.b(gfVar3, h3, this.b.Q[2].e());
                        ra0.b(gfVar2, gfVar3, pfVar.g);
                        ed edVar10 = this.b;
                        if (edVar10.E) {
                            ra0.b(gfVar, gfVar3, edVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                pc pcVar3 = pcVarArr[3];
                if (pcVar3.f != null) {
                    gf h4 = ra0.h(pcVar3);
                    if (h4 != null) {
                        ra0.b(gfVar2, h4, -this.b.Q[3].e());
                        ra0.b(gfVar3, gfVar2, -pfVar.g);
                    }
                    ed edVar11 = this.b;
                    if (edVar11.E) {
                        ra0.b(gfVar, gfVar3, edVar11.a0);
                        return;
                    }
                    return;
                }
                pc pcVar4 = pcVarArr[4];
                if (pcVar4.f != null) {
                    gf h5 = ra0.h(pcVar4);
                    if (h5 != null) {
                        ra0.b(gfVar, h5, 0);
                        ra0.b(gfVar3, gfVar, -this.b.a0);
                        ra0.b(gfVar2, gfVar3, pfVar.g);
                        return;
                    }
                    return;
                }
                if ((edVar7 instanceof pn) || edVar7.T == null || edVar7.i(7).f != null) {
                    return;
                }
                ed edVar12 = this.b;
                ra0.b(gfVar3, edVar12.T.e.h, edVar12.s());
                ra0.b(gfVar2, gfVar3, pfVar.g);
                ed edVar13 = this.b;
                if (edVar13.E) {
                    ra0.b(gfVar, gfVar3, edVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            pfVar.b(this);
        } else {
            ed edVar14 = this.b;
            int i2 = edVar14.s;
            if (i2 == 2) {
                ed edVar15 = edVar14.T;
                if (edVar15 != null) {
                    pf pfVar2 = edVar15.e.e;
                    arrayList2.add(pfVar2);
                    pfVar2.k.add(pfVar);
                    pfVar.b = true;
                    arrayList.add(gfVar3);
                    arrayList.add(gfVar2);
                }
            } else if (i2 == 3 && !edVar14.y()) {
                ed edVar16 = this.b;
                if (edVar16.r != 3) {
                    pf pfVar3 = edVar16.d.e;
                    arrayList2.add(pfVar3);
                    pfVar3.k.add(pfVar);
                    pfVar.b = true;
                    arrayList.add(gfVar3);
                    arrayList.add(gfVar2);
                }
            }
        }
        ed edVar17 = this.b;
        pc[] pcVarArr2 = edVar17.Q;
        pc pcVar5 = pcVarArr2[2];
        pc pcVar6 = pcVar5.f;
        if (pcVar6 != null && pcVarArr2[3].f != null) {
            boolean y2 = edVar17.y();
            ed edVar18 = this.b;
            if (y2) {
                gfVar3.f = edVar18.Q[2].e();
                gfVar2.f = -this.b.Q[3].e();
            } else {
                gf h6 = ra0.h(edVar18.Q[2]);
                gf h7 = ra0.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(gfVar, gfVar3, 1, this.l);
            }
        } else if (pcVar6 != null) {
            gf h8 = ra0.h(pcVar5);
            if (h8 != null) {
                ra0.b(gfVar3, h8, this.b.Q[2].e());
                c(gfVar2, gfVar3, 1, pfVar);
                if (this.b.E) {
                    c(gfVar, gfVar3, 1, this.l);
                }
                if (this.d == 3) {
                    ed edVar19 = this.b;
                    if (edVar19.W > 0.0f) {
                        tn tnVar = edVar19.d;
                        if (tnVar.d == 3) {
                            tnVar.e.k.add(pfVar);
                            arrayList2.add(this.b.d.e);
                            pfVar.a = this;
                        }
                    }
                }
            }
        } else {
            pc pcVar7 = pcVarArr2[3];
            if (pcVar7.f != null) {
                gf h9 = ra0.h(pcVar7);
                if (h9 != null) {
                    ra0.b(gfVar2, h9, -this.b.Q[3].e());
                    c(gfVar3, gfVar2, -1, pfVar);
                    if (this.b.E) {
                        c(gfVar, gfVar3, 1, this.l);
                    }
                }
            } else {
                pc pcVar8 = pcVarArr2[4];
                if (pcVar8.f != null) {
                    gf h10 = ra0.h(pcVar8);
                    if (h10 != null) {
                        ra0.b(gfVar, h10, 0);
                        c(gfVar3, gfVar, -1, this.l);
                        c(gfVar2, gfVar3, 1, pfVar);
                    }
                } else if (!(edVar17 instanceof pn) && (edVar3 = edVar17.T) != null) {
                    ra0.b(gfVar3, edVar3.e.h, edVar17.s());
                    c(gfVar2, gfVar3, 1, pfVar);
                    if (this.b.E) {
                        c(gfVar, gfVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        ed edVar20 = this.b;
                        if (edVar20.W > 0.0f) {
                            tn tnVar2 = edVar20.d;
                            if (tnVar2.d == 3) {
                                tnVar2.e.k.add(pfVar);
                                arrayList2.add(this.b.d.e);
                                pfVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            pfVar.c = true;
        }
    }

    @Override // defpackage.ra0
    public final void e() {
        gf gfVar = this.h;
        if (gfVar.j) {
            this.b.Z = gfVar.g;
        }
    }

    @Override // defpackage.ra0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ra0
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        gf gfVar = this.h;
        gfVar.c();
        gfVar.j = false;
        gf gfVar2 = this.i;
        gfVar2.c();
        gfVar2.j = false;
        gf gfVar3 = this.k;
        gfVar3.c();
        gfVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
