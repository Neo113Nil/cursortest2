package x1;

import android.os.Build;
import android.view.MotionEvent;
import b1.c0;
import c2.g0;
import c2.i1;
import c2.t1;
import com.google.android.gms.internal.measurement.bf;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.j0;
import s.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final d1.k f10262c;

    /* renamed from: d, reason: collision with root package name */
    public final bf f10263d;

    /* renamed from: e, reason: collision with root package name */
    public final s.p f10264e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f10265f;
    public c0 g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10266h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10267i;
    public boolean j;

    public f(d1.k kVar) {
        this.f10262c = kVar;
        bf bfVar = new bf();
        bfVar.f2175e = new long[2];
        this.f10263d = bfVar;
        this.f10264e = new s.p(2);
        this.f10267i = true;
        this.j = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ac, code lost:
    
        if (r4 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ae, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02b6, code lost:
    
        if (r4 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02c0, code lost:
    
        if (r4 != false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02cd  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // x1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(s.p pVar, a2.n nVar, w7.m mVar, boolean z10) {
        bf bfVar;
        s.p pVar2;
        Object obj;
        boolean z11;
        boolean z12;
        c0 c0Var;
        int i3;
        boolean z13;
        boolean z14;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent c10;
        int i10;
        boolean z15;
        int i11;
        boolean z16;
        int i12;
        int i13;
        l lVar;
        a2.n nVar2 = nVar;
        boolean a9 = super.a(pVar, nVar, mVar, z10);
        c2.j jVar = this.f10262c;
        boolean z17 = true;
        if (jVar.B) {
            ?? r82 = 0;
            while (jVar != 0) {
                if (jVar instanceof t1) {
                    this.f10265f = c2.k.s((t1) jVar, 16);
                } else if ((jVar.f3307i & 16) != 0 && (jVar instanceof c2.j)) {
                    d1.k kVar = jVar.D;
                    int i14 = 0;
                    jVar = jVar;
                    r82 = r82;
                    while (kVar != null) {
                        if ((kVar.f3307i & 16) != 0) {
                            i14++;
                            r82 = r82;
                            if (i14 == 1) {
                                jVar = kVar;
                            } else {
                                if (r82 == 0) {
                                    r82 = new o0.e(new d1.k[16]);
                                }
                                if (jVar != 0) {
                                    r82.b(jVar);
                                    jVar = 0;
                                }
                                r82.b(kVar);
                            }
                        }
                        kVar = kVar.f3310t;
                        jVar = jVar;
                        r82 = r82;
                    }
                    if (i14 == 1) {
                    }
                }
                jVar = c2.k.e(r82);
            }
            if (this.f10265f != null) {
                int f3 = pVar.f();
                int i15 = 0;
                while (true) {
                    bfVar = this.f10263d;
                    pVar2 = this.f10264e;
                    if (i15 >= f3) {
                        break;
                    }
                    long c11 = pVar.c(i15);
                    l lVar2 = (l) pVar.g(i15);
                    if (bfVar.b(c11)) {
                        boolean z18 = z17;
                        long j = lVar2.g;
                        ArrayList arrayList = lVar2.f10286m;
                        long j3 = lVar2.f10278c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j3 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z16 = z18;
                            z15 = a9;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? j0.f5574d : arrayList).size());
                            List list = arrayList == null ? j0.f5574d : arrayList;
                            i11 = f3;
                            int size = list.size();
                            i12 = i15;
                            int i16 = 0;
                            while (i16 < size) {
                                List list2 = list;
                                a aVar = (a) list.get(i16);
                                s.p pVar3 = pVar2;
                                long j10 = c11;
                                long j11 = aVar.f10242b;
                                if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    lVar = lVar2;
                                    long j12 = aVar.f10241a;
                                    i13 = size;
                                    i1 i1Var = this.f10265f;
                                    i1Var.getClass();
                                    arrayList2.add(new a(j12, i1Var.F(nVar2, j11), aVar.f10243c, aVar.f10244d, aVar.f10245e));
                                } else {
                                    i13 = size;
                                    lVar = lVar2;
                                }
                                i16++;
                                size = i13;
                                list = list2;
                                pVar2 = pVar3;
                                c11 = j10;
                                lVar2 = lVar;
                            }
                            s.p pVar4 = pVar2;
                            long j13 = c11;
                            i1 i1Var2 = this.f10265f;
                            i1Var2.getClass();
                            long F = i1Var2.F(nVar2, j);
                            i1 i1Var3 = this.f10265f;
                            i1Var3.getClass();
                            l lVar3 = new l(lVar2.f10276a, lVar2.f10277b, i1Var3.F(nVar2, j3), lVar2.f10279d, lVar2.f10280e, lVar2.f10281f, F, lVar2.f10282h, lVar2.f10283i, arrayList2, lVar2.j, lVar2.f10284k, lVar2.f10285l, lVar2.f10287n);
                            l lVar4 = lVar2.f10290q;
                            if (lVar4 == null) {
                                lVar4 = lVar2;
                            }
                            lVar3.f10290q = lVar4;
                            l lVar5 = lVar2.f10290q;
                            if (lVar5 != null) {
                                lVar2 = lVar5;
                            }
                            lVar3.f10290q = lVar2;
                            pVar4.d(j13, lVar3);
                        } else {
                            z15 = a9;
                            i11 = f3;
                            i12 = i15;
                            z16 = z18;
                        }
                    } else {
                        z15 = a9;
                        i11 = f3;
                        z16 = z17;
                        i12 = i15;
                    }
                    i15 = i12 + 1;
                    nVar2 = nVar;
                    f3 = i11;
                    z17 = z16;
                    a9 = z15;
                }
                boolean z19 = a9;
                boolean z20 = z17;
                if (pVar2.f() == 0) {
                    bfVar.f2174d = 0;
                    this.f10268a.g();
                    return z20;
                }
                int i17 = bfVar.f2174d;
                while (true) {
                    i17--;
                    char c12 = 65535;
                    if (-1 >= i17) {
                        break;
                    }
                    long j14 = ((long[]) bfVar.f2175e)[i17];
                    if (pVar.f8352d) {
                        int i18 = pVar.f8355r;
                        long[] jArr = pVar.f8353e;
                        Object[] objArr = pVar.f8354i;
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < i18) {
                            Object obj2 = objArr[i19];
                            char c13 = c12;
                            if (obj2 != s.q.f8357a) {
                                if (i19 != i20) {
                                    jArr[i20] = jArr[i19];
                                    objArr[i20] = obj2;
                                    objArr[i19] = null;
                                }
                                i20++;
                            }
                            i19++;
                            c12 = c13;
                        }
                        pVar.f8352d = false;
                        pVar.f8355r = i20;
                    }
                    if (t.a.b(pVar.f8353e, pVar.f8355r, j14) < 0 && i17 < (i10 = bfVar.f2174d)) {
                        int i21 = i10 - 1;
                        int i22 = i17;
                        while (i22 < i21) {
                            long[] jArr2 = (long[]) bfVar.f2175e;
                            int i23 = i22 + 1;
                            jArr2[i22] = jArr2[i23];
                            i22 = i23;
                        }
                        bfVar.f2174d--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(pVar2.f());
                int f10 = pVar2.f();
                for (int i24 = 0; i24 < f10; i24++) {
                    arrayList3.add(pVar2.g(i24));
                }
                c0 c0Var2 = new c0();
                c0Var2.f954b = arrayList3;
                c0Var2.f955c = mVar;
                int i25 = Build.VERSION.SDK_INT;
                if (i25 >= 29 && (c10 = c0Var2.c()) != null) {
                    c10.getClassification();
                }
                MotionEvent c14 = c0Var2.c();
                if (c14 != null) {
                    c14.getButtonState();
                }
                MotionEvent c15 = c0Var2.c();
                if (c15 != null) {
                    c15.getMetaState();
                }
                MotionEvent c16 = c0Var2.c();
                int i26 = 0;
                if (c16 != null) {
                    if (i25 >= 29) {
                        classification2 = c16.getClassification();
                        if (classification2 == 3) {
                            z13 = true;
                            if (i25 >= 29) {
                                classification = c16.getClassification();
                                if (classification == 5) {
                                    z14 = true;
                                    actionMasked = c16.getActionMasked();
                                    if (actionMasked == 0) {
                                        if (!z13) {
                                            if (z14) {
                                                i26 = 7;
                                            }
                                            i26 = 1;
                                        }
                                        i26 = 10;
                                    } else if (actionMasked != 1) {
                                        if (actionMasked != 2) {
                                            switch (actionMasked) {
                                                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                                                    if (!z13) {
                                                    }
                                                    i26 = 10;
                                                    break;
                                                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    if (!z13) {
                                                    }
                                                    i26 = 12;
                                                    break;
                                                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                                                    i26 = 6;
                                                    break;
                                                case 9:
                                                    i26 = 4;
                                                    break;
                                                case 10:
                                                    i26 = 5;
                                                    break;
                                            }
                                        }
                                        if (z13) {
                                            i26 = 11;
                                        }
                                    } else {
                                        if (!z13) {
                                            if (z14) {
                                                i26 = 9;
                                            }
                                            i26 = 2;
                                        }
                                        i26 = 12;
                                    }
                                }
                            }
                            z14 = false;
                            actionMasked = c16.getActionMasked();
                            if (actionMasked == 0) {
                            }
                        }
                    }
                    z13 = false;
                    if (i25 >= 29) {
                    }
                    z14 = false;
                    actionMasked = c16.getActionMasked();
                    if (actionMasked == 0) {
                    }
                } else {
                    int size2 = arrayList3.size();
                    while (i26 < size2) {
                        l lVar6 = (l) arrayList3.get(i26);
                        if (c6.f.m(lVar6)) {
                            i26 = 2;
                        } else if (c6.f.l(lVar6)) {
                            i26 = 1;
                        } else {
                            i26++;
                        }
                    }
                    i26 = 3;
                }
                c0Var2.f953a = i26;
                int size3 = arrayList3.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size3) {
                        obj = arrayList3.get(i27);
                        if (!mVar.a(((l) obj).f10276a)) {
                            i27++;
                        }
                    } else {
                        obj = null;
                    }
                }
                l lVar7 = (l) obj;
                if (lVar7 != null) {
                    boolean z21 = lVar7.f10279d;
                    if (z10) {
                        z11 = false;
                        if (!this.f10267i && (z21 || lVar7.f10282h)) {
                            i1 i1Var4 = this.f10265f;
                            i1Var4.getClass();
                            long j15 = i1Var4.f133i;
                            long j16 = lVar7.f10278c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                            int i28 = (int) (j15 >> 32);
                            this.f10267i = !((intBitsToFloat2 > ((float) ((int) (j15 & 4294967295L))) ? z20 : false) | (intBitsToFloat > ((float) i28) ? z20 : false) | (intBitsToFloat < 0.0f ? z20 : false) | (intBitsToFloat2 < 0.0f ? z20 : false));
                        }
                    } else {
                        z11 = false;
                        this.f10267i = false;
                    }
                    boolean z22 = this.f10267i;
                    boolean z23 = this.f10266h;
                    if (z22 == z23 || !((i3 = c0Var2.f953a) == 3 || i3 == 4 || i3 == 5)) {
                        int i29 = c0Var2.f953a;
                        if (i29 == 4 && z23 && !this.j) {
                            c0Var2.f953a = 3;
                        } else if (i29 == 5 && z22 && z21) {
                            c0Var2.f953a = 3;
                        }
                    } else {
                        c0Var2.f953a = z22 ? 4 : 5;
                    }
                } else {
                    z11 = false;
                }
                if (!z19 && c0Var2.f953a == 3 && (c0Var = this.g) != null) {
                    ?? r12 = (List) c0Var.f954b;
                    int size4 = r12.size();
                    ?? r52 = (List) c0Var2.f954b;
                    if (size4 == r52.size()) {
                        int size5 = r52.size();
                        for (?? r62 = z11; r62 < size5; r62++) {
                            if (j1.b.a(((l) r12.get(r62)).f10278c, ((l) r52.get(r62)).f10278c)) {
                            }
                        }
                        z12 = z11;
                        this.g = c0Var2;
                        return z12;
                    }
                }
                z12 = z20;
                this.g = c0Var2;
                return z12;
            }
        }
        return true;
    }

    @Override // x1.g
    public final void b(w7.m mVar) {
        super.b(mVar);
        c0 c0Var = this.g;
        if (c0Var == null) {
            return;
        }
        this.f10266h = this.f10267i;
        List list = (List) c0Var.f954b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            l lVar = (l) list.get(i3);
            boolean z10 = lVar.f10279d;
            long j = lVar.f10276a;
            boolean a9 = mVar.a(j);
            boolean z11 = this.f10267i;
            if ((!z10 && !a9) || (!z10 && !z11)) {
                this.f10263d.d(j);
            }
        }
        this.f10267i = false;
        this.j = c0Var.f953a == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [o0.e] */
    public final void c() {
        o0.e eVar = this.f10268a;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((f) objArr[i10]).c();
        }
        c2.j jVar = this.f10262c;
        ?? r32 = 0;
        while (jVar != 0) {
            if (jVar instanceof t1) {
                ((t1) jVar).m();
            } else if ((jVar.f3307i & 16) != 0 && (jVar instanceof c2.j)) {
                d1.k kVar = jVar.D;
                int i11 = 0;
                jVar = jVar;
                r32 = r32;
                while (kVar != null) {
                    if ((kVar.f3307i & 16) != 0) {
                        i11++;
                        r32 = r32;
                        if (i11 == 1) {
                            jVar = kVar;
                        } else {
                            if (r32 == 0) {
                                r32 = new o0.e(new d1.k[16]);
                            }
                            if (jVar != 0) {
                                r32.b(jVar);
                                jVar = 0;
                            }
                            r32.b(kVar);
                        }
                    }
                    kVar = kVar.f3310t;
                    jVar = jVar;
                    r32 = r32;
                }
                if (i11 == 1) {
                }
            }
            jVar = c2.k.e(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(w7.m mVar) {
        Object[] objArr;
        g0 g0Var;
        s.p pVar = this.f10264e;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (pVar.f() != 0) {
            d1.k kVar = this.f10262c;
            if (kVar.B) {
                i1 i1Var = kVar.f3312v;
                if ((i1Var == null || (g0Var = i1Var.B) == null) ? false : g0Var.F()) {
                    c0 c0Var = this.g;
                    c0Var.getClass();
                    i1 i1Var2 = this.f10265f;
                    i1Var2.getClass();
                    long j = i1Var2.f133i;
                    d1.k kVar2 = kVar;
                    o0.e eVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof t1) {
                            ((t1) kVar2).j(c0Var, h.f10272i, j);
                            objArr = false;
                        } else {
                            objArr = true;
                        }
                        if (objArr != false) {
                            if (((kVar2.f3307i & 16) != 0) != false && (kVar2 instanceof c2.j)) {
                                int i3 = 0;
                                for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                    if (((kVar3.f3307i & 16) != 0) != false) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar2 = kVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar2 != null) {
                                                eVar.b(kVar2);
                                                kVar2 = null;
                                            }
                                            eVar.b(kVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                        }
                        kVar2 = c2.k.e(eVar);
                    }
                    if (kVar.B) {
                        o0.e eVar2 = this.f10268a;
                        Object[] objArr2 = eVar2.f7317d;
                        int i10 = eVar2.f7319i;
                        for (int i11 = 0; i11 < i10; i11++) {
                            ((f) objArr2[i11]).d(mVar);
                        }
                    }
                    z10 = true;
                }
            }
        }
        b(mVar);
        pVar.a();
        this.f10265f = null;
        return z10;
    }

    public final boolean e(w7.m mVar, boolean z10) {
        boolean z11;
        boolean z12;
        g0 g0Var;
        if (this.f10264e.f() == 0) {
            return false;
        }
        d1.k kVar = this.f10262c;
        if (kVar.B) {
            i1 i1Var = kVar.f3312v;
            if ((i1Var == null || (g0Var = i1Var.B) == null) ? false : g0Var.F()) {
                c0 c0Var = this.g;
                c0Var.getClass();
                i1 i1Var2 = this.f10265f;
                i1Var2.getClass();
                long j = i1Var2.f133i;
                d1.k kVar2 = kVar;
                o0.e eVar = null;
                while (kVar2 != null) {
                    if (kVar2 instanceof t1) {
                        ((t1) kVar2).j(c0Var, h.f10270d, j);
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        if (((kVar2.f3307i & 16) != 0) && (kVar2 instanceof c2.j)) {
                            int i3 = 0;
                            for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                if ((kVar3.f3307i & 16) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar2 != null) {
                                            eVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        eVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                    }
                    kVar2 = c2.k.e(eVar);
                }
                if (kVar.B) {
                    o0.e eVar2 = this.f10268a;
                    Object[] objArr = eVar2.f7317d;
                    int i10 = eVar2.f7319i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        f fVar = (f) objArr[i11];
                        this.f10265f.getClass();
                        fVar.e(mVar, z10);
                    }
                }
                if (kVar.B) {
                    o0.e eVar3 = null;
                    while (kVar != null) {
                        if (kVar instanceof t1) {
                            ((t1) kVar).j(c0Var, h.f10271e, j);
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            if (((kVar.f3307i & 16) != 0) && (kVar instanceof c2.j)) {
                                int i12 = 0;
                                for (d1.k kVar4 = ((c2.j) kVar).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                    if ((kVar4.f3307i & 16) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            kVar = kVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar != null) {
                                                eVar3.b(kVar);
                                                kVar = null;
                                            }
                                            eVar3.b(kVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                        }
                        kVar = c2.k.e(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, d0 d0Var) {
        bf bfVar = this.f10263d;
        if (bfVar.b(j) && d0Var.g(this) < 0) {
            bfVar.d(j);
            this.f10264e.e(j);
        }
        o0.e eVar = this.f10268a;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((f) objArr[i10]).f(j, d0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f10262c + ", children=" + this.f10268a + ", pointerIds=" + this.f10263d + ')';
    }
}
