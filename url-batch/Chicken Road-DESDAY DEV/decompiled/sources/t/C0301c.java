package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0295c;
import s.C0296d;
import s.C0297e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301c extends AbstractC0313o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3709k;

    /* renamed from: l, reason: collision with root package name */
    public int f3710l;

    public C0301c(C0296d c0296d, int i) {
        super(c0296d);
        C0296d c0296d2;
        this.f3709k = new ArrayList();
        this.f3742f = i;
        C0296d c0296d3 = this.f3739b;
        C0296d m2 = c0296d3.m(i);
        while (true) {
            C0296d c0296d4 = m2;
            c0296d2 = c0296d3;
            c0296d3 = c0296d4;
            if (c0296d3 == null) {
                break;
            } else {
                m2 = c0296d3.m(this.f3742f);
            }
        }
        this.f3739b = c0296d2;
        int i2 = this.f3742f;
        AbstractC0313o abstractC0313o = i2 == 0 ? c0296d2.d : i2 == 1 ? c0296d2.f3581e : null;
        ArrayList arrayList = this.f3709k;
        arrayList.add(abstractC0313o);
        C0296d l2 = c0296d2.l(this.f3742f);
        while (l2 != null) {
            int i3 = this.f3742f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3581e : null);
            l2 = l2.l(this.f3742f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0313o abstractC0313o2 = (AbstractC0313o) it.next();
            int i4 = this.f3742f;
            if (i4 == 0) {
                abstractC0313o2.f3739b.f3576b = this;
            } else if (i4 == 1) {
                abstractC0313o2.f3739b.f3578c = this;
            }
        }
        if (this.f3742f == 0 && ((C0297e) this.f3739b.f3567T).f3628v0 && arrayList.size() > 1) {
            this.f3739b = ((AbstractC0313o) arrayList.get(arrayList.size() - 1)).f3739b;
        }
        this.f3710l = this.f3742f == 0 ? this.f3739b.f3588i0 : this.f3739b.f3590j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0302d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0302d interfaceC0302d) {
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
        C0304f c0304f = this.h;
        if (c0304f.f3723j) {
            C0304f c0304f2 = this.i;
            if (c0304f2.f3723j) {
                C0296d c0296d = this.f3739b.f3567T;
                boolean z5 = c0296d instanceof C0297e ? ((C0297e) c0296d).f3628v0 : false;
                int i17 = c0304f2.f3722g - c0304f.f3722g;
                ArrayList arrayList3 = this.f3709k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0313o) arrayList3.get(i18)).f3739b.f3586g0 != 8) {
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
                    if (((AbstractC0313o) arrayList3.get(i20)).f3739b.f3586g0 != 8) {
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
                        AbstractC0313o abstractC0313o = (AbstractC0313o) arrayList3.get(i22);
                        C0296d c0296d2 = abstractC0313o.f3739b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0296d2.f3586g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0313o.h.f3721f;
                            }
                            C0305g c0305g = abstractC0313o.f3741e;
                            int i25 = c0305g.f3722g;
                            i15 = i18;
                            boolean z6 = abstractC0313o.d != 3;
                            if (z6) {
                                int i26 = this.f3742f;
                                if (i26 == 0 && !c0296d2.d.f3741e.f3723j) {
                                    return;
                                }
                                if (i26 == 1 && !c0296d2.f3581e.f3741e.f3723j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0313o.f3738a == 1 && i21 == 0) {
                                    i16 = c0305g.f3726m;
                                    i23++;
                                } else if (c0305g.f3723j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0296d2.f3592k0[this.f3742f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0313o.i.f3721f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0313o.i.f3721f;
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
                int i27 = c0304f.f3722g;
                if (z5) {
                    i27 = c0304f2.f3722g;
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
                        AbstractC0313o abstractC0313o2 = (AbstractC0313o) arrayList5.get(i29);
                        int i31 = i28;
                        C0296d c0296d3 = abstractC0313o2.f3739b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0296d3.f3586g0 != 8 && abstractC0313o2.d == 3) {
                            C0305g c0305g2 = abstractC0313o2.f3741e;
                            if (!c0305g2.f3723j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0296d3.f3592k0[this.f3742f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3742f == 0) {
                                    i13 = c0296d3.f3607v;
                                    i14 = c0296d3.f3606u;
                                } else {
                                    i13 = c0296d3.f3610y;
                                    i14 = c0296d3.f3609x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0313o2.f3738a == 1 ? Math.min(i12, c0305g2.f3726m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0305g2.d(i12);
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
                            AbstractC0313o abstractC0313o3 = (AbstractC0313o) arrayList2.get(i35);
                            if (abstractC0313o3.f3739b.f3586g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0313o3.h.f3721f;
                                }
                                i6 += abstractC0313o3.f3741e.f3722g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0313o3.i.f3721f;
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
                    if (this.f3710l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3710l = 0;
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
                    this.f3710l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3710l = i10;
                }
                int i36 = this.f3710l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0313o abstractC0313o4 = (AbstractC0313o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0313o4.f3739b.f3586g0;
                        C0304f c0304f3 = abstractC0313o4.i;
                        C0304f c0304f4 = abstractC0313o4.h;
                        if (i40 == 8) {
                            c0304f4.d(i38);
                            c0304f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0304f4.f3721f : i38 + c0304f4.f3721f;
                            }
                            if (z2) {
                                c0304f3.d(i38);
                            } else {
                                c0304f4.d(i38);
                            }
                            C0305g c0305g3 = abstractC0313o4.f3741e;
                            int i41 = c0305g3.f3722g;
                            if (abstractC0313o4.d == 3 && abstractC0313o4.f3738a == 1) {
                                i41 = c0305g3.f3726m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0304f4.d(i38);
                            } else {
                                c0304f3.d(i38);
                            }
                            abstractC0313o4.f3743g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0304f3.f3721f) : i38 + (-c0304f3.f3721f);
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
                        AbstractC0313o abstractC0313o5 = (AbstractC0313o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0313o5.f3739b.f3586g0;
                        C0304f c0304f5 = abstractC0313o5.i;
                        C0304f c0304f6 = abstractC0313o5.h;
                        if (i45 == 8) {
                            c0304f6.d(i43);
                            c0304f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0304f6.f3721f : i46 + c0304f6.f3721f;
                            }
                            if (z2) {
                                c0304f5.d(i46);
                            } else {
                                c0304f6.d(i46);
                            }
                            C0305g c0305g4 = abstractC0313o5.f3741e;
                            int i47 = c0305g4.f3722g;
                            if (abstractC0313o5.d == 3 && abstractC0313o5.f3738a == 1) {
                                i47 = Math.min(i47, c0305g4.f3726m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0304f6.d(i43);
                            } else {
                                c0304f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0304f5.f3721f) : i43 + (-c0304f5.f3721f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3742f == 0 ? this.f3739b.f3580d0 : this.f3739b.f3582e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0313o abstractC0313o6 = (AbstractC0313o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0313o6.f3739b.f3586g0;
                        C0304f c0304f7 = abstractC0313o6.i;
                        C0304f c0304f8 = abstractC0313o6.h;
                        if (i51 == 8) {
                            c0304f8.d(i49);
                            c0304f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0304f8.f3721f : i49 + c0304f8.f3721f;
                            }
                            if (z2) {
                                c0304f7.d(i49);
                            } else {
                                c0304f8.d(i49);
                            }
                            C0305g c0305g5 = abstractC0313o6.f3741e;
                            int i52 = c0305g5.f3722g;
                            if (abstractC0313o6.d == 3 && abstractC0313o6.f3738a == 1) {
                                i52 = c0305g5.f3726m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0304f8.d(i49);
                            } else {
                                c0304f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0304f7.f3721f) : i49 + (-c0304f7.f3721f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        ArrayList arrayList = this.f3709k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0313o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0296d c0296d = ((AbstractC0313o) arrayList.get(0)).f3739b;
        C0296d c0296d2 = ((AbstractC0313o) arrayList.get(size - 1)).f3739b;
        int i = this.f3742f;
        C0304f c0304f = this.i;
        C0304f c0304f2 = this.h;
        if (i == 0) {
            C0295c c0295c = c0296d.f3556I;
            C0295c c0295c2 = c0296d2.f3558K;
            C0304f i2 = AbstractC0313o.i(c0295c, 0);
            int e2 = c0295c.e();
            C0296d m2 = m();
            if (m2 != null) {
                e2 = m2.f3556I.e();
            }
            if (i2 != null) {
                AbstractC0313o.b(c0304f2, i2, e2);
            }
            C0304f i3 = AbstractC0313o.i(c0295c2, 0);
            int e3 = c0295c2.e();
            C0296d n2 = n();
            if (n2 != null) {
                e3 = n2.f3558K.e();
            }
            if (i3 != null) {
                AbstractC0313o.b(c0304f, i3, -e3);
            }
        } else {
            C0295c c0295c3 = c0296d.f3557J;
            C0295c c0295c4 = c0296d2.f3559L;
            C0304f i4 = AbstractC0313o.i(c0295c3, 1);
            int e4 = c0295c3.e();
            C0296d m3 = m();
            if (m3 != null) {
                e4 = m3.f3557J.e();
            }
            if (i4 != null) {
                AbstractC0313o.b(c0304f2, i4, e4);
            }
            C0304f i5 = AbstractC0313o.i(c0295c4, 1);
            int e5 = c0295c4.e();
            C0296d n3 = n();
            if (n3 != null) {
                e5 = n3.f3559L.e();
            }
            if (i5 != null) {
                AbstractC0313o.b(c0304f, i5, -e5);
            }
        }
        c0304f2.f3717a = this;
        c0304f.f3717a = this;
    }

    @Override // t.AbstractC0313o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3709k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0313o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.f3740c = null;
        Iterator it = this.f3709k.iterator();
        while (it.hasNext()) {
            ((AbstractC0313o) it.next()).f();
        }
    }

    @Override // t.AbstractC0313o
    public final long j() {
        ArrayList arrayList = this.f3709k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3721f + ((AbstractC0313o) arrayList.get(i)).j() + j2 + r5.h.f3721f;
        }
        return j2;
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        ArrayList arrayList = this.f3709k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0313o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0296d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3709k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0296d c0296d = ((AbstractC0313o) arrayList.get(i)).f3739b;
            if (c0296d.f3586g0 != 8) {
                return c0296d;
            }
            i++;
        }
    }

    public final C0296d n() {
        ArrayList arrayList = this.f3709k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0296d c0296d = ((AbstractC0313o) arrayList.get(size)).f3739b;
            if (c0296d.f3586g0 != 8) {
                return c0296d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3742f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3709k.iterator();
        while (it.hasNext()) {
            AbstractC0313o abstractC0313o = (AbstractC0313o) it.next();
            sb.append("<");
            sb.append(abstractC0313o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
