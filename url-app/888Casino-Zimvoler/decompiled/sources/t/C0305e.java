package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0297c;
import s.C0298d;
import s.C0299e;
import v.C0324f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305e {

    /* renamed from: a, reason: collision with root package name */
    public C0299e f3746a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3748c;
    public C0299e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3749e;

    /* renamed from: f, reason: collision with root package name */
    public C0324f f3750f;

    /* renamed from: g, reason: collision with root package name */
    public C0302b f3751g;
    public ArrayList h;

    public final void a(C0306f c0306f, int i, ArrayList arrayList, C0312l c0312l) {
        AbstractC0315o abstractC0315o = c0306f.d;
        if (abstractC0315o.f3775c == null) {
            C0299e c0299e = this.f3746a;
            if (abstractC0315o == c0299e.d || abstractC0315o == c0299e.f3624e) {
                return;
            }
            if (c0312l == null) {
                c0312l = new C0312l();
                c0312l.f3764a = null;
                c0312l.f3765b = new ArrayList();
                c0312l.f3764a = abstractC0315o;
                arrayList.add(c0312l);
            }
            abstractC0315o.f3775c = c0312l;
            c0312l.f3765b.add(abstractC0315o);
            C0306f c0306f2 = abstractC0315o.h;
            Iterator it = c0306f2.f3759k.iterator();
            while (it.hasNext()) {
                InterfaceC0304d interfaceC0304d = (InterfaceC0304d) it.next();
                if (interfaceC0304d instanceof C0306f) {
                    a((C0306f) interfaceC0304d, i, arrayList, c0312l);
                }
            }
            C0306f c0306f3 = abstractC0315o.i;
            Iterator it2 = c0306f3.f3759k.iterator();
            while (it2.hasNext()) {
                InterfaceC0304d interfaceC0304d2 = (InterfaceC0304d) it2.next();
                if (interfaceC0304d2 instanceof C0306f) {
                    a((C0306f) interfaceC0304d2, i, arrayList, c0312l);
                }
            }
            if (i == 1 && (abstractC0315o instanceof C0313m)) {
                Iterator it3 = ((C0313m) abstractC0315o).f3766k.f3759k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0304d interfaceC0304d3 = (InterfaceC0304d) it3.next();
                    if (interfaceC0304d3 instanceof C0306f) {
                        a((C0306f) interfaceC0304d3, i, arrayList, c0312l);
                    }
                }
            }
            Iterator it4 = c0306f2.f3760l.iterator();
            while (it4.hasNext()) {
                a((C0306f) it4.next(), i, arrayList, c0312l);
            }
            Iterator it5 = c0306f3.f3760l.iterator();
            while (it5.hasNext()) {
                a((C0306f) it5.next(), i, arrayList, c0312l);
            }
            if (i == 1 && (abstractC0315o instanceof C0313m)) {
                Iterator it6 = ((C0313m) abstractC0315o).f3766k.f3760l.iterator();
                while (it6.hasNext()) {
                    a((C0306f) it6.next(), i, arrayList, c0312l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0299e c0299e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0299e.f3666q0.iterator();
        while (it.hasNext()) {
            C0298d c0298d = (C0298d) it.next();
            int[] iArr = c0298d.f3644p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0298d.f3629g0 == 8) {
                c0298d.f3617a = true;
            } else {
                float f2 = c0298d.f3651w;
                if (f2 < 1.0f && i7 == 3) {
                    c0298d.f3646r = 2;
                }
                float f3 = c0298d.f3654z;
                if (f3 < 1.0f && i8 == 3) {
                    c0298d.f3647s = 2;
                }
                if (c0298d.f3613W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0298d.f3646r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0298d.f3647s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0298d.f3646r == 0) {
                            c0298d.f3646r = 3;
                        }
                        if (c0298d.f3647s == 0) {
                            c0298d.f3647s = 3;
                        }
                    }
                }
                C0297c c0297c = c0298d.f3601K;
                C0297c c0297c2 = c0298d.f3599I;
                if (i7 == 3 && c0298d.f3646r == 1 && (c0297c2.f3590f == null || c0297c.f3590f == null)) {
                    i7 = 2;
                }
                C0297c c0297c3 = c0298d.f3602L;
                C0297c c0297c4 = c0298d.f3600J;
                int i9 = (i8 == 3 && c0298d.f3647s == 1 && (c0297c4.f3590f == null || c0297c3.f3590f == null)) ? 2 : i8;
                C0311k c0311k = c0298d.d;
                c0311k.d = i7;
                int i10 = c0298d.f3646r;
                c0311k.f3773a = i10;
                C0313m c0313m = c0298d.f3624e;
                c0313m.d = i9;
                int i11 = c0298d.f3647s;
                c0313m.f3773a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0298d.q();
                    if (i7 == 4) {
                        i = (c0299e.q() - c0297c2.f3591g) - c0297c.f3591g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0298d.k();
                    if (i9 == 4) {
                        i2 = (c0299e.k() - c0297c4.f3591g) - c0297c3.f3591g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0298d);
                    c0298d.d.f3776e.d(c0298d.q());
                    c0298d.f3624e.f3776e.d(c0298d.k());
                    c0298d.f3617a = true;
                } else {
                    int[] iArr2 = c0299e.f3644p0;
                    C0297c[] c0297cArr = c0298d.f3607Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0298d);
                        }
                        int k3 = c0298d.k();
                        f(1, (int) ((k3 * c0298d.f3613W) + 0.5f), 1, k3, c0298d);
                        c0298d.d.f3776e.d(c0298d.q());
                        c0298d.f3624e.f3776e.d(c0298d.k());
                        c0298d.f3617a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0298d);
                        c0298d.d.f3776e.f3761m = c0298d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0299e.q()) + 0.5f), i9, c0298d.k(), c0298d);
                            c0298d.d.f3776e.d(c0298d.q());
                            c0298d.f3624e.f3776e.d(c0298d.k());
                            c0298d.f3617a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0297cArr[0].f3590f == null || c0297cArr[1].f3590f == null) {
                        f(2, 0, i9, 0, c0298d);
                        c0298d.d.f3776e.d(c0298d.q());
                        c0298d.f3624e.f3776e.d(c0298d.k());
                        c0298d.f3617a = true;
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
                                f(2, 0, 2, 0, c0298d);
                                c0298d.d.f3776e.f3761m = c0298d.q();
                                c0298d.f3624e.f3776e.f3761m = c0298d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0298d);
                            }
                            int q3 = c0298d.q();
                            float f4 = c0298d.f3613W;
                            if (c0298d.f3614X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0298d);
                            c0298d.d.f3776e.d(c0298d.q());
                            c0298d.f3624e.f3776e.d(c0298d.k());
                            c0298d.f3617a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0298d);
                            c0298d.f3624e.f3776e.f3761m = c0298d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0298d.q(), 1, (int) ((f3 * c0299e.k()) + 0.5f), c0298d);
                                    c0298d.d.f3776e.d(c0298d.q());
                                    c0298d.f3624e.f3776e.d(c0298d.k());
                                    c0298d.f3617a = true;
                                }
                            } else if (c0297cArr[2].f3590f == null || c0297cArr[3].f3590f == null) {
                                f(2, 0, i9, 0, c0298d);
                                c0298d.d.f3776e.d(c0298d.q());
                                c0298d.f3624e.f3776e.d(c0298d.k());
                                c0298d.f3617a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0298d);
                                    c0298d.d.f3776e.f3761m = c0298d.q();
                                    c0298d.f3624e.f3776e.f3761m = c0298d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0299e.q()) + 0.5f), 1, (int) ((f3 * c0299e.k()) + 0.5f), c0298d);
                                    c0298d.d.f3776e.d(c0298d.q());
                                    c0298d.f3624e.f3776e.d(c0298d.k());
                                    c0298d.f3617a = true;
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
        ArrayList arrayList = this.f3749e;
        arrayList.clear();
        C0299e c0299e = this.d;
        c0299e.d.f();
        c0299e.f3624e.f();
        arrayList.add(c0299e.d);
        arrayList.add(c0299e.f3624e);
        Iterator it = c0299e.f3666q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0298d c0298d = (C0298d) it.next();
            if (c0298d instanceof s.h) {
                C0309i c0309i = new C0309i(c0298d);
                c0298d.d.f();
                c0298d.f3624e.f();
                c0309i.f3777f = ((s.h) c0298d).f3727u0;
                arrayList.add(c0309i);
            } else {
                if (c0298d.x()) {
                    if (c0298d.f3619b == null) {
                        c0298d.f3619b = new C0303c(c0298d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0298d.f3619b);
                } else {
                    arrayList.add(c0298d.d);
                }
                if (c0298d.y()) {
                    if (c0298d.f3621c == null) {
                        c0298d.f3621c = new C0303c(c0298d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0298d.f3621c);
                } else {
                    arrayList.add(c0298d.f3624e);
                }
                if (c0298d instanceof s.i) {
                    arrayList.add(new C0310j(c0298d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0315o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0315o abstractC0315o = (AbstractC0315o) it3.next();
            if (abstractC0315o.f3774b != c0299e) {
                abstractC0315o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0299e c0299e2 = this.f3746a;
        e(c0299e2.d, 0, arrayList2);
        e(c0299e2.f3624e, 1, arrayList2);
        this.f3747b = false;
    }

    public final int d(C0299e c0299e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0299e c0299e2 = c0299e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0315o abstractC0315o = ((C0312l) arrayList2.get(i4)).f3764a;
            if (!(abstractC0315o instanceof C0303c) ? !(i != 0 ? (abstractC0315o instanceof C0313m) : (abstractC0315o instanceof C0311k)) : ((C0303c) abstractC0315o).f3777f != i) {
                C0306f c0306f = (i == 0 ? c0299e2.d : c0299e2.f3624e).h;
                C0306f c0306f2 = (i == 0 ? c0299e2.d : c0299e2.f3624e).i;
                boolean contains = abstractC0315o.h.f3760l.contains(c0306f);
                C0306f c0306f3 = abstractC0315o.i;
                boolean contains2 = c0306f3.f3760l.contains(c0306f2);
                long j3 = abstractC0315o.j();
                C0306f c0306f4 = abstractC0315o.h;
                if (contains && contains2) {
                    long b2 = C0312l.b(c0306f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0312l.a(c0306f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0306f3.f3756f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0306f4.f3756f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0298d c0298d = abstractC0315o.f3774b;
                    if (i == 0) {
                        f2 = c0298d.f3623d0;
                    } else if (i == 1) {
                        f2 = c0298d.f3625e0;
                    } else {
                        c0298d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0306f4.f3756f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0306f3.f3756f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0312l.b(c0306f4, c0306f4.f3756f), c0306f4.f3756f + j3) : contains2 ? Math.max(-C0312l.a(c0306f3, c0306f3.f3756f), (-c0306f3.f3756f) + j3) : (abstractC0315o.j() + c0306f4.f3756f) - c0306f3.f3756f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0299e2 = c0299e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0315o abstractC0315o, int i, ArrayList arrayList) {
        C0306f c0306f;
        Iterator it = abstractC0315o.h.f3759k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0306f = abstractC0315o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) it.next();
            if (interfaceC0304d instanceof C0306f) {
                a((C0306f) interfaceC0304d, i, arrayList, null);
            } else if (interfaceC0304d instanceof AbstractC0315o) {
                a(((AbstractC0315o) interfaceC0304d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0306f.f3759k.iterator();
        while (it2.hasNext()) {
            InterfaceC0304d interfaceC0304d2 = (InterfaceC0304d) it2.next();
            if (interfaceC0304d2 instanceof C0306f) {
                a((C0306f) interfaceC0304d2, i, arrayList, null);
            } else if (interfaceC0304d2 instanceof AbstractC0315o) {
                a(((AbstractC0315o) interfaceC0304d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0313m) abstractC0315o).f3766k.f3759k.iterator();
            while (it3.hasNext()) {
                InterfaceC0304d interfaceC0304d3 = (InterfaceC0304d) it3.next();
                if (interfaceC0304d3 instanceof C0306f) {
                    a((C0306f) interfaceC0304d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0298d c0298d) {
        C0302b c0302b = this.f3751g;
        c0302b.f3737a = i;
        c0302b.f3738b = i3;
        c0302b.f3739c = i2;
        c0302b.d = i4;
        this.f3750f.b(c0298d, c0302b);
        c0298d.O(c0302b.f3740e);
        c0298d.L(c0302b.f3741f);
        c0298d.f3596E = c0302b.h;
        c0298d.I(c0302b.f3742g);
    }

    public final void g() {
        C0301a c0301a;
        Iterator it = this.f3746a.f3666q0.iterator();
        while (it.hasNext()) {
            C0298d c0298d = (C0298d) it.next();
            if (!c0298d.f3617a) {
                int[] iArr = c0298d.f3644p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0298d.f3646r;
                int i4 = c0298d.f3647s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0307g c0307g = c0298d.d.f3776e;
                boolean z4 = c0307g.f3758j;
                C0307g c0307g2 = c0298d.f3624e.f3776e;
                boolean z5 = c0307g2.f3758j;
                if (z4 && z5) {
                    f(1, c0307g.f3757g, 1, c0307g2.f3757g, c0298d);
                    c0298d.f3617a = true;
                } else if (z4 && z2) {
                    f(1, c0307g.f3757g, 2, c0307g2.f3757g, c0298d);
                    if (i2 == 3) {
                        c0298d.f3624e.f3776e.f3761m = c0298d.k();
                    } else {
                        c0298d.f3624e.f3776e.d(c0298d.k());
                        c0298d.f3617a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0307g.f3757g, 1, c0307g2.f3757g, c0298d);
                    if (i == 3) {
                        c0298d.d.f3776e.f3761m = c0298d.q();
                    } else {
                        c0298d.d.f3776e.d(c0298d.q());
                        c0298d.f3617a = true;
                    }
                }
                if (c0298d.f3617a && (c0301a = c0298d.f3624e.f3767l) != null) {
                    c0301a.d(c0298d.f3618a0);
                }
            }
        }
    }
}
