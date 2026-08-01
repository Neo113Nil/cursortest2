package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0326c;
import s.C0327d;
import s.C0328e;
import v.C0352f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334e {

    /* renamed from: a, reason: collision with root package name */
    public C0328e f4165a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4166b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4167c;

    /* renamed from: d, reason: collision with root package name */
    public C0328e f4168d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4169e;

    /* renamed from: f, reason: collision with root package name */
    public C0352f f4170f;

    /* renamed from: g, reason: collision with root package name */
    public C0331b f4171g;
    public ArrayList h;

    public final void a(C0335f c0335f, int i, ArrayList arrayList, C0341l c0341l) {
        AbstractC0344o abstractC0344o = c0335f.f4175d;
        if (abstractC0344o.f4197c == null) {
            C0328e c0328e = this.f4165a;
            if (abstractC0344o == c0328e.f4040d || abstractC0344o == c0328e.f4042e) {
                return;
            }
            if (c0341l == null) {
                c0341l = new C0341l();
                c0341l.f4185a = null;
                c0341l.f4186b = new ArrayList();
                c0341l.f4185a = abstractC0344o;
                arrayList.add(c0341l);
            }
            abstractC0344o.f4197c = c0341l;
            c0341l.f4186b.add(abstractC0344o);
            C0335f c0335f2 = abstractC0344o.h;
            Iterator it = c0335f2.f4180k.iterator();
            while (it.hasNext()) {
                InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
                if (interfaceC0333d instanceof C0335f) {
                    a((C0335f) interfaceC0333d, i, arrayList, c0341l);
                }
            }
            C0335f c0335f3 = abstractC0344o.i;
            Iterator it2 = c0335f3.f4180k.iterator();
            while (it2.hasNext()) {
                InterfaceC0333d interfaceC0333d2 = (InterfaceC0333d) it2.next();
                if (interfaceC0333d2 instanceof C0335f) {
                    a((C0335f) interfaceC0333d2, i, arrayList, c0341l);
                }
            }
            if (i == 1 && (abstractC0344o instanceof C0342m)) {
                Iterator it3 = ((C0342m) abstractC0344o).f4187k.f4180k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0333d interfaceC0333d3 = (InterfaceC0333d) it3.next();
                    if (interfaceC0333d3 instanceof C0335f) {
                        a((C0335f) interfaceC0333d3, i, arrayList, c0341l);
                    }
                }
            }
            Iterator it4 = c0335f2.f4181l.iterator();
            while (it4.hasNext()) {
                a((C0335f) it4.next(), i, arrayList, c0341l);
            }
            Iterator it5 = c0335f3.f4181l.iterator();
            while (it5.hasNext()) {
                a((C0335f) it5.next(), i, arrayList, c0341l);
            }
            if (i == 1 && (abstractC0344o instanceof C0342m)) {
                Iterator it6 = ((C0342m) abstractC0344o).f4187k.f4181l.iterator();
                while (it6.hasNext()) {
                    a((C0335f) it6.next(), i, arrayList, c0341l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0328e c0328e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0328e.f4083q0.iterator();
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            int[] iArr = c0327d.f4061p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0327d.f4047g0 == 8) {
                c0327d.f4034a = true;
            } else {
                float f2 = c0327d.f4068w;
                if (f2 < 1.0f && i7 == 3) {
                    c0327d.f4063r = 2;
                }
                float f3 = c0327d.f4071z;
                if (f3 < 1.0f && i8 == 3) {
                    c0327d.f4064s = 2;
                }
                if (c0327d.f4030W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0327d.f4063r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0327d.f4064s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0327d.f4063r == 0) {
                            c0327d.f4063r = 3;
                        }
                        if (c0327d.f4064s == 0) {
                            c0327d.f4064s = 3;
                        }
                    }
                }
                C0326c c0326c = c0327d.f4018K;
                C0326c c0326c2 = c0327d.f4016I;
                if (i7 == 3 && c0327d.f4063r == 1 && (c0326c2.f4007f == null || c0326c.f4007f == null)) {
                    i7 = 2;
                }
                C0326c c0326c3 = c0327d.f4019L;
                C0326c c0326c4 = c0327d.f4017J;
                int i9 = (i8 == 3 && c0327d.f4064s == 1 && (c0326c4.f4007f == null || c0326c3.f4007f == null)) ? 2 : i8;
                C0340k c0340k = c0327d.f4040d;
                c0340k.f4198d = i7;
                int i10 = c0327d.f4063r;
                c0340k.f4195a = i10;
                C0342m c0342m = c0327d.f4042e;
                c0342m.f4198d = i9;
                int i11 = c0327d.f4064s;
                c0342m.f4195a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0327d.q();
                    if (i7 == 4) {
                        i = (c0328e.q() - c0326c2.f4008g) - c0326c.f4008g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0327d.k();
                    if (i9 == 4) {
                        i2 = (c0328e.k() - c0326c4.f4008g) - c0326c3.f4008g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0327d);
                    c0327d.f4040d.f4199e.d(c0327d.q());
                    c0327d.f4042e.f4199e.d(c0327d.k());
                    c0327d.f4034a = true;
                } else {
                    int[] iArr2 = c0328e.f4061p0;
                    C0326c[] c0326cArr = c0327d.f4024Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0327d);
                        }
                        int k3 = c0327d.k();
                        f(1, (int) ((k3 * c0327d.f4030W) + 0.5f), 1, k3, c0327d);
                        c0327d.f4040d.f4199e.d(c0327d.q());
                        c0327d.f4042e.f4199e.d(c0327d.k());
                        c0327d.f4034a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0327d);
                        c0327d.f4040d.f4199e.f4182m = c0327d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0328e.q()) + 0.5f), i9, c0327d.k(), c0327d);
                            c0327d.f4040d.f4199e.d(c0327d.q());
                            c0327d.f4042e.f4199e.d(c0327d.k());
                            c0327d.f4034a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0326cArr[0].f4007f == null || c0326cArr[1].f4007f == null) {
                        f(2, 0, i9, 0, c0327d);
                        c0327d.f4040d.f4199e.d(c0327d.q());
                        c0327d.f4042e.f4199e.d(c0327d.k());
                        c0327d.f4034a = true;
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
                                f(2, 0, 2, 0, c0327d);
                                c0327d.f4040d.f4199e.f4182m = c0327d.q();
                                c0327d.f4042e.f4199e.f4182m = c0327d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0327d);
                            }
                            int q3 = c0327d.q();
                            float f4 = c0327d.f4030W;
                            if (c0327d.f4031X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0327d);
                            c0327d.f4040d.f4199e.d(c0327d.q());
                            c0327d.f4042e.f4199e.d(c0327d.k());
                            c0327d.f4034a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0327d);
                            c0327d.f4042e.f4199e.f4182m = c0327d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0327d.q(), 1, (int) ((f3 * c0328e.k()) + 0.5f), c0327d);
                                    c0327d.f4040d.f4199e.d(c0327d.q());
                                    c0327d.f4042e.f4199e.d(c0327d.k());
                                    c0327d.f4034a = true;
                                }
                            } else if (c0326cArr[2].f4007f == null || c0326cArr[3].f4007f == null) {
                                f(2, 0, i9, 0, c0327d);
                                c0327d.f4040d.f4199e.d(c0327d.q());
                                c0327d.f4042e.f4199e.d(c0327d.k());
                                c0327d.f4034a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0327d);
                                    c0327d.f4040d.f4199e.f4182m = c0327d.q();
                                    c0327d.f4042e.f4199e.f4182m = c0327d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0328e.q()) + 0.5f), 1, (int) ((f3 * c0328e.k()) + 0.5f), c0327d);
                                    c0327d.f4040d.f4199e.d(c0327d.q());
                                    c0327d.f4042e.f4199e.d(c0327d.k());
                                    c0327d.f4034a = true;
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
        ArrayList arrayList = this.f4169e;
        arrayList.clear();
        C0328e c0328e = this.f4168d;
        c0328e.f4040d.f();
        c0328e.f4042e.f();
        arrayList.add(c0328e.f4040d);
        arrayList.add(c0328e.f4042e);
        Iterator it = c0328e.f4083q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            if (c0327d instanceof s.h) {
                C0338i c0338i = new C0338i(c0327d);
                c0327d.f4040d.f();
                c0327d.f4042e.f();
                c0338i.f4200f = ((s.h) c0327d).f4144u0;
                arrayList.add(c0338i);
            } else {
                if (c0327d.x()) {
                    if (c0327d.f4036b == null) {
                        c0327d.f4036b = new C0332c(c0327d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0327d.f4036b);
                } else {
                    arrayList.add(c0327d.f4040d);
                }
                if (c0327d.y()) {
                    if (c0327d.f4038c == null) {
                        c0327d.f4038c = new C0332c(c0327d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0327d.f4038c);
                } else {
                    arrayList.add(c0327d.f4042e);
                }
                if (c0327d instanceof s.i) {
                    arrayList.add(new C0339j(c0327d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0344o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0344o abstractC0344o = (AbstractC0344o) it3.next();
            if (abstractC0344o.f4196b != c0328e) {
                abstractC0344o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0328e c0328e2 = this.f4165a;
        e(c0328e2.f4040d, 0, arrayList2);
        e(c0328e2.f4042e, 1, arrayList2);
        this.f4166b = false;
    }

    public final int d(C0328e c0328e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0328e c0328e2 = c0328e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0344o abstractC0344o = ((C0341l) arrayList2.get(i4)).f4185a;
            if (!(abstractC0344o instanceof C0332c) ? !(i != 0 ? (abstractC0344o instanceof C0342m) : (abstractC0344o instanceof C0340k)) : ((C0332c) abstractC0344o).f4200f != i) {
                C0335f c0335f = (i == 0 ? c0328e2.f4040d : c0328e2.f4042e).h;
                C0335f c0335f2 = (i == 0 ? c0328e2.f4040d : c0328e2.f4042e).i;
                boolean contains = abstractC0344o.h.f4181l.contains(c0335f);
                C0335f c0335f3 = abstractC0344o.i;
                boolean contains2 = c0335f3.f4181l.contains(c0335f2);
                long j3 = abstractC0344o.j();
                C0335f c0335f4 = abstractC0344o.h;
                if (contains && contains2) {
                    long b2 = C0341l.b(c0335f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0341l.a(c0335f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0335f3.f4177f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0335f4.f4177f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0327d c0327d = abstractC0344o.f4196b;
                    if (i == 0) {
                        f2 = c0327d.f4041d0;
                    } else if (i == 1) {
                        f2 = c0327d.f4043e0;
                    } else {
                        c0327d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0335f4.f4177f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0335f3.f4177f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0341l.b(c0335f4, c0335f4.f4177f), c0335f4.f4177f + j3) : contains2 ? Math.max(-C0341l.a(c0335f3, c0335f3.f4177f), (-c0335f3.f4177f) + j3) : (abstractC0344o.j() + c0335f4.f4177f) - c0335f3.f4177f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0328e2 = c0328e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0344o abstractC0344o, int i, ArrayList arrayList) {
        C0335f c0335f;
        Iterator it = abstractC0344o.h.f4180k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0335f = abstractC0344o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            if (interfaceC0333d instanceof C0335f) {
                a((C0335f) interfaceC0333d, i, arrayList, null);
            } else if (interfaceC0333d instanceof AbstractC0344o) {
                a(((AbstractC0344o) interfaceC0333d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0335f.f4180k.iterator();
        while (it2.hasNext()) {
            InterfaceC0333d interfaceC0333d2 = (InterfaceC0333d) it2.next();
            if (interfaceC0333d2 instanceof C0335f) {
                a((C0335f) interfaceC0333d2, i, arrayList, null);
            } else if (interfaceC0333d2 instanceof AbstractC0344o) {
                a(((AbstractC0344o) interfaceC0333d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0342m) abstractC0344o).f4187k.f4180k.iterator();
            while (it3.hasNext()) {
                InterfaceC0333d interfaceC0333d3 = (InterfaceC0333d) it3.next();
                if (interfaceC0333d3 instanceof C0335f) {
                    a((C0335f) interfaceC0333d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0327d c0327d) {
        C0331b c0331b = this.f4171g;
        c0331b.f4155a = i;
        c0331b.f4156b = i3;
        c0331b.f4157c = i2;
        c0331b.f4158d = i4;
        this.f4170f.b(c0327d, c0331b);
        c0327d.O(c0331b.f4159e);
        c0327d.L(c0331b.f4160f);
        c0327d.f4013E = c0331b.h;
        c0327d.I(c0331b.f4161g);
    }

    public final void g() {
        C0330a c0330a;
        Iterator it = this.f4165a.f4083q0.iterator();
        while (it.hasNext()) {
            C0327d c0327d = (C0327d) it.next();
            if (!c0327d.f4034a) {
                int[] iArr = c0327d.f4061p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0327d.f4063r;
                int i4 = c0327d.f4064s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0336g c0336g = c0327d.f4040d.f4199e;
                boolean z4 = c0336g.f4179j;
                C0336g c0336g2 = c0327d.f4042e.f4199e;
                boolean z5 = c0336g2.f4179j;
                if (z4 && z5) {
                    f(1, c0336g.f4178g, 1, c0336g2.f4178g, c0327d);
                    c0327d.f4034a = true;
                } else if (z4 && z2) {
                    f(1, c0336g.f4178g, 2, c0336g2.f4178g, c0327d);
                    if (i2 == 3) {
                        c0327d.f4042e.f4199e.f4182m = c0327d.k();
                    } else {
                        c0327d.f4042e.f4199e.d(c0327d.k());
                        c0327d.f4034a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0336g.f4178g, 1, c0336g2.f4178g, c0327d);
                    if (i == 3) {
                        c0327d.f4040d.f4199e.f4182m = c0327d.q();
                    } else {
                        c0327d.f4040d.f4199e.d(c0327d.q());
                        c0327d.f4034a = true;
                    }
                }
                if (c0327d.f4034a && (c0330a = c0327d.f4042e.f4188l) != null) {
                    c0330a.d(c0327d.f4035a0);
                }
            }
        }
    }
}
