package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0292c;
import s.C0293d;
import s.C0294e;
import v.C0319f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300e {

    /* renamed from: a, reason: collision with root package name */
    public C0294e f3691a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3692b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3693c;
    public C0294e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3694e;

    /* renamed from: f, reason: collision with root package name */
    public C0319f f3695f;

    /* renamed from: g, reason: collision with root package name */
    public C0297b f3696g;
    public ArrayList h;

    public final void a(C0301f c0301f, int i, ArrayList arrayList, C0307l c0307l) {
        AbstractC0310o abstractC0310o = c0301f.d;
        if (abstractC0310o.f3720c == null) {
            C0294e c0294e = this.f3691a;
            if (abstractC0310o == c0294e.d || abstractC0310o == c0294e.f3557e) {
                return;
            }
            if (c0307l == null) {
                c0307l = new C0307l();
                c0307l.f3709a = null;
                c0307l.f3710b = new ArrayList();
                c0307l.f3709a = abstractC0310o;
                arrayList.add(c0307l);
            }
            abstractC0310o.f3720c = c0307l;
            c0307l.f3710b.add(abstractC0310o);
            C0301f c0301f2 = abstractC0310o.h;
            Iterator it = c0301f2.f3704k.iterator();
            while (it.hasNext()) {
                InterfaceC0299d interfaceC0299d = (InterfaceC0299d) it.next();
                if (interfaceC0299d instanceof C0301f) {
                    a((C0301f) interfaceC0299d, i, arrayList, c0307l);
                }
            }
            C0301f c0301f3 = abstractC0310o.i;
            Iterator it2 = c0301f3.f3704k.iterator();
            while (it2.hasNext()) {
                InterfaceC0299d interfaceC0299d2 = (InterfaceC0299d) it2.next();
                if (interfaceC0299d2 instanceof C0301f) {
                    a((C0301f) interfaceC0299d2, i, arrayList, c0307l);
                }
            }
            if (i == 1 && (abstractC0310o instanceof C0308m)) {
                Iterator it3 = ((C0308m) abstractC0310o).f3711k.f3704k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0299d interfaceC0299d3 = (InterfaceC0299d) it3.next();
                    if (interfaceC0299d3 instanceof C0301f) {
                        a((C0301f) interfaceC0299d3, i, arrayList, c0307l);
                    }
                }
            }
            Iterator it4 = c0301f2.f3705l.iterator();
            while (it4.hasNext()) {
                a((C0301f) it4.next(), i, arrayList, c0307l);
            }
            Iterator it5 = c0301f3.f3705l.iterator();
            while (it5.hasNext()) {
                a((C0301f) it5.next(), i, arrayList, c0307l);
            }
            if (i == 1 && (abstractC0310o instanceof C0308m)) {
                Iterator it6 = ((C0308m) abstractC0310o).f3711k.f3705l.iterator();
                while (it6.hasNext()) {
                    a((C0301f) it6.next(), i, arrayList, c0307l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0294e c0294e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0294e.f3599q0.iterator();
        while (it.hasNext()) {
            C0293d c0293d = (C0293d) it.next();
            int[] iArr = c0293d.f3577p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0293d.f3562g0 == 8) {
                c0293d.f3550a = true;
            } else {
                float f2 = c0293d.f3584w;
                if (f2 < 1.0f && i7 == 3) {
                    c0293d.f3579r = 2;
                }
                float f3 = c0293d.f3587z;
                if (f3 < 1.0f && i8 == 3) {
                    c0293d.f3580s = 2;
                }
                if (c0293d.f3546W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0293d.f3579r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0293d.f3580s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0293d.f3579r == 0) {
                            c0293d.f3579r = 3;
                        }
                        if (c0293d.f3580s == 0) {
                            c0293d.f3580s = 3;
                        }
                    }
                }
                C0292c c0292c = c0293d.f3534K;
                C0292c c0292c2 = c0293d.f3532I;
                if (i7 == 3 && c0293d.f3579r == 1 && (c0292c2.f3523f == null || c0292c.f3523f == null)) {
                    i7 = 2;
                }
                C0292c c0292c3 = c0293d.f3535L;
                C0292c c0292c4 = c0293d.f3533J;
                int i9 = (i8 == 3 && c0293d.f3580s == 1 && (c0292c4.f3523f == null || c0292c3.f3523f == null)) ? 2 : i8;
                C0306k c0306k = c0293d.d;
                c0306k.d = i7;
                int i10 = c0293d.f3579r;
                c0306k.f3718a = i10;
                C0308m c0308m = c0293d.f3557e;
                c0308m.d = i9;
                int i11 = c0293d.f3580s;
                c0308m.f3718a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0293d.q();
                    if (i7 == 4) {
                        i = (c0294e.q() - c0292c2.f3524g) - c0292c.f3524g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0293d.k();
                    if (i9 == 4) {
                        i2 = (c0294e.k() - c0292c4.f3524g) - c0292c3.f3524g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0293d);
                    c0293d.d.f3721e.d(c0293d.q());
                    c0293d.f3557e.f3721e.d(c0293d.k());
                    c0293d.f3550a = true;
                } else {
                    int[] iArr2 = c0294e.f3577p0;
                    C0292c[] c0292cArr = c0293d.f3540Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0293d);
                        }
                        int k3 = c0293d.k();
                        f(1, (int) ((k3 * c0293d.f3546W) + 0.5f), 1, k3, c0293d);
                        c0293d.d.f3721e.d(c0293d.q());
                        c0293d.f3557e.f3721e.d(c0293d.k());
                        c0293d.f3550a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0293d);
                        c0293d.d.f3721e.f3706m = c0293d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0294e.q()) + 0.5f), i9, c0293d.k(), c0293d);
                            c0293d.d.f3721e.d(c0293d.q());
                            c0293d.f3557e.f3721e.d(c0293d.k());
                            c0293d.f3550a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0292cArr[0].f3523f == null || c0292cArr[1].f3523f == null) {
                        f(2, 0, i9, 0, c0293d);
                        c0293d.d.f3721e.d(c0293d.q());
                        c0293d.f3557e.f3721e.d(c0293d.k());
                        c0293d.f3550a = true;
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
                                f(2, 0, 2, 0, c0293d);
                                c0293d.d.f3721e.f3706m = c0293d.q();
                                c0293d.f3557e.f3721e.f3706m = c0293d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0293d);
                            }
                            int q3 = c0293d.q();
                            float f4 = c0293d.f3546W;
                            if (c0293d.f3547X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0293d);
                            c0293d.d.f3721e.d(c0293d.q());
                            c0293d.f3557e.f3721e.d(c0293d.k());
                            c0293d.f3550a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0293d);
                            c0293d.f3557e.f3721e.f3706m = c0293d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0293d.q(), 1, (int) ((f3 * c0294e.k()) + 0.5f), c0293d);
                                    c0293d.d.f3721e.d(c0293d.q());
                                    c0293d.f3557e.f3721e.d(c0293d.k());
                                    c0293d.f3550a = true;
                                }
                            } else if (c0292cArr[2].f3523f == null || c0292cArr[3].f3523f == null) {
                                f(2, 0, i9, 0, c0293d);
                                c0293d.d.f3721e.d(c0293d.q());
                                c0293d.f3557e.f3721e.d(c0293d.k());
                                c0293d.f3550a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0293d);
                                    c0293d.d.f3721e.f3706m = c0293d.q();
                                    c0293d.f3557e.f3721e.f3706m = c0293d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0294e.q()) + 0.5f), 1, (int) ((f3 * c0294e.k()) + 0.5f), c0293d);
                                    c0293d.d.f3721e.d(c0293d.q());
                                    c0293d.f3557e.f3721e.d(c0293d.k());
                                    c0293d.f3550a = true;
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
        ArrayList arrayList = this.f3694e;
        arrayList.clear();
        C0294e c0294e = this.d;
        c0294e.d.f();
        c0294e.f3557e.f();
        arrayList.add(c0294e.d);
        arrayList.add(c0294e.f3557e);
        Iterator it = c0294e.f3599q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0293d c0293d = (C0293d) it.next();
            if (c0293d instanceof s.h) {
                C0304i c0304i = new C0304i(c0293d);
                c0293d.d.f();
                c0293d.f3557e.f();
                c0304i.f3722f = ((s.h) c0293d).f3660u0;
                arrayList.add(c0304i);
            } else {
                if (c0293d.x()) {
                    if (c0293d.f3552b == null) {
                        c0293d.f3552b = new C0298c(c0293d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0293d.f3552b);
                } else {
                    arrayList.add(c0293d.d);
                }
                if (c0293d.y()) {
                    if (c0293d.f3554c == null) {
                        c0293d.f3554c = new C0298c(c0293d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0293d.f3554c);
                } else {
                    arrayList.add(c0293d.f3557e);
                }
                if (c0293d instanceof s.i) {
                    arrayList.add(new C0305j(c0293d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0310o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0310o abstractC0310o = (AbstractC0310o) it3.next();
            if (abstractC0310o.f3719b != c0294e) {
                abstractC0310o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0294e c0294e2 = this.f3691a;
        e(c0294e2.d, 0, arrayList2);
        e(c0294e2.f3557e, 1, arrayList2);
        this.f3692b = false;
    }

    public final int d(C0294e c0294e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0294e c0294e2 = c0294e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0310o abstractC0310o = ((C0307l) arrayList2.get(i4)).f3709a;
            if (!(abstractC0310o instanceof C0298c) ? !(i != 0 ? (abstractC0310o instanceof C0308m) : (abstractC0310o instanceof C0306k)) : ((C0298c) abstractC0310o).f3722f != i) {
                C0301f c0301f = (i == 0 ? c0294e2.d : c0294e2.f3557e).h;
                C0301f c0301f2 = (i == 0 ? c0294e2.d : c0294e2.f3557e).i;
                boolean contains = abstractC0310o.h.f3705l.contains(c0301f);
                C0301f c0301f3 = abstractC0310o.i;
                boolean contains2 = c0301f3.f3705l.contains(c0301f2);
                long j3 = abstractC0310o.j();
                C0301f c0301f4 = abstractC0310o.h;
                if (contains && contains2) {
                    long b2 = C0307l.b(c0301f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0307l.a(c0301f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0301f3.f3701f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0301f4.f3701f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0293d c0293d = abstractC0310o.f3719b;
                    if (i == 0) {
                        f2 = c0293d.f3556d0;
                    } else if (i == 1) {
                        f2 = c0293d.f3558e0;
                    } else {
                        c0293d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0301f4.f3701f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0301f3.f3701f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0307l.b(c0301f4, c0301f4.f3701f), c0301f4.f3701f + j3) : contains2 ? Math.max(-C0307l.a(c0301f3, c0301f3.f3701f), (-c0301f3.f3701f) + j3) : (abstractC0310o.j() + c0301f4.f3701f) - c0301f3.f3701f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0294e2 = c0294e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0310o abstractC0310o, int i, ArrayList arrayList) {
        C0301f c0301f;
        Iterator it = abstractC0310o.h.f3704k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0301f = abstractC0310o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0299d interfaceC0299d = (InterfaceC0299d) it.next();
            if (interfaceC0299d instanceof C0301f) {
                a((C0301f) interfaceC0299d, i, arrayList, null);
            } else if (interfaceC0299d instanceof AbstractC0310o) {
                a(((AbstractC0310o) interfaceC0299d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0301f.f3704k.iterator();
        while (it2.hasNext()) {
            InterfaceC0299d interfaceC0299d2 = (InterfaceC0299d) it2.next();
            if (interfaceC0299d2 instanceof C0301f) {
                a((C0301f) interfaceC0299d2, i, arrayList, null);
            } else if (interfaceC0299d2 instanceof AbstractC0310o) {
                a(((AbstractC0310o) interfaceC0299d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0308m) abstractC0310o).f3711k.f3704k.iterator();
            while (it3.hasNext()) {
                InterfaceC0299d interfaceC0299d3 = (InterfaceC0299d) it3.next();
                if (interfaceC0299d3 instanceof C0301f) {
                    a((C0301f) interfaceC0299d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0293d c0293d) {
        C0297b c0297b = this.f3696g;
        c0297b.f3682a = i;
        c0297b.f3683b = i3;
        c0297b.f3684c = i2;
        c0297b.d = i4;
        this.f3695f.b(c0293d, c0297b);
        c0293d.O(c0297b.f3685e);
        c0293d.L(c0297b.f3686f);
        c0293d.f3529E = c0297b.h;
        c0293d.I(c0297b.f3687g);
    }

    public final void g() {
        C0296a c0296a;
        Iterator it = this.f3691a.f3599q0.iterator();
        while (it.hasNext()) {
            C0293d c0293d = (C0293d) it.next();
            if (!c0293d.f3550a) {
                int[] iArr = c0293d.f3577p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0293d.f3579r;
                int i4 = c0293d.f3580s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0302g c0302g = c0293d.d.f3721e;
                boolean z4 = c0302g.f3703j;
                C0302g c0302g2 = c0293d.f3557e.f3721e;
                boolean z5 = c0302g2.f3703j;
                if (z4 && z5) {
                    f(1, c0302g.f3702g, 1, c0302g2.f3702g, c0293d);
                    c0293d.f3550a = true;
                } else if (z4 && z2) {
                    f(1, c0302g.f3702g, 2, c0302g2.f3702g, c0293d);
                    if (i2 == 3) {
                        c0293d.f3557e.f3721e.f3706m = c0293d.k();
                    } else {
                        c0293d.f3557e.f3721e.d(c0293d.k());
                        c0293d.f3550a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0302g.f3702g, 1, c0302g2.f3702g, c0293d);
                    if (i == 3) {
                        c0293d.d.f3721e.f3706m = c0293d.q();
                    } else {
                        c0293d.d.f3721e.d(c0293d.q());
                        c0293d.f3550a = true;
                    }
                }
                if (c0293d.f3550a && (c0296a = c0293d.f3557e.f3712l) != null) {
                    c0296a.d(c0293d.f3551a0);
                }
            }
        }
    }
}
