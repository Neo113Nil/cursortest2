package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0292c;
import s.C0293d;
import s.C0294e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298c extends AbstractC0310o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3689k;

    /* renamed from: l, reason: collision with root package name */
    public int f3690l;

    public C0298c(C0293d c0293d, int i) {
        super(c0293d);
        C0293d c0293d2;
        this.f3689k = new ArrayList();
        this.f3722f = i;
        C0293d c0293d3 = this.f3719b;
        C0293d m2 = c0293d3.m(i);
        while (true) {
            C0293d c0293d4 = m2;
            c0293d2 = c0293d3;
            c0293d3 = c0293d4;
            if (c0293d3 == null) {
                break;
            } else {
                m2 = c0293d3.m(this.f3722f);
            }
        }
        this.f3719b = c0293d2;
        int i2 = this.f3722f;
        AbstractC0310o abstractC0310o = i2 == 0 ? c0293d2.d : i2 == 1 ? c0293d2.f3557e : null;
        ArrayList arrayList = this.f3689k;
        arrayList.add(abstractC0310o);
        C0293d l2 = c0293d2.l(this.f3722f);
        while (l2 != null) {
            int i3 = this.f3722f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3557e : null);
            l2 = l2.l(this.f3722f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0310o abstractC0310o2 = (AbstractC0310o) it.next();
            int i4 = this.f3722f;
            if (i4 == 0) {
                abstractC0310o2.f3719b.f3552b = this;
            } else if (i4 == 1) {
                abstractC0310o2.f3719b.f3554c = this;
            }
        }
        if (this.f3722f == 0 && ((C0294e) this.f3719b.f3543T).f3604v0 && arrayList.size() > 1) {
            this.f3719b = ((AbstractC0310o) arrayList.get(arrayList.size() - 1)).f3719b;
        }
        this.f3690l = this.f3722f == 0 ? this.f3719b.f3564i0 : this.f3719b.f3566j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0299d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0299d interfaceC0299d) {
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
        C0301f c0301f = this.h;
        if (c0301f.f3703j) {
            C0301f c0301f2 = this.i;
            if (c0301f2.f3703j) {
                C0293d c0293d = this.f3719b.f3543T;
                boolean z5 = c0293d instanceof C0294e ? ((C0294e) c0293d).f3604v0 : false;
                int i17 = c0301f2.f3702g - c0301f.f3702g;
                ArrayList arrayList3 = this.f3689k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0310o) arrayList3.get(i18)).f3719b.f3562g0 != 8) {
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
                    if (((AbstractC0310o) arrayList3.get(i20)).f3719b.f3562g0 != 8) {
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
                        AbstractC0310o abstractC0310o = (AbstractC0310o) arrayList3.get(i22);
                        C0293d c0293d2 = abstractC0310o.f3719b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0293d2.f3562g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0310o.h.f3701f;
                            }
                            C0302g c0302g = abstractC0310o.f3721e;
                            int i25 = c0302g.f3702g;
                            i15 = i18;
                            boolean z6 = abstractC0310o.d != 3;
                            if (z6) {
                                int i26 = this.f3722f;
                                if (i26 == 0 && !c0293d2.d.f3721e.f3703j) {
                                    return;
                                }
                                if (i26 == 1 && !c0293d2.f3557e.f3721e.f3703j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0310o.f3718a == 1 && i21 == 0) {
                                    i16 = c0302g.f3706m;
                                    i23++;
                                } else if (c0302g.f3703j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0293d2.f3568k0[this.f3722f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0310o.i.f3701f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0310o.i.f3701f;
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
                int i27 = c0301f.f3702g;
                if (z5) {
                    i27 = c0301f2.f3702g;
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
                        AbstractC0310o abstractC0310o2 = (AbstractC0310o) arrayList5.get(i29);
                        int i31 = i28;
                        C0293d c0293d3 = abstractC0310o2.f3719b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0293d3.f3562g0 != 8 && abstractC0310o2.d == 3) {
                            C0302g c0302g2 = abstractC0310o2.f3721e;
                            if (!c0302g2.f3703j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0293d3.f3568k0[this.f3722f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3722f == 0) {
                                    i13 = c0293d3.f3583v;
                                    i14 = c0293d3.f3582u;
                                } else {
                                    i13 = c0293d3.f3586y;
                                    i14 = c0293d3.f3585x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0310o2.f3718a == 1 ? Math.min(i12, c0302g2.f3706m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0302g2.d(i12);
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
                            AbstractC0310o abstractC0310o3 = (AbstractC0310o) arrayList2.get(i35);
                            if (abstractC0310o3.f3719b.f3562g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0310o3.h.f3701f;
                                }
                                i6 += abstractC0310o3.f3721e.f3702g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0310o3.i.f3701f;
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
                    if (this.f3690l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3690l = 0;
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
                    this.f3690l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3690l = i10;
                }
                int i36 = this.f3690l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0310o abstractC0310o4 = (AbstractC0310o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0310o4.f3719b.f3562g0;
                        C0301f c0301f3 = abstractC0310o4.i;
                        C0301f c0301f4 = abstractC0310o4.h;
                        if (i40 == 8) {
                            c0301f4.d(i38);
                            c0301f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0301f4.f3701f : i38 + c0301f4.f3701f;
                            }
                            if (z2) {
                                c0301f3.d(i38);
                            } else {
                                c0301f4.d(i38);
                            }
                            C0302g c0302g3 = abstractC0310o4.f3721e;
                            int i41 = c0302g3.f3702g;
                            if (abstractC0310o4.d == 3 && abstractC0310o4.f3718a == 1) {
                                i41 = c0302g3.f3706m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0301f4.d(i38);
                            } else {
                                c0301f3.d(i38);
                            }
                            abstractC0310o4.f3723g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0301f3.f3701f) : i38 + (-c0301f3.f3701f);
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
                        AbstractC0310o abstractC0310o5 = (AbstractC0310o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0310o5.f3719b.f3562g0;
                        C0301f c0301f5 = abstractC0310o5.i;
                        C0301f c0301f6 = abstractC0310o5.h;
                        if (i45 == 8) {
                            c0301f6.d(i43);
                            c0301f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0301f6.f3701f : i46 + c0301f6.f3701f;
                            }
                            if (z2) {
                                c0301f5.d(i46);
                            } else {
                                c0301f6.d(i46);
                            }
                            C0302g c0302g4 = abstractC0310o5.f3721e;
                            int i47 = c0302g4.f3702g;
                            if (abstractC0310o5.d == 3 && abstractC0310o5.f3718a == 1) {
                                i47 = Math.min(i47, c0302g4.f3706m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0301f6.d(i43);
                            } else {
                                c0301f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0301f5.f3701f) : i43 + (-c0301f5.f3701f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3722f == 0 ? this.f3719b.f3556d0 : this.f3719b.f3558e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0310o abstractC0310o6 = (AbstractC0310o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0310o6.f3719b.f3562g0;
                        C0301f c0301f7 = abstractC0310o6.i;
                        C0301f c0301f8 = abstractC0310o6.h;
                        if (i51 == 8) {
                            c0301f8.d(i49);
                            c0301f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0301f8.f3701f : i49 + c0301f8.f3701f;
                            }
                            if (z2) {
                                c0301f7.d(i49);
                            } else {
                                c0301f8.d(i49);
                            }
                            C0302g c0302g5 = abstractC0310o6.f3721e;
                            int i52 = c0302g5.f3702g;
                            if (abstractC0310o6.d == 3 && abstractC0310o6.f3718a == 1) {
                                i52 = c0302g5.f3706m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0301f8.d(i49);
                            } else {
                                c0301f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0301f7.f3701f) : i49 + (-c0301f7.f3701f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0310o
    public final void d() {
        ArrayList arrayList = this.f3689k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0310o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0293d c0293d = ((AbstractC0310o) arrayList.get(0)).f3719b;
        C0293d c0293d2 = ((AbstractC0310o) arrayList.get(size - 1)).f3719b;
        int i = this.f3722f;
        C0301f c0301f = this.i;
        C0301f c0301f2 = this.h;
        if (i == 0) {
            C0292c c0292c = c0293d.f3532I;
            C0292c c0292c2 = c0293d2.f3534K;
            C0301f i2 = AbstractC0310o.i(c0292c, 0);
            int e2 = c0292c.e();
            C0293d m2 = m();
            if (m2 != null) {
                e2 = m2.f3532I.e();
            }
            if (i2 != null) {
                AbstractC0310o.b(c0301f2, i2, e2);
            }
            C0301f i3 = AbstractC0310o.i(c0292c2, 0);
            int e3 = c0292c2.e();
            C0293d n2 = n();
            if (n2 != null) {
                e3 = n2.f3534K.e();
            }
            if (i3 != null) {
                AbstractC0310o.b(c0301f, i3, -e3);
            }
        } else {
            C0292c c0292c3 = c0293d.f3533J;
            C0292c c0292c4 = c0293d2.f3535L;
            C0301f i4 = AbstractC0310o.i(c0292c3, 1);
            int e4 = c0292c3.e();
            C0293d m3 = m();
            if (m3 != null) {
                e4 = m3.f3533J.e();
            }
            if (i4 != null) {
                AbstractC0310o.b(c0301f2, i4, e4);
            }
            C0301f i5 = AbstractC0310o.i(c0292c4, 1);
            int e5 = c0292c4.e();
            C0293d n3 = n();
            if (n3 != null) {
                e5 = n3.f3535L.e();
            }
            if (i5 != null) {
                AbstractC0310o.b(c0301f, i5, -e5);
            }
        }
        c0301f2.f3697a = this;
        c0301f.f3697a = this;
    }

    @Override // t.AbstractC0310o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3689k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0310o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0310o
    public final void f() {
        this.f3720c = null;
        Iterator it = this.f3689k.iterator();
        while (it.hasNext()) {
            ((AbstractC0310o) it.next()).f();
        }
    }

    @Override // t.AbstractC0310o
    public final long j() {
        ArrayList arrayList = this.f3689k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3701f + ((AbstractC0310o) arrayList.get(i)).j() + j2 + r5.h.f3701f;
        }
        return j2;
    }

    @Override // t.AbstractC0310o
    public final boolean k() {
        ArrayList arrayList = this.f3689k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0310o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0293d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3689k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0293d c0293d = ((AbstractC0310o) arrayList.get(i)).f3719b;
            if (c0293d.f3562g0 != 8) {
                return c0293d;
            }
            i++;
        }
    }

    public final C0293d n() {
        ArrayList arrayList = this.f3689k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0293d c0293d = ((AbstractC0310o) arrayList.get(size)).f3719b;
            if (c0293d.f3562g0 != 8) {
                return c0293d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3722f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3689k.iterator();
        while (it.hasNext()) {
            AbstractC0310o abstractC0310o = (AbstractC0310o) it.next();
            sb.append("<");
            sb.append(abstractC0310o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
