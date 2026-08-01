package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p9 extends ra0 {
    public final ArrayList k;
    public int l;

    public p9(ed edVar, int i) {
        super(edVar);
        ed edVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ed edVar3 = this.b;
        ed m = edVar3.m(i);
        while (true) {
            edVar2 = edVar3;
            edVar3 = m;
            if (edVar3 == null) {
                break;
            } else {
                m = edVar3.m(this.f);
            }
        }
        this.b = edVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? edVar2.d : i2 == 1 ? edVar2.e : null);
        ed l = edVar2.l(this.f);
        while (l != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? l.d : i3 == 1 ? l.e : null);
            l = l.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ra0 ra0Var = (ra0) obj;
            int i5 = this.f;
            if (i5 == 0) {
                ra0Var.b.b = this;
            } else if (i5 == 1) {
                ra0Var.b.c = this;
            }
        }
        if (this.f == 0 && ((fd) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((ra0) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        ed edVar4 = this.b;
        this.l = i6 == 0 ? edVar4.i0 : edVar4.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ef efVar) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        gf gfVar = this.h;
        if (gfVar.j) {
            gf gfVar2 = this.i;
            if (gfVar2.j) {
                ed edVar = this.b.T;
                boolean z3 = edVar instanceof fd ? ((fd) edVar).v0 : false;
                int i14 = gfVar2.g - gfVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((ra0) arrayList.get(i15)).b.g0 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((ra0) arrayList.get(i17)).b.g0 != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        ra0 ra0Var = (ra0) arrayList.get(i19);
                        ed edVar2 = ra0Var.b;
                        boolean z4 = z3;
                        if (edVar2.g0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += ra0Var.h.f;
                            }
                            pf pfVar = ra0Var.e;
                            int i22 = pfVar.g;
                            i12 = i18;
                            boolean z5 = ra0Var.d != 3;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !edVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !edVar2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (ra0Var.a == 1 && i12 == 0) {
                                    i13 = pfVar.m;
                                    i20++;
                                } else if (pfVar.j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = edVar2.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -ra0Var.i.f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -ra0Var.i.f;
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = gfVar.g;
                if (z) {
                    i25 = gfVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        ra0 ra0Var2 = (ra0) arrayList.get(i27);
                        int i29 = i25;
                        ed edVar3 = ra0Var2.b;
                        int i30 = i3;
                        pf pfVar2 = ra0Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (edVar3.g0 == 8 || ra0Var2.d != 3 || pfVar2.j) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((edVar3.k0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = edVar3.v;
                                i10 = edVar3.u;
                            } else {
                                i9 = edVar3.y;
                                i10 = edVar3.x;
                            }
                            i11 = i27;
                            int max = Math.max(i10, ra0Var2.a == 1 ? Math.min(i32, pfVar2.m) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            pfVar2.d(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            ra0 ra0Var3 = (ra0) arrayList.get(i34);
                            if (ra0Var3.b.g0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += ra0Var3.h.f;
                                }
                                i5 += ra0Var3.e.g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -ra0Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        ra0 ra0Var4 = (ra0) arrayList.get(z ? size - (i38 + 1) : i38);
                        ed edVar4 = ra0Var4.b;
                        gf gfVar3 = ra0Var4.i;
                        gf gfVar4 = ra0Var4.h;
                        if (edVar4.g0 == 8) {
                            gfVar4.d(i37);
                            gfVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - gfVar4.f : i37 + gfVar4.f;
                            }
                            if (z) {
                                gfVar3.d(i37);
                            } else {
                                gfVar4.d(i37);
                            }
                            pf pfVar3 = ra0Var4.e;
                            int i39 = pfVar3.g;
                            if (ra0Var4.d == 3 && ra0Var4.a == 1) {
                                i39 = pfVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                gfVar4.d(i37);
                            } else {
                                gfVar3.d(i37);
                            }
                            ra0Var4.g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-gfVar3.f) : i37 + (-gfVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        ra0 ra0Var5 = (ra0) arrayList.get(z ? size - (i42 + 1) : i42);
                        ed edVar5 = ra0Var5.b;
                        gf gfVar5 = ra0Var5.i;
                        gf gfVar6 = ra0Var5.h;
                        if (edVar5.g0 == 8) {
                            gfVar6.d(i41);
                            gfVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - gfVar6.f : i43 + gfVar6.f;
                            }
                            if (z) {
                                gfVar5.d(i43);
                            } else {
                                gfVar6.d(i43);
                            }
                            pf pfVar4 = ra0Var5.e;
                            int i44 = pfVar4.g;
                            if (ra0Var5.d == 3 && ra0Var5.a == 1) {
                                i44 = Math.min(i44, pfVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                gfVar6.d(i41);
                            } else {
                                gfVar5.d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-gfVar5.f) : i41 + (-gfVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    ed edVar6 = this.b;
                    float f8 = i45 == 0 ? edVar6.d0 : edVar6.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        ra0 ra0Var6 = (ra0) arrayList.get(z ? size - (i48 + 1) : i48);
                        ed edVar7 = ra0Var6.b;
                        gf gfVar7 = ra0Var6.i;
                        gf gfVar8 = ra0Var6.h;
                        if (edVar7.g0 == 8) {
                            gfVar8.d(i47);
                            gfVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - gfVar8.f : i47 + gfVar8.f;
                            }
                            if (z) {
                                gfVar7.d(i47);
                            } else {
                                gfVar8.d(i47);
                            }
                            pf pfVar5 = ra0Var6.e;
                            int i49 = pfVar5.g;
                            if (ra0Var6.d == 3 && ra0Var6.a == 1) {
                                i49 = pfVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                gfVar8.d(i47);
                            } else {
                                gfVar7.d(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-gfVar7.f) : i47 + (-gfVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ra0
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ra0) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ed edVar = ((ra0) arrayList.get(0)).b;
        ed edVar2 = ((ra0) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        gf gfVar = this.i;
        gf gfVar2 = this.h;
        if (i2 == 0) {
            pc pcVar = edVar.I;
            pc pcVar2 = edVar2.K;
            gf i3 = ra0.i(pcVar, 0);
            int e = pcVar.e();
            ed m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                ra0.b(gfVar2, i3, e);
            }
            gf i4 = ra0.i(pcVar2, 0);
            int e2 = pcVar2.e();
            ed n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                ra0.b(gfVar, i4, -e2);
            }
        } else {
            pc pcVar3 = edVar.J;
            pc pcVar4 = edVar2.L;
            gf i5 = ra0.i(pcVar3, 1);
            int e3 = pcVar3.e();
            ed m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                ra0.b(gfVar2, i5, e3);
            }
            gf i6 = ra0.i(pcVar4, 1);
            int e4 = pcVar4.e();
            ed n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                ra0.b(gfVar, i6, -e4);
            }
        }
        gfVar2.a = this;
        gfVar.a = this;
    }

    @Override // defpackage.ra0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((ra0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.ra0
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ra0) obj).f();
        }
    }

    @Override // defpackage.ra0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((ra0) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.ra0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ra0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ed m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ed edVar = ((ra0) arrayList.get(i)).b;
            if (edVar.g0 != 8) {
                return edVar;
            }
            i++;
        }
    }

    public final ed n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ed edVar = ((ra0) arrayList.get(size)).b;
            if (edVar.g0 != 8) {
                return edVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((ra0) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
