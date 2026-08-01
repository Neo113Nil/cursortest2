package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0280c;
import s.C0281d;
import s.C0282e;
import v.C0311f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288e {

    /* renamed from: a, reason: collision with root package name */
    public C0282e f3788a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3789b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3790c;
    public C0282e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3791e;

    /* renamed from: f, reason: collision with root package name */
    public C0311f f3792f;

    /* renamed from: g, reason: collision with root package name */
    public C0285b f3793g;
    public ArrayList h;

    public final void a(C0289f c0289f, int i, ArrayList arrayList, C0295l c0295l) {
        AbstractC0298o abstractC0298o = c0289f.d;
        if (abstractC0298o.f3817c == null) {
            C0282e c0282e = this.f3788a;
            if (abstractC0298o == c0282e.d || abstractC0298o == c0282e.f3635e) {
                return;
            }
            if (c0295l == null) {
                c0295l = new C0295l();
                c0295l.f3806a = null;
                c0295l.f3807b = new ArrayList();
                c0295l.f3806a = abstractC0298o;
                arrayList.add(c0295l);
            }
            abstractC0298o.f3817c = c0295l;
            c0295l.f3807b.add(abstractC0298o);
            C0289f c0289f2 = abstractC0298o.h;
            Iterator it = c0289f2.f3801k.iterator();
            while (it.hasNext()) {
                InterfaceC0287d interfaceC0287d = (InterfaceC0287d) it.next();
                if (interfaceC0287d instanceof C0289f) {
                    a((C0289f) interfaceC0287d, i, arrayList, c0295l);
                }
            }
            C0289f c0289f3 = abstractC0298o.i;
            Iterator it2 = c0289f3.f3801k.iterator();
            while (it2.hasNext()) {
                InterfaceC0287d interfaceC0287d2 = (InterfaceC0287d) it2.next();
                if (interfaceC0287d2 instanceof C0289f) {
                    a((C0289f) interfaceC0287d2, i, arrayList, c0295l);
                }
            }
            if (i == 1 && (abstractC0298o instanceof C0296m)) {
                Iterator it3 = ((C0296m) abstractC0298o).f3808k.f3801k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0287d interfaceC0287d3 = (InterfaceC0287d) it3.next();
                    if (interfaceC0287d3 instanceof C0289f) {
                        a((C0289f) interfaceC0287d3, i, arrayList, c0295l);
                    }
                }
            }
            Iterator it4 = c0289f2.f3802l.iterator();
            while (it4.hasNext()) {
                a((C0289f) it4.next(), i, arrayList, c0295l);
            }
            Iterator it5 = c0289f3.f3802l.iterator();
            while (it5.hasNext()) {
                a((C0289f) it5.next(), i, arrayList, c0295l);
            }
            if (i == 1 && (abstractC0298o instanceof C0296m)) {
                Iterator it6 = ((C0296m) abstractC0298o).f3808k.f3802l.iterator();
                while (it6.hasNext()) {
                    a((C0289f) it6.next(), i, arrayList, c0295l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0282e c0282e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0282e.f3675q0.iterator();
        while (it.hasNext()) {
            C0281d c0281d = (C0281d) it.next();
            int[] iArr = c0281d.f3654p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0281d.f3640g0 == 8) {
                c0281d.f3628a = true;
            } else {
                float f2 = c0281d.f3661w;
                if (f2 < 1.0f && i7 == 3) {
                    c0281d.f3656r = 2;
                }
                float f3 = c0281d.f3664z;
                if (f3 < 1.0f && i8 == 3) {
                    c0281d.f3657s = 2;
                }
                if (c0281d.f3624W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0281d.f3656r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0281d.f3657s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0281d.f3656r == 0) {
                            c0281d.f3656r = 3;
                        }
                        if (c0281d.f3657s == 0) {
                            c0281d.f3657s = 3;
                        }
                    }
                }
                C0280c c0280c = c0281d.f3612K;
                C0280c c0280c2 = c0281d.f3610I;
                if (i7 == 3 && c0281d.f3656r == 1 && (c0280c2.f3601f == null || c0280c.f3601f == null)) {
                    i7 = 2;
                }
                C0280c c0280c3 = c0281d.f3613L;
                C0280c c0280c4 = c0281d.f3611J;
                int i9 = (i8 == 3 && c0281d.f3657s == 1 && (c0280c4.f3601f == null || c0280c3.f3601f == null)) ? 2 : i8;
                C0294k c0294k = c0281d.d;
                c0294k.d = i7;
                int i10 = c0281d.f3656r;
                c0294k.f3815a = i10;
                C0296m c0296m = c0281d.f3635e;
                c0296m.d = i9;
                int i11 = c0281d.f3657s;
                c0296m.f3815a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0281d.q();
                    if (i7 == 4) {
                        i = (c0282e.q() - c0280c2.f3602g) - c0280c.f3602g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0281d.k();
                    if (i9 == 4) {
                        i2 = (c0282e.k() - c0280c4.f3602g) - c0280c3.f3602g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0281d);
                    c0281d.d.f3818e.d(c0281d.q());
                    c0281d.f3635e.f3818e.d(c0281d.k());
                    c0281d.f3628a = true;
                } else {
                    int[] iArr2 = c0282e.f3654p0;
                    C0280c[] c0280cArr = c0281d.f3618Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0281d);
                        }
                        int k3 = c0281d.k();
                        f(1, (int) ((k3 * c0281d.f3624W) + 0.5f), 1, k3, c0281d);
                        c0281d.d.f3818e.d(c0281d.q());
                        c0281d.f3635e.f3818e.d(c0281d.k());
                        c0281d.f3628a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0281d);
                        c0281d.d.f3818e.f3803m = c0281d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0282e.q()) + 0.5f), i9, c0281d.k(), c0281d);
                            c0281d.d.f3818e.d(c0281d.q());
                            c0281d.f3635e.f3818e.d(c0281d.k());
                            c0281d.f3628a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0280cArr[0].f3601f == null || c0280cArr[1].f3601f == null) {
                        f(2, 0, i9, 0, c0281d);
                        c0281d.d.f3818e.d(c0281d.q());
                        c0281d.f3635e.f3818e.d(c0281d.k());
                        c0281d.f3628a = true;
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
                                f(2, 0, 2, 0, c0281d);
                                c0281d.d.f3818e.f3803m = c0281d.q();
                                c0281d.f3635e.f3818e.f3803m = c0281d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0281d);
                            }
                            int q3 = c0281d.q();
                            float f4 = c0281d.f3624W;
                            if (c0281d.f3625X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0281d);
                            c0281d.d.f3818e.d(c0281d.q());
                            c0281d.f3635e.f3818e.d(c0281d.k());
                            c0281d.f3628a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0281d);
                            c0281d.f3635e.f3818e.f3803m = c0281d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0281d.q(), 1, (int) ((f3 * c0282e.k()) + 0.5f), c0281d);
                                    c0281d.d.f3818e.d(c0281d.q());
                                    c0281d.f3635e.f3818e.d(c0281d.k());
                                    c0281d.f3628a = true;
                                }
                            } else if (c0280cArr[2].f3601f == null || c0280cArr[3].f3601f == null) {
                                f(2, 0, i9, 0, c0281d);
                                c0281d.d.f3818e.d(c0281d.q());
                                c0281d.f3635e.f3818e.d(c0281d.k());
                                c0281d.f3628a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0281d);
                                    c0281d.d.f3818e.f3803m = c0281d.q();
                                    c0281d.f3635e.f3818e.f3803m = c0281d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0282e.q()) + 0.5f), 1, (int) ((f3 * c0282e.k()) + 0.5f), c0281d);
                                    c0281d.d.f3818e.d(c0281d.q());
                                    c0281d.f3635e.f3818e.d(c0281d.k());
                                    c0281d.f3628a = true;
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
        ArrayList arrayList = this.f3791e;
        arrayList.clear();
        C0282e c0282e = this.d;
        c0282e.d.f();
        c0282e.f3635e.f();
        arrayList.add(c0282e.d);
        arrayList.add(c0282e.f3635e);
        Iterator it = c0282e.f3675q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0281d c0281d = (C0281d) it.next();
            if (c0281d instanceof s.h) {
                C0292i c0292i = new C0292i(c0281d);
                c0281d.d.f();
                c0281d.f3635e.f();
                c0292i.f3819f = ((s.h) c0281d).f3736u0;
                arrayList.add(c0292i);
            } else {
                if (c0281d.x()) {
                    if (c0281d.f3630b == null) {
                        c0281d.f3630b = new C0286c(c0281d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0281d.f3630b);
                } else {
                    arrayList.add(c0281d.d);
                }
                if (c0281d.y()) {
                    if (c0281d.f3632c == null) {
                        c0281d.f3632c = new C0286c(c0281d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0281d.f3632c);
                } else {
                    arrayList.add(c0281d.f3635e);
                }
                if (c0281d instanceof s.i) {
                    arrayList.add(new C0293j(c0281d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0298o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0298o abstractC0298o = (AbstractC0298o) it3.next();
            if (abstractC0298o.f3816b != c0282e) {
                abstractC0298o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0282e c0282e2 = this.f3788a;
        e(c0282e2.d, 0, arrayList2);
        e(c0282e2.f3635e, 1, arrayList2);
        this.f3789b = false;
    }

    public final int d(C0282e c0282e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0282e c0282e2 = c0282e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0298o abstractC0298o = ((C0295l) arrayList2.get(i4)).f3806a;
            if (!(abstractC0298o instanceof C0286c) ? !(i != 0 ? (abstractC0298o instanceof C0296m) : (abstractC0298o instanceof C0294k)) : ((C0286c) abstractC0298o).f3819f != i) {
                C0289f c0289f = (i == 0 ? c0282e2.d : c0282e2.f3635e).h;
                C0289f c0289f2 = (i == 0 ? c0282e2.d : c0282e2.f3635e).i;
                boolean contains = abstractC0298o.h.f3802l.contains(c0289f);
                C0289f c0289f3 = abstractC0298o.i;
                boolean contains2 = c0289f3.f3802l.contains(c0289f2);
                long j3 = abstractC0298o.j();
                C0289f c0289f4 = abstractC0298o.h;
                if (contains && contains2) {
                    long b2 = C0295l.b(c0289f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0295l.a(c0289f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0289f3.f3798f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0289f4.f3798f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0281d c0281d = abstractC0298o.f3816b;
                    if (i == 0) {
                        f2 = c0281d.f3634d0;
                    } else if (i == 1) {
                        f2 = c0281d.f3636e0;
                    } else {
                        c0281d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0289f4.f3798f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0289f3.f3798f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0295l.b(c0289f4, c0289f4.f3798f), c0289f4.f3798f + j3) : contains2 ? Math.max(-C0295l.a(c0289f3, c0289f3.f3798f), (-c0289f3.f3798f) + j3) : (abstractC0298o.j() + c0289f4.f3798f) - c0289f3.f3798f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0282e2 = c0282e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0298o abstractC0298o, int i, ArrayList arrayList) {
        C0289f c0289f;
        Iterator it = abstractC0298o.h.f3801k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0289f = abstractC0298o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0287d interfaceC0287d = (InterfaceC0287d) it.next();
            if (interfaceC0287d instanceof C0289f) {
                a((C0289f) interfaceC0287d, i, arrayList, null);
            } else if (interfaceC0287d instanceof AbstractC0298o) {
                a(((AbstractC0298o) interfaceC0287d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0289f.f3801k.iterator();
        while (it2.hasNext()) {
            InterfaceC0287d interfaceC0287d2 = (InterfaceC0287d) it2.next();
            if (interfaceC0287d2 instanceof C0289f) {
                a((C0289f) interfaceC0287d2, i, arrayList, null);
            } else if (interfaceC0287d2 instanceof AbstractC0298o) {
                a(((AbstractC0298o) interfaceC0287d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0296m) abstractC0298o).f3808k.f3801k.iterator();
            while (it3.hasNext()) {
                InterfaceC0287d interfaceC0287d3 = (InterfaceC0287d) it3.next();
                if (interfaceC0287d3 instanceof C0289f) {
                    a((C0289f) interfaceC0287d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0281d c0281d) {
        C0285b c0285b = this.f3793g;
        c0285b.f3779a = i;
        c0285b.f3780b = i3;
        c0285b.f3781c = i2;
        c0285b.d = i4;
        this.f3792f.b(c0281d, c0285b);
        c0281d.O(c0285b.f3782e);
        c0281d.L(c0285b.f3783f);
        c0281d.f3607E = c0285b.h;
        c0281d.I(c0285b.f3784g);
    }

    public final void g() {
        C0284a c0284a;
        Iterator it = this.f3788a.f3675q0.iterator();
        while (it.hasNext()) {
            C0281d c0281d = (C0281d) it.next();
            if (!c0281d.f3628a) {
                int[] iArr = c0281d.f3654p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0281d.f3656r;
                int i4 = c0281d.f3657s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0290g c0290g = c0281d.d.f3818e;
                boolean z4 = c0290g.f3800j;
                C0290g c0290g2 = c0281d.f3635e.f3818e;
                boolean z5 = c0290g2.f3800j;
                if (z4 && z5) {
                    f(1, c0290g.f3799g, 1, c0290g2.f3799g, c0281d);
                    c0281d.f3628a = true;
                } else if (z4 && z2) {
                    f(1, c0290g.f3799g, 2, c0290g2.f3799g, c0281d);
                    if (i2 == 3) {
                        c0281d.f3635e.f3818e.f3803m = c0281d.k();
                    } else {
                        c0281d.f3635e.f3818e.d(c0281d.k());
                        c0281d.f3628a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0290g.f3799g, 1, c0290g2.f3799g, c0281d);
                    if (i == 3) {
                        c0281d.d.f3818e.f3803m = c0281d.q();
                    } else {
                        c0281d.d.f3818e.d(c0281d.q());
                        c0281d.f3628a = true;
                    }
                }
                if (c0281d.f3628a && (c0284a = c0281d.f3635e.f3809l) != null) {
                    c0284a.d(c0281d.f3629a0);
                }
            }
        }
    }
}
