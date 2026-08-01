package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f3768a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3769b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3770c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3771e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f3772f;

    /* renamed from: g, reason: collision with root package name */
    public C0298b f3773g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        if (oVar.f3797c == null) {
            s.e eVar = this.f3768a;
            if (oVar == eVar.d || oVar == eVar.f3581e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3786a = null;
                lVar.f3787b = new ArrayList();
                lVar.f3786a = oVar;
                arrayList.add(lVar);
            }
            oVar.f3797c = lVar;
            lVar.f3787b.add(oVar);
            f fVar2 = oVar.h;
            Iterator it = fVar2.f3781k.iterator();
            while (it.hasNext()) {
                InterfaceC0300d interfaceC0300d = (InterfaceC0300d) it.next();
                if (interfaceC0300d instanceof f) {
                    a((f) interfaceC0300d, i, arrayList, lVar);
                }
            }
            f fVar3 = oVar.i;
            Iterator it2 = fVar3.f3781k.iterator();
            while (it2.hasNext()) {
                InterfaceC0300d interfaceC0300d2 = (InterfaceC0300d) it2.next();
                if (interfaceC0300d2 instanceof f) {
                    a((f) interfaceC0300d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f3788k.f3781k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0300d interfaceC0300d3 = (InterfaceC0300d) it3.next();
                    if (interfaceC0300d3 instanceof f) {
                        a((f) interfaceC0300d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f3782l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = fVar3.f3782l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f3788k.f3782l.iterator();
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
        Iterator it = eVar.f3622q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            int[] iArr = dVar.f3600p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3586g0 == 8) {
                dVar.f3574a = true;
            } else {
                float f2 = dVar.f3607w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f3602r = 2;
                }
                float f3 = dVar.f3610z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f3603s = 2;
                }
                if (dVar.f3570W > RecyclerView.f1530C0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3602r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f3603s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f3602r == 0) {
                            dVar.f3602r = 3;
                        }
                        if (dVar.f3603s == 0) {
                            dVar.f3603s = 3;
                        }
                    }
                }
                s.c cVar = dVar.f3558K;
                s.c cVar2 = dVar.f3556I;
                if (i7 == 3 && dVar.f3602r == 1 && (cVar2.f3547f == null || cVar.f3547f == null)) {
                    i7 = 2;
                }
                s.c cVar3 = dVar.f3559L;
                s.c cVar4 = dVar.f3557J;
                int i9 = (i8 == 3 && dVar.f3603s == 1 && (cVar4.f3547f == null || cVar3.f3547f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f3602r;
                kVar.f3795a = i10;
                m mVar = dVar.f3581e;
                mVar.d = i9;
                int i11 = dVar.f3603s;
                mVar.f3795a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3548g) - cVar.f3548g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3548g) - cVar3.f3548g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f3798e.d(dVar.q());
                    dVar.f3581e.f3798e.d(dVar.k());
                    dVar.f3574a = true;
                } else {
                    int[] iArr2 = eVar.f3600p0;
                    s.c[] cVarArr = dVar.f3564Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3570W) + 0.5f), 1, k3, dVar);
                        dVar.d.f3798e.d(dVar.q());
                        dVar.f3581e.f3798e.d(dVar.k());
                        dVar.f3574a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3798e.f3783m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f3798e.d(dVar.q());
                            dVar.f3581e.f3798e.d(dVar.k());
                            dVar.f3574a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3547f == null || cVarArr[1].f3547f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3798e.d(dVar.q());
                        dVar.f3581e.f3798e.d(dVar.k());
                        dVar.f3574a = true;
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
                                dVar.d.f3798e.f3783m = dVar.q();
                                dVar.f3581e.f3798e.f3783m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3570W;
                            if (dVar.f3571X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f3798e.d(dVar.q());
                            dVar.f3581e.f3798e.d(dVar.k());
                            dVar.f3574a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3581e.f3798e.f3783m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3798e.d(dVar.q());
                                    dVar.f3581e.f3798e.d(dVar.k());
                                    dVar.f3574a = true;
                                }
                            } else if (cVarArr[2].f3547f == null || cVarArr[3].f3547f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f3798e.d(dVar.q());
                                dVar.f3581e.f3798e.d(dVar.k());
                                dVar.f3574a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f3798e.f3783m = dVar.q();
                                    dVar.f3581e.f3798e.f3783m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3798e.d(dVar.q());
                                    dVar.f3581e.f3798e.d(dVar.k());
                                    dVar.f3574a = true;
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
        ArrayList arrayList = this.f3771e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f3581e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3581e);
        Iterator it = eVar.f3622q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3581e.f();
                iVar.f3799f = ((s.h) dVar).f3682u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3576b == null) {
                        dVar.f3576b = new C0299c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3576b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3578c == null) {
                        dVar.f3578c = new C0299c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3578c);
                } else {
                    arrayList.add(dVar.f3581e);
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
            if (oVar.f3796b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f3768a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3581e, 1, arrayList2);
        this.f3769b = false;
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
            o oVar = ((l) arrayList2.get(i4)).f3786a;
            if (!(oVar instanceof C0299c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0299c) oVar).f3799f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3581e).h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3581e).i;
                boolean contains = oVar.h.f3782l.contains(fVar);
                f fVar3 = oVar.i;
                boolean contains2 = fVar3.f3782l.contains(fVar2);
                long j3 = oVar.j();
                f fVar4 = oVar.h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(fVar3, 0L);
                    long j4 = b2 - j3;
                    int i5 = fVar3.f3778f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = fVar4.f3778f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    s.d dVar = oVar.f3796b;
                    if (i == 0) {
                        f2 = dVar.f3580d0;
                    } else if (i == 1) {
                        f2 = dVar.f3582e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f1530C0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f3778f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f3778f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f3778f), fVar4.f3778f + j3) : contains2 ? Math.max(-l.a(fVar3, fVar3.f3778f), (-fVar3.f3778f) + j3) : (oVar.j() + fVar4.f3778f) - fVar3.f3778f;
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
        Iterator it = oVar.h.f3781k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0300d interfaceC0300d = (InterfaceC0300d) it.next();
            if (interfaceC0300d instanceof f) {
                a((f) interfaceC0300d, i, arrayList, null);
            } else if (interfaceC0300d instanceof o) {
                a(((o) interfaceC0300d).h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f3781k.iterator();
        while (it2.hasNext()) {
            InterfaceC0300d interfaceC0300d2 = (InterfaceC0300d) it2.next();
            if (interfaceC0300d2 instanceof f) {
                a((f) interfaceC0300d2, i, arrayList, null);
            } else if (interfaceC0300d2 instanceof o) {
                a(((o) interfaceC0300d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f3788k.f3781k.iterator();
            while (it3.hasNext()) {
                InterfaceC0300d interfaceC0300d3 = (InterfaceC0300d) it3.next();
                if (interfaceC0300d3 instanceof f) {
                    a((f) interfaceC0300d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, s.d dVar) {
        C0298b c0298b = this.f3773g;
        c0298b.f3759a = i;
        c0298b.f3760b = i3;
        c0298b.f3761c = i2;
        c0298b.d = i4;
        this.f3772f.b(dVar, c0298b);
        dVar.O(c0298b.f3762e);
        dVar.L(c0298b.f3763f);
        dVar.f3553E = c0298b.h;
        dVar.I(c0298b.f3764g);
    }

    public final void g() {
        C0297a c0297a;
        Iterator it = this.f3768a.f3622q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (!dVar.f3574a) {
                int[] iArr = dVar.f3600p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f3602r;
                int i4 = dVar.f3603s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f3798e;
                boolean z4 = gVar.f3780j;
                g gVar2 = dVar.f3581e.f3798e;
                boolean z5 = gVar2.f3780j;
                if (z4 && z5) {
                    f(1, gVar.f3779g, 1, gVar2.f3779g, dVar);
                    dVar.f3574a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f3779g, 2, gVar2.f3779g, dVar);
                    if (i2 == 3) {
                        dVar.f3581e.f3798e.f3783m = dVar.k();
                    } else {
                        dVar.f3581e.f3798e.d(dVar.k());
                        dVar.f3574a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f3779g, 1, gVar2.f3779g, dVar);
                    if (i == 3) {
                        dVar.d.f3798e.f3783m = dVar.q();
                    } else {
                        dVar.d.f3798e.d(dVar.q());
                        dVar.f3574a = true;
                    }
                }
                if (dVar.f3574a && (c0297a = dVar.f3581e.f3789l) != null) {
                    c0297a.d(dVar.f3575a0);
                }
            }
        }
    }
}
