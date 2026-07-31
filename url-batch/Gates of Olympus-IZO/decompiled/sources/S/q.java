package S;

import D1.C0014b;
import I.C0091e;
import I.b1;
import j.C0475A;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0014b f3234a = new C0014b(2);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3235b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static n f3236c;

    /* renamed from: d, reason: collision with root package name */
    public static int f3237d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f3238e;

    /* renamed from: f, reason: collision with root package name */
    public static final F2.h f3239f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f3240g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f3241h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f3242i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f3243j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0091e f3244k;

    static {
        n nVar = n.f3224h;
        f3236c = nVar;
        f3237d = 2;
        l lVar = new l();
        lVar.f3215c = new int[16];
        lVar.f3216d = new int[16];
        int[] iArr = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        lVar.f3217e = iArr;
        f3238e = lVar;
        F2.h hVar = new F2.h(1, (byte) 0);
        hVar.f1503f = new int[16];
        hVar.f1504g = new b1[16];
        f3239f = hVar;
        M1.u uVar = M1.u.f2803d;
        f3240g = uVar;
        f3241h = uVar;
        int i5 = f3237d;
        f3237d = i5 + 1;
        d dVar = new d(i5, nVar);
        f3236c = f3236c.j(dVar.f3209b);
        AtomicReference atomicReference = new AtomicReference(dVar);
        f3242i = atomicReference;
        f3243j = (i) atomicReference.get();
        f3244k = new C0091e(0);
    }

    public static final void a() {
        f(o.f3229f);
    }

    public static final Y1.c b(Y1.c cVar, Y1.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0155b(cVar, cVar2, 2);
    }

    public static final HashMap c(e eVar, e eVar2, n nVar) {
        long[] jArr;
        int i3;
        n nVar2;
        long[] jArr2;
        int i4;
        n nVar3;
        C0475A w3 = eVar2.w();
        int d3 = eVar.d();
        if (w3 != null) {
            n i5 = eVar2.e().j(eVar2.d()).i(eVar2.f3199j);
            Object[] objArr = w3.f5130b;
            long[] jArr3 = w3.f5129a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i6 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j3) < 128) {
                            x xVar = (x) objArr[(i6 << 3) + i9];
                            z c3 = xVar.c();
                            z s3 = s(c3, d3, nVar);
                            if (s3 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                z s4 = s(c3, d3, i5);
                                if (s4 != null && !s3.equals(s4)) {
                                    i4 = d3;
                                    nVar3 = i5;
                                    z s5 = s(c3, eVar2.d(), eVar2.e());
                                    if (s5 == null) {
                                        r();
                                        throw null;
                                    }
                                    z b2 = xVar.b(s4, s3, s5);
                                    if (b2 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s3, b2);
                                    hashMap = hashMap;
                                }
                            }
                            i4 = d3;
                            nVar3 = i5;
                        } else {
                            jArr2 = jArr3;
                            i4 = d3;
                            nVar3 = i5;
                        }
                        j3 >>= 8;
                        i9++;
                        i7 = 8;
                        jArr3 = jArr2;
                        d3 = i4;
                        i5 = nVar3;
                    }
                    jArr = jArr3;
                    i3 = d3;
                    nVar2 = i5;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    i3 = d3;
                    nVar2 = i5;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                jArr3 = jArr;
                d3 = i3;
                i5 = nVar2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(i iVar) {
        int i3;
        if (f3236c.d(iVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(iVar.d());
        sb.append(", disposed=");
        sb.append(iVar.f3210c);
        sb.append(", applied=");
        e eVar = iVar instanceof e ? (e) iVar : null;
        sb.append(eVar != null ? Boolean.valueOf(eVar.f3202m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f3235b) {
            l lVar = f3238e;
            i3 = lVar.f3213a > 0 ? ((int[]) lVar.f3215c)[0] : -1;
        }
        sb.append(i3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final n e(n nVar, int i3, int i4) {
        while (i3 < i4) {
            nVar = nVar.j(i3);
            i3++;
        }
        return nVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static final Object f(Y1.c cVar) {
        Object obj;
        C0475A c0475a;
        Object v3;
        i iVar = f3243j;
        Z1.i.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f3235b) {
            try {
                obj = f3242i.get();
                c0475a = ((d) obj).f3197h;
                if (c0475a != null) {
                    f3244k.addAndGet(1);
                }
                v3 = v((i) obj, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0475a != null) {
            try {
                ?? r4 = f3240g;
                int size = r4.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Y1.e) r4.get(i3)).g(new K.f(c0475a), obj);
                }
            } finally {
                f3244k.addAndGet(-1);
            }
        }
        synchronized (f3235b) {
            g();
            if (c0475a != null) {
                Object[] objArr = c0475a.f5130b;
                long[] jArr = c0475a.f5129a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j3) < 128) {
                                    q((x) objArr[(i4 << 3) + i6]);
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return v3;
    }

    public static final void g() {
        F2.h hVar = f3239f;
        int i3 = hVar.f1502e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            b1 b1Var = ((b1[]) hVar.f1504g)[i4];
            Object obj = b1Var != null ? b1Var.get() : null;
            if (obj != null && p((x) obj)) {
                if (i5 != i4) {
                    ((b1[]) hVar.f1504g)[i5] = b1Var;
                    int[] iArr = (int[]) hVar.f1503f;
                    iArr[i5] = iArr[i4];
                }
                i5++;
            }
            i4++;
        }
        for (int i6 = i5; i6 < i3; i6++) {
            ((b1[]) hVar.f1504g)[i6] = null;
            ((int[]) hVar.f1503f)[i6] = 0;
        }
        if (i5 != i3) {
            hVar.f1502e = i5;
        }
    }

    public static final i h(i iVar, Y1.c cVar, boolean z3) {
        boolean z4 = iVar instanceof e;
        if (z4 || iVar == null) {
            return new B(z4 ? (e) iVar : null, cVar, null, false, z3);
        }
        return new C(iVar, cVar, z3);
    }

    public static final z i(z zVar) {
        z s3;
        i k3 = k();
        z s4 = s(zVar, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f3235b) {
            i k4 = k();
            s3 = s(zVar, k4.d(), k4.e());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final z j(z zVar, i iVar) {
        z s3 = s(zVar, iVar.d(), iVar.e());
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final i k() {
        i iVar = (i) f3234a.g();
        return iVar == null ? (i) f3242i.get() : iVar;
    }

    public static final Y1.c l(Y1.c cVar, Y1.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0155b(cVar, cVar2, 1);
    }

    public static final z m(z zVar, x xVar) {
        z c3 = xVar.c();
        int i3 = f3237d;
        l lVar = f3238e;
        if (lVar.f3213a > 0) {
            i3 = ((int[]) lVar.f3215c)[0];
        }
        int i4 = i3 - 1;
        n nVar = n.f3224h;
        z zVar2 = null;
        z zVar3 = null;
        while (true) {
            if (c3 != null) {
                int i5 = c3.f3272a;
                if (i5 == 0) {
                    break;
                }
                if (i5 != 0 && i5 <= i4 && !nVar.d(i5)) {
                    if (zVar3 == null) {
                        zVar3 = c3;
                    } else if (c3.f3272a >= zVar3.f3272a) {
                        zVar2 = zVar3;
                    }
                }
                c3 = c3.f3273b;
            } else {
                break;
            }
        }
        zVar2 = c3;
        if (zVar2 != null) {
            zVar2.f3272a = Integer.MAX_VALUE;
            return zVar2;
        }
        z b2 = zVar.b();
        b2.f3272a = Integer.MAX_VALUE;
        b2.f3273b = xVar.c();
        xVar.d(b2);
        return b2;
    }

    public static final void n(i iVar, x xVar) {
        iVar.s(iVar.h() + 1);
        Y1.c i3 = iVar.i();
        if (i3 != null) {
            i3.j(xVar);
        }
    }

    public static final z o(z zVar, y yVar, i iVar, z zVar2) {
        z m3;
        if (iVar.g()) {
            iVar.n(yVar);
        }
        int d3 = iVar.d();
        if (zVar2.f3272a == d3) {
            return zVar2;
        }
        synchronized (f3235b) {
            m3 = m(zVar, yVar);
        }
        m3.f3272a = d3;
        if (zVar2.f3272a != 1) {
            iVar.n(yVar);
        }
        return m3;
    }

    public static final boolean p(x xVar) {
        z zVar;
        int i3 = f3237d;
        l lVar = f3238e;
        if (lVar.f3213a > 0) {
            i3 = ((int[]) lVar.f3215c)[0];
        }
        z zVar2 = null;
        z zVar3 = null;
        int i4 = 0;
        for (z c3 = xVar.c(); c3 != null; c3 = c3.f3273b) {
            int i5 = c3.f3272a;
            if (i5 != 0) {
                if (i5 >= i3) {
                    i4++;
                } else if (zVar2 == null) {
                    i4++;
                    zVar2 = c3;
                } else {
                    if (i5 < zVar2.f3272a) {
                        zVar = zVar2;
                        zVar2 = c3;
                    } else {
                        zVar = c3;
                    }
                    if (zVar3 == null) {
                        zVar3 = xVar.c();
                        z zVar4 = zVar3;
                        while (true) {
                            if (zVar3 == null) {
                                zVar3 = zVar4;
                                break;
                            }
                            int i6 = zVar3.f3272a;
                            if (i6 >= i3) {
                                break;
                            }
                            if (zVar4.f3272a < i6) {
                                zVar4 = zVar3;
                            }
                            zVar3 = zVar3.f3273b;
                        }
                    }
                    zVar2.f3272a = 0;
                    zVar2.a(zVar3);
                    zVar2 = zVar;
                }
            }
        }
        return i4 > 1;
    }

    public static final void q(x xVar) {
        if (p(xVar)) {
            F2.h hVar = f3239f;
            int i3 = hVar.f1502e;
            int identityHashCode = System.identityHashCode(xVar);
            int i4 = -1;
            if (i3 > 0) {
                int i5 = hVar.f1502e - 1;
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i4 = -(i6 + 1);
                        break;
                    }
                    int i7 = (i6 + i5) >>> 1;
                    int i8 = ((int[]) hVar.f1503f)[i7];
                    if (i8 < identityHashCode) {
                        i6 = i7 + 1;
                    } else if (i8 > identityHashCode) {
                        i5 = i7 - 1;
                    } else {
                        b1 b1Var = ((b1[]) hVar.f1504g)[i7];
                        if (xVar == (b1Var != null ? b1Var.get() : null)) {
                            i4 = i7;
                        } else {
                            int i9 = i7 - 1;
                            while (-1 < i9 && ((int[]) hVar.f1503f)[i9] == identityHashCode) {
                                b1 b1Var2 = ((b1[]) hVar.f1504g)[i9];
                                if ((b1Var2 != null ? b1Var2.get() : null) == xVar) {
                                    break;
                                } else {
                                    i9--;
                                }
                            }
                            int i10 = hVar.f1502e;
                            i9 = i7 + 1;
                            while (true) {
                                if (i9 >= i10) {
                                    i9 = -(hVar.f1502e + 1);
                                    break;
                                } else {
                                    if (((int[]) hVar.f1503f)[i9] != identityHashCode) {
                                        i9 = -(i9 + 1);
                                        break;
                                    }
                                    b1 b1Var3 = ((b1[]) hVar.f1504g)[i9];
                                    if ((b1Var3 != null ? b1Var3.get() : null) == xVar) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            i4 = i9;
                        }
                    }
                }
                if (i4 >= 0) {
                    return;
                }
            }
            int i11 = -(i4 + 1);
            b1[] b1VarArr = (b1[]) hVar.f1504g;
            int length = b1VarArr.length;
            if (i3 == length) {
                int i12 = length * 2;
                b1[] b1VarArr2 = new b1[i12];
                int[] iArr = new int[i12];
                int i13 = i11 + 1;
                M1.k.X(b1VarArr, b1VarArr2, i13, i11, i3);
                M1.k.Z((b1[]) hVar.f1504g, b1VarArr2, 0, i11, 6);
                M1.k.W((int[]) hVar.f1503f, iArr, i13, i11, i3);
                M1.k.Y((int[]) hVar.f1503f, iArr, 0, i11, 6);
                hVar.f1504g = b1VarArr2;
                hVar.f1503f = iArr;
            } else {
                int i14 = i11 + 1;
                M1.k.X(b1VarArr, b1VarArr, i14, i11, i3);
                int[] iArr2 = (int[]) hVar.f1503f;
                M1.k.W(iArr2, iArr2, i14, i11, i3);
            }
            ((b1[]) hVar.f1504g)[i11] = new b1(xVar);
            ((int[]) hVar.f1503f)[i11] = identityHashCode;
            hVar.f1502e++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final z s(z zVar, int i3, n nVar) {
        z zVar2 = null;
        while (zVar != null) {
            int i4 = zVar.f3272a;
            if (i4 != 0 && i4 <= i3 && !nVar.d(i4) && (zVar2 == null || zVar2.f3272a < zVar.f3272a)) {
                zVar2 = zVar;
            }
            zVar = zVar.f3273b;
        }
        if (zVar2 != null) {
            return zVar2;
        }
        return null;
    }

    public static final z t(z zVar, x xVar) {
        z s3;
        i k3 = k();
        Y1.c f3 = k3.f();
        if (f3 != null) {
            f3.j(xVar);
        }
        z s4 = s(zVar, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f3235b) {
            i k4 = k();
            z c3 = xVar.c();
            Z1.i.d(c3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s3 = s(c3, k4.d(), k4.e());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i3) {
        int i4;
        l lVar = f3238e;
        int i5 = ((int[]) lVar.f3217e)[i3];
        lVar.b(i5, lVar.f3213a - 1);
        lVar.f3213a--;
        int[] iArr = (int[]) lVar.f3215c;
        int i6 = iArr[i5];
        int i7 = i5;
        while (i7 > 0) {
            int i8 = ((i7 + 1) >> 1) - 1;
            if (iArr[i8] <= i6) {
                break;
            }
            lVar.b(i8, i7);
            i7 = i8;
        }
        int[] iArr2 = (int[]) lVar.f3215c;
        int i9 = lVar.f3213a >> 1;
        while (i5 < i9) {
            int i10 = (i5 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < lVar.f3213a && (i4 = iArr2[i10]) < iArr2[i11]) {
                if (i4 >= iArr2[i5]) {
                    break;
                }
                lVar.b(i10, i5);
                i5 = i10;
            } else {
                if (iArr2[i11] >= iArr2[i5]) {
                    break;
                }
                lVar.b(i11, i5);
                i5 = i11;
            }
        }
        ((int[]) lVar.f3217e)[i3] = lVar.f3214b;
        lVar.f3214b = i3;
    }

    public static final Object v(i iVar, Y1.c cVar) {
        Object j3 = cVar.j(f3236c.c(iVar.d()));
        synchronized (f3235b) {
            int i3 = f3237d;
            f3237d = i3 + 1;
            n c3 = f3236c.c(iVar.d());
            f3236c = c3;
            f3242i.set(new d(i3, c3));
            iVar.c();
            f3236c = f3236c.j(i3);
        }
        return j3;
    }

    public static final z w(z zVar, x xVar, i iVar) {
        z s3;
        if (iVar.g()) {
            iVar.n(xVar);
        }
        int d3 = iVar.d();
        z s4 = s(zVar, d3, iVar.e());
        if (s4 == null) {
            r();
            throw null;
        }
        if (s4.f3272a == iVar.d()) {
            return s4;
        }
        synchronized (f3235b) {
            s3 = s(xVar.c(), d3, iVar.e());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f3272a != d3) {
                z m3 = m(s3, xVar);
                m3.a(s3);
                m3.f3272a = iVar.d();
                s3 = m3;
            }
        }
        if (s4.f3272a != 1) {
            iVar.n(xVar);
        }
        return s3;
    }
}
