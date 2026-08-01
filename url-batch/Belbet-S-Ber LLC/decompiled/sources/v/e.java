package v;

import androidx.emoji2.text.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import w.n;
import w.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
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
    public final w.b L0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f3648q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public final t f3649r0;

    /* renamed from: s0, reason: collision with root package name */
    public final w.e f3650s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3651t0;

    /* renamed from: u0, reason: collision with root package name */
    public y.f f3652u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3653v0;

    /* renamed from: w0, reason: collision with root package name */
    public final t.c f3654w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3655x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3656y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3657z0;

    public e() {
        t tVar = new t();
        tVar.f472a = new ArrayList();
        tVar.f473b = new w.b();
        tVar.f474c = this;
        this.f3649r0 = tVar;
        w.e eVar = new w.e();
        eVar.f3745b = true;
        eVar.f3746c = true;
        eVar.f3747e = new ArrayList();
        new ArrayList();
        eVar.f3748f = null;
        eVar.f3749g = new w.b();
        eVar.h = new ArrayList();
        eVar.f3744a = this;
        eVar.d = this;
        this.f3650s0 = eVar;
        this.f3652u0 = null;
        this.f3653v0 = false;
        this.f3654w0 = new t.c();
        this.f3657z0 = 0;
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
        this.L0 = new w.b();
    }

    public static void V(d dVar, y.f fVar, w.b bVar) {
        int i;
        int i4;
        if (fVar == null) {
            return;
        }
        int i5 = dVar.f3622g0;
        int[] iArr = dVar.f3641t;
        if (i5 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.f3738e = 0;
            bVar.f3739f = 0;
            return;
        }
        int[] iArr2 = dVar.f3637p0;
        bVar.f3735a = iArr2[0];
        bVar.f3736b = iArr2[1];
        bVar.f3737c = dVar.q();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.f3741j = 0;
        boolean z4 = bVar.f3735a == 3;
        boolean z5 = bVar.f3736b == 3;
        boolean z6 = z4 && dVar.W > 0.0f;
        boolean z7 = z5 && dVar.W > 0.0f;
        if (z4 && dVar.t(0) && dVar.f3639r == 0 && !z6) {
            bVar.f3735a = 2;
            if (z5 && dVar.f3640s == 0) {
                bVar.f3735a = 1;
            }
            z4 = false;
        }
        if (z5 && dVar.t(1) && dVar.f3640s == 0 && !z7) {
            bVar.f3736b = 2;
            if (z4 && dVar.f3639r == 0) {
                bVar.f3736b = 1;
            }
            z5 = false;
        }
        if (dVar.A()) {
            bVar.f3735a = 1;
            z4 = false;
        }
        if (dVar.B()) {
            bVar.f3736b = 1;
            z5 = false;
        }
        if (z6) {
            if (iArr[0] == 4) {
                bVar.f3735a = 1;
            } else if (!z5) {
                if (bVar.f3736b == 1) {
                    i4 = bVar.d;
                } else {
                    bVar.f3735a = 2;
                    fVar.b(dVar, bVar);
                    i4 = bVar.f3739f;
                }
                bVar.f3735a = 1;
                bVar.f3737c = (int) (dVar.W * i4);
            }
        }
        if (z7) {
            if (iArr[1] == 4) {
                bVar.f3736b = 1;
            } else if (!z4) {
                if (bVar.f3735a == 1) {
                    i = bVar.f3737c;
                } else {
                    bVar.f3736b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.f3738e;
                }
                bVar.f3736b = 1;
                if (dVar.X == -1) {
                    bVar.d = (int) (i / dVar.W);
                } else {
                    bVar.d = (int) (dVar.W * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f3738e);
        dVar.L(bVar.f3739f);
        dVar.E = bVar.h;
        dVar.I(bVar.f3740g);
        bVar.f3741j = 0;
    }

    @Override // v.d
    public final void C() {
        this.f3654w0.t();
        this.f3655x0 = 0;
        this.f3656y0 = 0;
        this.f3648q0.clear();
        super.C();
    }

    @Override // v.d
    public final void F(t tVar) {
        super.F(tVar);
        int size = this.f3648q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f3648q0.get(i)).F(tVar);
        }
    }

    @Override // v.d
    public final void P(boolean z4, boolean z5) {
        super.P(z4, z5);
        int size = this.f3648q0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.f3648q0.get(i)).P(z4, z5);
        }
    }

    public final void R(d dVar, int i) {
        if (i == 0) {
            int i4 = this.f3657z0 + 1;
            b[] bVarArr = this.C0;
            if (i4 >= bVarArr.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.C0;
            int i5 = this.f3657z0;
            bVarArr2[i5] = new b(dVar, 0, this.f3653v0);
            this.f3657z0 = i5 + 1;
            return;
        }
        if (i == 1) {
            int i6 = this.A0 + 1;
            b[] bVarArr3 = this.B0;
            if (i6 >= bVarArr3.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.B0;
            int i7 = this.A0;
            bVarArr4[i7] = new b(dVar, 1, this.f3653v0);
            this.A0 = i7 + 1;
        }
    }

    public final void S(t.c cVar) {
        e eVar;
        t.c cVar2;
        boolean W = W(64);
        b(cVar, W);
        int size = this.f3648q0.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.f3648q0.get(i);
            boolean[] zArr = dVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i4 = 0; i4 < size; i4++) {
                d dVar2 = (d) this.f3648q0.get(i4);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i5 = 0; i5 < aVar.f3690r0; i5++) {
                        d dVar3 = aVar.f3689q0[i5];
                        if (aVar.f3588t0 || dVar3.c()) {
                            int i6 = aVar.f3587s0;
                            if (i6 == 0 || i6 == 1) {
                                dVar3.S[0] = true;
                            } else if (i6 == 2 || i6 == 3) {
                                dVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i7 = 0; i7 < size; i7++) {
            d dVar4 = (d) this.f3648q0.get(i7);
            dVar4.getClass();
            boolean z5 = dVar4 instanceof g;
            if (z5 || (dVar4 instanceof h)) {
                if (z5) {
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
                for (int i8 = 0; i8 < gVar.f3690r0; i8++) {
                    if (hashSet.contains(gVar.f3689q0[i8])) {
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
        if (t.c.f3358q) {
            HashSet hashSet2 = new HashSet();
            for (int i9 = 0; i9 < size; i9++) {
                d dVar5 = (d) this.f3648q0.get(i9);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.f3637p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar6 = (d) it3.next();
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, W);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar7 = (d) eVar.f3648q0.get(i10);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.f3637p0;
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (i11 == 2) {
                        dVar7.M(1);
                    }
                    if (i12 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar2, W);
                    if (i11 == 2) {
                        dVar7.M(i11);
                    }
                    if (i12 == 2) {
                        dVar7.N(i12);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, W);
                    }
                }
            }
        }
        if (eVar.f3657z0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.A0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T(int i, boolean z4) {
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        w.e eVar = this.f3650s0;
        ArrayList arrayList = eVar.f3747e;
        e eVar2 = eVar.f3744a;
        int j2 = eVar2.j(0);
        int[] iArr = eVar2.f3637p0;
        int j4 = eVar2.j(1);
        int r4 = eVar2.r();
        int s3 = eVar2.s();
        if (z4 && (j2 == 2 || j4 == 2)) {
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z6 = z4;
                    break;
                }
                Object obj = arrayList.get(i6);
                i6++;
                o oVar = (o) obj;
                if (oVar.f3775f == i && !oVar.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z6 && j2 == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.d.f3774e.d(eVar2.q());
                }
            } else if (z6 && j4 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f3617e.f3774e.d(eVar2.k());
            }
        }
        if (i == 0) {
            i4 = 0;
            int i7 = iArr[0];
            if (i7 == 1 || i7 == 4) {
                int q4 = eVar2.q() + r4;
                eVar2.d.i.d(q4);
                eVar2.d.f3774e.d(q4 - r4);
                i5 = 1;
            }
            i5 = i4;
        } else {
            i4 = 0;
            int i8 = iArr[1];
            if (i8 == 1 || i8 == 4) {
                int k4 = eVar2.k() + s3;
                eVar2.f3617e.i.d(k4);
                eVar2.f3617e.f3774e.d(k4 - s3);
                i5 = 1;
            }
            i5 = i4;
        }
        eVar.g();
        int size2 = arrayList.size();
        int i9 = i4;
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            o oVar2 = (o) obj2;
            if (oVar2.f3775f == i && (oVar2.f3772b != eVar2 || oVar2.f3776g)) {
                oVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i10 = i4;
        while (i10 < size3) {
            Object obj3 = arrayList.get(i10);
            i10++;
            o oVar3 = (o) obj3;
            if (oVar3.f3775f == i && (i5 != 0 || oVar3.f3772b != eVar2)) {
                if (!oVar3.h.f3756j || !oVar3.i.f3756j || (!(oVar3 instanceof w.c) && !oVar3.f3774e.f3756j)) {
                    z5 = i4;
                    break;
                }
            }
        }
        z5 = 1;
        eVar2.M(j2);
        eVar2.N(j4);
        return z5;
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
        int i4;
        int i5;
        int i6;
        c cVar;
        c cVar2;
        int i7;
        boolean z4;
        char c5;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        c cVar3;
        boolean z7;
        boolean z8;
        boolean[] zArr;
        boolean z9;
        int max;
        ?? r8;
        boolean z10;
        int max2;
        boolean z11;
        boolean z12;
        int i10;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar4;
        int i11;
        int i12;
        int i13;
        int i14;
        char c6;
        n nVar;
        n nVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int b2;
        int b5;
        n nVar3;
        n nVar4;
        int i19;
        boolean z13;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.f3648q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.f3637p0;
        int i20 = iArr[1];
        int i21 = iArr[0];
        int i22 = this.f3651t0;
        c cVar5 = this.J;
        c cVar6 = this.I;
        if (i22 == 0 && j.c(this.D0, 1)) {
            y.f fVar = this.f3652u0;
            int i23 = iArr[0];
            int i24 = iArr[1];
            E();
            ArrayList arrayList = this.f3648q0;
            int size2 = arrayList.size();
            for (int i25 = 0; i25 < size2; i25++) {
                ((d) arrayList.get(i25)).E();
            }
            boolean z14 = this.f3653v0;
            if (i23 == 1) {
                J(0, q());
            } else {
                cVar6.l(0);
                this.Y = 0;
            }
            int i26 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i26 < size2) {
                int[] iArr2 = iArr;
                d dVar = (d) arrayList.get(i26);
                int i27 = i26;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    z13 = z15;
                    if (hVar.f3687u0 == 1) {
                        int i28 = hVar.f3684r0;
                        if (i28 != -1) {
                            hVar.R(i28);
                        } else if (hVar.f3685s0 != -1 && A()) {
                            hVar.R(q() - hVar.f3685s0);
                        } else if (A()) {
                            hVar.R((int) ((hVar.f3683q0 * q()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else {
                    z13 = z15;
                    if ((dVar instanceof a) && ((a) dVar).U() == 0) {
                        z15 = z13;
                        z16 = true;
                        i26 = i27 + 1;
                        iArr = iArr2;
                    }
                }
                z15 = z13;
                i26 = i27 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z15) {
                for (int i29 = 0; i29 < size2; i29 = i19 + 1) {
                    d dVar2 = (d) arrayList.get(i29);
                    if (dVar2 instanceof h) {
                        h hVar2 = (h) dVar2;
                        i19 = i29;
                        if (hVar2.f3687u0 == 1) {
                            w.h.c(0, hVar2, fVar, z14);
                        }
                    } else {
                        i19 = i29;
                    }
                }
            }
            w.h.c(0, this, fVar, z14);
            if (z16) {
                for (int i30 = 0; i30 < size2; i30++) {
                    d dVar3 = (d) arrayList.get(i30);
                    if (dVar3 instanceof a) {
                        a aVar = (a) dVar3;
                        if (aVar.U() == 0 && aVar.T()) {
                            w.h.c(1, aVar, fVar, z14);
                        }
                    }
                }
            }
            if (i24 == 1) {
                K(0, k());
            } else {
                cVar5.l(0);
                this.Z = 0;
            }
            int i31 = 0;
            boolean z17 = false;
            boolean z18 = false;
            while (i31 < size2) {
                d dVar4 = (d) arrayList.get(i31);
                int i32 = i31;
                if (dVar4 instanceof h) {
                    h hVar3 = (h) dVar4;
                    if (hVar3.f3687u0 == 0) {
                        int i33 = hVar3.f3684r0;
                        if (i33 != -1) {
                            hVar3.R(i33);
                        } else if (hVar3.f3685s0 != -1 && B()) {
                            hVar3.R(k() - hVar3.f3685s0);
                        } else if (B()) {
                            hVar3.R((int) ((hVar3.f3683q0 * k()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else if ((dVar4 instanceof a) && ((a) dVar4).U() == 1) {
                    z18 = true;
                }
                i31 = i32 + 1;
            }
            if (z17) {
                for (int i34 = 0; i34 < size2; i34++) {
                    d dVar5 = (d) arrayList.get(i34);
                    if (dVar5 instanceof h) {
                        h hVar4 = (h) dVar5;
                        if (hVar4.f3687u0 == 0) {
                            w.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            w.h.i(0, this, fVar);
            if (z18) {
                for (int i35 = 0; i35 < size2; i35++) {
                    d dVar6 = (d) arrayList.get(i35);
                    if (dVar6 instanceof a) {
                        a aVar2 = (a) dVar6;
                        if (aVar2.U() == 1 && aVar2.T()) {
                            w.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size2; i36++) {
                d dVar7 = (d) arrayList.get(i36);
                if (dVar7.z() && w.h.a(dVar7)) {
                    V(dVar7, fVar, w.h.f3760a);
                    if (!(dVar7 instanceof h)) {
                        w.h.c(0, dVar7, fVar, z14);
                        w.h.i(0, dVar7, fVar);
                    } else if (((h) dVar7).f3687u0 == 0) {
                        w.h.i(0, dVar7, fVar);
                    } else {
                        w.h.c(0, dVar7, fVar, z14);
                    }
                }
            }
            for (int i37 = 0; i37 < size; i37++) {
                d dVar8 = (d) this.f3648q0.get(i37);
                if (dVar8.z() && !(dVar8 instanceof h) && !(dVar8 instanceof a) && !(dVar8 instanceof g) && !dVar8.F) {
                    int j2 = dVar8.j(0);
                    int j4 = dVar8.j(1);
                    if (j2 != 3 || dVar8.f3639r == 1 || j4 != 3 || dVar8.f3640s == 1) {
                        V(dVar8, this.f3652u0, new w.b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        t.c cVar7 = this.f3654w0;
        if (size <= 2 || !((i21 == 2 || i20 == 2) && j.c(this.D0, 1024))) {
            i = size;
            i4 = max6;
            i5 = i20;
            i6 = i21;
            cVar = cVar5;
            cVar2 = cVar6;
            i7 = max5;
        } else {
            y.f fVar2 = this.f3652u0;
            ArrayList arrayList2 = this.f3648q0;
            int size3 = arrayList2.size();
            int i38 = 0;
            while (i38 < size3) {
                d dVar9 = (d) arrayList2.get(i38);
                char c7 = objArr[0];
                char c8 = objArr[1];
                int i39 = i38;
                int[] iArr3 = dVar9.f3637p0;
                cVar2 = cVar6;
                if (!w.h.h(c7, c8, iArr3[0], iArr3[1]) || (dVar9 instanceof g)) {
                    i11 = max5;
                    i = size;
                    i12 = max6;
                    i13 = i20;
                    i14 = i21;
                    cVar = cVar5;
                    break;
                }
                i38 = i39 + 1;
                cVar6 = cVar2;
            }
            cVar2 = cVar6;
            i = size;
            cVar = cVar5;
            int i40 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i40 < size3) {
                int i41 = i40;
                d dVar10 = (d) arrayList2.get(i40);
                int i42 = max6;
                char c9 = objArr[0];
                int i43 = i20;
                char c10 = objArr[1];
                int i44 = max5;
                int[] iArr4 = dVar10.f3637p0;
                int i45 = i21;
                if (!w.h.h(c9, c10, iArr4[0], iArr4[1])) {
                    V(dVar10, fVar2, this.L0);
                }
                boolean z19 = dVar10 instanceof h;
                if (z19) {
                    h hVar5 = (h) dVar10;
                    if (hVar5.f3687u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(hVar5);
                    }
                    if (hVar5.f3687u0 == 1) {
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
                if (dVar10.I.f3609f == null && dVar10.K.f3609f == null && !z19 && !(dVar10 instanceof a)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(dVar10);
                }
                if (dVar10.J.f3609f == null && dVar10.L.f3609f == null && dVar10.M.f3609f == null && !z19 && !(dVar10 instanceof a)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(dVar10);
                }
                i40 = i41 + 1;
                max6 = i42;
                i20 = i43;
                max5 = i44;
                i21 = i45;
            }
            i11 = max5;
            i12 = max6;
            i13 = i20;
            i14 = i21;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                int i46 = 0;
                while (i46 < size4) {
                    Object obj = arrayList4.get(i46);
                    i46++;
                    w.h.b((h) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i47 = 0;
                while (i47 < size5) {
                    Object obj2 = arrayList5.get(i47);
                    i47++;
                    i iVar2 = (i) obj2;
                    n b6 = w.h.b(iVar2, 0, arrayList9, null);
                    iVar2.R(0, arrayList9, b6);
                    b6.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).f3605a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w.h.b(((c) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).f3605a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    w.h.b(((c) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).f3605a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    w.h.b(((c) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i48 = 0;
                while (i48 < size6) {
                    Object obj3 = arrayList6.get(i48);
                    i48++;
                    w.h.b((d) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i49 = 0;
                while (i49 < size7) {
                    Object obj4 = arrayList7.get(i49);
                    i49++;
                    w.h.b((h) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i50 = 0;
                while (i50 < size8) {
                    Object obj5 = arrayList8.get(i50);
                    i50++;
                    i iVar3 = (i) obj5;
                    n b7 = w.h.b(iVar3, 1, arrayList9, null);
                    iVar3.R(1, arrayList9, b7);
                    b7.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).f3605a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    w.h.b(((c) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).f3605a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    w.h.b(((c) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).f3605a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    w.h.b(((c) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).f3605a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    w.h.b(((c) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList3 != null) {
                int size9 = arrayList3.size();
                int i51 = 0;
                while (i51 < size9) {
                    Object obj6 = arrayList3.get(i51);
                    i51++;
                    w.h.b((d) obj6, 1, arrayList9, null);
                }
            }
            char c11 = 1;
            int i52 = 0;
            while (i52 < size3) {
                d dVar11 = (d) arrayList2.get(i52);
                int[] iArr5 = dVar11.f3637p0;
                if (iArr5[0] == 3 && iArr5[c11] == 3) {
                    int i53 = dVar11.f3633n0;
                    int size10 = arrayList9.size();
                    int i54 = 0;
                    while (true) {
                        if (i54 >= size10) {
                            nVar3 = null;
                            break;
                        }
                        nVar3 = (n) arrayList9.get(i54);
                        if (i53 == nVar3.f3768b) {
                            break;
                        } else {
                            i54++;
                        }
                    }
                    int i55 = dVar11.f3635o0;
                    int size11 = arrayList9.size();
                    int i56 = 0;
                    while (true) {
                        if (i56 >= size11) {
                            nVar4 = null;
                            break;
                        }
                        nVar4 = (n) arrayList9.get(i56);
                        if (i55 == nVar4.f3768b) {
                            break;
                        } else {
                            i56++;
                        }
                    }
                    if (nVar3 != null && nVar4 != null) {
                        nVar3.c(0, nVar4);
                        nVar4.f3769c = 2;
                        arrayList9.remove(nVar3);
                    }
                }
                i52++;
                c11 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i57 = 0;
                    int i58 = 0;
                    nVar = null;
                    while (i58 < size12) {
                        Object obj7 = arrayList9.get(i58);
                        i58++;
                        n nVar5 = (n) obj7;
                        if (nVar5.f3769c != 1 && (b5 = nVar5.b(cVar7, 0)) > i57) {
                            nVar = nVar5;
                            i57 = b5;
                        }
                    }
                    c6 = 1;
                    if (nVar != null) {
                        M(1);
                        O(i57);
                        if (objArr[c6] == 2) {
                            int size13 = arrayList9.size();
                            int i59 = 0;
                            int i60 = 0;
                            nVar2 = null;
                            while (i60 < size13) {
                                Object obj8 = arrayList9.get(i60);
                                i60++;
                                n nVar6 = (n) obj8;
                                if (nVar6.f3769c != 0 && (b2 = nVar6.b(cVar7, 1)) > i59) {
                                    nVar2 = nVar6;
                                    i59 = b2;
                                }
                            }
                            if (nVar2 != null) {
                                N(1);
                                L(i59);
                                if (nVar == null || nVar2 != null) {
                                    i6 = i14;
                                    if (i6 == 2) {
                                        i15 = i11;
                                        if (i15 >= q() || i15 <= 0) {
                                            i16 = q();
                                            i5 = i13;
                                            if (i5 != 2) {
                                                i17 = i12;
                                                if (i17 >= k() || i17 <= 0) {
                                                    i18 = k();
                                                    i4 = i18;
                                                    i7 = i16;
                                                    z4 = true;
                                                    boolean z20 = !W(64) || W(128);
                                                    cVar7.getClass();
                                                    cVar7.h = false;
                                                    if (this.D0 == 0 && z20) {
                                                        c5 = 1;
                                                        cVar7.h = true;
                                                    } else {
                                                        c5 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f3648q0;
                                                    boolean z21 = objArr[0] != 2 || objArr[c5] == 2;
                                                    this.f3657z0 = 0;
                                                    this.A0 = 0;
                                                    i8 = i;
                                                    for (i9 = 0; i9 < i8; i9++) {
                                                        d dVar12 = (d) this.f3648q0.get(i9);
                                                        if (dVar12 instanceof e) {
                                                            ((e) dVar12).U();
                                                        }
                                                    }
                                                    boolean W = W(64);
                                                    boolean z22 = z4;
                                                    int i61 = 0;
                                                    z5 = true;
                                                    while (z5) {
                                                        int i62 = i61 + 1;
                                                        try {
                                                            cVar7.t();
                                                            this.f3657z0 = 0;
                                                            this.A0 = 0;
                                                            g(cVar7);
                                                            for (int i63 = 0; i63 < i8; i63++) {
                                                                ((d) this.f3648q0.get(i63)).g(cVar7);
                                                            }
                                                            S(cVar7);
                                                            try {
                                                                weakReference = this.G0;
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                cVar3 = cVar;
                                                                z7 = z21;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            cVar3 = cVar;
                                                            z7 = z21;
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
                                                                    z7 = z21;
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
                                                                                z5 = true;
                                                                                e.printStackTrace();
                                                                                z8 = z22;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr2 = j.f3691a;
                                                                                if (z5) {
                                                                                }
                                                                                if (z7) {
                                                                                }
                                                                                max = Math.max(this.f3614b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3616c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z11) {
                                                                                }
                                                                                z12 = z9;
                                                                                if (i62 <= 8) {
                                                                                }
                                                                                z22 = z11;
                                                                                i61 = i62;
                                                                                z21 = z7;
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
                                                                                z5 = true;
                                                                                e.printStackTrace();
                                                                                z8 = z22;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = j.f3691a;
                                                                                if (z5) {
                                                                                }
                                                                                if (z7) {
                                                                                }
                                                                                max = Math.max(this.f3614b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3616c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z11) {
                                                                                }
                                                                                z12 = z9;
                                                                                if (i62 <= 8) {
                                                                                }
                                                                                z22 = z11;
                                                                                i61 = i62;
                                                                                z21 = z7;
                                                                                cVar = cVar3;
                                                                            }
                                                                            try {
                                                                                this.J0 = null;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                                z5 = true;
                                                                                e.printStackTrace();
                                                                                z8 = z22;
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr222 = j.f3691a;
                                                                                if (z5) {
                                                                                }
                                                                                if (z7) {
                                                                                }
                                                                                max = Math.max(this.f3614b0, q());
                                                                                if (max > q()) {
                                                                                }
                                                                                max2 = Math.max(this.f3616c0, k());
                                                                                if (max2 > k()) {
                                                                                }
                                                                                if (!z11) {
                                                                                }
                                                                                z12 = z9;
                                                                                if (i62 <= 8) {
                                                                                }
                                                                                z22 = z11;
                                                                                i61 = i62;
                                                                                z21 = z7;
                                                                                cVar = cVar3;
                                                                            }
                                                                        }
                                                                        cVar7.p();
                                                                        z8 = z22;
                                                                        z5 = true;
                                                                    } catch (Exception e12) {
                                                                        e = e12;
                                                                        z5 = true;
                                                                        e.printStackTrace();
                                                                        z8 = z22;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        boolean[] zArr2222 = j.f3691a;
                                                                        if (z5) {
                                                                        }
                                                                        if (z7) {
                                                                        }
                                                                        max = Math.max(this.f3614b0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.f3616c0, k());
                                                                        if (max2 > k()) {
                                                                        }
                                                                        if (!z11) {
                                                                        }
                                                                        z12 = z9;
                                                                        if (i62 <= 8) {
                                                                        }
                                                                        z22 = z11;
                                                                        i61 = i62;
                                                                        z21 = z7;
                                                                        cVar = cVar3;
                                                                    }
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    z7 = z21;
                                                                    z5 = true;
                                                                    e.printStackTrace();
                                                                    z8 = z22;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr22222 = j.f3691a;
                                                                    if (z5) {
                                                                    }
                                                                    if (z7) {
                                                                    }
                                                                    max = Math.max(this.f3614b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.f3616c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z11) {
                                                                    }
                                                                    z12 = z9;
                                                                    if (i62 <= 8) {
                                                                    }
                                                                    z22 = z11;
                                                                    i61 = i62;
                                                                    z21 = z7;
                                                                    cVar = cVar3;
                                                                }
                                                                boolean[] zArr222222 = j.f3691a;
                                                                if (z5) {
                                                                    zArr222222[2] = false;
                                                                    boolean W2 = W(64);
                                                                    Q(cVar7, W2);
                                                                    int size14 = this.f3648q0.size();
                                                                    int i64 = 0;
                                                                    z9 = false;
                                                                    while (i64 < size14) {
                                                                        d dVar13 = (d) this.f3648q0.get(i64);
                                                                        dVar13.Q(cVar7, W2);
                                                                        boolean[] zArr3 = zArr222222;
                                                                        boolean z23 = W2;
                                                                        if (dVar13.h != -1 || dVar13.i != -1) {
                                                                            z9 = true;
                                                                        }
                                                                        i64++;
                                                                        zArr222222 = zArr3;
                                                                        W2 = z23;
                                                                    }
                                                                    zArr = zArr222222;
                                                                } else {
                                                                    zArr = zArr222222;
                                                                    Q(cVar7, W);
                                                                    for (int i65 = 0; i65 < i8; i65++) {
                                                                        ((d) this.f3648q0.get(i65)).Q(cVar7, W);
                                                                    }
                                                                    z9 = false;
                                                                }
                                                                if (z7 && i62 < 8 && zArr[2]) {
                                                                    int i66 = 0;
                                                                    int i67 = 0;
                                                                    for (i10 = 0; i10 < i8; i10++) {
                                                                        d dVar14 = (d) this.f3648q0.get(i10);
                                                                        i66 = Math.max(i66, dVar14.q() + dVar14.Y);
                                                                        i67 = Math.max(i67, dVar14.k() + dVar14.Z);
                                                                    }
                                                                    max3 = Math.max(this.f3614b0, i66);
                                                                    max4 = Math.max(this.f3616c0, i67);
                                                                    if (i6 == 2 && q() < max3) {
                                                                        O(max3);
                                                                        objArr[0] = 2;
                                                                        z9 = true;
                                                                        z8 = true;
                                                                    }
                                                                    if (i5 == 2 && k() < max4) {
                                                                        L(max4);
                                                                        objArr[1] = 2;
                                                                        z9 = true;
                                                                        z8 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f3614b0, q());
                                                                if (max > q()) {
                                                                    O(max);
                                                                    r8 = 1;
                                                                    objArr[0] = 1;
                                                                    z9 = true;
                                                                    z10 = true;
                                                                } else {
                                                                    r8 = 1;
                                                                    z10 = z8;
                                                                }
                                                                max2 = Math.max(this.f3616c0, k());
                                                                if (max2 > k()) {
                                                                    L(max2);
                                                                    objArr[r8] = r8;
                                                                    z11 = r8;
                                                                    z9 = z11;
                                                                } else {
                                                                    z11 = z10;
                                                                }
                                                                if (!z11) {
                                                                    if (objArr[0] == 2 && i7 > 0 && q() > i7) {
                                                                        this.E0 = r8;
                                                                        objArr[0] = r8;
                                                                        O(i7);
                                                                        z11 = r8;
                                                                        z9 = z11;
                                                                    }
                                                                    if (objArr[r8] == 2 && i4 > 0 && k() > i4) {
                                                                        this.F0 = r8;
                                                                        objArr[r8] = r8;
                                                                        L(i4);
                                                                        z11 = true;
                                                                        z12 = true;
                                                                        z5 = i62 <= 8 ? false : z12;
                                                                        z22 = z11;
                                                                        i61 = i62;
                                                                        z21 = z7;
                                                                        cVar = cVar3;
                                                                    }
                                                                }
                                                                z12 = z9;
                                                                if (i62 <= 8) {
                                                                }
                                                                z22 = z11;
                                                                i61 = i62;
                                                                z21 = z7;
                                                                cVar = cVar3;
                                                            }
                                                        }
                                                        cVar3 = cVar;
                                                        z7 = z21;
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
                                                        z8 = z22;
                                                        z5 = true;
                                                        boolean[] zArr2222222 = j.f3691a;
                                                        if (z5) {
                                                        }
                                                        if (z7) {
                                                            int i662 = 0;
                                                            int i672 = 0;
                                                            while (i10 < i8) {
                                                            }
                                                            max3 = Math.max(this.f3614b0, i662);
                                                            max4 = Math.max(this.f3616c0, i672);
                                                            if (i6 == 2) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z9 = true;
                                                                z8 = true;
                                                            }
                                                            if (i5 == 2) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z9 = true;
                                                                z8 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f3614b0, q());
                                                        if (max > q()) {
                                                        }
                                                        max2 = Math.max(this.f3616c0, k());
                                                        if (max2 > k()) {
                                                        }
                                                        if (!z11) {
                                                        }
                                                        z12 = z9;
                                                        if (i62 <= 8) {
                                                        }
                                                        z22 = z11;
                                                        i61 = i62;
                                                        z21 = z7;
                                                        cVar = cVar3;
                                                    }
                                                    z6 = z22;
                                                    this.f3648q0 = arrayList10;
                                                    if (z6) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i5;
                                                    }
                                                    F(cVar7.f3368m);
                                                }
                                                L(i17);
                                                this.F0 = true;
                                            } else {
                                                i17 = i12;
                                            }
                                            i18 = i17;
                                            i4 = i18;
                                            i7 = i16;
                                            z4 = true;
                                            if (W(64)) {
                                            }
                                            cVar7.getClass();
                                            cVar7.h = false;
                                            if (this.D0 == 0) {
                                            }
                                            c5 = 1;
                                            ArrayList arrayList102 = this.f3648q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f3657z0 = 0;
                                            this.A0 = 0;
                                            i8 = i;
                                            while (i9 < i8) {
                                            }
                                            boolean W3 = W(64);
                                            boolean z222 = z4;
                                            int i612 = 0;
                                            z5 = true;
                                            while (z5) {
                                            }
                                            z6 = z222;
                                            this.f3648q0 = arrayList102;
                                            if (z6) {
                                            }
                                            F(cVar7.f3368m);
                                        }
                                        O(i15);
                                        this.E0 = true;
                                    } else {
                                        i15 = i11;
                                    }
                                    i16 = i15;
                                    i5 = i13;
                                    if (i5 != 2) {
                                    }
                                    i18 = i17;
                                    i4 = i18;
                                    i7 = i16;
                                    z4 = true;
                                    if (W(64)) {
                                    }
                                    cVar7.getClass();
                                    cVar7.h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c5 = 1;
                                    ArrayList arrayList1022 = this.f3648q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f3657z0 = 0;
                                    this.A0 = 0;
                                    i8 = i;
                                    while (i9 < i8) {
                                    }
                                    boolean W32 = W(64);
                                    boolean z2222 = z4;
                                    int i6122 = 0;
                                    z5 = true;
                                    while (z5) {
                                    }
                                    z6 = z2222;
                                    this.f3648q0 = arrayList1022;
                                    if (z6) {
                                    }
                                    F(cVar7.f3368m);
                                }
                            }
                        }
                        nVar2 = null;
                        if (nVar == null) {
                        }
                        i6 = i14;
                        if (i6 == 2) {
                        }
                        i16 = i15;
                        i5 = i13;
                        if (i5 != 2) {
                        }
                        i18 = i17;
                        i4 = i18;
                        i7 = i16;
                        z4 = true;
                        if (W(64)) {
                        }
                        cVar7.getClass();
                        cVar7.h = false;
                        if (this.D0 == 0) {
                        }
                        c5 = 1;
                        ArrayList arrayList10222 = this.f3648q0;
                        if (objArr[0] != 2) {
                        }
                        this.f3657z0 = 0;
                        this.A0 = 0;
                        i8 = i;
                        while (i9 < i8) {
                        }
                        boolean W322 = W(64);
                        boolean z22222 = z4;
                        int i61222 = 0;
                        z5 = true;
                        while (z5) {
                        }
                        z6 = z22222;
                        this.f3648q0 = arrayList10222;
                        if (z6) {
                        }
                        F(cVar7.f3368m);
                    }
                } else {
                    c6 = 1;
                }
                nVar = null;
                if (objArr[c6] == 2) {
                }
                nVar2 = null;
                if (nVar == null) {
                }
                i6 = i14;
                if (i6 == 2) {
                }
                i16 = i15;
                i5 = i13;
                if (i5 != 2) {
                }
                i18 = i17;
                i4 = i18;
                i7 = i16;
                z4 = true;
                if (W(64)) {
                }
                cVar7.getClass();
                cVar7.h = false;
                if (this.D0 == 0) {
                }
                c5 = 1;
                ArrayList arrayList102222 = this.f3648q0;
                if (objArr[0] != 2) {
                }
                this.f3657z0 = 0;
                this.A0 = 0;
                i8 = i;
                while (i9 < i8) {
                }
                boolean W3222 = W(64);
                boolean z222222 = z4;
                int i612222 = 0;
                z5 = true;
                while (z5) {
                }
                z6 = z222222;
                this.f3648q0 = arrayList102222;
                if (z6) {
                }
                F(cVar7.f3368m);
            }
            i4 = i12;
            i5 = i13;
            i7 = i11;
            i6 = i14;
        }
        z4 = false;
        if (W(64)) {
        }
        cVar7.getClass();
        cVar7.h = false;
        if (this.D0 == 0) {
        }
        c5 = 1;
        ArrayList arrayList1022222 = this.f3648q0;
        if (objArr[0] != 2) {
        }
        this.f3657z0 = 0;
        this.A0 = 0;
        i8 = i;
        while (i9 < i8) {
        }
        boolean W32222 = W(64);
        boolean z2222222 = z4;
        int i6122222 = 0;
        z5 = true;
        while (z5) {
        }
        z6 = z2222222;
        this.f3648q0 = arrayList1022222;
        if (z6) {
        }
        F(cVar7.f3368m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // v.d
    public final void n(StringBuilder sb) {
        sb.append(this.f3624j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.f3648q0;
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
