package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3326k;

    /* renamed from: l, reason: collision with root package name */
    public int f3327l;

    public c(s.d dVar, int i4) {
        super(dVar);
        s.d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f3326k = arrayList;
        this.f3358f = i4;
        s.d dVar3 = this.f3355b;
        s.d m4 = dVar3.m(i4);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m4;
            if (dVar3 == null) {
                break;
            } else {
                m4 = dVar3.m(this.f3358f);
            }
        }
        this.f3355b = dVar2;
        int i5 = this.f3358f;
        arrayList.add(i5 == 0 ? dVar2.f3237d : i5 == 1 ? dVar2.f3239e : null);
        s.d l4 = dVar2.l(this.f3358f);
        while (l4 != null) {
            int i6 = this.f3358f;
            arrayList.add(i6 == 0 ? l4.f3237d : i6 == 1 ? l4.f3239e : null);
            l4 = l4.l(this.f3358f);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            o oVar = (o) obj;
            int i8 = this.f3358f;
            if (i8 == 0) {
                oVar.f3355b.f3234b = this;
            } else if (i8 == 1) {
                oVar.f3355b.c = this;
            }
        }
        if (this.f3358f == 0 && ((s.e) this.f3355b.T).f3275v0 && arrayList.size() > 1) {
            this.f3355b = ((o) arrayList.get(arrayList.size() - 1)).f3355b;
        }
        this.f3327l = this.f3358f == 0 ? this.f3355b.f3245i0 : this.f3355b.f3247j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i4;
        int i5;
        boolean z3;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        float f5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        int i16;
        f fVar = this.h;
        if (fVar.f3339j) {
            f fVar2 = this.f3359i;
            if (fVar2.f3339j) {
                s.d dVar2 = this.f3355b.T;
                boolean z5 = dVar2 instanceof s.e ? ((s.e) dVar2).f3275v0 : false;
                int i17 = fVar2.g - fVar.g;
                ArrayList arrayList = this.f3326k;
                int size = arrayList.size();
                int i18 = 0;
                while (true) {
                    i4 = -1;
                    i5 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((o) arrayList.get(i18)).f3355b.f3242g0 != 8) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int i19 = size - 1;
                int i20 = i19;
                while (true) {
                    if (i20 < 0) {
                        break;
                    }
                    if (((o) arrayList.get(i20)).f3355b.f3242g0 != 8) {
                        i4 = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (i21 < 2) {
                    f4 = 0.0f;
                    int i22 = 0;
                    i8 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (i22 < size) {
                        o oVar = (o) arrayList.get(i22);
                        s.d dVar3 = oVar.f3355b;
                        boolean z6 = z5;
                        if (dVar3.f3242g0 == i5) {
                            i15 = i21;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i8 += oVar.h.f3337f;
                            }
                            g gVar = oVar.f3357e;
                            int i25 = gVar.g;
                            i15 = i21;
                            boolean z7 = oVar.f3356d != 3;
                            if (z7) {
                                int i26 = this.f3358f;
                                if (i26 == 0 && !dVar3.f3237d.f3357e.f3339j) {
                                    return;
                                }
                                if (i26 == 1 && !dVar3.f3239e.f3357e.f3339j) {
                                    return;
                                } else {
                                    z4 = z7;
                                }
                            } else {
                                z4 = z7;
                                if (oVar.f3354a == 1 && i15 == 0) {
                                    i16 = gVar.f3342m;
                                    i23++;
                                } else if (gVar.f3339j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f6 = dVar3.f3249k0[this.f3358f];
                                    if (f6 >= 0.0f) {
                                        f4 += f6;
                                    }
                                } else {
                                    i8 += i16;
                                }
                                if (i22 < i19 && i22 < i4) {
                                    i8 += -oVar.f3359i.f3337f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i8 += -oVar.f3359i.f3337f;
                            }
                        }
                        i22++;
                        z5 = z6;
                        i21 = i15;
                        i5 = 8;
                    }
                    z3 = z5;
                    int i27 = i21;
                    if (i8 < i17 || i23 == 0) {
                        i6 = i23;
                        i7 = i24;
                        break;
                    } else {
                        i21 = i27 + 1;
                        z5 = z3;
                        i5 = 8;
                    }
                }
                z3 = z5;
                f4 = 0.0f;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                int i28 = fVar.g;
                if (z3) {
                    i28 = fVar2.g;
                }
                float f7 = 0.5f;
                if (i8 > i17) {
                    i28 = z3 ? i28 + ((int) (((i8 - i17) / 2.0f) + 0.5f)) : i28 - ((int) (((i8 - i17) / 2.0f) + 0.5f));
                }
                if (i6 > 0) {
                    float f8 = i17 - i8;
                    int i29 = (int) ((f8 / i6) + 0.5f);
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < size) {
                        float f9 = f7;
                        o oVar2 = (o) arrayList.get(i30);
                        int i32 = i28;
                        s.d dVar4 = oVar2.f3355b;
                        int i33 = i6;
                        g gVar2 = oVar2.f3357e;
                        float f10 = f8;
                        int i34 = i29;
                        if (dVar4.f3242g0 == 8 || oVar2.f3356d != 3 || gVar2.f3339j) {
                            i14 = i30;
                        } else {
                            int i35 = f4 > 0.0f ? (int) (((dVar4.f3249k0[this.f3358f] * f10) / f4) + f9) : i34;
                            if (this.f3358f == 0) {
                                i12 = dVar4.f3265v;
                                i13 = dVar4.f3264u;
                            } else {
                                i12 = dVar4.f3268y;
                                i13 = dVar4.f3267x;
                            }
                            i14 = i30;
                            int max = Math.max(i13, oVar2.f3354a == 1 ? Math.min(i35, gVar2.f3342m) : i35);
                            if (i12 > 0) {
                                max = Math.min(i12, max);
                            }
                            if (max != i35) {
                                i31++;
                                i35 = max;
                            }
                            gVar2.d(i35);
                        }
                        i30 = i14 + 1;
                        i28 = i32;
                        f7 = f9;
                        i6 = i33;
                        f8 = f10;
                        i29 = i34;
                    }
                    i9 = i28;
                    f5 = f7;
                    int i36 = i6;
                    if (i31 > 0) {
                        i6 = i36 - i31;
                        i8 = 0;
                        for (int i37 = 0; i37 < size; i37++) {
                            o oVar3 = (o) arrayList.get(i37);
                            if (oVar3.f3355b.f3242g0 != 8) {
                                if (i37 > 0 && i37 >= i18) {
                                    i8 += oVar3.h.f3337f;
                                }
                                i8 += oVar3.f3357e.g;
                                if (i37 < i19 && i37 < i4) {
                                    i8 += -oVar3.f3359i.f3337f;
                                }
                            }
                        }
                    } else {
                        i6 = i36;
                    }
                    i11 = 2;
                    if (this.f3327l == 2 && i31 == 0) {
                        i10 = 0;
                        this.f3327l = 0;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i9 = i28;
                    f5 = 0.5f;
                    i10 = 0;
                    i11 = 2;
                }
                if (i8 > i17) {
                    this.f3327l = i11;
                }
                if (i7 > 0 && i6 == 0 && i18 == i4) {
                    this.f3327l = i11;
                }
                int i38 = this.f3327l;
                if (i38 == 1) {
                    int i39 = i7 > 1 ? (i17 - i8) / (i7 - 1) : i7 == 1 ? (i17 - i8) / 2 : i10;
                    if (i6 > 0) {
                        i39 = i10;
                    }
                    int i40 = i9;
                    for (int i41 = i10; i41 < size; i41++) {
                        o oVar4 = (o) arrayList.get(z3 ? size - (i41 + 1) : i41);
                        s.d dVar5 = oVar4.f3355b;
                        f fVar3 = oVar4.f3359i;
                        f fVar4 = oVar4.h;
                        if (dVar5.f3242g0 == 8) {
                            fVar4.d(i40);
                            fVar3.d(i40);
                        } else {
                            if (i41 > 0) {
                                i40 = z3 ? i40 - i39 : i40 + i39;
                            }
                            if (i41 > 0 && i41 >= i18) {
                                i40 = z3 ? i40 - fVar4.f3337f : i40 + fVar4.f3337f;
                            }
                            if (z3) {
                                fVar3.d(i40);
                            } else {
                                fVar4.d(i40);
                            }
                            g gVar3 = oVar4.f3357e;
                            int i42 = gVar3.g;
                            if (oVar4.f3356d == 3 && oVar4.f3354a == 1) {
                                i42 = gVar3.f3342m;
                            }
                            i40 = z3 ? i40 - i42 : i40 + i42;
                            if (z3) {
                                fVar4.d(i40);
                            } else {
                                fVar3.d(i40);
                            }
                            oVar4.g = true;
                            if (i41 < i19 && i41 < i4) {
                                i40 = z3 ? i40 - (-fVar3.f3337f) : i40 + (-fVar3.f3337f);
                            }
                        }
                    }
                    return;
                }
                if (i38 == 0) {
                    int i43 = (i17 - i8) / (i7 + 1);
                    if (i6 > 0) {
                        i43 = i10;
                    }
                    int i44 = i9;
                    for (int i45 = i10; i45 < size; i45++) {
                        o oVar5 = (o) arrayList.get(z3 ? size - (i45 + 1) : i45);
                        s.d dVar6 = oVar5.f3355b;
                        f fVar5 = oVar5.f3359i;
                        f fVar6 = oVar5.h;
                        if (dVar6.f3242g0 == 8) {
                            fVar6.d(i44);
                            fVar5.d(i44);
                        } else {
                            int i46 = z3 ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i18) {
                                i46 = z3 ? i46 - fVar6.f3337f : i46 + fVar6.f3337f;
                            }
                            if (z3) {
                                fVar5.d(i46);
                            } else {
                                fVar6.d(i46);
                            }
                            g gVar4 = oVar5.f3357e;
                            int i47 = gVar4.g;
                            if (oVar5.f3356d == 3 && oVar5.f3354a == 1) {
                                i47 = Math.min(i47, gVar4.f3342m);
                            }
                            i44 = z3 ? i46 - i47 : i46 + i47;
                            if (z3) {
                                fVar6.d(i44);
                            } else {
                                fVar5.d(i44);
                            }
                            if (i45 < i19 && i45 < i4) {
                                i44 = z3 ? i44 - (-fVar5.f3337f) : i44 + (-fVar5.f3337f);
                            }
                        }
                    }
                    return;
                }
                if (i38 == 2) {
                    float f11 = this.f3358f == 0 ? this.f3355b.f3238d0 : this.f3355b.f3240e0;
                    if (z3) {
                        f11 = 1.0f - f11;
                    }
                    int i48 = (int) (((i17 - i8) * f11) + f5);
                    if (i48 < 0 || i6 > 0) {
                        i48 = i10;
                    }
                    int i49 = z3 ? i9 - i48 : i9 + i48;
                    for (int i50 = i10; i50 < size; i50++) {
                        o oVar6 = (o) arrayList.get(z3 ? size - (i50 + 1) : i50);
                        s.d dVar7 = oVar6.f3355b;
                        f fVar7 = oVar6.f3359i;
                        f fVar8 = oVar6.h;
                        if (dVar7.f3242g0 == 8) {
                            fVar8.d(i49);
                            fVar7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i18) {
                                i49 = z3 ? i49 - fVar8.f3337f : i49 + fVar8.f3337f;
                            }
                            if (z3) {
                                fVar7.d(i49);
                            } else {
                                fVar8.d(i49);
                            }
                            g gVar5 = oVar6.f3357e;
                            int i51 = gVar5.g;
                            if (oVar6.f3356d == 3 && oVar6.f3354a == 1) {
                                i51 = gVar5.f3342m;
                            }
                            i49 += i51;
                            if (z3) {
                                fVar8.d(i49);
                            } else {
                                fVar7.d(i49);
                            }
                            if (i50 < i19 && i50 < i4) {
                                i49 = z3 ? i49 - (-fVar7.f3337f) : i49 + (-fVar7.f3337f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.o
    public final void d() {
        ArrayList arrayList = this.f3326k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        s.d dVar = ((o) arrayList.get(0)).f3355b;
        s.d dVar2 = ((o) arrayList.get(size2 - 1)).f3355b;
        int i5 = this.f3358f;
        f fVar = this.f3359i;
        f fVar2 = this.h;
        if (i5 == 0) {
            s.c cVar = dVar.I;
            s.c cVar2 = dVar2.K;
            f i6 = o.i(cVar, 0);
            int e4 = cVar.e();
            s.d m4 = m();
            if (m4 != null) {
                e4 = m4.I.e();
            }
            if (i6 != null) {
                o.b(fVar2, i6, e4);
            }
            f i7 = o.i(cVar2, 0);
            int e5 = cVar2.e();
            s.d n3 = n();
            if (n3 != null) {
                e5 = n3.K.e();
            }
            if (i7 != null) {
                o.b(fVar, i7, -e5);
            }
        } else {
            s.c cVar3 = dVar.J;
            s.c cVar4 = dVar2.L;
            f i8 = o.i(cVar3, 1);
            int e6 = cVar3.e();
            s.d m5 = m();
            if (m5 != null) {
                e6 = m5.J.e();
            }
            if (i8 != null) {
                o.b(fVar2, i8, e6);
            }
            f i9 = o.i(cVar4, 1);
            int e7 = cVar4.e();
            s.d n4 = n();
            if (n4 != null) {
                e7 = n4.L.e();
            }
            if (i9 != null) {
                o.b(fVar, i9, -e7);
            }
        }
        fVar2.f3333a = this;
        fVar.f3333a = this;
    }

    @Override // t.o
    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3326k;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i4)).e();
            i4++;
        }
    }

    @Override // t.o
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.f3326k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((o) obj).f();
        }
    }

    @Override // t.o
    public final long j() {
        ArrayList arrayList = this.f3326k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j4 = r5.f3359i.f3337f + ((o) arrayList.get(i4)).j() + j4 + r5.h.f3337f;
        }
        return j4;
    }

    @Override // t.o
    public final boolean k() {
        ArrayList arrayList = this.f3326k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((o) arrayList.get(i4)).k()) {
                return false;
            }
        }
        return true;
    }

    public final s.d m() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3326k;
            if (i4 >= arrayList.size()) {
                return null;
            }
            s.d dVar = ((o) arrayList.get(i4)).f3355b;
            if (dVar.f3242g0 != 8) {
                return dVar;
            }
            i4++;
        }
    }

    public final s.d n() {
        ArrayList arrayList = this.f3326k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s.d dVar = ((o) arrayList.get(size)).f3355b;
            if (dVar.f3242g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3358f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f3326k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sb.append("<");
            sb.append((o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
