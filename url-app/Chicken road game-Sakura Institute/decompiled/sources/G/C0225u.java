package G;

import B1.C0097d;
import H.C0244a;
import android.os.Trace;
import i.C0660A;
import i.C0661B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w2.C1294c;

/* renamed from: G.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225u implements InterfaceC0218q {

    /* renamed from: d, reason: collision with root package name */
    public final r f2923d;

    /* renamed from: e, reason: collision with root package name */
    public final C0097d f2924e;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f2925i = new AtomicReference(null);

    /* renamed from: j, reason: collision with root package name */
    public final Object f2926j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final C0660A f2927k;

    /* renamed from: l, reason: collision with root package name */
    public final F0 f2928l;

    /* renamed from: m, reason: collision with root package name */
    public final C1294c f2929m;

    /* renamed from: n, reason: collision with root package name */
    public final C0661B f2930n;

    /* renamed from: o, reason: collision with root package name */
    public final C0661B f2931o;

    /* renamed from: p, reason: collision with root package name */
    public final C1294c f2932p;

    /* renamed from: q, reason: collision with root package name */
    public final C0244a f2933q;

    /* renamed from: r, reason: collision with root package name */
    public final C0244a f2934r;

    /* renamed from: s, reason: collision with root package name */
    public final C1294c f2935s;

    /* renamed from: t, reason: collision with root package name */
    public C1294c f2936t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2937u;

    /* renamed from: v, reason: collision with root package name */
    public final C0231x f2938v;

    /* renamed from: w, reason: collision with root package name */
    public final C0216p f2939w;

    /* renamed from: x, reason: collision with root package name */
    public final CoroutineContext f2940x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2941y;

    public C0225u(r rVar, C0097d c0097d) {
        this.f2923d = rVar;
        this.f2924e = c0097d;
        C0660A c0660a = new C0660A(new C0661B());
        this.f2927k = c0660a;
        F0 f02 = new F0();
        if (rVar.c()) {
            f02.f2679p = new i.q();
        }
        if (rVar.e()) {
            f02.h();
        }
        this.f2928l = f02;
        this.f2929m = new C1294c(13);
        this.f2930n = new C0661B();
        this.f2931o = new C0661B();
        this.f2932p = new C1294c(13);
        C0244a c0244a = new C0244a();
        this.f2933q = c0244a;
        C0244a c0244a2 = new C0244a();
        this.f2934r = c0244a2;
        this.f2935s = new C1294c(13);
        this.f2936t = new C1294c(13);
        C0231x c0231x = new C0231x();
        c0231x.f2956a = false;
        this.f2938v = c0231x;
        C0216p c0216p = new C0216p(c0097d, rVar, f02, c0660a, c0244a, c0244a2, this);
        rVar.k(c0216p);
        this.f2939w = c0216p;
        boolean z4 = rVar instanceof C0236z0;
        O.a aVar = AbstractC0202i.f2816a;
    }

    public final void a() {
        this.f2925i.set(null);
        this.f2933q.f3182h.X();
        this.f2934r.f3182h.X();
        C0660A c0660a = this.f2927k;
        if (c0660a.f6882d.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c0660a.f6882d.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0660a.iterator();
            while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                ((M.c) it).remove();
                a02.d();
            }
            Unit unit = Unit.f7487a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void b(Object obj, boolean z4) {
        int i2;
        Object e4 = ((i.y) this.f2929m.f11388d).e(obj);
        if (e4 == null) {
            return;
        }
        boolean z5 = e4 instanceof C0661B;
        C0661B c0661b = this.f2930n;
        C0661B c0661b2 = this.f2931o;
        C1294c c1294c = this.f2935s;
        if (!z5) {
            C0222s0 c0222s0 = (C0222s0) e4;
            if (c1294c.l(obj, c0222s0) || c0222s0.c(obj) == 1) {
                return;
            }
            if (c0222s0.f2906g == null || z4) {
                c0661b.a(c0222s0);
                return;
            } else {
                c0661b2.a(c0222s0);
                return;
            }
        }
        C0661B c0661b3 = (C0661B) e4;
        Object[] objArr = c0661b3.f6885b;
        long[] jArr = c0661b3.f6884a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        C0222s0 c0222s02 = (C0222s0) objArr[(i4 << 3) + i7];
                        if (!c1294c.l(obj, c0222s02) && c0222s02.c(obj) != 1) {
                            if (c0222s02.f2906g == null || z4) {
                                c0661b.a(c0222s02);
                            } else {
                                c0661b2.a(c0222s02);
                            }
                        }
                        i2 = 8;
                    } else {
                        i2 = i5;
                    }
                    j4 >>= i2;
                    i7++;
                    i5 = i2;
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

    public final void c(Set set, boolean z4) {
        C1294c c1294c;
        int i2;
        long[] jArr;
        String str;
        long[] jArr2;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean c4;
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
        long j4;
        boolean z5;
        long[] jArr5;
        Object[] objArr3;
        long[] jArr6;
        Object[] objArr4;
        Object[] objArr5;
        C1294c c1294c2;
        Object[] objArr6;
        C1294c c1294c3;
        int i10;
        int i11;
        int i12;
        boolean z6 = set instanceof I.f;
        C1294c c1294c4 = this.f2932p;
        char c5 = 7;
        long j5 = -9187201950435737472L;
        int i13 = 8;
        if (z6) {
            C0661B c0661b = ((I.f) set).f3343d;
            Object[] objArr7 = c0661b.f6885b;
            long[] jArr7 = c0661b.f6884a;
            int length = jArr7.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j6 = jArr7[i14];
                    if ((((~j6) << c5) & j6 & j5) != j5) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j6 & 255) < 128) {
                                Object obj = objArr7[(i14 << 3) + i16];
                                if (obj instanceof C0222s0) {
                                    ((C0222s0) obj).c(null);
                                } else {
                                    b(obj, z4);
                                    Object e4 = ((i.y) c1294c4.f11388d).e(obj);
                                    if (e4 != null) {
                                        if (e4 instanceof C0661B) {
                                            C0661B c0661b2 = (C0661B) e4;
                                            Object[] objArr8 = c0661b2.f6885b;
                                            long[] jArr8 = c0661b2.f6884a;
                                            int length2 = jArr8.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                c1294c3 = c1294c4;
                                                int i17 = 0;
                                                while (true) {
                                                    long j7 = jArr8[i17];
                                                    i10 = i15;
                                                    i11 = i16;
                                                    if ((((~j7) << c5) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                            if ((j7 & 255) < 128) {
                                                                b((F) objArr8[(i17 << 3) + i19], z4);
                                                            }
                                                            j7 >>= 8;
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
                                                    c5 = 7;
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            c1294c3 = c1294c4;
                                            i10 = i15;
                                            i11 = i16;
                                            b((F) e4, z4);
                                        }
                                        i12 = 8;
                                    }
                                }
                                objArr6 = objArr7;
                                c1294c3 = c1294c4;
                                i10 = i15;
                                i11 = i16;
                                i12 = 8;
                            } else {
                                objArr6 = objArr7;
                                c1294c3 = c1294c4;
                                i10 = i15;
                                i11 = i16;
                                i12 = i13;
                            }
                            j6 >>= i12;
                            i16 = i11 + 1;
                            i13 = i12;
                            c1294c4 = c1294c3;
                            i15 = i10;
                            c5 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        c1294c2 = c1294c4;
                        if (i15 != i13) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        c1294c2 = c1294c4;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    objArr7 = objArr5;
                    c1294c4 = c1294c2;
                    c5 = 7;
                    j5 = -9187201950435737472L;
                    i13 = 8;
                }
            }
        } else {
            C1294c c1294c5 = c1294c4;
            for (Object obj2 : set) {
                if (obj2 instanceof C0222s0) {
                    ((C0222s0) obj2).c(null);
                    c1294c = c1294c5;
                } else {
                    b(obj2, z4);
                    c1294c = c1294c5;
                    Object e5 = ((i.y) c1294c.f11388d).e(obj2);
                    if (e5 != null) {
                        if (e5 instanceof C0661B) {
                            C0661B c0661b3 = (C0661B) e5;
                            Object[] objArr9 = c0661b3.f6885b;
                            long[] jArr9 = c0661b3.f6884a;
                            int length3 = jArr9.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j8 = jArr9[i2];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i2 - length3)) >>> 31);
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            if ((j8 & 255) < 128) {
                                                b((F) objArr9[(i2 << 3) + i21], z4);
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i20 != 8) {
                                            break;
                                        }
                                    }
                                    i2 = i2 != length3 ? i2 + 1 : 0;
                                }
                            }
                        } else {
                            b((F) e5, z4);
                        }
                    }
                }
                c1294c5 = c1294c;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        C1294c c1294c6 = this.f2929m;
        C0661B c0661b4 = this.f2930n;
        if (z4) {
            C0661B c0661b5 = this.f2931o;
            if (c0661b5.h()) {
                i.y yVar = (i.y) c1294c6.f11388d;
                long[] jArr10 = yVar.f6982a;
                int length4 = jArr10.length - 2;
                if (length4 >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j9 = jArr10[i22];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                            int i24 = 0;
                            while (i24 < i23) {
                                if ((j9 & 255) < 128) {
                                    int i25 = (i22 << 3) + i24;
                                    Object obj3 = yVar.f6983b[i25];
                                    Object obj4 = yVar.f6984c[i25];
                                    if (obj4 instanceof C0661B) {
                                        Intrinsics.d(obj4, str6);
                                        C0661B c0661b6 = (C0661B) obj4;
                                        Object[] objArr10 = c0661b6.f6885b;
                                        long[] jArr11 = c0661b6.f6884a;
                                        jArr4 = jArr10;
                                        int length5 = jArr11.length - 2;
                                        str5 = str6;
                                        i8 = length4;
                                        i9 = i22;
                                        if (length5 >= 0) {
                                            int i26 = 0;
                                            while (true) {
                                                long j10 = jArr11[i26];
                                                j4 = j9;
                                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i27 = 8 - ((~(i26 - length5)) >>> 31);
                                                    int i28 = 0;
                                                    while (i28 < i27) {
                                                        if ((j10 & 255) < 128) {
                                                            jArr6 = jArr11;
                                                            int i29 = (i26 << 3) + i28;
                                                            objArr4 = objArr10;
                                                            C0222s0 c0222s0 = (C0222s0) objArr10[i29];
                                                            if (c0661b5.c(c0222s0) || c0661b4.c(c0222s0)) {
                                                                c0661b6.k(i29);
                                                            }
                                                        } else {
                                                            jArr6 = jArr11;
                                                            objArr4 = objArr10;
                                                        }
                                                        j10 >>= 8;
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
                                                j9 = j4;
                                                jArr11 = jArr5;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j4 = j9;
                                        }
                                        z5 = c0661b6.g();
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr10;
                                        i8 = length4;
                                        i9 = i22;
                                        j4 = j9;
                                        Intrinsics.d(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        C0222s0 c0222s02 = (C0222s0) obj4;
                                        z5 = c0661b5.c(c0222s02) || c0661b4.c(c0222s02);
                                    }
                                    if (z5) {
                                        yVar.h(i25);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr10;
                                    i8 = length4;
                                    i9 = i22;
                                    j4 = j9;
                                }
                                j9 = j4 >> 8;
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
                c0661b5.b();
                h();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (c0661b4.h()) {
            i.y yVar2 = (i.y) c1294c6.f11388d;
            long[] jArr12 = yVar2.f6982a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j11 = jArr12[i32];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j11 & 255) < 128) {
                                int i35 = (i32 << 3) + i34;
                                Object obj5 = yVar2.f6983b[i35];
                                Object obj6 = yVar2.f6984c[i35];
                                if (obj6 instanceof C0661B) {
                                    String str8 = str7;
                                    Intrinsics.d(obj6, str8);
                                    C0661B c0661b7 = (C0661B) obj6;
                                    Object[] objArr11 = c0661b7.f6885b;
                                    long[] jArr13 = c0661b7.f6884a;
                                    int length7 = jArr13.length - 2;
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i6 = i34;
                                    if (length7 >= 0) {
                                        int i36 = 0;
                                        while (true) {
                                            long j12 = jArr13[i36];
                                            long[] jArr14 = jArr13;
                                            i5 = i33;
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j12 & 255) < 128) {
                                                        str3 = str8;
                                                        int i39 = (i36 << 3) + i38;
                                                        objArr2 = objArr11;
                                                        if (c0661b4.c((C0222s0) objArr11[i39])) {
                                                            c0661b7.k(i39);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j12 >>= 8;
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
                                    c4 = c0661b7.g();
                                } else {
                                    jArr2 = jArr12;
                                    i4 = i32;
                                    i5 = i33;
                                    str2 = str7;
                                    i6 = i34;
                                    Intrinsics.d(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c4 = c0661b4.c((C0222s0) obj6);
                                }
                                if (c4) {
                                    yVar2.h(i35);
                                }
                            } else {
                                jArr2 = jArr12;
                                i4 = i32;
                                i5 = i33;
                                str2 = str7;
                                i6 = i34;
                            }
                            j11 >>= 8;
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
            c0661b4.b();
        }
    }

    public final void d() {
        synchronized (this.f2926j) {
            try {
                e(this.f2933q);
                n();
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2927k.f6882d.g()) {
                            C0660A c0660a = this.f2927k;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0660a.f6882d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0660a.iterator();
                                    while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                        A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                        ((M.c) it).remove();
                                        a02.d();
                                    }
                                    Unit unit2 = Unit.f7487a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Exception e4) {
                    a();
                    throw e4;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0244a c0244a) {
        C0244a c0244a2;
        C0223t c0223t;
        C0244a c0244a3;
        C0223t c0223t2;
        C0244a c0244a4;
        long[] jArr;
        long[] jArr2;
        C0244a c0244a5;
        C0223t c0223t3;
        int i2;
        char c4;
        long j4;
        int i4;
        boolean z4;
        long[] jArr3;
        long[] jArr4;
        int i5 = 1;
        C0097d c0097d = this.f2924e;
        C0244a c0244a6 = this.f2934r;
        C0223t c0223t4 = new C0223t(this.f2927k);
        try {
            if (c0244a.f3182h.Z()) {
                if (c0244a6.f3182h.Z()) {
                    c0223t4.d();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                H0 w4 = this.f2928l.w();
                int i6 = 0;
                try {
                    c0244a.f3182h.Y(c0097d, w4, c0223t4);
                    Unit unit = Unit.f7487a;
                    w4.e(true);
                    c0097d.z();
                    Trace.endSection();
                    c0223t4.e();
                    ArrayList arrayList = (ArrayList) c0223t4.f2911e;
                    if (!arrayList.isEmpty()) {
                        Trace.beginSection("Compose:sideeffects");
                        try {
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((Function0) arrayList.get(i7)).invoke();
                            }
                            arrayList.clear();
                            Unit unit2 = Unit.f7487a;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (this.f2937u) {
                        try {
                            try {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.f2937u = false;
                                    i.y yVar = (i.y) this.f2929m.f11388d;
                                    long[] jArr5 = yVar.f6982a;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        while (true) {
                                            long j5 = jArr5[i8];
                                            char c5 = 7;
                                            long j6 = -9187201950435737472L;
                                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8;
                                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                                while (i6 < i10) {
                                                    if ((j5 & 255) < 128) {
                                                        int i11 = (i8 << 3) + i6;
                                                        Object obj = yVar.f6983b[i11];
                                                        Object obj2 = yVar.f6984c[i11];
                                                        if (obj2 instanceof C0661B) {
                                                            Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                            C0661B c0661b = (C0661B) obj2;
                                                            Object[] objArr = c0661b.f6885b;
                                                            long[] jArr6 = c0661b.f6884a;
                                                            int length2 = jArr6.length - 2;
                                                            jArr2 = jArr5;
                                                            c0244a5 = c0244a6;
                                                            if (length2 >= 0) {
                                                                int i12 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j7 = jArr6[i12];
                                                                        c0223t3 = c0223t4;
                                                                        i2 = length;
                                                                        c4 = 7;
                                                                        j4 = -9187201950435737472L;
                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                                            int i14 = 0;
                                                                            while (i14 < i13) {
                                                                                if ((j7 & 255) < 128) {
                                                                                    jArr4 = jArr6;
                                                                                    int i15 = (i12 << 3) + i14;
                                                                                    try {
                                                                                        if (!((C0222s0) objArr[i15]).b()) {
                                                                                            c0661b.k(i15);
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        Trace.endSection();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    jArr4 = jArr6;
                                                                                }
                                                                                j7 >>= 8;
                                                                                i14++;
                                                                                jArr6 = jArr4;
                                                                            }
                                                                            jArr3 = jArr6;
                                                                            if (i13 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr6;
                                                                        }
                                                                        if (i12 == length2) {
                                                                            break;
                                                                        }
                                                                        i12++;
                                                                        c0223t4 = c0223t3;
                                                                        length = i2;
                                                                        jArr6 = jArr3;
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        Trace.endSection();
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                c0223t3 = c0223t4;
                                                                i2 = length;
                                                                c4 = 7;
                                                                j4 = -9187201950435737472L;
                                                            }
                                                            z4 = c0661b.g();
                                                        } else {
                                                            jArr2 = jArr5;
                                                            c0244a5 = c0244a6;
                                                            c0223t3 = c0223t4;
                                                            i2 = length;
                                                            c4 = c5;
                                                            j4 = -9187201950435737472L;
                                                            Intrinsics.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                            z4 = !((C0222s0) obj2).b();
                                                        }
                                                        if (z4) {
                                                            yVar.h(i11);
                                                        }
                                                        i4 = 8;
                                                    } else {
                                                        jArr2 = jArr5;
                                                        c0244a5 = c0244a6;
                                                        c0223t3 = c0223t4;
                                                        i2 = length;
                                                        c4 = c5;
                                                        j4 = j6;
                                                        i4 = i9;
                                                    }
                                                    j5 >>= i4;
                                                    i5 = 1;
                                                    i6++;
                                                    i9 = i4;
                                                    c5 = c4;
                                                    j6 = j4;
                                                    c0244a6 = c0244a5;
                                                    jArr5 = jArr2;
                                                    c0223t4 = c0223t3;
                                                    length = i2;
                                                }
                                                jArr = jArr5;
                                                c0244a3 = c0244a6;
                                                c0223t2 = c0223t4;
                                                int i16 = length;
                                                if (i10 != i9) {
                                                    break;
                                                } else {
                                                    length = i16;
                                                }
                                            } else {
                                                jArr = jArr5;
                                                c0244a3 = c0244a6;
                                                c0223t2 = c0223t4;
                                            }
                                            if (i8 == length) {
                                                break;
                                            }
                                            i8 += i5;
                                            c0244a6 = c0244a3;
                                            jArr5 = jArr;
                                            c0223t4 = c0223t2;
                                            i6 = 0;
                                        }
                                    } else {
                                        c0244a3 = c0244a6;
                                        c0223t2 = c0223t4;
                                    }
                                    h();
                                    Unit unit3 = Unit.f7487a;
                                    Trace.endSection();
                                    c0244a4 = c0244a3;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c0244a2 = c0244a6;
                                if (c0244a2.f3182h.Z()) {
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c0223t = c0223t4;
                            c0244a2 = c0244a6;
                            if (c0244a2.f3182h.Z()) {
                            }
                            throw th;
                        }
                    } else {
                        c0223t2 = c0223t4;
                        c0244a4 = c0244a6;
                    }
                    if (c0244a4.f3182h.Z()) {
                        c0223t2.d();
                    }
                } catch (Throwable th7) {
                    c0244a2 = c0244a6;
                    c0223t = c0223t4;
                    try {
                        w4.e(false);
                        throw th7;
                    } catch (Throwable th8) {
                        th = th8;
                        try {
                            Trace.endSection();
                            throw th;
                        } catch (Throwable th9) {
                            th = th9;
                            if (c0244a2.f3182h.Z()) {
                                c0223t.d();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                c0244a2 = c0244a6;
                c0223t = c0223t4;
            }
        } catch (Throwable th11) {
            th = th11;
            c0244a2 = c0244a6;
            c0223t = c0223t4;
            if (c0244a2.f3182h.Z()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f2926j) {
            try {
                if (this.f2934r.f3182h.a0()) {
                    e(this.f2934r);
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2927k.f6882d.g()) {
                            C0660A c0660a = this.f2927k;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0660a.f6882d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0660a.iterator();
                                    while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                        A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                        ((M.c) it).remove();
                                        a02.d();
                                    }
                                    Unit unit2 = Unit.f7487a;
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
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f2926j) {
            try {
                this.f2939w.f2882u = null;
                if (!this.f2927k.f6882d.g()) {
                    C0660A c0660a = this.f2927k;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0660a.f6882d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0660a.iterator();
                            while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                ((M.c) it).remove();
                                a02.d();
                            }
                            Unit unit = Unit.f7487a;
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                Unit unit2 = Unit.f7487a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f2927k.f6882d.g()) {
                            C0660A c0660a2 = this.f2927k;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0660a2.f6882d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c0660a2.iterator();
                                    while (((T2.h) ((M.c) it2).f3536e).hasNext()) {
                                        A0 a03 = (A0) ((T2.h) ((M.c) it2).f3536e).next();
                                        ((M.c) it2).remove();
                                        a03.d();
                                    }
                                    Unit unit3 = Unit.f7487a;
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e4) {
                    a();
                    throw e4;
                }
            }
        }
    }

    public final void h() {
        long[] jArr;
        long[] jArr2;
        int i2;
        int i4;
        int i5;
        int i6;
        boolean z4;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        C0225u c0225u = this;
        i.y yVar = (i.y) c0225u.f2932p.f11388d;
        long[] jArr5 = yVar.f6982a;
        int length = jArr5.length - 2;
        long j4 = 255;
        char c4 = 7;
        long j5 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr5[i8];
                if ((((~j6) << c4) & j6 & j5) != j5) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j4) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj = yVar.f6983b[i11];
                            Object obj2 = yVar.f6984c[i11];
                            boolean z5 = obj2 instanceof C0661B;
                            C1294c c1294c = c0225u.f2929m;
                            if (z5) {
                                Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C0661B c0661b = (C0661B) obj2;
                                Object[] objArr3 = c0661b.f6885b;
                                long[] jArr6 = c0661b.f6884a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i2 = length;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j7 = jArr6[i12];
                                        i4 = i9;
                                        i5 = i10;
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j7 & 255) < 128) {
                                                    jArr4 = jArr6;
                                                    int i15 = (i12 << 3) + i14;
                                                    objArr2 = objArr3;
                                                    if (!((i.y) c1294c.f11388d).b((F) objArr3[i15])) {
                                                        c0661b.k(i15);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j7 >>= 8;
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
                                z4 = c0661b.g();
                            } else {
                                jArr2 = jArr5;
                                i2 = length;
                                i4 = i9;
                                i5 = i10;
                                Intrinsics.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z4 = !((i.y) c1294c.f11388d).b((F) obj2);
                            }
                            if (z4) {
                                yVar.h(i11);
                            }
                            i6 = 8;
                        } else {
                            jArr2 = jArr5;
                            i2 = length;
                            i4 = i9;
                            i5 = i10;
                            i6 = i7;
                        }
                        j6 >>= i6;
                        i10 = i5 + 1;
                        i7 = i6;
                        jArr5 = jArr2;
                        length = i2;
                        i9 = i4;
                        j4 = 255;
                        c0225u = this;
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
                c0225u = this;
                jArr5 = jArr;
                j4 = 255;
                c4 = 7;
                j5 = -9187201950435737472L;
                i7 = 8;
            }
        }
        C0661B c0661b2 = this.f2931o;
        if (!c0661b2.h()) {
            return;
        }
        Object[] objArr4 = c0661b2.f6885b;
        long[] jArr7 = c0661b2.f6884a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j8 = jArr7[i17];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j8 & 255) < 128) {
                        int i20 = (i17 << 3) + i19;
                        if (!(((C0222s0) objArr4[i20]).f2906g != null)) {
                            c0661b2.k(i20);
                        }
                    }
                    j8 >>= 8;
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

    public final void i(O.a aVar) {
        try {
            synchronized (this.f2926j) {
                m();
                C1294c c1294c = this.f2936t;
                this.f2936t = new C1294c(13);
                try {
                    s();
                    C0216p c0216p = this.f2939w;
                    if (!c0216p.f2866e.f3182h.Z()) {
                        C0192d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0216p.o(c1294c, aVar);
                } catch (Exception e4) {
                    this.f2936t = c1294c;
                    throw e4;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f2927k.f6882d.g()) {
                    C0660A c0660a = this.f2927k;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0660a.f6882d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0660a.iterator();
                            while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                ((M.c) it).remove();
                                a02.d();
                            }
                            Unit unit = Unit.f7487a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e5) {
                a();
                throw e5;
            }
        }
    }

    public final void j(O.a aVar) {
        if (this.f2941y) {
            C0192d.T("The composition is disposed");
            throw null;
        }
        this.f2923d.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f2926j) {
            try {
                boolean z4 = this.f2928l.f2671e > 0;
                try {
                    if (!z4) {
                        if (!this.f2927k.f6882d.g()) {
                        }
                        ((i.y) this.f2929m.f11388d).a();
                        ((i.y) this.f2932p.f11388d).a();
                        ((i.y) this.f2936t.f11388d).a();
                        this.f2933q.f3182h.X();
                        this.f2934r.f3182h.X();
                        C0216p c0216p = this.f2939w;
                        c0216p.f2849D.f2781d.clear();
                        c0216p.f2879r.clear();
                        c0216p.f2866e.f3182h.X();
                        c0216p.f2882u = null;
                        Unit unit = Unit.f7487a;
                    }
                    C0223t c0223t = new C0223t(this.f2927k);
                    if (z4) {
                        H0 w4 = this.f2928l.w();
                        try {
                            C0192d.B(w4, c0223t);
                            Unit unit2 = Unit.f7487a;
                            w4.e(true);
                            this.f2924e.z();
                            c0223t.e();
                        } catch (Throwable th) {
                            w4.e(false);
                            throw th;
                        }
                    }
                    c0223t.d();
                    Unit unit3 = Unit.f7487a;
                    Trace.endSection();
                    ((i.y) this.f2929m.f11388d).a();
                    ((i.y) this.f2932p.f11388d).a();
                    ((i.y) this.f2936t.f11388d).a();
                    this.f2933q.f3182h.X();
                    this.f2934r.f3182h.X();
                    C0216p c0216p2 = this.f2939w;
                    c0216p2.f2849D.f2781d.clear();
                    c0216p2.f2879r.clear();
                    c0216p2.f2866e.f3182h.X();
                    c0216p2.f2882u = null;
                    Unit unit4 = Unit.f7487a;
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
        synchronized (this.f2926j) {
            try {
                C0216p c0216p = this.f2939w;
                if (c0216p.f2850E) {
                    C0192d.T("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f2941y) {
                    this.f2941y = true;
                    O.a aVar = AbstractC0202i.f2817b;
                    C0244a c0244a = c0216p.f2856K;
                    if (c0244a != null) {
                        e(c0244a);
                    }
                    boolean z4 = this.f2928l.f2671e > 0;
                    if (z4 || !this.f2927k.f6882d.g()) {
                        C0223t c0223t = new C0223t(this.f2927k);
                        if (z4) {
                            H0 w4 = this.f2928l.w();
                            try {
                                C0192d.O(w4, c0223t);
                                Unit unit = Unit.f7487a;
                                w4.e(true);
                                this.f2924e.c();
                                this.f2924e.z();
                                c0223t.e();
                            } catch (Throwable th) {
                                w4.e(false);
                                throw th;
                            }
                        }
                        c0223t.d();
                    }
                    C0216p c0216p2 = this.f2939w;
                    c0216p2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0216p2.f2863b.n(c0216p2);
                        c0216p2.f2849D.f2781d.clear();
                        c0216p2.f2879r.clear();
                        c0216p2.f2866e.f3182h.X();
                        c0216p2.f2882u = null;
                        c0216p2.f2862a.c();
                        Unit unit2 = Unit.f7487a;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Unit unit3 = Unit.f7487a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f2923d.o(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f2925i;
        Object obj = C0192d.f2798g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0192d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0192d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f2925i;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.a(andSet, C0192d.f2798g)) {
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
            C0192d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0192d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            ((AbstractC0187a0) ((Pair) arrayList.get(0)).f7485d).getClass();
            throw null;
        }
        C0192d.P(true);
        try {
            C0216p c0216p = this.f2939w;
            c0216p.getClass();
            try {
                c0216p.A(arrayList);
                c0216p.i();
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                c0216p.a();
                throw th;
            }
        } catch (Throwable th2) {
            C0660A c0660a = this.f2927k;
            try {
                if (!c0660a.f6882d.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0660a.f6882d.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0660a.iterator();
                            while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                ((M.c) it).remove();
                                a02.d();
                            }
                            Unit unit2 = Unit.f7487a;
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e4) {
                a();
                throw e4;
            }
        }
    }

    public final int p(C0222s0 c0222s0, Object obj) {
        int Q3;
        int i2 = c0222s0.f2900a;
        if ((i2 & 2) != 0) {
            c0222s0.f2900a = i2 | 4;
        }
        C0190c c0190c = c0222s0.f2902c;
        if (c0190c != null && c0190c.a()) {
            F0 f02 = this.f2928l;
            f02.getClass();
            if (!(c0190c.a() && (Q3 = C0192d.Q(f02.f2677n, c0190c.f2791a, f02.f2671e)) >= 0 && Intrinsics.a(f02.f2677n.get(Q3), c0190c))) {
                synchronized (this.f2926j) {
                }
                return 1;
            }
            if (c0222s0.f2903d != null) {
                synchronized (this.f2926j) {
                    try {
                        C0216p c0216p = this.f2939w;
                        if (c0216p.f2850E && c0216p.Y(c0222s0, obj)) {
                            return 4;
                        }
                        s();
                        if (obj == null) {
                            ((i.y) this.f2936t.f11388d).i(c0222s0, W.f2778k);
                        } else if (obj instanceof F) {
                            Object e4 = ((i.y) this.f2936t.f11388d).e(c0222s0);
                            if (e4 != null) {
                                if (e4 instanceof C0661B) {
                                    C0661B c0661b = (C0661B) e4;
                                    Object[] objArr = c0661b.f6885b;
                                    long[] jArr = c0661b.f6884a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j4 = jArr[i4];
                                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((j4 & 255) < 128 && objArr[(i4 << 3) + i6] == W.f2778k) {
                                                        break loop0;
                                                    }
                                                    j4 >>= 8;
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
                                } else if (e4 == W.f2778k) {
                                }
                            }
                            this.f2936t.d(c0222s0, obj);
                        } else {
                            ((i.y) this.f2936t.f11388d).i(c0222s0, W.f2778k);
                        }
                        this.f2923d.i(this);
                        return this.f2939w.f2850E ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void q() {
        C0225u c0225u;
        synchronized (this.f2926j) {
            try {
                for (Object obj : this.f2928l.f2672i) {
                    C0222s0 c0222s0 = obj instanceof C0222s0 ? (C0222s0) obj : null;
                    if (c0222s0 != null && (c0225u = c0222s0.f2901b) != null) {
                        c0225u.p(c0222s0, null);
                    }
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object e4 = ((i.y) this.f2929m.f11388d).e(obj);
        if (e4 == null) {
            return;
        }
        boolean z4 = e4 instanceof C0661B;
        C1294c c1294c = this.f2935s;
        if (!z4) {
            C0222s0 c0222s0 = (C0222s0) e4;
            if (c0222s0.c(obj) == 4) {
                c1294c.d(obj, c0222s0);
                return;
            }
            return;
        }
        C0661B c0661b = (C0661B) e4;
        Object[] objArr = c0661b.f6885b;
        long[] jArr = c0661b.f6884a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j4) < 128) {
                        C0222s0 c0222s02 = (C0222s0) objArr[(i2 << 3) + i5];
                        if (c0222s02.c(obj) == 4) {
                            c1294c.d(obj, c0222s02);
                        }
                    }
                    j4 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void s() {
        if (this.f2938v.f2956a) {
            return;
        }
        this.f2923d.getClass();
        Intrinsics.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(Set set) {
        boolean z4 = set instanceof I.f;
        C1294c c1294c = this.f2932p;
        C1294c c1294c2 = this.f2929m;
        if (z4) {
            C0661B c0661b = ((I.f) set).f3343d;
            Object[] objArr = c0661b.f6885b;
            long[] jArr = c0661b.f6884a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j4 = jArr[i2];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j4) < 128) {
                                Object obj = objArr[(i2 << 3) + i5];
                                if (((i.y) c1294c2.f11388d).b(obj) || ((i.y) c1294c.f11388d).b(obj)) {
                                    break loop0;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (((i.y) c1294c2.f11388d).b(obj2) || ((i.y) c1294c.f11388d).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        boolean D3;
        synchronized (this.f2926j) {
            try {
                m();
                try {
                    C1294c c1294c = this.f2936t;
                    this.f2936t = new C1294c(13);
                    try {
                        s();
                        D3 = this.f2939w.D(c1294c);
                        if (!D3) {
                            n();
                        }
                    } catch (Exception e4) {
                        this.f2936t = c1294c;
                        throw e4;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f2927k.f6882d.g()) {
                            C0660A c0660a = this.f2927k;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0660a.f6882d.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0660a.iterator();
                                    while (((T2.h) ((M.c) it).f3536e).hasNext()) {
                                        A0 a02 = (A0) ((T2.h) ((M.c) it).f3536e).next();
                                        ((M.c) it).remove();
                                        a02.d();
                                    }
                                    Unit unit = Unit.f7487a;
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e5) {
                        a();
                        throw e5;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return D3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    public final void v(I.f fVar) {
        I.f fVar2;
        while (true) {
            Object obj = this.f2925i.get();
            if (obj == null ? true : obj.equals(C0192d.f2798g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f2925i).toString());
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                Intrinsics.checkNotNullParameter(setArr, "<this>");
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f2925i;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f2926j) {
                    n();
                    Unit unit = Unit.f7487a;
                }
                return;
            }
            return;
        }
    }

    public final void w(Object obj) {
        C0222s0 x2;
        boolean z4;
        boolean z5;
        int i2;
        int i4;
        C0216p c0216p = this.f2939w;
        if (c0216p.f2887z <= 0 && (x2 = c0216p.x()) != null) {
            boolean z6 = true;
            int i5 = x2.f2900a | 1;
            x2.f2900a = i5;
            if ((i5 & 32) == 0) {
                i.v vVar = x2.f2905f;
                if (vVar == null) {
                    vVar = new i.v();
                    x2.f2905f = vVar;
                }
                int i6 = x2.f2904e;
                int b4 = vVar.b(obj);
                if (b4 < 0) {
                    b4 = ~b4;
                    i4 = -1;
                } else {
                    i4 = vVar.f6970c[b4];
                }
                vVar.f6969b[b4] = obj;
                vVar.f6970c[b4] = i6;
                if (i4 == x2.f2904e) {
                    return;
                }
            }
            if (obj instanceof Q.E) {
                ((Q.E) obj).c(1);
            }
            this.f2929m.d(obj, x2);
            if (obj instanceof F) {
                F f4 = (F) obj;
                E f5 = f4.f();
                C1294c c1294c = this.f2932p;
                c1294c.m(obj);
                i.v vVar2 = f5.f2650e;
                Object[] objArr = vVar2.f6969b;
                long[] jArr = vVar2.f6968a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr[i7];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j4 & 255) < 128) {
                                    Q.D d4 = (Q.D) objArr[(i7 << 3) + i10];
                                    if (d4 instanceof Q.E) {
                                        z5 = true;
                                        ((Q.E) d4).c(1);
                                    } else {
                                        z5 = true;
                                    }
                                    c1294c.d(d4, obj);
                                    i2 = 8;
                                } else {
                                    z5 = z6;
                                    i2 = i8;
                                }
                                j4 >>= i2;
                                i10++;
                                i8 = i2;
                                z6 = z5;
                            }
                            z4 = z6;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            z4 = z6;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        z6 = z4;
                    }
                }
                Object obj2 = f5.f2651f;
                i.y yVar = x2.f2906g;
                if (yVar == null) {
                    yVar = new i.y();
                    x2.f2906g = yVar;
                }
                yVar.i(f4, obj2);
            }
        }
    }

    public final void x(Object obj) {
        synchronized (this.f2926j) {
            try {
                r(obj);
                Object e4 = ((i.y) this.f2932p.f11388d).e(obj);
                if (e4 != null) {
                    if (e4 instanceof C0661B) {
                        C0661B c0661b = (C0661B) e4;
                        Object[] objArr = c0661b.f6885b;
                        long[] jArr = c0661b.f6884a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j4 = jArr[i2];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((255 & j4) < 128) {
                                            r((F) objArr[(i2 << 3) + i5]);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i4 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        r((F) e4);
                    }
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
