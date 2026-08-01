package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0294c;
import s.C0295d;
import s.C0296e;
import v.C0321f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302e {

    /* renamed from: a, reason: collision with root package name */
    public C0296e f3836a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3837b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3838c;
    public C0296e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3839e;

    /* renamed from: f, reason: collision with root package name */
    public C0321f f3840f;

    /* renamed from: g, reason: collision with root package name */
    public C0299b f3841g;
    public ArrayList h;

    public final void a(C0303f c0303f, int i, ArrayList arrayList, C0309l c0309l) {
        AbstractC0312o abstractC0312o = c0303f.d;
        if (abstractC0312o.f3865c == null) {
            C0296e c0296e = this.f3836a;
            if (abstractC0312o == c0296e.d || abstractC0312o == c0296e.f3695e) {
                return;
            }
            if (c0309l == null) {
                c0309l = new C0309l();
                c0309l.f3854a = null;
                c0309l.f3855b = new ArrayList();
                c0309l.f3854a = abstractC0312o;
                arrayList.add(c0309l);
            }
            abstractC0312o.f3865c = c0309l;
            c0309l.f3855b.add(abstractC0312o);
            C0303f c0303f2 = abstractC0312o.h;
            Iterator it = c0303f2.f3849k.iterator();
            while (it.hasNext()) {
                InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
                if (interfaceC0301d instanceof C0303f) {
                    a((C0303f) interfaceC0301d, i, arrayList, c0309l);
                }
            }
            C0303f c0303f3 = abstractC0312o.i;
            Iterator it2 = c0303f3.f3849k.iterator();
            while (it2.hasNext()) {
                InterfaceC0301d interfaceC0301d2 = (InterfaceC0301d) it2.next();
                if (interfaceC0301d2 instanceof C0303f) {
                    a((C0303f) interfaceC0301d2, i, arrayList, c0309l);
                }
            }
            if (i == 1 && (abstractC0312o instanceof C0310m)) {
                Iterator it3 = ((C0310m) abstractC0312o).f3856k.f3849k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0301d interfaceC0301d3 = (InterfaceC0301d) it3.next();
                    if (interfaceC0301d3 instanceof C0303f) {
                        a((C0303f) interfaceC0301d3, i, arrayList, c0309l);
                    }
                }
            }
            Iterator it4 = c0303f2.f3850l.iterator();
            while (it4.hasNext()) {
                a((C0303f) it4.next(), i, arrayList, c0309l);
            }
            Iterator it5 = c0303f3.f3850l.iterator();
            while (it5.hasNext()) {
                a((C0303f) it5.next(), i, arrayList, c0309l);
            }
            if (i == 1 && (abstractC0312o instanceof C0310m)) {
                Iterator it6 = ((C0310m) abstractC0312o).f3856k.f3850l.iterator();
                while (it6.hasNext()) {
                    a((C0303f) it6.next(), i, arrayList, c0309l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0296e c0296e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0296e.f3736q0.iterator();
        while (it.hasNext()) {
            C0295d c0295d = (C0295d) it.next();
            int[] iArr = c0295d.f3714p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0295d.f3700g0 == 8) {
                c0295d.f3688a = true;
            } else {
                float f2 = c0295d.f3721w;
                if (f2 < 1.0f && i7 == 3) {
                    c0295d.f3716r = 2;
                }
                float f3 = c0295d.f3724z;
                if (f3 < 1.0f && i8 == 3) {
                    c0295d.f3717s = 2;
                }
                if (c0295d.f3684W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0295d.f3716r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0295d.f3717s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0295d.f3716r == 0) {
                            c0295d.f3716r = 3;
                        }
                        if (c0295d.f3717s == 0) {
                            c0295d.f3717s = 3;
                        }
                    }
                }
                C0294c c0294c = c0295d.f3672K;
                C0294c c0294c2 = c0295d.f3670I;
                if (i7 == 3 && c0295d.f3716r == 1 && (c0294c2.f3661f == null || c0294c.f3661f == null)) {
                    i7 = 2;
                }
                C0294c c0294c3 = c0295d.f3673L;
                C0294c c0294c4 = c0295d.f3671J;
                int i9 = (i8 == 3 && c0295d.f3717s == 1 && (c0294c4.f3661f == null || c0294c3.f3661f == null)) ? 2 : i8;
                C0308k c0308k = c0295d.d;
                c0308k.d = i7;
                int i10 = c0295d.f3716r;
                c0308k.f3863a = i10;
                C0310m c0310m = c0295d.f3695e;
                c0310m.d = i9;
                int i11 = c0295d.f3717s;
                c0310m.f3863a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0295d.q();
                    if (i7 == 4) {
                        i = (c0296e.q() - c0294c2.f3662g) - c0294c.f3662g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0295d.k();
                    if (i9 == 4) {
                        i2 = (c0296e.k() - c0294c4.f3662g) - c0294c3.f3662g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0295d);
                    c0295d.d.f3866e.d(c0295d.q());
                    c0295d.f3695e.f3866e.d(c0295d.k());
                    c0295d.f3688a = true;
                } else {
                    int[] iArr2 = c0296e.f3714p0;
                    C0294c[] c0294cArr = c0295d.f3678Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0295d);
                        }
                        int k3 = c0295d.k();
                        f(1, (int) ((k3 * c0295d.f3684W) + 0.5f), 1, k3, c0295d);
                        c0295d.d.f3866e.d(c0295d.q());
                        c0295d.f3695e.f3866e.d(c0295d.k());
                        c0295d.f3688a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0295d);
                        c0295d.d.f3866e.f3851m = c0295d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0296e.q()) + 0.5f), i9, c0295d.k(), c0295d);
                            c0295d.d.f3866e.d(c0295d.q());
                            c0295d.f3695e.f3866e.d(c0295d.k());
                            c0295d.f3688a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0294cArr[0].f3661f == null || c0294cArr[1].f3661f == null) {
                        f(2, 0, i9, 0, c0295d);
                        c0295d.d.f3866e.d(c0295d.q());
                        c0295d.f3695e.f3866e.d(c0295d.k());
                        c0295d.f3688a = true;
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
                                f(2, 0, 2, 0, c0295d);
                                c0295d.d.f3866e.f3851m = c0295d.q();
                                c0295d.f3695e.f3866e.f3851m = c0295d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0295d);
                            }
                            int q3 = c0295d.q();
                            float f4 = c0295d.f3684W;
                            if (c0295d.f3685X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0295d);
                            c0295d.d.f3866e.d(c0295d.q());
                            c0295d.f3695e.f3866e.d(c0295d.k());
                            c0295d.f3688a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0295d);
                            c0295d.f3695e.f3866e.f3851m = c0295d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0295d.q(), 1, (int) ((f3 * c0296e.k()) + 0.5f), c0295d);
                                    c0295d.d.f3866e.d(c0295d.q());
                                    c0295d.f3695e.f3866e.d(c0295d.k());
                                    c0295d.f3688a = true;
                                }
                            } else if (c0294cArr[2].f3661f == null || c0294cArr[3].f3661f == null) {
                                f(2, 0, i9, 0, c0295d);
                                c0295d.d.f3866e.d(c0295d.q());
                                c0295d.f3695e.f3866e.d(c0295d.k());
                                c0295d.f3688a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0295d);
                                    c0295d.d.f3866e.f3851m = c0295d.q();
                                    c0295d.f3695e.f3866e.f3851m = c0295d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0296e.q()) + 0.5f), 1, (int) ((f3 * c0296e.k()) + 0.5f), c0295d);
                                    c0295d.d.f3866e.d(c0295d.q());
                                    c0295d.f3695e.f3866e.d(c0295d.k());
                                    c0295d.f3688a = true;
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
        ArrayList arrayList = this.f3839e;
        arrayList.clear();
        C0296e c0296e = this.d;
        c0296e.d.f();
        c0296e.f3695e.f();
        arrayList.add(c0296e.d);
        arrayList.add(c0296e.f3695e);
        Iterator it = c0296e.f3736q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0295d c0295d = (C0295d) it.next();
            if (c0295d instanceof s.h) {
                C0306i c0306i = new C0306i(c0295d);
                c0295d.d.f();
                c0295d.f3695e.f();
                c0306i.f3867f = ((s.h) c0295d).f3796u0;
                arrayList.add(c0306i);
            } else {
                if (c0295d.x()) {
                    if (c0295d.f3690b == null) {
                        c0295d.f3690b = new C0300c(c0295d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0295d.f3690b);
                } else {
                    arrayList.add(c0295d.d);
                }
                if (c0295d.y()) {
                    if (c0295d.f3692c == null) {
                        c0295d.f3692c = new C0300c(c0295d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0295d.f3692c);
                } else {
                    arrayList.add(c0295d.f3695e);
                }
                if (c0295d instanceof s.i) {
                    arrayList.add(new C0307j(c0295d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0312o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0312o abstractC0312o = (AbstractC0312o) it3.next();
            if (abstractC0312o.f3864b != c0296e) {
                abstractC0312o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0296e c0296e2 = this.f3836a;
        e(c0296e2.d, 0, arrayList2);
        e(c0296e2.f3695e, 1, arrayList2);
        this.f3837b = false;
    }

    public final int d(C0296e c0296e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0296e c0296e2 = c0296e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0312o abstractC0312o = ((C0309l) arrayList2.get(i4)).f3854a;
            if (!(abstractC0312o instanceof C0300c) ? !(i != 0 ? (abstractC0312o instanceof C0310m) : (abstractC0312o instanceof C0308k)) : ((C0300c) abstractC0312o).f3867f != i) {
                C0303f c0303f = (i == 0 ? c0296e2.d : c0296e2.f3695e).h;
                C0303f c0303f2 = (i == 0 ? c0296e2.d : c0296e2.f3695e).i;
                boolean contains = abstractC0312o.h.f3850l.contains(c0303f);
                C0303f c0303f3 = abstractC0312o.i;
                boolean contains2 = c0303f3.f3850l.contains(c0303f2);
                long j3 = abstractC0312o.j();
                C0303f c0303f4 = abstractC0312o.h;
                if (contains && contains2) {
                    long b2 = C0309l.b(c0303f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0309l.a(c0303f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0303f3.f3846f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0303f4.f3846f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0295d c0295d = abstractC0312o.f3864b;
                    if (i == 0) {
                        f2 = c0295d.f3694d0;
                    } else if (i == 1) {
                        f2 = c0295d.f3696e0;
                    } else {
                        c0295d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0303f4.f3846f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0303f3.f3846f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0309l.b(c0303f4, c0303f4.f3846f), c0303f4.f3846f + j3) : contains2 ? Math.max(-C0309l.a(c0303f3, c0303f3.f3846f), (-c0303f3.f3846f) + j3) : (abstractC0312o.j() + c0303f4.f3846f) - c0303f3.f3846f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0296e2 = c0296e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0312o abstractC0312o, int i, ArrayList arrayList) {
        C0303f c0303f;
        Iterator it = abstractC0312o.h.f3849k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0303f = abstractC0312o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            if (interfaceC0301d instanceof C0303f) {
                a((C0303f) interfaceC0301d, i, arrayList, null);
            } else if (interfaceC0301d instanceof AbstractC0312o) {
                a(((AbstractC0312o) interfaceC0301d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0303f.f3849k.iterator();
        while (it2.hasNext()) {
            InterfaceC0301d interfaceC0301d2 = (InterfaceC0301d) it2.next();
            if (interfaceC0301d2 instanceof C0303f) {
                a((C0303f) interfaceC0301d2, i, arrayList, null);
            } else if (interfaceC0301d2 instanceof AbstractC0312o) {
                a(((AbstractC0312o) interfaceC0301d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0310m) abstractC0312o).f3856k.f3849k.iterator();
            while (it3.hasNext()) {
                InterfaceC0301d interfaceC0301d3 = (InterfaceC0301d) it3.next();
                if (interfaceC0301d3 instanceof C0303f) {
                    a((C0303f) interfaceC0301d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0295d c0295d) {
        C0299b c0299b = this.f3841g;
        c0299b.f3827a = i;
        c0299b.f3828b = i3;
        c0299b.f3829c = i2;
        c0299b.d = i4;
        this.f3840f.b(c0295d, c0299b);
        c0295d.O(c0299b.f3830e);
        c0295d.L(c0299b.f3831f);
        c0295d.f3667E = c0299b.h;
        c0295d.I(c0299b.f3832g);
    }

    public final void g() {
        C0298a c0298a;
        Iterator it = this.f3836a.f3736q0.iterator();
        while (it.hasNext()) {
            C0295d c0295d = (C0295d) it.next();
            if (!c0295d.f3688a) {
                int[] iArr = c0295d.f3714p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0295d.f3716r;
                int i4 = c0295d.f3717s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0304g c0304g = c0295d.d.f3866e;
                boolean z4 = c0304g.f3848j;
                C0304g c0304g2 = c0295d.f3695e.f3866e;
                boolean z5 = c0304g2.f3848j;
                if (z4 && z5) {
                    f(1, c0304g.f3847g, 1, c0304g2.f3847g, c0295d);
                    c0295d.f3688a = true;
                } else if (z4 && z2) {
                    f(1, c0304g.f3847g, 2, c0304g2.f3847g, c0295d);
                    if (i2 == 3) {
                        c0295d.f3695e.f3866e.f3851m = c0295d.k();
                    } else {
                        c0295d.f3695e.f3866e.d(c0295d.k());
                        c0295d.f3688a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0304g.f3847g, 1, c0304g2.f3847g, c0295d);
                    if (i == 3) {
                        c0295d.d.f3866e.f3851m = c0295d.q();
                    } else {
                        c0295d.d.f3866e.d(c0295d.q());
                        c0295d.f3688a = true;
                    }
                }
                if (c0295d.f3688a && (c0298a = c0295d.f3695e.f3857l) != null) {
                    c0298a.d(c0295d.f3689a0);
                }
            }
        }
    }
}
