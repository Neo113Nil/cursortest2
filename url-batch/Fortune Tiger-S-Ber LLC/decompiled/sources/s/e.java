package s;

import androidx.emoji2.text.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.n;
import t.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
    public final t.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3270q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final s f3271r0 = new s(this);

    /* renamed from: s0, reason: collision with root package name */
    public final t.e f3272s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3273t0;

    /* renamed from: u0, reason: collision with root package name */
    public v.f f3274u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3275v0;

    /* renamed from: w0, reason: collision with root package name */
    public final q.c f3276w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3277x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3278y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3279z0;

    public e() {
        t.e eVar = new t.e();
        eVar.f3329b = true;
        eVar.c = true;
        eVar.f3331e = new ArrayList();
        new ArrayList();
        eVar.f3332f = null;
        eVar.g = new t.b();
        eVar.h = new ArrayList();
        eVar.f3328a = this;
        eVar.f3330d = this;
        this.f3272s0 = eVar;
        this.f3274u0 = null;
        this.f3275v0 = false;
        this.f3276w0 = new q.c();
        this.f3279z0 = 0;
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
        this.L0 = new t.b();
    }

    public static void V(d dVar, v.f fVar, t.b bVar) {
        int i4;
        int i5;
        if (fVar == null) {
            return;
        }
        int i6 = dVar.f3242g0;
        int[] iArr = dVar.f3263t;
        if (i6 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f3322e = 0;
            bVar.f3323f = 0;
            return;
        }
        int[] iArr2 = dVar.f3259p0;
        bVar.f3319a = iArr2[0];
        bVar.f3320b = iArr2[1];
        bVar.c = dVar.q();
        bVar.f3321d = dVar.k();
        bVar.f3324i = false;
        bVar.f3325j = 0;
        boolean z3 = bVar.f3319a == 3;
        boolean z4 = bVar.f3320b == 3;
        boolean z5 = z3 && dVar.W > 0.0f;
        boolean z6 = z4 && dVar.W > 0.0f;
        if (z3 && dVar.t(0) && dVar.f3261r == 0 && !z5) {
            bVar.f3319a = 2;
            if (z4 && dVar.f3262s == 0) {
                bVar.f3319a = 1;
            }
            z3 = false;
        }
        if (z4 && dVar.t(1) && dVar.f3262s == 0 && !z6) {
            bVar.f3320b = 2;
            if (z3 && dVar.f3261r == 0) {
                bVar.f3320b = 1;
            }
            z4 = false;
        }
        if (dVar.A()) {
            bVar.f3319a = 1;
            z3 = false;
        }
        if (dVar.B()) {
            bVar.f3320b = 1;
            z4 = false;
        }
        if (z5) {
            if (iArr[0] == 4) {
                bVar.f3319a = 1;
            } else if (!z4) {
                if (bVar.f3320b == 1) {
                    i5 = bVar.f3321d;
                } else {
                    bVar.f3319a = 2;
                    fVar.b(dVar, bVar);
                    i5 = bVar.f3323f;
                }
                bVar.f3319a = 1;
                bVar.c = (int) (dVar.W * i5);
            }
        }
        if (z6) {
            if (iArr[1] == 4) {
                bVar.f3320b = 1;
            } else if (!z3) {
                if (bVar.f3319a == 1) {
                    i4 = bVar.c;
                } else {
                    bVar.f3320b = 2;
                    fVar.b(dVar, bVar);
                    i4 = bVar.f3322e;
                }
                bVar.f3320b = 1;
                if (dVar.X == -1) {
                    bVar.f3321d = (int) (i4 / dVar.W);
                } else {
                    bVar.f3321d = (int) (dVar.W * i4);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3322e);
        dVar.L(bVar.f3323f);
        dVar.E = bVar.h;
        dVar.I(bVar.g);
        bVar.f3325j = 0;
    }

    @Override // s.d
    public final void C() {
        this.f3276w0.t();
        this.f3277x0 = 0;
        this.f3278y0 = 0;
        this.f3270q0.clear();
        super.C();
    }

    @Override // s.d
    public final void F(s sVar) {
        super.F(sVar);
        int size = this.f3270q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f3270q0.get(i4)).F(sVar);
        }
    }

    @Override // s.d
    public final void P(boolean z3, boolean z4) {
        super.P(z3, z4);
        int size = this.f3270q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f3270q0.get(i4)).P(z3, z4);
        }
    }

    public final void R(d dVar, int i4) {
        if (i4 == 0) {
            int i5 = this.f3279z0 + 1;
            b[] bVarArr = this.C0;
            if (i5 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i6 = this.f3279z0;
            bVarArr2[i6] = new b(dVar, 0, this.f3275v0);
            this.f3279z0 = i6 + 1;
            return;
        }
        if (i4 == 1) {
            int i7 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i7 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i8 = this.A0;
            bVarArr4[i8] = new b(dVar, 1, this.f3275v0);
            this.A0 = i8 + 1;
        }
    }

    public final void S(q.c cVar) {
        e eVar;
        q.c cVar2;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f3270q0.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) this.f3270q0.get(i4);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                d dVar2 = (d) this.f3270q0.get(i5);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i6 = 0; i6 < aVar.f3312r0; i6++) {
                        d dVar3 = aVar.f3311q0[i6];
                        if (aVar.f3210t0 || dVar3.c()) {
                            int i7 = aVar.f3209s0;
                            if (i7 == 0 || i7 == 1) {
                                dVar3.S[0] = true;
                            } else if (i7 == 2 || i7 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i8 = 0; i8 < size; i8++) {
            d dVar4 = (d) this.f3270q0.get(i8);
            dVar4.getClass();
            boolean z4 = dVar4 instanceof g;
            if (z4 || (dVar4 instanceof h)) {
                if (z4) {
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
                for (int i9 = 0; i9 < gVar.f3312r0; i9++) {
                    if (hashSet.contains(gVar.f3311q0[i9])) {
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
        if (q.c.f3065q) {
            HashSet hashSet2 = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar5 = (d) this.f3270q0.get(i10);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f3259p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar7 = (d) eVar.f3270q0.get(i11);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f3259p0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    if (i12 == 2) {
                        dVar7.M(1);
                    }
                    if (i13 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i12 == 2) {
                        dVar7.M(i12);
                    }
                    if (i13 == 2) {
                        dVar7.N(i13);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.f3279z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i4, boolean z3) {
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        t.e eVar = this.f3272s0;
        ArrayList arrayList = eVar.f3331e;
        e eVar2 = eVar.f3328a;
        int j4 = eVar2.j(0);
        int[] iArr = eVar2.f3259p0;
        int j5 = eVar2.j(1);
        int r3 = eVar2.r();
        int s2 = eVar2.s();
        if (z3 && (j4 == 2 || j5 == 2)) {
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z5 = z3;
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                o oVar = (o) obj;
                if (oVar.f3358f == i4 && !oVar.k()) {
                    z5 = false;
                    break;
                }
            }
            if (i4 == 0) {
                if (z5 && j4 == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f3237d.f3357e.d(eVar2.q());
                }
            } else if (z5 && j5 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f3239e.f3357e.d(eVar2.k());
            }
        }
        if (i4 == 0) {
            i5 = 0;
            int i8 = iArr[0];
            if (i8 == 1 || i8 == 4) {
                int q4 = eVar2.q() + r3;
                eVar2.f3237d.f3359i.d(q4);
                eVar2.f3237d.f3357e.d(q4 - r3);
                i6 = 1;
            }
            i6 = i5;
        } else {
            i5 = 0;
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int k4 = eVar2.k() + s2;
                eVar2.f3239e.f3359i.d(k4);
                eVar2.f3239e.f3357e.d(k4 - s2);
                i6 = 1;
            }
            i6 = i5;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i10 = i5;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            o oVar2 = (o) obj2;
            if (oVar2.f3358f == i4 && (oVar2.f3355b != eVar2 || oVar2.g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i11 = i5;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            o oVar3 = (o) obj3;
            if (oVar3.f3358f == i4 && (i6 != 0 || oVar3.f3355b != eVar2)) {
                if (!oVar3.h.f3339j || !oVar3.f3359i.f3339j || (!(oVar3 instanceof t.c) && !oVar3.f3357e.f3339j)) {
                    z4 = i5;
                    break;
                }
            }
        }
        z4 = 1;
        eVar2.M(j4);
        eVar2.N(j5);
        return z4;
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
        int i4;
        int i5;
        int i6;
        int i7;
        c cVar;
        c cVar2;
        int i8;
        boolean z3;
        char c;
        int i9;
        int i10;
        boolean z4;
        boolean z5;
        c cVar3;
        boolean z6;
        boolean z7;
        boolean[] zArr;
        boolean z8;
        int max;
        ?? r8;
        boolean z9;
        int max2;
        boolean z10;
        boolean z11;
        int i11;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        int i12;
        int i13;
        int i14;
        int i15;
        char c4;
        n nVar;
        n nVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int b2;
        int b4;
        n nVar3;
        n nVar4;
        int i20;
        boolean z12;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.f3270q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f3259p0;
        int i21 = iArr[1];
        int i22 = iArr[0];
        int i23 = this.f3273t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i23 == 0 && j.c(this.D0, 1)) {
            v.f fVar = this.f3274u0;
            int i24 = iArr[0];
            int i25 = iArr[1];
            E();
            ArrayList arrayList = this.f3270q0;
            int size2 = arrayList.size();
            for (int i26 = 0; i26 < size2; i26++) {
                ((d) arrayList.get(i26)).E();
            }
            boolean z13 = this.f3275v0;
            if (i24 == 1) {
                J(0, q());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i27 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i27 < size2) {
                int[] iArr2 = iArr;
                d dVar = (d) arrayList.get(i27);
                int i28 = i27;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    z12 = z14;
                    if (hVar.f3309u0 == 1) {
                        int i29 = hVar.f3306r0;
                        if (i29 != -1) {
                            hVar.R(i29);
                        } else if (hVar.f3307s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3307s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3305q0 * q()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else {
                    z12 = z14;
                    if ((dVar instanceof a) && ((a) dVar).U() == 0) {
                        z14 = z12;
                        z15 = true;
                        i27 = i28 + 1;
                        iArr = iArr2;
                    }
                }
                z14 = z12;
                i27 = i28 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z14) {
                for (int i30 = 0; i30 < size2; i30 = i20 + 1) {
                    d dVar2 = (d) arrayList.get(i30);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        i20 = i30;
                        if (hVar2.f3309u0 == 1) {
                            t.h.c(0, hVar2, fVar, z13);
                        }
                    } else {
                        i20 = i30;
                    }
                }
            }
            t.h.c(0, this, fVar, z13);
            if (z15) {
                for (int i31 = 0; i31 < size2; i31++) {
                    d dVar3 = (d) arrayList.get(i31);
                    if (dVar3 instanceof a) {
                        a aVar = (a) dVar3;
                        if (aVar.U() == 0 && aVar.T()) {
                            t.h.c(1, aVar, fVar, z13);
                        }
                    }
                }
            }
            if (i25 == 1) {
                K(0, k());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            int i32 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i32 < size2) {
                d dVar4 = (d) arrayList.get(i32);
                int i33 = i32;
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f3309u0 == 0) {
                        int i34 = hVar3.f3306r0;
                        if (i34 != -1) {
                            hVar3.R(i34);
                        } else if (hVar3.f3307s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3307s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3305q0 * k()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else if ((dVar4 instanceof a) && ((a) dVar4).U() == 1) {
                    z17 = true;
                }
                i32 = i33 + 1;
            }
            if (z16) {
                for (int i35 = 0; i35 < size2; i35++) {
                    d dVar5 = (d) arrayList.get(i35);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f3309u0 == 0) {
                            t.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            t.h.i(0, this, fVar);
            if (z17) {
                for (int i36 = 0; i36 < size2; i36++) {
                    d dVar6 = (d) arrayList.get(i36);
                    if (dVar6 instanceof a) {
                        a aVar2 = (a) dVar6;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            t.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                d dVar7 = (d) arrayList.get(i37);
                if (dVar7.z() && t.h.a(dVar7)) {
                    V(dVar7, fVar, t.h.f3343a);
                    if (!(dVar7 instanceof h)) {
                        t.h.c(0, dVar7, fVar, z13);
                        t.h.i(0, dVar7, fVar);
                    } else if (((h) dVar7).f3309u0 == 0) {
                        t.h.i(0, dVar7, fVar);
                    } else {
                        t.h.c(0, dVar7, fVar, z13);
                    }
                }
            }
            for (int i38 = 0; i38 < size; i38++) {
                d dVar8 = (d) this.f3270q0.get(i38);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j4 = dVar8.j(0);
                    int j5 = dVar8.j(1);
                    if (j4 != 3 || dVar8.f3261r == 1 || j5 != 3 || dVar8.f3262s == 1) {
                        V(dVar8, this.f3274u0, new t.b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        q.c cVar7 = this.f3276w0;
        if (size <= 2 || !((i22 == 2 || i21 == 2) && j.c(this.D0, 1024))) {
            i4 = size;
            i5 = max6;
            i6 = i21;
            i7 = i22;
            cVar = cVar5;
            cVar2 = cVar6;
            i8 = max5;
        } else {
            v.f fVar2 = this.f3274u0;
            ArrayList arrayList2 = this.f3270q0;
            int size3 = arrayList2.size();
            int i39 = 0;
            while (i39 < size3) {
                d dVar9 = (d) arrayList2.get(i39);
                char c5 = objArr[0];
                char c6 = objArr[1];
                int i40 = i39;
                int[] iArr3 = dVar9.f3259p0;
                cVar2 = cVar6;
                if (!t.h.h(c5, c6, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i12 = max5;
                    i4 = size;
                    i13 = max6;
                    i14 = i21;
                    i15 = i22;
                    cVar = cVar5;
                    break;
                }
                i39 = i40 + 1;
                cVar6 = cVar2;
            }
            cVar2 = cVar6;
            i4 = size;
            cVar = cVar5;
            int i41 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i41 < size3) {
                int i42 = i41;
                d dVar10 = (d) arrayList2.get(i41);
                int i43 = max6;
                char c7 = objArr[0];
                int i44 = i21;
                char c8 = objArr[1];
                int i45 = max5;
                int[] iArr4 = dVar10.f3259p0;
                int i46 = i22;
                if (!t.h.h(c7, c8, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.L0);
                }
                boolean z18 = dVar10 instanceof h;
                if (z18) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f3309u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(hVar5);
                    }
                    if (hVar5.f3309u0 == 1) {
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
                if (dVar10.I.f3231f == null && dVar10.K.f3231f == null && !z18 && !(dVar10 instanceof a)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(dVar10);
                }
                if (dVar10.J.f3231f == null && dVar10.L.f3231f == null && dVar10.M.f3231f == null && !z18 && !(dVar10 instanceof a)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(dVar10);
                }
                i41 = i42 + 1;
                max6 = i43;
                i21 = i44;
                max5 = i45;
                i22 = i46;
            }
            i12 = max5;
            i13 = max6;
            i14 = i21;
            i15 = i22;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                int i47 = 0;
                while (i47 < size4) {
                    Object obj = arrayList4.get(i47);
                    i47++;
                    t.h.b((h) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i48 = 0;
                while (i48 < size5) {
                    Object obj2 = arrayList5.get(i48);
                    i48++;
                    i iVar2 = (i) obj2;
                    n b5 = t.h.b(iVar2, 0, arrayList9, null);
                    iVar2.R(0, arrayList9, b5);
                    b5.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).f3227a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    t.h.b(((c) it.next()).f3229d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3227a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    t.h.b(((c) it2.next()).f3229d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3227a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    t.h.b(((c) it3.next()).f3229d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i49 = 0;
                while (i49 < size6) {
                    Object obj3 = arrayList6.get(i49);
                    i49++;
                    t.h.b((d) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i50 = 0;
                while (i50 < size7) {
                    Object obj4 = arrayList7.get(i50);
                    i50++;
                    t.h.b((h) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i51 = 0;
                while (i51 < size8) {
                    Object obj5 = arrayList8.get(i51);
                    i51++;
                    i iVar3 = (i) obj5;
                    n b6 = t.h.b(iVar3, 1, arrayList9, null);
                    iVar3.R(1, arrayList9, b6);
                    b6.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).f3227a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    t.h.b(((c) it4.next()).f3229d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3227a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    t.h.b(((c) it5.next()).f3229d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3227a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    t.h.b(((c) it6.next()).f3229d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3227a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    t.h.b(((c) it7.next()).f3229d, 1, arrayList9, null);
                }
            }
            if (arrayList3 != null) {
                int size9 = arrayList3.size();
                int i52 = 0;
                while (i52 < size9) {
                    Object obj6 = arrayList3.get(i52);
                    i52++;
                    t.h.b((d) obj6, 1, arrayList9, null);
                }
            }
            char c9 = 1;
            int i53 = 0;
            while (i53 < size3) {
                d dVar11 = (d) arrayList2.get(i53);
                int[] iArr5 = dVar11.f3259p0;
                if (iArr5[0] == 3 && iArr5[c9] == 3) {
                    int i54 = dVar11.f3255n0;
                    int size10 = arrayList9.size();
                    int i55 = 0;
                    while (true) {
                        if (i55 >= size10) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i55);
                        if (i54 == nVar3.f3351b) {
                            break;
                        } else {
                            i55++;
                        }
                    }
                    int i56 = dVar11.f3257o0;
                    int size11 = arrayList9.size();
                    int i57 = 0;
                    while (true) {
                        if (i57 >= size11) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i57);
                        if (i56 == nVar4.f3351b) {
                            break;
                        } else {
                            i57++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
                i53++;
                c9 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i58 = 0;
                    int i59 = 0;
                    nVar = null;
                    while (i59 < size12) {
                        Object obj7 = arrayList9.get(i59);
                        i59++;
                        n nVar5 = (n) obj7;
                        if (nVar5.c != 1 && (b4 = nVar5.b(cVar7, 0)) > i58) {
                            nVar = nVar5;
                            i58 = b4;
                        }
                    }
                    c4 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i58);
                        if (objArr[c4] == 2) {
                            int size13 = arrayList9.size();
                            int i60 = 0;
                            int i61 = 0;
                            nVar2 = null;
                            while (i61 < size13) {
                                Object obj8 = arrayList9.get(i61);
                                i61++;
                                n nVar6 = (n) obj8;
                                if (nVar6.c != 0 && (b2 = nVar6.b(cVar7, 1)) > i60) {
                                    nVar2 = nVar6;
                                    i60 = b2;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i60);
                                if (nVar == null || nVar2 != null) {
                                    i7 = i15;
                                    if (i7 == 2) {
                                        i16 = i12;
                                        if (i16 >= q() || i16 <= 0) {
                                            i17 = q();
                                            i6 = i14;
                                            if (i6 != 2) {
                                                i18 = i13;
                                                if (i18 >= k() || i18 <= 0) {
                                                    i19 = k();
                                                    i5 = i19;
                                                    i8 = i17;
                                                    z3 = true;
                                                    boolean z19 = !W(64) || W(128);
                                                    cVar7.getClass();
                                                    cVar7.h = false;
                                                    if (this.D0 == 0 && z19) {
                                                        c = 1;
                                                        cVar7.h = true;
                                                    } else {
                                                        c = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f3270q0;
                                                    boolean z20 = objArr[0] != 2 || objArr[c] == 2;
                                                    this.f3279z0 = 0;
                                                    this.A0 = 0;
                                                    i9 = i4;
                                                    for (i10 = 0; i10 < i9; i10++) {
                                                        d dVar12 = (d) this.f3270q0.get(i10);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W = W(64);
                                                    boolean z21 = z3;
                                                    int i62 = 0;
                                                    z4 = true;
                                                    while (z4) {
                                                        int i63 = i62 + 1;
                                                        try {
                                                            cVar7.t();
                                                            this.f3279z0 = 0;
                                                            this.A0 = 0;
                                                            g(cVar7);
                                                            for (int i64 = 0; i64 < i9; i64++) {
                                                                ((d) this.f3270q0.get(i64)).g(cVar7);
                                                            }
                                                            S(cVar7);
                                                            try {
                                                                weakReference = this.G0;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                cVar3 = cVar;
                                                                z6 = z20;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            cVar3 = cVar;
                                                            z6 = z20;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                cVar3 = cVar;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                cVar3 = cVar;
                                                                try {
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                }
                                                                try {
                                                                    z6 = z20;
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
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                cVar2 = cVar4;
                                                                                z4 = true;
                                                                                e.printStackTrace();
                                                                                z7 = z21;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr2 = j.f3313a;
                                                                                if (z4) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                max = Math.max(this.f3235b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3236c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z10) {
                                                                                }
                                                                                z11 = z8;
                                                                                if (i63 <= 8) {
                                                                                }
                                                                                z21 = z10;
                                                                                i62 = i63;
                                                                                z20 = z6;
                                                                                cVar = cVar3;
                                                                            }
                                                                        }
                                                                        weakReference4 = this.J0;
                                                                        if (weakReference4 == null && weakReference4.get() != null) {
                                                                            try {
                                                                            } catch (Exception e9) {
                                                                                e = e9;
                                                                            }
                                                                            try {
                                                                                cVar7.f(cVar7.k(this.K), cVar7.k((c) this.J0.get()), 0, 5);
                                                                            } catch (Exception e10) {
                                                                                e = e10;
                                                                                z4 = true;
                                                                                e.printStackTrace();
                                                                                z7 = z21;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f3313a;
                                                                                if (z4) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                max = Math.max(this.f3235b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3236c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z10) {
                                                                                }
                                                                                z11 = z8;
                                                                                if (i63 <= 8) {
                                                                                }
                                                                                z21 = z10;
                                                                                i62 = i63;
                                                                                z20 = z6;
                                                                                cVar = cVar3;
                                                                            }
                                                                            try {
                                                                                this.J0 = null;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                z4 = true;
                                                                                e.printStackTrace();
                                                                                z7 = z21;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr222 = j.f3313a;
                                                                                if (z4) {
                                                                                }
                                                                                if (z6) {
                                                                                }
                                                                                max = Math.max(this.f3235b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3236c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z10) {
                                                                                }
                                                                                z11 = z8;
                                                                                if (i63 <= 8) {
                                                                                }
                                                                                z21 = z10;
                                                                                i62 = i63;
                                                                                z20 = z6;
                                                                                cVar = cVar3;
                                                                            }
                                                                        }
                                                                        cVar7.p();
                                                                        z7 = z21;
                                                                        z4 = true;
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        z4 = true;
                                                                        e.printStackTrace();
                                                                        z7 = z21;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        boolean[] zArr2222 = j.f3313a;
                                                                        if (z4) {
                                                                        }
                                                                        if (z6) {
                                                                        }
                                                                        max = Math.max(this.f3235b0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.f3236c0, k());
                                                                        if (max2 > k()) {
                                                                        }
                                                                        if (!z10) {
                                                                        }
                                                                        z11 = z8;
                                                                        if (i63 <= 8) {
                                                                        }
                                                                        z21 = z10;
                                                                        i62 = i63;
                                                                        z20 = z6;
                                                                        cVar = cVar3;
                                                                    }
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    z6 = z20;
                                                                    z4 = true;
                                                                    e.printStackTrace();
                                                                    z7 = z21;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr22222 = j.f3313a;
                                                                    if (z4) {
                                                                    }
                                                                    if (z6) {
                                                                    }
                                                                    max = Math.max(this.f3235b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3236c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z10) {
                                                                    }
                                                                    z11 = z8;
                                                                    if (i63 <= 8) {
                                                                    }
                                                                    z21 = z10;
                                                                    i62 = i63;
                                                                    z20 = z6;
                                                                    cVar = cVar3;
                                                                }
                                                                boolean[] zArr222222 = j.f3313a;
                                                                if (z4) {
                                                                    zArr222222[2] = false;
                                                                    boolean W2 = W(64);
                                                                    Q(cVar7, W2);
                                                                    int size14 = this.f3270q0.size();
                                                                    int i65 = 0;
                                                                    z8 = false;
                                                                    while (i65 < size14) {
                                                                        d dVar13 = (d) this.f3270q0.get(i65);
                                                                        dVar13.Q(cVar7, W2);
                                                                        boolean[] zArr3 = zArr222222;
                                                                        boolean z22 = W2;
                                                                        if (dVar13.h != -1 || dVar13.f3244i != -1) {
                                                                            z8 = true;
                                                                        }
                                                                        i65++;
                                                                        zArr222222 = zArr3;
                                                                        W2 = z22;
                                                                    }
                                                                    zArr = zArr222222;
                                                                } else {
                                                                    zArr = zArr222222;
                                                                    Q(cVar7, W);
                                                                    for (int i66 = 0; i66 < i9; i66++) {
                                                                        ((d) this.f3270q0.get(i66)).Q(cVar7, W);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6 && i63 < 8 && zArr[2]) {
                                                                    int i67 = 0;
                                                                    int i68 = 0;
                                                                    for (i11 = 0; i11 < i9; i11++) {
                                                                        d dVar14 = (d) this.f3270q0.get(i11);
                                                                        i67 = Math.max(i67, dVar14.q() + dVar14.Y);
                                                                        i68 = Math.max(i68, dVar14.k() + dVar14.Z);
                                                                    }
                                                                    max3 = Math.max(this.f3235b0, i67);
                                                                    max4 = Math.max(this.f3236c0, i68);
                                                                    if (i7 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z8 = true;
                                                                        z7 = true;
                                                                    }
                                                                    if (i6 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z8 = true;
                                                                        z7 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f3235b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r8 = 1;
                                                                    objArr[0] = 1;
                                                                    z8 = true;
                                                                    z9 = true;
                                                                } else {
                                                                    r8 = 1;
                                                                    z9 = z7;
                                                                }
                                                                max2 = Math.max(this.f3236c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r8] = r8;
                                                                    z10 = r8;
                                                                    z8 = z10;
                                                                } else {
                                                                    z10 = z9;
                                                                }
                                                                if (!z10) {
                                                                    if (objArr[0] == 2 && i8 > 0 && q() > i8) {
                                                                        this.E0 = r8;
                                                                        objArr[0] = r8;
                                                                        O(i8);
                                                                        z10 = r8;
                                                                        z8 = z10;
                                                                    }
                                                                    if (objArr[r8] == 2 && i5 > 0 && k() > i5) {
                                                                        this.F0 = r8;
                                                                        objArr[r8] = r8;
                                                                        L(i5);
                                                                        z10 = true;
                                                                        z11 = true;
                                                                        z4 = i63 <= 8 ? false : z11;
                                                                        z21 = z10;
                                                                        i62 = i63;
                                                                        z20 = z6;
                                                                        cVar = cVar3;
                                                                    }
                                                                }
                                                                z11 = z8;
                                                                if (i63 <= 8) {
                                                                }
                                                                z21 = z10;
                                                                i62 = i63;
                                                                z20 = z6;
                                                                cVar = cVar3;
                                                            }
                                                        }
                                                        cVar3 = cVar;
                                                        z6 = z20;
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
                                                        z7 = z21;
                                                        z4 = true;
                                                        boolean[] zArr2222222 = j.f3313a;
                                                        if (z4) {
                                                        }
                                                        if (z6) {
                                                            int i672 = 0;
                                                            int i682 = 0;
                                                            while (i11 < i9) {
                                                            }
                                                            max3 = Math.max(this.f3235b0, i672);
                                                            max4 = Math.max(this.f3236c0, i682);
                                                            if (i7 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z8 = true;
                                                                z7 = true;
                                                            }
                                                            if (i6 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z8 = true;
                                                                z7 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f3235b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3236c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z10) {
                                                        }
                                                        z11 = z8;
                                                        if (i63 <= 8) {
                                                        }
                                                        z21 = z10;
                                                        i62 = i63;
                                                        z20 = z6;
                                                        cVar = cVar3;
                                                    }
                                                    z5 = z21;
                                                    this.f3270q0 = arrayList10;
                                                    if (z5) {
                                                        objArr[0] = i7;
                                                        objArr[1] = i6;
                                                    }
                                                    F(cVar7.f3075m);
                                                }
                                                L(i18);
                                                this.F0 = true;
                                            } else {
                                                i18 = i13;
                                            }
                                            i19 = i18;
                                            i5 = i19;
                                            i8 = i17;
                                            z3 = true;
                                            if (W(64)) {
                                            }
                                            cVar7.getClass();
                                            cVar7.h = false;
                                            if (this.D0 == 0) {
                                            }
                                            c = 1;
                                            ArrayList arrayList102 = this.f3270q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f3279z0 = 0;
                                            this.A0 = 0;
                                            i9 = i4;
                                            while (i10 < i9) {
                                            }
                                            boolean W3 = W(64);
                                            boolean z212 = z3;
                                            int i622 = 0;
                                            z4 = true;
                                            while (z4) {
                                            }
                                            z5 = z212;
                                            this.f3270q0 = arrayList102;
                                            if (z5) {
                                            }
                                            F(cVar7.f3075m);
                                        }
                                        O(i16);
                                        this.E0 = true;
                                    } else {
                                        i16 = i12;
                                    }
                                    i17 = i16;
                                    i6 = i14;
                                    if (i6 != 2) {
                                    }
                                    i19 = i18;
                                    i5 = i19;
                                    i8 = i17;
                                    z3 = true;
                                    if (W(64)) {
                                    }
                                    cVar7.getClass();
                                    cVar7.h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c = 1;
                                    ArrayList arrayList1022 = this.f3270q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f3279z0 = 0;
                                    this.A0 = 0;
                                    i9 = i4;
                                    while (i10 < i9) {
                                    }
                                    boolean W32 = W(64);
                                    boolean z2122 = z3;
                                    int i6222 = 0;
                                    z4 = true;
                                    while (z4) {
                                    }
                                    z5 = z2122;
                                    this.f3270q0 = arrayList1022;
                                    if (z5) {
                                    }
                                    F(cVar7.f3075m);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i7 = i15;
                        if (i7 == 2) {
                        }
                        i17 = i16;
                        i6 = i14;
                        if (i6 != 2) {
                        }
                        i19 = i18;
                        i5 = i19;
                        i8 = i17;
                        z3 = true;
                        if (W(64)) {
                        }
                        cVar7.getClass();
                        cVar7.h = false;
                        if (this.D0 == 0) {
                        }
                        c = 1;
                        ArrayList arrayList10222 = this.f3270q0;
                        if (objArr[0] != 2) {
                        }
                        this.f3279z0 = 0;
                        this.A0 = 0;
                        i9 = i4;
                        while (i10 < i9) {
                        }
                        boolean W322 = W(64);
                        boolean z21222 = z3;
                        int i62222 = 0;
                        z4 = true;
                        while (z4) {
                        }
                        z5 = z21222;
                        this.f3270q0 = arrayList10222;
                        if (z5) {
                        }
                        F(cVar7.f3075m);
                    }
                } else {
                    c4 = 1;
                }
                nVar = null;
                if (objArr[c4] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i7 = i15;
                if (i7 == 2) {
                }
                i17 = i16;
                i6 = i14;
                if (i6 != 2) {
                }
                i19 = i18;
                i5 = i19;
                i8 = i17;
                z3 = true;
                if (W(64)) {
                }
                cVar7.getClass();
                cVar7.h = false;
                if (this.D0 == 0) {
                }
                c = 1;
                ArrayList arrayList102222 = this.f3270q0;
                if (objArr[0] != 2) {
                }
                this.f3279z0 = 0;
                this.A0 = 0;
                i9 = i4;
                while (i10 < i9) {
                }
                boolean W3222 = W(64);
                boolean z212222 = z3;
                int i622222 = 0;
                z4 = true;
                while (z4) {
                }
                z5 = z212222;
                this.f3270q0 = arrayList102222;
                if (z5) {
                }
                F(cVar7.f3075m);
            }
            i5 = i13;
            i6 = i14;
            i8 = i12;
            i7 = i15;
        }
        z3 = false;
        if (W(64)) {
        }
        cVar7.getClass();
        cVar7.h = false;
        if (this.D0 == 0) {
        }
        c = 1;
        ArrayList arrayList1022222 = this.f3270q0;
        if (objArr[0] != 2) {
        }
        this.f3279z0 = 0;
        this.A0 = 0;
        i9 = i4;
        while (i10 < i9) {
        }
        boolean W32222 = W(64);
        boolean z2122222 = z3;
        int i6222222 = 0;
        z4 = true;
        while (z4) {
        }
        z5 = z2122222;
        this.f3270q0 = arrayList1022222;
        if (z5) {
        }
        F(cVar7.f3075m);
    }

    public final boolean W(int i4) {
        return (this.D0 & i4) == i4;
    }

    @Override // s.d
    public final void n(StringBuilder sb) {
        sb.append(this.f3246j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f3270q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((d) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
