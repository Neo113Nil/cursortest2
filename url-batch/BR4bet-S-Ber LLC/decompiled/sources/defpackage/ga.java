package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ga extends rd0 {
    public final ArrayList k;
    public int l;

    public ga(ae aeVar, int i) {
        super(aeVar);
        ae aeVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ae aeVar3 = this.b;
        ae m = aeVar3.m(i);
        while (true) {
            aeVar2 = aeVar3;
            aeVar3 = m;
            if (aeVar3 == null) {
                break;
            } else {
                m = aeVar3.m(this.f);
            }
        }
        this.b = aeVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? aeVar2.d : i2 == 1 ? aeVar2.e : null);
        ae l = aeVar2.l(this.f);
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
            rd0 rd0Var = (rd0) obj;
            int i5 = this.f;
            if (i5 == 0) {
                rd0Var.b.b = this;
            } else if (i5 == 1) {
                rd0Var.b.c = this;
            }
        }
        if (this.f == 0 && ((be) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((rd0) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        ae aeVar4 = this.b;
        this.l = i6 == 0 ? aeVar4.i0 : aeVar4.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.dh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dh dhVar) {
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
        fh fhVar = this.h;
        if (fhVar.j) {
            fh fhVar2 = this.i;
            if (fhVar2.j) {
                ae aeVar = this.b.T;
                boolean z3 = aeVar instanceof be ? ((be) aeVar).v0 : false;
                int i14 = fhVar2.g - fhVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((rd0) arrayList.get(i15)).b.g0 != 8) {
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
                    if (((rd0) arrayList.get(i17)).b.g0 != 8) {
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
                        rd0 rd0Var = (rd0) arrayList.get(i19);
                        ae aeVar2 = rd0Var.b;
                        boolean z4 = z3;
                        if (aeVar2.g0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += rd0Var.h.f;
                            }
                            wh whVar = rd0Var.e;
                            int i22 = whVar.g;
                            i12 = i18;
                            boolean z5 = rd0Var.d != 3;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !aeVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !aeVar2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (rd0Var.a == 1 && i12 == 0) {
                                    i13 = whVar.m;
                                    i20++;
                                } else if (whVar.j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = aeVar2.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -rd0Var.i.f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -rd0Var.i.f;
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
                int i25 = fhVar.g;
                if (z) {
                    i25 = fhVar2.g;
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
                        rd0 rd0Var2 = (rd0) arrayList.get(i27);
                        int i29 = i25;
                        ae aeVar3 = rd0Var2.b;
                        int i30 = i3;
                        wh whVar2 = rd0Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (aeVar3.g0 == 8 || rd0Var2.d != 3 || whVar2.j) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((aeVar3.k0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = aeVar3.v;
                                i10 = aeVar3.u;
                            } else {
                                i9 = aeVar3.y;
                                i10 = aeVar3.x;
                            }
                            i11 = i27;
                            int max = Math.max(i10, rd0Var2.a == 1 ? Math.min(i32, whVar2.m) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            whVar2.d(i32);
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
                            rd0 rd0Var3 = (rd0) arrayList.get(i34);
                            if (rd0Var3.b.g0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += rd0Var3.h.f;
                                }
                                i5 += rd0Var3.e.g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -rd0Var3.i.f;
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
                        rd0 rd0Var4 = (rd0) arrayList.get(z ? size - (i38 + 1) : i38);
                        ae aeVar4 = rd0Var4.b;
                        fh fhVar3 = rd0Var4.i;
                        fh fhVar4 = rd0Var4.h;
                        if (aeVar4.g0 == 8) {
                            fhVar4.d(i37);
                            fhVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - fhVar4.f : i37 + fhVar4.f;
                            }
                            if (z) {
                                fhVar3.d(i37);
                            } else {
                                fhVar4.d(i37);
                            }
                            wh whVar3 = rd0Var4.e;
                            int i39 = whVar3.g;
                            if (rd0Var4.d == 3 && rd0Var4.a == 1) {
                                i39 = whVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                fhVar4.d(i37);
                            } else {
                                fhVar3.d(i37);
                            }
                            rd0Var4.g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-fhVar3.f) : i37 + (-fhVar3.f);
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
                        rd0 rd0Var5 = (rd0) arrayList.get(z ? size - (i42 + 1) : i42);
                        ae aeVar5 = rd0Var5.b;
                        fh fhVar5 = rd0Var5.i;
                        fh fhVar6 = rd0Var5.h;
                        if (aeVar5.g0 == 8) {
                            fhVar6.d(i41);
                            fhVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - fhVar6.f : i43 + fhVar6.f;
                            }
                            if (z) {
                                fhVar5.d(i43);
                            } else {
                                fhVar6.d(i43);
                            }
                            wh whVar4 = rd0Var5.e;
                            int i44 = whVar4.g;
                            if (rd0Var5.d == 3 && rd0Var5.a == 1) {
                                i44 = Math.min(i44, whVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                fhVar6.d(i41);
                            } else {
                                fhVar5.d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-fhVar5.f) : i41 + (-fhVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    ae aeVar6 = this.b;
                    float f8 = i45 == 0 ? aeVar6.d0 : aeVar6.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        rd0 rd0Var6 = (rd0) arrayList.get(z ? size - (i48 + 1) : i48);
                        ae aeVar7 = rd0Var6.b;
                        fh fhVar7 = rd0Var6.i;
                        fh fhVar8 = rd0Var6.h;
                        if (aeVar7.g0 == 8) {
                            fhVar8.d(i47);
                            fhVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - fhVar8.f : i47 + fhVar8.f;
                            }
                            if (z) {
                                fhVar7.d(i47);
                            } else {
                                fhVar8.d(i47);
                            }
                            wh whVar5 = rd0Var6.e;
                            int i49 = whVar5.g;
                            if (rd0Var6.d == 3 && rd0Var6.a == 1) {
                                i49 = whVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                fhVar8.d(i47);
                            } else {
                                fhVar7.d(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-fhVar7.f) : i47 + (-fhVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.rd0
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rd0) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ae aeVar = ((rd0) arrayList.get(0)).b;
        ae aeVar2 = ((rd0) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        fh fhVar = this.i;
        fh fhVar2 = this.h;
        if (i2 == 0) {
            ld ldVar = aeVar.I;
            ld ldVar2 = aeVar2.K;
            fh i3 = rd0.i(ldVar, 0);
            int e = ldVar.e();
            ae m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                rd0.b(fhVar2, i3, e);
            }
            fh i4 = rd0.i(ldVar2, 0);
            int e2 = ldVar2.e();
            ae n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                rd0.b(fhVar, i4, -e2);
            }
        } else {
            ld ldVar3 = aeVar.J;
            ld ldVar4 = aeVar2.L;
            fh i5 = rd0.i(ldVar3, 1);
            int e3 = ldVar3.e();
            ae m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                rd0.b(fhVar2, i5, e3);
            }
            fh i6 = rd0.i(ldVar4, 1);
            int e4 = ldVar4.e();
            ae n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                rd0.b(fhVar, i6, -e4);
            }
        }
        fhVar2.a = this;
        fhVar.a = this;
    }

    @Override // defpackage.rd0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((rd0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.rd0
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rd0) obj).f();
        }
    }

    @Override // defpackage.rd0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((rd0) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.rd0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((rd0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ae m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ae aeVar = ((rd0) arrayList.get(i)).b;
            if (aeVar.g0 != 8) {
                return aeVar;
            }
            i++;
        }
    }

    public final ae n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ae aeVar = ((rd0) arrayList.get(size)).b;
            if (aeVar.g0 != 8) {
                return aeVar;
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
            sb.append((rd0) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
