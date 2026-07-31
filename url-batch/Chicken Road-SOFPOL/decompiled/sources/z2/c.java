package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9127k;

    /* renamed from: l, reason: collision with root package name */
    public int f9128l;

    public c(y2.d dVar, int i) {
        super(dVar);
        y2.d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f9127k = arrayList;
        this.f9166f = i;
        y2.d dVar3 = this.f9162b;
        y2.d m7 = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = m7;
            if (dVar3 == null) {
                break;
            } else {
                m7 = dVar3.m(this.f9166f);
            }
        }
        this.f9162b = dVar2;
        int i8 = this.f9166f;
        arrayList.add(i8 == 0 ? dVar2.f8753d : i8 == 1 ? dVar2.f8755e : null);
        y2.d l3 = dVar2.l(this.f9166f);
        while (l3 != null) {
            int i9 = this.f9166f;
            arrayList.add(i9 == 0 ? l3.f8753d : i9 == 1 ? l3.f8755e : null);
            l3 = l3.l(this.f9166f);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o oVar = (o) obj;
            int i11 = this.f9166f;
            if (i11 == 0) {
                oVar.f9162b.f8749b = this;
            } else if (i11 == 1) {
                oVar.f9162b.f8751c = this;
            }
        }
        if (this.f9166f == 0 && ((y2.e) this.f9162b.T).f8793v0 && arrayList.size() > 1) {
            this.f9162b = ((o) arrayList.get(arrayList.size() - 1)).f9162b;
        }
        this.f9128l = this.f9166f == 0 ? this.f9162b.f8763i0 : this.f9162b.f8765j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0392, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i;
        int i8;
        boolean z3;
        float f6;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        f fVar = this.f9168h;
        if (fVar.f9145j) {
            f fVar2 = this.i;
            if (fVar2.f9145j) {
                y2.d dVar2 = this.f9162b.T;
                boolean z8 = dVar2 instanceof y2.e ? ((y2.e) dVar2).f8793v0 : false;
                int i20 = fVar2.f9143g - fVar.f9143g;
                ArrayList arrayList = this.f9127k;
                int size = arrayList.size();
                int i21 = 0;
                while (true) {
                    i = -1;
                    i8 = 8;
                    if (i21 >= size) {
                        i21 = -1;
                        break;
                    } else if (((o) arrayList.get(i21)).f9162b.f8760g0 != 8) {
                        break;
                    } else {
                        i21++;
                    }
                }
                int i22 = size - 1;
                int i23 = i22;
                while (true) {
                    if (i23 < 0) {
                        break;
                    }
                    if (((o) arrayList.get(i23)).f9162b.f8760g0 != 8) {
                        i = i23;
                        break;
                    }
                    i23--;
                }
                int i24 = 0;
                while (i24 < 2) {
                    f6 = 0.0f;
                    int i25 = 0;
                    i11 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i25 < size) {
                        o oVar = (o) arrayList.get(i25);
                        y2.d dVar3 = oVar.f9162b;
                        boolean z9 = z8;
                        if (dVar3.f8760g0 == i8) {
                            i18 = i24;
                        } else {
                            i27++;
                            if (i25 > 0 && i25 >= i21) {
                                i11 += oVar.f9168h.f9142f;
                            }
                            g gVar = oVar.f9165e;
                            int i28 = gVar.f9143g;
                            i18 = i24;
                            boolean z10 = oVar.f9164d != 3;
                            if (z10) {
                                int i29 = this.f9166f;
                                if (i29 == 0 && !dVar3.f8753d.f9165e.f9145j) {
                                    return;
                                }
                                if (i29 == 1 && !dVar3.f8755e.f9165e.f9145j) {
                                    return;
                                } else {
                                    z7 = z10;
                                }
                            } else {
                                z7 = z10;
                                if (oVar.f9161a == 1 && i18 == 0) {
                                    i19 = gVar.f9148m;
                                    i26++;
                                } else if (gVar.f9145j) {
                                    i19 = i28;
                                }
                                z7 = true;
                                if (z7) {
                                    i26++;
                                    float f9 = dVar3.f8767k0[this.f9166f];
                                    if (f9 >= 0.0f) {
                                        f6 += f9;
                                    }
                                } else {
                                    i11 += i19;
                                }
                                if (i25 < i22 && i25 < i) {
                                    i11 += -oVar.i.f9142f;
                                }
                            }
                            i19 = i28;
                            if (z7) {
                            }
                            if (i25 < i22) {
                                i11 += -oVar.i.f9142f;
                            }
                        }
                        i25++;
                        z8 = z9;
                        i24 = i18;
                        i8 = 8;
                    }
                    z3 = z8;
                    int i30 = i24;
                    if (i11 < i20 || i26 == 0) {
                        i9 = i26;
                        i10 = i27;
                        break;
                    } else {
                        i24 = i30 + 1;
                        z8 = z3;
                        i8 = 8;
                    }
                }
                z3 = z8;
                f6 = 0.0f;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                int i31 = fVar.f9143g;
                if (z3) {
                    i31 = fVar2.f9143g;
                }
                float f10 = 0.5f;
                if (i11 > i20) {
                    i31 = z3 ? i31 + ((int) (((i11 - i20) / 2.0f) + 0.5f)) : i31 - ((int) (((i11 - i20) / 2.0f) + 0.5f));
                }
                if (i9 > 0) {
                    float f11 = i20 - i11;
                    int i32 = (int) ((f11 / i9) + 0.5f);
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < size) {
                        float f12 = f10;
                        o oVar2 = (o) arrayList.get(i33);
                        int i35 = i31;
                        y2.d dVar4 = oVar2.f9162b;
                        int i36 = i9;
                        g gVar2 = oVar2.f9165e;
                        float f13 = f11;
                        int i37 = i32;
                        if (dVar4.f8760g0 == 8 || oVar2.f9164d != 3 || gVar2.f9145j) {
                            i17 = i33;
                        } else {
                            int i38 = f6 > 0.0f ? (int) (((dVar4.f8767k0[this.f9166f] * f13) / f6) + f12) : i37;
                            if (this.f9166f == 0) {
                                i15 = dVar4.f8783v;
                                i16 = dVar4.f8782u;
                            } else {
                                i15 = dVar4.f8786y;
                                i16 = dVar4.f8785x;
                            }
                            i17 = i33;
                            int max = Math.max(i16, oVar2.f9161a == 1 ? Math.min(i38, gVar2.f9148m) : i38);
                            if (i15 > 0) {
                                max = Math.min(i15, max);
                            }
                            if (max != i38) {
                                i34++;
                                i38 = max;
                            }
                            gVar2.d(i38);
                        }
                        i33 = i17 + 1;
                        i31 = i35;
                        f10 = f12;
                        i9 = i36;
                        f11 = f13;
                        i32 = i37;
                    }
                    i12 = i31;
                    f8 = f10;
                    int i39 = i9;
                    if (i34 > 0) {
                        i9 = i39 - i34;
                        i11 = 0;
                        for (int i40 = 0; i40 < size; i40++) {
                            o oVar3 = (o) arrayList.get(i40);
                            if (oVar3.f9162b.f8760g0 != 8) {
                                if (i40 > 0 && i40 >= i21) {
                                    i11 += oVar3.f9168h.f9142f;
                                }
                                i11 += oVar3.f9165e.f9143g;
                                if (i40 < i22 && i40 < i) {
                                    i11 += -oVar3.i.f9142f;
                                }
                            }
                        }
                    } else {
                        i9 = i39;
                    }
                    i14 = 2;
                    if (this.f9128l == 2 && i34 == 0) {
                        i13 = 0;
                        this.f9128l = 0;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i12 = i31;
                    f8 = 0.5f;
                    i13 = 0;
                    i14 = 2;
                }
                if (i11 > i20) {
                    this.f9128l = i14;
                }
                if (i10 > 0 && i9 == 0 && i21 == i) {
                    this.f9128l = i14;
                }
                int i41 = this.f9128l;
                if (i41 == 1) {
                    int i42 = i10 > 1 ? (i20 - i11) / (i10 - 1) : i10 == 1 ? (i20 - i11) / 2 : i13;
                    if (i9 > 0) {
                        i42 = i13;
                    }
                    int i43 = i12;
                    for (int i44 = i13; i44 < size; i44++) {
                        o oVar4 = (o) arrayList.get(z3 ? size - (i44 + 1) : i44);
                        y2.d dVar5 = oVar4.f9162b;
                        f fVar3 = oVar4.i;
                        f fVar4 = oVar4.f9168h;
                        if (dVar5.f8760g0 == 8) {
                            fVar4.d(i43);
                            fVar3.d(i43);
                        } else {
                            if (i44 > 0) {
                                i43 = z3 ? i43 - i42 : i43 + i42;
                            }
                            if (i44 > 0 && i44 >= i21) {
                                i43 = z3 ? i43 - fVar4.f9142f : i43 + fVar4.f9142f;
                            }
                            if (z3) {
                                fVar3.d(i43);
                            } else {
                                fVar4.d(i43);
                            }
                            g gVar3 = oVar4.f9165e;
                            int i45 = gVar3.f9143g;
                            if (oVar4.f9164d == 3 && oVar4.f9161a == 1) {
                                i45 = gVar3.f9148m;
                            }
                            i43 = z3 ? i43 - i45 : i43 + i45;
                            if (z3) {
                                fVar4.d(i43);
                            } else {
                                fVar3.d(i43);
                            }
                            oVar4.f9167g = true;
                            if (i44 < i22 && i44 < i) {
                                i43 = z3 ? i43 - (-fVar3.f9142f) : i43 + (-fVar3.f9142f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 0) {
                    int i46 = (i20 - i11) / (i10 + 1);
                    if (i9 > 0) {
                        i46 = i13;
                    }
                    int i47 = i12;
                    for (int i48 = i13; i48 < size; i48++) {
                        o oVar5 = (o) arrayList.get(z3 ? size - (i48 + 1) : i48);
                        y2.d dVar6 = oVar5.f9162b;
                        f fVar5 = oVar5.i;
                        f fVar6 = oVar5.f9168h;
                        if (dVar6.f8760g0 == 8) {
                            fVar6.d(i47);
                            fVar5.d(i47);
                        } else {
                            int i49 = z3 ? i47 - i46 : i47 + i46;
                            if (i48 > 0 && i48 >= i21) {
                                i49 = z3 ? i49 - fVar6.f9142f : i49 + fVar6.f9142f;
                            }
                            if (z3) {
                                fVar5.d(i49);
                            } else {
                                fVar6.d(i49);
                            }
                            g gVar4 = oVar5.f9165e;
                            int i50 = gVar4.f9143g;
                            if (oVar5.f9164d == 3 && oVar5.f9161a == 1) {
                                i50 = Math.min(i50, gVar4.f9148m);
                            }
                            i47 = z3 ? i49 - i50 : i49 + i50;
                            if (z3) {
                                fVar6.d(i47);
                            } else {
                                fVar5.d(i47);
                            }
                            if (i48 < i22 && i48 < i) {
                                i47 = z3 ? i47 - (-fVar5.f9142f) : i47 + (-fVar5.f9142f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 2) {
                    float f14 = this.f9166f == 0 ? this.f9162b.f8754d0 : this.f9162b.f8756e0;
                    if (z3) {
                        f14 = 1.0f - f14;
                    }
                    int i51 = (int) (((i20 - i11) * f14) + f8);
                    if (i51 < 0 || i9 > 0) {
                        i51 = i13;
                    }
                    int i52 = z3 ? i12 - i51 : i12 + i51;
                    for (int i53 = i13; i53 < size; i53++) {
                        o oVar6 = (o) arrayList.get(z3 ? size - (i53 + 1) : i53);
                        y2.d dVar7 = oVar6.f9162b;
                        f fVar7 = oVar6.i;
                        f fVar8 = oVar6.f9168h;
                        if (dVar7.f8760g0 == 8) {
                            fVar8.d(i52);
                            fVar7.d(i52);
                        } else {
                            if (i53 > 0 && i53 >= i21) {
                                i52 = z3 ? i52 - fVar8.f9142f : i52 + fVar8.f9142f;
                            }
                            if (z3) {
                                fVar7.d(i52);
                            } else {
                                fVar8.d(i52);
                            }
                            g gVar5 = oVar6.f9165e;
                            int i54 = gVar5.f9143g;
                            if (oVar6.f9164d == 3 && oVar6.f9161a == 1) {
                                i54 = gVar5.f9148m;
                            }
                            i52 += i54;
                            if (z3) {
                                fVar8.d(i52);
                            } else {
                                fVar7.d(i52);
                            }
                            if (i53 < i22 && i53 < i) {
                                i52 = z3 ? i52 - (-fVar7.f9142f) : i52 + (-fVar7.f9142f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // z2.o
    public final void d() {
        ArrayList arrayList = this.f9127k;
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
        y2.d dVar = ((o) arrayList.get(0)).f9162b;
        y2.d dVar2 = ((o) arrayList.get(size2 - 1)).f9162b;
        int i8 = this.f9166f;
        f fVar = this.i;
        f fVar2 = this.f9168h;
        if (i8 == 0) {
            y2.c cVar = dVar.I;
            y2.c cVar2 = dVar2.K;
            f i9 = o.i(cVar, 0);
            int e8 = cVar.e();
            y2.d m7 = m();
            if (m7 != null) {
                e8 = m7.I.e();
            }
            if (i9 != null) {
                o.b(fVar2, i9, e8);
            }
            f i10 = o.i(cVar2, 0);
            int e9 = cVar2.e();
            y2.d n6 = n();
            if (n6 != null) {
                e9 = n6.K.e();
            }
            if (i10 != null) {
                o.b(fVar, i10, -e9);
            }
        } else {
            y2.c cVar3 = dVar.J;
            y2.c cVar4 = dVar2.L;
            f i11 = o.i(cVar3, 1);
            int e10 = cVar3.e();
            y2.d m8 = m();
            if (m8 != null) {
                e10 = m8.J.e();
            }
            if (i11 != null) {
                o.b(fVar2, i11, e10);
            }
            f i12 = o.i(cVar4, 1);
            int e11 = cVar4.e();
            y2.d n7 = n();
            if (n7 != null) {
                e11 = n7.L.e();
            }
            if (i12 != null) {
                o.b(fVar, i12, -e11);
            }
        }
        fVar2.f9137a = this;
        fVar.f9137a = this;
    }

    @Override // z2.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9127k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // z2.o
    public final void f() {
        this.f9163c = null;
        ArrayList arrayList = this.f9127k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).f();
        }
    }

    @Override // z2.o
    public final long j() {
        ArrayList arrayList = this.f9127k;
        int size = arrayList.size();
        long j7 = 0;
        for (int i = 0; i < size; i++) {
            j7 = r5.i.f9142f + ((o) arrayList.get(i)).j() + j7 + r5.f9168h.f9142f;
        }
        return j7;
    }

    @Override // z2.o
    public final boolean k() {
        ArrayList arrayList = this.f9127k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final y2.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9127k;
            if (i >= arrayList.size()) {
                return null;
            }
            y2.d dVar = ((o) arrayList.get(i)).f9162b;
            if (dVar.f8760g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final y2.d n() {
        ArrayList arrayList = this.f9127k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y2.d dVar = ((o) arrayList.get(size)).f9162b;
            if (dVar.f8760g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f9166f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f9127k;
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
