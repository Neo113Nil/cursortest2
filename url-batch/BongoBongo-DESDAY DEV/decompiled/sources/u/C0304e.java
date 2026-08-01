package u;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304e {

    /* renamed from: a, reason: collision with root package name */
    public t.e f3914a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3915b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3916c;
    public t.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3917e;

    /* renamed from: f, reason: collision with root package name */
    public w.f f3918f;

    /* renamed from: g, reason: collision with root package name */
    public C0301b f3919g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3920h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.d;
        if (oVar.f3945c == null) {
            t.e eVar = this.f3914a;
            if (oVar == eVar.d || oVar == eVar.f3783e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3934a = null;
                lVar.f3935b = new ArrayList();
                lVar.f3934a = oVar;
                arrayList.add(lVar);
            }
            oVar.f3945c = lVar;
            lVar.f3935b.add(oVar);
            f fVar2 = oVar.f3949h;
            Iterator it = fVar2.f3929k.iterator();
            while (it.hasNext()) {
                InterfaceC0303d interfaceC0303d = (InterfaceC0303d) it.next();
                if (interfaceC0303d instanceof f) {
                    a((f) interfaceC0303d, i, arrayList, lVar);
                }
            }
            f fVar3 = oVar.i;
            Iterator it2 = fVar3.f3929k.iterator();
            while (it2.hasNext()) {
                InterfaceC0303d interfaceC0303d2 = (InterfaceC0303d) it2.next();
                if (interfaceC0303d2 instanceof f) {
                    a((f) interfaceC0303d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f3936k.f3929k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0303d interfaceC0303d3 = (InterfaceC0303d) it3.next();
                    if (interfaceC0303d3 instanceof f) {
                        a((f) interfaceC0303d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f3930l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = fVar3.f3930l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f3936k.f3930l.iterator();
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
    public final void b(t.e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = eVar.f3824q0.iterator();
        while (it.hasNext()) {
            t.d dVar = (t.d) it.next();
            int[] iArr = dVar.p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3788g0 == 8) {
                dVar.f3776a = true;
            } else {
                float f2 = dVar.f3810w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f3805r = 2;
                }
                float f3 = dVar.f3813z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f3806s = 2;
                }
                if (dVar.f3772W > RecyclerView.A0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3805r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f3806s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f3805r == 0) {
                            dVar.f3805r = 3;
                        }
                        if (dVar.f3806s == 0) {
                            dVar.f3806s = 3;
                        }
                    }
                }
                t.c cVar = dVar.f3760K;
                t.c cVar2 = dVar.f3758I;
                if (i7 == 3 && dVar.f3805r == 1 && (cVar2.f3748f == null || cVar.f3748f == null)) {
                    i7 = 2;
                }
                t.c cVar3 = dVar.f3761L;
                t.c cVar4 = dVar.f3759J;
                int i9 = (i8 == 3 && dVar.f3806s == 1 && (cVar4.f3748f == null || cVar3.f3748f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f3805r;
                kVar.f3943a = i10;
                m mVar = dVar.f3783e;
                mVar.d = i9;
                int i11 = dVar.f3806s;
                mVar.f3943a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3749g) - cVar.f3749g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3749g) - cVar3.f3749g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f3946e.d(dVar.q());
                    dVar.f3783e.f3946e.d(dVar.k());
                    dVar.f3776a = true;
                } else {
                    int[] iArr2 = eVar.p0;
                    t.c[] cVarArr = dVar.f3766Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3772W) + 0.5f), 1, k3, dVar);
                        dVar.d.f3946e.d(dVar.q());
                        dVar.f3783e.f3946e.d(dVar.k());
                        dVar.f3776a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3946e.f3931m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f3946e.d(dVar.q());
                            dVar.f3783e.f3946e.d(dVar.k());
                            dVar.f3776a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3748f == null || cVarArr[1].f3748f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3946e.d(dVar.q());
                        dVar.f3783e.f3946e.d(dVar.k());
                        dVar.f3776a = true;
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
                                dVar.d.f3946e.f3931m = dVar.q();
                                dVar.f3783e.f3946e.f3931m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3772W;
                            if (dVar.f3773X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f3946e.d(dVar.q());
                            dVar.f3783e.f3946e.d(dVar.k());
                            dVar.f3776a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3783e.f3946e.f3931m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3946e.d(dVar.q());
                                    dVar.f3783e.f3946e.d(dVar.k());
                                    dVar.f3776a = true;
                                }
                            } else if (cVarArr[2].f3748f == null || cVarArr[3].f3748f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f3946e.d(dVar.q());
                                dVar.f3783e.f3946e.d(dVar.k());
                                dVar.f3776a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f3946e.f3931m = dVar.q();
                                    dVar.f3783e.f3946e.f3931m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3946e.d(dVar.q());
                                    dVar.f3783e.f3946e.d(dVar.k());
                                    dVar.f3776a = true;
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
        ArrayList arrayList = this.f3917e;
        arrayList.clear();
        t.e eVar = this.d;
        eVar.d.f();
        eVar.f3783e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3783e);
        Iterator it = eVar.f3824q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            t.d dVar = (t.d) it.next();
            if (dVar instanceof t.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3783e.f();
                iVar.f3947f = ((t.h) dVar).f3888u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3778b == null) {
                        dVar.f3778b = new C0302c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3778b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3780c == null) {
                        dVar.f3780c = new C0302c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3780c);
                } else {
                    arrayList.add(dVar.f3783e);
                }
                if (dVar instanceof t.i) {
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
            if (oVar.f3944b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.f3920h;
        arrayList2.clear();
        t.e eVar2 = this.f3914a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3783e, 1, arrayList2);
        this.f3915b = false;
    }

    public final int d(t.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        t.e eVar2 = eVar;
        ArrayList arrayList2 = this.f3920h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            o oVar = ((l) arrayList2.get(i4)).f3934a;
            if (!(oVar instanceof C0302c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0302c) oVar).f3947f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3783e).f3949h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3783e).i;
                boolean contains = oVar.f3949h.f3930l.contains(fVar);
                f fVar3 = oVar.i;
                boolean contains2 = fVar3.f3930l.contains(fVar2);
                long j3 = oVar.j();
                f fVar4 = oVar.f3949h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(fVar3, 0L);
                    long j4 = b2 - j3;
                    int i5 = fVar3.f3925f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = fVar4.f3925f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    t.d dVar = oVar.f3944b;
                    if (i == 0) {
                        f2 = dVar.f3782d0;
                    } else if (i == 1) {
                        f2 = dVar.f3784e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.A0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f3925f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f3925f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f3925f), fVar4.f3925f + j3) : contains2 ? Math.max(-l.a(fVar3, fVar3.f3925f), (-fVar3.f3925f) + j3) : (oVar.j() + fVar4.f3925f) - fVar3.f3925f;
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
        Iterator it = oVar.f3949h.f3929k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0303d interfaceC0303d = (InterfaceC0303d) it.next();
            if (interfaceC0303d instanceof f) {
                a((f) interfaceC0303d, i, arrayList, null);
            } else if (interfaceC0303d instanceof o) {
                a(((o) interfaceC0303d).f3949h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f3929k.iterator();
        while (it2.hasNext()) {
            InterfaceC0303d interfaceC0303d2 = (InterfaceC0303d) it2.next();
            if (interfaceC0303d2 instanceof f) {
                a((f) interfaceC0303d2, i, arrayList, null);
            } else if (interfaceC0303d2 instanceof o) {
                a(((o) interfaceC0303d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f3936k.f3929k.iterator();
            while (it3.hasNext()) {
                InterfaceC0303d interfaceC0303d3 = (InterfaceC0303d) it3.next();
                if (interfaceC0303d3 instanceof f) {
                    a((f) interfaceC0303d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, t.d dVar) {
        C0301b c0301b = this.f3919g;
        c0301b.f3904a = i;
        c0301b.f3905b = i3;
        c0301b.f3906c = i2;
        c0301b.d = i4;
        this.f3918f.b(dVar, c0301b);
        dVar.O(c0301b.f3907e);
        dVar.L(c0301b.f3908f);
        dVar.f3755E = c0301b.f3910h;
        dVar.I(c0301b.f3909g);
    }

    public final void g() {
        C0300a c0300a;
        Iterator it = this.f3914a.f3824q0.iterator();
        while (it.hasNext()) {
            t.d dVar = (t.d) it.next();
            if (!dVar.f3776a) {
                int[] iArr = dVar.p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f3805r;
                int i4 = dVar.f3806s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f3946e;
                boolean z4 = gVar.f3928j;
                g gVar2 = dVar.f3783e.f3946e;
                boolean z5 = gVar2.f3928j;
                if (z4 && z5) {
                    f(1, gVar.f3926g, 1, gVar2.f3926g, dVar);
                    dVar.f3776a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f3926g, 2, gVar2.f3926g, dVar);
                    if (i2 == 3) {
                        dVar.f3783e.f3946e.f3931m = dVar.k();
                    } else {
                        dVar.f3783e.f3946e.d(dVar.k());
                        dVar.f3776a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f3926g, 1, gVar2.f3926g, dVar);
                    if (i == 3) {
                        dVar.d.f3946e.f3931m = dVar.q();
                    } else {
                        dVar.d.f3946e.d(dVar.q());
                        dVar.f3776a = true;
                    }
                }
                if (dVar.f3776a && (c0300a = dVar.f3783e.f3937l) != null) {
                    c0300a.d(dVar.f3777a0);
                }
            }
        }
    }
}
