package I;

import J.C0196a;
import android.os.Trace;
import e2.InterfaceC0422a;
import j.C0519A;
import j.C0542p;
import j.C0547u;
import j.C0550x;
import j.C0552z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0657g;

/* renamed from: I.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176u implements InterfaceC0169q {

    /* renamed from: d, reason: collision with root package name */
    public final r f2926d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.m f2927e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2928f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final Object f2929g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final C0552z f2930h;

    /* renamed from: i, reason: collision with root package name */
    public final F0 f2931i;

    /* renamed from: j, reason: collision with root package name */
    public final B.Y f2932j;

    /* renamed from: k, reason: collision with root package name */
    public final C0519A f2933k;

    /* renamed from: l, reason: collision with root package name */
    public final C0519A f2934l;

    /* renamed from: m, reason: collision with root package name */
    public final B.Y f2935m;

    /* renamed from: n, reason: collision with root package name */
    public final C0196a f2936n;

    /* renamed from: o, reason: collision with root package name */
    public final C0196a f2937o;

    /* renamed from: p, reason: collision with root package name */
    public final B.Y f2938p;

    /* renamed from: q, reason: collision with root package name */
    public B.Y f2939q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2940r;

    /* renamed from: s, reason: collision with root package name */
    public final C0182x f2941s;

    /* renamed from: t, reason: collision with root package name */
    public final C0167p f2942t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2943u;

    public C0176u(r rVar, G1.m mVar) {
        this.f2926d = rVar;
        this.f2927e = mVar;
        C0552z c0552z = new C0552z(new C0519A());
        this.f2930h = c0552z;
        F0 f02 = new F0();
        if (rVar.c()) {
            f02.f2681m = new C0542p();
        }
        if (rVar.e()) {
            f02.c();
        }
        this.f2931i = f02;
        this.f2932j = new B.Y(12);
        this.f2933k = new C0519A();
        this.f2934l = new C0519A();
        this.f2935m = new B.Y(12);
        C0196a c0196a = new C0196a();
        this.f2936n = c0196a;
        C0196a c0196a2 = new C0196a();
        this.f2937o = c0196a2;
        this.f2938p = new B.Y(12);
        this.f2939q = new B.Y(12);
        C0182x c0182x = new C0182x();
        c0182x.f2958a = false;
        this.f2941s = c0182x;
        C0167p c0167p = new C0167p(mVar, rVar, f02, c0552z, c0196a, c0196a2, this);
        rVar.k(c0167p);
        this.f2942t = c0167p;
        boolean z3 = rVar instanceof C0187z0;
        Q.a aVar = AbstractC0153i.f2819a;
    }

    public final void a() {
        this.f2928f.set(null);
        this.f2936n.f3112b.i0();
        this.f2937o.f3112b.i0();
        C0552z c0552z = this.f2930h;
        if (c0552z.f6362d.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c0552z.f6362d.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0552z.iterator();
            while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                ((O.c) it).remove();
                a02.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z3) {
        int i3;
        Object e3 = ((C0550x) this.f2932j.f334d).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z4 = e3 instanceof C0519A;
        C0519A c0519a = this.f2933k;
        C0519A c0519a2 = this.f2934l;
        B.Y y3 = this.f2938p;
        if (!z4) {
            C0173s0 c0173s0 = (C0173s0) e3;
            if (y3.m(obj, c0173s0) || c0173s0.c(obj) == 1) {
                return;
            }
            if (c0173s0.f2909g == null || z3) {
                c0519a.a(c0173s0);
                return;
            } else {
                c0519a2.a(c0173s0);
                return;
            }
        }
        C0519A c0519a3 = (C0519A) e3;
        Object[] objArr = c0519a3.f6248b;
        long[] jArr = c0519a3.f6247a;
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
                        C0173s0 c0173s02 = (C0173s0) objArr[(i4 << 3) + i7];
                        if (!y3.m(obj, c0173s02) && c0173s02.c(obj) != 1) {
                            if (c0173s02.f2909g == null || z3) {
                                c0519a.a(c0173s02);
                            } else {
                                c0519a2.a(c0173s02);
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
        B.Y y3;
        int i3;
        long[] jArr;
        String str;
        long[] jArr2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean c2;
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
        B.Y y4;
        Object[] objArr6;
        B.Y y5;
        int i10;
        int i11;
        int i12;
        boolean z5 = set instanceof K.f;
        B.Y y6 = this.f2935m;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        int i13 = 8;
        if (z5) {
            C0519A c0519a = ((K.f) set).f3227d;
            Object[] objArr7 = c0519a.f6248b;
            long[] jArr7 = c0519a.f6247a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j5 = jArr7[i14];
                    if ((((~j5) << c3) & j5 & j4) != j4) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & 255) < 128) {
                                Object obj = objArr7[(i14 << 3) + i16];
                                if (obj instanceof C0173s0) {
                                    ((C0173s0) obj).c(null);
                                } else {
                                    b(obj, z3);
                                    Object e3 = ((C0550x) y6.f334d).e(obj);
                                    if (e3 != null) {
                                        if (e3 instanceof C0519A) {
                                            C0519A c0519a2 = (C0519A) e3;
                                            Object[] objArr8 = c0519a2.f6248b;
                                            long[] jArr8 = c0519a2.f6247a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                y5 = y6;
                                                int i17 = 0;
                                                while (true) {
                                                    long j6 = jArr8[i17];
                                                    i10 = i15;
                                                    i11 = i16;
                                                    if ((((~j6) << c3) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                            if ((j6 & 255) < 128) {
                                                                b((F) objArr8[(i17 << 3) + i19], z3);
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
                                                    c3 = 7;
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            y5 = y6;
                                            i10 = i15;
                                            i11 = i16;
                                            b((F) e3, z3);
                                        }
                                        i12 = 8;
                                    }
                                }
                                objArr6 = objArr7;
                                y5 = y6;
                                i10 = i15;
                                i11 = i16;
                                i12 = 8;
                            } else {
                                objArr6 = objArr7;
                                y5 = y6;
                                i10 = i15;
                                i11 = i16;
                                i12 = i13;
                            }
                            j5 >>= i12;
                            i16 = i11 + 1;
                            i13 = i12;
                            y6 = y5;
                            i15 = i10;
                            c3 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        y4 = y6;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        y4 = y6;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    objArr7 = objArr5;
                    y6 = y4;
                    c3 = 7;
                    j4 = -9187201950435737472L;
                    i13 = 8;
                }
            }
        } else {
            B.Y y7 = y6;
            for (Object obj2 : set) {
                if (obj2 instanceof C0173s0) {
                    ((C0173s0) obj2).c(null);
                    y3 = y7;
                } else {
                    b(obj2, z3);
                    y3 = y7;
                    Object e4 = ((C0550x) y3.f334d).e(obj2);
                    if (e4 != null) {
                        if (e4 instanceof C0519A) {
                            C0519A c0519a3 = (C0519A) e4;
                            Object[] objArr9 = c0519a3.f6248b;
                            long[] jArr9 = c0519a3.f6247a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j7 = jArr9[i3];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i3 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j7 & 255) < 128) {
                                                b((F) objArr9[(i3 << 3) + i21], z3);
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
                            b((F) e4, z3);
                        }
                    }
                }
                y7 = y3;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        B.Y y8 = this.f2932j;
        C0519A c0519a4 = this.f2933k;
        if (z3) {
            C0519A c0519a5 = this.f2934l;
            if (c0519a5.h()) {
                C0550x c0550x = (C0550x) y8.f334d;
                long[] jArr10 = c0550x.f6344a;
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
                                    Object obj3 = c0550x.f6345b[i25];
                                    Object obj4 = c0550x.f6346c[i25];
                                    if (obj4 instanceof C0519A) {
                                        f2.j.d(obj4, str6);
                                        C0519A c0519a6 = (C0519A) obj4;
                                        Object[] objArr10 = c0519a6.f6248b;
                                        long[] jArr11 = c0519a6.f6247a;
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
                                                            C0173s0 c0173s0 = (C0173s0) objArr10[i29];
                                                            if (c0519a5.c(c0173s0) || c0519a4.c(c0173s0)) {
                                                                c0519a6.k(i29);
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
                                        z4 = c0519a6.g();
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr10;
                                        i8 = length4;
                                        i9 = i22;
                                        j3 = j8;
                                        f2.j.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        C0173s0 c0173s02 = (C0173s0) obj4;
                                        z4 = c0519a5.c(c0173s02) || c0519a4.c(c0173s02);
                                    }
                                    if (z4) {
                                        c0550x.h(i25);
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
                c0519a5.b();
                h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (c0519a4.h()) {
            C0550x c0550x2 = (C0550x) y8.f334d;
            long[] jArr12 = c0550x2.f6344a;
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
                                Object obj5 = c0550x2.f6345b[i35];
                                Object obj6 = c0550x2.f6346c[i35];
                                if (obj6 instanceof C0519A) {
                                    String str8 = str7;
                                    f2.j.d(obj6, str8);
                                    C0519A c0519a7 = (C0519A) obj6;
                                    Object[] objArr11 = c0519a7.f6248b;
                                    long[] jArr13 = c0519a7.f6247a;
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
                                                        if (c0519a4.c((C0173s0) objArr11[i39])) {
                                                            c0519a7.k(i39);
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
                                    c2 = c0519a7.g();
                                } else {
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i5 = i33;
                                    str2 = str7;
                                    i6 = i34;
                                    f2.j.d(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c2 = c0519a4.c((C0173s0) obj6);
                                }
                                if (c2) {
                                    c0550x2.h(i35);
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
            c0519a4.b();
        }
    }

    public final void d() {
        synchronized (this.f2929g) {
            try {
                e(this.f2936n);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2930h.f6362d.g()) {
                            C0552z c0552z = this.f2930h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0552z.f6362d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0552z.iterator();
                                    while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                        A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                        ((O.c) it).remove();
                                        a02.c();
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
    public final void e(C0196a c0196a) {
        C0174t c0174t;
        long[] jArr;
        int i3;
        C0174t c0174t2;
        long[] jArr2;
        int i4;
        int i5;
        char c2;
        long j3;
        int i6;
        boolean z3;
        long[] jArr3;
        long[] jArr4;
        G1.m mVar = this.f2927e;
        C0196a c0196a2 = this.f2937o;
        C0174t c0174t3 = new C0174t(this.f2930h);
        try {
            if (c0196a.f3112b.k0()) {
                if (c0196a2.f3112b.k0()) {
                    c0174t3.d();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    H0 i7 = this.f2931i.i();
                    int i8 = 0;
                    try {
                        c0196a.f3112b.j0(mVar, i7, c0174t3);
                        i7.e(true);
                        mVar.s();
                        Trace.endSection();
                        c0174t3.e();
                        ArrayList arrayList = (ArrayList) c0174t3.f2914e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    ((InterfaceC0422a) arrayList.get(i9)).b();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.f2940r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f2940r = false;
                                C0550x c0550x = (C0550x) this.f2932j.f334d;
                                long[] jArr5 = c0550x.f6344a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j4 = jArr5[i10];
                                        char c3 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = i8;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    int i14 = (i10 << 3) + i13;
                                                    Object obj = c0550x.f6345b[i14];
                                                    Object obj2 = c0550x.f6346c[i14];
                                                    if (obj2 instanceof C0519A) {
                                                        f2.j.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        C0519A c0519a = (C0519A) obj2;
                                                        Object[] objArr = c0519a.f6248b;
                                                        long[] jArr6 = c0519a.f6247a;
                                                        int length2 = jArr6.length - 2;
                                                        c0174t2 = c0174t3;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr6[i15];
                                                                    i4 = length;
                                                                    i5 = i10;
                                                                    c2 = 7;
                                                                    j3 = -9187201950435737472L;
                                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                        int i17 = 0;
                                                                        while (i17 < i16) {
                                                                            if ((j6 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i18 = (i15 << 3) + i17;
                                                                                if (!((C0173s0) objArr[i18]).b()) {
                                                                                    c0519a.k(i18);
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
                                                            c2 = 7;
                                                        }
                                                        z3 = c0519a.g();
                                                    } else {
                                                        c0174t2 = c0174t3;
                                                        jArr2 = jArr5;
                                                        i4 = length;
                                                        i5 = i10;
                                                        c2 = c3;
                                                        j3 = -9187201950435737472L;
                                                        f2.j.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        z3 = !((C0173s0) obj2).b();
                                                    }
                                                    if (z3) {
                                                        c0550x.h(i14);
                                                    }
                                                    i6 = 8;
                                                } else {
                                                    c0174t2 = c0174t3;
                                                    jArr2 = jArr5;
                                                    i4 = length;
                                                    i5 = i10;
                                                    c2 = c3;
                                                    j3 = j5;
                                                    i6 = i11;
                                                }
                                                j4 >>= i6;
                                                i13++;
                                                i11 = i6;
                                                j5 = j3;
                                                c3 = c2;
                                                c0174t3 = c0174t2;
                                                jArr5 = jArr2;
                                                length = i4;
                                                i10 = i5;
                                            }
                                            c0174t = c0174t3;
                                            jArr = jArr5;
                                            int i19 = length;
                                            int i20 = i10;
                                            if (i12 != i11) {
                                                break;
                                            }
                                            length = i19;
                                            i3 = i20;
                                        } else {
                                            c0174t = c0174t3;
                                            jArr = jArr5;
                                            i3 = i10;
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i10 = i3 + 1;
                                        c0174t3 = c0174t;
                                        jArr5 = jArr;
                                        i8 = 0;
                                    }
                                } else {
                                    c0174t = c0174t3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c0174t = c0174t3;
                        }
                        if (c0196a2.f3112b.k0()) {
                            c0174t.d();
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
                if (c0196a2.f3112b.k0()) {
                    c0174t3.d();
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0196a2.f3112b.k0()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f2929g) {
            try {
                if (this.f2937o.f3112b.l0()) {
                    e(this.f2937o);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2930h.f6362d.g()) {
                            C0552z c0552z = this.f2930h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0552z.f6362d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0552z.iterator();
                                    while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                        A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                        ((O.c) it).remove();
                                        a02.c();
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
        synchronized (this.f2929g) {
            try {
                this.f2942t.f2885u = null;
                if (!this.f2930h.f6362d.g()) {
                    C0552z c0552z = this.f2930h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0552z.f6362d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0552z.iterator();
                            while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                ((O.c) it).remove();
                                a02.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2930h.f6362d.g()) {
                            C0552z c0552z2 = this.f2930h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0552z2.f6362d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c0552z2.iterator();
                                    while (((C0657g) ((O.c) it2).f3723f).hasNext()) {
                                        A0 a03 = (A0) ((C0657g) ((O.c) it2).f3723f).next();
                                        ((O.c) it2).remove();
                                        a03.c();
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
        C0176u c0176u = this;
        C0550x c0550x = (C0550x) c0176u.f2935m.f334d;
        long[] jArr5 = c0550x.f6344a;
        int length = jArr5.length - 2;
        long j3 = 255;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr5[i8];
                if ((((~j5) << c2) & j5 & j4) != j4) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j3) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = c0550x.f6345b[i11];
                            Object obj2 = c0550x.f6346c[i11];
                            boolean z4 = obj2 instanceof C0519A;
                            B.Y y3 = c0176u.f2932j;
                            if (z4) {
                                f2.j.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C0519A c0519a = (C0519A) obj2;
                                Object[] objArr3 = c0519a.f6248b;
                                long[] jArr6 = c0519a.f6247a;
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
                                                    if (!((C0550x) y3.f334d).b((F) objArr3[i15])) {
                                                        c0519a.k(i15);
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
                                z3 = c0519a.g();
                            } else {
                                jArr2 = jArr5;
                                i3 = length;
                                i4 = i9;
                                i5 = i10;
                                f2.j.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z3 = !((C0550x) y3.f334d).b((F) obj2);
                            }
                            if (z3) {
                                c0550x.h(i11);
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
                        c0176u = this;
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
                c0176u = this;
                jArr5 = jArr;
                j3 = 255;
                c2 = 7;
                j4 = -9187201950435737472L;
                i7 = 8;
            }
        }
        C0519A c0519a2 = this.f2934l;
        if (!c0519a2.h()) {
            return;
        }
        Object[] objArr4 = c0519a2.f6248b;
        long[] jArr7 = c0519a2.f6247a;
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
                        if (!(((C0173s0) objArr4[i20]).f2909g != null)) {
                            c0519a2.k(i20);
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
            synchronized (this.f2929g) {
                m();
                B.Y y3 = this.f2939q;
                this.f2939q = new B.Y(12);
                try {
                    s();
                    C0167p c0167p = this.f2942t;
                    if (!c0167p.f2869e.f3112b.k0()) {
                        C0143d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0167p.n(y3, aVar);
                } catch (Exception e3) {
                    this.f2939q = y3;
                    throw e3;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f2930h.f6362d.g()) {
                    C0552z c0552z = this.f2930h;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0552z.f6362d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0552z.iterator();
                            while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                ((O.c) it).remove();
                                a02.c();
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
        if (this.f2943u) {
            C0143d.T("The composition is disposed");
            throw null;
        }
        this.f2926d.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f2929g) {
            try {
                boolean z3 = this.f2931i.f2673e > 0;
                try {
                    if (!z3) {
                        if (!this.f2930h.f6362d.g()) {
                        }
                        ((C0550x) this.f2932j.f334d).a();
                        ((C0550x) this.f2935m.f334d).a();
                        ((C0550x) this.f2939q.f334d).a();
                        this.f2936n.f3112b.i0();
                        this.f2937o.f3112b.i0();
                        C0167p c0167p = this.f2942t;
                        c0167p.D.f2203d.clear();
                        c0167p.f2882r.clear();
                        c0167p.f2869e.f3112b.i0();
                        c0167p.f2885u = null;
                    }
                    C0174t c0174t = new C0174t(this.f2930h);
                    if (z3) {
                        H0 i3 = this.f2931i.i();
                        try {
                            C0143d.B(i3, c0174t);
                            i3.e(true);
                            this.f2927e.s();
                            c0174t.e();
                        } catch (Throwable th) {
                            i3.e(false);
                            throw th;
                        }
                    }
                    c0174t.d();
                    Trace.endSection();
                    ((C0550x) this.f2932j.f334d).a();
                    ((C0550x) this.f2935m.f334d).a();
                    ((C0550x) this.f2939q.f334d).a();
                    this.f2936n.f3112b.i0();
                    this.f2937o.f3112b.i0();
                    C0167p c0167p2 = this.f2942t;
                    c0167p2.D.f2203d.clear();
                    c0167p2.f2882r.clear();
                    c0167p2.f2869e.f3112b.i0();
                    c0167p2.f2885u = null;
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
        synchronized (this.f2929g) {
            try {
                C0167p c0167p = this.f2942t;
                if (c0167p.f2853E) {
                    C0143d.T("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f2943u) {
                    this.f2943u = true;
                    Q.a aVar = AbstractC0153i.f2820b;
                    C0196a c0196a = c0167p.f2859K;
                    if (c0196a != null) {
                        e(c0196a);
                    }
                    boolean z3 = this.f2931i.f2673e > 0;
                    if (z3 || !this.f2930h.f6362d.g()) {
                        C0174t c0174t = new C0174t(this.f2930h);
                        if (z3) {
                            H0 i3 = this.f2931i.i();
                            try {
                                C0143d.O(i3, c0174t);
                                i3.e(true);
                                this.f2927e.b();
                                this.f2927e.s();
                                c0174t.e();
                            } catch (Throwable th) {
                                i3.e(false);
                                throw th;
                            }
                        }
                        c0174t.d();
                    }
                    C0167p c0167p2 = this.f2942t;
                    c0167p2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0167p2.f2866b.n(c0167p2);
                        c0167p2.D.f2203d.clear();
                        c0167p2.f2882r.clear();
                        c0167p2.f2869e.f3112b.i0();
                        c0167p2.f2885u = null;
                        c0167p2.f2865a.b();
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
        this.f2926d.o(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f2928f;
        Object obj = C0143d.f2801g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0143d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0143d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f2928f;
        Object andSet = atomicReference.getAndSet(null);
        if (f2.j.a(andSet, C0143d.f2801g)) {
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
            C0143d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0143d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((AbstractC0138a0) ((R1.i) arrayList.get(0)).f4150d).getClass();
            throw null;
        }
        C0143d.P(true);
        try {
            C0167p c0167p = this.f2942t;
            c0167p.getClass();
            try {
                c0167p.y(arrayList);
                c0167p.i();
            } catch (Throwable th) {
                c0167p.a();
                throw th;
            }
        } catch (Throwable th2) {
            C0552z c0552z = this.f2930h;
            try {
                if (!c0552z.f6362d.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0552z.f6362d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0552z.iterator();
                            while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                ((O.c) it).remove();
                                a02.c();
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

    public final int p(C0173s0 c0173s0, Object obj) {
        int Q3;
        int i3 = c0173s0.f2903a;
        if ((i3 & 2) != 0) {
            c0173s0.f2903a = i3 | 4;
        }
        C0141c c0141c = c0173s0.f2905c;
        if (c0141c != null && c0141c.a()) {
            F0 f02 = this.f2931i;
            f02.getClass();
            if (!(c0141c.a() && (Q3 = C0143d.Q(f02.f2679k, c0141c.f2794a, f02.f2673e)) >= 0 && f2.j.a(f02.f2679k.get(Q3), c0141c))) {
                synchronized (this.f2929g) {
                }
                return 1;
            }
            if (c0173s0.f2906d != null) {
                synchronized (this.f2929g) {
                    try {
                        C0167p c0167p = this.f2942t;
                        if (c0167p.f2853E && c0167p.W(c0173s0, obj)) {
                            return 4;
                        }
                        s();
                        if (obj == null) {
                            ((C0550x) this.f2939q.f334d).i(c0173s0, W.f2782h);
                        } else if (obj instanceof F) {
                            Object e3 = ((C0550x) this.f2939q.f334d).e(c0173s0);
                            if (e3 != null) {
                                if (e3 instanceof C0519A) {
                                    C0519A c0519a = (C0519A) e3;
                                    Object[] objArr = c0519a.f6248b;
                                    long[] jArr = c0519a.f6247a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j3 = jArr[i4];
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((j3 & 255) < 128 && objArr[(i4 << 3) + i6] == W.f2782h) {
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
                                } else if (e3 == W.f2782h) {
                                }
                            }
                            this.f2939q.d(c0173s0, obj);
                        } else {
                            ((C0550x) this.f2939q.f334d).i(c0173s0, W.f2782h);
                        }
                        this.f2926d.i(this);
                        return this.f2942t.f2853E ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void q() {
        C0176u c0176u;
        synchronized (this.f2929g) {
            try {
                for (Object obj : this.f2931i.f2674f) {
                    C0173s0 c0173s0 = obj instanceof C0173s0 ? (C0173s0) obj : null;
                    if (c0173s0 != null && (c0176u = c0173s0.f2904b) != null) {
                        c0176u.p(c0173s0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object e3 = ((C0550x) this.f2932j.f334d).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z3 = e3 instanceof C0519A;
        B.Y y3 = this.f2938p;
        if (!z3) {
            C0173s0 c0173s0 = (C0173s0) e3;
            if (c0173s0.c(obj) == 4) {
                y3.d(obj, c0173s0);
                return;
            }
            return;
        }
        C0519A c0519a = (C0519A) e3;
        Object[] objArr = c0519a.f6248b;
        long[] jArr = c0519a.f6247a;
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
                        C0173s0 c0173s02 = (C0173s0) objArr[(i3 << 3) + i5];
                        if (c0173s02.c(obj) == 4) {
                            y3.d(obj, c0173s02);
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
        if (this.f2941s.f2958a) {
            return;
        }
        this.f2926d.getClass();
        f2.j.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Set set) {
        boolean z3 = set instanceof K.f;
        B.Y y3 = this.f2935m;
        B.Y y4 = this.f2932j;
        if (z3) {
            C0519A c0519a = ((K.f) set).f3227d;
            Object[] objArr = c0519a.f6248b;
            long[] jArr = c0519a.f6247a;
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
                                if (((C0550x) y4.f334d).b(obj) || ((C0550x) y3.f334d).b(obj)) {
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
                if (((C0550x) y4.f334d).b(obj2) || ((C0550x) y3.f334d).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        boolean B3;
        synchronized (this.f2929g) {
            try {
                m();
                try {
                    B.Y y3 = this.f2939q;
                    this.f2939q = new B.Y(12);
                    try {
                        s();
                        B3 = this.f2942t.B(y3);
                        if (!B3) {
                            n();
                        }
                    } catch (Exception e3) {
                        this.f2939q = y3;
                        throw e3;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f2930h.f6362d.g()) {
                            C0552z c0552z = this.f2930h;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0552z.f6362d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0552z.iterator();
                                    while (((C0657g) ((O.c) it).f3723f).hasNext()) {
                                        A0 a02 = (A0) ((C0657g) ((O.c) it).f3723f).next();
                                        ((O.c) it).remove();
                                        a02.c();
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
        return B3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void v(K.f fVar) {
        K.f fVar2;
        while (true) {
            Object obj = this.f2928f.get();
            if (obj == null ? true : obj.equals(C0143d.f2801g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f2928f).toString());
                }
                f2.j.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                f2.j.f(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f2928f;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f2929g) {
                    n();
                }
                return;
            }
            return;
        }
    }

    public final void w(Object obj) {
        C0173s0 v3;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        C0167p c0167p = this.f2942t;
        if (c0167p.f2890z <= 0 && (v3 = c0167p.v()) != null) {
            boolean z5 = true;
            int i5 = v3.f2903a | 1;
            v3.f2903a = i5;
            if ((i5 & 32) == 0) {
                C0547u c0547u = v3.f2908f;
                if (c0547u == null) {
                    c0547u = new C0547u();
                    v3.f2908f = c0547u;
                }
                int i6 = v3.f2907e;
                int b3 = c0547u.b(obj);
                if (b3 < 0) {
                    b3 = ~b3;
                    i4 = -1;
                } else {
                    i4 = c0547u.f6332c[b3];
                }
                c0547u.f6331b[b3] = obj;
                c0547u.f6332c[b3] = i6;
                if (i4 == v3.f2907e) {
                    return;
                }
            }
            if (obj instanceof S.z) {
                ((S.z) obj).f(1);
            }
            this.f2932j.d(obj, v3);
            if (obj instanceof F) {
                F f3 = (F) obj;
                E h3 = f3.h();
                B.Y y3 = this.f2935m;
                y3.n(obj);
                C0547u c0547u2 = h3.f2652e;
                Object[] objArr = c0547u2.f6331b;
                long[] jArr = c0547u2.f6330a;
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
                                    S.y yVar = (S.y) objArr[(i7 << 3) + i10];
                                    if (yVar instanceof S.z) {
                                        z4 = true;
                                        ((S.z) yVar).f(1);
                                    } else {
                                        z4 = true;
                                    }
                                    y3.d(yVar, obj);
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
                Object obj2 = h3.f2653f;
                C0550x c0550x = v3.f2909g;
                if (c0550x == null) {
                    c0550x = new C0550x();
                    v3.f2909g = c0550x;
                }
                c0550x.i(f3, obj2);
            }
        }
    }

    public final void x(Object obj) {
        synchronized (this.f2929g) {
            try {
                r(obj);
                Object e3 = ((C0550x) this.f2935m.f334d).e(obj);
                if (e3 != null) {
                    if (e3 instanceof C0519A) {
                        C0519A c0519a = (C0519A) e3;
                        Object[] objArr = c0519a.f6248b;
                        long[] jArr = c0519a.f6247a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j3 = jArr[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j3) < 128) {
                                            r((F) objArr[(i3 << 3) + i5]);
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
                        r((F) e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
