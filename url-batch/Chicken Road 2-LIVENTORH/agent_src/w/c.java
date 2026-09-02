package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3518k;

    /* renamed from: l, reason: collision with root package name */
    public int f3519l;

    public c(v.d dVar, int i) {
        super(dVar);
        v.d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f3518k = arrayList;
        this.f3553f = i;
        v.d dVar3 = this.f3550b;
        v.d m4 = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m4;
            if (dVar3 == null) {
                break;
            } else {
                m4 = dVar3.m(this.f3553f);
            }
        }
        this.f3550b = dVar2;
        int i4 = this.f3553f;
        arrayList.add(i4 == 0 ? dVar2.d : i4 == 1 ? dVar2.f3397e : null);
        v.d l4 = dVar2.l(this.f3553f);
        while (l4 != null) {
            int i5 = this.f3553f;
            arrayList.add(i5 == 0 ? l4.d : i5 == 1 ? l4.f3397e : null);
            l4 = l4.l(this.f3553f);
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            o oVar = (o) obj;
            int i7 = this.f3553f;
            if (i7 == 0) {
                oVar.f3550b.f3393b = this;
            } else if (i7 == 1) {
                oVar.f3550b.f3395c = this;
            }
        }
        if (this.f3553f == 0 && ((v.e) this.f3550b.T).f3434v0 && arrayList.size() > 1) {
            this.f3550b = ((o) arrayList.get(arrayList.size() - 1)).f3550b;
        }
        this.f3519l = this.f3553f == 0 ? this.f3550b.i0 : this.f3550b.f3406j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i;
        int i4;
        boolean z3;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        int i15;
        f fVar = this.f3555h;
        if (fVar.f3534j) {
            f fVar2 = this.i;
            if (fVar2.f3534j) {
                v.d dVar2 = this.f3550b.T;
                boolean z5 = dVar2 instanceof v.e ? ((v.e) dVar2).f3434v0 : false;
                int i16 = fVar2.f3532g - fVar.f3532g;
                ArrayList arrayList = this.f3518k;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    i4 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((o) arrayList.get(i17)).f3550b.f3402g0 != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (((o) arrayList.get(i19)).f3550b.f3402g0 != 8) {
                        i = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (i20 < 2) {
                    f2 = 0.0f;
                    int i21 = 0;
                    i7 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    while (i21 < size) {
                        o oVar = (o) arrayList.get(i21);
                        v.d dVar3 = oVar.f3550b;
                        boolean z6 = z5;
                        if (dVar3.f3402g0 == i4) {
                            i14 = i20;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i7 += oVar.f3555h.f3531f;
                            }
                            g gVar = oVar.f3552e;
                            int i24 = gVar.f3532g;
                            i14 = i20;
                            boolean z7 = oVar.d != 3;
                            if (z7) {
                                int i25 = this.f3553f;
                                if (i25 == 0 && !dVar3.d.f3552e.f3534j) {
                                    return;
                                }
                                if (i25 == 1 && !dVar3.f3397e.f3552e.f3534j) {
                                    return;
                                } else {
                                    z4 = z7;
                                }
                            } else {
                                z4 = z7;
                                if (oVar.f3549a == 1 && i14 == 0) {
                                    i15 = gVar.f3537m;
                                    i22++;
                                } else if (gVar.f3534j) {
                                    i15 = i24;
                                }
                                z4 = true;
                                if (z4) {
                                    i22++;
                                    float f5 = dVar3.f3408k0[this.f3553f];
                                    if (f5 >= 0.0f) {
                                        f2 += f5;
                                    }
                                } else {
                                    i7 += i15;
                                }
                                if (i21 < i18 && i21 < i) {
                                    i7 += -oVar.i.f3531f;
                                }
                            }
                            i15 = i24;
                            if (z4) {
                            }
                            if (i21 < i18) {
                                i7 += -oVar.i.f3531f;
                            }
                        }
                        i21++;
                        z5 = z6;
                        i20 = i14;
                        i4 = 8;
                    }
                    z3 = z5;
                    int i26 = i20;
                    if (i7 < i16 || i22 == 0) {
                        i5 = i22;
                        i6 = i23;
                        break;
                    } else {
                        i20 = i26 + 1;
                        z5 = z3;
                        i4 = 8;
                    }
                }
                z3 = z5;
                f2 = 0.0f;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                int i27 = fVar.f3532g;
                if (z3) {
                    i27 = fVar2.f3532g;
                }
                float f6 = 0.5f;
                if (i7 > i16) {
                    i27 = z3 ? i27 + ((int) (((i7 - i16) / 2.0f) + 0.5f)) : i27 - ((int) (((i7 - i16) / 2.0f) + 0.5f));
                }
                if (i5 > 0) {
                    float f7 = i16 - i7;
                    int i28 = (int) ((f7 / i5) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        float f8 = f6;
                        o oVar2 = (o) arrayList.get(i29);
                        int i31 = i27;
                        v.d dVar4 = oVar2.f3550b;
                        int i32 = i5;
                        g gVar2 = oVar2.f3552e;
                        float f9 = f7;
                        int i33 = i28;
                        if (dVar4.f3402g0 == 8 || oVar2.d != 3 || gVar2.f3534j) {
                            i13 = i29;
                        } else {
                            int i34 = f2 > 0.0f ? (int) (((dVar4.f3408k0[this.f3553f] * f9) / f2) + f8) : i33;
                            if (this.f3553f == 0) {
                                i11 = dVar4.f3424v;
                                i12 = dVar4.f3423u;
                            } else {
                                i11 = dVar4.f3427y;
                                i12 = dVar4.f3426x;
                            }
                            i13 = i29;
                            int max = Math.max(i12, oVar2.f3549a == 1 ? Math.min(i34, gVar2.f3537m) : i34);
                            if (i11 > 0) {
                                max = Math.min(i11, max);
                            }
                            if (max != i34) {
                                i30++;
                                i34 = max;
                            }
                            gVar2.d(i34);
                        }
                        i29 = i13 + 1;
                        i27 = i31;
                        f6 = f8;
                        i5 = i32;
                        f7 = f9;
                        i28 = i33;
                    }
                    i8 = i27;
                    f4 = f6;
                    int i35 = i5;
                    if (i30 > 0) {
                        i5 = i35 - i30;
                        i7 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            o oVar3 = (o) arrayList.get(i36);
                            if (oVar3.f3550b.f3402g0 != 8) {
                                if (i36 > 0 && i36 >= i17) {
                                    i7 += oVar3.f3555h.f3531f;
                                }
                                i7 += oVar3.f3552e.f3532g;
                                if (i36 < i18 && i36 < i) {
                                    i7 += -oVar3.i.f3531f;
                                }
                            }
                        }
                    } else {
                        i5 = i35;
                    }
                    i10 = 2;
                    if (this.f3519l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3519l = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i8 = i27;
                    f4 = 0.5f;
                    i9 = 0;
                    i10 = 2;
                }
                if (i7 > i16) {
                    this.f3519l = i10;
                }
                if (i6 > 0 && i5 == 0 && i17 == i) {
                    this.f3519l = i10;
                }
                int i37 = this.f3519l;
                if (i37 == 1) {
                    int i38 = i6 > 1 ? (i16 - i7) / (i6 - 1) : i6 == 1 ? (i16 - i7) / 2 : i9;
                    if (i5 > 0) {
                        i38 = i9;
                    }
                    int i39 = i8;
                    for (int i40 = i9; i40 < size; i40++) {
                        o oVar4 = (o) arrayList.get(z3 ? size - (i40 + 1) : i40);
                        v.d dVar5 = oVar4.f3550b;
                        f fVar3 = oVar4.i;
                        f fVar4 = oVar4.f3555h;
                        if (dVar5.f3402g0 == 8) {
                            fVar4.d(i39);
                            fVar3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z3 ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i17) {
                                i39 = z3 ? i39 - fVar4.f3531f : i39 + fVar4.f3531f;
                            }
                            if (z3) {
                                fVar3.d(i39);
                            } else {
                                fVar4.d(i39);
                            }
                            g gVar3 = oVar4.f3552e;
                            int i41 = gVar3.f3532g;
                            if (oVar4.d == 3 && oVar4.f3549a == 1) {
                                i41 = gVar3.f3537m;
                            }
                            i39 = z3 ? i39 - i41 : i39 + i41;
                            if (z3) {
                                fVar4.d(i39);
                            } else {
                                fVar3.d(i39);
                            }
                            oVar4.f3554g = true;
                            if (i40 < i18 && i40 < i) {
                                i39 = z3 ? i39 - (-fVar3.f3531f) : i39 + (-fVar3.f3531f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i42 = (i16 - i7) / (i6 + 1);
                    if (i5 > 0) {
                        i42 = i9;
                    }
                    int i43 = i8;
                    for (int i44 = i9; i44 < size; i44++) {
                        o oVar5 = (o) arrayList.get(z3 ? size - (i44 + 1) : i44);
                        v.d dVar6 = oVar5.f3550b;
                        f fVar5 = oVar5.i;
                        f fVar6 = oVar5.f3555h;
                        if (dVar6.f3402g0 == 8) {
                            fVar6.d(i43);
                            fVar5.d(i43);
                        } else {
                            int i45 = z3 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i17) {
                                i45 = z3 ? i45 - fVar6.f3531f : i45 + fVar6.f3531f;
                            }
                            if (z3) {
                                fVar5.d(i45);
                            } else {
                                fVar6.d(i45);
                            }
                            g gVar4 = oVar5.f3552e;
                            int i46 = gVar4.f3532g;
                            if (oVar5.d == 3 && oVar5.f3549a == 1) {
                                i46 = Math.min(i46, gVar4.f3537m);
                            }
                            i43 = z3 ? i45 - i46 : i45 + i46;
                            if (z3) {
                                fVar6.d(i43);
                            } else {
                                fVar5.d(i43);
                            }
                            if (i44 < i18 && i44 < i) {
                                i43 = z3 ? i43 - (-fVar5.f3531f) : i43 + (-fVar5.f3531f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f10 = this.f3553f == 0 ? this.f3550b.d0 : this.f3550b.f3398e0;
                    if (z3) {
                        f10 = 1.0f - f10;
                    }
                    int i47 = (int) (((i16 - i7) * f10) + f4);
                    if (i47 < 0 || i5 > 0) {
                        i47 = i9;
                    }
                    int i48 = z3 ? i8 - i47 : i8 + i47;
                    for (int i49 = i9; i49 < size; i49++) {
                        o oVar6 = (o) arrayList.get(z3 ? size - (i49 + 1) : i49);
                        v.d dVar7 = oVar6.f3550b;
                        f fVar7 = oVar6.i;
                        f fVar8 = oVar6.f3555h;
                        if (dVar7.f3402g0 == 8) {
                            fVar8.d(i48);
                            fVar7.d(i48);
                        } else {
                            if (i49 > 0 && i49 >= i17) {
                                i48 = z3 ? i48 - fVar8.f3531f : i48 + fVar8.f3531f;
                            }
                            if (z3) {
                                fVar7.d(i48);
                            } else {
                                fVar8.d(i48);
                            }
                            g gVar5 = oVar6.f3552e;
                            int i50 = gVar5.f3532g;
                            if (oVar6.d == 3 && oVar6.f3549a == 1) {
                                i50 = gVar5.f3537m;
                            }
                            i48 += i50;
                            if (z3) {
                                fVar8.d(i48);
                            } else {
                                fVar7.d(i48);
                            }
                            if (i49 < i18 && i49 < i) {
                                i48 = z3 ? i48 - (-fVar7.f3531f) : i48 + (-fVar7.f3531f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // w.o
    public final void d() {
        ArrayList arrayList = this.f3518k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        v.d dVar = ((o) arrayList.get(0)).f3550b;
        v.d dVar2 = ((o) arrayList.get(size2 - 1)).f3550b;
        int i4 = this.f3553f;
        f fVar = this.i;
        f fVar2 = this.f3555h;
        if (i4 == 0) {
            v.c cVar = dVar.I;
            v.c cVar2 = dVar2.K;
            f i5 = o.i(cVar, 0);
            int e4 = cVar.e();
            v.d m4 = m();
            if (m4 != null) {
                e4 = m4.I.e();
            }
            if (i5 != null) {
                o.b(fVar2, i5, e4);
            }
            f i6 = o.i(cVar2, 0);
            int e5 = cVar2.e();
            v.d n4 = n();
            if (n4 != null) {
                e5 = n4.K.e();
            }
            if (i6 != null) {
                o.b(fVar, i6, -e5);
            }
        } else {
            v.c cVar3 = dVar.J;
            v.c cVar4 = dVar2.L;
            f i7 = o.i(cVar3, 1);
            int e6 = cVar3.e();
            v.d m5 = m();
            if (m5 != null) {
                e6 = m5.J.e();
            }
            if (i7 != null) {
                o.b(fVar2, i7, e6);
            }
            f i8 = o.i(cVar4, 1);
            int e7 = cVar4.e();
            v.d n5 = n();
            if (n5 != null) {
                e7 = n5.L.e();
            }
            if (i8 != null) {
                o.b(fVar, i8, -e7);
            }
        }
        fVar2.f3527a = this;
        fVar.f3527a = this;
    }

    @Override // w.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3518k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // w.o
    public final void f() {
        this.f3551c = null;
        ArrayList arrayList = this.f3518k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).f();
        }
    }

    @Override // w.o
    public final long j() {
        ArrayList arrayList = this.f3518k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i = 0; i < size; i++) {
            j4 = r5.i.f3531f + ((o) arrayList.get(i)).j() + j4 + r5.f3555h.f3531f;
        }
        return j4;
    }

    @Override // w.o
    public final boolean k() {
        ArrayList arrayList = this.f3518k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final v.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3518k;
            if (i >= arrayList.size()) {
                return null;
            }
            v.d dVar = ((o) arrayList.get(i)).f3550b;
            if (dVar.f3402g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final v.d n() {
        ArrayList arrayList = this.f3518k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v.d dVar = ((o) arrayList.get(size)).f3550b;
            if (dVar.f3402g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3553f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f3518k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
