package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f3736a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3737b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3738c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3739e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f3740f;

    /* renamed from: g, reason: collision with root package name */
    public C0299b f3741g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        if (oVar.f3765c == null) {
            s.e eVar = this.f3736a;
            if (oVar == eVar.d || oVar == eVar.f3607e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3754a = null;
                lVar.f3755b = new ArrayList();
                lVar.f3754a = oVar;
                arrayList.add(lVar);
            }
            oVar.f3765c = lVar;
            lVar.f3755b.add(oVar);
            f fVar2 = oVar.h;
            Iterator it = fVar2.f3749k.iterator();
            while (it.hasNext()) {
                InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
                if (interfaceC0301d instanceof f) {
                    a((f) interfaceC0301d, i, arrayList, lVar);
                }
            }
            f fVar3 = oVar.i;
            Iterator it2 = fVar3.f3749k.iterator();
            while (it2.hasNext()) {
                InterfaceC0301d interfaceC0301d2 = (InterfaceC0301d) it2.next();
                if (interfaceC0301d2 instanceof f) {
                    a((f) interfaceC0301d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f3756k.f3749k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0301d interfaceC0301d3 = (InterfaceC0301d) it3.next();
                    if (interfaceC0301d3 instanceof f) {
                        a((f) interfaceC0301d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f3750l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = fVar3.f3750l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f3756k.f3750l.iterator();
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
        Iterator it = eVar.f3649q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            int[] iArr = dVar.f3627p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3612g0 == 8) {
                dVar.f3600a = true;
            } else {
                float f2 = dVar.f3634w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f3629r = 2;
                }
                float f3 = dVar.f3637z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f3630s = 2;
                }
                if (dVar.f3596W > RecyclerView.f1559A0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3629r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f3630s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f3629r == 0) {
                            dVar.f3629r = 3;
                        }
                        if (dVar.f3630s == 0) {
                            dVar.f3630s = 3;
                        }
                    }
                }
                s.c cVar = dVar.f3584K;
                s.c cVar2 = dVar.f3582I;
                if (i7 == 3 && dVar.f3629r == 1 && (cVar2.f3573f == null || cVar.f3573f == null)) {
                    i7 = 2;
                }
                s.c cVar3 = dVar.f3585L;
                s.c cVar4 = dVar.f3583J;
                int i9 = (i8 == 3 && dVar.f3630s == 1 && (cVar4.f3573f == null || cVar3.f3573f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f3629r;
                kVar.f3763a = i10;
                m mVar = dVar.f3607e;
                mVar.d = i9;
                int i11 = dVar.f3630s;
                mVar.f3763a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3574g) - cVar.f3574g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3574g) - cVar3.f3574g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f3766e.d(dVar.q());
                    dVar.f3607e.f3766e.d(dVar.k());
                    dVar.f3600a = true;
                } else {
                    int[] iArr2 = eVar.f3627p0;
                    s.c[] cVarArr = dVar.f3590Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3596W) + 0.5f), 1, k3, dVar);
                        dVar.d.f3766e.d(dVar.q());
                        dVar.f3607e.f3766e.d(dVar.k());
                        dVar.f3600a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3766e.f3751m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f3766e.d(dVar.q());
                            dVar.f3607e.f3766e.d(dVar.k());
                            dVar.f3600a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3573f == null || cVarArr[1].f3573f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3766e.d(dVar.q());
                        dVar.f3607e.f3766e.d(dVar.k());
                        dVar.f3600a = true;
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
                                dVar.d.f3766e.f3751m = dVar.q();
                                dVar.f3607e.f3766e.f3751m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3596W;
                            if (dVar.f3597X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f3766e.d(dVar.q());
                            dVar.f3607e.f3766e.d(dVar.k());
                            dVar.f3600a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3607e.f3766e.f3751m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3766e.d(dVar.q());
                                    dVar.f3607e.f3766e.d(dVar.k());
                                    dVar.f3600a = true;
                                }
                            } else if (cVarArr[2].f3573f == null || cVarArr[3].f3573f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f3766e.d(dVar.q());
                                dVar.f3607e.f3766e.d(dVar.k());
                                dVar.f3600a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f3766e.f3751m = dVar.q();
                                    dVar.f3607e.f3766e.f3751m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3766e.d(dVar.q());
                                    dVar.f3607e.f3766e.d(dVar.k());
                                    dVar.f3600a = true;
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
        ArrayList arrayList = this.f3739e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f3607e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3607e);
        Iterator it = eVar.f3649q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3607e.f();
                iVar.f3767f = ((s.h) dVar).f3711u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3602b == null) {
                        dVar.f3602b = new C0300c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3602b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3604c == null) {
                        dVar.f3604c = new C0300c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3604c);
                } else {
                    arrayList.add(dVar.f3607e);
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
            if (oVar.f3764b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f3736a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3607e, 1, arrayList2);
        this.f3737b = false;
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
            o oVar = ((l) arrayList2.get(i4)).f3754a;
            if (!(oVar instanceof C0300c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0300c) oVar).f3767f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3607e).h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3607e).i;
                boolean contains = oVar.h.f3750l.contains(fVar);
                f fVar3 = oVar.i;
                boolean contains2 = fVar3.f3750l.contains(fVar2);
                long j3 = oVar.j();
                f fVar4 = oVar.h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(fVar3, 0L);
                    long j4 = b2 - j3;
                    int i5 = fVar3.f3746f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = fVar4.f3746f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    s.d dVar = oVar.f3764b;
                    if (i == 0) {
                        f2 = dVar.f3606d0;
                    } else if (i == 1) {
                        f2 = dVar.f3608e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f1559A0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f3746f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f3746f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f3746f), fVar4.f3746f + j3) : contains2 ? Math.max(-l.a(fVar3, fVar3.f3746f), (-fVar3.f3746f) + j3) : (oVar.j() + fVar4.f3746f) - fVar3.f3746f;
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
        Iterator it = oVar.h.f3749k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) it.next();
            if (interfaceC0301d instanceof f) {
                a((f) interfaceC0301d, i, arrayList, null);
            } else if (interfaceC0301d instanceof o) {
                a(((o) interfaceC0301d).h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f3749k.iterator();
        while (it2.hasNext()) {
            InterfaceC0301d interfaceC0301d2 = (InterfaceC0301d) it2.next();
            if (interfaceC0301d2 instanceof f) {
                a((f) interfaceC0301d2, i, arrayList, null);
            } else if (interfaceC0301d2 instanceof o) {
                a(((o) interfaceC0301d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f3756k.f3749k.iterator();
            while (it3.hasNext()) {
                InterfaceC0301d interfaceC0301d3 = (InterfaceC0301d) it3.next();
                if (interfaceC0301d3 instanceof f) {
                    a((f) interfaceC0301d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, s.d dVar) {
        C0299b c0299b = this.f3741g;
        c0299b.f3727a = i;
        c0299b.f3728b = i3;
        c0299b.f3729c = i2;
        c0299b.d = i4;
        this.f3740f.b(dVar, c0299b);
        dVar.O(c0299b.f3730e);
        dVar.L(c0299b.f3731f);
        dVar.f3579E = c0299b.h;
        dVar.I(c0299b.f3732g);
    }

    public final void g() {
        C0298a c0298a;
        Iterator it = this.f3736a.f3649q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (!dVar.f3600a) {
                int[] iArr = dVar.f3627p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f3629r;
                int i4 = dVar.f3630s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f3766e;
                boolean z4 = gVar.f3748j;
                g gVar2 = dVar.f3607e.f3766e;
                boolean z5 = gVar2.f3748j;
                if (z4 && z5) {
                    f(1, gVar.f3747g, 1, gVar2.f3747g, dVar);
                    dVar.f3600a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f3747g, 2, gVar2.f3747g, dVar);
                    if (i2 == 3) {
                        dVar.f3607e.f3766e.f3751m = dVar.k();
                    } else {
                        dVar.f3607e.f3766e.d(dVar.k());
                        dVar.f3600a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f3747g, 1, gVar2.f3747g, dVar);
                    if (i == 3) {
                        dVar.d.f3766e.f3751m = dVar.q();
                    } else {
                        dVar.d.f3766e.d(dVar.q());
                        dVar.f3600a = true;
                    }
                }
                if (dVar.f3600a && (c0298a = dVar.f3607e.f3757l) != null) {
                    c0298a.d(dVar.f3601a0);
                }
            }
        }
    }
}
