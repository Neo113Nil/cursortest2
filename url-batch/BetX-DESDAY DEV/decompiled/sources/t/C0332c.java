package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0326c;
import s.C0327d;
import s.C0328e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332c extends AbstractC0344o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4163k;

    /* renamed from: l, reason: collision with root package name */
    public int f4164l;

    public C0332c(C0327d c0327d, int i) {
        super(c0327d);
        C0327d c0327d2;
        this.f4163k = new ArrayList();
        this.f4200f = i;
        C0327d c0327d3 = this.f4196b;
        C0327d m2 = c0327d3.m(i);
        while (true) {
            C0327d c0327d4 = m2;
            c0327d2 = c0327d3;
            c0327d3 = c0327d4;
            if (c0327d3 == null) {
                break;
            } else {
                m2 = c0327d3.m(this.f4200f);
            }
        }
        this.f4196b = c0327d2;
        int i2 = this.f4200f;
        AbstractC0344o abstractC0344o = i2 == 0 ? c0327d2.f4040d : i2 == 1 ? c0327d2.f4042e : null;
        ArrayList arrayList = this.f4163k;
        arrayList.add(abstractC0344o);
        C0327d l2 = c0327d2.l(this.f4200f);
        while (l2 != null) {
            int i3 = this.f4200f;
            arrayList.add(i3 == 0 ? l2.f4040d : i3 == 1 ? l2.f4042e : null);
            l2 = l2.l(this.f4200f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0344o abstractC0344o2 = (AbstractC0344o) it.next();
            int i4 = this.f4200f;
            if (i4 == 0) {
                abstractC0344o2.f4196b.f4036b = this;
            } else if (i4 == 1) {
                abstractC0344o2.f4196b.f4038c = this;
            }
        }
        if (this.f4200f == 0 && ((C0328e) this.f4196b.f4027T).f4088v0 && arrayList.size() > 1) {
            this.f4196b = ((AbstractC0344o) arrayList.get(arrayList.size() - 1)).f4196b;
        }
        this.f4164l = this.f4200f == 0 ? this.f4196b.i0 : this.f4196b.f4050j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0333d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0333d interfaceC0333d) {
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
        C0335f c0335f = this.h;
        if (c0335f.f4179j) {
            C0335f c0335f2 = this.i;
            if (c0335f2.f4179j) {
                C0327d c0327d = this.f4196b.f4027T;
                boolean z5 = c0327d instanceof C0328e ? ((C0328e) c0327d).f4088v0 : false;
                int i17 = c0335f2.f4178g - c0335f.f4178g;
                ArrayList arrayList3 = this.f4163k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0344o) arrayList3.get(i18)).f4196b.f4047g0 != 8) {
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
                    if (((AbstractC0344o) arrayList3.get(i20)).f4196b.f4047g0 != 8) {
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
                        AbstractC0344o abstractC0344o = (AbstractC0344o) arrayList3.get(i22);
                        C0327d c0327d2 = abstractC0344o.f4196b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0327d2.f4047g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0344o.h.f4177f;
                            }
                            C0336g c0336g = abstractC0344o.f4199e;
                            int i25 = c0336g.f4178g;
                            i15 = i18;
                            boolean z6 = abstractC0344o.f4198d != 3;
                            if (z6) {
                                int i26 = this.f4200f;
                                if (i26 == 0 && !c0327d2.f4040d.f4199e.f4179j) {
                                    return;
                                }
                                if (i26 == 1 && !c0327d2.f4042e.f4199e.f4179j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0344o.f4195a == 1 && i21 == 0) {
                                    i16 = c0336g.f4182m;
                                    i23++;
                                } else if (c0336g.f4179j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0327d2.f4052k0[this.f4200f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0344o.i.f4177f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0344o.i.f4177f;
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
                int i27 = c0335f.f4178g;
                if (z5) {
                    i27 = c0335f2.f4178g;
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
                        AbstractC0344o abstractC0344o2 = (AbstractC0344o) arrayList5.get(i29);
                        int i31 = i28;
                        C0327d c0327d3 = abstractC0344o2.f4196b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0327d3.f4047g0 != 8 && abstractC0344o2.f4198d == 3) {
                            C0336g c0336g2 = abstractC0344o2.f4199e;
                            if (!c0336g2.f4179j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0327d3.f4052k0[this.f4200f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f4200f == 0) {
                                    i13 = c0327d3.f4067v;
                                    i14 = c0327d3.f4066u;
                                } else {
                                    i13 = c0327d3.f4070y;
                                    i14 = c0327d3.f4069x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0344o2.f4195a == 1 ? Math.min(i12, c0336g2.f4182m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0336g2.d(i12);
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
                            AbstractC0344o abstractC0344o3 = (AbstractC0344o) arrayList2.get(i35);
                            if (abstractC0344o3.f4196b.f4047g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0344o3.h.f4177f;
                                }
                                i6 += abstractC0344o3.f4199e.f4178g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0344o3.i.f4177f;
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
                    if (this.f4164l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f4164l = 0;
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
                    this.f4164l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f4164l = i10;
                }
                int i36 = this.f4164l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0344o abstractC0344o4 = (AbstractC0344o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0344o4.f4196b.f4047g0;
                        C0335f c0335f3 = abstractC0344o4.i;
                        C0335f c0335f4 = abstractC0344o4.h;
                        if (i40 == 8) {
                            c0335f4.d(i38);
                            c0335f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0335f4.f4177f : i38 + c0335f4.f4177f;
                            }
                            if (z2) {
                                c0335f3.d(i38);
                            } else {
                                c0335f4.d(i38);
                            }
                            C0336g c0336g3 = abstractC0344o4.f4199e;
                            int i41 = c0336g3.f4178g;
                            if (abstractC0344o4.f4198d == 3 && abstractC0344o4.f4195a == 1) {
                                i41 = c0336g3.f4182m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0335f4.d(i38);
                            } else {
                                c0335f3.d(i38);
                            }
                            abstractC0344o4.f4201g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0335f3.f4177f) : i38 + (-c0335f3.f4177f);
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
                        AbstractC0344o abstractC0344o5 = (AbstractC0344o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0344o5.f4196b.f4047g0;
                        C0335f c0335f5 = abstractC0344o5.i;
                        C0335f c0335f6 = abstractC0344o5.h;
                        if (i45 == 8) {
                            c0335f6.d(i43);
                            c0335f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0335f6.f4177f : i46 + c0335f6.f4177f;
                            }
                            if (z2) {
                                c0335f5.d(i46);
                            } else {
                                c0335f6.d(i46);
                            }
                            C0336g c0336g4 = abstractC0344o5.f4199e;
                            int i47 = c0336g4.f4178g;
                            if (abstractC0344o5.f4198d == 3 && abstractC0344o5.f4195a == 1) {
                                i47 = Math.min(i47, c0336g4.f4182m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0335f6.d(i43);
                            } else {
                                c0335f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0335f5.f4177f) : i43 + (-c0335f5.f4177f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f4200f == 0 ? this.f4196b.f4041d0 : this.f4196b.f4043e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0344o abstractC0344o6 = (AbstractC0344o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0344o6.f4196b.f4047g0;
                        C0335f c0335f7 = abstractC0344o6.i;
                        C0335f c0335f8 = abstractC0344o6.h;
                        if (i51 == 8) {
                            c0335f8.d(i49);
                            c0335f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0335f8.f4177f : i49 + c0335f8.f4177f;
                            }
                            if (z2) {
                                c0335f7.d(i49);
                            } else {
                                c0335f8.d(i49);
                            }
                            C0336g c0336g5 = abstractC0344o6.f4199e;
                            int i52 = c0336g5.f4178g;
                            if (abstractC0344o6.f4198d == 3 && abstractC0344o6.f4195a == 1) {
                                i52 = c0336g5.f4182m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0335f8.d(i49);
                            } else {
                                c0335f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0335f7.f4177f) : i49 + (-c0335f7.f4177f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0344o
    public final void d() {
        ArrayList arrayList = this.f4163k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0344o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0327d c0327d = ((AbstractC0344o) arrayList.get(0)).f4196b;
        C0327d c0327d2 = ((AbstractC0344o) arrayList.get(size - 1)).f4196b;
        int i = this.f4200f;
        C0335f c0335f = this.i;
        C0335f c0335f2 = this.h;
        if (i == 0) {
            C0326c c0326c = c0327d.f4016I;
            C0326c c0326c2 = c0327d2.f4018K;
            C0335f i2 = AbstractC0344o.i(c0326c, 0);
            int e2 = c0326c.e();
            C0327d m2 = m();
            if (m2 != null) {
                e2 = m2.f4016I.e();
            }
            if (i2 != null) {
                AbstractC0344o.b(c0335f2, i2, e2);
            }
            C0335f i3 = AbstractC0344o.i(c0326c2, 0);
            int e3 = c0326c2.e();
            C0327d n2 = n();
            if (n2 != null) {
                e3 = n2.f4018K.e();
            }
            if (i3 != null) {
                AbstractC0344o.b(c0335f, i3, -e3);
            }
        } else {
            C0326c c0326c3 = c0327d.f4017J;
            C0326c c0326c4 = c0327d2.f4019L;
            C0335f i4 = AbstractC0344o.i(c0326c3, 1);
            int e4 = c0326c3.e();
            C0327d m3 = m();
            if (m3 != null) {
                e4 = m3.f4017J.e();
            }
            if (i4 != null) {
                AbstractC0344o.b(c0335f2, i4, e4);
            }
            C0335f i5 = AbstractC0344o.i(c0326c4, 1);
            int e5 = c0326c4.e();
            C0327d n3 = n();
            if (n3 != null) {
                e5 = n3.f4019L.e();
            }
            if (i5 != null) {
                AbstractC0344o.b(c0335f, i5, -e5);
            }
        }
        c0335f2.f4172a = this;
        c0335f.f4172a = this;
    }

    @Override // t.AbstractC0344o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4163k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0344o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0344o
    public final void f() {
        this.f4197c = null;
        Iterator it = this.f4163k.iterator();
        while (it.hasNext()) {
            ((AbstractC0344o) it.next()).f();
        }
    }

    @Override // t.AbstractC0344o
    public final long j() {
        ArrayList arrayList = this.f4163k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f4177f + ((AbstractC0344o) arrayList.get(i)).j() + j2 + r5.h.f4177f;
        }
        return j2;
    }

    @Override // t.AbstractC0344o
    public final boolean k() {
        ArrayList arrayList = this.f4163k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0344o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0327d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4163k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0327d c0327d = ((AbstractC0344o) arrayList.get(i)).f4196b;
            if (c0327d.f4047g0 != 8) {
                return c0327d;
            }
            i++;
        }
    }

    public final C0327d n() {
        ArrayList arrayList = this.f4163k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0327d c0327d = ((AbstractC0344o) arrayList.get(size)).f4196b;
            if (c0327d.f4047g0 != 8) {
                return c0327d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4200f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f4163k.iterator();
        while (it.hasNext()) {
            AbstractC0344o abstractC0344o = (AbstractC0344o) it.next();
            sb.append("<");
            sb.append(abstractC0344o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
