package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f4083a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4084b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4085c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4086e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f4087f;

    /* renamed from: g, reason: collision with root package name */
    public C0344b f4088g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        if (oVar.f4112c == null) {
            s.e eVar = this.f4083a;
            if (oVar == eVar.d || oVar == eVar.f3901e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f4101a = null;
                lVar.f4102b = new ArrayList();
                lVar.f4101a = oVar;
                arrayList.add(lVar);
            }
            oVar.f4112c = lVar;
            lVar.f4102b.add(oVar);
            f fVar2 = oVar.h;
            Iterator it = fVar2.f4096k.iterator();
            while (it.hasNext()) {
                InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
                if (interfaceC0346d instanceof f) {
                    a((f) interfaceC0346d, i, arrayList, lVar);
                }
            }
            f fVar3 = oVar.i;
            Iterator it2 = fVar3.f4096k.iterator();
            while (it2.hasNext()) {
                InterfaceC0346d interfaceC0346d2 = (InterfaceC0346d) it2.next();
                if (interfaceC0346d2 instanceof f) {
                    a((f) interfaceC0346d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f4103k.f4096k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0346d interfaceC0346d3 = (InterfaceC0346d) it3.next();
                    if (interfaceC0346d3 instanceof f) {
                        a((f) interfaceC0346d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f4097l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = fVar3.f4097l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f4103k.f4097l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s.e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = eVar.f3943q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            int[] iArr = dVar.f3921p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3906g0 == 8) {
                dVar.f3894a = true;
            } else {
                float f2 = dVar.f3928w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f3923r = 2;
                }
                float f3 = dVar.f3931z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f3924s = 2;
                }
                if (dVar.f3890W > RecyclerView.f1937A0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3923r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f3924s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f3923r == 0) {
                            dVar.f3923r = 3;
                        }
                        if (dVar.f3924s == 0) {
                            dVar.f3924s = 3;
                        }
                    }
                }
                s.c cVar = dVar.f3878K;
                s.c cVar2 = dVar.f3876I;
                if (i7 == 3 && dVar.f3923r == 1 && (cVar2.f3867f == null || cVar.f3867f == null)) {
                    i7 = 2;
                }
                s.c cVar3 = dVar.f3879L;
                s.c cVar4 = dVar.f3877J;
                int i9 = (i8 == 3 && dVar.f3924s == 1 && (cVar4.f3867f == null || cVar3.f3867f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f3923r;
                kVar.f4110a = i10;
                m mVar = dVar.f3901e;
                mVar.d = i9;
                int i11 = dVar.f3924s;
                mVar.f4110a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3868g) - cVar.f3868g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3868g) - cVar3.f3868g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f4113e.d(dVar.q());
                    dVar.f3901e.f4113e.d(dVar.k());
                    dVar.f3894a = true;
                } else {
                    int[] iArr2 = eVar.f3921p0;
                    s.c[] cVarArr = dVar.f3884Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3890W) + 0.5f), 1, k3, dVar);
                        dVar.d.f4113e.d(dVar.q());
                        dVar.f3901e.f4113e.d(dVar.k());
                        dVar.f3894a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f4113e.f4098m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f4113e.d(dVar.q());
                            dVar.f3901e.f4113e.d(dVar.k());
                            dVar.f3894a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3867f == null || cVarArr[1].f3867f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f4113e.d(dVar.q());
                        dVar.f3901e.f4113e.d(dVar.k());
                        dVar.f3894a = true;
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
                                f(2, 0, 2, 0, dVar);
                                dVar.d.f4113e.f4098m = dVar.q();
                                dVar.f3901e.f4113e.f4098m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3890W;
                            if (dVar.f3891X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f4113e.d(dVar.q());
                            dVar.f3901e.f4113e.d(dVar.k());
                            dVar.f3894a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3901e.f4113e.f4098m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f4113e.d(dVar.q());
                                    dVar.f3901e.f4113e.d(dVar.k());
                                    dVar.f3894a = true;
                                }
                            } else if (cVarArr[2].f3867f == null || cVarArr[3].f3867f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f4113e.d(dVar.q());
                                dVar.f3901e.f4113e.d(dVar.k());
                                dVar.f3894a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f4113e.f4098m = dVar.q();
                                    dVar.f3901e.f4113e.f4098m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f4113e.d(dVar.q());
                                    dVar.f3901e.f4113e.d(dVar.k());
                                    dVar.f3894a = true;
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
        ArrayList arrayList = this.f4086e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f3901e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3901e);
        Iterator it = eVar.f3943q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3901e.f();
                iVar.f4114f = ((s.h) dVar).f4003u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3896b == null) {
                        dVar.f3896b = new C0345c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3896b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3898c == null) {
                        dVar.f3898c = new C0345c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3898c);
                } else {
                    arrayList.add(dVar.f3901e);
                }
                if (dVar instanceof s.i) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f4111b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f4083a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3901e, 1, arrayList2);
        this.f4084b = false;
    }

    public final int d(s.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            o oVar = ((l) arrayList2.get(i4)).f4101a;
            if (!(oVar instanceof C0345c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0345c) oVar).f4114f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3901e).h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3901e).i;
                boolean contains = oVar.h.f4097l.contains(fVar);
                f fVar3 = oVar.i;
                boolean contains2 = fVar3.f4097l.contains(fVar2);
                long j3 = oVar.j();
                f fVar4 = oVar.h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(fVar3, 0L);
                    long j4 = b2 - j3;
                    int i5 = fVar3.f4093f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = fVar4.f4093f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    s.d dVar = oVar.f4111b;
                    if (i == 0) {
                        f2 = dVar.f3900d0;
                    } else if (i == 1) {
                        f2 = dVar.f3902e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f1937A0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f4093f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f4093f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f4093f), fVar4.f4093f + j3) : contains2 ? Math.max(-l.a(fVar3, fVar3.f4093f), (-fVar3.f4093f) + j3) : (oVar.j() + fVar4.f4093f) - fVar3.f4093f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            eVar2 = eVar;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar;
        Iterator it = oVar.h.f4096k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) it.next();
            if (interfaceC0346d instanceof f) {
                a((f) interfaceC0346d, i, arrayList, null);
            } else if (interfaceC0346d instanceof o) {
                a(((o) interfaceC0346d).h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f4096k.iterator();
        while (it2.hasNext()) {
            InterfaceC0346d interfaceC0346d2 = (InterfaceC0346d) it2.next();
            if (interfaceC0346d2 instanceof f) {
                a((f) interfaceC0346d2, i, arrayList, null);
            } else if (interfaceC0346d2 instanceof o) {
                a(((o) interfaceC0346d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f4103k.f4096k.iterator();
            while (it3.hasNext()) {
                InterfaceC0346d interfaceC0346d3 = (InterfaceC0346d) it3.next();
                if (interfaceC0346d3 instanceof f) {
                    a((f) interfaceC0346d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, s.d dVar) {
        C0344b c0344b = this.f4088g;
        c0344b.f4074a = i;
        c0344b.f4075b = i3;
        c0344b.f4076c = i2;
        c0344b.d = i4;
        this.f4087f.b(dVar, c0344b);
        dVar.O(c0344b.f4077e);
        dVar.L(c0344b.f4078f);
        dVar.f3873E = c0344b.h;
        dVar.I(c0344b.f4079g);
    }

    public final void g() {
        C0343a c0343a;
        Iterator it = this.f4083a.f3943q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (!dVar.f3894a) {
                int[] iArr = dVar.f3921p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f3923r;
                int i4 = dVar.f3924s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f4113e;
                boolean z4 = gVar.f4095j;
                g gVar2 = dVar.f3901e.f4113e;
                boolean z5 = gVar2.f4095j;
                if (z4 && z5) {
                    f(1, gVar.f4094g, 1, gVar2.f4094g, dVar);
                    dVar.f3894a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f4094g, 2, gVar2.f4094g, dVar);
                    if (i2 == 3) {
                        dVar.f3901e.f4113e.f4098m = dVar.k();
                    } else {
                        dVar.f3901e.f4113e.d(dVar.k());
                        dVar.f3894a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f4094g, 1, gVar2.f4094g, dVar);
                    if (i == 3) {
                        dVar.d.f4113e.f4098m = dVar.q();
                    } else {
                        dVar.d.f4113e.d(dVar.q());
                        dVar.f3894a = true;
                    }
                }
                if (dVar.f3894a && (c0343a = dVar.f3901e.f4104l) != null) {
                    c0343a.d(dVar.f3895a0);
                }
            }
        }
    }
}
