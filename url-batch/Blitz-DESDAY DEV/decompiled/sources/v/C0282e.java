package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.C0274c;
import u.C0275d;
import u.C0276e;
import x.C0305f;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282e {

    /* renamed from: a, reason: collision with root package name */
    public C0276e f3808a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3809b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3810c;
    public C0276e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3811e;

    /* renamed from: f, reason: collision with root package name */
    public C0305f f3812f;

    /* renamed from: g, reason: collision with root package name */
    public C0279b f3813g;
    public ArrayList h;

    public final void a(C0283f c0283f, int i, ArrayList arrayList, C0289l c0289l) {
        AbstractC0292o abstractC0292o = c0283f.d;
        if (abstractC0292o.f3837c == null) {
            C0276e c0276e = this.f3808a;
            if (abstractC0292o == c0276e.d || abstractC0292o == c0276e.f3673e) {
                return;
            }
            if (c0289l == null) {
                c0289l = new C0289l();
                c0289l.f3826a = null;
                c0289l.f3827b = new ArrayList();
                c0289l.f3826a = abstractC0292o;
                arrayList.add(c0289l);
            }
            abstractC0292o.f3837c = c0289l;
            c0289l.f3827b.add(abstractC0292o);
            C0283f c0283f2 = abstractC0292o.h;
            Iterator it = c0283f2.f3821k.iterator();
            while (it.hasNext()) {
                InterfaceC0281d interfaceC0281d = (InterfaceC0281d) it.next();
                if (interfaceC0281d instanceof C0283f) {
                    a((C0283f) interfaceC0281d, i, arrayList, c0289l);
                }
            }
            C0283f c0283f3 = abstractC0292o.i;
            Iterator it2 = c0283f3.f3821k.iterator();
            while (it2.hasNext()) {
                InterfaceC0281d interfaceC0281d2 = (InterfaceC0281d) it2.next();
                if (interfaceC0281d2 instanceof C0283f) {
                    a((C0283f) interfaceC0281d2, i, arrayList, c0289l);
                }
            }
            if (i == 1 && (abstractC0292o instanceof C0290m)) {
                Iterator it3 = ((C0290m) abstractC0292o).f3828k.f3821k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0281d interfaceC0281d3 = (InterfaceC0281d) it3.next();
                    if (interfaceC0281d3 instanceof C0283f) {
                        a((C0283f) interfaceC0281d3, i, arrayList, c0289l);
                    }
                }
            }
            Iterator it4 = c0283f2.f3822l.iterator();
            while (it4.hasNext()) {
                a((C0283f) it4.next(), i, arrayList, c0289l);
            }
            Iterator it5 = c0283f3.f3822l.iterator();
            while (it5.hasNext()) {
                a((C0283f) it5.next(), i, arrayList, c0289l);
            }
            if (i == 1 && (abstractC0292o instanceof C0290m)) {
                Iterator it6 = ((C0290m) abstractC0292o).f3828k.f3822l.iterator();
                while (it6.hasNext()) {
                    a((C0283f) it6.next(), i, arrayList, c0289l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0276e c0276e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0276e.f3714q0.iterator();
        while (it.hasNext()) {
            C0275d c0275d = (C0275d) it.next();
            int[] iArr = c0275d.p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0275d.f3678g0 == 8) {
                c0275d.f3666a = true;
            } else {
                float f2 = c0275d.f3700w;
                if (f2 < 1.0f && i7 == 3) {
                    c0275d.f3695r = 2;
                }
                float f3 = c0275d.f3703z;
                if (f3 < 1.0f && i8 == 3) {
                    c0275d.f3696s = 2;
                }
                if (c0275d.f3662W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0275d.f3695r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0275d.f3696s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0275d.f3695r == 0) {
                            c0275d.f3695r = 3;
                        }
                        if (c0275d.f3696s == 0) {
                            c0275d.f3696s = 3;
                        }
                    }
                }
                C0274c c0274c = c0275d.f3650K;
                C0274c c0274c2 = c0275d.f3648I;
                if (i7 == 3 && c0275d.f3695r == 1 && (c0274c2.f3639f == null || c0274c.f3639f == null)) {
                    i7 = 2;
                }
                C0274c c0274c3 = c0275d.f3651L;
                C0274c c0274c4 = c0275d.f3649J;
                int i9 = (i8 == 3 && c0275d.f3696s == 1 && (c0274c4.f3639f == null || c0274c3.f3639f == null)) ? 2 : i8;
                C0288k c0288k = c0275d.d;
                c0288k.d = i7;
                int i10 = c0275d.f3695r;
                c0288k.f3835a = i10;
                C0290m c0290m = c0275d.f3673e;
                c0290m.d = i9;
                int i11 = c0275d.f3696s;
                c0290m.f3835a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0275d.q();
                    if (i7 == 4) {
                        i = (c0276e.q() - c0274c2.f3640g) - c0274c.f3640g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0275d.k();
                    if (i9 == 4) {
                        i2 = (c0276e.k() - c0274c4.f3640g) - c0274c3.f3640g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0275d);
                    c0275d.d.f3838e.d(c0275d.q());
                    c0275d.f3673e.f3838e.d(c0275d.k());
                    c0275d.f3666a = true;
                } else {
                    int[] iArr2 = c0276e.p0;
                    C0274c[] c0274cArr = c0275d.f3656Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0275d);
                        }
                        int k3 = c0275d.k();
                        f(1, (int) ((k3 * c0275d.f3662W) + 0.5f), 1, k3, c0275d);
                        c0275d.d.f3838e.d(c0275d.q());
                        c0275d.f3673e.f3838e.d(c0275d.k());
                        c0275d.f3666a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0275d);
                        c0275d.d.f3838e.f3823m = c0275d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0276e.q()) + 0.5f), i9, c0275d.k(), c0275d);
                            c0275d.d.f3838e.d(c0275d.q());
                            c0275d.f3673e.f3838e.d(c0275d.k());
                            c0275d.f3666a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0274cArr[0].f3639f == null || c0274cArr[1].f3639f == null) {
                        f(2, 0, i9, 0, c0275d);
                        c0275d.d.f3838e.d(c0275d.q());
                        c0275d.f3673e.f3838e.d(c0275d.k());
                        c0275d.f3666a = true;
                    } else {
                        i4 = 3;
                    }
                    if (i9 == i4) {
                        if (i7 != 2 && i7 != 1) {
                            i6 = i4;
                            i5 = 1;
                            if (i7 != i6) {
                                if (i10 != i5) {
                                }
                                f(2, 0, 2, 0, c0275d);
                                c0275d.d.f3838e.f3823m = c0275d.q();
                                c0275d.f3673e.f3838e.f3823m = c0275d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0275d);
                            }
                            int q3 = c0275d.q();
                            float f4 = c0275d.f3662W;
                            if (c0275d.f3663X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0275d);
                            c0275d.d.f3838e.d(c0275d.q());
                            c0275d.f3673e.f3838e.d(c0275d.k());
                            c0275d.f3666a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0275d);
                            c0275d.f3673e.f3838e.f3823m = c0275d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0275d.q(), 1, (int) ((f3 * c0276e.k()) + 0.5f), c0275d);
                                    c0275d.d.f3838e.d(c0275d.q());
                                    c0275d.f3673e.f3838e.d(c0275d.k());
                                    c0275d.f3666a = true;
                                }
                            } else if (c0274cArr[2].f3639f == null || c0274cArr[3].f3639f == null) {
                                f(2, 0, i9, 0, c0275d);
                                c0275d.d.f3838e.d(c0275d.q());
                                c0275d.f3673e.f3838e.d(c0275d.k());
                                c0275d.f3666a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0275d);
                                    c0275d.d.f3838e.f3823m = c0275d.q();
                                    c0275d.f3673e.f3838e.f3823m = c0275d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0276e.q()) + 0.5f), 1, (int) ((f3 * c0276e.k()) + 0.5f), c0275d);
                                    c0275d.d.f3838e.d(c0275d.q());
                                    c0275d.f3673e.f3838e.d(c0275d.k());
                                    c0275d.f3666a = true;
                                }
                            }
                        }
                    }
                    i5 = 1;
                    i6 = 3;
                    if (i7 != i6) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f3811e;
        arrayList.clear();
        C0276e c0276e = this.d;
        c0276e.d.f();
        c0276e.f3673e.f();
        arrayList.add(c0276e.d);
        arrayList.add(c0276e.f3673e);
        Iterator it = c0276e.f3714q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0275d c0275d = (C0275d) it.next();
            if (c0275d instanceof u.h) {
                C0286i c0286i = new C0286i(c0275d);
                c0275d.d.f();
                c0275d.f3673e.f();
                c0286i.f3839f = ((u.h) c0275d).f3777u0;
                arrayList.add(c0286i);
            } else {
                if (c0275d.x()) {
                    if (c0275d.f3668b == null) {
                        c0275d.f3668b = new C0280c(c0275d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0275d.f3668b);
                } else {
                    arrayList.add(c0275d.d);
                }
                if (c0275d.y()) {
                    if (c0275d.f3670c == null) {
                        c0275d.f3670c = new C0280c(c0275d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0275d.f3670c);
                } else {
                    arrayList.add(c0275d.f3673e);
                }
                if (c0275d instanceof u.i) {
                    arrayList.add(new C0287j(c0275d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0292o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0292o abstractC0292o = (AbstractC0292o) it3.next();
            if (abstractC0292o.f3836b != c0276e) {
                abstractC0292o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0276e c0276e2 = this.f3808a;
        e(c0276e2.d, 0, arrayList2);
        e(c0276e2.f3673e, 1, arrayList2);
        this.f3809b = false;
    }

    public final int d(C0276e c0276e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0276e c0276e2 = c0276e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0292o abstractC0292o = ((C0289l) arrayList2.get(i4)).f3826a;
            if (!(abstractC0292o instanceof C0280c) ? !(i != 0 ? (abstractC0292o instanceof C0290m) : (abstractC0292o instanceof C0288k)) : ((C0280c) abstractC0292o).f3839f != i) {
                C0283f c0283f = (i == 0 ? c0276e2.d : c0276e2.f3673e).h;
                C0283f c0283f2 = (i == 0 ? c0276e2.d : c0276e2.f3673e).i;
                boolean contains = abstractC0292o.h.f3822l.contains(c0283f);
                C0283f c0283f3 = abstractC0292o.i;
                boolean contains2 = c0283f3.f3822l.contains(c0283f2);
                long j3 = abstractC0292o.j();
                C0283f c0283f4 = abstractC0292o.h;
                if (contains && contains2) {
                    long b2 = C0289l.b(c0283f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0289l.a(c0283f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0283f3.f3818f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0283f4.f3818f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0275d c0275d = abstractC0292o.f3836b;
                    if (i == 0) {
                        f2 = c0275d.f3672d0;
                    } else if (i == 1) {
                        f2 = c0275d.f3674e0;
                    } else {
                        c0275d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0283f4.f3818f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0283f3.f3818f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0289l.b(c0283f4, c0283f4.f3818f), c0283f4.f3818f + j3) : contains2 ? Math.max(-C0289l.a(c0283f3, c0283f3.f3818f), (-c0283f3.f3818f) + j3) : (abstractC0292o.j() + c0283f4.f3818f) - c0283f3.f3818f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0276e2 = c0276e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0292o abstractC0292o, int i, ArrayList arrayList) {
        C0283f c0283f;
        Iterator it = abstractC0292o.h.f3821k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0283f = abstractC0292o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0281d interfaceC0281d = (InterfaceC0281d) it.next();
            if (interfaceC0281d instanceof C0283f) {
                a((C0283f) interfaceC0281d, i, arrayList, null);
            } else if (interfaceC0281d instanceof AbstractC0292o) {
                a(((AbstractC0292o) interfaceC0281d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0283f.f3821k.iterator();
        while (it2.hasNext()) {
            InterfaceC0281d interfaceC0281d2 = (InterfaceC0281d) it2.next();
            if (interfaceC0281d2 instanceof C0283f) {
                a((C0283f) interfaceC0281d2, i, arrayList, null);
            } else if (interfaceC0281d2 instanceof AbstractC0292o) {
                a(((AbstractC0292o) interfaceC0281d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0290m) abstractC0292o).f3828k.f3821k.iterator();
            while (it3.hasNext()) {
                InterfaceC0281d interfaceC0281d3 = (InterfaceC0281d) it3.next();
                if (interfaceC0281d3 instanceof C0283f) {
                    a((C0283f) interfaceC0281d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0275d c0275d) {
        C0279b c0279b = this.f3813g;
        c0279b.f3799a = i;
        c0279b.f3800b = i3;
        c0279b.f3801c = i2;
        c0279b.d = i4;
        this.f3812f.b(c0275d, c0279b);
        c0275d.O(c0279b.f3802e);
        c0275d.L(c0279b.f3803f);
        c0275d.f3645E = c0279b.h;
        c0275d.I(c0279b.f3804g);
    }

    public final void g() {
        C0278a c0278a;
        Iterator it = this.f3808a.f3714q0.iterator();
        while (it.hasNext()) {
            C0275d c0275d = (C0275d) it.next();
            if (!c0275d.f3666a) {
                int[] iArr = c0275d.p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0275d.f3695r;
                int i4 = c0275d.f3696s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0284g c0284g = c0275d.d.f3838e;
                boolean z4 = c0284g.f3820j;
                C0284g c0284g2 = c0275d.f3673e.f3838e;
                boolean z5 = c0284g2.f3820j;
                if (z4 && z5) {
                    f(1, c0284g.f3819g, 1, c0284g2.f3819g, c0275d);
                    c0275d.f3666a = true;
                } else if (z4 && z2) {
                    f(1, c0284g.f3819g, 2, c0284g2.f3819g, c0275d);
                    if (i2 == 3) {
                        c0275d.f3673e.f3838e.f3823m = c0275d.k();
                    } else {
                        c0275d.f3673e.f3838e.d(c0275d.k());
                        c0275d.f3666a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0284g.f3819g, 1, c0284g2.f3819g, c0275d);
                    if (i == 3) {
                        c0275d.d.f3838e.f3823m = c0275d.q();
                    } else {
                        c0275d.d.f3838e.d(c0275d.q());
                        c0275d.f3666a = true;
                    }
                }
                if (c0275d.f3666a && (c0278a = c0275d.f3673e.f3829l) != null) {
                    c0278a.d(c0275d.f3667a0);
                }
            }
        }
    }
}
