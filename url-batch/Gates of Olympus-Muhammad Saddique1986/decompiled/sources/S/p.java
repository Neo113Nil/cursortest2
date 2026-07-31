package S;

import B.C0011l;
import I.C0145e;
import I.a1;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import j.C0519A;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final G1.m f4240a = new G1.m(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4241b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static n f4242c;

    /* renamed from: d, reason: collision with root package name */
    public static int f4243d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f4244e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0011l f4245f;

    /* renamed from: g, reason: collision with root package name */
    public static Object f4246g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f4247h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f4248i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f4249j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0145e f4250k;

    static {
        n nVar = n.f4232h;
        f4242c = nVar;
        f4243d = 2;
        l lVar = new l();
        lVar.f4223c = new int[16];
        lVar.f4224d = new int[16];
        int[] iArr = new int[16];
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i3 + 1;
            iArr[i3] = i4;
            i3 = i4;
        }
        lVar.f4225e = iArr;
        f4244e = lVar;
        C0011l c0011l = new C0011l(3, (byte) 0);
        c0011l.f422f = new int[16];
        c0011l.f423g = new a1[16];
        f4245f = c0011l;
        S1.u uVar = S1.u.f4320d;
        f4246g = uVar;
        f4247h = uVar;
        int i5 = f4243d;
        f4243d = i5 + 1;
        C0220d c0220d = new C0220d(i5, nVar);
        f4242c = f4242c.j(c0220d.f4217b);
        AtomicReference atomicReference = new AtomicReference(c0220d);
        f4248i = atomicReference;
        f4249j = (i) atomicReference.get();
        f4250k = new C0145e(0);
    }

    public static final void a() {
        f(o.f4237f);
    }

    public static final InterfaceC0424c b(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2) {
        return (interfaceC0424c == null || interfaceC0424c2 == null || interfaceC0424c == interfaceC0424c2) ? interfaceC0424c == null ? interfaceC0424c2 : interfaceC0424c : new C0218b(interfaceC0424c, interfaceC0424c2, 2);
    }

    public static final HashMap c(C0221e c0221e, C0221e c0221e2, n nVar) {
        long[] jArr;
        int i3;
        n nVar2;
        long[] jArr2;
        int i4;
        n nVar3;
        C0519A w2 = c0221e2.w();
        int d3 = c0221e.d();
        if (w2 != null) {
            n i5 = c0221e2.e().j(c0221e2.d()).i(c0221e2.f4206j);
            Object[] objArr = w2.f6248b;
            long[] jArr3 = w2.f6247a;
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
                            y yVar = (y) objArr[(i6 << 3) + i9];
                            A c2 = yVar.c();
                            A s3 = s(c2, d3, nVar);
                            if (s3 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                A s4 = s(c2, d3, i5);
                                if (s4 != null && !s3.equals(s4)) {
                                    i4 = d3;
                                    nVar3 = i5;
                                    A s5 = s(c2, c0221e2.d(), c0221e2.e());
                                    if (s5 == null) {
                                        r();
                                        throw null;
                                    }
                                    A b3 = yVar.b(s4, s3, s5);
                                    if (b3 == null) {
                                        break loop0;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(s3, b3);
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
        if (f4242c.d(iVar.d())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: id=");
        sb.append(iVar.d());
        sb.append(", disposed=");
        sb.append(iVar.f4218c);
        sb.append(", applied=");
        C0221e c0221e = iVar instanceof C0221e ? (C0221e) iVar : null;
        sb.append(c0221e != null ? Boolean.valueOf(c0221e.f4209m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f4241b) {
            l lVar = f4244e;
            i3 = lVar.f4221a > 0 ? ((int[]) lVar.f4223c)[0] : -1;
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
    public static final Object f(InterfaceC0424c interfaceC0424c) {
        Object obj;
        C0519A c0519a;
        Object v3;
        i iVar = f4249j;
        f2.j.d(iVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (f4241b) {
            try {
                obj = f4248i.get();
                c0519a = ((C0220d) obj).f4204h;
                if (c0519a != null) {
                    f4250k.addAndGet(1);
                }
                v3 = v((i) obj, interfaceC0424c);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0519a != null) {
            try {
                ?? r4 = f4246g;
                int size = r4.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC0426e) r4.get(i3)).h(new K.f(c0519a), obj);
                }
            } finally {
                f4250k.addAndGet(-1);
            }
        }
        synchronized (f4241b) {
            g();
            if (c0519a != null) {
                Object[] objArr = c0519a.f6248b;
                long[] jArr = c0519a.f6247a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j3) < 128) {
                                    q((y) objArr[(i4 << 3) + i6]);
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
        C0011l c0011l = f4245f;
        int i3 = c0011l.f421e;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            a1 a1Var = ((a1[]) c0011l.f423g)[i4];
            Object obj = a1Var != null ? a1Var.get() : null;
            if (obj != null && p((y) obj)) {
                if (i5 != i4) {
                    ((a1[]) c0011l.f423g)[i5] = a1Var;
                    int[] iArr = (int[]) c0011l.f422f;
                    iArr[i5] = iArr[i4];
                }
                i5++;
            }
            i4++;
        }
        for (int i6 = i5; i6 < i3; i6++) {
            ((a1[]) c0011l.f423g)[i6] = null;
            ((int[]) c0011l.f422f)[i6] = 0;
        }
        if (i5 != i3) {
            c0011l.f421e = i5;
        }
    }

    public static final i h(i iVar, InterfaceC0424c interfaceC0424c, boolean z3) {
        boolean z4 = iVar instanceof C0221e;
        if (z4 || iVar == null) {
            return new D(z4 ? (C0221e) iVar : null, interfaceC0424c, null, false, z3);
        }
        return new E(iVar, interfaceC0424c, z3);
    }

    public static final A i(A a3) {
        A s3;
        i k3 = k();
        A s4 = s(a3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f4241b) {
            i k4 = k();
            s3 = s(a3, k4.d(), k4.e());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final A j(A a3, i iVar) {
        A s3 = s(a3, iVar.d(), iVar.e());
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final i k() {
        i iVar = (i) f4240a.g();
        return iVar == null ? (i) f4248i.get() : iVar;
    }

    public static final InterfaceC0424c l(InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, boolean z3) {
        if (!z3) {
            interfaceC0424c2 = null;
        }
        return (interfaceC0424c == null || interfaceC0424c2 == null || interfaceC0424c == interfaceC0424c2) ? interfaceC0424c == null ? interfaceC0424c2 : interfaceC0424c : new C0218b(interfaceC0424c, interfaceC0424c2, 1);
    }

    public static final A m(A a3, y yVar) {
        A c2 = yVar.c();
        int i3 = f4243d;
        l lVar = f4244e;
        if (lVar.f4221a > 0) {
            i3 = ((int[]) lVar.f4223c)[0];
        }
        int i4 = i3 - 1;
        n nVar = n.f4232h;
        A a4 = null;
        A a5 = null;
        while (true) {
            if (c2 != null) {
                int i5 = c2.f4174a;
                if (i5 == 0) {
                    break;
                }
                if (i5 != 0 && i5 <= i4 && !nVar.d(i5)) {
                    if (a5 == null) {
                        a5 = c2;
                    } else if (c2.f4174a >= a5.f4174a) {
                        a4 = a5;
                    }
                }
                c2 = c2.f4175b;
            } else {
                break;
            }
        }
        a4 = c2;
        if (a4 != null) {
            a4.f4174a = Integer.MAX_VALUE;
            return a4;
        }
        A b3 = a3.b();
        b3.f4174a = Integer.MAX_VALUE;
        b3.f4175b = yVar.c();
        yVar.d(b3);
        return b3;
    }

    public static final void n(i iVar, y yVar) {
        iVar.s(iVar.h() + 1);
        InterfaceC0424c i3 = iVar.i();
        if (i3 != null) {
            i3.n(yVar);
        }
    }

    public static final A o(A a3, z zVar, i iVar, A a4) {
        A m3;
        if (iVar.g()) {
            iVar.n(zVar);
        }
        int d3 = iVar.d();
        if (a4.f4174a == d3) {
            return a4;
        }
        synchronized (f4241b) {
            m3 = m(a3, zVar);
        }
        m3.f4174a = d3;
        if (a4.f4174a != 1) {
            iVar.n(zVar);
        }
        return m3;
    }

    public static final boolean p(y yVar) {
        A a3;
        int i3 = f4243d;
        l lVar = f4244e;
        if (lVar.f4221a > 0) {
            i3 = ((int[]) lVar.f4223c)[0];
        }
        A a4 = null;
        A a5 = null;
        int i4 = 0;
        for (A c2 = yVar.c(); c2 != null; c2 = c2.f4175b) {
            int i5 = c2.f4174a;
            if (i5 != 0) {
                if (i5 >= i3) {
                    i4++;
                } else if (a4 == null) {
                    i4++;
                    a4 = c2;
                } else {
                    if (i5 < a4.f4174a) {
                        a3 = a4;
                        a4 = c2;
                    } else {
                        a3 = c2;
                    }
                    if (a5 == null) {
                        a5 = yVar.c();
                        A a6 = a5;
                        while (true) {
                            if (a5 == null) {
                                a5 = a6;
                                break;
                            }
                            int i6 = a5.f4174a;
                            if (i6 >= i3) {
                                break;
                            }
                            if (a6.f4174a < i6) {
                                a6 = a5;
                            }
                            a5 = a5.f4175b;
                        }
                    }
                    a4.f4174a = 0;
                    a4.a(a5);
                    a4 = a3;
                }
            }
        }
        return i4 > 1;
    }

    public static final void q(y yVar) {
        if (p(yVar)) {
            C0011l c0011l = f4245f;
            int i3 = c0011l.f421e;
            int identityHashCode = System.identityHashCode(yVar);
            int i4 = -1;
            if (i3 > 0) {
                int i5 = c0011l.f421e - 1;
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i4 = -(i6 + 1);
                        break;
                    }
                    int i7 = (i6 + i5) >>> 1;
                    int i8 = ((int[]) c0011l.f422f)[i7];
                    if (i8 < identityHashCode) {
                        i6 = i7 + 1;
                    } else if (i8 > identityHashCode) {
                        i5 = i7 - 1;
                    } else {
                        a1 a1Var = ((a1[]) c0011l.f423g)[i7];
                        if (yVar == (a1Var != null ? a1Var.get() : null)) {
                            i4 = i7;
                        } else {
                            int i9 = i7 - 1;
                            while (-1 < i9 && ((int[]) c0011l.f422f)[i9] == identityHashCode) {
                                a1 a1Var2 = ((a1[]) c0011l.f423g)[i9];
                                if ((a1Var2 != null ? a1Var2.get() : null) == yVar) {
                                    break;
                                } else {
                                    i9--;
                                }
                            }
                            int i10 = c0011l.f421e;
                            i9 = i7 + 1;
                            while (true) {
                                if (i9 >= i10) {
                                    i9 = -(c0011l.f421e + 1);
                                    break;
                                } else {
                                    if (((int[]) c0011l.f422f)[i9] != identityHashCode) {
                                        i9 = -(i9 + 1);
                                        break;
                                    }
                                    a1 a1Var3 = ((a1[]) c0011l.f423g)[i9];
                                    if ((a1Var3 != null ? a1Var3.get() : null) == yVar) {
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
            a1[] a1VarArr = (a1[]) c0011l.f423g;
            int length = a1VarArr.length;
            if (i3 == length) {
                int i12 = length * 2;
                a1[] a1VarArr2 = new a1[i12];
                int[] iArr = new int[i12];
                int i13 = i11 + 1;
                S1.k.m0(a1VarArr, a1VarArr2, i13, i11, i3);
                S1.k.o0((a1[]) c0011l.f423g, a1VarArr2, 0, i11, 6);
                S1.k.l0((int[]) c0011l.f422f, iArr, i13, i11, i3);
                S1.k.n0((int[]) c0011l.f422f, iArr, 0, i11, 6);
                c0011l.f423g = a1VarArr2;
                c0011l.f422f = iArr;
            } else {
                int i14 = i11 + 1;
                S1.k.m0(a1VarArr, a1VarArr, i14, i11, i3);
                int[] iArr2 = (int[]) c0011l.f422f;
                S1.k.l0(iArr2, iArr2, i14, i11, i3);
            }
            ((a1[]) c0011l.f423g)[i11] = new a1(yVar);
            ((int[]) c0011l.f422f)[i11] = identityHashCode;
            c0011l.f421e++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final A s(A a3, int i3, n nVar) {
        A a4 = null;
        while (a3 != null) {
            int i4 = a3.f4174a;
            if (i4 != 0 && i4 <= i3 && !nVar.d(i4) && (a4 == null || a4.f4174a < a3.f4174a)) {
                a4 = a3;
            }
            a3 = a3.f4175b;
        }
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    public static final A t(A a3, y yVar) {
        A s3;
        i k3 = k();
        InterfaceC0424c f3 = k3.f();
        if (f3 != null) {
            f3.n(yVar);
        }
        A s4 = s(a3, k3.d(), k3.e());
        if (s4 != null) {
            return s4;
        }
        synchronized (f4241b) {
            i k4 = k();
            A c2 = yVar.c();
            f2.j.d(c2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            s3 = s(c2, k4.d(), k4.e());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i3) {
        int i4;
        l lVar = f4244e;
        int i5 = ((int[]) lVar.f4225e)[i3];
        lVar.b(i5, lVar.f4221a - 1);
        lVar.f4221a--;
        int[] iArr = (int[]) lVar.f4223c;
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
        int[] iArr2 = (int[]) lVar.f4223c;
        int i9 = lVar.f4221a >> 1;
        while (i5 < i9) {
            int i10 = (i5 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < lVar.f4221a && (i4 = iArr2[i10]) < iArr2[i11]) {
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
        ((int[]) lVar.f4225e)[i3] = lVar.f4222b;
        lVar.f4222b = i3;
    }

    public static final Object v(i iVar, InterfaceC0424c interfaceC0424c) {
        Object n3 = interfaceC0424c.n(f4242c.c(iVar.d()));
        synchronized (f4241b) {
            int i3 = f4243d;
            f4243d = i3 + 1;
            n c2 = f4242c.c(iVar.d());
            f4242c = c2;
            f4248i.set(new C0220d(i3, c2));
            iVar.c();
            f4242c = f4242c.j(i3);
        }
        return n3;
    }

    public static final A w(A a3, y yVar, i iVar) {
        A s3;
        if (iVar.g()) {
            iVar.n(yVar);
        }
        int d3 = iVar.d();
        A s4 = s(a3, d3, iVar.e());
        if (s4 == null) {
            r();
            throw null;
        }
        if (s4.f4174a == iVar.d()) {
            return s4;
        }
        synchronized (f4241b) {
            s3 = s(yVar.c(), d3, iVar.e());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f4174a != d3) {
                A m3 = m(s3, yVar);
                m3.a(s3);
                m3.f4174a = iVar.d();
                s3 = m3;
            }
        }
        if (s4.f4174a != 1) {
            iVar.n(yVar);
        }
        return s3;
    }
}
