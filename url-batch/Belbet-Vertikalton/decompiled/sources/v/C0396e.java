package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import u.C0386c;
import u.C0387d;
import u.C0388e;
import x.C0415f;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396e {

    /* renamed from: a, reason: collision with root package name */
    public C0388e f4408a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4409b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4410c;

    /* renamed from: d, reason: collision with root package name */
    public C0388e f4411d;
    public ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public C0415f f4412f;

    /* renamed from: g, reason: collision with root package name */
    public C0393b f4413g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4414h;

    public final void a(C0397f c0397f, int i, ArrayList arrayList, C0403l c0403l) {
        AbstractC0406o abstractC0406o = c0397f.f4418d;
        if (abstractC0406o.f4438c == null) {
            C0388e c0388e = this.f4408a;
            if (abstractC0406o == c0388e.f4260d || abstractC0406o == c0388e.e) {
                return;
            }
            if (c0403l == null) {
                c0403l = new C0403l();
                c0403l.f4427a = null;
                c0403l.f4428b = new ArrayList();
                c0403l.f4427a = abstractC0406o;
                arrayList.add(c0403l);
            }
            abstractC0406o.f4438c = c0403l;
            c0403l.f4428b.add(abstractC0406o);
            C0397f c0397f2 = abstractC0406o.f4442h;
            Iterator it = c0397f2.f4422k.iterator();
            while (it.hasNext()) {
                InterfaceC0395d interfaceC0395d = (InterfaceC0395d) it.next();
                if (interfaceC0395d instanceof C0397f) {
                    a((C0397f) interfaceC0395d, i, arrayList, c0403l);
                }
            }
            C0397f c0397f3 = abstractC0406o.i;
            Iterator it2 = c0397f3.f4422k.iterator();
            while (it2.hasNext()) {
                InterfaceC0395d interfaceC0395d2 = (InterfaceC0395d) it2.next();
                if (interfaceC0395d2 instanceof C0397f) {
                    a((C0397f) interfaceC0395d2, i, arrayList, c0403l);
                }
            }
            if (i == 1 && (abstractC0406o instanceof C0404m)) {
                Iterator it3 = ((C0404m) abstractC0406o).f4429k.f4422k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0395d interfaceC0395d3 = (InterfaceC0395d) it3.next();
                    if (interfaceC0395d3 instanceof C0397f) {
                        a((C0397f) interfaceC0395d3, i, arrayList, c0403l);
                    }
                }
            }
            Iterator it4 = c0397f2.f4423l.iterator();
            while (it4.hasNext()) {
                a((C0397f) it4.next(), i, arrayList, c0403l);
            }
            Iterator it5 = c0397f3.f4423l.iterator();
            while (it5.hasNext()) {
                a((C0397f) it5.next(), i, arrayList, c0403l);
            }
            if (i == 1 && (abstractC0406o instanceof C0404m)) {
                Iterator it6 = ((C0404m) abstractC0406o).f4429k.f4423l.iterator();
                while (it6.hasNext()) {
                    a((C0397f) it6.next(), i, arrayList, c0403l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0388e c0388e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0388e.f4303q0.iterator();
        while (it.hasNext()) {
            C0387d c0387d = (C0387d) it.next();
            int[] iArr = c0387d.f4281p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0387d.f4266g0 == 8) {
                c0387d.f4254a = true;
            } else {
                float f2 = c0387d.f4288w;
                if (f2 < 1.0f && i7 == 3) {
                    c0387d.f4283r = 2;
                }
                float f3 = c0387d.f4291z;
                if (f3 < 1.0f && i8 == 3) {
                    c0387d.f4284s = 2;
                }
                if (c0387d.f4250W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0387d.f4283r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0387d.f4284s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0387d.f4283r == 0) {
                            c0387d.f4283r = 3;
                        }
                        if (c0387d.f4284s == 0) {
                            c0387d.f4284s = 3;
                        }
                    }
                }
                C0386c c0386c = c0387d.f4238K;
                C0386c c0386c2 = c0387d.f4236I;
                if (i7 == 3 && c0387d.f4283r == 1 && (c0386c2.f4226f == null || c0386c.f4226f == null)) {
                    i7 = 2;
                }
                C0386c c0386c3 = c0387d.f4239L;
                C0386c c0386c4 = c0387d.f4237J;
                int i9 = (i8 == 3 && c0387d.f4284s == 1 && (c0386c4.f4226f == null || c0386c3.f4226f == null)) ? 2 : i8;
                C0402k c0402k = c0387d.f4260d;
                c0402k.f4439d = i7;
                int i10 = c0387d.f4283r;
                c0402k.f4436a = i10;
                C0404m c0404m = c0387d.e;
                c0404m.f4439d = i9;
                int i11 = c0387d.f4284s;
                c0404m.f4436a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0387d.q();
                    if (i7 == 4) {
                        i = (c0388e.q() - c0386c2.f4227g) - c0386c.f4227g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0387d.k();
                    if (i9 == 4) {
                        i2 = (c0388e.k() - c0386c4.f4227g) - c0386c3.f4227g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0387d);
                    c0387d.f4260d.e.d(c0387d.q());
                    c0387d.e.e.d(c0387d.k());
                    c0387d.f4254a = true;
                } else {
                    int[] iArr2 = c0388e.f4281p0;
                    C0386c[] c0386cArr = c0387d.f4244Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0387d);
                        }
                        int k3 = c0387d.k();
                        f(1, (int) ((k3 * c0387d.f4250W) + 0.5f), 1, k3, c0387d);
                        c0387d.f4260d.e.d(c0387d.q());
                        c0387d.e.e.d(c0387d.k());
                        c0387d.f4254a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0387d);
                        c0387d.f4260d.e.f4424m = c0387d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0388e.q()) + 0.5f), i9, c0387d.k(), c0387d);
                            c0387d.f4260d.e.d(c0387d.q());
                            c0387d.e.e.d(c0387d.k());
                            c0387d.f4254a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0386cArr[0].f4226f == null || c0386cArr[1].f4226f == null) {
                        f(2, 0, i9, 0, c0387d);
                        c0387d.f4260d.e.d(c0387d.q());
                        c0387d.e.e.d(c0387d.k());
                        c0387d.f4254a = true;
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
                                f(2, 0, 2, 0, c0387d);
                                c0387d.f4260d.e.f4424m = c0387d.q();
                                c0387d.e.e.f4424m = c0387d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0387d);
                            }
                            int q3 = c0387d.q();
                            float f4 = c0387d.f4250W;
                            if (c0387d.f4251X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0387d);
                            c0387d.f4260d.e.d(c0387d.q());
                            c0387d.e.e.d(c0387d.k());
                            c0387d.f4254a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0387d);
                            c0387d.e.e.f4424m = c0387d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0387d.q(), 1, (int) ((f3 * c0388e.k()) + 0.5f), c0387d);
                                    c0387d.f4260d.e.d(c0387d.q());
                                    c0387d.e.e.d(c0387d.k());
                                    c0387d.f4254a = true;
                                }
                            } else if (c0386cArr[2].f4226f == null || c0386cArr[3].f4226f == null) {
                                f(2, 0, i9, 0, c0387d);
                                c0387d.f4260d.e.d(c0387d.q());
                                c0387d.e.e.d(c0387d.k());
                                c0387d.f4254a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0387d);
                                    c0387d.f4260d.e.f4424m = c0387d.q();
                                    c0387d.e.e.f4424m = c0387d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0388e.q()) + 0.5f), 1, (int) ((f3 * c0388e.k()) + 0.5f), c0387d);
                                    c0387d.f4260d.e.d(c0387d.q());
                                    c0387d.e.e.d(c0387d.k());
                                    c0387d.f4254a = true;
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
        ArrayList arrayList = this.e;
        arrayList.clear();
        C0388e c0388e = this.f4411d;
        c0388e.f4260d.f();
        c0388e.e.f();
        arrayList.add(c0388e.f4260d);
        arrayList.add(c0388e.e);
        Iterator it = c0388e.f4303q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0387d c0387d = (C0387d) it.next();
            if (c0387d instanceof u.h) {
                C0400i c0400i = new C0400i(c0387d);
                c0387d.f4260d.f();
                c0387d.e.f();
                c0400i.f4440f = ((u.h) c0387d).f4364u0;
                arrayList.add(c0400i);
            } else {
                if (c0387d.x()) {
                    if (c0387d.f4256b == null) {
                        c0387d.f4256b = new C0394c(c0387d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0387d.f4256b);
                } else {
                    arrayList.add(c0387d.f4260d);
                }
                if (c0387d.y()) {
                    if (c0387d.f4258c == null) {
                        c0387d.f4258c = new C0394c(c0387d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0387d.f4258c);
                } else {
                    arrayList.add(c0387d.e);
                }
                if (c0387d instanceof u.i) {
                    arrayList.add(new C0401j(c0387d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0406o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0406o abstractC0406o = (AbstractC0406o) it3.next();
            if (abstractC0406o.f4437b != c0388e) {
                abstractC0406o.d();
            }
        }
        ArrayList arrayList2 = this.f4414h;
        arrayList2.clear();
        C0388e c0388e2 = this.f4408a;
        e(c0388e2.f4260d, 0, arrayList2);
        e(c0388e2.e, 1, arrayList2);
        this.f4409b = false;
    }

    public final int d(C0388e c0388e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0388e c0388e2 = c0388e;
        ArrayList arrayList2 = this.f4414h;
        int size = arrayList2.size();
        int i4 = 0;
        long j = 0;
        while (i4 < size) {
            AbstractC0406o abstractC0406o = ((C0403l) arrayList2.get(i4)).f4427a;
            if (!(abstractC0406o instanceof C0394c) ? !(i != 0 ? (abstractC0406o instanceof C0404m) : (abstractC0406o instanceof C0402k)) : ((C0394c) abstractC0406o).f4440f != i) {
                C0397f c0397f = (i == 0 ? c0388e2.f4260d : c0388e2.e).f4442h;
                C0397f c0397f2 = (i == 0 ? c0388e2.f4260d : c0388e2.e).i;
                boolean contains = abstractC0406o.f4442h.f4423l.contains(c0397f);
                C0397f c0397f3 = abstractC0406o.i;
                boolean contains2 = c0397f3.f4423l.contains(c0397f2);
                long j2 = abstractC0406o.j();
                C0397f c0397f4 = abstractC0406o.f4442h;
                if (contains && contains2) {
                    long b2 = C0403l.b(c0397f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0403l.a(c0397f3, 0L);
                    long j3 = b2 - j2;
                    int i5 = c0397f3.f4419f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j3 >= (-i5)) {
                        j3 += i5;
                    }
                    long j4 = (-a2) - j2;
                    long j5 = c0397f4.f4419f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C0387d c0387d = abstractC0406o.f4437b;
                    if (i == 0) {
                        f2 = c0387d.f4261d0;
                    } else if (i == 1) {
                        f2 = c0387d.f4262e0;
                    } else {
                        c0387d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j3 / (1.0f - f2)) + (j6 / f2)) : 0L;
                    max = (c0397f4.f4419f + ((((long) ((f3 * f2) + 0.5f)) + j2) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0397f3.f4419f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0403l.b(c0397f4, c0397f4.f4419f), c0397f4.f4419f + j2) : contains2 ? Math.max(-C0403l.a(c0397f3, c0397f3.f4419f), (-c0397f3.f4419f) + j2) : (abstractC0406o.j() + c0397f4.f4419f) - c0397f3.f4419f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j = Math.max(j, max);
            i4 = i3 + 1;
            c0388e2 = c0388e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j;
    }

    public final void e(AbstractC0406o abstractC0406o, int i, ArrayList arrayList) {
        C0397f c0397f;
        Iterator it = abstractC0406o.f4442h.f4422k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0397f = abstractC0406o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0395d interfaceC0395d = (InterfaceC0395d) it.next();
            if (interfaceC0395d instanceof C0397f) {
                a((C0397f) interfaceC0395d, i, arrayList, null);
            } else if (interfaceC0395d instanceof AbstractC0406o) {
                a(((AbstractC0406o) interfaceC0395d).f4442h, i, arrayList, null);
            }
        }
        Iterator it2 = c0397f.f4422k.iterator();
        while (it2.hasNext()) {
            InterfaceC0395d interfaceC0395d2 = (InterfaceC0395d) it2.next();
            if (interfaceC0395d2 instanceof C0397f) {
                a((C0397f) interfaceC0395d2, i, arrayList, null);
            } else if (interfaceC0395d2 instanceof AbstractC0406o) {
                a(((AbstractC0406o) interfaceC0395d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0404m) abstractC0406o).f4429k.f4422k.iterator();
            while (it3.hasNext()) {
                InterfaceC0395d interfaceC0395d3 = (InterfaceC0395d) it3.next();
                if (interfaceC0395d3 instanceof C0397f) {
                    a((C0397f) interfaceC0395d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0387d c0387d) {
        C0393b c0393b = this.f4413g;
        c0393b.f4399a = i;
        c0393b.f4400b = i3;
        c0393b.f4401c = i2;
        c0393b.f4402d = i4;
        this.f4412f.b(c0387d, c0393b);
        c0387d.O(c0393b.e);
        c0387d.L(c0393b.f4403f);
        c0387d.f4233E = c0393b.f4405h;
        c0387d.I(c0393b.f4404g);
    }

    public final void g() {
        C0392a c0392a;
        Iterator it = this.f4408a.f4303q0.iterator();
        while (it.hasNext()) {
            C0387d c0387d = (C0387d) it.next();
            if (!c0387d.f4254a) {
                int[] iArr = c0387d.f4281p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0387d.f4283r;
                int i4 = c0387d.f4284s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0398g c0398g = c0387d.f4260d.e;
                boolean z4 = c0398g.j;
                C0398g c0398g2 = c0387d.e.e;
                boolean z5 = c0398g2.j;
                if (z4 && z5) {
                    f(1, c0398g.f4420g, 1, c0398g2.f4420g, c0387d);
                    c0387d.f4254a = true;
                } else if (z4 && z2) {
                    f(1, c0398g.f4420g, 2, c0398g2.f4420g, c0387d);
                    if (i2 == 3) {
                        c0387d.e.e.f4424m = c0387d.k();
                    } else {
                        c0387d.e.e.d(c0387d.k());
                        c0387d.f4254a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0398g.f4420g, 1, c0398g2.f4420g, c0387d);
                    if (i == 3) {
                        c0387d.f4260d.e.f4424m = c0387d.q();
                    } else {
                        c0387d.f4260d.e.d(c0387d.q());
                        c0387d.f4254a = true;
                    }
                }
                if (c0387d.f4254a && (c0392a = c0387d.e.f4430l) != null) {
                    c0392a.d(c0387d.f4255a0);
                }
            }
        }
    }
}
