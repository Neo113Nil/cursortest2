package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tb0 extends rd0 {
    public fh k;
    public g8 l;

    @Override // defpackage.dh
    public final void a(dh dhVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (f60.j(this.j) == 3) {
            ae aeVar = this.b;
            l(aeVar.J, aeVar.L, 1);
            return;
        }
        wh whVar = this.e;
        if (whVar.c && !whVar.j && this.d == 3) {
            ae aeVar2 = this.b;
            int i2 = aeVar2.s;
            if (i2 == 2) {
                ae aeVar3 = aeVar2.T;
                if (aeVar3 != null) {
                    if (aeVar3.e.e.j) {
                        whVar.d((int) ((r5.g * aeVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                wh whVar2 = aeVar2.d.e;
                if (whVar2.j) {
                    int i3 = aeVar2.X;
                    if (i3 == -1) {
                        f = whVar2.g;
                        f2 = aeVar2.W;
                    } else if (i3 == 0) {
                        f3 = whVar2.g * aeVar2.W;
                        i = (int) (f3 + 0.5f);
                        whVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        whVar.d(i);
                    } else {
                        f = whVar2.g;
                        f2 = aeVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    whVar.d(i);
                }
            }
        }
        fh fhVar = this.h;
        boolean z = fhVar.c;
        ArrayList arrayList = fhVar.l;
        if (z) {
            fh fhVar2 = this.i;
            boolean z2 = fhVar2.c;
            ArrayList arrayList2 = fhVar2.l;
            if (z2) {
                if (fhVar.j && fhVar2.j && whVar.j) {
                    return;
                }
                if (!whVar.j && this.d == 3) {
                    ae aeVar4 = this.b;
                    if (aeVar4.r == 0 && !aeVar4.y()) {
                        fh fhVar3 = (fh) arrayList.get(0);
                        fh fhVar4 = (fh) arrayList2.get(0);
                        int i4 = fhVar3.g + fhVar.f;
                        int i5 = fhVar4.g + fhVar2.f;
                        fhVar.d(i4);
                        fhVar2.d(i5);
                        whVar.d(i5 - i4);
                        return;
                    }
                }
                if (!whVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    fh fhVar5 = (fh) arrayList.get(0);
                    int i6 = (((fh) arrayList2.get(0)).g + fhVar2.f) - (fhVar5.g + fhVar.f);
                    int i7 = whVar.m;
                    if (i6 < i7) {
                        whVar.d(i6);
                    } else {
                        whVar.d(i7);
                    }
                }
                if (whVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    fh fhVar6 = (fh) arrayList.get(0);
                    fh fhVar7 = (fh) arrayList2.get(0);
                    int i8 = fhVar6.g;
                    int i9 = fhVar.f + i8;
                    int i10 = fhVar7.g;
                    int i11 = fhVar2.f + i10;
                    float f4 = this.b.e0;
                    if (fhVar6 == fhVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fhVar.d((int) ((((i10 - i8) - whVar.g) * f4) + i8 + 0.5f));
                    fhVar2.d(fhVar.g + whVar.g);
                }
            }
        }
    }

    @Override // defpackage.rd0
    public final void d() {
        ae aeVar;
        ae aeVar2;
        ae aeVar3;
        ae aeVar4;
        fh fhVar = this.k;
        ae aeVar5 = this.b;
        boolean z = aeVar5.a;
        wh whVar = this.e;
        if (z) {
            whVar.d(aeVar5.k());
        }
        boolean z2 = whVar.j;
        ArrayList arrayList = whVar.k;
        ArrayList arrayList2 = whVar.l;
        fh fhVar2 = this.i;
        fh fhVar3 = this.h;
        if (!z2) {
            ae aeVar6 = this.b;
            this.d = aeVar6.p0[1];
            if (aeVar6.E) {
                this.l = new g8(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (aeVar4 = this.b.T) != null && aeVar4.p0[1] == 1) {
                    int k = (aeVar4.k() - this.b.J.e()) - this.b.L.e();
                    rd0.b(fhVar3, aeVar4.e.h, this.b.J.e());
                    rd0.b(fhVar2, aeVar4.e.i, -this.b.L.e());
                    whVar.d(k);
                    return;
                }
                if (i == 1) {
                    whVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (aeVar2 = (aeVar = this.b).T) != null && aeVar2.p0[1] == 1) {
            rd0.b(fhVar3, aeVar2.e.h, aeVar.J.e());
            rd0.b(fhVar2, aeVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = whVar.j;
        if (z3) {
            ae aeVar7 = this.b;
            if (aeVar7.a) {
                ld[] ldVarArr = aeVar7.Q;
                ld ldVar = ldVarArr[2];
                ld ldVar2 = ldVar.f;
                if (ldVar2 != null && ldVarArr[3].f != null) {
                    boolean y = aeVar7.y();
                    ae aeVar8 = this.b;
                    if (y) {
                        fhVar3.f = aeVar8.Q[2].e();
                        fhVar2.f = -this.b.Q[3].e();
                    } else {
                        fh h = rd0.h(aeVar8.Q[2]);
                        if (h != null) {
                            rd0.b(fhVar3, h, this.b.Q[2].e());
                        }
                        fh h2 = rd0.h(this.b.Q[3]);
                        if (h2 != null) {
                            rd0.b(fhVar2, h2, -this.b.Q[3].e());
                        }
                        fhVar3.b = true;
                        fhVar2.b = true;
                    }
                    ae aeVar9 = this.b;
                    if (aeVar9.E) {
                        rd0.b(fhVar, fhVar3, aeVar9.a0);
                        return;
                    }
                    return;
                }
                if (ldVar2 != null) {
                    fh h3 = rd0.h(ldVar);
                    if (h3 != null) {
                        rd0.b(fhVar3, h3, this.b.Q[2].e());
                        rd0.b(fhVar2, fhVar3, whVar.g);
                        ae aeVar10 = this.b;
                        if (aeVar10.E) {
                            rd0.b(fhVar, fhVar3, aeVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ld ldVar3 = ldVarArr[3];
                if (ldVar3.f != null) {
                    fh h4 = rd0.h(ldVar3);
                    if (h4 != null) {
                        rd0.b(fhVar2, h4, -this.b.Q[3].e());
                        rd0.b(fhVar3, fhVar2, -whVar.g);
                    }
                    ae aeVar11 = this.b;
                    if (aeVar11.E) {
                        rd0.b(fhVar, fhVar3, aeVar11.a0);
                        return;
                    }
                    return;
                }
                ld ldVar4 = ldVarArr[4];
                if (ldVar4.f != null) {
                    fh h5 = rd0.h(ldVar4);
                    if (h5 != null) {
                        rd0.b(fhVar, h5, 0);
                        rd0.b(fhVar3, fhVar, -this.b.a0);
                        rd0.b(fhVar2, fhVar3, whVar.g);
                        return;
                    }
                    return;
                }
                if ((aeVar7 instanceof mp) || aeVar7.T == null || aeVar7.i(7).f != null) {
                    return;
                }
                ae aeVar12 = this.b;
                rd0.b(fhVar3, aeVar12.T.e.h, aeVar12.s());
                rd0.b(fhVar2, fhVar3, whVar.g);
                ae aeVar13 = this.b;
                if (aeVar13.E) {
                    rd0.b(fhVar, fhVar3, aeVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            whVar.b(this);
        } else {
            ae aeVar14 = this.b;
            int i2 = aeVar14.s;
            if (i2 == 2) {
                ae aeVar15 = aeVar14.T;
                if (aeVar15 != null) {
                    wh whVar2 = aeVar15.e.e;
                    arrayList2.add(whVar2);
                    whVar2.k.add(whVar);
                    whVar.b = true;
                    arrayList.add(fhVar3);
                    arrayList.add(fhVar2);
                }
            } else if (i2 == 3 && !aeVar14.y()) {
                ae aeVar16 = this.b;
                if (aeVar16.r != 3) {
                    wh whVar3 = aeVar16.d.e;
                    arrayList2.add(whVar3);
                    whVar3.k.add(whVar);
                    whVar.b = true;
                    arrayList.add(fhVar3);
                    arrayList.add(fhVar2);
                }
            }
        }
        ae aeVar17 = this.b;
        ld[] ldVarArr2 = aeVar17.Q;
        ld ldVar5 = ldVarArr2[2];
        ld ldVar6 = ldVar5.f;
        if (ldVar6 != null && ldVarArr2[3].f != null) {
            boolean y2 = aeVar17.y();
            ae aeVar18 = this.b;
            if (y2) {
                fhVar3.f = aeVar18.Q[2].e();
                fhVar2.f = -this.b.Q[3].e();
            } else {
                fh h6 = rd0.h(aeVar18.Q[2]);
                fh h7 = rd0.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(fhVar, fhVar3, 1, this.l);
            }
        } else if (ldVar6 != null) {
            fh h8 = rd0.h(ldVar5);
            if (h8 != null) {
                rd0.b(fhVar3, h8, this.b.Q[2].e());
                c(fhVar2, fhVar3, 1, whVar);
                if (this.b.E) {
                    c(fhVar, fhVar3, 1, this.l);
                }
                if (this.d == 3) {
                    ae aeVar19 = this.b;
                    if (aeVar19.W > 0.0f) {
                        qp qpVar = aeVar19.d;
                        if (qpVar.d == 3) {
                            qpVar.e.k.add(whVar);
                            arrayList2.add(this.b.d.e);
                            whVar.a = this;
                        }
                    }
                }
            }
        } else {
            ld ldVar7 = ldVarArr2[3];
            if (ldVar7.f != null) {
                fh h9 = rd0.h(ldVar7);
                if (h9 != null) {
                    rd0.b(fhVar2, h9, -this.b.Q[3].e());
                    c(fhVar3, fhVar2, -1, whVar);
                    if (this.b.E) {
                        c(fhVar, fhVar3, 1, this.l);
                    }
                }
            } else {
                ld ldVar8 = ldVarArr2[4];
                if (ldVar8.f != null) {
                    fh h10 = rd0.h(ldVar8);
                    if (h10 != null) {
                        rd0.b(fhVar, h10, 0);
                        c(fhVar3, fhVar, -1, this.l);
                        c(fhVar2, fhVar3, 1, whVar);
                    }
                } else if (!(aeVar17 instanceof mp) && (aeVar3 = aeVar17.T) != null) {
                    rd0.b(fhVar3, aeVar3.e.h, aeVar17.s());
                    c(fhVar2, fhVar3, 1, whVar);
                    if (this.b.E) {
                        c(fhVar, fhVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        ae aeVar20 = this.b;
                        if (aeVar20.W > 0.0f) {
                            qp qpVar2 = aeVar20.d;
                            if (qpVar2.d == 3) {
                                qpVar2.e.k.add(whVar);
                                arrayList2.add(this.b.d.e);
                                whVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            whVar.c = true;
        }
    }

    @Override // defpackage.rd0
    public final void e() {
        fh fhVar = this.h;
        if (fhVar.j) {
            this.b.Z = fhVar.g;
        }
    }

    @Override // defpackage.rd0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.rd0
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        fh fhVar = this.h;
        fhVar.c();
        fhVar.j = false;
        fh fhVar2 = this.i;
        fhVar2.c();
        fhVar2.j = false;
        fh fhVar3 = this.k;
        fhVar3.c();
        fhVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
