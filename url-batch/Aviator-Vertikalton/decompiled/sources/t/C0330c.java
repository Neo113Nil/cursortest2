package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0324c;
import s.C0325d;
import s.C0326e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330c extends AbstractC0342o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4159k;

    /* renamed from: l, reason: collision with root package name */
    public int f4160l;

    public C0330c(C0325d c0325d, int i) {
        super(c0325d);
        C0325d c0325d2;
        this.f4159k = new ArrayList();
        this.f4196f = i;
        C0325d c0325d3 = this.f4192b;
        C0325d m2 = c0325d3.m(i);
        while (true) {
            C0325d c0325d4 = m2;
            c0325d2 = c0325d3;
            c0325d3 = c0325d4;
            if (c0325d3 == null) {
                break;
            } else {
                m2 = c0325d3.m(this.f4196f);
            }
        }
        this.f4192b = c0325d2;
        int i2 = this.f4196f;
        AbstractC0342o abstractC0342o = i2 == 0 ? c0325d2.f4036d : i2 == 1 ? c0325d2.f4038e : null;
        ArrayList arrayList = this.f4159k;
        arrayList.add(abstractC0342o);
        C0325d l2 = c0325d2.l(this.f4196f);
        while (l2 != null) {
            int i3 = this.f4196f;
            arrayList.add(i3 == 0 ? l2.f4036d : i3 == 1 ? l2.f4038e : null);
            l2 = l2.l(this.f4196f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0342o abstractC0342o2 = (AbstractC0342o) it.next();
            int i4 = this.f4196f;
            if (i4 == 0) {
                abstractC0342o2.f4192b.f4032b = this;
            } else if (i4 == 1) {
                abstractC0342o2.f4192b.f4034c = this;
            }
        }
        if (this.f4196f == 0 && ((C0326e) this.f4192b.f4023T).f4084v0 && arrayList.size() > 1) {
            this.f4192b = ((AbstractC0342o) arrayList.get(arrayList.size() - 1)).f4192b;
        }
        this.f4160l = this.f4196f == 0 ? this.f4192b.i0 : this.f4192b.f4046j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0331d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0331d interfaceC0331d) {
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
        C0333f c0333f = this.h;
        if (c0333f.f4175j) {
            C0333f c0333f2 = this.i;
            if (c0333f2.f4175j) {
                C0325d c0325d = this.f4192b.f4023T;
                boolean z5 = c0325d instanceof C0326e ? ((C0326e) c0325d).f4084v0 : false;
                int i17 = c0333f2.f4174g - c0333f.f4174g;
                ArrayList arrayList3 = this.f4159k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0342o) arrayList3.get(i18)).f4192b.f4043g0 != 8) {
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
                    if (((AbstractC0342o) arrayList3.get(i20)).f4192b.f4043g0 != 8) {
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
                        AbstractC0342o abstractC0342o = (AbstractC0342o) arrayList3.get(i22);
                        C0325d c0325d2 = abstractC0342o.f4192b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0325d2.f4043g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0342o.h.f4173f;
                            }
                            C0334g c0334g = abstractC0342o.f4195e;
                            int i25 = c0334g.f4174g;
                            i15 = i18;
                            boolean z6 = abstractC0342o.f4194d != 3;
                            if (z6) {
                                int i26 = this.f4196f;
                                if (i26 == 0 && !c0325d2.f4036d.f4195e.f4175j) {
                                    return;
                                }
                                if (i26 == 1 && !c0325d2.f4038e.f4195e.f4175j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0342o.f4191a == 1 && i21 == 0) {
                                    i16 = c0334g.f4178m;
                                    i23++;
                                } else if (c0334g.f4175j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0325d2.f4048k0[this.f4196f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0342o.i.f4173f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0342o.i.f4173f;
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
                int i27 = c0333f.f4174g;
                if (z5) {
                    i27 = c0333f2.f4174g;
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
                        AbstractC0342o abstractC0342o2 = (AbstractC0342o) arrayList5.get(i29);
                        int i31 = i28;
                        C0325d c0325d3 = abstractC0342o2.f4192b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0325d3.f4043g0 != 8 && abstractC0342o2.f4194d == 3) {
                            C0334g c0334g2 = abstractC0342o2.f4195e;
                            if (!c0334g2.f4175j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0325d3.f4048k0[this.f4196f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f4196f == 0) {
                                    i13 = c0325d3.f4063v;
                                    i14 = c0325d3.f4062u;
                                } else {
                                    i13 = c0325d3.f4066y;
                                    i14 = c0325d3.f4065x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0342o2.f4191a == 1 ? Math.min(i12, c0334g2.f4178m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0334g2.d(i12);
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
                            AbstractC0342o abstractC0342o3 = (AbstractC0342o) arrayList2.get(i35);
                            if (abstractC0342o3.f4192b.f4043g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0342o3.h.f4173f;
                                }
                                i6 += abstractC0342o3.f4195e.f4174g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0342o3.i.f4173f;
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
                    if (this.f4160l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f4160l = 0;
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
                    this.f4160l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f4160l = i10;
                }
                int i36 = this.f4160l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0342o abstractC0342o4 = (AbstractC0342o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0342o4.f4192b.f4043g0;
                        C0333f c0333f3 = abstractC0342o4.i;
                        C0333f c0333f4 = abstractC0342o4.h;
                        if (i40 == 8) {
                            c0333f4.d(i38);
                            c0333f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0333f4.f4173f : i38 + c0333f4.f4173f;
                            }
                            if (z2) {
                                c0333f3.d(i38);
                            } else {
                                c0333f4.d(i38);
                            }
                            C0334g c0334g3 = abstractC0342o4.f4195e;
                            int i41 = c0334g3.f4174g;
                            if (abstractC0342o4.f4194d == 3 && abstractC0342o4.f4191a == 1) {
                                i41 = c0334g3.f4178m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0333f4.d(i38);
                            } else {
                                c0333f3.d(i38);
                            }
                            abstractC0342o4.f4197g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0333f3.f4173f) : i38 + (-c0333f3.f4173f);
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
                        AbstractC0342o abstractC0342o5 = (AbstractC0342o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0342o5.f4192b.f4043g0;
                        C0333f c0333f5 = abstractC0342o5.i;
                        C0333f c0333f6 = abstractC0342o5.h;
                        if (i45 == 8) {
                            c0333f6.d(i43);
                            c0333f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0333f6.f4173f : i46 + c0333f6.f4173f;
                            }
                            if (z2) {
                                c0333f5.d(i46);
                            } else {
                                c0333f6.d(i46);
                            }
                            C0334g c0334g4 = abstractC0342o5.f4195e;
                            int i47 = c0334g4.f4174g;
                            if (abstractC0342o5.f4194d == 3 && abstractC0342o5.f4191a == 1) {
                                i47 = Math.min(i47, c0334g4.f4178m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0333f6.d(i43);
                            } else {
                                c0333f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0333f5.f4173f) : i43 + (-c0333f5.f4173f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f4196f == 0 ? this.f4192b.f4037d0 : this.f4192b.f4039e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0342o abstractC0342o6 = (AbstractC0342o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0342o6.f4192b.f4043g0;
                        C0333f c0333f7 = abstractC0342o6.i;
                        C0333f c0333f8 = abstractC0342o6.h;
                        if (i51 == 8) {
                            c0333f8.d(i49);
                            c0333f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0333f8.f4173f : i49 + c0333f8.f4173f;
                            }
                            if (z2) {
                                c0333f7.d(i49);
                            } else {
                                c0333f8.d(i49);
                            }
                            C0334g c0334g5 = abstractC0342o6.f4195e;
                            int i52 = c0334g5.f4174g;
                            if (abstractC0342o6.f4194d == 3 && abstractC0342o6.f4191a == 1) {
                                i52 = c0334g5.f4178m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0333f8.d(i49);
                            } else {
                                c0333f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0333f7.f4173f) : i49 + (-c0333f7.f4173f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0342o
    public final void d() {
        ArrayList arrayList = this.f4159k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0342o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0325d c0325d = ((AbstractC0342o) arrayList.get(0)).f4192b;
        C0325d c0325d2 = ((AbstractC0342o) arrayList.get(size - 1)).f4192b;
        int i = this.f4196f;
        C0333f c0333f = this.i;
        C0333f c0333f2 = this.h;
        if (i == 0) {
            C0324c c0324c = c0325d.f4012I;
            C0324c c0324c2 = c0325d2.f4014K;
            C0333f i2 = AbstractC0342o.i(c0324c, 0);
            int e2 = c0324c.e();
            C0325d m2 = m();
            if (m2 != null) {
                e2 = m2.f4012I.e();
            }
            if (i2 != null) {
                AbstractC0342o.b(c0333f2, i2, e2);
            }
            C0333f i3 = AbstractC0342o.i(c0324c2, 0);
            int e3 = c0324c2.e();
            C0325d n2 = n();
            if (n2 != null) {
                e3 = n2.f4014K.e();
            }
            if (i3 != null) {
                AbstractC0342o.b(c0333f, i3, -e3);
            }
        } else {
            C0324c c0324c3 = c0325d.f4013J;
            C0324c c0324c4 = c0325d2.f4015L;
            C0333f i4 = AbstractC0342o.i(c0324c3, 1);
            int e4 = c0324c3.e();
            C0325d m3 = m();
            if (m3 != null) {
                e4 = m3.f4013J.e();
            }
            if (i4 != null) {
                AbstractC0342o.b(c0333f2, i4, e4);
            }
            C0333f i5 = AbstractC0342o.i(c0324c4, 1);
            int e5 = c0324c4.e();
            C0325d n3 = n();
            if (n3 != null) {
                e5 = n3.f4015L.e();
            }
            if (i5 != null) {
                AbstractC0342o.b(c0333f, i5, -e5);
            }
        }
        c0333f2.f4168a = this;
        c0333f.f4168a = this;
    }

    @Override // t.AbstractC0342o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4159k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0342o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0342o
    public final void f() {
        this.f4193c = null;
        Iterator it = this.f4159k.iterator();
        while (it.hasNext()) {
            ((AbstractC0342o) it.next()).f();
        }
    }

    @Override // t.AbstractC0342o
    public final long j() {
        ArrayList arrayList = this.f4159k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f4173f + ((AbstractC0342o) arrayList.get(i)).j() + j2 + r5.h.f4173f;
        }
        return j2;
    }

    @Override // t.AbstractC0342o
    public final boolean k() {
        ArrayList arrayList = this.f4159k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0342o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0325d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4159k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0325d c0325d = ((AbstractC0342o) arrayList.get(i)).f4192b;
            if (c0325d.f4043g0 != 8) {
                return c0325d;
            }
            i++;
        }
    }

    public final C0325d n() {
        ArrayList arrayList = this.f4159k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0325d c0325d = ((AbstractC0342o) arrayList.get(size)).f4192b;
            if (c0325d.f4043g0 != 8) {
                return c0325d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4196f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f4159k.iterator();
        while (it.hasNext()) {
            AbstractC0342o abstractC0342o = (AbstractC0342o) it.next();
            sb.append("<");
            sb.append(abstractC0342o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
