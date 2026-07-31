package I;

import S.C0220d;
import android.os.Trace;
import e2.InterfaceC0424c;
import j.C0519A;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: I.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183x0 extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0187z0 f2959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0519A f2960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0519A f2961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f2962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f2963i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0519A f2964j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2965k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0519A f2966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f2967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183x0(C0187z0 c0187z0, C0519A c0519a, C0519A c0519a2, List list, List list2, C0519A c0519a3, List list3, C0519A c0519a4, Set set) {
        super(1);
        this.f2959e = c0187z0;
        this.f2960f = c0519a;
        this.f2961g = c0519a2;
        this.f2962h = list;
        this.f2963i = list2;
        this.f2964j = c0519a3;
        this.f2965k = list3;
        this.f2966l = c0519a4;
        this.f2967m = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        boolean u3;
        C0519A c0519a;
        C0519A c0519a2;
        C0519A c0519a3;
        C0519A c0519a4;
        boolean z3;
        long longValue = ((Number) obj).longValue();
        C0187z0 c0187z0 = this.f2959e;
        synchronized (c0187z0.f2985b) {
            u3 = c0187z0.u();
        }
        boolean z4 = false;
        if (u3) {
            C0187z0 c0187z02 = this.f2959e;
            Trace.beginSection("Recomposer:animation");
            try {
                c0187z02.f2984a.c(longValue);
                synchronized (S.p.f4241b) {
                    C0519A c0519a5 = ((C0220d) S.p.f4248i.get()).f4204h;
                    if (c0519a5 != null) {
                        z3 = c0519a5.h();
                    }
                }
                if (z3) {
                    S.p.a();
                }
            } finally {
            }
        }
        C0187z0 c0187z03 = this.f2959e;
        C0519A c0519a6 = this.f2960f;
        C0519A c0519a7 = this.f2961g;
        ?? r22 = this.f2962h;
        List list = this.f2963i;
        C0519A c0519a8 = this.f2964j;
        ?? r14 = this.f2965k;
        C0519A c0519a9 = this.f2966l;
        Set set = this.f2967m;
        Trace.beginSection("Recomposer:recompose");
        try {
            C0187z0.q(c0187z03);
            synchronized (c0187z03.f2985b) {
                try {
                    K.d dVar = c0187z03.f2991h;
                    int i3 = dVar.f3216f;
                    if (i3 > 0) {
                        Object[] objArr = dVar.f3214d;
                        int i4 = 0;
                        do {
                            r22.add((C0176u) objArr[i4]);
                            i4++;
                        } while (i4 < i3);
                    }
                    c0187z03.f2991h.h();
                } finally {
                }
            }
            c0519a6.b();
            c0519a7.b();
            while (true) {
                if (r22.isEmpty() && list.isEmpty()) {
                    break;
                }
                C0519A c0519a10 = c0519a6;
                C0519A c0519a11 = c0519a7;
                try {
                    try {
                        int size = r22.size();
                        for (?? r5 = z4; r5 < size; r5++) {
                            C0176u c0176u = (C0176u) r22.get(r5);
                            c0519a = c0519a10;
                            try {
                                C0176u p3 = C0187z0.p(c0187z03, c0176u, c0519a);
                                if (p3 != null) {
                                    r14.add(p3);
                                }
                                c0519a2 = c0519a11;
                            } catch (Exception e3) {
                                e = e3;
                                c0519a2 = c0519a11;
                                C0187z0.A(c0187z03, e, true, 2);
                                C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a, c0519a2);
                                return R1.y.f4171a;
                            }
                            try {
                                c0519a2.a(c0176u);
                                c0519a10 = c0519a;
                                c0519a11 = c0519a2;
                            } catch (Exception e4) {
                                e = e4;
                                C0187z0.A(c0187z03, e, true, 2);
                                C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a, c0519a2);
                                return R1.y.f4171a;
                            }
                        }
                        c0519a6 = c0519a10;
                        c0519a7 = c0519a11;
                        r22.clear();
                        if (c0519a6.h() || c0187z03.f2991h.m()) {
                            synchronized (c0187z03.f2985b) {
                                try {
                                    ?? w2 = c0187z03.w();
                                    int size2 = w2.size();
                                    for (?? r10 = z4; r10 < size2; r10++) {
                                        C0176u c0176u2 = (C0176u) w2.get(r10);
                                        if (!c0519a7.c(c0176u2) && c0176u2.t(set)) {
                                            r22.add(c0176u2);
                                        }
                                    }
                                    K.d dVar2 = c0187z03.f2991h;
                                    int i5 = dVar2.f3216f;
                                    ?? r11 = z4;
                                    for (?? r102 = r10; r102 < i5; r102++) {
                                        C0176u c0176u3 = (C0176u) dVar2.f3214d[r102];
                                        if (!c0519a7.c(c0176u3) && !r22.contains(c0176u3)) {
                                            r22.add(c0176u3);
                                            r11++;
                                        } else if (r11 > 0) {
                                            Object[] objArr2 = dVar2.f3214d;
                                            objArr2[r102 - r11] = objArr2[r102];
                                        }
                                    }
                                    int i6 = i5 - r11;
                                    Arrays.fill(dVar2.f3214d, i6, i5, (Object) null);
                                    dVar2.f3216f = i6;
                                } finally {
                                }
                            }
                        }
                        if (r22.isEmpty()) {
                            try {
                                C0185y0.v(list, c0187z03);
                                while (!list.isEmpty()) {
                                    List y3 = c0187z03.y(list, c0519a6);
                                    c0519a8.getClass();
                                    for (Object obj2 : y3) {
                                        c0519a8.f6248b[c0519a8.d(obj2)] = obj2;
                                    }
                                    C0185y0.v(list, c0187z03);
                                }
                            } catch (Exception e5) {
                                C0187z0.A(c0187z03, e5, true, 2);
                                C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a6, c0519a7);
                            }
                        }
                        z4 = false;
                    } finally {
                        r22.clear();
                    }
                } catch (Exception e6) {
                    e = e6;
                    c0519a = c0519a10;
                }
            }
            try {
                if (!r14.isEmpty()) {
                    try {
                        int size3 = r14.size();
                        for (?? r103 = z4; r103 < size3; r103++) {
                            c0519a9.a((C0176u) r14.get(r103));
                        }
                        int size4 = r14.size();
                        for (?? r104 = z4; r104 < size4; r104++) {
                            ((C0176u) r14.get(r104)).d();
                        }
                        r14.clear();
                    } catch (Exception e7) {
                        C0187z0.A(c0187z03, e7, z4, 6);
                        C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a6, c0519a7);
                        r14.clear();
                    }
                }
                try {
                    if (c0519a8.h()) {
                        try {
                            c0519a9.i(c0519a8);
                            Object[] objArr3 = c0519a8.f6248b;
                            long[] jArr = c0519a8.f6247a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j3 = jArr[i7];
                                    c0519a3 = c0519a6;
                                    c0519a4 = c0519a7;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j3 & 255) < 128) {
                                                try {
                                                    ((C0176u) objArr3[(i7 << 3) + i9]).f();
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    C0187z0.A(c0187z03, e, false, 6);
                                                    C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a3, c0519a4);
                                                    c0519a8.b();
                                                    return R1.y.f4171a;
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
                                    c0519a6 = c0519a3;
                                    c0519a7 = c0519a4;
                                }
                            } else {
                                c0519a3 = c0519a6;
                                c0519a4 = c0519a7;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            c0519a3 = c0519a6;
                            c0519a4 = c0519a7;
                        }
                    } else {
                        c0519a3 = c0519a6;
                        c0519a4 = c0519a7;
                    }
                    if (c0519a9.h()) {
                        try {
                            try {
                                Object[] objArr4 = c0519a9.f6248b;
                                long[] jArr2 = c0519a9.f6247a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr2[i10];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            long j5 = j4;
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j5 & 255) < 128) {
                                                    ((C0176u) objArr4[(i10 << 3) + i12]).g();
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            } catch (Exception e10) {
                                C0187z0.A(c0187z03, e10, false, 6);
                                C0185y0.s(c0187z03, r22, list, r14, c0519a8, c0519a9, c0519a3, c0519a4);
                                c0519a9.b();
                            }
                        } finally {
                            c0519a9.b();
                        }
                    }
                    synchronized (c0187z03.f2985b) {
                        c0187z03.t();
                    }
                    S.p.k().m();
                    c0519a4.b();
                    c0519a3.b();
                    c0187z03.f2997n = null;
                    return R1.y.f4171a;
                } finally {
                    c0519a8.b();
                }
            } finally {
                r14.clear();
            }
        } finally {
        }
    }
}
