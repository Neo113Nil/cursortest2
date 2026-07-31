package y2;

import a0.g1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import z2.n;
import z2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends d {
    public int A0;
    public b[] B0;
    public b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final z2.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f8788q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final g1 f8789r0 = new g1(this);

    /* renamed from: s0, reason: collision with root package name */
    public final z2.e f8790s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f8791t0;

    /* renamed from: u0, reason: collision with root package name */
    public b3.f f8792u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8793v0;

    /* renamed from: w0, reason: collision with root package name */
    public final w2.c f8794w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f8795x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f8796y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f8797z0;

    public e() {
        z2.e eVar = new z2.e();
        eVar.f9130b = true;
        eVar.f9131c = true;
        eVar.f9133e = new ArrayList();
        new ArrayList();
        eVar.f9134f = null;
        eVar.f9135g = new z2.b();
        eVar.f9136h = new ArrayList();
        eVar.f9129a = this;
        eVar.f9132d = this;
        this.f8790s0 = eVar;
        this.f8792u0 = null;
        this.f8793v0 = false;
        this.f8794w0 = new w2.c();
        this.f8797z0 = 0;
        this.A0 = 0;
        this.B0 = new b[4];
        this.C0 = new b[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new z2.b();
    }

    public static void V(d dVar, b3.f fVar, z2.b bVar) {
        int i;
        int i8;
        if (fVar == null) {
            return;
        }
        int i9 = dVar.f8760g0;
        int[] iArr = dVar.f8781t;
        if (i9 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f9122e = 0;
            bVar.f9123f = 0;
            return;
        }
        int[] iArr2 = dVar.f8777p0;
        bVar.f9118a = iArr2[0];
        bVar.f9119b = iArr2[1];
        bVar.f9120c = dVar.q();
        bVar.f9121d = dVar.k();
        bVar.i = false;
        bVar.f9126j = 0;
        boolean z3 = bVar.f9118a == 3;
        boolean z7 = bVar.f9119b == 3;
        boolean z8 = z3 && dVar.W > 0.0f;
        boolean z9 = z7 && dVar.W > 0.0f;
        if (z3 && dVar.t(0) && dVar.f8779r == 0 && !z8) {
            bVar.f9118a = 2;
            if (z7 && dVar.f8780s == 0) {
                bVar.f9118a = 1;
            }
            z3 = false;
        }
        if (z7 && dVar.t(1) && dVar.f8780s == 0 && !z9) {
            bVar.f9119b = 2;
            if (z3 && dVar.f8779r == 0) {
                bVar.f9119b = 1;
            }
            z7 = false;
        }
        if (dVar.A()) {
            bVar.f9118a = 1;
            z3 = false;
        }
        if (dVar.B()) {
            bVar.f9119b = 1;
            z7 = false;
        }
        if (z8) {
            if (iArr[0] == 4) {
                bVar.f9118a = 1;
            } else if (!z7) {
                if (bVar.f9119b == 1) {
                    i8 = bVar.f9121d;
                } else {
                    bVar.f9118a = 2;
                    fVar.b(dVar, bVar);
                    i8 = bVar.f9123f;
                }
                bVar.f9118a = 1;
                bVar.f9120c = (int) (dVar.W * i8);
            }
        }
        if (z9) {
            if (iArr[1] == 4) {
                bVar.f9119b = 1;
            } else if (!z3) {
                if (bVar.f9118a == 1) {
                    i = bVar.f9120c;
                } else {
                    bVar.f9119b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.f9122e;
                }
                bVar.f9119b = 1;
                if (dVar.X == -1) {
                    bVar.f9121d = (int) (i / dVar.W);
                } else {
                    bVar.f9121d = (int) (dVar.W * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f9122e);
        dVar.L(bVar.f9123f);
        dVar.E = bVar.f9125h;
        dVar.I(bVar.f9124g);
        bVar.f9126j = 0;
    }

    @Override // y2.d
    public final void C() {
        this.f8794w0.t();
        this.f8795x0 = 0;
        this.f8796y0 = 0;
        this.f8788q0.clear();
        super.C();
    }

    @Override // y2.d
    public final void F(g1 g1Var) {
        super.F(g1Var);
        int size = this.f8788q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f8788q0.get(i)).F(g1Var);
        }
    }

    @Override // y2.d
    public final void P(boolean z3, boolean z7) {
        super.P(z3, z7);
        int size = this.f8788q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f8788q0.get(i)).P(z3, z7);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i8 = this.f8797z0 + 1;
            b[] bVarArr = this.C0;
            if (i8 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i9 = this.f8797z0;
            bVarArr2[i9] = new b(dVar, 0, this.f8793v0);
            this.f8797z0 = i9 + 1;
            return;
        }
        if (i == 1) {
            int i10 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i10 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i11 = this.A0;
            bVarArr4[i11] = new b(dVar, 1, this.f8793v0);
            this.A0 = i11 + 1;
        }
    }

    public final void S(w2.c cVar) {
        e eVar;
        w2.c cVar2;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f8788q0.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f8788q0.get(i);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar2 = (d) this.f8788q0.get(i8);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i9 = 0; i9 < aVar.f8832r0; i9++) {
                        d dVar3 = aVar.f8831q0[i9];
                        if (aVar.f8720t0 || dVar3.c()) {
                            int i10 = aVar.f8719s0;
                            if (i10 == 0 || i10 == 1) {
                                dVar3.S[0] = true;
                            } else if (i10 == 2 || i10 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar4 = (d) this.f8788q0.get(i11);
            dVar4.getClass();
            boolean z7 = dVar4 instanceof g;
            if (z7 || (dVar4 instanceof h)) {
                if (z7) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) ((d) it.next());
                for (int i12 = 0; i12 < gVar.f8832r0; i12++) {
                    if (hashSet.contains(gVar.f8831q0[i12])) {
                        gVar.b(cVar, W);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (w2.c.f7845q) {
            HashSet hashSet2 = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                d dVar5 = (d) this.f8788q0.get(i13);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f8777p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i14 = 0; i14 < size; i14++) {
                d dVar7 = (d) eVar.f8788q0.get(i14);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f8777p0;
                    int i15 = iArr[0];
                    int i16 = iArr[1];
                    if (i15 == 2) {
                        dVar7.M(1);
                    }
                    if (i16 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i15 == 2) {
                        dVar7.M(i15);
                    }
                    if (i16 == 2) {
                        dVar7.N(i16);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.f8797z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z3) {
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        z2.e eVar = this.f8790s0;
        ArrayList arrayList = eVar.f9133e;
        e eVar2 = eVar.f9129a;
        int j7 = eVar2.j(0);
        int[] iArr = eVar2.f8777p0;
        int j8 = eVar2.j(1);
        int r7 = eVar2.r();
        int s5 = eVar2.s();
        if (z3 && (j7 == 2 || j8 == 2)) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z8 = z3;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                o oVar = (o) obj;
                if (oVar.f9166f == i && !oVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z8 && j7 == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f8753d.f9165e.d(eVar2.q());
                }
            } else if (z8 && j8 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f8755e.f9165e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i8 = 0;
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int q4 = eVar2.q() + r7;
                eVar2.f8753d.i.d(q4);
                eVar2.f8753d.f9165e.d(q4 - r7);
                i9 = 1;
            }
            i9 = i8;
        } else {
            i8 = 0;
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int k3 = eVar2.k() + s5;
                eVar2.f8755e.i.d(k3);
                eVar2.f8755e.f9165e.d(k3 - s5);
                i9 = 1;
            }
            i9 = i8;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i13 = i8;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            o oVar2 = (o) obj2;
            if (oVar2.f9166f == i && (oVar2.f9162b != eVar2 || oVar2.f9167g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i14 = i8;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            o oVar3 = (o) obj3;
            if (oVar3.f9166f == i && (i9 != 0 || oVar3.f9162b != eVar2)) {
                if (!oVar3.f9168h.f9145j || !oVar3.i.f9145j || (!(oVar3 instanceof z2.c) && !oVar3.f9165e.f9145j)) {
                    z7 = i8;
                    break;
                }
            }
        }
        z7 = 1;
        eVar2.M(j7);
        eVar2.N(j8);
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x082a A[LOOP:14: B:279:0x0828->B:280:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x062f  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        Object[] objArr;
        int i;
        int i8;
        int i9;
        int i10;
        c cVar;
        c cVar2;
        int i11;
        boolean z3;
        char c8;
        int i12;
        int i13;
        boolean z7;
        boolean z8;
        c cVar3;
        boolean z9;
        boolean z10;
        boolean[] zArr;
        boolean z11;
        int max;
        ?? r8;
        boolean z12;
        int max2;
        boolean z13;
        boolean z14;
        int i14;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        int i15;
        int i16;
        int i17;
        int i18;
        char c9;
        n nVar;
        n nVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int b8;
        int b9;
        n nVar3;
        n nVar4;
        int i23;
        boolean z15;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.f8788q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f8777p0;
        int i24 = iArr[1];
        int i25 = iArr[0];
        int i26 = this.f8791t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i26 == 0 && j.c(this.D0, 1)) {
            b3.f fVar = this.f8792u0;
            int i27 = iArr[0];
            int i28 = iArr[1];
            E();
            ArrayList arrayList = this.f8788q0;
            int size2 = arrayList.size();
            for (int i29 = 0; i29 < size2; i29++) {
                ((d) arrayList.get(i29)).E();
            }
            boolean z16 = this.f8793v0;
            if (i27 == 1) {
                J(0, q());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i30 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i30 < size2) {
                int[] iArr2 = iArr;
                d dVar = (d) arrayList.get(i30);
                int i31 = i30;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    z15 = z17;
                    if (hVar.f8829u0 == 1) {
                        int i32 = hVar.f8826r0;
                        if (i32 != -1) {
                            hVar.R(i32);
                        } else if (hVar.f8827s0 != -1 && A()) {
                            hVar.R(q() - hVar.f8827s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f8825q0 * q()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else {
                    z15 = z17;
                    if ((dVar instanceof a) && ((a) dVar).U() == 0) {
                        z17 = z15;
                        z18 = true;
                        i30 = i31 + 1;
                        iArr = iArr2;
                    }
                }
                z17 = z15;
                i30 = i31 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z17) {
                for (int i33 = 0; i33 < size2; i33 = i23 + 1) {
                    d dVar2 = (d) arrayList.get(i33);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        i23 = i33;
                        if (hVar2.f8829u0 == 1) {
                            z2.h.c(0, fVar, hVar2, z16);
                        }
                    } else {
                        i23 = i33;
                    }
                }
            }
            z2.h.c(0, fVar, this, z16);
            if (z18) {
                for (int i34 = 0; i34 < size2; i34++) {
                    d dVar3 = (d) arrayList.get(i34);
                    if (dVar3 instanceof a) {
                        a aVar = (a) dVar3;
                        if (aVar.U() == 0 && aVar.T()) {
                            z2.h.c(1, fVar, aVar, z16);
                        }
                    }
                }
            }
            if (i28 == 1) {
                K(0, k());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            int i35 = 0;
            boolean z19 = false;
            boolean z20 = false;
            while (i35 < size2) {
                d dVar4 = (d) arrayList.get(i35);
                int i36 = i35;
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f8829u0 == 0) {
                        int i37 = hVar3.f8826r0;
                        if (i37 != -1) {
                            hVar3.R(i37);
                        } else if (hVar3.f8827s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f8827s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f8825q0 * k()) + 0.5f));
                        }
                        z19 = true;
                    }
                } else if ((dVar4 instanceof a) && ((a) dVar4).U() == 1) {
                    z20 = true;
                }
                i35 = i36 + 1;
            }
            if (z19) {
                for (int i38 = 0; i38 < size2; i38++) {
                    d dVar5 = (d) arrayList.get(i38);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f8829u0 == 0) {
                            z2.h.i(1, fVar, hVar4);
                        }
                    }
                }
            }
            z2.h.i(0, fVar, this);
            if (z20) {
                for (int i39 = 0; i39 < size2; i39++) {
                    d dVar6 = (d) arrayList.get(i39);
                    if (dVar6 instanceof a) {
                        a aVar2 = (a) dVar6;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            z2.h.i(1, fVar, aVar2);
                        }
                    }
                }
            }
            for (int i40 = 0; i40 < size2; i40++) {
                d dVar7 = (d) arrayList.get(i40);
                if (dVar7.z() && z2.h.a(dVar7)) {
                    V(dVar7, fVar, z2.h.f9149a);
                    if (!(dVar7 instanceof h)) {
                        z2.h.c(0, fVar, dVar7, z16);
                        z2.h.i(0, fVar, dVar7);
                    } else if (((h) dVar7).f8829u0 == 0) {
                        z2.h.i(0, fVar, dVar7);
                    } else {
                        z2.h.c(0, fVar, dVar7, z16);
                    }
                }
            }
            for (int i41 = 0; i41 < size; i41++) {
                d dVar8 = (d) this.f8788q0.get(i41);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j7 = dVar8.j(0);
                    int j8 = dVar8.j(1);
                    if (j7 != 3 || dVar8.f8779r == 1 || j8 != 3 || dVar8.f8780s == 1) {
                        V(dVar8, this.f8792u0, new z2.b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        w2.c cVar7 = this.f8794w0;
        if (size <= 2 || !((i25 == 2 || i24 == 2) && j.c(this.D0, 1024))) {
            i = size;
            i8 = max6;
            i9 = i24;
            i10 = i25;
            cVar = cVar5;
            cVar2 = cVar6;
            i11 = max5;
        } else {
            b3.f fVar2 = this.f8792u0;
            ArrayList arrayList2 = this.f8788q0;
            int size3 = arrayList2.size();
            int i42 = 0;
            while (i42 < size3) {
                d dVar9 = (d) arrayList2.get(i42);
                char c10 = objArr[0];
                char c11 = objArr[1];
                int i43 = i42;
                int[] iArr3 = dVar9.f8777p0;
                cVar2 = cVar6;
                if (!z2.h.h(c10, c11, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i15 = max5;
                    i = size;
                    i16 = max6;
                    i17 = i24;
                    i18 = i25;
                    cVar = cVar5;
                    break;
                }
                i42 = i43 + 1;
                cVar6 = cVar2;
            }
            cVar2 = cVar6;
            i = size;
            cVar = cVar5;
            int i44 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i44 < size3) {
                int i45 = i44;
                d dVar10 = (d) arrayList2.get(i44);
                int i46 = max6;
                char c12 = objArr[0];
                int i47 = i24;
                char c13 = objArr[1];
                int i48 = max5;
                int[] iArr4 = dVar10.f8777p0;
                int i49 = i25;
                if (!z2.h.h(c12, c13, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.L0);
                }
                boolean z21 = dVar10 instanceof h;
                if (z21) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f8829u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(hVar5);
                    }
                    if (hVar5.f8829u0 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(hVar5);
                    }
                }
                if (dVar10 instanceof i) {
                    if (dVar10 instanceof a) {
                        a aVar3 = (a) dVar10;
                        if (aVar3.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(aVar3);
                        }
                        if (aVar3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(aVar3);
                        }
                    } else {
                        i iVar = (i) dVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(iVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(iVar);
                    }
                }
                if (dVar10.I.f8744f == null && dVar10.K.f8744f == null && !z21 && !(dVar10 instanceof a)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(dVar10);
                }
                if (dVar10.J.f8744f == null && dVar10.L.f8744f == null && dVar10.M.f8744f == null && !z21 && !(dVar10 instanceof a)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(dVar10);
                }
                i44 = i45 + 1;
                max6 = i46;
                i24 = i47;
                max5 = i48;
                i25 = i49;
            }
            i15 = max5;
            i16 = max6;
            i17 = i24;
            i18 = i25;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                int i50 = 0;
                while (i50 < size4) {
                    Object obj = arrayList4.get(i50);
                    i50++;
                    z2.h.b((h) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i51 = 0;
                while (i51 < size5) {
                    Object obj2 = arrayList5.get(i51);
                    i51++;
                    i iVar2 = (i) obj2;
                    n b10 = z2.h.b(iVar2, 0, arrayList9, null);
                    iVar2.R(0, arrayList9, b10);
                    b10.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).f8739a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    z2.h.b(((c) it.next()).f8742d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f8739a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    z2.h.b(((c) it2.next()).f8742d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f8739a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    z2.h.b(((c) it3.next()).f8742d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i52 = 0;
                while (i52 < size6) {
                    Object obj3 = arrayList6.get(i52);
                    i52++;
                    z2.h.b((d) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i53 = 0;
                while (i53 < size7) {
                    Object obj4 = arrayList7.get(i53);
                    i53++;
                    z2.h.b((h) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i54 = 0;
                while (i54 < size8) {
                    Object obj5 = arrayList8.get(i54);
                    i54++;
                    i iVar3 = (i) obj5;
                    n b11 = z2.h.b(iVar3, 1, arrayList9, null);
                    iVar3.R(1, arrayList9, b11);
                    b11.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).f8739a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    z2.h.b(((c) it4.next()).f8742d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f8739a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    z2.h.b(((c) it5.next()).f8742d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f8739a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    z2.h.b(((c) it6.next()).f8742d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f8739a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    z2.h.b(((c) it7.next()).f8742d, 1, arrayList9, null);
                }
            }
            if (arrayList3 != null) {
                int size9 = arrayList3.size();
                int i55 = 0;
                while (i55 < size9) {
                    Object obj6 = arrayList3.get(i55);
                    i55++;
                    z2.h.b((d) obj6, 1, arrayList9, null);
                }
            }
            char c14 = 1;
            int i56 = 0;
            while (i56 < size3) {
                d dVar11 = (d) arrayList2.get(i56);
                int[] iArr5 = dVar11.f8777p0;
                if (iArr5[0] == 3 && iArr5[c14] == 3) {
                    int i57 = dVar11.f8773n0;
                    int size10 = arrayList9.size();
                    int i58 = 0;
                    while (true) {
                        if (i58 >= size10) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i58);
                        if (i57 == nVar3.f9157b) {
                            break;
                        } else {
                            i58++;
                        }
                    }
                    int i59 = dVar11.f8775o0;
                    int size11 = arrayList9.size();
                    int i60 = 0;
                    while (true) {
                        if (i60 >= size11) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i60);
                        if (i59 == nVar4.f9157b) {
                            break;
                        } else {
                            i60++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.f9158c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
                i56++;
                c14 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i61 = 0;
                    int i62 = 0;
                    nVar = null;
                    while (i62 < size12) {
                        Object obj7 = arrayList9.get(i62);
                        i62++;
                        n nVar5 = (n) obj7;
                        if (nVar5.f9158c != 1 && (b9 = nVar5.b(cVar7, 0)) > i61) {
                            nVar = nVar5;
                            i61 = b9;
                        }
                    }
                    c9 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i61);
                        if (objArr[c9] == 2) {
                            int size13 = arrayList9.size();
                            int i63 = 0;
                            int i64 = 0;
                            nVar2 = null;
                            while (i64 < size13) {
                                Object obj8 = arrayList9.get(i64);
                                i64++;
                                n nVar6 = (n) obj8;
                                if (nVar6.f9158c != 0 && (b8 = nVar6.b(cVar7, 1)) > i63) {
                                    nVar2 = nVar6;
                                    i63 = b8;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i63);
                                if (nVar == null || nVar2 != null) {
                                    i10 = i18;
                                    if (i10 == 2) {
                                        i19 = i15;
                                        if (i19 >= q() || i19 <= 0) {
                                            i20 = q();
                                            i9 = i17;
                                            if (i9 != 2) {
                                                i21 = i16;
                                                if (i21 >= k() || i21 <= 0) {
                                                    i22 = k();
                                                    i8 = i22;
                                                    i11 = i20;
                                                    z3 = true;
                                                    boolean z22 = !W(64) || W(128);
                                                    cVar7.getClass();
                                                    cVar7.f7853h = false;
                                                    if (this.D0 == 0 && z22) {
                                                        c8 = 1;
                                                        cVar7.f7853h = true;
                                                    } else {
                                                        c8 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f8788q0;
                                                    boolean z23 = objArr[0] != 2 || objArr[c8] == 2;
                                                    this.f8797z0 = 0;
                                                    this.A0 = 0;
                                                    i12 = i;
                                                    for (i13 = 0; i13 < i12; i13++) {
                                                        d dVar12 = (d) this.f8788q0.get(i13);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W = W(64);
                                                    boolean z24 = z3;
                                                    int i65 = 0;
                                                    z7 = true;
                                                    while (z7) {
                                                        int i66 = i65 + 1;
                                                        try {
                                                            cVar7.t();
                                                            this.f8797z0 = 0;
                                                            this.A0 = 0;
                                                            g(cVar7);
                                                            for (int i67 = 0; i67 < i12; i67++) {
                                                                ((d) this.f8788q0.get(i67)).g(cVar7);
                                                            }
                                                            S(cVar7);
                                                            try {
                                                                weakReference = this.G0;
                                                            } catch (Exception e8) {
                                                                e = e8;
                                                                cVar3 = cVar;
                                                                z9 = z23;
                                                            }
                                                        } catch (Exception e9) {
                                                            e = e9;
                                                            cVar3 = cVar;
                                                            z9 = z23;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                cVar3 = cVar;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                cVar3 = cVar;
                                                                try {
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                }
                                                                try {
                                                                    z9 = z23;
                                                                    try {
                                                                        cVar7.f(cVar7.k((c) this.G0.get()), cVar7.k(cVar3), 0, 5);
                                                                        this.G0 = null;
                                                                        weakReference2 = this.I0;
                                                                        if (weakReference2 != null && weakReference2.get() != null) {
                                                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                                            this.I0 = null;
                                                                        }
                                                                        weakReference3 = this.H0;
                                                                        if (weakReference3 != null && weakReference3.get() != null) {
                                                                            cVar4 = cVar2;
                                                                            try {
                                                                                cVar2 = cVar4;
                                                                                cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                                                this.H0 = null;
                                                                            } catch (Exception e12) {
                                                                                e = e12;
                                                                                cVar2 = cVar4;
                                                                                z7 = true;
                                                                                e.printStackTrace();
                                                                                z10 = z24;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr2 = j.f8833a;
                                                                                if (z7) {
                                                                                }
                                                                                if (z9) {
                                                                                }
                                                                                max = Math.max(this.f8750b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f8752c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z13) {
                                                                                }
                                                                                z14 = z11;
                                                                                if (i66 <= 8) {
                                                                                }
                                                                                z24 = z13;
                                                                                i65 = i66;
                                                                                z23 = z9;
                                                                                cVar = cVar3;
                                                                            }
                                                                        }
                                                                        weakReference4 = this.J0;
                                                                        if (weakReference4 == null && weakReference4.get() != null) {
                                                                            try {
                                                                            } catch (Exception e13) {
                                                                                e = e13;
                                                                            }
                                                                            try {
                                                                                cVar7.f(cVar7.k(this.K), cVar7.k((c) this.J0.get()), 0, 5);
                                                                            } catch (Exception e14) {
                                                                                e = e14;
                                                                                z7 = true;
                                                                                e.printStackTrace();
                                                                                z10 = z24;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f8833a;
                                                                                if (z7) {
                                                                                }
                                                                                if (z9) {
                                                                                }
                                                                                max = Math.max(this.f8750b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f8752c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z13) {
                                                                                }
                                                                                z14 = z11;
                                                                                if (i66 <= 8) {
                                                                                }
                                                                                z24 = z13;
                                                                                i65 = i66;
                                                                                z23 = z9;
                                                                                cVar = cVar3;
                                                                            }
                                                                            try {
                                                                                this.J0 = null;
                                                                            } catch (Exception e15) {
                                                                                e = e15;
                                                                                z7 = true;
                                                                                e.printStackTrace();
                                                                                z10 = z24;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr222 = j.f8833a;
                                                                                if (z7) {
                                                                                }
                                                                                if (z9) {
                                                                                }
                                                                                max = Math.max(this.f8750b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f8752c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z13) {
                                                                                }
                                                                                z14 = z11;
                                                                                if (i66 <= 8) {
                                                                                }
                                                                                z24 = z13;
                                                                                i65 = i66;
                                                                                z23 = z9;
                                                                                cVar = cVar3;
                                                                            }
                                                                        }
                                                                        cVar7.p();
                                                                        z10 = z24;
                                                                        z7 = true;
                                                                    } catch (Exception e16) {
                                                                        e = e16;
                                                                        z7 = true;
                                                                        e.printStackTrace();
                                                                        z10 = z24;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        boolean[] zArr2222 = j.f8833a;
                                                                        if (z7) {
                                                                        }
                                                                        if (z9) {
                                                                        }
                                                                        max = Math.max(this.f8750b0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.f8752c0, k());
                                                                        if (max2 > k()) {
                                                                        }
                                                                        if (!z13) {
                                                                        }
                                                                        z14 = z11;
                                                                        if (i66 <= 8) {
                                                                        }
                                                                        z24 = z13;
                                                                        i65 = i66;
                                                                        z23 = z9;
                                                                        cVar = cVar3;
                                                                    }
                                                                } catch (Exception e17) {
                                                                    e = e17;
                                                                    z9 = z23;
                                                                    z7 = true;
                                                                    e.printStackTrace();
                                                                    z10 = z24;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr22222 = j.f8833a;
                                                                    if (z7) {
                                                                    }
                                                                    if (z9) {
                                                                    }
                                                                    max = Math.max(this.f8750b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f8752c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z13) {
                                                                    }
                                                                    z14 = z11;
                                                                    if (i66 <= 8) {
                                                                    }
                                                                    z24 = z13;
                                                                    i65 = i66;
                                                                    z23 = z9;
                                                                    cVar = cVar3;
                                                                }
                                                                boolean[] zArr222222 = j.f8833a;
                                                                if (z7) {
                                                                    zArr222222[2] = false;
                                                                    boolean W2 = W(64);
                                                                    Q(cVar7, W2);
                                                                    int size14 = this.f8788q0.size();
                                                                    int i68 = 0;
                                                                    z11 = false;
                                                                    while (i68 < size14) {
                                                                        d dVar13 = (d) this.f8788q0.get(i68);
                                                                        dVar13.Q(cVar7, W2);
                                                                        boolean[] zArr3 = zArr222222;
                                                                        boolean z25 = W2;
                                                                        if (dVar13.f8761h != -1 || dVar13.i != -1) {
                                                                            z11 = true;
                                                                        }
                                                                        i68++;
                                                                        zArr222222 = zArr3;
                                                                        W2 = z25;
                                                                    }
                                                                    zArr = zArr222222;
                                                                } else {
                                                                    zArr = zArr222222;
                                                                    Q(cVar7, W);
                                                                    for (int i69 = 0; i69 < i12; i69++) {
                                                                        ((d) this.f8788q0.get(i69)).Q(cVar7, W);
                                                                    }
                                                                    z11 = false;
                                                                }
                                                                if (z9 && i66 < 8 && zArr[2]) {
                                                                    int i70 = 0;
                                                                    int i71 = 0;
                                                                    for (i14 = 0; i14 < i12; i14++) {
                                                                        d dVar14 = (d) this.f8788q0.get(i14);
                                                                        i70 = Math.max(i70, dVar14.q() + dVar14.Y);
                                                                        i71 = Math.max(i71, dVar14.k() + dVar14.Z);
                                                                    }
                                                                    max3 = Math.max(this.f8750b0, i70);
                                                                    max4 = Math.max(this.f8752c0, i71);
                                                                    if (i10 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z11 = true;
                                                                        z10 = true;
                                                                    }
                                                                    if (i9 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z11 = true;
                                                                        z10 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f8750b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r8 = 1;
                                                                    objArr[0] = 1;
                                                                    z11 = true;
                                                                    z12 = true;
                                                                } else {
                                                                    r8 = 1;
                                                                    z12 = z10;
                                                                }
                                                                max2 = Math.max(this.f8752c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r8] = r8;
                                                                    z13 = r8;
                                                                    z11 = z13;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                if (!z13) {
                                                                    if (objArr[0] == 2 && i11 > 0 && q() > i11) {
                                                                        this.E0 = r8;
                                                                        objArr[0] = r8;
                                                                        O(i11);
                                                                        z13 = r8;
                                                                        z11 = z13;
                                                                    }
                                                                    if (objArr[r8] == 2 && i8 > 0 && k() > i8) {
                                                                        this.F0 = r8;
                                                                        objArr[r8] = r8;
                                                                        L(i8);
                                                                        z13 = true;
                                                                        z14 = true;
                                                                        z7 = i66 <= 8 ? false : z14;
                                                                        z24 = z13;
                                                                        i65 = i66;
                                                                        z23 = z9;
                                                                        cVar = cVar3;
                                                                    }
                                                                }
                                                                z14 = z11;
                                                                if (i66 <= 8) {
                                                                }
                                                                z24 = z13;
                                                                i65 = i66;
                                                                z23 = z9;
                                                                cVar = cVar3;
                                                            }
                                                        }
                                                        cVar3 = cVar;
                                                        z9 = z23;
                                                        weakReference2 = this.I0;
                                                        if (weakReference2 != null) {
                                                            cVar7.f(cVar7.k(this.L), cVar7.k((c) this.I0.get()), 0, 5);
                                                            this.I0 = null;
                                                        }
                                                        weakReference3 = this.H0;
                                                        if (weakReference3 != null) {
                                                            cVar4 = cVar2;
                                                            cVar2 = cVar4;
                                                            cVar7.f(cVar7.k((c) this.H0.get()), cVar7.k(cVar4), 0, 5);
                                                            this.H0 = null;
                                                        }
                                                        weakReference4 = this.J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        cVar7.p();
                                                        z10 = z24;
                                                        z7 = true;
                                                        boolean[] zArr2222222 = j.f8833a;
                                                        if (z7) {
                                                        }
                                                        if (z9) {
                                                            int i702 = 0;
                                                            int i712 = 0;
                                                            while (i14 < i12) {
                                                            }
                                                            max3 = Math.max(this.f8750b0, i702);
                                                            max4 = Math.max(this.f8752c0, i712);
                                                            if (i10 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z11 = true;
                                                                z10 = true;
                                                            }
                                                            if (i9 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z11 = true;
                                                                z10 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f8750b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f8752c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z13) {
                                                        }
                                                        z14 = z11;
                                                        if (i66 <= 8) {
                                                        }
                                                        z24 = z13;
                                                        i65 = i66;
                                                        z23 = z9;
                                                        cVar = cVar3;
                                                    }
                                                    z8 = z24;
                                                    this.f8788q0 = arrayList10;
                                                    if (z8) {
                                                        objArr[0] = i10;
                                                        objArr[1] = i9;
                                                    }
                                                    F(cVar7.f7857m);
                                                }
                                                L(i21);
                                                this.F0 = true;
                                            } else {
                                                i21 = i16;
                                            }
                                            i22 = i21;
                                            i8 = i22;
                                            i11 = i20;
                                            z3 = true;
                                            if (W(64)) {
                                            }
                                            cVar7.getClass();
                                            cVar7.f7853h = false;
                                            if (this.D0 == 0) {
                                            }
                                            c8 = 1;
                                            ArrayList arrayList102 = this.f8788q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f8797z0 = 0;
                                            this.A0 = 0;
                                            i12 = i;
                                            while (i13 < i12) {
                                            }
                                            boolean W3 = W(64);
                                            boolean z242 = z3;
                                            int i652 = 0;
                                            z7 = true;
                                            while (z7) {
                                            }
                                            z8 = z242;
                                            this.f8788q0 = arrayList102;
                                            if (z8) {
                                            }
                                            F(cVar7.f7857m);
                                        }
                                        O(i19);
                                        this.E0 = true;
                                    } else {
                                        i19 = i15;
                                    }
                                    i20 = i19;
                                    i9 = i17;
                                    if (i9 != 2) {
                                    }
                                    i22 = i21;
                                    i8 = i22;
                                    i11 = i20;
                                    z3 = true;
                                    if (W(64)) {
                                    }
                                    cVar7.getClass();
                                    cVar7.f7853h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c8 = 1;
                                    ArrayList arrayList1022 = this.f8788q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f8797z0 = 0;
                                    this.A0 = 0;
                                    i12 = i;
                                    while (i13 < i12) {
                                    }
                                    boolean W32 = W(64);
                                    boolean z2422 = z3;
                                    int i6522 = 0;
                                    z7 = true;
                                    while (z7) {
                                    }
                                    z8 = z2422;
                                    this.f8788q0 = arrayList1022;
                                    if (z8) {
                                    }
                                    F(cVar7.f7857m);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i10 = i18;
                        if (i10 == 2) {
                        }
                        i20 = i19;
                        i9 = i17;
                        if (i9 != 2) {
                        }
                        i22 = i21;
                        i8 = i22;
                        i11 = i20;
                        z3 = true;
                        if (W(64)) {
                        }
                        cVar7.getClass();
                        cVar7.f7853h = false;
                        if (this.D0 == 0) {
                        }
                        c8 = 1;
                        ArrayList arrayList10222 = this.f8788q0;
                        if (objArr[0] != 2) {
                        }
                        this.f8797z0 = 0;
                        this.A0 = 0;
                        i12 = i;
                        while (i13 < i12) {
                        }
                        boolean W322 = W(64);
                        boolean z24222 = z3;
                        int i65222 = 0;
                        z7 = true;
                        while (z7) {
                        }
                        z8 = z24222;
                        this.f8788q0 = arrayList10222;
                        if (z8) {
                        }
                        F(cVar7.f7857m);
                    }
                } else {
                    c9 = 1;
                }
                nVar = null;
                if (objArr[c9] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i10 = i18;
                if (i10 == 2) {
                }
                i20 = i19;
                i9 = i17;
                if (i9 != 2) {
                }
                i22 = i21;
                i8 = i22;
                i11 = i20;
                z3 = true;
                if (W(64)) {
                }
                cVar7.getClass();
                cVar7.f7853h = false;
                if (this.D0 == 0) {
                }
                c8 = 1;
                ArrayList arrayList102222 = this.f8788q0;
                if (objArr[0] != 2) {
                }
                this.f8797z0 = 0;
                this.A0 = 0;
                i12 = i;
                while (i13 < i12) {
                }
                boolean W3222 = W(64);
                boolean z242222 = z3;
                int i652222 = 0;
                z7 = true;
                while (z7) {
                }
                z8 = z242222;
                this.f8788q0 = arrayList102222;
                if (z8) {
                }
                F(cVar7.f7857m);
            }
            i8 = i16;
            i9 = i17;
            i11 = i15;
            i10 = i18;
        }
        z3 = false;
        if (W(64)) {
        }
        cVar7.getClass();
        cVar7.f7853h = false;
        if (this.D0 == 0) {
        }
        c8 = 1;
        ArrayList arrayList1022222 = this.f8788q0;
        if (objArr[0] != 2) {
        }
        this.f8797z0 = 0;
        this.A0 = 0;
        i12 = i;
        while (i13 < i12) {
        }
        boolean W32222 = W(64);
        boolean z2422222 = z3;
        int i6522222 = 0;
        z7 = true;
        while (z7) {
        }
        z8 = z2422222;
        this.f8788q0 = arrayList1022222;
        if (z8) {
        }
        F(cVar7.f7857m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // y2.d
    public final void n(StringBuilder sb) {
        sb.append(this.f8764j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f8788q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
