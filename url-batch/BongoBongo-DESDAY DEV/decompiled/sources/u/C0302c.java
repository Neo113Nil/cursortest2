package u;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3912k;

    /* renamed from: l, reason: collision with root package name */
    public int f3913l;

    public C0302c(t.d dVar, int i) {
        super(dVar);
        t.d dVar2;
        this.f3912k = new ArrayList();
        this.f3947f = i;
        t.d dVar3 = this.f3944b;
        t.d m2 = dVar3.m(i);
        while (true) {
            t.d dVar4 = m2;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                m2 = dVar3.m(this.f3947f);
            }
        }
        this.f3944b = dVar2;
        int i2 = this.f3947f;
        o oVar = i2 == 0 ? dVar2.d : i2 == 1 ? dVar2.f3783e : null;
        ArrayList arrayList = this.f3912k;
        arrayList.add(oVar);
        t.d l2 = dVar2.l(this.f3947f);
        while (l2 != null) {
            int i3 = this.f3947f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3783e : null);
            l2 = l2.l(this.f3947f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            int i4 = this.f3947f;
            if (i4 == 0) {
                oVar2.f3944b.f3778b = this;
            } else if (i4 == 1) {
                oVar2.f3944b.f3780c = this;
            }
        }
        if (this.f3947f == 0 && ((t.e) this.f3944b.f3769T).f3829v0 && arrayList.size() > 1) {
            this.f3944b = ((o) arrayList.get(arrayList.size() - 1)).f3944b;
        }
        this.f3913l = this.f3947f == 0 ? this.f3944b.f3791i0 : this.f3944b.f3793j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // u.InterfaceC0303d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0303d interfaceC0303d) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        boolean z2;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        float f3;
        int i15;
        boolean z4;
        int i16;
        f fVar = this.f3949h;
        if (fVar.f3928j) {
            f fVar2 = this.i;
            if (fVar2.f3928j) {
                t.d dVar = this.f3944b.f3769T;
                boolean z5 = dVar instanceof t.e ? ((t.e) dVar).f3829v0 : false;
                int i17 = fVar2.f3926g - fVar.f3926g;
                ArrayList arrayList3 = this.f3912k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((o) arrayList3.get(i18)).f3944b.f3788g0 != 8) {
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
                    if (((o) arrayList3.get(i20)).f3944b.f3788g0 != 8) {
                        i = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (i21 < 2) {
                    int i22 = 0;
                    i6 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    f2 = RecyclerView.A0;
                    while (i22 < size) {
                        o oVar = (o) arrayList3.get(i22);
                        t.d dVar2 = oVar.f3944b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar2.f3788g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += oVar.f3949h.f3925f;
                            }
                            g gVar = oVar.f3946e;
                            int i25 = gVar.f3926g;
                            i15 = i18;
                            boolean z6 = oVar.d != 3;
                            if (z6) {
                                int i26 = this.f3947f;
                                if (i26 == 0 && !dVar2.d.f3946e.f3928j) {
                                    return;
                                }
                                if (i26 == 1 && !dVar2.f3783e.f3946e.f3928j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (oVar.f3943a == 1 && i21 == 0) {
                                    i16 = gVar.f3931m;
                                    i23++;
                                } else if (gVar.f3928j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = dVar2.f3795k0[this.f3947f];
                                    if (f4 >= RecyclerView.A0) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -oVar.i.f3925f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -oVar.i.f3925f;
                            }
                        }
                        i22++;
                        arrayList3 = arrayList4;
                        i18 = i15;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i18;
                    if (i6 < i17 || i23 == 0) {
                        i4 = i23;
                        i5 = i24;
                        break;
                    } else {
                        i21++;
                        arrayList3 = arrayList;
                        i18 = i3;
                        i2 = 8;
                    }
                }
                arrayList = arrayList3;
                i3 = i18;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                f2 = RecyclerView.A0;
                int i27 = fVar.f3926g;
                if (z5) {
                    i27 = fVar2.f3926g;
                }
                if (i6 > i17) {
                    i27 = z5 ? i27 + ((int) (((i6 - i17) / 2.0f) + 0.5f)) : i27 - ((int) (((i6 - i17) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f5 = i17 - i6;
                    int i28 = (int) ((f5 / i4) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        ArrayList arrayList5 = arrayList;
                        o oVar2 = (o) arrayList5.get(i29);
                        int i31 = i28;
                        t.d dVar3 = oVar2.f3944b;
                        int i32 = i6;
                        int i33 = i27;
                        if (dVar3.f3788g0 != 8 && oVar2.d == 3) {
                            g gVar2 = oVar2.f3946e;
                            if (!gVar2.f3928j) {
                                if (f2 > RecyclerView.A0) {
                                    z3 = z5;
                                    i12 = (int) (((dVar3.f3795k0[this.f3947f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3947f == 0) {
                                    i13 = dVar3.f3809v;
                                    i14 = dVar3.f3808u;
                                } else {
                                    i13 = dVar3.f3812y;
                                    i14 = dVar3.f3811x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, oVar2.f3943a == 1 ? Math.min(i12, gVar2.f3931m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                gVar2.d(i12);
                                i29++;
                                i28 = i31;
                                i6 = i32;
                                i27 = i33;
                                z5 = z3;
                                f5 = f3;
                                arrayList = arrayList5;
                            }
                        }
                        z3 = z5;
                        f3 = f5;
                        i29++;
                        i28 = i31;
                        i6 = i32;
                        i27 = i33;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i30 > 0) {
                        i4 -= i30;
                        int i35 = 0;
                        i6 = 0;
                        while (i35 < size) {
                            o oVar3 = (o) arrayList2.get(i35);
                            if (oVar3.f3944b.f3788g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += oVar3.f3949h.f3925f;
                                }
                                i6 += oVar3.f3946e.f3926g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -oVar3.i.f3925f;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i10 = 2;
                    if (this.f3913l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3913l = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 0;
                    i10 = 2;
                }
                if (i6 > i17) {
                    this.f3913l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3913l = i10;
                }
                int i36 = this.f3913l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        o oVar4 = (o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = oVar4.f3944b.f3788g0;
                        f fVar3 = oVar4.i;
                        f fVar4 = oVar4.f3949h;
                        if (i40 == 8) {
                            fVar4.d(i38);
                            fVar3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - fVar4.f3925f : i38 + fVar4.f3925f;
                            }
                            if (z2) {
                                fVar3.d(i38);
                            } else {
                                fVar4.d(i38);
                            }
                            g gVar3 = oVar4.f3946e;
                            int i41 = gVar3.f3926g;
                            if (oVar4.d == 3 && oVar4.f3943a == 1) {
                                i41 = gVar3.f3931m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                fVar4.d(i38);
                            } else {
                                fVar3.d(i38);
                            }
                            oVar4.f3948g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-fVar3.f3925f) : i38 + (-fVar3.f3925f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i17 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i42 = i9;
                    }
                    int i43 = i7;
                    for (int i44 = i9; i44 < size; i44++) {
                        o oVar5 = (o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = oVar5.f3944b.f3788g0;
                        f fVar5 = oVar5.i;
                        f fVar6 = oVar5.f3949h;
                        if (i45 == 8) {
                            fVar6.d(i43);
                            fVar5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - fVar6.f3925f : i46 + fVar6.f3925f;
                            }
                            if (z2) {
                                fVar5.d(i46);
                            } else {
                                fVar6.d(i46);
                            }
                            g gVar4 = oVar5.f3946e;
                            int i47 = gVar4.f3926g;
                            if (oVar5.d == 3 && oVar5.f3943a == 1) {
                                i47 = Math.min(i47, gVar4.f3931m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                fVar6.d(i43);
                            } else {
                                fVar5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-fVar5.f3925f) : i43 + (-fVar5.f3925f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3947f == 0 ? this.f3944b.f3782d0 : this.f3944b.f3784e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        o oVar6 = (o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = oVar6.f3944b.f3788g0;
                        f fVar7 = oVar6.i;
                        f fVar8 = oVar6.f3949h;
                        if (i51 == 8) {
                            fVar8.d(i49);
                            fVar7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - fVar8.f3925f : i49 + fVar8.f3925f;
                            }
                            if (z2) {
                                fVar7.d(i49);
                            } else {
                                fVar8.d(i49);
                            }
                            g gVar5 = oVar6.f3946e;
                            int i52 = gVar5.f3926g;
                            if (oVar6.d == 3 && oVar6.f3943a == 1) {
                                i52 = gVar5.f3931m;
                            }
                            i49 += i52;
                            if (z2) {
                                fVar8.d(i49);
                            } else {
                                fVar7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-fVar7.f3925f) : i49 + (-fVar7.f3925f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // u.o
    public final void d() {
        ArrayList arrayList = this.f3912k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        t.d dVar = ((o) arrayList.get(0)).f3944b;
        t.d dVar2 = ((o) arrayList.get(size - 1)).f3944b;
        int i = this.f3947f;
        f fVar = this.i;
        f fVar2 = this.f3949h;
        if (i == 0) {
            t.c cVar = dVar.f3758I;
            t.c cVar2 = dVar2.f3760K;
            f i2 = o.i(cVar, 0);
            int e2 = cVar.e();
            t.d m2 = m();
            if (m2 != null) {
                e2 = m2.f3758I.e();
            }
            if (i2 != null) {
                o.b(fVar2, i2, e2);
            }
            f i3 = o.i(cVar2, 0);
            int e3 = cVar2.e();
            t.d n2 = n();
            if (n2 != null) {
                e3 = n2.f3760K.e();
            }
            if (i3 != null) {
                o.b(fVar, i3, -e3);
            }
        } else {
            t.c cVar3 = dVar.f3759J;
            t.c cVar4 = dVar2.f3761L;
            f i4 = o.i(cVar3, 1);
            int e4 = cVar3.e();
            t.d m3 = m();
            if (m3 != null) {
                e4 = m3.f3759J.e();
            }
            if (i4 != null) {
                o.b(fVar2, i4, e4);
            }
            f i5 = o.i(cVar4, 1);
            int e5 = cVar4.e();
            t.d n3 = n();
            if (n3 != null) {
                e5 = n3.f3761L.e();
            }
            if (i5 != null) {
                o.b(fVar, i5, -e5);
            }
        }
        fVar2.f3921a = this;
        fVar.f3921a = this;
    }

    @Override // u.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3912k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // u.o
    public final void f() {
        this.f3945c = null;
        Iterator it = this.f3912k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // u.o
    public final long j() {
        ArrayList arrayList = this.f3912k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3925f + ((o) arrayList.get(i)).j() + j2 + r5.f3949h.f3925f;
        }
        return j2;
    }

    @Override // u.o
    public final boolean k() {
        ArrayList arrayList = this.f3912k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final t.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3912k;
            if (i >= arrayList.size()) {
                return null;
            }
            t.d dVar = ((o) arrayList.get(i)).f3944b;
            if (dVar.f3788g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final t.d n() {
        ArrayList arrayList = this.f3912k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t.d dVar = ((o) arrayList.get(size)).f3944b;
            if (dVar.f3788g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3947f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3912k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb.append("<");
            sb.append(oVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
