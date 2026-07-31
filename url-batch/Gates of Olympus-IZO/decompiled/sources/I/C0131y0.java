package I;

import android.os.Trace;
import j.C0475A;
import java.util.List;
import java.util.Set;

/* renamed from: I.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131y0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0 f2403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0475A f2404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0475A f2405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f2406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2407i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0475A f2408j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2409k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0475A f2410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f2411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131y0(A0 a02, C0475A c0475a, C0475A c0475a2, List list, List list2, C0475A c0475a3, List list3, C0475A c0475a4, Set set) {
        super(1);
        this.f2403e = a02;
        this.f2404f = c0475a;
        this.f2405g = c0475a2;
        this.f2406h = list;
        this.f2407i = list2;
        this.f2408j = c0475a3;
        this.f2409k = list3;
        this.f2410l = c0475a4;
        this.f2411m = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // Y1.c
    public final Object j(Object obj) {
        boolean u3;
        C0475A c0475a;
        C0475A c0475a2;
        A0 a02;
        C0475A c0475a3;
        C0475A c0475a4;
        A0 a03;
        A0 a04;
        char c3;
        boolean z3;
        long longValue = ((Number) obj).longValue();
        A0 a05 = this.f2403e;
        synchronized (a05.f2061b) {
            u3 = a05.u();
        }
        boolean z4 = false;
        if (u3) {
            A0 a06 = this.f2403e;
            Trace.beginSection("Recomposer:animation");
            try {
                a06.f2060a.c(longValue);
                synchronized (S.q.f3235b) {
                    C0475A c0475a5 = ((S.d) S.q.f3242i.get()).f3197h;
                    if (c0475a5 != null) {
                        z3 = c0475a5.h();
                    }
                }
                if (z3) {
                    S.q.a();
                }
            } finally {
            }
        }
        A0 a07 = this.f2403e;
        C0475A c0475a6 = this.f2404f;
        C0475A c0475a7 = this.f2405g;
        ?? r22 = this.f2406h;
        List list = this.f2407i;
        C0475A c0475a8 = this.f2408j;
        ?? r14 = this.f2409k;
        C0475A c0475a9 = this.f2410l;
        Set set = this.f2411m;
        Trace.beginSection("Recomposer:recompose");
        try {
            A0.q(a07);
            synchronized (a07.f2061b) {
                try {
                    K.d dVar = a07.f2067h;
                    int i3 = dVar.f2642f;
                    if (i3 > 0) {
                        Object[] objArr = dVar.f2640d;
                        int i4 = 0;
                        do {
                            r22.add((C0122u) objArr[i4]);
                            i4++;
                        } while (i4 < i3);
                    }
                    a07.f2067h.h();
                } finally {
                }
            }
            c0475a6.b();
            c0475a7.b();
        } finally {
        }
        while (true) {
            if (r22.isEmpty() && list.isEmpty()) {
                break;
            }
            A0 a08 = a07;
            C0475A c0475a10 = c0475a6;
            C0475A c0475a11 = c0475a7;
            try {
                try {
                    int size = r22.size();
                    for (?? r6 = z4; r6 < size; r6++) {
                        C0122u c0122u = (C0122u) r22.get(r6);
                        c0475a = c0475a10;
                        try {
                            C0122u p = A0.p(a08, c0122u, c0475a);
                            if (p != null) {
                                r14.add(p);
                            }
                            c0475a2 = c0475a11;
                        } catch (Exception e3) {
                            e = e3;
                            c0475a2 = c0475a11;
                            A0.A(a08, e, true, 2);
                            C0133z0.k(a08, r22, list, r14, c0475a8, c0475a9, c0475a, c0475a2);
                            return L1.z.f2729a;
                        }
                        try {
                            c0475a2.a(c0122u);
                            c0475a10 = c0475a;
                            c0475a11 = c0475a2;
                        } catch (Exception e4) {
                            e = e4;
                            A0.A(a08, e, true, 2);
                            C0133z0.k(a08, r22, list, r14, c0475a8, c0475a9, c0475a, c0475a2);
                            return L1.z.f2729a;
                        }
                    }
                    c0475a6 = c0475a10;
                    c0475a7 = c0475a11;
                    r22.clear();
                    if (c0475a6.h() || a08.f2067h.m()) {
                        synchronized (a08.f2061b) {
                            try {
                                ?? w3 = a08.w();
                                int size2 = w3.size();
                                for (?? r10 = z4; r10 < size2; r10++) {
                                    C0122u c0122u2 = (C0122u) w3.get(r10);
                                    if (!c0475a7.c(c0122u2) && c0122u2.t(set)) {
                                        r22.add(c0122u2);
                                    }
                                }
                                K.d dVar2 = a08.f2067h;
                                int i5 = dVar2.f2642f;
                                ?? r11 = z4;
                                for (?? r102 = r10; r102 < i5; r102++) {
                                    C0122u c0122u3 = (C0122u) dVar2.f2640d[r102];
                                    if (!c0475a7.c(c0122u3) && !r22.contains(c0122u3)) {
                                        r22.add(c0122u3);
                                        r11++;
                                    } else if (r11 > 0) {
                                        Object[] objArr2 = dVar2.f2640d;
                                        objArr2[r102 - r11] = objArr2[r102];
                                    }
                                }
                                int i6 = i5 - r11;
                                M1.k.c0(dVar2.f2640d, i6, i5);
                                dVar2.f2642f = i6;
                            } finally {
                            }
                        }
                    }
                    if (r22.isEmpty()) {
                        try {
                            C0133z0.l(list, a08);
                            while (!list.isEmpty()) {
                                List y3 = a08.y(list, c0475a6);
                                c0475a8.getClass();
                                for (Object obj2 : y3) {
                                    c0475a8.f5130b[c0475a8.d(obj2)] = obj2;
                                }
                                C0133z0.l(list, a08);
                            }
                        } catch (Exception e5) {
                            A0.A(a08, e5, true, 2);
                            C0133z0.k(a08, r22, list, r14, c0475a8, c0475a9, c0475a6, c0475a7);
                        }
                    }
                    a07 = a08;
                    z4 = false;
                } finally {
                    r22.clear();
                }
            } catch (Exception e6) {
                e = e6;
                c0475a = c0475a10;
            }
        }
        try {
            if (!r14.isEmpty()) {
                try {
                    int size3 = r14.size();
                    for (?? r9 = z4; r9 < size3; r9++) {
                        c0475a9.a((C0122u) r14.get(r9));
                    }
                    int size4 = r14.size();
                    for (?? r92 = z4; r92 < size4; r92++) {
                        ((C0122u) r14.get(r92)).d();
                    }
                    r14.clear();
                } catch (Exception e7) {
                    A0.A(a07, e7, z4, 6);
                    C0133z0.k(a07, r22, list, r14, c0475a8, c0475a9, c0475a6, c0475a7);
                    r14.clear();
                }
            }
            if (c0475a8.h()) {
                try {
                    try {
                        c0475a9.i(c0475a8);
                        Object[] objArr3 = c0475a8.f5130b;
                        long[] jArr = c0475a8.f5129a;
                        int length = jArr.length - 2;
                        a02 = a07;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                try {
                                    long j3 = jArr[i7];
                                    c0475a3 = c0475a6;
                                    c0475a4 = c0475a7;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j3 & 255) < 128) {
                                                try {
                                                    ((C0122u) objArr3[(i7 << 3) + i9]).f();
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    A0 a09 = a02;
                                                    A0.A(a09, e, false, 6);
                                                    C0133z0.k(a09, r22, list, r14, c0475a8, c0475a9, c0475a3, c0475a4);
                                                    c0475a8.b();
                                                    return L1.z.f2729a;
                                                }
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i7 == length) {
                                        break;
                                    }
                                    i7++;
                                    c0475a6 = c0475a3;
                                    c0475a7 = c0475a4;
                                } catch (Exception e9) {
                                    e = e9;
                                    c0475a3 = c0475a6;
                                    c0475a4 = c0475a7;
                                    A0 a092 = a02;
                                    A0.A(a092, e, false, 6);
                                    C0133z0.k(a092, r22, list, r14, c0475a8, c0475a9, c0475a3, c0475a4);
                                    c0475a8.b();
                                    return L1.z.f2729a;
                                }
                            }
                        } else {
                            c0475a3 = c0475a6;
                            c0475a4 = c0475a7;
                        }
                        a03 = a02;
                    } catch (Exception e10) {
                        e = e10;
                        a02 = a07;
                    }
                } finally {
                    c0475a8.b();
                }
            } else {
                a03 = a07;
                c0475a3 = c0475a6;
                c0475a4 = c0475a7;
            }
            if (c0475a9.h()) {
                try {
                    try {
                        Object[] objArr4 = c0475a9.f5130b;
                        long[] jArr2 = c0475a9.f5129a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j4 = jArr2[i10];
                                a04 = a03;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((j4 & 255) < 128) {
                                            try {
                                                ((C0122u) objArr4[(i10 << 3) + i12]).g();
                                            } catch (Exception e11) {
                                                e = e11;
                                                a03 = a04;
                                                A0.A(a03, e, false, 6);
                                                C0133z0.k(a03, r22, list, r14, c0475a8, c0475a9, c0475a3, c0475a4);
                                                c0475a9.b();
                                                return L1.z.f2729a;
                                            }
                                        }
                                        j4 >>= 8;
                                    }
                                    c3 = '\b';
                                    if (i11 != 8) {
                                        break;
                                    }
                                } else {
                                    c3 = '\b';
                                }
                                if (i10 == length2) {
                                    break;
                                }
                                i10++;
                                a03 = a04;
                            }
                        } else {
                            a04 = a03;
                        }
                        a03 = a04;
                    } catch (Exception e12) {
                        e = e12;
                    }
                } finally {
                    c0475a9.b();
                }
            }
            synchronized (a03.f2061b) {
                a03.t();
            }
            S.q.k().m();
            c0475a4.b();
            c0475a3.b();
            a03.f2073n = null;
            return L1.z.f2729a;
        } finally {
            r14.clear();
        }
    }
}
