package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class t9 extends ka0 {
    public final ArrayList k;
    public int l;

    public t9(ad adVar, int i) {
        super(adVar);
        ad adVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        ad adVar3 = this.b;
        ad m = adVar3.m(i);
        while (true) {
            adVar2 = adVar3;
            adVar3 = m;
            if (adVar3 == null) {
                break;
            } else {
                m = adVar3.m(this.f);
            }
        }
        this.b = adVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? adVar2.d : i2 == 1 ? adVar2.e : null);
        ad l = adVar2.l(this.f);
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
            ka0 ka0Var = (ka0) obj;
            int i5 = this.f;
            if (i5 == 0) {
                ka0Var.b.b = this;
            } else if (i5 == 1) {
                ka0Var.b.c = this;
            }
        }
        if (this.f == 0 && ((bd) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((ka0) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        ad adVar4 = this.b;
        this.l = i6 == 0 ? adVar4.i0 : adVar4.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.ff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ff ffVar) {
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
        hf hfVar = this.h;
        if (hfVar.j) {
            hf hfVar2 = this.i;
            if (hfVar2.j) {
                ad adVar = this.b.T;
                boolean z3 = adVar instanceof bd ? ((bd) adVar).v0 : false;
                int i14 = hfVar2.g - hfVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((ka0) arrayList.get(i15)).b.g0 != 8) {
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
                    if (((ka0) arrayList.get(i17)).b.g0 != 8) {
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
                        ka0 ka0Var = (ka0) arrayList.get(i19);
                        ad adVar2 = ka0Var.b;
                        boolean z4 = z3;
                        if (adVar2.g0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += ka0Var.h.f;
                            }
                            xf xfVar = ka0Var.e;
                            int i22 = xfVar.g;
                            i12 = i18;
                            boolean z5 = ka0Var.d != 3;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !adVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !adVar2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (ka0Var.a == 1 && i12 == 0) {
                                    i13 = xfVar.m;
                                    i20++;
                                } else if (xfVar.j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = adVar2.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -ka0Var.i.f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -ka0Var.i.f;
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
                int i25 = hfVar.g;
                if (z) {
                    i25 = hfVar2.g;
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
                        ka0 ka0Var2 = (ka0) arrayList.get(i27);
                        int i29 = i25;
                        ad adVar3 = ka0Var2.b;
                        int i30 = i3;
                        xf xfVar2 = ka0Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (adVar3.g0 == 8 || ka0Var2.d != 3 || xfVar2.j) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((adVar3.k0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = adVar3.v;
                                i10 = adVar3.u;
                            } else {
                                i9 = adVar3.y;
                                i10 = adVar3.x;
                            }
                            i11 = i27;
                            int max = Math.max(i10, ka0Var2.a == 1 ? Math.min(i32, xfVar2.m) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            xfVar2.d(i32);
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
                            ka0 ka0Var3 = (ka0) arrayList.get(i34);
                            if (ka0Var3.b.g0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += ka0Var3.h.f;
                                }
                                i5 += ka0Var3.e.g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -ka0Var3.i.f;
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
                        ka0 ka0Var4 = (ka0) arrayList.get(z ? size - (i38 + 1) : i38);
                        ad adVar4 = ka0Var4.b;
                        hf hfVar3 = ka0Var4.i;
                        hf hfVar4 = ka0Var4.h;
                        if (adVar4.g0 == 8) {
                            hfVar4.d(i37);
                            hfVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - hfVar4.f : i37 + hfVar4.f;
                            }
                            if (z) {
                                hfVar3.d(i37);
                            } else {
                                hfVar4.d(i37);
                            }
                            xf xfVar3 = ka0Var4.e;
                            int i39 = xfVar3.g;
                            if (ka0Var4.d == 3 && ka0Var4.a == 1) {
                                i39 = xfVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                hfVar4.d(i37);
                            } else {
                                hfVar3.d(i37);
                            }
                            ka0Var4.g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-hfVar3.f) : i37 + (-hfVar3.f);
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
                        ka0 ka0Var5 = (ka0) arrayList.get(z ? size - (i42 + 1) : i42);
                        ad adVar5 = ka0Var5.b;
                        hf hfVar5 = ka0Var5.i;
                        hf hfVar6 = ka0Var5.h;
                        if (adVar5.g0 == 8) {
                            hfVar6.d(i41);
                            hfVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - hfVar6.f : i43 + hfVar6.f;
                            }
                            if (z) {
                                hfVar5.d(i43);
                            } else {
                                hfVar6.d(i43);
                            }
                            xf xfVar4 = ka0Var5.e;
                            int i44 = xfVar4.g;
                            if (ka0Var5.d == 3 && ka0Var5.a == 1) {
                                i44 = Math.min(i44, xfVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                hfVar6.d(i41);
                            } else {
                                hfVar5.d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-hfVar5.f) : i41 + (-hfVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    ad adVar6 = this.b;
                    float f8 = i45 == 0 ? adVar6.d0 : adVar6.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        ka0 ka0Var6 = (ka0) arrayList.get(z ? size - (i48 + 1) : i48);
                        ad adVar7 = ka0Var6.b;
                        hf hfVar7 = ka0Var6.i;
                        hf hfVar8 = ka0Var6.h;
                        if (adVar7.g0 == 8) {
                            hfVar8.d(i47);
                            hfVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - hfVar8.f : i47 + hfVar8.f;
                            }
                            if (z) {
                                hfVar7.d(i47);
                            } else {
                                hfVar8.d(i47);
                            }
                            xf xfVar5 = ka0Var6.e;
                            int i49 = xfVar5.g;
                            if (ka0Var6.d == 3 && ka0Var6.a == 1) {
                                i49 = xfVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                hfVar8.d(i47);
                            } else {
                                hfVar7.d(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-hfVar7.f) : i47 + (-hfVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ka0
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ka0) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        ad adVar = ((ka0) arrayList.get(0)).b;
        ad adVar2 = ((ka0) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        hf hfVar = this.i;
        hf hfVar2 = this.h;
        if (i2 == 0) {
            lc lcVar = adVar.I;
            lc lcVar2 = adVar2.K;
            hf i3 = ka0.i(lcVar, 0);
            int e = lcVar.e();
            ad m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                ka0.b(hfVar2, i3, e);
            }
            hf i4 = ka0.i(lcVar2, 0);
            int e2 = lcVar2.e();
            ad n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                ka0.b(hfVar, i4, -e2);
            }
        } else {
            lc lcVar3 = adVar.J;
            lc lcVar4 = adVar2.L;
            hf i5 = ka0.i(lcVar3, 1);
            int e3 = lcVar3.e();
            ad m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                ka0.b(hfVar2, i5, e3);
            }
            hf i6 = ka0.i(lcVar4, 1);
            int e4 = lcVar4.e();
            ad n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                ka0.b(hfVar, i6, -e4);
            }
        }
        hfVar2.a = this;
        hfVar.a = this;
    }

    @Override // defpackage.ka0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((ka0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.ka0
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ka0) obj).f();
        }
    }

    @Override // defpackage.ka0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((ka0) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.ka0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ka0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final ad m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            ad adVar = ((ka0) arrayList.get(i)).b;
            if (adVar.g0 != 8) {
                return adVar;
            }
            i++;
        }
    }

    public final ad n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ad adVar = ((ka0) arrayList.get(size)).b;
            if (adVar.g0 != 8) {
                return adVar;
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
            sb.append((ka0) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
