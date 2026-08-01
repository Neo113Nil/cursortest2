package v;

import java.util.ArrayList;
import java.util.Iterator;
import u.C0386c;
import u.C0387d;
import u.C0388e;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394c extends AbstractC0406o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4406k;

    /* renamed from: l, reason: collision with root package name */
    public int f4407l;

    public C0394c(C0387d c0387d, int i) {
        super(c0387d);
        C0387d c0387d2;
        this.f4406k = new ArrayList();
        this.f4440f = i;
        C0387d c0387d3 = this.f4437b;
        C0387d m2 = c0387d3.m(i);
        while (true) {
            C0387d c0387d4 = m2;
            c0387d2 = c0387d3;
            c0387d3 = c0387d4;
            if (c0387d3 == null) {
                break;
            } else {
                m2 = c0387d3.m(this.f4440f);
            }
        }
        this.f4437b = c0387d2;
        int i2 = this.f4440f;
        AbstractC0406o abstractC0406o = i2 == 0 ? c0387d2.f4260d : i2 == 1 ? c0387d2.e : null;
        ArrayList arrayList = this.f4406k;
        arrayList.add(abstractC0406o);
        C0387d l2 = c0387d2.l(this.f4440f);
        while (l2 != null) {
            int i3 = this.f4440f;
            arrayList.add(i3 == 0 ? l2.f4260d : i3 == 1 ? l2.e : null);
            l2 = l2.l(this.f4440f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0406o abstractC0406o2 = (AbstractC0406o) it.next();
            int i4 = this.f4440f;
            if (i4 == 0) {
                abstractC0406o2.f4437b.f4256b = this;
            } else if (i4 == 1) {
                abstractC0406o2.f4437b.f4258c = this;
            }
        }
        if (this.f4440f == 0 && ((C0388e) this.f4437b.f4247T).f4307v0 && arrayList.size() > 1) {
            this.f4437b = ((AbstractC0406o) arrayList.get(arrayList.size() - 1)).f4437b;
        }
        this.f4407l = this.f4440f == 0 ? this.f4437b.f4269i0 : this.f4437b.f4270j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // v.InterfaceC0395d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0395d interfaceC0395d) {
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
        C0397f c0397f = this.f4442h;
        if (c0397f.j) {
            C0397f c0397f2 = this.i;
            if (c0397f2.j) {
                C0387d c0387d = this.f4437b.f4247T;
                boolean z5 = c0387d instanceof C0388e ? ((C0388e) c0387d).f4307v0 : false;
                int i17 = c0397f2.f4420g - c0397f.f4420g;
                ArrayList arrayList3 = this.f4406k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0406o) arrayList3.get(i18)).f4437b.f4266g0 != 8) {
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
                    if (((AbstractC0406o) arrayList3.get(i20)).f4437b.f4266g0 != 8) {
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
                    f2 = 0.0f;
                    while (i22 < size) {
                        AbstractC0406o abstractC0406o = (AbstractC0406o) arrayList3.get(i22);
                        C0387d c0387d2 = abstractC0406o.f4437b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0387d2.f4266g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0406o.f4442h.f4419f;
                            }
                            C0398g c0398g = abstractC0406o.e;
                            int i25 = c0398g.f4420g;
                            i15 = i18;
                            boolean z6 = abstractC0406o.f4439d != 3;
                            if (z6) {
                                int i26 = this.f4440f;
                                if (i26 == 0 && !c0387d2.f4260d.e.j) {
                                    return;
                                }
                                if (i26 == 1 && !c0387d2.e.e.j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0406o.f4436a == 1 && i21 == 0) {
                                    i16 = c0398g.f4424m;
                                    i23++;
                                } else if (c0398g.j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0387d2.f4272k0[this.f4440f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0406o.i.f4419f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0406o.i.f4419f;
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
                f2 = 0.0f;
                int i27 = c0397f.f4420g;
                if (z5) {
                    i27 = c0397f2.f4420g;
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
                        AbstractC0406o abstractC0406o2 = (AbstractC0406o) arrayList5.get(i29);
                        int i31 = i28;
                        C0387d c0387d3 = abstractC0406o2.f4437b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0387d3.f4266g0 != 8 && abstractC0406o2.f4439d == 3) {
                            C0398g c0398g2 = abstractC0406o2.e;
                            if (!c0398g2.j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0387d3.f4272k0[this.f4440f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f4440f == 0) {
                                    i13 = c0387d3.f4287v;
                                    i14 = c0387d3.f4286u;
                                } else {
                                    i13 = c0387d3.f4290y;
                                    i14 = c0387d3.f4289x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0406o2.f4436a == 1 ? Math.min(i12, c0398g2.f4424m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0398g2.d(i12);
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
                            AbstractC0406o abstractC0406o3 = (AbstractC0406o) arrayList2.get(i35);
                            if (abstractC0406o3.f4437b.f4266g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0406o3.f4442h.f4419f;
                                }
                                i6 += abstractC0406o3.e.f4420g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0406o3.i.f4419f;
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
                    if (this.f4407l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f4407l = 0;
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
                    this.f4407l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f4407l = i10;
                }
                int i36 = this.f4407l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0406o abstractC0406o4 = (AbstractC0406o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0406o4.f4437b.f4266g0;
                        C0397f c0397f3 = abstractC0406o4.i;
                        C0397f c0397f4 = abstractC0406o4.f4442h;
                        if (i40 == 8) {
                            c0397f4.d(i38);
                            c0397f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0397f4.f4419f : i38 + c0397f4.f4419f;
                            }
                            if (z2) {
                                c0397f3.d(i38);
                            } else {
                                c0397f4.d(i38);
                            }
                            C0398g c0398g3 = abstractC0406o4.e;
                            int i41 = c0398g3.f4420g;
                            if (abstractC0406o4.f4439d == 3 && abstractC0406o4.f4436a == 1) {
                                i41 = c0398g3.f4424m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0397f4.d(i38);
                            } else {
                                c0397f3.d(i38);
                            }
                            abstractC0406o4.f4441g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0397f3.f4419f) : i38 + (-c0397f3.f4419f);
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
                        AbstractC0406o abstractC0406o5 = (AbstractC0406o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0406o5.f4437b.f4266g0;
                        C0397f c0397f5 = abstractC0406o5.i;
                        C0397f c0397f6 = abstractC0406o5.f4442h;
                        if (i45 == 8) {
                            c0397f6.d(i43);
                            c0397f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0397f6.f4419f : i46 + c0397f6.f4419f;
                            }
                            if (z2) {
                                c0397f5.d(i46);
                            } else {
                                c0397f6.d(i46);
                            }
                            C0398g c0398g4 = abstractC0406o5.e;
                            int i47 = c0398g4.f4420g;
                            if (abstractC0406o5.f4439d == 3 && abstractC0406o5.f4436a == 1) {
                                i47 = Math.min(i47, c0398g4.f4424m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0397f6.d(i43);
                            } else {
                                c0397f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0397f5.f4419f) : i43 + (-c0397f5.f4419f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f4440f == 0 ? this.f4437b.f4261d0 : this.f4437b.f4262e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0406o abstractC0406o6 = (AbstractC0406o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0406o6.f4437b.f4266g0;
                        C0397f c0397f7 = abstractC0406o6.i;
                        C0397f c0397f8 = abstractC0406o6.f4442h;
                        if (i51 == 8) {
                            c0397f8.d(i49);
                            c0397f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0397f8.f4419f : i49 + c0397f8.f4419f;
                            }
                            if (z2) {
                                c0397f7.d(i49);
                            } else {
                                c0397f8.d(i49);
                            }
                            C0398g c0398g5 = abstractC0406o6.e;
                            int i52 = c0398g5.f4420g;
                            if (abstractC0406o6.f4439d == 3 && abstractC0406o6.f4436a == 1) {
                                i52 = c0398g5.f4424m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0397f8.d(i49);
                            } else {
                                c0397f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0397f7.f4419f) : i49 + (-c0397f7.f4419f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // v.AbstractC0406o
    public final void d() {
        ArrayList arrayList = this.f4406k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0406o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0387d c0387d = ((AbstractC0406o) arrayList.get(0)).f4437b;
        C0387d c0387d2 = ((AbstractC0406o) arrayList.get(size - 1)).f4437b;
        int i = this.f4440f;
        C0397f c0397f = this.i;
        C0397f c0397f2 = this.f4442h;
        if (i == 0) {
            C0386c c0386c = c0387d.f4236I;
            C0386c c0386c2 = c0387d2.f4238K;
            C0397f i2 = AbstractC0406o.i(c0386c, 0);
            int e = c0386c.e();
            C0387d m2 = m();
            if (m2 != null) {
                e = m2.f4236I.e();
            }
            if (i2 != null) {
                AbstractC0406o.b(c0397f2, i2, e);
            }
            C0397f i3 = AbstractC0406o.i(c0386c2, 0);
            int e2 = c0386c2.e();
            C0387d n2 = n();
            if (n2 != null) {
                e2 = n2.f4238K.e();
            }
            if (i3 != null) {
                AbstractC0406o.b(c0397f, i3, -e2);
            }
        } else {
            C0386c c0386c3 = c0387d.f4237J;
            C0386c c0386c4 = c0387d2.f4239L;
            C0397f i4 = AbstractC0406o.i(c0386c3, 1);
            int e3 = c0386c3.e();
            C0387d m3 = m();
            if (m3 != null) {
                e3 = m3.f4237J.e();
            }
            if (i4 != null) {
                AbstractC0406o.b(c0397f2, i4, e3);
            }
            C0397f i5 = AbstractC0406o.i(c0386c4, 1);
            int e4 = c0386c4.e();
            C0387d n3 = n();
            if (n3 != null) {
                e4 = n3.f4239L.e();
            }
            if (i5 != null) {
                AbstractC0406o.b(c0397f, i5, -e4);
            }
        }
        c0397f2.f4415a = this;
        c0397f.f4415a = this;
    }

    @Override // v.AbstractC0406o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4406k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0406o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // v.AbstractC0406o
    public final void f() {
        this.f4438c = null;
        Iterator it = this.f4406k.iterator();
        while (it.hasNext()) {
            ((AbstractC0406o) it.next()).f();
        }
    }

    @Override // v.AbstractC0406o
    public final long j() {
        ArrayList arrayList = this.f4406k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f4419f + ((AbstractC0406o) arrayList.get(i)).j() + j + r5.f4442h.f4419f;
        }
        return j;
    }

    @Override // v.AbstractC0406o
    public final boolean k() {
        ArrayList arrayList = this.f4406k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0406o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0387d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4406k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0387d c0387d = ((AbstractC0406o) arrayList.get(i)).f4437b;
            if (c0387d.f4266g0 != 8) {
                return c0387d;
            }
            i++;
        }
    }

    public final C0387d n() {
        ArrayList arrayList = this.f4406k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0387d c0387d = ((AbstractC0406o) arrayList.get(size)).f4437b;
            if (c0387d.f4266g0 != 8) {
                return c0387d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4440f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f4406k.iterator();
        while (it.hasNext()) {
            AbstractC0406o abstractC0406o = (AbstractC0406o) it.next();
            sb.append("<");
            sb.append(abstractC0406o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
