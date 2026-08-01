package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0339c;
import s.C0340d;
import s.C0341e;
import v.C0367f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347e {

    /* renamed from: a, reason: collision with root package name */
    public C0341e f3684a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3685b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3686c;
    public C0341e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3687e;

    /* renamed from: f, reason: collision with root package name */
    public C0367f f3688f;

    /* renamed from: g, reason: collision with root package name */
    public C0344b f3689g;
    public ArrayList h;

    public final void a(C0348f c0348f, int i, ArrayList arrayList, C0354l c0354l) {
        AbstractC0358p abstractC0358p = c0348f.d;
        if (abstractC0358p.f3713c == null) {
            C0341e c0341e = this.f3684a;
            if (abstractC0358p == c0341e.d || abstractC0358p == c0341e.f3529e) {
                return;
            }
            if (c0354l == null) {
                c0354l = new C0354l();
                c0354l.f3702a = null;
                c0354l.f3703b = new ArrayList();
                c0354l.f3702a = abstractC0358p;
                arrayList.add(c0354l);
            }
            abstractC0358p.f3713c = c0354l;
            c0354l.f3703b.add(abstractC0358p);
            C0348f c0348f2 = abstractC0358p.h;
            Iterator it = c0348f2.f3697k.iterator();
            while (it.hasNext()) {
                InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
                if (interfaceC0346d instanceof C0348f) {
                    a((C0348f) interfaceC0346d, i, arrayList, c0354l);
                }
            }
            C0348f c0348f3 = abstractC0358p.i;
            Iterator it2 = c0348f3.f3697k.iterator();
            while (it2.hasNext()) {
                InterfaceC0346d interfaceC0346d2 = (InterfaceC0346d) it2.next();
                if (interfaceC0346d2 instanceof C0348f) {
                    a((C0348f) interfaceC0346d2, i, arrayList, c0354l);
                }
            }
            if (i == 1 && (abstractC0358p instanceof C0355m)) {
                Iterator it3 = ((C0355m) abstractC0358p).f3704k.f3697k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0346d interfaceC0346d3 = (InterfaceC0346d) it3.next();
                    if (interfaceC0346d3 instanceof C0348f) {
                        a((C0348f) interfaceC0346d3, i, arrayList, c0354l);
                    }
                }
            }
            Iterator it4 = c0348f2.f3698l.iterator();
            while (it4.hasNext()) {
                a((C0348f) it4.next(), i, arrayList, c0354l);
            }
            Iterator it5 = c0348f3.f3698l.iterator();
            while (it5.hasNext()) {
                a((C0348f) it5.next(), i, arrayList, c0354l);
            }
            if (i == 1 && (abstractC0358p instanceof C0355m)) {
                Iterator it6 = ((C0355m) abstractC0358p).f3704k.f3698l.iterator();
                while (it6.hasNext()) {
                    a((C0348f) it6.next(), i, arrayList, c0354l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0341e c0341e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0341e.q0.iterator();
        while (it.hasNext()) {
            C0340d c0340d = (C0340d) it.next();
            int[] iArr = c0340d.f3549p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0340d.f3534g0 == 8) {
                c0340d.f3522a = true;
            } else {
                float f2 = c0340d.f3556w;
                if (f2 < 1.0f && i7 == 3) {
                    c0340d.f3551r = 2;
                }
                float f3 = c0340d.f3559z;
                if (f3 < 1.0f && i8 == 3) {
                    c0340d.f3552s = 2;
                }
                if (c0340d.f3518W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0340d.f3551r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0340d.f3552s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0340d.f3551r == 0) {
                            c0340d.f3551r = 3;
                        }
                        if (c0340d.f3552s == 0) {
                            c0340d.f3552s = 3;
                        }
                    }
                }
                C0339c c0339c = c0340d.f3506K;
                C0339c c0339c2 = c0340d.f3504I;
                if (i7 == 3 && c0340d.f3551r == 1 && (c0339c2.f3495f == null || c0339c.f3495f == null)) {
                    i7 = 2;
                }
                C0339c c0339c3 = c0340d.f3507L;
                C0339c c0339c4 = c0340d.f3505J;
                int i9 = (i8 == 3 && c0340d.f3552s == 1 && (c0339c4.f3495f == null || c0339c3.f3495f == null)) ? 2 : i8;
                C0353k c0353k = c0340d.d;
                c0353k.d = i7;
                int i10 = c0340d.f3551r;
                c0353k.f3711a = i10;
                C0355m c0355m = c0340d.f3529e;
                c0355m.d = i9;
                int i11 = c0340d.f3552s;
                c0355m.f3711a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0340d.q();
                    if (i7 == 4) {
                        i = (c0341e.q() - c0339c2.f3496g) - c0339c.f3496g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0340d.k();
                    if (i9 == 4) {
                        i2 = (c0341e.k() - c0339c4.f3496g) - c0339c3.f3496g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0340d);
                    c0340d.d.f3714e.d(c0340d.q());
                    c0340d.f3529e.f3714e.d(c0340d.k());
                    c0340d.f3522a = true;
                } else {
                    int[] iArr2 = c0341e.f3549p0;
                    C0339c[] c0339cArr = c0340d.f3512Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0340d);
                        }
                        int k3 = c0340d.k();
                        f(1, (int) ((k3 * c0340d.f3518W) + 0.5f), 1, k3, c0340d);
                        c0340d.d.f3714e.d(c0340d.q());
                        c0340d.f3529e.f3714e.d(c0340d.k());
                        c0340d.f3522a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0340d);
                        c0340d.d.f3714e.f3699m = c0340d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0341e.q()) + 0.5f), i9, c0340d.k(), c0340d);
                            c0340d.d.f3714e.d(c0340d.q());
                            c0340d.f3529e.f3714e.d(c0340d.k());
                            c0340d.f3522a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0339cArr[0].f3495f == null || c0339cArr[1].f3495f == null) {
                        f(2, 0, i9, 0, c0340d);
                        c0340d.d.f3714e.d(c0340d.q());
                        c0340d.f3529e.f3714e.d(c0340d.k());
                        c0340d.f3522a = true;
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
                                f(2, 0, 2, 0, c0340d);
                                c0340d.d.f3714e.f3699m = c0340d.q();
                                c0340d.f3529e.f3714e.f3699m = c0340d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0340d);
                            }
                            int q3 = c0340d.q();
                            float f4 = c0340d.f3518W;
                            if (c0340d.f3519X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0340d);
                            c0340d.d.f3714e.d(c0340d.q());
                            c0340d.f3529e.f3714e.d(c0340d.k());
                            c0340d.f3522a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0340d);
                            c0340d.f3529e.f3714e.f3699m = c0340d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0340d.q(), 1, (int) ((f3 * c0341e.k()) + 0.5f), c0340d);
                                    c0340d.d.f3714e.d(c0340d.q());
                                    c0340d.f3529e.f3714e.d(c0340d.k());
                                    c0340d.f3522a = true;
                                }
                            } else if (c0339cArr[2].f3495f == null || c0339cArr[3].f3495f == null) {
                                f(2, 0, i9, 0, c0340d);
                                c0340d.d.f3714e.d(c0340d.q());
                                c0340d.f3529e.f3714e.d(c0340d.k());
                                c0340d.f3522a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0340d);
                                    c0340d.d.f3714e.f3699m = c0340d.q();
                                    c0340d.f3529e.f3714e.f3699m = c0340d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0341e.q()) + 0.5f), 1, (int) ((f3 * c0341e.k()) + 0.5f), c0340d);
                                    c0340d.d.f3714e.d(c0340d.q());
                                    c0340d.f3529e.f3714e.d(c0340d.k());
                                    c0340d.f3522a = true;
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
        ArrayList arrayList = this.f3687e;
        arrayList.clear();
        C0341e c0341e = this.d;
        c0341e.d.f();
        c0341e.f3529e.f();
        arrayList.add(c0341e.d);
        arrayList.add(c0341e.f3529e);
        Iterator it = c0341e.q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0340d c0340d = (C0340d) it.next();
            if (c0340d instanceof s.h) {
                C0351i c0351i = new C0351i(c0340d);
                c0340d.d.f();
                c0340d.f3529e.f();
                c0351i.f3715f = ((s.h) c0340d).f3631u0;
                arrayList.add(c0351i);
            } else {
                if (c0340d.x()) {
                    if (c0340d.f3524b == null) {
                        c0340d.f3524b = new C0345c(c0340d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0340d.f3524b);
                } else {
                    arrayList.add(c0340d.d);
                }
                if (c0340d.y()) {
                    if (c0340d.f3526c == null) {
                        c0340d.f3526c = new C0345c(c0340d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0340d.f3526c);
                } else {
                    arrayList.add(c0340d.f3529e);
                }
                if (c0340d instanceof s.i) {
                    arrayList.add(new C0352j(c0340d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0358p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0358p abstractC0358p = (AbstractC0358p) it3.next();
            if (abstractC0358p.f3712b != c0341e) {
                abstractC0358p.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0341e c0341e2 = this.f3684a;
        e(c0341e2.d, 0, arrayList2);
        e(c0341e2.f3529e, 1, arrayList2);
        this.f3685b = false;
    }

    public final int d(C0341e c0341e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0341e c0341e2 = c0341e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0358p abstractC0358p = ((C0354l) arrayList2.get(i4)).f3702a;
            if (!(abstractC0358p instanceof C0345c) ? !(i != 0 ? (abstractC0358p instanceof C0355m) : (abstractC0358p instanceof C0353k)) : ((C0345c) abstractC0358p).f3715f != i) {
                C0348f c0348f = (i == 0 ? c0341e2.d : c0341e2.f3529e).h;
                C0348f c0348f2 = (i == 0 ? c0341e2.d : c0341e2.f3529e).i;
                boolean contains = abstractC0358p.h.f3698l.contains(c0348f);
                C0348f c0348f3 = abstractC0358p.i;
                boolean contains2 = c0348f3.f3698l.contains(c0348f2);
                long j3 = abstractC0358p.j();
                C0348f c0348f4 = abstractC0358p.h;
                if (contains && contains2) {
                    long b2 = C0354l.b(c0348f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0354l.a(c0348f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0348f3.f3694f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0348f4.f3694f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0340d c0340d = abstractC0358p.f3712b;
                    if (i == 0) {
                        f2 = c0340d.f3528d0;
                    } else if (i == 1) {
                        f2 = c0340d.f3530e0;
                    } else {
                        c0340d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0348f4.f3694f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0348f3.f3694f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0354l.b(c0348f4, c0348f4.f3694f), c0348f4.f3694f + j3) : contains2 ? Math.max(-C0354l.a(c0348f3, c0348f3.f3694f), (-c0348f3.f3694f) + j3) : (abstractC0358p.j() + c0348f4.f3694f) - c0348f3.f3694f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0341e2 = c0341e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0358p abstractC0358p, int i, ArrayList arrayList) {
        C0348f c0348f;
        Iterator it = abstractC0358p.h.f3697k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0348f = abstractC0358p.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            if (interfaceC0346d instanceof C0348f) {
                a((C0348f) interfaceC0346d, i, arrayList, null);
            } else if (interfaceC0346d instanceof AbstractC0358p) {
                a(((AbstractC0358p) interfaceC0346d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0348f.f3697k.iterator();
        while (it2.hasNext()) {
            InterfaceC0346d interfaceC0346d2 = (InterfaceC0346d) it2.next();
            if (interfaceC0346d2 instanceof C0348f) {
                a((C0348f) interfaceC0346d2, i, arrayList, null);
            } else if (interfaceC0346d2 instanceof AbstractC0358p) {
                a(((AbstractC0358p) interfaceC0346d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0355m) abstractC0358p).f3704k.f3697k.iterator();
            while (it3.hasNext()) {
                InterfaceC0346d interfaceC0346d3 = (InterfaceC0346d) it3.next();
                if (interfaceC0346d3 instanceof C0348f) {
                    a((C0348f) interfaceC0346d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0340d c0340d) {
        C0344b c0344b = this.f3689g;
        c0344b.f3675a = i;
        c0344b.f3676b = i3;
        c0344b.f3677c = i2;
        c0344b.d = i4;
        this.f3688f.b(c0340d, c0344b);
        c0340d.O(c0344b.f3678e);
        c0340d.L(c0344b.f3679f);
        c0340d.f3501E = c0344b.h;
        c0340d.I(c0344b.f3680g);
    }

    public final void g() {
        C0343a c0343a;
        Iterator it = this.f3684a.q0.iterator();
        while (it.hasNext()) {
            C0340d c0340d = (C0340d) it.next();
            if (!c0340d.f3522a) {
                int[] iArr = c0340d.f3549p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0340d.f3551r;
                int i4 = c0340d.f3552s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0349g c0349g = c0340d.d.f3714e;
                boolean z4 = c0349g.f3696j;
                C0349g c0349g2 = c0340d.f3529e.f3714e;
                boolean z5 = c0349g2.f3696j;
                if (z4 && z5) {
                    f(1, c0349g.f3695g, 1, c0349g2.f3695g, c0340d);
                    c0340d.f3522a = true;
                } else if (z4 && z2) {
                    f(1, c0349g.f3695g, 2, c0349g2.f3695g, c0340d);
                    if (i2 == 3) {
                        c0340d.f3529e.f3714e.f3699m = c0340d.k();
                    } else {
                        c0340d.f3529e.f3714e.d(c0340d.k());
                        c0340d.f3522a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0349g.f3695g, 1, c0349g2.f3695g, c0340d);
                    if (i == 3) {
                        c0340d.d.f3714e.f3699m = c0340d.q();
                    } else {
                        c0340d.d.f3714e.d(c0340d.q());
                        c0340d.f3522a = true;
                    }
                }
                if (c0340d.f3522a && (c0343a = c0340d.f3529e.f3705l) != null) {
                    c0343a.d(c0340d.f3523a0);
                }
            }
        }
    }
}
