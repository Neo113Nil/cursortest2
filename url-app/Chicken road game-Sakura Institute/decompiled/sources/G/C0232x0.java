package G;

import Q.C0268d;
import android.os.Trace;
import i.C0661B;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* renamed from: G.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232x0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0236z0 f2957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0661B f2958e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0661B f2959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f2960j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2961k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0661B f2962l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f2963m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0661B f2964n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Set f2965o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232x0(C0236z0 c0236z0, C0661B c0661b, C0661B c0661b2, List list, List list2, C0661B c0661b3, List list3, C0661B c0661b4, Set set) {
        super(1);
        this.f2957d = c0236z0;
        this.f2958e = c0661b;
        this.f2959i = c0661b2;
        this.f2960j = list;
        this.f2961k = list2;
        this.f2962l = c0661b3;
        this.f2963m = list3;
        this.f2964n = c0661b4;
        this.f2965o = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean u4;
        int i2;
        C0236z0 c0236z0;
        List list;
        C0236z0 c0236z02;
        int i4;
        boolean z4;
        int i5 = 1;
        long longValue = ((Number) obj).longValue();
        C0236z0 c0236z03 = this.f2957d;
        synchronized (c0236z03.f2983b) {
            u4 = c0236z03.u();
        }
        if (u4) {
            C0236z0 c0236z04 = this.f2957d;
            Trace.beginSection("Recomposer:animation");
            try {
                c0236z04.f2982a.c(longValue);
                synchronized (Q.q.f3878b) {
                    C0661B c0661b = ((C0268d) Q.q.f3885i.get()).f3839h;
                    if (c0661b != null) {
                        z4 = c0661b.h();
                    }
                }
                if (z4) {
                    Q.q.a();
                }
                Unit unit = Unit.f7487a;
            } finally {
            }
        }
        C0236z0 c0236z05 = this.f2957d;
        C0661B c0661b2 = this.f2958e;
        C0661B c0661b3 = this.f2959i;
        List list2 = this.f2960j;
        List list3 = this.f2961k;
        C0661B c0661b4 = this.f2962l;
        List list4 = this.f2963m;
        C0661B c0661b5 = this.f2964n;
        Set set = this.f2965o;
        Trace.beginSection("Recomposer:recompose");
        try {
            C0236z0.q(c0236z05);
            synchronized (c0236z05.f2983b) {
                try {
                    I.d dVar = c0236z05.f2989h;
                    int i6 = dVar.f3332i;
                    if (i6 > 0) {
                        Object[] objArr = dVar.f3330d;
                        int i7 = 0;
                        do {
                            list2.add((C0225u) objArr[i7]);
                            i7++;
                        } while (i7 < i6);
                    }
                    c0236z05.f2989h.g();
                    Unit unit2 = Unit.f7487a;
                } finally {
                }
            }
            c0661b2.b();
            c0661b3.b();
            while (true) {
                if (list2.isEmpty() && list3.isEmpty()) {
                    break;
                }
                C0236z0 c0236z06 = c0236z05;
                List list5 = list3;
                try {
                    try {
                        int size = list2.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            C0225u c0225u = (C0225u) list2.get(i8);
                            C0225u p4 = C0236z0.p(c0236z06, c0225u, c0661b2);
                            if (p4 != null) {
                                list4.add(p4);
                                Unit unit3 = Unit.f7487a;
                            }
                            c0661b3.a(c0225u);
                        }
                        list2.clear();
                        if (c0661b2.h() || c0236z06.f2989h.l()) {
                            synchronized (c0236z06.f2983b) {
                                try {
                                    List w4 = c0236z06.w();
                                    int size2 = w4.size();
                                    for (int i9 = 0; i9 < size2; i9++) {
                                        C0225u c0225u2 = (C0225u) w4.get(i9);
                                        if (!c0661b3.c(c0225u2) && c0225u2.t(set)) {
                                            list2.add(c0225u2);
                                        }
                                    }
                                    I.d dVar2 = c0236z06.f2989h;
                                    int i10 = dVar2.f3332i;
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (i11 < i10) {
                                        C0225u c0225u3 = (C0225u) dVar2.f3330d[i11];
                                        if (c0661b3.c(c0225u3) || list2.contains(c0225u3)) {
                                            if (i12 > 0) {
                                                Object[] objArr2 = dVar2.f3330d;
                                                objArr2[i11 - i12] = objArr2[i11];
                                            }
                                            i2 = 1;
                                        } else {
                                            list2.add(c0225u3);
                                            i2 = 1;
                                            i12++;
                                        }
                                        i11 += i2;
                                    }
                                    int i13 = i10 - i12;
                                    C1436t.k(dVar2.f3330d, i13, i10);
                                    dVar2.f3332i = i13;
                                    Unit unit4 = Unit.f7487a;
                                } finally {
                                }
                            }
                        }
                        if (list2.isEmpty()) {
                            try {
                                C0234y0.q(list5, c0236z06);
                                while (!list5.isEmpty()) {
                                    List elements = c0236z06.y(list5, c0661b2);
                                    c0661b4.getClass();
                                    Intrinsics.checkNotNullParameter(elements, "elements");
                                    for (Object obj2 : elements) {
                                        c0661b4.f6885b[c0661b4.d(obj2)] = obj2;
                                    }
                                    C0234y0.q(list5, c0236z06);
                                }
                                list3 = list5;
                                c0236z05 = c0236z06;
                                i5 = 1;
                            } catch (Exception e4) {
                                C0236z0.A(c0236z06, e4, true, 2);
                                C0234y0.o(c0236z06, list2, list5, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                            }
                        } else {
                            c0236z05 = c0236z06;
                            list3 = list5;
                            i5 = 1;
                        }
                    } catch (Exception e5) {
                        C0236z0.A(c0236z06, e5, true, 2);
                        C0234y0.o(c0236z06, list2, list5, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                        list2.clear();
                    }
                } finally {
                    list2.clear();
                }
            }
            try {
                if (!list4.isEmpty()) {
                    try {
                        int size3 = list4.size();
                        for (int i14 = 0; i14 < size3; i14 += i5) {
                            c0661b5.a((C0225u) list4.get(i14));
                        }
                        int size4 = list4.size();
                        for (int i15 = 0; i15 < size4; i15 += i5) {
                            ((C0225u) list4.get(i15)).d();
                        }
                        list4.clear();
                    } catch (Exception e6) {
                        C0236z0.A(c0236z05, e6, false, 6);
                        C0234y0.o(c0236z05, list2, list3, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                        list4.clear();
                    }
                }
                char c4 = 7;
                if (c0661b4.h()) {
                    try {
                        try {
                            c0661b5.i(c0661b4);
                            Object[] objArr3 = c0661b4.f6885b;
                            long[] jArr = c0661b4.f6884a;
                            int length = jArr.length - 2;
                            c0236z0 = c0236z05;
                            if (length >= 0) {
                                int i16 = 0;
                                while (true) {
                                    try {
                                        long j4 = jArr[i16];
                                        list = list3;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8 - ((~(i16 - length)) >>> 31);
                                            long j5 = j4;
                                            for (int i18 = 0; i18 < i17; i18++) {
                                                if ((j5 & 255) < 128) {
                                                    try {
                                                        ((C0225u) objArr3[(i16 << 3) + i18]).f();
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        C0236z0 c0236z07 = c0236z0;
                                                        C0236z0.A(c0236z07, e, false, 6);
                                                        C0234y0.o(c0236z07, list2, list, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                                                        c0661b4.b();
                                                        return Unit.f7487a;
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            i4 = 1;
                                            if (i17 != 8) {
                                                break;
                                            }
                                        } else {
                                            i4 = 1;
                                        }
                                        if (i16 == length) {
                                            break;
                                        }
                                        i16 += i4;
                                        list3 = list;
                                    } catch (Exception e8) {
                                        e = e8;
                                        list = list3;
                                        C0236z0 c0236z072 = c0236z0;
                                        C0236z0.A(c0236z072, e, false, 6);
                                        C0234y0.o(c0236z072, list2, list, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                                        c0661b4.b();
                                        return Unit.f7487a;
                                    }
                                }
                            } else {
                                list = list3;
                            }
                            c0236z02 = c0236z0;
                        } catch (Exception e9) {
                            e = e9;
                            c0236z0 = c0236z05;
                        }
                    } finally {
                        c0661b4.b();
                    }
                } else {
                    c0236z02 = c0236z05;
                    list = list3;
                }
                if (c0661b5.h()) {
                    try {
                        try {
                            Object[] objArr4 = c0661b5.f6885b;
                            long[] jArr2 = c0661b5.f6884a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j6 = jArr2[i19];
                                    long[] jArr3 = jArr2;
                                    if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j6 & 255) < 128) {
                                                ((C0225u) objArr4[(i19 << 3) + i21]).g();
                                            }
                                            j6 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    if (i19 == length2) {
                                        break;
                                    }
                                    i19++;
                                    jArr2 = jArr3;
                                    c4 = 7;
                                }
                            }
                        } catch (Exception e10) {
                            C0236z0.A(c0236z02, e10, false, 6);
                            C0234y0.o(c0236z02, list2, list, list4, c0661b4, c0661b5, c0661b2, c0661b3);
                            c0661b5.b();
                        }
                    } finally {
                        c0661b5.b();
                    }
                }
                synchronized (c0236z02.f2983b) {
                    c0236z02.t();
                }
                Q.q.k().m();
                c0661b3.b();
                c0661b2.b();
                c0236z02.f2995n = null;
                Unit unit5 = Unit.f7487a;
                return Unit.f7487a;
            } finally {
                list4.clear();
            }
        } finally {
        }
    }
}
