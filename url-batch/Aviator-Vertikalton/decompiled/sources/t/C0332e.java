package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0324c;
import s.C0325d;
import s.C0326e;
import v.C0350f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332e {

    /* renamed from: a, reason: collision with root package name */
    public C0326e f4161a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4162b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4163c;

    /* renamed from: d, reason: collision with root package name */
    public C0326e f4164d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4165e;

    /* renamed from: f, reason: collision with root package name */
    public C0350f f4166f;

    /* renamed from: g, reason: collision with root package name */
    public C0329b f4167g;
    public ArrayList h;

    public final void a(C0333f c0333f, int i, ArrayList arrayList, C0339l c0339l) {
        AbstractC0342o abstractC0342o = c0333f.f4171d;
        if (abstractC0342o.f4193c == null) {
            C0326e c0326e = this.f4161a;
            if (abstractC0342o == c0326e.f4036d || abstractC0342o == c0326e.f4038e) {
                return;
            }
            if (c0339l == null) {
                c0339l = new C0339l();
                c0339l.f4181a = null;
                c0339l.f4182b = new ArrayList();
                c0339l.f4181a = abstractC0342o;
                arrayList.add(c0339l);
            }
            abstractC0342o.f4193c = c0339l;
            c0339l.f4182b.add(abstractC0342o);
            C0333f c0333f2 = abstractC0342o.h;
            Iterator it = c0333f2.f4176k.iterator();
            while (it.hasNext()) {
                InterfaceC0331d interfaceC0331d = (InterfaceC0331d) it.next();
                if (interfaceC0331d instanceof C0333f) {
                    a((C0333f) interfaceC0331d, i, arrayList, c0339l);
                }
            }
            C0333f c0333f3 = abstractC0342o.i;
            Iterator it2 = c0333f3.f4176k.iterator();
            while (it2.hasNext()) {
                InterfaceC0331d interfaceC0331d2 = (InterfaceC0331d) it2.next();
                if (interfaceC0331d2 instanceof C0333f) {
                    a((C0333f) interfaceC0331d2, i, arrayList, c0339l);
                }
            }
            if (i == 1 && (abstractC0342o instanceof C0340m)) {
                Iterator it3 = ((C0340m) abstractC0342o).f4183k.f4176k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0331d interfaceC0331d3 = (InterfaceC0331d) it3.next();
                    if (interfaceC0331d3 instanceof C0333f) {
                        a((C0333f) interfaceC0331d3, i, arrayList, c0339l);
                    }
                }
            }
            Iterator it4 = c0333f2.f4177l.iterator();
            while (it4.hasNext()) {
                a((C0333f) it4.next(), i, arrayList, c0339l);
            }
            Iterator it5 = c0333f3.f4177l.iterator();
            while (it5.hasNext()) {
                a((C0333f) it5.next(), i, arrayList, c0339l);
            }
            if (i == 1 && (abstractC0342o instanceof C0340m)) {
                Iterator it6 = ((C0340m) abstractC0342o).f4183k.f4177l.iterator();
                while (it6.hasNext()) {
                    a((C0333f) it6.next(), i, arrayList, c0339l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0326e c0326e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0326e.f4079q0.iterator();
        while (it.hasNext()) {
            C0325d c0325d = (C0325d) it.next();
            int[] iArr = c0325d.f4057p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0325d.f4043g0 == 8) {
                c0325d.f4030a = true;
            } else {
                float f2 = c0325d.f4064w;
                if (f2 < 1.0f && i7 == 3) {
                    c0325d.f4059r = 2;
                }
                float f3 = c0325d.f4067z;
                if (f3 < 1.0f && i8 == 3) {
                    c0325d.f4060s = 2;
                }
                if (c0325d.f4026W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0325d.f4059r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0325d.f4060s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0325d.f4059r == 0) {
                            c0325d.f4059r = 3;
                        }
                        if (c0325d.f4060s == 0) {
                            c0325d.f4060s = 3;
                        }
                    }
                }
                C0324c c0324c = c0325d.f4014K;
                C0324c c0324c2 = c0325d.f4012I;
                if (i7 == 3 && c0325d.f4059r == 1 && (c0324c2.f4003f == null || c0324c.f4003f == null)) {
                    i7 = 2;
                }
                C0324c c0324c3 = c0325d.f4015L;
                C0324c c0324c4 = c0325d.f4013J;
                int i9 = (i8 == 3 && c0325d.f4060s == 1 && (c0324c4.f4003f == null || c0324c3.f4003f == null)) ? 2 : i8;
                C0338k c0338k = c0325d.f4036d;
                c0338k.f4194d = i7;
                int i10 = c0325d.f4059r;
                c0338k.f4191a = i10;
                C0340m c0340m = c0325d.f4038e;
                c0340m.f4194d = i9;
                int i11 = c0325d.f4060s;
                c0340m.f4191a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0325d.q();
                    if (i7 == 4) {
                        i = (c0326e.q() - c0324c2.f4004g) - c0324c.f4004g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0325d.k();
                    if (i9 == 4) {
                        i2 = (c0326e.k() - c0324c4.f4004g) - c0324c3.f4004g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0325d);
                    c0325d.f4036d.f4195e.d(c0325d.q());
                    c0325d.f4038e.f4195e.d(c0325d.k());
                    c0325d.f4030a = true;
                } else {
                    int[] iArr2 = c0326e.f4057p0;
                    C0324c[] c0324cArr = c0325d.f4020Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0325d);
                        }
                        int k3 = c0325d.k();
                        f(1, (int) ((k3 * c0325d.f4026W) + 0.5f), 1, k3, c0325d);
                        c0325d.f4036d.f4195e.d(c0325d.q());
                        c0325d.f4038e.f4195e.d(c0325d.k());
                        c0325d.f4030a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0325d);
                        c0325d.f4036d.f4195e.f4178m = c0325d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0326e.q()) + 0.5f), i9, c0325d.k(), c0325d);
                            c0325d.f4036d.f4195e.d(c0325d.q());
                            c0325d.f4038e.f4195e.d(c0325d.k());
                            c0325d.f4030a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0324cArr[0].f4003f == null || c0324cArr[1].f4003f == null) {
                        f(2, 0, i9, 0, c0325d);
                        c0325d.f4036d.f4195e.d(c0325d.q());
                        c0325d.f4038e.f4195e.d(c0325d.k());
                        c0325d.f4030a = true;
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
                                f(2, 0, 2, 0, c0325d);
                                c0325d.f4036d.f4195e.f4178m = c0325d.q();
                                c0325d.f4038e.f4195e.f4178m = c0325d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0325d);
                            }
                            int q3 = c0325d.q();
                            float f4 = c0325d.f4026W;
                            if (c0325d.f4027X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0325d);
                            c0325d.f4036d.f4195e.d(c0325d.q());
                            c0325d.f4038e.f4195e.d(c0325d.k());
                            c0325d.f4030a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0325d);
                            c0325d.f4038e.f4195e.f4178m = c0325d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0325d.q(), 1, (int) ((f3 * c0326e.k()) + 0.5f), c0325d);
                                    c0325d.f4036d.f4195e.d(c0325d.q());
                                    c0325d.f4038e.f4195e.d(c0325d.k());
                                    c0325d.f4030a = true;
                                }
                            } else if (c0324cArr[2].f4003f == null || c0324cArr[3].f4003f == null) {
                                f(2, 0, i9, 0, c0325d);
                                c0325d.f4036d.f4195e.d(c0325d.q());
                                c0325d.f4038e.f4195e.d(c0325d.k());
                                c0325d.f4030a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0325d);
                                    c0325d.f4036d.f4195e.f4178m = c0325d.q();
                                    c0325d.f4038e.f4195e.f4178m = c0325d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0326e.q()) + 0.5f), 1, (int) ((f3 * c0326e.k()) + 0.5f), c0325d);
                                    c0325d.f4036d.f4195e.d(c0325d.q());
                                    c0325d.f4038e.f4195e.d(c0325d.k());
                                    c0325d.f4030a = true;
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
        ArrayList arrayList = this.f4165e;
        arrayList.clear();
        C0326e c0326e = this.f4164d;
        c0326e.f4036d.f();
        c0326e.f4038e.f();
        arrayList.add(c0326e.f4036d);
        arrayList.add(c0326e.f4038e);
        Iterator it = c0326e.f4079q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0325d c0325d = (C0325d) it.next();
            if (c0325d instanceof s.h) {
                C0336i c0336i = new C0336i(c0325d);
                c0325d.f4036d.f();
                c0325d.f4038e.f();
                c0336i.f4196f = ((s.h) c0325d).f4140u0;
                arrayList.add(c0336i);
            } else {
                if (c0325d.x()) {
                    if (c0325d.f4032b == null) {
                        c0325d.f4032b = new C0330c(c0325d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0325d.f4032b);
                } else {
                    arrayList.add(c0325d.f4036d);
                }
                if (c0325d.y()) {
                    if (c0325d.f4034c == null) {
                        c0325d.f4034c = new C0330c(c0325d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0325d.f4034c);
                } else {
                    arrayList.add(c0325d.f4038e);
                }
                if (c0325d instanceof s.i) {
                    arrayList.add(new C0337j(c0325d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0342o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0342o abstractC0342o = (AbstractC0342o) it3.next();
            if (abstractC0342o.f4192b != c0326e) {
                abstractC0342o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0326e c0326e2 = this.f4161a;
        e(c0326e2.f4036d, 0, arrayList2);
        e(c0326e2.f4038e, 1, arrayList2);
        this.f4162b = false;
    }

    public final int d(C0326e c0326e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0326e c0326e2 = c0326e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0342o abstractC0342o = ((C0339l) arrayList2.get(i4)).f4181a;
            if (!(abstractC0342o instanceof C0330c) ? !(i != 0 ? (abstractC0342o instanceof C0340m) : (abstractC0342o instanceof C0338k)) : ((C0330c) abstractC0342o).f4196f != i) {
                C0333f c0333f = (i == 0 ? c0326e2.f4036d : c0326e2.f4038e).h;
                C0333f c0333f2 = (i == 0 ? c0326e2.f4036d : c0326e2.f4038e).i;
                boolean contains = abstractC0342o.h.f4177l.contains(c0333f);
                C0333f c0333f3 = abstractC0342o.i;
                boolean contains2 = c0333f3.f4177l.contains(c0333f2);
                long j3 = abstractC0342o.j();
                C0333f c0333f4 = abstractC0342o.h;
                if (contains && contains2) {
                    long b2 = C0339l.b(c0333f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0339l.a(c0333f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0333f3.f4173f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0333f4.f4173f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0325d c0325d = abstractC0342o.f4192b;
                    if (i == 0) {
                        f2 = c0325d.f4037d0;
                    } else if (i == 1) {
                        f2 = c0325d.f4039e0;
                    } else {
                        c0325d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0333f4.f4173f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0333f3.f4173f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0339l.b(c0333f4, c0333f4.f4173f), c0333f4.f4173f + j3) : contains2 ? Math.max(-C0339l.a(c0333f3, c0333f3.f4173f), (-c0333f3.f4173f) + j3) : (abstractC0342o.j() + c0333f4.f4173f) - c0333f3.f4173f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0326e2 = c0326e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0342o abstractC0342o, int i, ArrayList arrayList) {
        C0333f c0333f;
        Iterator it = abstractC0342o.h.f4176k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0333f = abstractC0342o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0331d interfaceC0331d = (InterfaceC0331d) it.next();
            if (interfaceC0331d instanceof C0333f) {
                a((C0333f) interfaceC0331d, i, arrayList, null);
            } else if (interfaceC0331d instanceof AbstractC0342o) {
                a(((AbstractC0342o) interfaceC0331d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0333f.f4176k.iterator();
        while (it2.hasNext()) {
            InterfaceC0331d interfaceC0331d2 = (InterfaceC0331d) it2.next();
            if (interfaceC0331d2 instanceof C0333f) {
                a((C0333f) interfaceC0331d2, i, arrayList, null);
            } else if (interfaceC0331d2 instanceof AbstractC0342o) {
                a(((AbstractC0342o) interfaceC0331d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0340m) abstractC0342o).f4183k.f4176k.iterator();
            while (it3.hasNext()) {
                InterfaceC0331d interfaceC0331d3 = (InterfaceC0331d) it3.next();
                if (interfaceC0331d3 instanceof C0333f) {
                    a((C0333f) interfaceC0331d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0325d c0325d) {
        C0329b c0329b = this.f4167g;
        c0329b.f4151a = i;
        c0329b.f4152b = i3;
        c0329b.f4153c = i2;
        c0329b.f4154d = i4;
        this.f4166f.b(c0325d, c0329b);
        c0325d.O(c0329b.f4155e);
        c0325d.L(c0329b.f4156f);
        c0325d.f4009E = c0329b.h;
        c0325d.I(c0329b.f4157g);
    }

    public final void g() {
        C0328a c0328a;
        Iterator it = this.f4161a.f4079q0.iterator();
        while (it.hasNext()) {
            C0325d c0325d = (C0325d) it.next();
            if (!c0325d.f4030a) {
                int[] iArr = c0325d.f4057p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0325d.f4059r;
                int i4 = c0325d.f4060s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0334g c0334g = c0325d.f4036d.f4195e;
                boolean z4 = c0334g.f4175j;
                C0334g c0334g2 = c0325d.f4038e.f4195e;
                boolean z5 = c0334g2.f4175j;
                if (z4 && z5) {
                    f(1, c0334g.f4174g, 1, c0334g2.f4174g, c0325d);
                    c0325d.f4030a = true;
                } else if (z4 && z2) {
                    f(1, c0334g.f4174g, 2, c0334g2.f4174g, c0325d);
                    if (i2 == 3) {
                        c0325d.f4038e.f4195e.f4178m = c0325d.k();
                    } else {
                        c0325d.f4038e.f4195e.d(c0325d.k());
                        c0325d.f4030a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0334g.f4174g, 1, c0334g2.f4174g, c0325d);
                    if (i == 3) {
                        c0325d.f4036d.f4195e.f4178m = c0325d.q();
                    } else {
                        c0325d.f4036d.f4195e.d(c0325d.q());
                        c0325d.f4030a = true;
                    }
                }
                if (c0325d.f4030a && (c0328a = c0325d.f4038e.f4184l) != null) {
                    c0328a.d(c0325d.f4031a0);
                }
            }
        }
    }
}
