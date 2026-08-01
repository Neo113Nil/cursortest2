package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0280c;
import s.C0281d;
import s.C0282e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286c extends AbstractC0298o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3786k;

    /* renamed from: l, reason: collision with root package name */
    public int f3787l;

    public C0286c(C0281d c0281d, int i) {
        super(c0281d);
        C0281d c0281d2;
        this.f3786k = new ArrayList();
        this.f3819f = i;
        C0281d c0281d3 = this.f3816b;
        C0281d m2 = c0281d3.m(i);
        while (true) {
            C0281d c0281d4 = m2;
            c0281d2 = c0281d3;
            c0281d3 = c0281d4;
            if (c0281d3 == null) {
                break;
            } else {
                m2 = c0281d3.m(this.f3819f);
            }
        }
        this.f3816b = c0281d2;
        int i2 = this.f3819f;
        AbstractC0298o abstractC0298o = i2 == 0 ? c0281d2.d : i2 == 1 ? c0281d2.f3635e : null;
        ArrayList arrayList = this.f3786k;
        arrayList.add(abstractC0298o);
        C0281d l2 = c0281d2.l(this.f3819f);
        while (l2 != null) {
            int i3 = this.f3819f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3635e : null);
            l2 = l2.l(this.f3819f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0298o abstractC0298o2 = (AbstractC0298o) it.next();
            int i4 = this.f3819f;
            if (i4 == 0) {
                abstractC0298o2.f3816b.f3630b = this;
            } else if (i4 == 1) {
                abstractC0298o2.f3816b.f3632c = this;
            }
        }
        if (this.f3819f == 0 && ((C0282e) this.f3816b.f3621T).f3680v0 && arrayList.size() > 1) {
            this.f3816b = ((AbstractC0298o) arrayList.get(arrayList.size() - 1)).f3816b;
        }
        this.f3787l = this.f3819f == 0 ? this.f3816b.f3642i0 : this.f3816b.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0287d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0287d interfaceC0287d) {
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
        C0289f c0289f = this.h;
        if (c0289f.f3800j) {
            C0289f c0289f2 = this.i;
            if (c0289f2.f3800j) {
                C0281d c0281d = this.f3816b.f3621T;
                boolean z5 = c0281d instanceof C0282e ? ((C0282e) c0281d).f3680v0 : false;
                int i17 = c0289f2.f3799g - c0289f.f3799g;
                ArrayList arrayList3 = this.f3786k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0298o) arrayList3.get(i18)).f3816b.f3640g0 != 8) {
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
                    if (((AbstractC0298o) arrayList3.get(i20)).f3816b.f3640g0 != 8) {
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
                        AbstractC0298o abstractC0298o = (AbstractC0298o) arrayList3.get(i22);
                        C0281d c0281d2 = abstractC0298o.f3816b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0281d2.f3640g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0298o.h.f3798f;
                            }
                            C0290g c0290g = abstractC0298o.f3818e;
                            int i25 = c0290g.f3799g;
                            i15 = i18;
                            boolean z6 = abstractC0298o.d != 3;
                            if (z6) {
                                int i26 = this.f3819f;
                                if (i26 == 0 && !c0281d2.d.f3818e.f3800j) {
                                    return;
                                }
                                if (i26 == 1 && !c0281d2.f3635e.f3818e.f3800j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0298o.f3815a == 1 && i21 == 0) {
                                    i16 = c0290g.f3803m;
                                    i23++;
                                } else if (c0290g.f3800j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0281d2.f3645k0[this.f3819f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0298o.i.f3798f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0298o.i.f3798f;
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
                int i27 = c0289f.f3799g;
                if (z5) {
                    i27 = c0289f2.f3799g;
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
                        AbstractC0298o abstractC0298o2 = (AbstractC0298o) arrayList5.get(i29);
                        int i31 = i28;
                        C0281d c0281d3 = abstractC0298o2.f3816b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0281d3.f3640g0 != 8 && abstractC0298o2.d == 3) {
                            C0290g c0290g2 = abstractC0298o2.f3818e;
                            if (!c0290g2.f3800j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0281d3.f3645k0[this.f3819f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3819f == 0) {
                                    i13 = c0281d3.f3660v;
                                    i14 = c0281d3.f3659u;
                                } else {
                                    i13 = c0281d3.f3663y;
                                    i14 = c0281d3.f3662x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0298o2.f3815a == 1 ? Math.min(i12, c0290g2.f3803m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0290g2.d(i12);
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
                            AbstractC0298o abstractC0298o3 = (AbstractC0298o) arrayList2.get(i35);
                            if (abstractC0298o3.f3816b.f3640g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0298o3.h.f3798f;
                                }
                                i6 += abstractC0298o3.f3818e.f3799g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0298o3.i.f3798f;
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
                    if (this.f3787l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3787l = 0;
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
                    this.f3787l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3787l = i10;
                }
                int i36 = this.f3787l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0298o abstractC0298o4 = (AbstractC0298o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0298o4.f3816b.f3640g0;
                        C0289f c0289f3 = abstractC0298o4.i;
                        C0289f c0289f4 = abstractC0298o4.h;
                        if (i40 == 8) {
                            c0289f4.d(i38);
                            c0289f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0289f4.f3798f : i38 + c0289f4.f3798f;
                            }
                            if (z2) {
                                c0289f3.d(i38);
                            } else {
                                c0289f4.d(i38);
                            }
                            C0290g c0290g3 = abstractC0298o4.f3818e;
                            int i41 = c0290g3.f3799g;
                            if (abstractC0298o4.d == 3 && abstractC0298o4.f3815a == 1) {
                                i41 = c0290g3.f3803m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0289f4.d(i38);
                            } else {
                                c0289f3.d(i38);
                            }
                            abstractC0298o4.f3820g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0289f3.f3798f) : i38 + (-c0289f3.f3798f);
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
                        AbstractC0298o abstractC0298o5 = (AbstractC0298o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0298o5.f3816b.f3640g0;
                        C0289f c0289f5 = abstractC0298o5.i;
                        C0289f c0289f6 = abstractC0298o5.h;
                        if (i45 == 8) {
                            c0289f6.d(i43);
                            c0289f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0289f6.f3798f : i46 + c0289f6.f3798f;
                            }
                            if (z2) {
                                c0289f5.d(i46);
                            } else {
                                c0289f6.d(i46);
                            }
                            C0290g c0290g4 = abstractC0298o5.f3818e;
                            int i47 = c0290g4.f3799g;
                            if (abstractC0298o5.d == 3 && abstractC0298o5.f3815a == 1) {
                                i47 = Math.min(i47, c0290g4.f3803m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0289f6.d(i43);
                            } else {
                                c0289f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0289f5.f3798f) : i43 + (-c0289f5.f3798f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3819f == 0 ? this.f3816b.f3634d0 : this.f3816b.f3636e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0298o abstractC0298o6 = (AbstractC0298o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0298o6.f3816b.f3640g0;
                        C0289f c0289f7 = abstractC0298o6.i;
                        C0289f c0289f8 = abstractC0298o6.h;
                        if (i51 == 8) {
                            c0289f8.d(i49);
                            c0289f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0289f8.f3798f : i49 + c0289f8.f3798f;
                            }
                            if (z2) {
                                c0289f7.d(i49);
                            } else {
                                c0289f8.d(i49);
                            }
                            C0290g c0290g5 = abstractC0298o6.f3818e;
                            int i52 = c0290g5.f3799g;
                            if (abstractC0298o6.d == 3 && abstractC0298o6.f3815a == 1) {
                                i52 = c0290g5.f3803m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0289f8.d(i49);
                            } else {
                                c0289f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0289f7.f3798f) : i49 + (-c0289f7.f3798f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0298o
    public final void d() {
        ArrayList arrayList = this.f3786k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0298o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0281d c0281d = ((AbstractC0298o) arrayList.get(0)).f3816b;
        C0281d c0281d2 = ((AbstractC0298o) arrayList.get(size - 1)).f3816b;
        int i = this.f3819f;
        C0289f c0289f = this.i;
        C0289f c0289f2 = this.h;
        if (i == 0) {
            C0280c c0280c = c0281d.f3610I;
            C0280c c0280c2 = c0281d2.f3612K;
            C0289f i2 = AbstractC0298o.i(c0280c, 0);
            int e2 = c0280c.e();
            C0281d m2 = m();
            if (m2 != null) {
                e2 = m2.f3610I.e();
            }
            if (i2 != null) {
                AbstractC0298o.b(c0289f2, i2, e2);
            }
            C0289f i3 = AbstractC0298o.i(c0280c2, 0);
            int e3 = c0280c2.e();
            C0281d n2 = n();
            if (n2 != null) {
                e3 = n2.f3612K.e();
            }
            if (i3 != null) {
                AbstractC0298o.b(c0289f, i3, -e3);
            }
        } else {
            C0280c c0280c3 = c0281d.f3611J;
            C0280c c0280c4 = c0281d2.f3613L;
            C0289f i4 = AbstractC0298o.i(c0280c3, 1);
            int e4 = c0280c3.e();
            C0281d m3 = m();
            if (m3 != null) {
                e4 = m3.f3611J.e();
            }
            if (i4 != null) {
                AbstractC0298o.b(c0289f2, i4, e4);
            }
            C0289f i5 = AbstractC0298o.i(c0280c4, 1);
            int e5 = c0280c4.e();
            C0281d n3 = n();
            if (n3 != null) {
                e5 = n3.f3613L.e();
            }
            if (i5 != null) {
                AbstractC0298o.b(c0289f, i5, -e5);
            }
        }
        c0289f2.f3794a = this;
        c0289f.f3794a = this;
    }

    @Override // t.AbstractC0298o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3786k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0298o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0298o
    public final void f() {
        this.f3817c = null;
        Iterator it = this.f3786k.iterator();
        while (it.hasNext()) {
            ((AbstractC0298o) it.next()).f();
        }
    }

    @Override // t.AbstractC0298o
    public final long j() {
        ArrayList arrayList = this.f3786k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3798f + ((AbstractC0298o) arrayList.get(i)).j() + j2 + r5.h.f3798f;
        }
        return j2;
    }

    @Override // t.AbstractC0298o
    public final boolean k() {
        ArrayList arrayList = this.f3786k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0298o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0281d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3786k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0281d c0281d = ((AbstractC0298o) arrayList.get(i)).f3816b;
            if (c0281d.f3640g0 != 8) {
                return c0281d;
            }
            i++;
        }
    }

    public final C0281d n() {
        ArrayList arrayList = this.f3786k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0281d c0281d = ((AbstractC0298o) arrayList.get(size)).f3816b;
            if (c0281d.f3640g0 != 8) {
                return c0281d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3819f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3786k.iterator();
        while (it.hasNext()) {
            AbstractC0298o abstractC0298o = (AbstractC0298o) it.next();
            sb.append("<");
            sb.append(abstractC0298o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
