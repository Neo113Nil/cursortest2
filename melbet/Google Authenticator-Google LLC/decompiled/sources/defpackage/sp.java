package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sp {
    public final se a;
    public final se d;
    final ArrayList f;
    public te g;
    private final sm h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public sp(se seVar) {
        new ArrayList();
        this.g = null;
        this.h = new sm();
        this.f = new ArrayList();
        this.a = seVar;
        this.d = seVar;
    }

    private final void e(sy syVar, int i, ArrayList arrayList) {
        sq sqVar = syVar.h;
        for (so soVar : sqVar.j) {
            if (soVar instanceof sq) {
                g((sq) soVar, i, syVar.i, arrayList, null);
            } else if (soVar instanceof sy) {
                g(((sy) soVar).h, i, syVar.i, arrayList, null);
            }
        }
        for (so soVar2 : syVar.i.j) {
            if (soVar2 instanceof sq) {
                g((sq) soVar2, i, sqVar, arrayList, null);
            } else if (soVar2 instanceof sy) {
                g(((sy) soVar2).i, i, sqVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (so soVar3 : ((sw) syVar).a.j) {
                if (soVar3 instanceof sq) {
                    g((sq) soVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(sd sdVar, int i, int i2, int i3, int i4) {
        sm smVar = this.h;
        smVar.i = i;
        smVar.j = i3;
        smVar.a = i2;
        smVar.b = i4;
        this.g.a(sdVar, smVar);
        sdVar.E(smVar.c);
        sdVar.z(smVar.d);
        sdVar.G = smVar.f;
        sdVar.w(smVar.e);
    }

    private final void g(sq sqVar, int i, sq sqVar2, ArrayList arrayList, boe boeVar) {
        sy syVar = sqVar.d;
        if (syVar.l == null) {
            se seVar = this.a;
            if (syVar == seVar.h || syVar == seVar.i) {
                return;
            }
            if (boeVar == null) {
                boeVar = new boe(syVar);
                arrayList.add(boeVar);
            }
            boe boeVar2 = boeVar;
            syVar.l = boeVar2;
            ((ArrayList) boeVar2.b).add(syVar);
            sq sqVar3 = syVar.h;
            for (so soVar : sqVar3.j) {
                if (soVar instanceof sq) {
                    g((sq) soVar, i, sqVar2, arrayList, boeVar2);
                }
            }
            sq sqVar4 = syVar.i;
            for (so soVar2 : sqVar4.j) {
                if (soVar2 instanceof sq) {
                    g((sq) soVar2, i, sqVar2, arrayList, boeVar2);
                }
            }
            if (i == 1 && (syVar instanceof sw)) {
                for (so soVar3 : ((sw) syVar).a.j) {
                    if (soVar3 instanceof sq) {
                        g((sq) soVar3, 1, sqVar2, arrayList, boeVar2);
                    }
                }
            }
            Iterator it = sqVar3.k.iterator();
            while (it.hasNext()) {
                g((sq) it.next(), i, sqVar2, arrayList, boeVar2);
            }
            Iterator it2 = sqVar4.k.iterator();
            while (it2.hasNext()) {
                g((sq) it2.next(), i, sqVar2, arrayList, boeVar2);
            }
            if (i == 1 && (syVar instanceof sw)) {
                Iterator it3 = ((sw) syVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((sq) it3.next(), 1, sqVar2, arrayList, boeVar2);
                }
            }
        }
    }

    public final int a(se seVar, int i) {
        ArrayList arrayList;
        long a;
        se seVar2 = seVar;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        while (i2 < size) {
            boe boeVar = (boe) arrayList2.get(i2);
            Object obj = boeVar.a;
            if (!(obj instanceof sn) ? !(i != 0 ? (obj instanceof sw) : (obj instanceof sv)) : ((sn) obj).f != i) {
                sq sqVar = i == 0 ? seVar2.h.h : seVar2.i.h;
                sq sqVar2 = i == 0 ? seVar2.h.i : seVar2.i.i;
                boolean contains = ((sy) obj).h.k.contains(sqVar);
                boolean contains2 = ((sy) boeVar.a).i.k.contains(sqVar2);
                long a2 = ((sy) boeVar.a).a();
                if (contains && contains2) {
                    long g = boeVar.g(((sy) boeVar.a).h, j);
                    long f = boeVar.f(((sy) boeVar.a).i, j);
                    long j3 = g - a2;
                    sy syVar = (sy) boeVar.a;
                    arrayList = arrayList2;
                    long j4 = syVar.i.e;
                    if (j3 >= (-r5)) {
                        j3 += j4;
                    }
                    long j5 = (-f) - a2;
                    long j6 = syVar.h.e;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    sd sdVar = syVar.d;
                    float f2 = i == 0 ? sdVar.af : sdVar.ag;
                    float f3 = 1.0f - f2;
                    float f4 = f2 > 0.0f ? (long) ((j7 / f2) + (j3 / f3)) : 0L;
                    a = (j6 + ((((long) ((f2 * f4) + 0.5f)) + a2) + ((long) ((f4 * f3) + 0.5f)))) - j4;
                } else {
                    arrayList = arrayList2;
                    if (contains) {
                        a = Math.max(boeVar.g(((sy) boeVar.a).h, r0.e), ((sy) boeVar.a).h.e + a2);
                    } else if (contains2) {
                        a = Math.max(-boeVar.f(((sy) boeVar.a).i, r0.e), (-((sy) boeVar.a).i.e) + a2);
                    } else {
                        a = (r0.h.e + ((sy) boeVar.a).a()) - ((sy) boeVar.a).i.e;
                    }
                }
            } else {
                a = j;
                arrayList = arrayList2;
            }
            j2 = Math.max(j2, a);
            i2++;
            seVar2 = seVar;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) j2;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        se seVar = this.d;
        seVar.h.d();
        seVar.i.d();
        arrayList.add(seVar.h);
        arrayList.add(seVar.i);
        ArrayList arrayList2 = seVar.aJ;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            sd sdVar = (sd) arrayList2.get(i);
            if (sdVar instanceof sh) {
                arrayList.add(new st(sdVar));
            } else {
                if (sdVar.J()) {
                    if (sdVar.f == null) {
                        sdVar.f = new sn(sdVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(sdVar.f);
                } else {
                    arrayList.add(sdVar.h);
                }
                if (sdVar.K()) {
                    if (sdVar.g == null) {
                        sdVar.g = new sn(sdVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(sdVar.g);
                } else {
                    arrayList.add(sdVar.i);
                }
                if (sdVar instanceof si) {
                    arrayList.add(new su(sdVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((sy) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            sy syVar = (sy) arrayList.get(i3);
            if (syVar.d != seVar) {
                syVar.b();
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        boe.c = 0;
        se seVar2 = this.a;
        e(seVar2.h, 0, arrayList3);
        e(seVar2.i, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        sp spVar;
        sr srVar;
        ArrayList arrayList = this.a.aJ;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sd sdVar = (sd) arrayList.get(i2);
            if (sdVar.e) {
                spVar = this;
            } else {
                int[] iArr = sdVar.ar;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = sdVar.t;
                int i6 = sdVar.u;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                sr srVar2 = sdVar.h.e;
                boolean z3 = srVar2.i;
                sr srVar3 = sdVar.i.e;
                boolean z4 = srVar3.i;
                if (z3 && z4) {
                    spVar = this;
                    spVar.f(sdVar, 1, srVar2.f, 1, srVar3.f);
                    sdVar.e = true;
                } else {
                    if (z3 && z2) {
                        this.f(sdVar, 1, srVar2.f, 2, srVar3.f);
                        if (i4 == 3) {
                            sdVar.i.e.m = sdVar.h();
                        } else {
                            sdVar.i.e.c(sdVar.h());
                            sdVar.e = true;
                        }
                    } else if (z4 && z) {
                        spVar = this;
                        spVar.f(sdVar, 2, srVar2.f, 1, srVar3.f);
                        if (i == 3) {
                            sdVar.h.e.m = sdVar.j();
                        } else {
                            sdVar.h.e.c(sdVar.j());
                            sdVar.e = true;
                        }
                    }
                    spVar = this;
                }
                if (sdVar.e && (srVar = sdVar.i.b) != null) {
                    srVar.c(sdVar.ac);
                }
            }
            i2++;
            this = spVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ad, code lost:
    
        if (r5 == 2) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(se seVar) {
        char c;
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        ArrayList arrayList = seVar.aJ;
        int size = arrayList.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            sd sdVar = (sd) arrayList.get(i3);
            int[] iArr = sdVar.ar;
            int i4 = iArr[c2];
            int i5 = iArr[1];
            if (sdVar.ai == 8) {
                sdVar.e = true;
                c = c2;
            } else {
                float f4 = sdVar.y;
                int i6 = 2;
                if (f4 < 1.0f && i4 == 3) {
                    sdVar.t = 2;
                    i4 = 3;
                }
                float f5 = sdVar.B;
                if (f5 < 1.0f && i5 == 3) {
                    sdVar.u = 2;
                    i5 = 3;
                }
                if (sdVar.Y > 0.0f) {
                    if (i4 == 3 && (i5 == 2 || i5 == 1)) {
                        sdVar.t = 3;
                    } else if (i5 == 3 && (i4 == 2 || i4 == 1)) {
                        sdVar.u = 3;
                    } else if (i4 == 3 && i5 == 3) {
                        if (sdVar.t == 0) {
                            sdVar.t = 3;
                        }
                        if (sdVar.u == 0) {
                            sdVar.u = 3;
                        }
                    }
                }
                if (i4 == 3 && sdVar.t == 1 && (sdVar.K.e == null || sdVar.M.e == null)) {
                    i4 = 2;
                }
                if (i5 == 3 && sdVar.u == 1 && (sdVar.L.e == null || sdVar.N.e == null)) {
                    i5 = 2;
                }
                sv svVar = sdVar.h;
                svVar.j = i4;
                int i7 = sdVar.t;
                svVar.c = i7;
                sw swVar = sdVar.i;
                swVar.j = i5;
                c = c2;
                int i8 = sdVar.u;
                swVar.c = i8;
                if (i4 != 4 && i4 != 1) {
                    if (i4 == 2) {
                        i4 = 2;
                    }
                    if (i4 != 3 || (i5 != 2 && i5 != 1)) {
                        f = 1.0f;
                    } else if (i7 == 3) {
                        if (i5 == 2) {
                            f(sdVar, 2, 0, 2, 0);
                        }
                        int h = sdVar.h();
                        f(sdVar, 1, (int) ((h * sdVar.Y) + 0.5f), 1, h);
                        sdVar.h.e.c(sdVar.j());
                        sdVar.i.e.c(sdVar.h());
                        sdVar.e = true;
                    } else if (i7 == 1) {
                        f(sdVar, 2, 0, i5, 0);
                        sdVar.h.e.m = sdVar.j();
                    } else if (i7 == 2) {
                        f = 1.0f;
                        int i9 = seVar.ar[c];
                        if (i9 == 1 || i9 == 4) {
                            f(sdVar, 1, (int) ((f4 * seVar.j()) + 0.5f), i5, sdVar.h());
                            sdVar.h.e.c(sdVar.j());
                            sdVar.i.e.c(sdVar.h());
                            sdVar.e = true;
                        }
                    } else {
                        f = 1.0f;
                        sc[] scVarArr = sdVar.S;
                        if (scVarArr[c].e == null || scVarArr[1].e == null) {
                            f(sdVar, 2, 0, i5, 0);
                            sdVar.h.e.c(sdVar.j());
                            sdVar.i.e.c(sdVar.h());
                            sdVar.e = true;
                        }
                    }
                    if (i5 != 3 || (i4 != 2 && i4 != 1)) {
                        i2 = i4;
                        f2 = f4;
                    } else if (i8 == 3) {
                        if (i4 == 2) {
                            f(sdVar, 2, 0, 2, 0);
                        }
                        int j = sdVar.j();
                        float f6 = sdVar.Y;
                        if (sdVar.Z == -1) {
                            f6 = f / f6;
                        }
                        f(sdVar, 1, j, 1, (int) ((j * f6) + 0.5f));
                        sdVar.h.e.c(sdVar.j());
                        sdVar.i.e.c(sdVar.h());
                        sdVar.e = true;
                    } else if (i8 == 1) {
                        f(sdVar, i4, 0, 2, 0);
                        sdVar.i.e.m = sdVar.h();
                    } else {
                        i2 = i4;
                        f2 = f4;
                        if (i8 == 2) {
                            int i10 = seVar.ar[1];
                            if (i10 == 1 || i10 == 4) {
                                f(sdVar, i2, sdVar.j(), 1, (int) ((seVar.h() * f5) + 0.5f));
                                sdVar.h.e.c(sdVar.j());
                                sdVar.i.e.c(sdVar.h());
                                sdVar.e = true;
                            }
                        } else {
                            f3 = f5;
                            sc[] scVarArr2 = sdVar.S;
                            if (scVarArr2[2].e == null || scVarArr2[3].e == null) {
                                f(sdVar, 2, 0, 3, 0);
                                sdVar.h.e.c(sdVar.j());
                                sdVar.i.e.c(sdVar.h());
                                sdVar.e = true;
                            }
                            if (i2 == 3 && i5 == 3) {
                                if (i7 != 1 || i8 == 1) {
                                    f(sdVar, 2, 0, 2, 0);
                                    sdVar.h.e.m = sdVar.j();
                                    sdVar.i.e.m = sdVar.h();
                                } else if (i8 == 2 && i7 == 2) {
                                    int[] iArr2 = seVar.ar;
                                    if (iArr2[c] == 1 && iArr2[1] == 1) {
                                        f(sdVar, 1, (int) ((f2 * seVar.j()) + 0.5f), 1, (int) ((f3 * seVar.h()) + 0.5f));
                                        sdVar.h.e.c(sdVar.j());
                                        sdVar.i.e.c(sdVar.h());
                                        sdVar.e = true;
                                    }
                                }
                            }
                        }
                    }
                    f3 = f5;
                    if (i2 == 3) {
                        if (i7 != 1) {
                        }
                        f(sdVar, 2, 0, 2, 0);
                        sdVar.h.e.m = sdVar.j();
                        sdVar.i.e.m = sdVar.h();
                    }
                }
                if (i5 == 4 || i5 == 1) {
                    i6 = i5;
                }
                int j2 = sdVar.j();
                if (i4 == 4) {
                    j2 = (seVar.j() - sdVar.K.f) - sdVar.M.f;
                    i = 1;
                } else {
                    i = i4;
                }
                int i11 = j2;
                int h2 = sdVar.h();
                if (i6 == 4) {
                    h2 = (seVar.h() - sdVar.L.f) - sdVar.N.f;
                    i6 = 1;
                }
                f(sdVar, i, i11, i6, h2);
                sdVar.h.e.c(sdVar.j());
                sdVar.i.e.c(sdVar.h());
                sdVar.e = true;
            }
            i3++;
            c2 = c;
        }
    }
}
