package n0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {
    public int A;
    public int B;
    public boolean C;
    public final b1.z D;
    public final ArrayList E;
    public boolean F;
    public q0.g G;
    public q0.h H;
    public q0.k I;
    public boolean J;
    public x0.h K;
    public r0.a L;
    public final r0.b M;
    public q0.b N;
    public r0.c O;
    public a2.r P;
    public final c1.f Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public j0 U;

    /* renamed from: a, reason: collision with root package name */
    public final a1.n f6698a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6699b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.h f6700c;

    /* renamed from: d, reason: collision with root package name */
    public final s.k0 f6701d;

    /* renamed from: e, reason: collision with root package name */
    public final r0.a f6702e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.a f6703f;
    public final l.d g;

    /* renamed from: h, reason: collision with root package name */
    public final q f6704h;
    public k0 j;

    /* renamed from: k, reason: collision with root package name */
    public int f6706k;

    /* renamed from: l, reason: collision with root package name */
    public int f6707l;

    /* renamed from: m, reason: collision with root package name */
    public int f6708m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f6710o;

    /* renamed from: p, reason: collision with root package name */
    public s.u f6711p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6712q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6713r;

    /* renamed from: v, reason: collision with root package name */
    public s.w f6717v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6718w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6720y;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6705i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final c2.r f6709n = new c2.r();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f6714s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final c2.r f6715t = new c2.r();

    /* renamed from: u, reason: collision with root package name */
    public x0.h f6716u = x0.h.f10234u;

    /* renamed from: x, reason: collision with root package name */
    public final c2.r f6719x = new c2.r();

    /* renamed from: z, reason: collision with root package name */
    public int f6721z = -1;

    public i0(a1.n nVar, o oVar, q0.h hVar, s.k0 k0Var, r0.a aVar, r0.a aVar2, l.d dVar, q qVar) {
        this.f6698a = nVar;
        this.f6699b = oVar;
        this.f6700c = hVar;
        this.f6701d = k0Var;
        this.f6702e = aVar;
        this.f6703f = aVar2;
        this.g = dVar;
        this.f6704h = qVar;
        this.C = oVar.e() || oVar.c();
        this.D = new b1.z(1, this);
        this.E = new ArrayList();
        q0.g e2 = hVar.e();
        e2.c();
        this.G = e2;
        q0.h hVar2 = new q0.h();
        if (oVar.e()) {
            hVar2.c();
        }
        if (oVar.c()) {
            hVar2.f7756y = new s.w();
        }
        this.H = hVar2;
        q0.k f3 = hVar2.f();
        f3.e(true);
        this.I = f3;
        this.M = new r0.b(this, aVar);
        q0.g e9 = this.H.e();
        try {
            q0.b a9 = e9.a(0);
            e9.c();
            this.N = a9;
            this.O = new r0.c();
            this.Q = new c1.f(this);
            CoroutineContext i3 = oVar.i();
            CoroutineContext z10 = z();
            this.R = i3.p(z10 == null ? kotlin.coroutines.g.f5592d : z10);
        } catch (Throwable th) {
            e9.c();
            throw th;
        }
    }

    public static final int N(i0 i0Var, int i3, boolean z10, int i10) {
        int i11;
        long[] jArr;
        int i12;
        long[] jArr2;
        int i13;
        int i14;
        q0.g gVar;
        q0.g gVar2 = i0Var.G;
        int i15 = 0;
        if (gVar2.j(i3)) {
            int i16 = gVar2.i(i3);
            Object p4 = gVar2.p(gVar2.f7735b, i3);
            if (i16 == 206 && Intrinsics.a(p4, m.f6755e)) {
                Object h10 = gVar2.h(i3, 0);
                l0 l0Var = h10 instanceof l0 ? (l0) h10 : null;
                Object obj = l0Var != null ? l0Var.f6745a : null;
                g0 g0Var = obj instanceof g0 ? (g0) obj : null;
                if (g0Var != null) {
                    s.i0 i0Var2 = g0Var.f6682d.f6694e;
                    Object[] objArr = i0Var2.f8320b;
                    long[] jArr3 = i0Var2.f8319a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j = jArr3[i17];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8;
                                int i19 = 8 - ((~(i17 - length)) >>> 31);
                                int i20 = i15;
                                while (i20 < i19) {
                                    if ((255 & j) < 128) {
                                        i0 i0Var3 = (i0) objArr[(i17 << 3) + i20];
                                        q0.h hVar = i0Var3.f6700c;
                                        if (hVar.f7747e <= 0 || (hVar.f7746d[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i13 = i15;
                                            i14 = i18;
                                        } else {
                                            q qVar = i0Var3.f6704h;
                                            synchronized (qVar.f6780r) {
                                                qVar.o();
                                                i14 = i18;
                                                s.h0 h0Var = qVar.B;
                                                qVar.B = z4.w.k();
                                                try {
                                                    qVar.H.c0(h0Var);
                                                } finally {
                                                }
                                            }
                                            r0.a aVar = new r0.a();
                                            i0Var3.L = aVar;
                                            q0.g e2 = i0Var3.f6700c.e();
                                            try {
                                                i0Var3.G = e2;
                                                r0.b bVar = i0Var3.M;
                                                r0.a aVar2 = bVar.f8085b;
                                                try {
                                                    bVar.f8085b = aVar;
                                                    i0Var3.M(0);
                                                    r0.b bVar2 = i0Var3.M;
                                                    bVar2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (bVar2.f8086c) {
                                                            gVar = e2;
                                                            try {
                                                                bVar2.f8085b.f8082a.l0(r0.b0.f8094c);
                                                                if (bVar2.f8086c) {
                                                                    bVar2.d(false);
                                                                    bVar2.d(false);
                                                                    bVar2.f8085b.f8082a.l0(r0.m.f8120c);
                                                                    i13 = 0;
                                                                    bVar2.f8086c = false;
                                                                    bVar.f8085b = aVar2;
                                                                    gVar.c();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                bVar.f8085b = aVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            gVar = e2;
                                                        }
                                                        bVar.f8085b = aVar2;
                                                        gVar.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        gVar.c();
                                                        throw th;
                                                    }
                                                    i13 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    gVar = e2;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                gVar = e2;
                                            }
                                        }
                                        i0Var.f6699b.o(i0Var3.f6704h);
                                    } else {
                                        jArr2 = jArr3;
                                        i13 = i15;
                                        i14 = i18;
                                    }
                                    j >>= i14;
                                    i20++;
                                    i18 = i14;
                                    i15 = i13;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i12 = i15;
                                if (i19 != i18) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i12 = i15;
                            }
                            if (i17 == length) {
                                break;
                            }
                            i17++;
                            i15 = i12;
                            jArr3 = jArr;
                        }
                    }
                }
                return gVar2.o(i3);
            }
            i11 = 1;
            if (!gVar2.l(i3)) {
                return gVar2.o(i3);
            }
        } else {
            i11 = 1;
            if (gVar2.d(i3)) {
                int i21 = gVar2.f7735b[(i3 * 5) + 3] + i3;
                int i22 = 0;
                for (int i23 = i3 + 1; i23 < i21; i23 += gVar2.f7735b[(i23 * 5) + 3]) {
                    boolean l10 = gVar2.l(i23);
                    if (l10) {
                        i0Var.M.c();
                        r0.b bVar3 = i0Var.M;
                        Object n10 = gVar2.n(i23);
                        bVar3.c();
                        bVar3.f8090h.add(n10);
                    }
                    i22 += N(i0Var, i23, l10 || z10, l10 ? 0 : i10 + i22);
                    if (l10) {
                        i0Var.M.c();
                        i0Var.M.a();
                    }
                }
                if (!gVar2.l(i3)) {
                    return i22;
                }
            } else if (!gVar2.l(i3)) {
                return gVar2.o(i3);
            }
        }
        return i11;
    }

    public final boolean A() {
        s1 x10;
        return (this.S || this.f6720y || this.f6718w || (x10 = x()) == null || (x10.f6810b & 8) != 0) ? false : true;
    }

    public final void B(ArrayList arrayList) {
        i0 i0Var = this;
        r0.a aVar = i0Var.f6703f;
        r0.b bVar = i0Var.M;
        r0.a aVar2 = bVar.f8085b;
        try {
            bVar.f8085b = aVar;
            aVar.f8082a.l0(r0.z.f8136c);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Pair pair = (Pair) arrayList.get(i3);
                u0 u0Var = (u0) pair.f5552d;
                u0Var.getClass();
                q0.b l10 = i7.a.l(null);
                q0.h d10 = q0.j.d(null);
                int b10 = d10.b(l10);
                x0.e eVar = new x0.e();
                bVar.b();
                r0.k0 k0Var = bVar.f8085b.f8082a;
                k0Var.l0(r0.j.f8111c);
                z4.w.O(k0Var, 0, eVar, 1, l10);
                if (d10.equals(i0Var.H)) {
                    if (!i0Var.I.f7780w) {
                        m.a("Check failed");
                    }
                    i0Var.v();
                }
                q0.g e2 = d10.e();
                try {
                    e2.r(b10);
                    bVar.f8089f = b10;
                    r0.a aVar3 = new r0.a();
                    i0Var.G(null, null, null, kotlin.collections.j0.f5574d, new e0(i0Var, aVar3, e2, u0Var));
                    r0.a aVar4 = bVar.f8085b;
                    aVar4.getClass();
                    if (!aVar3.f8082a.k0()) {
                        r0.k0 k0Var2 = aVar4.f8082a;
                        k0Var2.l0(r0.f.f8102c);
                        z4.w.O(k0Var2, 0, aVar3, 1, eVar);
                    }
                    e2.c();
                    bVar.f8085b.f8082a.l0(r0.b0.f8094c);
                    i3++;
                    i0Var = this;
                } catch (Throwable th) {
                    e2.c();
                    throw th;
                }
            }
            bVar.b();
            bVar.f8085b.f8082a.l0(r0.n.f8121c);
            bVar.f8089f = 0;
            bVar.f8085b = aVar2;
        } catch (Throwable th2) {
            bVar.f8085b = aVar2;
            throw th2;
        }
    }

    public final void C(x0.h hVar, Object obj) {
        S(126665345, 0, null, null);
        D();
        h0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                q0.k.z(this.I);
            }
            boolean z10 = (this.S || Intrinsics.a(this.G.f(), hVar)) ? false : true;
            if (z10) {
                J(hVar);
            }
            S(202, 0, m.f6753c, hVar);
            this.K = null;
            boolean z11 = this.f6718w;
            this.f6718w = z10;
            x0.i.c(this, new x0.d(-59194059, true, new b1.y(3, obj)));
            this.f6718w = z11;
        } finally {
        }
    }

    public final Object D() {
        boolean z10 = this.S;
        e eVar = k.f6729a;
        if (!z10) {
            Object m10 = this.G.m();
            if (!this.f6720y || (m10 instanceof d2)) {
                return m10;
            }
        } else if (this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected");
            return eVar;
        }
        return eVar;
    }

    public final List E() {
        o oVar = this.f6699b;
        n g = oVar.g();
        q qVar = g != null ? (q) g : null;
        if (qVar == null) {
            return kotlin.collections.j0.f5574d;
        }
        q0.h hVar = qVar.f6782t;
        q0.g e2 = q0.j.d(hVar).e();
        try {
            Integer t6 = cf.c.t(e2, oVar, 0, e2.f7736c);
            if (t6 == null) {
                return kotlin.collections.j0.f5574d;
            }
            e2 = q0.j.d(hVar).e();
            try {
                ArrayList O = cf.c.O(e2, t6.intValue(), 0);
                e2.c();
                return CollectionsKt.G(O, qVar.H.E());
            } finally {
            }
        } finally {
        }
    }

    public final int F(int i3) {
        int q3 = this.G.q(i3) + 1;
        int i10 = 0;
        while (q3 < i3) {
            if (!this.G.k(q3)) {
                i10++;
            }
            q3 += this.G.f7735b[(q3 * 5) + 3];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(q qVar, q qVar2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z10 = this.F;
        int i3 = this.f6706k;
        try {
            this.F = true;
            this.f6706k = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) list.get(i10);
                s1 s1Var = (s1) pair.f5552d;
                Object obj = pair.f5553e;
                if (obj != null) {
                    b0(s1Var, obj);
                } else {
                    b0(s1Var, null);
                }
            }
            if (qVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (qVar2 == null || qVar2.equals(qVar) || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    qVar.D = qVar2;
                    qVar.E = intValue;
                    try {
                        invoke = function0.invoke();
                        qVar.D = null;
                        qVar.E = 0;
                    } catch (Throwable th) {
                        qVar.D = null;
                        qVar.E = 0;
                        throw th;
                    }
                }
            }
            invoke = function0.invoke();
            this.F = z10;
            this.f6706k = i3;
            return invoke;
        } catch (Throwable th2) {
            this.F = z10;
            this.f6706k = i3;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f6763b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        n0 n0Var;
        int i3;
        int i10;
        long j;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        long j3;
        s.c0 c0Var;
        int i16;
        int p4;
        n0 n0Var2;
        int i17;
        long j10;
        long j11;
        int hashCode;
        Object b10;
        boolean z11 = this.F;
        boolean z12 = true;
        this.F = true;
        q0.g gVar = this.G;
        int i18 = gVar.f7741i;
        int i19 = (i18 * 5) + 3;
        int i20 = gVar.f7735b[i19] + i18;
        int i21 = this.f6706k;
        long j12 = this.T;
        int i22 = this.f6707l;
        int i23 = this.f6708m;
        int i24 = gVar.g;
        ArrayList arrayList = this.f6714s;
        int p10 = h.p(i24, arrayList);
        if (p10 < 0) {
            p10 = -(p10 + 1);
        }
        if (p10 < arrayList.size()) {
            n0Var = (n0) arrayList.get(p10);
        }
        n0Var = null;
        boolean z13 = false;
        int i25 = i18;
        while (n0Var != null) {
            boolean z14 = z12;
            s1 s1Var = n0Var.f6762a;
            int i26 = n0Var.f6763b;
            int p11 = h.p(i26, arrayList);
            if (p11 >= 0) {
            }
            Object obj = n0Var.f6764c;
            if (obj == null) {
                s1Var.getClass();
                i3 = i19;
            } else {
                int i27 = 8;
                s.h0 h0Var = s1Var.g;
                if (h0Var == null) {
                    i3 = i19;
                } else {
                    i3 = i19;
                    if (obj instanceof y) {
                        y yVar = (y) obj;
                        z10 = !Intrinsics.a(yVar.i().f6843f, h0Var.g(yVar));
                        i10 = i21;
                        j = j12;
                        i11 = i22;
                        i12 = i23;
                    } else if (obj instanceof s.i0) {
                        s.i0 i0Var = (s.i0) obj;
                        if (i0Var.h()) {
                            Object[] objArr = i0Var.f8320b;
                            long[] jArr = i0Var.f8319a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i11 = i22;
                                i12 = i23;
                                int i28 = 0;
                                while (true) {
                                    long j13 = jArr[i28];
                                    i10 = i21;
                                    j = j12;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i28 - length)) >>> 31);
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            if ((j13 & 255) < 128) {
                                                Object obj2 = objArr[(i28 << 3) + i30];
                                                i13 = i30;
                                                if (!(obj2 instanceof y)) {
                                                    break;
                                                }
                                                y yVar2 = (y) obj2;
                                                if (!Intrinsics.a(yVar2.i().f6843f, h0Var.g(yVar2))) {
                                                    break;
                                                }
                                            } else {
                                                i13 = i30;
                                            }
                                            j13 >>= i27;
                                            i30 = i13 + 1;
                                        }
                                        if (i29 != i27) {
                                            break;
                                        }
                                    }
                                    if (i28 == length) {
                                        break;
                                    }
                                    i28++;
                                    i21 = i10;
                                    j12 = j;
                                    i27 = 8;
                                }
                                z10 = z14 ? 1 : 0;
                            }
                        }
                        i10 = i21;
                        j = j12;
                        i11 = i22;
                        i12 = i23;
                        z10 = false;
                    }
                    if (z10) {
                        long j14 = j;
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(s1Var);
                        this.g.p();
                        q qVar = s1Var.f6809a;
                        if (qVar == null || (c0Var = s1Var.f6814f) == null) {
                            i14 = i18;
                            i15 = i20;
                            j3 = j14;
                        } else {
                            s1Var.d(z14);
                            try {
                                Object[] objArr2 = c0Var.f8278b;
                                int[] iArr = c0Var.f8279c;
                                long[] jArr2 = c0Var.f8277a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    j3 = j14;
                                    int i31 = 0;
                                    while (true) {
                                        long j15 = jArr2[i31];
                                        i14 = i18;
                                        i15 = i20;
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            for (int i33 = 0; i33 < i32; i33 = i16 + 1) {
                                                if ((j15 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    i16 = i33;
                                                    Object obj3 = objArr2[i34];
                                                    int i35 = iArr[i34];
                                                    qVar.x(obj3);
                                                } else {
                                                    i16 = i33;
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        i18 = i14;
                                        i20 = i15;
                                    }
                                } else {
                                    i14 = i18;
                                    i15 = i20;
                                    j3 = j14;
                                }
                                s1Var.d(false);
                            } catch (Throwable th) {
                                s1Var.d(false);
                                throw th;
                            }
                        }
                        z14 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.G.r(i26);
                        int i36 = this.G.g;
                        K(i25, i36, i18);
                        int q3 = this.G.q(i36);
                        while (q3 != i18 && !this.G.l(q3)) {
                            q3 = this.G.q(q3);
                        }
                        int i37 = this.G.l(q3) ? 0 : i10;
                        if (q3 != i36) {
                            int i02 = (i0(q3) - this.G.o(i36)) + i37;
                            while (i37 < i02 && q3 != i26) {
                                q3++;
                                while (q3 < i26) {
                                    q0.g gVar2 = this.G;
                                    int i38 = gVar2.f7735b[(q3 * 5) + 3] + q3;
                                    if (i26 >= i38) {
                                        i37 += gVar2.l(q3) ? z14 ? 1 : 0 : i0(q3);
                                        q3 = i38;
                                    }
                                }
                                break;
                            }
                        }
                        this.f6706k = i37;
                        this.f6708m = F(i36);
                        int q7 = this.G.q(i36);
                        long j16 = 0;
                        int i39 = 3;
                        int i40 = 0;
                        while (true) {
                            if (q7 < 0) {
                                i17 = i36;
                                j10 = j;
                                break;
                            }
                            if (q7 == i18) {
                                j10 = j;
                                j16 ^= Long.rotateLeft(j10, i40);
                                i17 = i36;
                                break;
                            }
                            j10 = j;
                            q0.g gVar3 = this.G;
                            boolean k10 = gVar3.k(q7);
                            i17 = i36;
                            int[] iArr2 = gVar3.f7735b;
                            if (k10) {
                                Object p12 = gVar3.p(iArr2, q7);
                                if (p12 != null) {
                                    hashCode = p12 instanceof Enum ? ((Enum) p12).ordinal() : p12.hashCode();
                                    j11 = j16;
                                } else {
                                    j11 = j16;
                                    hashCode = 0;
                                }
                            } else {
                                int i41 = gVar3.i(q7);
                                j11 = j16;
                                hashCode = (i41 != 207 || (b10 = gVar3.b(iArr2, q7)) == null || b10.equals(k.f6729a)) ? i41 : b10.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j16 = j11 ^ Long.rotateLeft(hashCode, i40);
                                break;
                            }
                            j16 = Long.rotateLeft(this.G.k(q7) ? 0 : F(q7), i40) ^ (j11 ^ Long.rotateLeft(hashCode, i39));
                            i39 = (i39 + 6) % 64;
                            i40 = (i40 + 6) % 64;
                            q7 = this.G.q(q7);
                            j = j10;
                            i36 = i17;
                        }
                        this.T = j16;
                        this.K = null;
                        Function2 function2 = s1Var.f6812d;
                        if (function2 == null) {
                            kotlin.collections.i0.l("Invalid restart scope");
                            return;
                        }
                        function2.invoke(this, Integer.valueOf(z14 ? 1 : 0));
                        this.K = null;
                        q0.g gVar4 = this.G;
                        int i42 = gVar4.f7735b[i3] + i18;
                        int i43 = gVar4.g;
                        if (!((i43 < i18 || i43 > i42) ? false : z14 ? 1 : 0)) {
                            m.a("Index " + i18 + " is not a parent of " + i43);
                        }
                        gVar4.f7741i = i18;
                        gVar4.f7740h = i42;
                        gVar4.f7743l = 0;
                        gVar4.f7744m = 0;
                        i14 = i18;
                        i15 = i20;
                        j3 = j10;
                        i25 = i17;
                        z13 = z14 ? 1 : 0;
                    }
                    p4 = h.p(this.G.g, arrayList);
                    if (p4 < 0) {
                        p4 = -(p4 + 1);
                    }
                    if (p4 >= arrayList.size()) {
                        n0Var2 = (n0) arrayList.get(p4);
                        i20 = i15;
                        if (n0Var2.f6763b < i20) {
                            n0Var = n0Var2;
                            z12 = z14;
                            i19 = i3;
                            i18 = i14;
                            i22 = i11;
                            i23 = i12;
                            i21 = i10;
                            j12 = j3;
                        }
                    } else {
                        i20 = i15;
                    }
                    n0Var2 = null;
                    n0Var = n0Var2;
                    z12 = z14;
                    i19 = i3;
                    i18 = i14;
                    i22 = i11;
                    i23 = i12;
                    i21 = i10;
                    j12 = j3;
                }
            }
            i10 = i21;
            j = j12;
            i11 = i22;
            i12 = i23;
            z10 = z14 ? 1 : 0;
            if (z10) {
            }
            p4 = h.p(this.G.g, arrayList);
            if (p4 < 0) {
            }
            if (p4 >= arrayList.size()) {
            }
            n0Var2 = null;
            n0Var = n0Var2;
            z12 = z14;
            i19 = i3;
            i18 = i14;
            i22 = i11;
            i23 = i12;
            i21 = i10;
            j12 = j3;
        }
        int i44 = i18;
        int i45 = i21;
        long j17 = j12;
        int i46 = i22;
        int i47 = i23;
        if (z13) {
            K(i25, i44, i44);
            this.G.t();
            int i03 = i0(i44);
            this.f6706k = i45 + i03;
            this.f6707l = i46 + i03;
            this.f6708m = i47;
        } else {
            Q();
        }
        this.T = j17;
        this.F = z11;
    }

    public final void I() {
        int i3;
        M(this.G.g);
        r0.b bVar = this.M;
        bVar.d(false);
        c2.r rVar = bVar.f8087d;
        i0 i0Var = bVar.f8084a;
        q0.g gVar = i0Var.G;
        if (gVar.f7736c > 0 && rVar.a(-2) != (i3 = gVar.f7741i)) {
            if (!bVar.f8086c && bVar.f8088e) {
                bVar.d(false);
                bVar.f8085b.f8082a.l0(r0.q.f8124c);
                bVar.f8086c = true;
            }
            if (i3 > 0) {
                q0.b a9 = gVar.a(i3);
                rVar.c(i3);
                bVar.d(false);
                r0.k0 k0Var = bVar.f8085b.f8082a;
                k0Var.l0(r0.p.f8123c);
                z4.w.N(k0Var, 0, a9);
                bVar.f8086c = true;
            }
        }
        bVar.f8085b.f8082a.l0(r0.x.f8134c);
        int i10 = bVar.f8089f;
        q0.g gVar2 = i0Var.G;
        bVar.f8089f = gVar2.f7735b[(gVar2.g * 5) + 3] + i10;
    }

    public final void J(x0.h hVar) {
        s.w wVar = this.f6717v;
        if (wVar == null) {
            wVar = new s.w();
            this.f6717v = wVar;
        }
        wVar.h(this.G.g, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(int i3, int i10, int i11) {
        q0.g gVar = this.G;
        if (i3 != i10) {
            if (i3 != i11 && i10 != i11) {
                if (gVar.q(i3) == i10) {
                    i11 = i10;
                } else if (gVar.q(i10) != i3) {
                    if (gVar.q(i3) == gVar.q(i10)) {
                        i11 = gVar.q(i3);
                    } else {
                        int i12 = i3;
                        int i13 = 0;
                        while (i12 > 0 && i12 != i11) {
                            i12 = gVar.q(i12);
                            i13++;
                        }
                        int i14 = i10;
                        int i15 = 0;
                        while (i14 > 0 && i14 != i11) {
                            i14 = gVar.q(i14);
                            i15++;
                        }
                        int i16 = i13 - i15;
                        int i17 = i3;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = gVar.q(i17);
                        }
                        int i19 = i15 - i13;
                        int i20 = i10;
                        for (int i21 = 0; i21 < i19; i21++) {
                            i20 = gVar.q(i20);
                        }
                        i11 = i17;
                        for (int i22 = i20; i11 != i22; i22 = gVar.q(i22)) {
                            i11 = gVar.q(i11);
                        }
                    }
                }
            }
            while (i3 > 0 && i3 != i11) {
                if (!gVar.l(i3)) {
                    this.M.a();
                }
                i3 = gVar.q(i3);
            }
            o(i10, i11);
        }
        i11 = i3;
        while (i3 > 0) {
            if (!gVar.l(i3)) {
            }
            i3 = gVar.q(i3);
        }
        o(i10, i11);
    }

    public final Object L() {
        boolean z10 = this.S;
        e eVar = k.f6729a;
        if (!z10) {
            Object m10 = this.G.m();
            if (!this.f6720y || (m10 instanceof d2)) {
                return m10 instanceof l0 ? ((l0) m10).f6745a : m10;
            }
        } else if (this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected");
            return eVar;
        }
        return eVar;
    }

    public final void M(int i3) {
        boolean l10 = this.G.l(i3);
        r0.b bVar = this.M;
        if (l10) {
            bVar.c();
            Object n10 = this.G.n(i3);
            bVar.c();
            bVar.f8090h.add(n10);
        }
        N(this, i3, l10, 0);
        bVar.c();
        if (l10) {
            bVar.a();
        }
    }

    public final boolean O(int i3, boolean z10) {
        if ((i3 & 1) == 0 && (this.S || this.f6720y)) {
            if (this.P != null) {
                x();
                return true;
            }
        } else if (!z10 && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        int i3;
        long rotateLeft;
        long j;
        if (this.f6714s.isEmpty()) {
            this.f6707l = this.G.s() + this.f6707l;
            return;
        }
        q0.g gVar = this.G;
        int g = gVar.g();
        int[] iArr = gVar.f7735b;
        int i10 = gVar.g;
        Object p4 = i10 < gVar.f7740h ? gVar.p(iArr, i10) : null;
        Object f3 = gVar.f();
        int i11 = this.f6708m;
        e eVar = k.f6729a;
        if (p4 != null) {
            if (p4 instanceof Enum) {
                rotateLeft = Long.rotateLeft(((Enum) p4).ordinal() ^ Long.rotateLeft(this.T, 3), 3);
                i3 = 0;
            } else {
                i3 = 0;
                rotateLeft = Long.rotateLeft(p4.hashCode() ^ Long.rotateLeft(this.T, 3), 3);
            }
            j = rotateLeft ^ i3;
        } else {
            if (f3 != null && g == 207 && !f3.equals(eVar)) {
                this.T = Long.rotateLeft(f3.hashCode() ^ Long.rotateLeft(this.T, 3), 3) ^ i11;
                V(null, (iArr[(gVar.g * 5) + 1] & 1073741824) != 0);
                H();
                gVar.e();
                if (p4 == null) {
                    if (p4 instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ ((Enum) p4).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ p4.hashCode(), 3);
                        return;
                    }
                }
                if (f3 == null || g != 207 || f3.equals(eVar)) {
                    this.T = Long.rotateRight(g ^ Long.rotateRight(this.T ^ i11, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i11, 3) ^ f3.hashCode(), 3);
                    return;
                }
            }
            j = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g, 3) ^ i11;
        }
        this.T = j;
        V(null, (iArr[(gVar.g * 5) + 1] & 1073741824) != 0);
        H();
        gVar.e();
        if (p4 == null) {
        }
    }

    public final void Q() {
        q0.g gVar = this.G;
        int i3 = gVar.f7741i;
        this.f6707l = i3 >= 0 ? gVar.f7735b[(i3 * 5) + 1] & 67108863 : 0;
        gVar.t();
    }

    public final void R() {
        if (this.f6707l != 0) {
            m.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        s1 x10 = x();
        if (x10 != null) {
            int i3 = x10.f6810b;
            if ((i3 & 128) == 0) {
                x10.f6810b = i3 | 16;
            }
        }
        if (this.f6714s.isEmpty()) {
            Q();
        } else {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(int i3, int i10, Object obj, Object obj2) {
        long rotateLeft;
        long j;
        boolean z10;
        k0 k0Var;
        k0 k0Var2;
        int i11;
        int i12;
        Object[] objArr;
        Object[] objArr2;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        Object obj3 = obj;
        if (this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i17 = this.f6708m;
        Object obj4 = k.f6729a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
            j = 0;
        } else {
            if (obj2 != null && i3 == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i17;
                if (obj3 == null) {
                    this.f6708m++;
                }
                boolean z12 = i10 == 0;
                if (!this.S) {
                    this.G.f7742k++;
                    q0.k kVar = this.I;
                    int i18 = kVar.f7777t;
                    if (z12) {
                        kVar.Q(i3, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        kVar.Q(i3, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        kVar.Q(i3, obj3, obj4, false);
                    }
                    k0 k0Var3 = this.j;
                    if (k0Var3 != null) {
                        int i19 = (-2) - i18;
                        q0.e eVar = new q0.e(-1, i3, i19, -1);
                        k0Var3.f6734e.h(i19, new p0.a(-1, this.f6706k - k0Var3.f6731b, 0));
                        k0Var3.f6733d.add(eVar);
                    }
                    u(z12, null);
                    return;
                }
                boolean z13 = i10 == 1 && this.f6720y;
                if (this.j == null) {
                    int g = this.G.g();
                    if (!z13 && g == i3) {
                        q0.g gVar = this.G;
                        int i20 = gVar.g;
                        if (Intrinsics.a(obj3, i20 < gVar.f7740h ? gVar.p(gVar.f7735b, i20) : null)) {
                            V(obj2, z12);
                        }
                    }
                    q0.g gVar2 = this.G;
                    int[] iArr = gVar2.f7735b;
                    ArrayList arrayList = new ArrayList();
                    if (gVar2.f7742k <= 0) {
                        int i21 = gVar2.g;
                        while (i21 < gVar2.f7740h) {
                            int i22 = i21 * 5;
                            int i23 = iArr[i22];
                            Object p4 = gVar2.p(iArr, i21);
                            int i24 = iArr[i22 + 1];
                            if ((i24 & 1073741824) != 0) {
                                z11 = z13;
                                i16 = 1;
                            } else {
                                z11 = z13;
                                i16 = i24 & 67108863;
                            }
                            arrayList.add(new q0.e(p4, i23, i21, i16));
                            i21 += iArr[i22 + 3];
                            z13 = z11;
                        }
                    }
                    z10 = z13;
                    this.j = new k0(this.f6706k, arrayList);
                    k0Var = this.j;
                    if (k0Var != null) {
                        ArrayList arrayList2 = k0Var.f6733d;
                        s.w wVar = k0Var.f6734e;
                        int i25 = k0Var.f6731b;
                        Object p0Var = obj3 != null ? new p0(Integer.valueOf(i3), obj3) : Integer.valueOf(i3);
                        s.h0 h0Var = ((o0.a) k0Var.f6735f.getValue()).f7310a;
                        Object g2 = h0Var.g(p0Var);
                        if (g2 == null) {
                            g2 = null;
                        } else if (g2 instanceof s.d0) {
                            s.d0 d0Var = (s.d0) g2;
                            Object k10 = d0Var.k(0);
                            if (d0Var.h()) {
                                h0Var.k(p0Var);
                            }
                            if (d0Var.f8285b == 1) {
                                h0Var.m(p0Var, d0Var.e());
                            }
                            g2 = k10;
                        } else {
                            h0Var.k(p0Var);
                        }
                        q0.e eVar2 = (q0.e) g2;
                        if (z10 || eVar2 == null) {
                            this.G.f7742k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.f7780w) {
                                q0.k f3 = this.H.f();
                                this.I = f3;
                                f3.M();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            q0.k kVar2 = this.I;
                            int i26 = kVar2.f7777t;
                            if (z12) {
                                kVar2.Q(i3, obj4, obj4, true);
                                i11 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i11 = 0;
                                kVar2.Q(i3, obj4, obj2, false);
                            } else {
                                i11 = 0;
                                kVar2.Q(i3, obj == null ? obj4 : obj, obj4, false);
                            }
                            this.N = this.I.b(i26);
                            int i27 = (-2) - i26;
                            q0.e eVar3 = new q0.e(-1, i3, i27, -1);
                            wVar.h(i27, new p0.a(-1, this.f6706k - i25, i11));
                            arrayList2.add(eVar3);
                            k0Var2 = new k0(z12 ? i11 : this.f6706k, new ArrayList());
                            u(z12, k0Var2);
                            return;
                        }
                        int i28 = eVar2.f7730c;
                        arrayList2.add(eVar2);
                        p0.a aVar = (p0.a) wVar.b(i28);
                        this.f6706k = (aVar != null ? aVar.f7592b : -1) + i25;
                        p0.a aVar2 = (p0.a) wVar.b(i28);
                        int i29 = aVar2 != null ? aVar2.f7591a : -1;
                        int i30 = k0Var.f6732c;
                        int i31 = i29 - i30;
                        int i32 = 8;
                        if (i29 > i30) {
                            Object[] objArr3 = wVar.f8338c;
                            long[] jArr = wVar.f8336a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j3 = jArr[i33];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j3 & 255) < 128) {
                                                i15 = i32;
                                                p0.a aVar3 = (p0.a) objArr3[(i33 << 3) + i35];
                                                i14 = i31;
                                                int i36 = aVar3.f7591a;
                                                if (i36 == i29) {
                                                    aVar3.f7591a = i30;
                                                } else if (i30 <= i36 && i36 < i29) {
                                                    aVar3.f7591a = i36 + 1;
                                                }
                                            } else {
                                                i14 = i31;
                                                i15 = i32;
                                            }
                                            j3 >>= i15;
                                            i35++;
                                            i31 = i14;
                                            i32 = i15;
                                        }
                                        i12 = i31;
                                        if (i34 != i32) {
                                            break;
                                        }
                                    } else {
                                        i12 = i31;
                                    }
                                    if (i33 == length) {
                                        break;
                                    }
                                    i33++;
                                    i31 = i12;
                                    i32 = 8;
                                }
                            } else {
                                i12 = i31;
                            }
                        } else {
                            i12 = i31;
                            if (i30 > i29) {
                                Object[] objArr4 = wVar.f8338c;
                                long[] jArr2 = wVar.f8336a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i37 = 0;
                                    while (true) {
                                        long j10 = jArr2[i37];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                            int i39 = 0;
                                            while (i39 < i38) {
                                                if ((j10 & 255) < 128) {
                                                    p0.a aVar4 = (p0.a) objArr4[(i37 << 3) + i39];
                                                    int i40 = aVar4.f7591a;
                                                    if (i40 == i29) {
                                                        aVar4.f7591a = i30;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i29 + 1 <= i40 && i40 < i30) {
                                                            aVar4.f7591a = i40 - 1;
                                                        }
                                                        j10 >>= 8;
                                                        i39++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j10 >>= 8;
                                                i39++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i38 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i37 == length2) {
                                            break;
                                        }
                                        i37++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        r0.b bVar = this.M;
                        int i41 = bVar.f8089f;
                        i0 i0Var = bVar.f8084a;
                        bVar.f8089f = (i28 - i0Var.G.g) + i41;
                        this.G.r(i28);
                        if (i12 > 0) {
                            bVar.d(false);
                            c2.r rVar = bVar.f8087d;
                            q0.g gVar3 = i0Var.G;
                            if (gVar3.f7736c > 0 && rVar.a(-2) != (i13 = gVar3.f7741i)) {
                                if (!bVar.f8086c && bVar.f8088e) {
                                    bVar.d(false);
                                    bVar.f8085b.f8082a.l0(r0.q.f8124c);
                                    bVar.f8086c = true;
                                }
                                if (i13 > 0) {
                                    q0.b a9 = gVar3.a(i13);
                                    rVar.c(i13);
                                    bVar.d(false);
                                    r0.k0 k0Var4 = bVar.f8085b.f8082a;
                                    k0Var4.l0(r0.p.f8123c);
                                    z4.w.N(k0Var4, 0, a9);
                                    bVar.f8086c = true;
                                }
                            }
                            r0.k0 k0Var5 = bVar.f8085b.f8082a;
                            k0Var5.l0(r0.u.f8131c);
                            k0Var5.f8115c[k0Var5.f8116d - k0Var5.f8113a[k0Var5.f8114b - 1].f8109a] = i12;
                        }
                        V(obj2, z12);
                    }
                    k0Var2 = null;
                    u(z12, k0Var2);
                    return;
                }
                z10 = z13;
                k0Var = this.j;
                if (k0Var != null) {
                }
                k0Var2 = null;
                u(z12, k0Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i3, 3);
            j = i17;
        }
        this.T = rotateLeft ^ j;
        if (obj3 == null) {
        }
        if (i10 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void T() {
        S(-127, 0, null, null);
    }

    public final void U(int i3, d1 d1Var) {
        S(i3, 0, d1Var, null);
    }

    public final void V(Object obj, boolean z10) {
        if (z10) {
            q0.g gVar = this.G;
            if (gVar.f7742k <= 0) {
                if ((gVar.f7735b[(gVar.g * 5) + 1] & 1073741824) == 0) {
                    n1.a("Expected a node group");
                }
                gVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            r0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            r0.k0 k0Var = bVar.f8085b.f8082a;
            k0Var.l0(r0.e0.f8101c);
            z4.w.N(k0Var, 0, obj);
        }
        this.G.u();
    }

    public final void W(int i3) {
        int i10;
        int i11;
        if (this.j != null) {
            S(i3, 0, null, null);
            return;
        }
        if (this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i3, 3) ^ this.f6708m;
        this.f6708m++;
        q0.g gVar = this.G;
        boolean z10 = this.S;
        e eVar = k.f6729a;
        if (z10) {
            gVar.f7742k++;
            this.I.Q(i3, eVar, eVar, false);
            u(false, null);
            return;
        }
        if (gVar.g() == i3 && ((i11 = gVar.g) >= gVar.f7740h || (gVar.f7735b[(i11 * 5) + 1] & 536870912) == 0)) {
            gVar.u();
            u(false, null);
            return;
        }
        if (gVar.f7742k <= 0 && (i10 = gVar.g) != gVar.f7740h) {
            int i12 = this.f6706k;
            I();
            this.M.e(i12, gVar.s());
            h.h(this.f6714s, i10, gVar.g);
        }
        gVar.f7742k++;
        this.S = true;
        this.K = null;
        if (this.I.f7780w) {
            q0.k f3 = this.H.f();
            this.I = f3;
            f3.M();
            this.J = false;
            this.K = null;
        }
        q0.k kVar = this.I;
        kVar.d();
        int i13 = kVar.f7777t;
        kVar.Q(i3, eVar, eVar, false);
        this.N = kVar.b(i13);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 X(int i3) {
        s1 s1Var;
        boolean z10;
        int i10;
        W(i3);
        boolean z11 = this.S;
        l.d dVar = this.g;
        ArrayList arrayList = this.E;
        q qVar = this.f6704h;
        if (z11) {
            s1 s1Var2 = new s1(qVar);
            arrayList.add(s1Var2);
            h0(s1Var2);
            s1Var2.f6813e = this.B;
            s1Var2.f6810b &= -17;
            dVar.p();
            return this;
        }
        int i11 = this.G.f7741i;
        ArrayList arrayList2 = this.f6714s;
        int p4 = h.p(i11, arrayList2);
        n0 n0Var = p4 >= 0 ? (n0) arrayList2.remove(p4) : null;
        Object m10 = this.G.m();
        if (Intrinsics.a(m10, k.f6729a)) {
            s1Var = new s1(qVar);
            h0(s1Var);
        } else {
            m10.getClass();
            s1Var = (s1) m10;
        }
        if (n0Var == null) {
            int i12 = s1Var.f6810b;
            boolean z12 = (i12 & 64) != 0;
            if (z12) {
                s1Var.f6810b = i12 & (-65);
            }
            if (!z12) {
                z10 = false;
                int i13 = s1Var.f6810b;
                s1Var.f6810b = !z10 ? i13 | 8 : i13 & (-9);
                arrayList.add(s1Var);
                s1Var.f6813e = this.B;
                s1Var.f6810b &= -17;
                dVar.p();
                i10 = s1Var.f6810b;
                if ((i10 & 256) != 0) {
                    s1Var.f6810b = (i10 & (-257)) | 512;
                    r0.k0 k0Var = this.M.f8085b.f8082a;
                    k0Var.l0(r0.c0.f8097c);
                    z4.w.N(k0Var, 0, s1Var);
                    if (!this.f6720y) {
                        int i14 = s1Var.f6810b;
                        if ((i14 & 128) != 0) {
                            this.f6720y = true;
                            this.f6721z = this.G.f7741i;
                            s1Var.f6810b = i14 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z10 = true;
        int i132 = s1Var.f6810b;
        s1Var.f6810b = !z10 ? i132 | 8 : i132 & (-9);
        arrayList.add(s1Var);
        s1Var.f6813e = this.B;
        s1Var.f6810b &= -17;
        dVar.p();
        i10 = s1Var.f6810b;
        if ((i10 & 256) != 0) {
        }
        return this;
    }

    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.a(this.G.f(), obj) && this.f6721z < 0) {
            this.f6721z = this.G.g;
            this.f6720y = true;
        }
        S(207, 0, null, obj);
    }

    public final void Z() {
        S(125, 2, null, null);
        this.f6713r = true;
    }

    public final void a() {
        i();
        this.f6705i.clear();
        this.f6709n.f1653b = 0;
        this.f6715t.f1653b = 0;
        this.f6719x.f1653b = 0;
        this.f6717v = null;
        r0.c cVar = this.O;
        cVar.f8096b.i0();
        cVar.f8095a.i0();
        this.T = 0;
        this.A = 0;
        this.f6713r = false;
        this.S = false;
        this.f6720y = false;
        this.F = false;
        this.f6721z = -1;
        q0.g gVar = this.G;
        if (!gVar.f7739f) {
            gVar.c();
        }
        if (this.I.f7780w) {
            return;
        }
        v();
    }

    public final void a0() {
        this.f6708m = 0;
        this.G = this.f6700c.e();
        S(100, 0, null, null);
        o oVar = this.f6699b;
        oVar.q();
        x0.h h10 = oVar.h();
        this.f6719x.c(this.f6718w ? 1 : 0);
        this.f6718w = f(h10);
        this.K = null;
        if (!this.f6712q) {
            this.f6712q = oVar.d();
        }
        if (!this.C) {
            this.C = oVar.e();
        }
        if (this.C) {
            n2 n2Var = c1.g.f1483a;
            n2Var.getClass();
            h10 = h10.g(n2Var, new o2(z()));
        }
        this.f6716u = h10;
        Set set = (Set) h.s(h10, c1.i.f1485a);
        if (set != null) {
            set.add(w());
            oVar.m(set);
        }
        S(Long.hashCode(oVar.f()), 0, null, null);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            r0.k0 k0Var = this.O.f8095a;
            k0Var.l0(r0.f0.f8103c);
            z4.w.N(k0Var, 0, obj);
            function2.getClass();
            wd.g0.c(2, function2);
            z4.w.N(k0Var, 1, function2);
            return;
        }
        r0.b bVar = this.M;
        bVar.b();
        r0.k0 k0Var2 = bVar.f8085b.f8082a;
        k0Var2.l0(r0.f0.f8103c);
        function2.getClass();
        wd.g0.c(2, function2);
        z4.w.O(k0Var2, 0, obj, 1, function2);
    }

    public final boolean b0(s1 s1Var, Object obj) {
        q0.b bVar = s1Var.f6811c;
        if (bVar == null) {
            return false;
        }
        int b10 = this.G.f7734a.b(i7.a.l(bVar));
        if (!this.F || b10 < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.f6714s;
        int p4 = h.p(b10, arrayList);
        if (p4 < 0) {
            int i3 = -(p4 + 1);
            if (!(obj instanceof y)) {
                obj = null;
            }
            arrayList.add(i3, new n0(s1Var, b10, obj));
            return true;
        }
        n0 n0Var = (n0) arrayList.get(p4);
        if (!(obj instanceof y)) {
            n0Var.f6764c = null;
            return true;
        }
        Object obj2 = n0Var.f6764c;
        if (obj2 == null) {
            n0Var.f6764c = obj;
            return true;
        }
        if (obj2 instanceof s.i0) {
            ((s.i0) obj2).a(obj);
            return true;
        }
        int i10 = s.q0.f8360a;
        s.i0 i0Var = new s.i0(2);
        i0Var.i(obj2);
        i0Var.i(obj);
        n0Var.f6764c = i0Var;
        return true;
    }

    public final boolean c(float f3) {
        Object D = D();
        if ((D instanceof Float) && f3 == ((Number) D).floatValue()) {
            return false;
        }
        h0(Float.valueOf(f3));
        return true;
    }

    public final void c0(s.h0 h0Var) {
        ArrayList arrayList = this.f6714s;
        for (int e2 = kotlin.collections.y.e(arrayList); -1 < e2; e2--) {
            n0 n0Var = (n0) arrayList.get(e2);
            q0.b bVar = n0Var.f6762a.f6811c;
            q0.b l10 = bVar != null ? i7.a.l(bVar) : null;
            if (l10 == null || !l10.a()) {
                arrayList.remove(e2);
            } else {
                int i3 = n0Var.f6763b;
                int i10 = l10.f7722a;
                if (i3 != i10) {
                    n0Var.f6763b = i10;
                }
            }
        }
        Object[] objArr = h0Var.f8313b;
        Object[] objArr2 = h0Var.f8314c;
        long[] jArr = h0Var.f8312a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            obj.getClass();
                            s1 s1Var = (s1) obj;
                            q0.b bVar2 = s1Var.f6811c;
                            if (bVar2 != null) {
                                int i15 = i7.a.l(bVar2).f7722a;
                                if (obj2 == e.f6662t) {
                                    obj2 = null;
                                }
                                arrayList.add(new n0(s1Var, i15, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        kotlin.collections.c0.k(arrayList, h.f6689e);
    }

    public final boolean d(int i3) {
        Object D = D();
        if ((D instanceof Integer) && i3 == ((Number) D).intValue()) {
            return false;
        }
        h0(Integer.valueOf(i3));
        return true;
    }

    public final void d0(int i3, int i10) {
        if (i0(i3) != i10) {
            if (i3 < 0) {
                s.u uVar = this.f6711p;
                if (uVar == null) {
                    uVar = new s.u();
                    this.f6711p = uVar;
                }
                uVar.f(i3, i10);
                return;
            }
            int[] iArr = this.f6710o;
            if (iArr == null) {
                int i11 = this.G.f7736c;
                int[] iArr2 = new int[i11];
                Arrays.fill(iArr2, 0, i11, -1);
                this.f6710o = iArr2;
                iArr = iArr2;
            }
            iArr[i3] = i10;
        }
    }

    public final boolean e(long j) {
        Object D = D();
        if ((D instanceof Long) && j == ((Number) D).longValue()) {
            return false;
        }
        h0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i3, int i10) {
        int i02 = i0(i3);
        if (i02 != i10) {
            int i11 = i10 - i02;
            ArrayList arrayList = this.f6705i;
            int size = arrayList.size() - 1;
            while (i3 != -1) {
                int i03 = i0(i3) + i11;
                d0(i3, i03);
                int i12 = size;
                while (true) {
                    if (-1 < i12) {
                        k0 k0Var = (k0) arrayList.get(i12);
                        if (k0Var != null && k0Var.a(i3, i03)) {
                            size = i12 - 1;
                            break;
                        }
                        i12--;
                    } else {
                        break;
                    }
                }
                q0.g gVar = this.G;
                if (i3 < 0) {
                    i3 = gVar.f7741i;
                } else if (gVar.l(i3)) {
                    return;
                } else {
                    i3 = this.G.q(i3);
                }
            }
        }
    }

    public final boolean f(Object obj) {
        if (Intrinsics.a(D(), obj)) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final x0.h f0(x0.h hVar, x0.h hVar2) {
        hVar.getClass();
        x0.g gVar = new x0.g(hVar);
        gVar.putAll(hVar2);
        x0.h e2 = gVar.e();
        U(204, m.f6754d);
        D();
        h0(e2);
        D();
        h0(hVar2);
        p(false);
        return e2;
    }

    public final boolean g(boolean z10) {
        Object D = D();
        if ((D instanceof Boolean) && z10 == ((Boolean) D).booleanValue()) {
            return false;
        }
        h0(Boolean.valueOf(z10));
        return true;
    }

    public final void g0(Object obj) {
        if (obj instanceof a2) {
            l0 l0Var = new l0((a2) obj, this.f6708m - 1);
            if (this.S) {
                r0.k0 k0Var = this.M.f8085b.f8082a;
                k0Var.l0(r0.w.f8133c);
                z4.w.N(k0Var, 0, l0Var);
            }
            this.f6701d.add(obj);
            obj = l0Var;
        }
        h0(obj);
    }

    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        h0(obj);
        return true;
    }

    public final void h0(Object obj) {
        if (this.S) {
            q0.k kVar = this.I;
            if (kVar.f7771n <= 0 || kVar.f7767i == kVar.f7768k) {
                kVar.F(obj);
                return;
            }
            s.w wVar = kVar.f7776s;
            if (wVar == null) {
                wVar = new s.w();
            }
            kVar.f7776s = wVar;
            int i3 = kVar.f7779v;
            Object b10 = wVar.b(i3);
            if (b10 == null) {
                b10 = new s.d0();
                wVar.h(i3, b10);
            }
            ((s.d0) b10).a(obj);
            return;
        }
        q0.g gVar = this.G;
        boolean z10 = gVar.f7745n;
        r0.b bVar = this.M;
        if (!z10) {
            q0.b a9 = gVar.a(gVar.f7741i);
            r0.k0 k0Var = bVar.f8085b.f8082a;
            k0Var.l0(r0.e.f8100c);
            z4.w.O(k0Var, 0, a9, 1, obj);
            return;
        }
        int b11 = (gVar.f7743l - q0.j.b(gVar.f7735b, gVar.f7741i)) - 1;
        if (bVar.f8084a.G.f7741i - bVar.f8089f >= 0) {
            bVar.d(true);
            r0.k0 k0Var2 = bVar.f8085b.f8082a;
            k0Var2.l0(r0.r.g);
            z4.w.N(k0Var2, 0, obj);
            k0Var2.f8115c[k0Var2.f8116d - k0Var2.f8113a[k0Var2.f8114b - 1].f8109a] = b11;
            return;
        }
        q0.g gVar2 = this.G;
        q0.b a10 = gVar2.a(gVar2.f7741i);
        r0.k0 k0Var3 = bVar.f8085b.f8082a;
        k0Var3.l0(r0.r.f8127f);
        z4.w.O(k0Var3, 0, obj, 1, a10);
        k0Var3.f8115c[k0Var3.f8116d - k0Var3.f8113a[k0Var3.f8114b - 1].f8109a] = b11;
    }

    public final void i() {
        this.j = null;
        this.f6706k = 0;
        this.f6707l = 0;
        this.T = 0L;
        this.f6713r = false;
        r0.b bVar = this.M;
        bVar.f8086c = false;
        bVar.f8087d.f1653b = 0;
        bVar.f8089f = 0;
        bVar.f8088e = true;
        bVar.g = 0;
        bVar.f8090h.clear();
        bVar.f8091i = -1;
        bVar.j = -1;
        bVar.f8092k = -1;
        bVar.f8093l = 0;
        this.E.clear();
        this.f6710o = null;
        this.f6711p = null;
    }

    public final int i0(int i3) {
        int i10;
        if (i3 >= 0) {
            int[] iArr = this.f6710o;
            return (iArr == null || (i10 = iArr[i3]) < 0) ? this.G.o(i3) : i10;
        }
        s.u uVar = this.f6711p;
        if (uVar == null || uVar.c(i3) < 0) {
            return 0;
        }
        int c10 = uVar.c(i3);
        if (c10 >= 0) {
            return uVar.f8385c[c10];
        }
        throw new NoSuchElementException(v4.a.j(i3, "Cannot find value for key "));
    }

    public final Object j(p1 p1Var) {
        return h.s(l(), p1Var);
    }

    public final void j0() {
        if (!this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f6713r = false;
        if (this.S) {
            m.a("useNode() called while inserting");
        }
        q0.g gVar = this.G;
        Object n10 = gVar.n(gVar.f7741i);
        r0.b bVar = this.M;
        bVar.c();
        bVar.f8090h.add(n10);
        if (this.f6720y && (n10 instanceof i)) {
            bVar.b();
            bVar.f8085b.f8082a.l0(r0.h0.f8107c);
        }
    }

    public final void k(Function0 function0) {
        if (!this.f6713r) {
            m.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f6713r = false;
        if (!this.S) {
            m.a("createNode() can only be called when inserting");
        }
        c2.r rVar = this.f6709n;
        int i3 = rVar.f1652a[rVar.f1653b - 1];
        q0.k kVar = this.I;
        q0.b b10 = kVar.b(kVar.f7779v);
        this.f6707l++;
        r0.c cVar = this.O;
        r0.k0 k0Var = cVar.f8095a;
        k0Var.l0(r0.r.f8125d);
        z4.w.N(k0Var, 0, function0);
        k0Var.f8115c[k0Var.f8116d - k0Var.f8113a[k0Var.f8114b - 1].f8109a] = i3;
        z4.w.N(k0Var, 1, b10);
        r0.k0 k0Var2 = cVar.f8096b;
        k0Var2.l0(r0.r.f8126e);
        k0Var2.f8115c[k0Var2.f8116d - k0Var2.f8113a[k0Var2.f8114b - 1].f8109a] = i3;
        z4.w.N(k0Var2, 0, b10);
    }

    public final x0.h l() {
        x0.h hVar;
        x0.h hVar2 = this.K;
        if (hVar2 != null) {
            return hVar2;
        }
        int i3 = this.G.f7741i;
        boolean z10 = this.S;
        d1 d1Var = m.f6753c;
        if (z10 && this.J) {
            int i10 = this.I.f7779v;
            while (i10 > 0) {
                if (this.I.s(i10) == 202 && Intrinsics.a(this.I.t(i10), d1Var)) {
                    Object q3 = this.I.q(i10);
                    q3.getClass();
                    x0.h hVar3 = (x0.h) q3;
                    this.K = hVar3;
                    return hVar3;
                }
                q0.k kVar = this.I;
                i10 = kVar.E(kVar.f7761b, i10);
            }
        }
        if (this.G.f7736c > 0) {
            while (i3 > 0) {
                if (this.G.i(i3) == 202) {
                    q0.g gVar = this.G;
                    if (Intrinsics.a(gVar.p(gVar.f7735b, i3), d1Var)) {
                        s.w wVar = this.f6717v;
                        if (wVar == null || (hVar = (x0.h) wVar.b(i3)) == null) {
                            q0.g gVar2 = this.G;
                            Object b10 = gVar2.b(gVar2.f7735b, i3);
                            b10.getClass();
                            hVar = (x0.h) b10;
                        }
                        this.K = hVar;
                        return hVar;
                    }
                }
                i3 = this.G.q(i3);
            }
        }
        x0.h hVar4 = this.f6716u;
        this.K = hVar4;
        return hVar4;
    }

    public final c1.a m() {
        Collection collection;
        if (!this.f6699b.j()) {
            return null;
        }
        id.d b10 = kotlin.collections.x.b();
        q0.k kVar = this.I;
        b10.addAll(cf.c.l(kVar, null, kVar.f7777t, null));
        q0.g gVar = this.G;
        boolean z10 = gVar.f7739f;
        int[] iArr = gVar.f7735b;
        if (z10 || gVar.f7736c == 0) {
            collection = kotlin.collections.j0.f5574d;
        } else {
            c1.l lVar = new c1.l(gVar);
            int i3 = gVar.f7741i;
            Object valueOf = Integer.valueOf(gVar.f7743l - q0.j.b(iArr, i3));
            while (i3 >= 0) {
                lVar.m(gVar.i(i3), gVar.k(i3) ? gVar.p(iArr, i3) : k.f6729a, gVar.f7734a.h(i3), valueOf);
                valueOf = gVar.a(i3);
                i3 = gVar.q(i3);
            }
            collection = (ArrayList) lVar.f1478d;
        }
        b10.addAll(collection);
        b10.addAll(E());
        return new c1.a(kotlin.collections.x.a(b10), this.C);
    }

    public final void n(s.h0 h0Var, Function2 function2) {
        ArrayList arrayList = this.f6714s;
        if (this.F) {
            m.a("Reentrant composition is not supported");
        }
        this.g.p();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(b1.r.j().g());
            this.f6717v = null;
            c0(h0Var);
            this.f6706k = 0;
            this.F = true;
            try {
                a0();
                Object D = D();
                if (D != function2 && function2 != null) {
                    h0(function2);
                }
                b1.z zVar = this.D;
                o0.e n10 = h.n();
                try {
                    n10.b(zVar);
                    d1 d1Var = m.f6751a;
                    if (function2 != null) {
                        U(200, d1Var);
                        x0.i.c(this, function2);
                        p(false);
                    } else if (!this.f6718w || D == null || D.equals(k.f6729a)) {
                        P();
                    } else {
                        U(200, d1Var);
                        wd.g0.c(2, D);
                        x0.i.c(this, (Function2) D);
                        p(false);
                    }
                    n10.l(n10.f7319i - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f7780w) {
                        m.a("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    n10.l(n10.f7319i - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i3, int i10) {
        if (i3 <= 0 || i3 == i10) {
            return;
        }
        o(this.G.q(i3), i10);
        if (this.G.l(i3)) {
            Object n10 = this.G.n(i3);
            r0.b bVar = this.M;
            bVar.c();
            bVar.f8090h.add(n10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05b9  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z10) {
        long rotateRight;
        c2.r rVar;
        ArrayList arrayList;
        int i3;
        boolean z11;
        int i10;
        q0.g gVar;
        k0 k0Var;
        ?? r32;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c2.r rVar2;
        int i16;
        int i17;
        ArrayList arrayList2;
        s.i0 i0Var;
        int i18;
        int i19;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i20;
        k0 k0Var2;
        int i21;
        Object[] objArr;
        long[] jArr;
        int i22;
        Object[] objArr2;
        long[] jArr2;
        int i23;
        Object[] objArr3;
        long[] jArr3;
        int i24;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        c2.r rVar3 = this.f6709n;
        int i25 = rVar3.f1652a[rVar3.f1653b - 2] - 1;
        boolean z12 = this.S;
        e eVar = k.f6729a;
        if (z12) {
            q0.k kVar = this.I;
            int i26 = kVar.f7779v;
            int s3 = kVar.s(i26);
            Object t6 = this.I.t(i26);
            Object q3 = this.I.q(i26);
            if (t6 != null) {
                rotateRight2 = Long.rotateRight(this.T ^ 0, 3) ^ (t6 instanceof Enum ? ((Enum) t6).ordinal() : t6.hashCode());
            } else if (q3 == null || s3 != 207 || q3.equals(eVar)) {
                rotateRight2 = Long.rotateRight(this.T ^ i25, 3) ^ s3;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i25, 3) ^ q3.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            q0.g gVar2 = this.G;
            int i27 = gVar2.f7741i;
            int i28 = gVar2.i(i27);
            q0.g gVar3 = this.G;
            Object p4 = gVar3.p(gVar3.f7735b, i27);
            q0.g gVar4 = this.G;
            Object b10 = gVar4.b(gVar4.f7735b, i27);
            if (p4 != null) {
                rotateRight = Long.rotateRight(this.T ^ 0, 3) ^ (p4 instanceof Enum ? ((Enum) p4).ordinal() : p4.hashCode());
            } else if (b10 == null || i28 != 207 || b10.equals(eVar)) {
                rotateRight = Long.rotateRight(this.T ^ i25, 3) ^ i28;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i25, 3) ^ b10.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i29 = this.f6707l;
        k0 k0Var3 = this.j;
        ArrayList arrayList5 = this.f6714s;
        r0.b bVar = this.M;
        if (k0Var3 != null) {
            s.w wVar = k0Var3.f6734e;
            int i30 = k0Var3.f6731b;
            ArrayList arrayList6 = k0Var3.f6730a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = k0Var3.f6733d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i31 = 0; i31 < size; i31++) {
                    hashSet2.add(arrayList7.get(i31));
                }
                i3 = -1;
                int i32 = s.q0.f8360a;
                s.i0 i0Var2 = new s.i0();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                while (i33 < size3) {
                    q0.e eVar2 = (q0.e) arrayList6.get(i33);
                    if (hashSet2.contains(eVar2)) {
                        rVar2 = rVar3;
                        i16 = i33;
                        if (!i0Var2.c(eVar2)) {
                            int i36 = i34;
                            if (i36 < size2) {
                                q0.e eVar3 = (q0.e) arrayList7.get(i36);
                                if (eVar3 != eVar2) {
                                    p0.a aVar = (p0.a) wVar.b(eVar3.f7730c);
                                    int i37 = aVar != null ? aVar.f7592b : -1;
                                    i0Var2.a(eVar3);
                                    i17 = i36;
                                    i20 = i35;
                                    k0Var2 = k0Var3;
                                    if (i37 != i20) {
                                        p0.a aVar2 = (p0.a) wVar.b(eVar3.f7730c);
                                        int i38 = aVar2 != null ? aVar2.f7593c : eVar3.f7731d;
                                        i0Var = i0Var2;
                                        int i39 = i37 + i30;
                                        i18 = size2;
                                        int i40 = i20 + i30;
                                        if (i38 > 0) {
                                            i19 = i30;
                                            int i41 = bVar.f8093l;
                                            if (i41 > 0) {
                                                arrayList3 = arrayList6;
                                                if (bVar.j == i39 - i41 && bVar.f8092k == i40 - i41) {
                                                    bVar.f8093l = i41 + i38;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            bVar.c();
                                            bVar.j = i39;
                                            bVar.f8092k = i40;
                                            bVar.f8093l = i38;
                                        } else {
                                            i19 = i30;
                                            arrayList3 = arrayList6;
                                            bVar.getClass();
                                        }
                                        if (i37 > i20) {
                                            Object[] objArr5 = wVar.f8338c;
                                            long[] jArr5 = wVar.f8336a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i42 = 0;
                                                while (true) {
                                                    long j = jArr5[i42];
                                                    int i43 = i38;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i44 = 8 - ((~(i42 - length)) >>> 31);
                                                        int i45 = 0;
                                                        while (i45 < i44) {
                                                            if ((j & 255) < 128) {
                                                                i24 = i45;
                                                                p0.a aVar3 = (p0.a) objArr5[(i42 << 3) + i45];
                                                                objArr4 = objArr5;
                                                                int i46 = aVar3.f7592b;
                                                                jArr4 = jArr5;
                                                                if (i37 <= i46 && i46 < i37 + i43) {
                                                                    aVar3.f7592b = (i46 - i37) + i20;
                                                                } else if (i20 <= i46 && i46 < i37) {
                                                                    aVar3.f7592b = i46 + i43;
                                                                }
                                                            } else {
                                                                i24 = i45;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i45 = i24 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i44 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i42 == length) {
                                                        break;
                                                    }
                                                    i42++;
                                                    arrayList5 = arrayList2;
                                                    i38 = i43;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i47 = i38;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i20 > i37) {
                                                Object[] objArr6 = wVar.f8338c;
                                                long[] jArr6 = wVar.f8336a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i48 = 0;
                                                    while (true) {
                                                        long j3 = jArr6[i48];
                                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i49 = 8 - ((~(i48 - length2)) >>> 31);
                                                            int i50 = 0;
                                                            while (i50 < i49) {
                                                                if ((j3 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    p0.a aVar4 = (p0.a) objArr6[(i48 << 3) + i50];
                                                                    jArr2 = jArr6;
                                                                    int i51 = aVar4.f7592b;
                                                                    i23 = i37;
                                                                    if (i37 <= i51 && i51 < i23 + i47) {
                                                                        aVar4.f7592b = (i51 - i23) + i20;
                                                                    } else if (i23 + 1 <= i51 && i51 < i20) {
                                                                        aVar4.f7592b = i51 - i47;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i23 = i37;
                                                                }
                                                                j3 >>= 8;
                                                                i50++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i37 = i23;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i22 = i37;
                                                            if (i49 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i22 = i37;
                                                        }
                                                        if (i48 == length2) {
                                                            break;
                                                        }
                                                        i48++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i37 = i22;
                                                    }
                                                }
                                            }
                                        }
                                        i21 = i16;
                                    } else {
                                        arrayList2 = arrayList5;
                                        i0Var = i0Var2;
                                        i18 = size2;
                                        i19 = i30;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i21 = i16;
                                } else {
                                    i17 = i36;
                                    arrayList2 = arrayList5;
                                    i0Var = i0Var2;
                                    i18 = size2;
                                    i19 = i30;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i20 = i35;
                                    k0Var2 = k0Var3;
                                    i21 = i16 + 1;
                                }
                                i34 = i17 + 1;
                                p0.a aVar5 = (p0.a) wVar.b(eVar3.f7730c);
                                int i52 = i20 + (aVar5 != null ? aVar5.f7593c : eVar3.f7731d);
                                i33 = i21;
                                k0Var3 = k0Var2;
                                i0Var2 = i0Var;
                                size2 = i18;
                                i30 = i19;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i35 = i52;
                                rVar3 = rVar2;
                            } else {
                                i34 = i36;
                                rVar3 = rVar2;
                                i33 = i16;
                            }
                        }
                    } else {
                        rVar2 = rVar3;
                        p0.a aVar6 = (p0.a) wVar.b(eVar2.f7730c);
                        int i53 = aVar6 != null ? aVar6.f7592b : -1;
                        int i54 = eVar2.f7730c;
                        i16 = i33;
                        bVar.e(i53 + i30, eVar2.f7731d);
                        k0Var3.a(i54, 0);
                        bVar.f8089f = (i54 - bVar.f8084a.G.g) + bVar.f8089f;
                        this.G.r(i54);
                        I();
                        this.G.s();
                        h.h(arrayList5, i54, this.G.f7735b[(i54 * 5) + 3] + i54);
                    }
                    i33 = i16 + 1;
                    rVar3 = rVar2;
                }
                rVar = rVar3;
                arrayList = arrayList5;
                bVar.c();
                if (arrayList6.size() > 0) {
                    q0.g gVar5 = this.G;
                    bVar.f8089f = (gVar5.f7740h - bVar.f8084a.G.g) + bVar.f8089f;
                    gVar5.t();
                }
                z11 = this.S;
                if (!z11) {
                    q0.g gVar6 = this.G;
                    int i55 = gVar6.f7744m - gVar6.f7743l;
                    if (i55 > 0) {
                        if (i55 > 0) {
                            bVar.d(false);
                            c2.r rVar4 = bVar.f8087d;
                            q0.g gVar7 = bVar.f8084a.G;
                            if (gVar7.f7736c > 0 && rVar4.a(-2) != (i15 = gVar7.f7741i)) {
                                if (!bVar.f8086c && bVar.f8088e) {
                                    bVar.d(false);
                                    bVar.f8085b.f8082a.l0(r0.q.f8124c);
                                    bVar.f8086c = true;
                                }
                                if (i15 > 0) {
                                    q0.b a9 = gVar7.a(i15);
                                    rVar4.c(i15);
                                    bVar.d(false);
                                    r0.k0 k0Var4 = bVar.f8085b.f8082a;
                                    k0Var4.l0(r0.p.f8123c);
                                    z4.w.N(k0Var4, 0, a9);
                                    bVar.f8086c = true;
                                }
                            }
                            r0.k0 k0Var5 = bVar.f8085b.f8082a;
                            k0Var5.l0(r0.d0.f8099c);
                            k0Var5.f8115c[k0Var5.f8116d - k0Var5.f8113a[k0Var5.f8114b - 1].f8109a] = i55;
                        } else {
                            bVar.getClass();
                        }
                    }
                }
                i10 = this.f6706k;
                while (true) {
                    gVar = this.G;
                    if (gVar.f7742k > 0 && (i14 = gVar.g) != gVar.f7740h) {
                        I();
                        bVar.e(i10, this.G.s());
                        h.h(arrayList, i14, this.G.g);
                    }
                }
                if (z11) {
                    if (z10) {
                        bVar.a();
                    }
                    int i56 = bVar.f8084a.G.f7741i;
                    c2.r rVar5 = bVar.f8087d;
                    int i57 = i3;
                    if (rVar5.a(i57) > i56) {
                        m.a("Missed recording an endGroup");
                    }
                    if (rVar5.a(i57) == i56) {
                        bVar.d(false);
                        rVar5.b();
                        bVar.f8085b.f8082a.l0(r0.m.f8120c);
                    }
                    int i58 = this.G.f7741i;
                    if (i29 != i0(i58)) {
                        e0(i58, i29);
                    }
                    if (z10) {
                        i29 = 1;
                    }
                    this.G.e();
                    bVar.c();
                } else {
                    if (z10) {
                        r0.c cVar = this.O;
                        r0.k0 k0Var6 = cVar.f8096b;
                        if (k0Var6.f8114b == 0) {
                            m.a("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        r0.k0 k0Var7 = cVar.f8095a;
                        r0.i0[] i0VarArr = k0Var6.f8113a;
                        int i59 = k0Var6.f8114b - 1;
                        k0Var6.f8114b = i59;
                        r0.i0 i0Var3 = i0VarArr[i59];
                        i0VarArr[i59] = null;
                        k0Var7.l0(i0Var3);
                        Object[] objArr7 = k0Var6.f8117e;
                        Object[] objArr8 = k0Var7.f8117e;
                        int i60 = k0Var7.f8118f;
                        int i61 = i0Var3.f8110b;
                        int i62 = k0Var6.f8118f;
                        int i63 = i62 - i61;
                        System.arraycopy(objArr7, i63, objArr8, i60 - i61, i62 - i63);
                        Object[] objArr9 = k0Var6.f8117e;
                        int i64 = k0Var6.f8118f;
                        Arrays.fill(objArr9, i64 - i61, i64, (Object) null);
                        int[] iArr = k0Var6.f8115c;
                        int[] iArr2 = k0Var7.f8115c;
                        int i65 = k0Var7.f8116d;
                        int i66 = i0Var3.f8109a;
                        int i67 = k0Var6.f8116d;
                        kotlin.collections.v.c(i65 - i66, i67 - i66, i67, iArr, iArr2);
                        k0Var6.f8118f -= i61;
                        k0Var6.f8116d -= i66;
                        i29 = 1;
                    }
                    if (this.G.f7742k <= 0) {
                        n1.a("Unbalanced begin/end empty");
                    }
                    r4.f7742k--;
                    q0.k kVar2 = this.I;
                    int i68 = kVar2.f7779v;
                    kVar2.j();
                    if (this.G.f7742k <= 0) {
                        int i69 = (-2) - i68;
                        this.I.k();
                        this.I.e(true);
                        q0.b bVar2 = this.N;
                        boolean k02 = this.O.f8095a.k0();
                        q0.h hVar = this.H;
                        if (k02) {
                            bVar.b();
                            bVar.d(false);
                            c2.r rVar6 = bVar.f8087d;
                            q0.g gVar8 = bVar.f8084a.G;
                            if (gVar8.f7736c > 0 && rVar6.a(-2) != (i13 = gVar8.f7741i)) {
                                if (!bVar.f8086c && bVar.f8088e) {
                                    bVar.d(false);
                                    bVar.f8085b.f8082a.l0(r0.q.f8124c);
                                    bVar.f8086c = true;
                                }
                                if (i13 > 0) {
                                    q0.b a10 = gVar8.a(i13);
                                    rVar6.c(i13);
                                    bVar.d(false);
                                    r0.k0 k0Var8 = bVar.f8085b.f8082a;
                                    k0Var8.l0(r0.p.f8123c);
                                    z4.w.N(k0Var8, 0, a10);
                                    i12 = 1;
                                    bVar.f8086c = true;
                                    bVar.c();
                                    r0.k0 k0Var9 = bVar.f8085b.f8082a;
                                    k0Var9.l0(r0.s.f8129c);
                                    z4.w.O(k0Var9, 0, bVar2, i12, hVar);
                                    r32 = 0;
                                }
                            }
                            i12 = 1;
                            bVar.c();
                            r0.k0 k0Var92 = bVar.f8085b.f8082a;
                            k0Var92.l0(r0.s.f8129c);
                            z4.w.O(k0Var92, 0, bVar2, i12, hVar);
                            r32 = 0;
                        } else {
                            r0.c cVar2 = this.O;
                            bVar.b();
                            bVar.d(false);
                            c2.r rVar7 = bVar.f8087d;
                            q0.g gVar9 = bVar.f8084a.G;
                            if (gVar9.f7736c > 0 && rVar7.a(-2) != (i11 = gVar9.f7741i)) {
                                if (!bVar.f8086c && bVar.f8088e) {
                                    bVar.d(false);
                                    bVar.f8085b.f8082a.l0(r0.q.f8124c);
                                    bVar.f8086c = true;
                                }
                                if (i11 > 0) {
                                    q0.b a11 = gVar9.a(i11);
                                    rVar7.c(i11);
                                    bVar.d(false);
                                    r0.k0 k0Var10 = bVar.f8085b.f8082a;
                                    k0Var10.l0(r0.p.f8123c);
                                    z4.w.N(k0Var10, 0, a11);
                                    bVar.f8086c = true;
                                }
                            }
                            bVar.c();
                            r0.k0 k0Var11 = bVar.f8085b.f8082a;
                            k0Var11.l0(r0.t.f8130c);
                            int i70 = k0Var11.f8118f - k0Var11.f8113a[k0Var11.f8114b - 1].f8110b;
                            Object[] objArr10 = k0Var11.f8117e;
                            objArr10[i70] = bVar2;
                            objArr10[i70 + 1] = hVar;
                            objArr10[i70 + 2] = cVar2;
                            this.O = new r0.c();
                            r32 = 0;
                        }
                        this.S = r32;
                        if (this.f6700c.f7747e != 0) {
                            d0(i69, r32);
                            e0(i69, i29);
                        }
                    }
                }
                k0Var = (k0) this.f6705i.remove(r3.size() - 1);
                if (k0Var != null && !z11) {
                    k0Var.f6732c++;
                }
                this.j = k0Var;
                this.f6706k = rVar.b() + i29;
                this.f6708m = rVar.b();
                this.f6707l = rVar.b() + i29;
            }
        }
        rVar = rVar3;
        arrayList = arrayList5;
        i3 = -1;
        z11 = this.S;
        if (!z11) {
        }
        i10 = this.f6706k;
        while (true) {
            gVar = this.G;
            if (gVar.f7742k > 0) {
                break;
            }
            I();
            bVar.e(i10, this.G.s());
            h.h(arrayList, i14, this.G.g);
        }
        if (z11) {
        }
        k0Var = (k0) this.f6705i.remove(r3.size() - 1);
        if (k0Var != null) {
            k0Var.f6732c++;
        }
        this.j = k0Var;
        this.f6706k = rVar.b() + i29;
        this.f6708m = rVar.b();
        this.f6707l = rVar.b() + i29;
    }

    public final void q() {
        p(false);
        s1 x10 = x();
        if (x10 != null) {
            int i3 = x10.f6810b;
            if ((i3 & 1) != 0) {
                x10.f6810b = i3 | 2;
            }
        }
    }

    public final s1 r() {
        s1 s1Var;
        q0.b a9;
        Function1 function1;
        ArrayList arrayList = this.E;
        final s1 s1Var2 = !arrayList.isEmpty() ? (s1) arrayList.remove(arrayList.size() - 1) : null;
        if (s1Var2 != null) {
            s1Var2.f6810b &= -9;
            this.g.p();
            final int i3 = this.B;
            final s.c0 c0Var = s1Var2.f6814f;
            if (c0Var != null && (s1Var2.f6810b & 16) == 0) {
                Object[] objArr = c0Var.f8278b;
                int[] iArr = c0Var.f8279c;
                long[] jArr = c0Var.f8277a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = objArr[i13];
                                    if (iArr[i13] != i3) {
                                        function1 = new Function1() { // from class: n0.r1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                n nVar;
                                                n nVar2;
                                                int i14;
                                                n nVar3 = (n) obj2;
                                                s1 s1Var3 = s1.this;
                                                int i15 = s1Var3.f6813e;
                                                int i16 = i3;
                                                if (i15 == i16) {
                                                    s.c0 c0Var2 = s1Var3.f6814f;
                                                    s.c0 c0Var3 = c0Var;
                                                    if (Intrinsics.a(c0Var3, c0Var2) && (nVar3 instanceof q)) {
                                                        long[] jArr2 = c0Var3.f8277a;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i17 = 0;
                                                            while (true) {
                                                                long j3 = jArr2[i17];
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i18 = 8;
                                                                    int i19 = 8 - ((~(i17 - length2)) >>> 31);
                                                                    int i20 = 0;
                                                                    while (i20 < i19) {
                                                                        if ((255 & j3) < 128) {
                                                                            int i21 = (i17 << 3) + i20;
                                                                            Object obj3 = c0Var3.f8278b[i21];
                                                                            boolean z10 = c0Var3.f8279c[i21] != i16;
                                                                            if (z10) {
                                                                                i14 = i18;
                                                                                q qVar = (q) nVar3;
                                                                                s.h0 h0Var = qVar.f6783u;
                                                                                z4.w.J(h0Var, obj3, s1Var3);
                                                                                nVar2 = nVar3;
                                                                                if (obj3 instanceof y) {
                                                                                    y yVar = (y) obj3;
                                                                                    if (!h0Var.c(yVar)) {
                                                                                        z4.w.K(qVar.f6786x, yVar);
                                                                                    }
                                                                                    s.h0 h0Var2 = s1Var3.g;
                                                                                    if (h0Var2 != null) {
                                                                                        h0Var2.k(obj3);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                nVar2 = nVar3;
                                                                                i14 = i18;
                                                                            }
                                                                            if (z10) {
                                                                                c0Var3.e(i21);
                                                                            }
                                                                        } else {
                                                                            nVar2 = nVar3;
                                                                            i14 = i18;
                                                                        }
                                                                        j3 >>= i14;
                                                                        i20++;
                                                                        i18 = i14;
                                                                        nVar3 = nVar2;
                                                                    }
                                                                    nVar = nVar3;
                                                                    if (i19 != i18) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    nVar = nVar3;
                                                                }
                                                                if (i17 == length2) {
                                                                    break;
                                                                }
                                                                i17++;
                                                                nVar3 = nVar;
                                                            }
                                                        }
                                                    }
                                                }
                                                return Unit.f5554a;
                                            }
                                        };
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            function1 = null;
            r0.b bVar = this.M;
            if (function1 != null) {
                r0.k0 k0Var = bVar.f8085b.f8082a;
                k0Var.l0(r0.l.f8119c);
                z4.w.O(k0Var, 0, function1, 1, this.f6704h);
            }
            int i14 = s1Var2.f6810b;
            if ((i14 & 512) != 0) {
                s1Var2.f6810b = i14 & (-513);
                r0.k0 k0Var2 = bVar.f8085b.f8082a;
                k0Var2.l0(r0.o.f8122c);
                z4.w.N(k0Var2, 0, s1Var2);
                int i15 = s1Var2.f6810b;
                s1Var2.f6810b = i15 & (-129);
                if ((i15 & 1024) != 0) {
                    s1Var2.f6810b = i15 & (-1153);
                    if (this.f6721z == this.G.f7741i) {
                        this.f6720y = false;
                        this.f6721z = -1;
                    }
                }
            }
        }
        if (s1Var2 != null) {
            int i16 = s1Var2.f6810b;
            if ((i16 & 16) == 0 && ((i16 & 1) != 0 || this.f6712q)) {
                if (s1Var2.f6811c == null) {
                    if (this.S) {
                        q0.k kVar = this.I;
                        a9 = kVar.b(kVar.f7779v);
                    } else {
                        q0.g gVar = this.G;
                        a9 = gVar.a(gVar.f7741i);
                    }
                    s1Var2.f6811c = a9;
                }
                s1Var2.f6810b &= -5;
                s1Var = s1Var2;
                p(false);
                return s1Var;
            }
        }
        s1Var = null;
        p(false);
        return s1Var;
    }

    public final void s() {
        if (this.F || this.f6721z != 0) {
            n1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f6721z = -1;
        this.f6720y = false;
    }

    public final void t() {
        p(false);
        this.f6699b.b();
        p(false);
        r0.b bVar = this.M;
        if (bVar.f8086c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f8085b.f8082a.l0(r0.m.f8120c);
            bVar.f8086c = false;
        }
        bVar.b();
        if (bVar.f8087d.f1653b != 0) {
            m.a("Missed recording an endGroup()");
        }
        if (!this.f6705i.isEmpty()) {
            m.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f6718w = this.f6719x.b() != 0;
    }

    public final void u(boolean z10, k0 k0Var) {
        this.f6705i.add(this.j);
        this.j = k0Var;
        int i3 = this.f6707l;
        c2.r rVar = this.f6709n;
        rVar.c(i3);
        rVar.c(this.f6708m);
        rVar.c(this.f6706k);
        if (z10) {
            this.f6706k = 0;
        }
        this.f6707l = 0;
        this.f6708m = 0;
    }

    public final void v() {
        q0.h hVar = new q0.h();
        if (this.C) {
            hVar.c();
        }
        if (this.f6699b.c()) {
            hVar.f7756y = new s.w();
        }
        this.H = hVar;
        q0.k f3 = hVar.f();
        f3.e(true);
        this.I = f3;
    }

    public final c1.d w() {
        j0 j0Var = this.U;
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0(this.f6704h);
        this.U = j0Var2;
        return j0Var2;
    }

    public final s1 x() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (s1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean y() {
        if (!A() || this.f6718w) {
            return true;
        }
        s1 x10 = x();
        return (x10 == null || (x10.f6810b & 4) == 0) ? false : true;
    }

    public final c1.f z() {
        if (this.f6699b.j()) {
            return this.Q;
        }
        return null;
    }
}
