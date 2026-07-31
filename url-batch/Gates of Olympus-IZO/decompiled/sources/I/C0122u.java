package I;

import D1.C0014b;
import J.C0134a;
import android.os.Trace;
import g2.C0411g;
import j.C0475A;
import j.C0498p;
import j.C0503u;
import j.C0506x;
import j.C0508z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: I.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122u implements InterfaceC0115q {

    /* renamed from: d, reason: collision with root package name */
    public final r f2367d;

    /* renamed from: e, reason: collision with root package name */
    public final C0014b f2368e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2369f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final Object f2370g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final C0508z f2371h;

    /* renamed from: i, reason: collision with root package name */
    public final G0 f2372i;

    /* renamed from: j, reason: collision with root package name */
    public final A2.g f2373j;

    /* renamed from: k, reason: collision with root package name */
    public final C0475A f2374k;

    /* renamed from: l, reason: collision with root package name */
    public final C0475A f2375l;

    /* renamed from: m, reason: collision with root package name */
    public final A2.g f2376m;

    /* renamed from: n, reason: collision with root package name */
    public final C0134a f2377n;

    /* renamed from: o, reason: collision with root package name */
    public final C0134a f2378o;
    public final A2.g p;

    /* renamed from: q, reason: collision with root package name */
    public A2.g f2379q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2380r;

    /* renamed from: s, reason: collision with root package name */
    public final C0128x f2381s;

    /* renamed from: t, reason: collision with root package name */
    public final C0113p f2382t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2383u;

    public C0122u(r rVar, C0014b c0014b) {
        this.f2367d = rVar;
        this.f2368e = c0014b;
        C0508z c0508z = new C0508z(new C0475A());
        this.f2371h = c0508z;
        G0 g02 = new G0();
        if (rVar.c()) {
            g02.f2127m = new C0498p();
        }
        if (rVar.e()) {
            g02.c();
        }
        this.f2372i = g02;
        this.f2373j = new A2.g(12);
        this.f2374k = new C0475A();
        this.f2375l = new C0475A();
        this.f2376m = new A2.g(12);
        C0134a c0134a = new C0134a();
        this.f2377n = c0134a;
        C0134a c0134a2 = new C0134a();
        this.f2378o = c0134a2;
        this.p = new A2.g(12);
        this.f2379q = new A2.g(12);
        C0128x c0128x = new C0128x();
        c0128x.f2395a = false;
        this.f2381s = c0128x;
        C0113p c0113p = new C0113p(c0014b, rVar, g02, c0508z, c0134a, c0134a2, this);
        rVar.k(c0113p);
        this.f2382t = c0113p;
        boolean z3 = rVar instanceof A0;
        Q.a aVar = AbstractC0099i.f2262a;
    }

    public final void a() {
        this.f2369f.set(null);
        this.f2377n.f2537f.U();
        this.f2378o.f2537f.U();
        C0508z c0508z = this.f2371h;
        if (c0508z.f5243d.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c0508z.f5243d.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0508z.iterator();
            while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                ((O.c) it).remove();
                b02.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z3) {
        int i3;
        Object e3 = ((C0506x) this.f2373j.f83b).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z4 = e3 instanceof C0475A;
        C0475A c0475a = this.f2374k;
        C0475A c0475a2 = this.f2375l;
        A2.g gVar = this.p;
        if (!z4) {
            C0119s0 c0119s0 = (C0119s0) e3;
            if (gVar.q(obj, c0119s0) || c0119s0.c(obj) == 1) {
                return;
            }
            if (c0119s0.f2350g == null || z3) {
                c0475a.a(c0119s0);
                return;
            } else {
                c0475a2.a(c0119s0);
                return;
            }
        }
        C0475A c0475a3 = (C0475A) e3;
        Object[] objArr = c0475a3.f5130b;
        long[] jArr = c0475a3.f5129a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j3 = jArr[i4];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j3 & 255) < 128) {
                        C0119s0 c0119s02 = (C0119s0) objArr[(i4 << 3) + i7];
                        if (!gVar.q(obj, c0119s02) && c0119s02.c(obj) != 1) {
                            if (c0119s02.f2350g == null || z3) {
                                c0475a.a(c0119s02);
                            } else {
                                c0475a2.a(c0119s02);
                            }
                        }
                        i3 = 8;
                    } else {
                        i3 = i5;
                    }
                    j3 >>= i3;
                    i7++;
                    i5 = i3;
                }
                if (i6 != i5) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void c(Set set, boolean z3) {
        A2.g gVar;
        int i3;
        long[] jArr;
        String str;
        long[] jArr2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean c3;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        int i7;
        String str5;
        long[] jArr4;
        int i8;
        int i9;
        long j3;
        boolean z4;
        long[] jArr5;
        Object[] objArr3;
        long[] jArr6;
        Object[] objArr4;
        Object[] objArr5;
        A2.g gVar2;
        Object[] objArr6;
        A2.g gVar3;
        int i10;
        int i11;
        int i12;
        boolean z5 = set instanceof K.f;
        A2.g gVar4 = this.f2376m;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        int i13 = 8;
        if (z5) {
            C0475A c0475a = ((K.f) set).f2653d;
            Object[] objArr7 = c0475a.f5130b;
            long[] jArr7 = c0475a.f5129a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j5 = jArr7[i14];
                    if ((((~j5) << c4) & j5 & j4) != j4) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & 255) < 128) {
                                Object obj = objArr7[(i14 << 3) + i16];
                                if (obj instanceof C0119s0) {
                                    ((C0119s0) obj).c(null);
                                } else {
                                    b(obj, z3);
                                    Object e3 = ((C0506x) gVar4.f83b).e(obj);
                                    if (e3 != null) {
                                        if (e3 instanceof C0475A) {
                                            C0475A c0475a2 = (C0475A) e3;
                                            Object[] objArr8 = c0475a2.f5130b;
                                            long[] jArr8 = c0475a2.f5129a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                gVar3 = gVar4;
                                                int i17 = 0;
                                                while (true) {
                                                    long j6 = jArr8[i17];
                                                    i10 = i15;
                                                    i11 = i16;
                                                    if ((((~j6) << c4) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                            if ((j6 & 255) < 128) {
                                                                b((G) objArr8[(i17 << 3) + i19], z3);
                                                            }
                                                            j6 >>= 8;
                                                        }
                                                        if (i18 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i17 == length2) {
                                                        break;
                                                    }
                                                    i17++;
                                                    i15 = i10;
                                                    i16 = i11;
                                                    c4 = 7;
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            gVar3 = gVar4;
                                            i10 = i15;
                                            i11 = i16;
                                            b((G) e3, z3);
                                        }
                                        i12 = 8;
                                    }
                                }
                                objArr6 = objArr7;
                                gVar3 = gVar4;
                                i10 = i15;
                                i11 = i16;
                                i12 = 8;
                            } else {
                                objArr6 = objArr7;
                                gVar3 = gVar4;
                                i10 = i15;
                                i11 = i16;
                                i12 = i13;
                            }
                            j5 >>= i12;
                            i16 = i11 + 1;
                            i13 = i12;
                            gVar4 = gVar3;
                            i15 = i10;
                            c4 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        gVar2 = gVar4;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        gVar2 = gVar4;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    objArr7 = objArr5;
                    gVar4 = gVar2;
                    c4 = 7;
                    j4 = -9187201950435737472L;
                    i13 = 8;
                }
            }
        } else {
            A2.g gVar5 = gVar4;
            for (Object obj2 : set) {
                if (obj2 instanceof C0119s0) {
                    ((C0119s0) obj2).c(null);
                    gVar = gVar5;
                } else {
                    b(obj2, z3);
                    gVar = gVar5;
                    Object e4 = ((C0506x) gVar.f83b).e(obj2);
                    if (e4 != null) {
                        if (e4 instanceof C0475A) {
                            C0475A c0475a3 = (C0475A) e4;
                            Object[] objArr9 = c0475a3.f5130b;
                            long[] jArr9 = c0475a3.f5129a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j7 = jArr9[i3];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i3 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j7 & 255) < 128) {
                                                b((G) objArr9[(i3 << 3) + i21], z3);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i3 = i3 != length3 ? i3 + 1 : 0;
                                }
                            }
                        } else {
                            b((G) e4, z3);
                        }
                    }
                }
                gVar5 = gVar;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        A2.g gVar6 = this.f2373j;
        C0475A c0475a4 = this.f2374k;
        if (z3) {
            C0475A c0475a5 = this.f2375l;
            if (c0475a5.h()) {
                C0506x c0506x = (C0506x) gVar6.f83b;
                long[] jArr10 = c0506x.f5226a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j8 = jArr10[i22];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j8 & 255) < 128) {
                                    int i25 = (i22 << 3) + i24;
                                    Object obj3 = c0506x.f5227b[i25];
                                    Object obj4 = c0506x.f5228c[i25];
                                    if (obj4 instanceof C0475A) {
                                        Z1.i.d(obj4, str6);
                                        C0475A c0475a6 = (C0475A) obj4;
                                        Object[] objArr10 = c0475a6.f5130b;
                                        long[] jArr11 = c0475a6.f5129a;
                                        jArr4 = jArr10;
                                        int length5 = jArr11.length - 2;
                                        str5 = str6;
                                        i8 = length4;
                                        i9 = i22;
                                        if (length5 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                long j9 = jArr11[i26];
                                                j3 = j8;
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    int i28 = 0;
                                                    while (i28 < i27) {
                                                        if ((j9 & 255) < 128) {
                                                            jArr6 = jArr11;
                                                            int i29 = (i26 << 3) + i28;
                                                            objArr4 = objArr10;
                                                            C0119s0 c0119s0 = (C0119s0) objArr10[i29];
                                                            if (c0475a5.c(c0119s0) || c0475a4.c(c0119s0)) {
                                                                c0475a6.k(i29);
                                                            }
                                                        } else {
                                                            jArr6 = jArr11;
                                                            objArr4 = objArr10;
                                                        }
                                                        j9 >>= 8;
                                                        i28++;
                                                        jArr11 = jArr6;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                    if (i27 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr11;
                                                    objArr3 = objArr10;
                                                }
                                                if (i26 == length5) {
                                                    break;
                                                }
                                                i26++;
                                                j8 = j3;
                                                jArr11 = jArr5;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j3 = j8;
                                        }
                                        z4 = c0475a6.g();
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr10;
                                        i8 = length4;
                                        i9 = i22;
                                        j3 = j8;
                                        Z1.i.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        C0119s0 c0119s02 = (C0119s0) obj4;
                                        z4 = c0475a5.c(c0119s02) || c0475a4.c(c0119s02);
                                    }
                                    if (z4) {
                                        c0506x.h(i25);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr10;
                                    i8 = length4;
                                    i9 = i22;
                                    j3 = j8;
                                }
                                j8 = j3 >> 8;
                                i24++;
                                length4 = i8;
                                jArr10 = jArr4;
                                str6 = str5;
                                i22 = i9;
                            }
                            str4 = str6;
                            jArr3 = jArr10;
                            int i30 = length4;
                            int i31 = i22;
                            if (i23 != 8) {
                                break;
                            }
                            length4 = i30;
                            i7 = i31;
                        } else {
                            str4 = str6;
                            jArr3 = jArr10;
                            i7 = i22;
                        }
                        if (i7 == length4) {
                            break;
                        }
                        i22 = i7 + 1;
                        jArr10 = jArr3;
                        str6 = str4;
                    }
                }
                c0475a5.b();
                h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (c0475a4.h()) {
            C0506x c0506x2 = (C0506x) gVar6.f83b;
            long[] jArr12 = c0506x2.f5226a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j10 = jArr12[i32];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j10 & 255) < 128) {
                                int i35 = (i32 << 3) + i34;
                                Object obj5 = c0506x2.f5227b[i35];
                                Object obj6 = c0506x2.f5228c[i35];
                                if (obj6 instanceof C0475A) {
                                    String str8 = str7;
                                    Z1.i.d(obj6, str8);
                                    C0475A c0475a7 = (C0475A) obj6;
                                    Object[] objArr11 = c0475a7.f5130b;
                                    long[] jArr13 = c0475a7.f5129a;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i6 = i34;
                                    if (length7 >= 0) {
                                        int i36 = 0;
                                        while (true) {
                                            long j11 = jArr13[i36];
                                            long[] jArr14 = jArr13;
                                            i5 = i33;
                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j11 & 255) < 128) {
                                                        str3 = str8;
                                                        int i39 = (i36 << 3) + i38;
                                                        objArr2 = objArr11;
                                                        if (c0475a4.c((C0119s0) objArr11[i39])) {
                                                            c0475a7.k(i39);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j11 >>= 8;
                                                    i38++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i36 == length7) {
                                                break;
                                            }
                                            i36++;
                                            i33 = i5;
                                            jArr13 = jArr14;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i5 = i33;
                                    }
                                    c3 = c0475a7.g();
                                } else {
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i5 = i33;
                                    str2 = str7;
                                    i6 = i34;
                                    Z1.i.d(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c3 = c0475a4.c((C0119s0) obj6);
                                }
                                if (c3) {
                                    c0506x2.h(i35);
                                }
                            } else {
                                jArr2 = jArr12;
                                i4 = i32;
                                i5 = i33;
                                str2 = str7;
                                i6 = i34;
                            }
                            j10 >>= 8;
                            i34 = i6 + 1;
                            i32 = i4;
                            jArr12 = jArr2;
                            i33 = i5;
                            str7 = str2;
                        }
                        jArr = jArr12;
                        int i40 = i32;
                        str = str7;
                        if (i33 != 8) {
                            break;
                        } else {
                            i32 = i40;
                        }
                    } else {
                        jArr = jArr12;
                        str = str7;
                    }
                    if (i32 == length6) {
                        break;
                    }
                    i32++;
                    jArr12 = jArr;
                    str7 = str;
                }
            }
            h();
            c0475a4.b();
        }
    }

    public final void d() {
        synchronized (this.f2370g) {
            try {
                e(this.f2377n);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2371h.f5243d.g()) {
                            C0508z c0508z = this.f2371h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0508z.f5243d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0508z.iterator();
                                    while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                        B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                        ((O.c) it).remove();
                                        b02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0134a c0134a) {
        C0120t c0120t;
        long[] jArr;
        int i3;
        C0120t c0120t2;
        long[] jArr2;
        int i4;
        int i5;
        char c3;
        long j3;
        int i6;
        boolean z3;
        long[] jArr3;
        long[] jArr4;
        C0014b c0014b = this.f2368e;
        C0134a c0134a2 = this.f2378o;
        C0120t c0120t3 = new C0120t(this.f2371h);
        try {
            if (c0134a.f2537f.W()) {
                if (c0134a2.f2537f.W()) {
                    c0120t3.d();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    I0 i7 = this.f2372i.i();
                    int i8 = 0;
                    try {
                        c0134a.f2537f.V(c0014b, i7, c0120t3);
                        i7.e(true);
                        c0014b.r();
                        Trace.endSection();
                        c0120t3.e();
                        ArrayList arrayList = (ArrayList) c0120t3.f2355e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    ((Y1.a) arrayList.get(i9)).b();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.f2380r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f2380r = false;
                                C0506x c0506x = (C0506x) this.f2373j.f83b;
                                long[] jArr5 = c0506x.f5226a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr5[i10];
                                        char c4 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = i8;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    int i14 = (i10 << 3) + i13;
                                                    Object obj = c0506x.f5227b[i14];
                                                    Object obj2 = c0506x.f5228c[i14];
                                                    if (obj2 instanceof C0475A) {
                                                        Z1.i.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        C0475A c0475a = (C0475A) obj2;
                                                        Object[] objArr = c0475a.f5130b;
                                                        long[] jArr6 = c0475a.f5129a;
                                                        int length2 = jArr6.length - 2;
                                                        c0120t2 = c0120t3;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr6[i15];
                                                                    i4 = length;
                                                                    i5 = i10;
                                                                    c3 = 7;
                                                                    j3 = -9187201950435737472L;
                                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                        int i17 = 0;
                                                                        while (i17 < i16) {
                                                                            if ((j6 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i18 = (i15 << 3) + i17;
                                                                                if (!((C0119s0) objArr[i18]).b()) {
                                                                                    c0475a.k(i18);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j6 >>= 8;
                                                                            i17++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i16 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i15 == length2) {
                                                                        break;
                                                                    }
                                                                    i15++;
                                                                    length = i4;
                                                                    i10 = i5;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i4 = length;
                                                            i5 = i10;
                                                            j3 = -9187201950435737472L;
                                                            c3 = 7;
                                                        }
                                                        z3 = c0475a.g();
                                                    } else {
                                                        c0120t2 = c0120t3;
                                                        jArr2 = jArr5;
                                                        i4 = length;
                                                        i5 = i10;
                                                        c3 = c4;
                                                        j3 = -9187201950435737472L;
                                                        Z1.i.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        z3 = !((C0119s0) obj2).b();
                                                    }
                                                    if (z3) {
                                                        c0506x.h(i14);
                                                    }
                                                    i6 = 8;
                                                } else {
                                                    c0120t2 = c0120t3;
                                                    jArr2 = jArr5;
                                                    i4 = length;
                                                    i5 = i10;
                                                    c3 = c4;
                                                    j3 = j5;
                                                    i6 = i11;
                                                }
                                                j4 >>= i6;
                                                i13++;
                                                i11 = i6;
                                                j5 = j3;
                                                c4 = c3;
                                                c0120t3 = c0120t2;
                                                jArr5 = jArr2;
                                                length = i4;
                                                i10 = i5;
                                            }
                                            c0120t = c0120t3;
                                            jArr = jArr5;
                                            int i19 = length;
                                            int i20 = i10;
                                            if (i12 != i11) {
                                                break;
                                            }
                                            length = i19;
                                            i3 = i20;
                                        } else {
                                            c0120t = c0120t3;
                                            jArr = jArr5;
                                            i3 = i10;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i10 = i3 + 1;
                                        c0120t3 = c0120t;
                                        jArr5 = jArr;
                                        i8 = 0;
                                    }
                                } else {
                                    c0120t = c0120t3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c0120t = c0120t3;
                        }
                        if (c0134a2.f2537f.W()) {
                            c0120t.d();
                        }
                    } catch (Throwable th3) {
                        try {
                            i7.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                if (c0134a2.f2537f.W()) {
                    c0120t3.d();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0134a2.f2537f.W()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f2370g) {
            try {
                if (this.f2378o.f2537f.X()) {
                    e(this.f2378o);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2371h.f5243d.g()) {
                            C0508z c0508z = this.f2371h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0508z.f5243d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0508z.iterator();
                                    while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                        B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                        ((O.c) it).remove();
                                        b02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f2370g) {
            try {
                this.f2382t.f2326u = null;
                if (!this.f2371h.f5243d.g()) {
                    C0508z c0508z = this.f2371h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0508z.f5243d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0508z.iterator();
                            while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                ((O.c) it).remove();
                                b02.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2371h.f5243d.g()) {
                            C0508z c0508z2 = this.f2371h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0508z2.f5243d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c0508z2.iterator();
                                    while (((C0411g) ((O.c) it2).f2983e).hasNext()) {
                                        B0 b03 = (B0) ((C0411g) ((O.c) it2).f2983e).next();
                                        ((O.c) it2).remove();
                                        b03.c();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        a();
                        throw e3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long[] jArr;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        C0122u c0122u = this;
        C0506x c0506x = (C0506x) c0122u.f2376m.f83b;
        long[] jArr5 = c0506x.f5226a;
        int length = jArr5.length - 2;
        long j3 = 255;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr5[i8];
                if ((((~j5) << c3) & j5 & j4) != j4) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j3) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = c0506x.f5227b[i11];
                            Object obj2 = c0506x.f5228c[i11];
                            boolean z4 = obj2 instanceof C0475A;
                            A2.g gVar = c0122u.f2373j;
                            if (z4) {
                                Z1.i.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C0475A c0475a = (C0475A) obj2;
                                Object[] objArr3 = c0475a.f5130b;
                                long[] jArr6 = c0475a.f5129a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i3 = length;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j6 = jArr6[i12];
                                        i4 = i9;
                                        i5 = i10;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j6 & 255) < 128) {
                                                    jArr4 = jArr6;
                                                    int i15 = (i12 << 3) + i14;
                                                    objArr2 = objArr3;
                                                    if (!((C0506x) gVar.f83b).b((G) objArr3[i15])) {
                                                        c0475a.k(i15);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j6 >>= 8;
                                                i14++;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i13 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        i9 = i4;
                                        i10 = i5;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i4 = i9;
                                    i5 = i10;
                                }
                                z3 = c0475a.g();
                            } else {
                                jArr2 = jArr5;
                                i3 = length;
                                i4 = i9;
                                i5 = i10;
                                Z1.i.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z3 = !((C0506x) gVar.f83b).b((G) obj2);
                            }
                            if (z3) {
                                c0506x.h(i11);
                            }
                            i6 = 8;
                        } else {
                            jArr2 = jArr5;
                            i3 = length;
                            i4 = i9;
                            i5 = i10;
                            i6 = i7;
                        }
                        j5 >>= i6;
                        i10 = i5 + 1;
                        i7 = i6;
                        jArr5 = jArr2;
                        length = i3;
                        i9 = i4;
                        j3 = 255;
                        c0122u = this;
                    }
                    jArr = jArr5;
                    int i16 = length;
                    if (i9 != i7) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c0122u = this;
                jArr5 = jArr;
                j3 = 255;
                c3 = 7;
                j4 = -9187201950435737472L;
                i7 = 8;
            }
        }
        C0475A c0475a2 = this.f2375l;
        if (!c0475a2.h()) {
            return;
        }
        Object[] objArr4 = c0475a2.f5130b;
        long[] jArr7 = c0475a2.f5129a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j7 = jArr7[i17];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j7 & 255) < 128) {
                        int i20 = (i17 << 3) + i19;
                        if (!(((C0119s0) objArr4[i20]).f2350g != null)) {
                            c0475a2.k(i20);
                        }
                    }
                    j7 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void i(Q.a aVar) {
        try {
            synchronized (this.f2370g) {
                m();
                A2.g gVar = this.f2379q;
                this.f2379q = new A2.g(12);
                try {
                    s();
                    C0113p c0113p = this.f2382t;
                    if (!c0113p.f2311e.f2537f.W()) {
                        C0089d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0113p.n(gVar, aVar);
                } catch (Exception e3) {
                    this.f2379q = gVar;
                    throw e3;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f2371h.f5243d.g()) {
                    C0508z c0508z = this.f2371h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0508z.f5243d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0508z.iterator();
                            while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                ((O.c) it).remove();
                                b02.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e4) {
                a();
                throw e4;
            }
        }
    }

    public final void j(Q.a aVar) {
        if (this.f2383u) {
            C0089d.S("The composition is disposed");
            throw null;
        }
        this.f2367d.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f2370g) {
            try {
                boolean z3 = this.f2372i.f2119e > 0;
                try {
                    if (!z3) {
                        if (!this.f2371h.f5243d.g()) {
                        }
                        ((C0506x) this.f2373j.f83b).a();
                        ((C0506x) this.f2376m.f83b).a();
                        ((C0506x) this.f2379q.f83b).a();
                        this.f2377n.f2537f.U();
                        this.f2378o.f2537f.U();
                        C0113p c0113p = this.f2382t;
                        c0113p.D.f118a.clear();
                        c0113p.f2323r.clear();
                        c0113p.f2311e.f2537f.U();
                        c0113p.f2326u = null;
                    }
                    C0120t c0120t = new C0120t(this.f2371h);
                    if (z3) {
                        I0 i3 = this.f2372i.i();
                        try {
                            C0089d.B(i3, c0120t);
                            i3.e(true);
                            this.f2368e.r();
                            c0120t.e();
                        } catch (Throwable th) {
                            i3.e(false);
                            throw th;
                        }
                    }
                    c0120t.d();
                    Trace.endSection();
                    ((C0506x) this.f2373j.f83b).a();
                    ((C0506x) this.f2376m.f83b).a();
                    ((C0506x) this.f2379q.f83b).a();
                    this.f2377n.f2537f.U();
                    this.f2378o.f2537f.U();
                    C0113p c0113p2 = this.f2382t;
                    c0113p2.D.f118a.clear();
                    c0113p2.f2323r.clear();
                    c0113p2.f2311e.f2537f.U();
                    c0113p2.f2326u = null;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f2370g) {
            try {
                C0113p c0113p = this.f2382t;
                if (c0113p.f2295E) {
                    C0089d.S("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f2383u) {
                    this.f2383u = true;
                    Q.a aVar = AbstractC0099i.f2263b;
                    C0134a c0134a = c0113p.f2301K;
                    if (c0134a != null) {
                        e(c0134a);
                    }
                    boolean z3 = this.f2372i.f2119e > 0;
                    if (z3 || !this.f2371h.f5243d.g()) {
                        C0120t c0120t = new C0120t(this.f2371h);
                        if (z3) {
                            I0 i3 = this.f2372i.i();
                            try {
                                C0089d.N(i3, c0120t);
                                i3.e(true);
                                this.f2368e.b();
                                this.f2368e.r();
                                c0120t.e();
                            } catch (Throwable th) {
                                i3.e(false);
                                throw th;
                            }
                        }
                        c0120t.d();
                    }
                    C0113p c0113p2 = this.f2382t;
                    c0113p2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0113p2.f2308b.n(c0113p2);
                        c0113p2.D.f118a.clear();
                        c0113p2.f2323r.clear();
                        c0113p2.f2311e.f2537f.U();
                        c0113p2.f2326u = null;
                        c0113p2.f2307a.b();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f2367d.o(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f2369f;
        Object obj = C0089d.f2244g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0089d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0089d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f2369f;
        Object andSet = atomicReference.getAndSet(null);
        if (Z1.i.a(andSet, C0089d.f2244g)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0089d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0089d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((AbstractC0084a0) ((L1.j) arrayList.get(0)).f2708d).getClass();
            throw null;
        }
        C0089d.O(true);
        try {
            C0113p c0113p = this.f2382t;
            c0113p.getClass();
            try {
                c0113p.y(arrayList);
                c0113p.i();
            } catch (Throwable th) {
                c0113p.a();
                throw th;
            }
        } catch (Throwable th2) {
            C0508z c0508z = this.f2371h;
            try {
                if (!c0508z.f5243d.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0508z.f5243d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0508z.iterator();
                            while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                ((O.c) it).remove();
                                b02.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e3) {
                a();
                throw e3;
            }
        }
    }

    public final int p(C0119s0 c0119s0, Object obj) {
        int P2;
        int i3 = c0119s0.f2344a;
        if ((i3 & 2) != 0) {
            c0119s0.f2344a = i3 | 4;
        }
        C0087c c0087c = c0119s0.f2346c;
        if (c0087c != null && c0087c.a()) {
            G0 g02 = this.f2372i;
            g02.getClass();
            if (!(c0087c.a() && (P2 = C0089d.P(g02.f2125k, c0087c.f2237a, g02.f2119e)) >= 0 && Z1.i.a(g02.f2125k.get(P2), c0087c))) {
                synchronized (this.f2370g) {
                }
                return 1;
            }
            if (c0119s0.f2347d != null) {
                synchronized (this.f2370g) {
                    try {
                        C0113p c0113p = this.f2382t;
                        if (c0113p.f2295E && c0113p.W(c0119s0, obj)) {
                            return 4;
                        }
                        s();
                        if (obj == null) {
                            ((C0506x) this.f2379q.f83b).i(c0119s0, X.f2227h);
                        } else if (obj instanceof G) {
                            Object e3 = ((C0506x) this.f2379q.f83b).e(c0119s0);
                            if (e3 != null) {
                                if (e3 instanceof C0475A) {
                                    C0475A c0475a = (C0475A) e3;
                                    Object[] objArr = c0475a.f5130b;
                                    long[] jArr = c0475a.f5129a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j3 = jArr[i4];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((j3 & 255) < 128 && objArr[(i4 << 3) + i6] == X.f2227h) {
                                                        break loop0;
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
                                } else if (e3 == X.f2227h) {
                                }
                            }
                            this.f2379q.j(c0119s0, obj);
                        } else {
                            ((C0506x) this.f2379q.f83b).i(c0119s0, X.f2227h);
                        }
                        this.f2367d.i(this);
                        return this.f2382t.f2295E ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void q() {
        C0122u c0122u;
        synchronized (this.f2370g) {
            try {
                for (Object obj : this.f2372i.f2120f) {
                    C0119s0 c0119s0 = obj instanceof C0119s0 ? (C0119s0) obj : null;
                    if (c0119s0 != null && (c0122u = c0119s0.f2345b) != null) {
                        c0122u.p(c0119s0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object e3 = ((C0506x) this.f2373j.f83b).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z3 = e3 instanceof C0475A;
        A2.g gVar = this.p;
        if (!z3) {
            C0119s0 c0119s0 = (C0119s0) e3;
            if (c0119s0.c(obj) == 4) {
                gVar.j(obj, c0119s0);
                return;
            }
            return;
        }
        C0475A c0475a = (C0475A) e3;
        Object[] objArr = c0475a.f5130b;
        long[] jArr = c0475a.f5129a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        C0119s0 c0119s02 = (C0119s0) objArr[(i3 << 3) + i5];
                        if (c0119s02.c(obj) == 4) {
                            gVar.j(obj, c0119s02);
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void s() {
        if (this.f2381s.f2395a) {
            return;
        }
        this.f2367d.getClass();
        Z1.i.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Set set) {
        boolean z3 = set instanceof K.f;
        A2.g gVar = this.f2376m;
        A2.g gVar2 = this.f2373j;
        if (z3) {
            C0475A c0475a = ((K.f) set).f2653d;
            Object[] objArr = c0475a.f5130b;
            long[] jArr = c0475a.f5129a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                loop0: while (true) {
                    long j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j3) < 128) {
                                Object obj = objArr[(i3 << 3) + i5];
                                if (((C0506x) gVar2.f83b).b(obj) || ((C0506x) gVar.f83b).b(obj)) {
                                    break loop0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (((C0506x) gVar2.f83b).b(obj2) || ((C0506x) gVar.f83b).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        boolean B;
        synchronized (this.f2370g) {
            try {
                m();
                try {
                    A2.g gVar = this.f2379q;
                    this.f2379q = new A2.g(12);
                    try {
                        s();
                        B = this.f2382t.B(gVar);
                        if (!B) {
                            n();
                        }
                    } catch (Exception e3) {
                        this.f2379q = gVar;
                        throw e3;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f2371h.f5243d.g()) {
                            C0508z c0508z = this.f2371h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0508z.f5243d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0508z.iterator();
                                    while (((C0411g) ((O.c) it).f2983e).hasNext()) {
                                        B0 b02 = (B0) ((C0411g) ((O.c) it).f2983e).next();
                                        ((O.c) it).remove();
                                        b02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e4) {
                        a();
                        throw e4;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void v(K.f fVar) {
        K.f fVar2;
        while (true) {
            Object obj = this.f2369f.get();
            if (obj == null ? true : obj.equals(C0089d.f2244g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f2369f).toString());
                }
                Z1.i.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                Z1.i.f(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f2369f;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f2370g) {
                    n();
                }
                return;
            }
            return;
        }
    }

    public final void w(Object obj) {
        C0119s0 v3;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        C0113p c0113p = this.f2382t;
        if (c0113p.f2331z <= 0 && (v3 = c0113p.v()) != null) {
            boolean z5 = true;
            int i5 = v3.f2344a | 1;
            v3.f2344a = i5;
            if ((i5 & 32) == 0) {
                C0503u c0503u = v3.f2349f;
                if (c0503u == null) {
                    c0503u = new C0503u();
                    v3.f2349f = c0503u;
                }
                int i6 = v3.f2348e;
                int b2 = c0503u.b(obj);
                if (b2 < 0) {
                    b2 = ~b2;
                    i4 = -1;
                } else {
                    i4 = c0503u.f5214c[b2];
                }
                c0503u.f5213b[b2] = obj;
                c0503u.f5214c[b2] = i6;
                if (i4 == v3.f2348e) {
                    return;
                }
            }
            if (obj instanceof S.y) {
                ((S.y) obj).f(1);
            }
            this.f2373j.j(obj, v3);
            if (obj instanceof G) {
                G g3 = (G) obj;
                E h3 = g3.h();
                A2.g gVar = this.f2376m;
                gVar.r(obj);
                C0503u c0503u2 = h3.f2092e;
                Object[] objArr = c0503u2.f5213b;
                long[] jArr = c0503u2.f5212a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j3 & 255) < 128) {
                                    S.x xVar = (S.x) objArr[(i7 << 3) + i10];
                                    if (xVar instanceof S.y) {
                                        z4 = true;
                                        ((S.y) xVar).f(1);
                                    } else {
                                        z4 = true;
                                    }
                                    gVar.j(xVar, obj);
                                    i3 = 8;
                                } else {
                                    z4 = z5;
                                    i3 = i8;
                                }
                                j3 >>= i3;
                                i10++;
                                i8 = i3;
                                z5 = z4;
                            }
                            z3 = z5;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            z3 = z5;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        z5 = z3;
                    }
                }
                Object obj2 = h3.f2093f;
                C0506x c0506x = v3.f2350g;
                if (c0506x == null) {
                    c0506x = new C0506x();
                    v3.f2350g = c0506x;
                }
                c0506x.i(g3, obj2);
            }
        }
    }

    public final void x(Object obj) {
        synchronized (this.f2370g) {
            try {
                r(obj);
                Object e3 = ((C0506x) this.f2376m.f83b).e(obj);
                if (e3 != null) {
                    if (e3 instanceof C0475A) {
                        C0475A c0475a = (C0475A) e3;
                        Object[] objArr = c0475a.f5130b;
                        long[] jArr = c0475a.f5129a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j3 = jArr[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j3) < 128) {
                                            r((G) objArr[(i3 << 3) + i5]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i4 != 8) {
                                        break;
                                    }
                                }
                                if (i3 == length) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else {
                        r((G) e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
