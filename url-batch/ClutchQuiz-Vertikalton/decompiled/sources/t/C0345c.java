package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0339c;
import s.C0340d;
import s.C0341e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345c extends AbstractC0358p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3682k;

    /* renamed from: l, reason: collision with root package name */
    public int f3683l;

    public C0345c(C0340d c0340d, int i) {
        super(c0340d);
        C0340d c0340d2;
        this.f3682k = new ArrayList();
        this.f3715f = i;
        C0340d c0340d3 = this.f3712b;
        C0340d m2 = c0340d3.m(i);
        while (true) {
            C0340d c0340d4 = m2;
            c0340d2 = c0340d3;
            c0340d3 = c0340d4;
            if (c0340d3 == null) {
                break;
            } else {
                m2 = c0340d3.m(this.f3715f);
            }
        }
        this.f3712b = c0340d2;
        int i2 = this.f3715f;
        AbstractC0358p abstractC0358p = i2 == 0 ? c0340d2.d : i2 == 1 ? c0340d2.f3529e : null;
        ArrayList arrayList = this.f3682k;
        arrayList.add(abstractC0358p);
        C0340d l2 = c0340d2.l(this.f3715f);
        while (l2 != null) {
            int i3 = this.f3715f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3529e : null);
            l2 = l2.l(this.f3715f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0358p abstractC0358p2 = (AbstractC0358p) it.next();
            int i4 = this.f3715f;
            if (i4 == 0) {
                abstractC0358p2.f3712b.f3524b = this;
            } else if (i4 == 1) {
                abstractC0358p2.f3712b.f3526c = this;
            }
        }
        if (this.f3715f == 0 && ((C0341e) this.f3712b.f3515T).f3574v0 && arrayList.size() > 1) {
            this.f3712b = ((AbstractC0358p) arrayList.get(arrayList.size() - 1)).f3712b;
        }
        this.f3683l = this.f3715f == 0 ? this.f3712b.f3536i0 : this.f3712b.f3538j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0346d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0346d interfaceC0346d) {
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
        C0348f c0348f = this.h;
        if (c0348f.f3696j) {
            C0348f c0348f2 = this.i;
            if (c0348f2.f3696j) {
                C0340d c0340d = this.f3712b.f3515T;
                boolean z5 = c0340d instanceof C0341e ? ((C0341e) c0340d).f3574v0 : false;
                int i17 = c0348f2.f3695g - c0348f.f3695g;
                ArrayList arrayList3 = this.f3682k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0358p) arrayList3.get(i18)).f3712b.f3534g0 != 8) {
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
                    if (((AbstractC0358p) arrayList3.get(i20)).f3712b.f3534g0 != 8) {
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
                        AbstractC0358p abstractC0358p = (AbstractC0358p) arrayList3.get(i22);
                        C0340d c0340d2 = abstractC0358p.f3712b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0340d2.f3534g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0358p.h.f3694f;
                            }
                            C0349g c0349g = abstractC0358p.f3714e;
                            int i25 = c0349g.f3695g;
                            i15 = i18;
                            boolean z6 = abstractC0358p.d != 3;
                            if (z6) {
                                int i26 = this.f3715f;
                                if (i26 == 0 && !c0340d2.d.f3714e.f3696j) {
                                    return;
                                }
                                if (i26 == 1 && !c0340d2.f3529e.f3714e.f3696j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0358p.f3711a == 1 && i21 == 0) {
                                    i16 = c0349g.f3699m;
                                    i23++;
                                } else if (c0349g.f3696j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0340d2.f3540k0[this.f3715f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0358p.i.f3694f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0358p.i.f3694f;
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
                int i27 = c0348f.f3695g;
                if (z5) {
                    i27 = c0348f2.f3695g;
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
                        AbstractC0358p abstractC0358p2 = (AbstractC0358p) arrayList5.get(i29);
                        int i31 = i28;
                        C0340d c0340d3 = abstractC0358p2.f3712b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0340d3.f3534g0 != 8 && abstractC0358p2.d == 3) {
                            C0349g c0349g2 = abstractC0358p2.f3714e;
                            if (!c0349g2.f3696j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0340d3.f3540k0[this.f3715f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3715f == 0) {
                                    i13 = c0340d3.f3555v;
                                    i14 = c0340d3.f3554u;
                                } else {
                                    i13 = c0340d3.f3558y;
                                    i14 = c0340d3.f3557x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0358p2.f3711a == 1 ? Math.min(i12, c0349g2.f3699m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0349g2.d(i12);
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
                            AbstractC0358p abstractC0358p3 = (AbstractC0358p) arrayList2.get(i35);
                            if (abstractC0358p3.f3712b.f3534g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0358p3.h.f3694f;
                                }
                                i6 += abstractC0358p3.f3714e.f3695g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0358p3.i.f3694f;
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
                    if (this.f3683l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3683l = 0;
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
                    this.f3683l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3683l = i10;
                }
                int i36 = this.f3683l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0358p abstractC0358p4 = (AbstractC0358p) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0358p4.f3712b.f3534g0;
                        C0348f c0348f3 = abstractC0358p4.i;
                        C0348f c0348f4 = abstractC0358p4.h;
                        if (i40 == 8) {
                            c0348f4.d(i38);
                            c0348f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0348f4.f3694f : i38 + c0348f4.f3694f;
                            }
                            if (z2) {
                                c0348f3.d(i38);
                            } else {
                                c0348f4.d(i38);
                            }
                            C0349g c0349g3 = abstractC0358p4.f3714e;
                            int i41 = c0349g3.f3695g;
                            if (abstractC0358p4.d == 3 && abstractC0358p4.f3711a == 1) {
                                i41 = c0349g3.f3699m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0348f4.d(i38);
                            } else {
                                c0348f3.d(i38);
                            }
                            abstractC0358p4.f3716g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0348f3.f3694f) : i38 + (-c0348f3.f3694f);
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
                        AbstractC0358p abstractC0358p5 = (AbstractC0358p) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0358p5.f3712b.f3534g0;
                        C0348f c0348f5 = abstractC0358p5.i;
                        C0348f c0348f6 = abstractC0358p5.h;
                        if (i45 == 8) {
                            c0348f6.d(i43);
                            c0348f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0348f6.f3694f : i46 + c0348f6.f3694f;
                            }
                            if (z2) {
                                c0348f5.d(i46);
                            } else {
                                c0348f6.d(i46);
                            }
                            C0349g c0349g4 = abstractC0358p5.f3714e;
                            int i47 = c0349g4.f3695g;
                            if (abstractC0358p5.d == 3 && abstractC0358p5.f3711a == 1) {
                                i47 = Math.min(i47, c0349g4.f3699m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0348f6.d(i43);
                            } else {
                                c0348f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0348f5.f3694f) : i43 + (-c0348f5.f3694f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3715f == 0 ? this.f3712b.f3528d0 : this.f3712b.f3530e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0358p abstractC0358p6 = (AbstractC0358p) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0358p6.f3712b.f3534g0;
                        C0348f c0348f7 = abstractC0358p6.i;
                        C0348f c0348f8 = abstractC0358p6.h;
                        if (i51 == 8) {
                            c0348f8.d(i49);
                            c0348f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0348f8.f3694f : i49 + c0348f8.f3694f;
                            }
                            if (z2) {
                                c0348f7.d(i49);
                            } else {
                                c0348f8.d(i49);
                            }
                            C0349g c0349g5 = abstractC0358p6.f3714e;
                            int i52 = c0349g5.f3695g;
                            if (abstractC0358p6.d == 3 && abstractC0358p6.f3711a == 1) {
                                i52 = c0349g5.f3699m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0348f8.d(i49);
                            } else {
                                c0348f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0348f7.f3694f) : i49 + (-c0348f7.f3694f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0358p
    public final void d() {
        ArrayList arrayList = this.f3682k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0358p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0340d c0340d = ((AbstractC0358p) arrayList.get(0)).f3712b;
        C0340d c0340d2 = ((AbstractC0358p) arrayList.get(size - 1)).f3712b;
        int i = this.f3715f;
        C0348f c0348f = this.i;
        C0348f c0348f2 = this.h;
        if (i == 0) {
            C0339c c0339c = c0340d.f3504I;
            C0339c c0339c2 = c0340d2.f3506K;
            C0348f i2 = AbstractC0358p.i(c0339c, 0);
            int e2 = c0339c.e();
            C0340d m2 = m();
            if (m2 != null) {
                e2 = m2.f3504I.e();
            }
            if (i2 != null) {
                AbstractC0358p.b(c0348f2, i2, e2);
            }
            C0348f i3 = AbstractC0358p.i(c0339c2, 0);
            int e3 = c0339c2.e();
            C0340d n2 = n();
            if (n2 != null) {
                e3 = n2.f3506K.e();
            }
            if (i3 != null) {
                AbstractC0358p.b(c0348f, i3, -e3);
            }
        } else {
            C0339c c0339c3 = c0340d.f3505J;
            C0339c c0339c4 = c0340d2.f3507L;
            C0348f i4 = AbstractC0358p.i(c0339c3, 1);
            int e4 = c0339c3.e();
            C0340d m3 = m();
            if (m3 != null) {
                e4 = m3.f3505J.e();
            }
            if (i4 != null) {
                AbstractC0358p.b(c0348f2, i4, e4);
            }
            C0348f i5 = AbstractC0358p.i(c0339c4, 1);
            int e5 = c0339c4.e();
            C0340d n3 = n();
            if (n3 != null) {
                e5 = n3.f3507L.e();
            }
            if (i5 != null) {
                AbstractC0358p.b(c0348f, i5, -e5);
            }
        }
        c0348f2.f3690a = this;
        c0348f.f3690a = this;
    }

    @Override // t.AbstractC0358p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3682k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0358p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0358p
    public final void f() {
        this.f3713c = null;
        Iterator it = this.f3682k.iterator();
        while (it.hasNext()) {
            ((AbstractC0358p) it.next()).f();
        }
    }

    @Override // t.AbstractC0358p
    public final long j() {
        ArrayList arrayList = this.f3682k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3694f + ((AbstractC0358p) arrayList.get(i)).j() + j2 + r5.h.f3694f;
        }
        return j2;
    }

    @Override // t.AbstractC0358p
    public final boolean k() {
        ArrayList arrayList = this.f3682k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0358p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0340d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3682k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0340d c0340d = ((AbstractC0358p) arrayList.get(i)).f3712b;
            if (c0340d.f3534g0 != 8) {
                return c0340d;
            }
            i++;
        }
    }

    public final C0340d n() {
        ArrayList arrayList = this.f3682k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0340d c0340d = ((AbstractC0358p) arrayList.get(size)).f3712b;
            if (c0340d.f3534g0 != 8) {
                return c0340d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3715f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3682k.iterator();
        while (it.hasNext()) {
            AbstractC0358p abstractC0358p = (AbstractC0358p) it.next();
            sb.append("<");
            sb.append(abstractC0358p);
            sb.append("> ");
        }
        return sb.toString();
    }
}
