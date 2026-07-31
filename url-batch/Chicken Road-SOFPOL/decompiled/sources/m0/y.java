package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y implements u {

    /* renamed from: d, reason: collision with root package name */
    public final v f5164d;

    /* renamed from: e, reason: collision with root package name */
    public final w1.y1 f5165e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f5166f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    public final Object f5167g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final o.m0 f5168h;
    public final f2 i;

    /* renamed from: j, reason: collision with root package name */
    public final o.j0 f5169j;

    /* renamed from: k, reason: collision with root package name */
    public final o.k0 f5170k;

    /* renamed from: l, reason: collision with root package name */
    public final o.k0 f5171l;

    /* renamed from: m, reason: collision with root package name */
    public final o.j0 f5172m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.a f5173n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.a f5174o;

    /* renamed from: p, reason: collision with root package name */
    public final o.j0 f5175p;

    /* renamed from: q, reason: collision with root package name */
    public o.j0 f5176q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5177r;

    /* renamed from: s, reason: collision with root package name */
    public c5.n f5178s;

    /* renamed from: t, reason: collision with root package name */
    public k1 f5179t;

    /* renamed from: u, reason: collision with root package name */
    public y f5180u;

    /* renamed from: v, reason: collision with root package name */
    public int f5181v;

    /* renamed from: w, reason: collision with root package name */
    public final b1.b f5182w;

    /* renamed from: x, reason: collision with root package name */
    public final u0.i f5183x;

    /* renamed from: y, reason: collision with root package name */
    public final s f5184y;

    /* renamed from: z, reason: collision with root package name */
    public int f5185z;

    public y(v vVar, w1.y1 y1Var) {
        this.f5164d = vVar;
        this.f5165e = y1Var;
        o.m0 m0Var = new o.m0(new o.k0());
        this.f5168h = m0Var;
        f2 f2Var = new f2();
        if (vVar.d()) {
            f2Var.f4937n = new o.x();
        }
        if (vVar.f()) {
            f2Var.b();
        }
        this.i = f2Var;
        this.f5169j = h0.a.q();
        this.f5170k = new o.k0();
        this.f5171l = new o.k0();
        this.f5172m = h0.a.q();
        n0.a aVar = new n0.a();
        this.f5173n = aVar;
        n0.a aVar2 = new n0.a();
        this.f5174o = aVar2;
        this.f5175p = h0.a.q();
        this.f5176q = h0.a.q();
        b1.b bVar = new b1.b(23, vVar);
        this.f5182w = bVar;
        this.f5183x = new u0.i();
        s sVar = new s(y1Var, vVar, f2Var, m0Var, aVar, aVar2, bVar, this);
        vVar.o(sVar);
        this.f5184y = sVar;
        int i = i.f4947a;
    }

    public final void A(Object obj) {
        synchronized (this.f5167g) {
            try {
                v(obj);
                Object g3 = this.f5172m.g(obj);
                if (g3 != null) {
                    if (g3 instanceof o.k0) {
                        o.k0 k0Var = (o.k0) g3;
                        Object[] objArr = k0Var.f5490b;
                        long[] jArr = k0Var.f5489a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j7 = jArr[i];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i - length)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((255 & j7) < 128) {
                                            v((e0) objArr[(i << 3) + i9]);
                                        }
                                        j7 >>= 8;
                                    }
                                    if (i8 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        v((e0) g3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(p6.e eVar) {
        boolean i = i();
        q();
        v vVar = this.f5164d;
        if (!i) {
            vVar.a(this, eVar);
            return;
        }
        s sVar = this.f5184y;
        sVar.f5097z = 100;
        sVar.f5096y = true;
        vVar.a(this, eVar);
        sVar.s();
    }

    public final void a() {
        this.f5166f.set(null);
        this.f5173n.f5245b.X();
        this.f5174o.f5245b.X();
        o.m0 m0Var = this.f5168h;
        if (m0Var.f5511d.g()) {
            return;
        }
        u0.i iVar = this.f5183x;
        try {
            iVar.g(m0Var, this.f5184y.y());
            iVar.b();
        } finally {
            iVar.a();
        }
    }

    public final void b(Object obj, boolean z3) {
        int i;
        Object g3 = this.f5169j.g(obj);
        if (g3 == null) {
            return;
        }
        boolean z7 = g3 instanceof o.k0;
        p0 p0Var = p0.f5036d;
        o.k0 k0Var = this.f5170k;
        o.k0 k0Var2 = this.f5171l;
        o.j0 j0Var = this.f5175p;
        if (!z7) {
            t1 t1Var = (t1) g3;
            if (h0.a.T(j0Var, obj, t1Var) || t1Var.c(obj) == p0Var) {
                return;
            }
            if (t1Var.f5124g == null || z3) {
                k0Var.a(t1Var);
                return;
            } else {
                k0Var2.a(t1Var);
                return;
            }
        }
        o.k0 k0Var3 = (o.k0) g3;
        Object[] objArr = k0Var3.f5490b;
        long[] jArr = k0Var3.f5489a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j7 = jArr[i8];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j7 & 255) < 128) {
                        t1 t1Var2 = (t1) objArr[(i8 << 3) + i11];
                        if (!h0.a.T(j0Var, obj, t1Var2)) {
                            i = i9;
                            if (t1Var2.c(obj) != p0Var) {
                                if (t1Var2.f5124g == null || z3) {
                                    k0Var.a(t1Var2);
                                } else {
                                    k0Var2.a(t1Var2);
                                }
                            }
                            j7 >>= i;
                            i11++;
                            i9 = i;
                        }
                    }
                    i = i9;
                    j7 >>= i;
                    i11++;
                    i9 = i;
                }
                if (i10 != i9) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final void c(Set set, boolean z3) {
        long j7;
        long j8;
        long j9;
        char c8;
        int i;
        long[] jArr;
        long[] jArr2;
        long j10;
        boolean c9;
        long[] jArr3;
        long j11;
        long[] jArr4;
        long[] jArr5;
        int i8;
        long j12;
        boolean z7;
        int i9;
        long j13;
        long[] jArr6;
        long[] jArr7;
        char c10;
        long j14;
        int i10;
        int i11;
        long[] jArr8;
        boolean z8 = set instanceof o0.g;
        o.j0 j0Var = this.f5172m;
        Object obj = null;
        int i12 = 8;
        if (z8) {
            o.k0 k0Var = ((o0.g) set).f5581d;
            Object[] objArr = k0Var.f5490b;
            long[] jArr9 = k0Var.f5489a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j7 = 128;
                j8 = 255;
                while (true) {
                    long j15 = jArr9[i13];
                    char c11 = 7;
                    j9 = -9187201950435737472L;
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j15 & 255) < 128) {
                                Object obj2 = objArr[(i13 << 3) + i15];
                                c10 = c11;
                                if (obj2 instanceof t1) {
                                    ((t1) obj2).c(obj);
                                } else {
                                    b(obj2, z3);
                                    Object g3 = j0Var.g(obj2);
                                    if (g3 != null) {
                                        if (g3 instanceof o.k0) {
                                            o.k0 k0Var2 = (o.k0) g3;
                                            Object[] objArr2 = k0Var2.f5490b;
                                            long[] jArr10 = k0Var2.f5489a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i16 = i12;
                                                i10 = length;
                                                int i17 = 0;
                                                while (true) {
                                                    long j16 = jArr10[i17];
                                                    j14 = j15;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j16) << c10) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        int i19 = 0;
                                                        while (i19 < i18) {
                                                            if ((j16 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((e0) objArr2[(i17 << 3) + i19], z3);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j16 >>= i16;
                                                            i19++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i18 != i16) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i17 == length2) {
                                                        break;
                                                    }
                                                    i17++;
                                                    jArr10 = jArr11;
                                                    j15 = j14;
                                                    jArr9 = jArr7;
                                                    i16 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j14 = j15;
                                            i10 = length;
                                            b((e0) g3, z3);
                                        }
                                        i11 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j14 = j15;
                                i10 = length;
                                i11 = 8;
                            } else {
                                jArr7 = jArr9;
                                c10 = c11;
                                j14 = j15;
                                i10 = length;
                                i11 = i12;
                            }
                            j15 = j14 >> i11;
                            i15++;
                            length = i10;
                            i12 = i11;
                            c11 = c10;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c8 = c11;
                        int i20 = length;
                        if (i14 != i12) {
                            break;
                        } else {
                            length = i20;
                        }
                    } else {
                        jArr6 = jArr9;
                        c8 = 7;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    jArr9 = jArr6;
                    obj = null;
                    i12 = 8;
                }
            } else {
                j7 = 128;
                j8 = 255;
                j9 = -9187201950435737472L;
                c8 = 7;
            }
        } else {
            j7 = 128;
            j8 = 255;
            j9 = -9187201950435737472L;
            c8 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof t1) {
                    ((t1) obj3).c(null);
                } else {
                    b(obj3, z3);
                    Object g7 = j0Var.g(obj3);
                    if (g7 != null) {
                        if (g7 instanceof o.k0) {
                            o.k0 k0Var3 = (o.k0) g7;
                            Object[] objArr3 = k0Var3.f5490b;
                            long[] jArr12 = k0Var3.f5489a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j17 = jArr12[i];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j17 & 255) < 128) {
                                                b((e0) objArr3[(i << 3) + i22], z3);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i21 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((e0) g7, z3);
                        }
                    }
                }
            }
        }
        o.j0 j0Var2 = this.f5169j;
        o.k0 k0Var4 = this.f5170k;
        if (z3) {
            o.k0 k0Var5 = this.f5171l;
            if (k0Var5.h()) {
                long[] jArr13 = j0Var2.f5482a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j18 = jArr13[i23];
                        if ((((~j18) << c8) & j18 & j9) != j9) {
                            int i24 = 8 - ((~(i23 - length4)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j18 & j8) < j7) {
                                    int i26 = (i23 << 3) + i25;
                                    Object obj4 = j0Var2.f5483b[i26];
                                    Object obj5 = j0Var2.f5484c[i26];
                                    if (obj5 instanceof o.k0) {
                                        o.k0 k0Var6 = (o.k0) obj5;
                                        Object[] objArr4 = k0Var6.f5490b;
                                        long[] jArr14 = k0Var6.f5489a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j12 = j18;
                                            int i27 = 0;
                                            while (true) {
                                                long j19 = jArr14[i27];
                                                jArr5 = jArr13;
                                                i8 = length4;
                                                if ((((~j19) << c8) & j19 & j9) != j9) {
                                                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                    for (int i29 = 0; i29 < i28; i29 = i9 + 1) {
                                                        if ((j19 & j8) < j7) {
                                                            i9 = i29;
                                                            int i30 = (i27 << 3) + i9;
                                                            j13 = j19;
                                                            t1 t1Var = (t1) objArr4[i30];
                                                            if (k0Var5.c(t1Var) || k0Var4.c(t1Var)) {
                                                                k0Var6.m(i30);
                                                            }
                                                        } else {
                                                            i9 = i29;
                                                            j13 = j19;
                                                        }
                                                        j19 = j13 >> 8;
                                                    }
                                                    if (i28 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i27 == length5) {
                                                    break;
                                                }
                                                i27++;
                                                length4 = i8;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i8 = length4;
                                            j12 = j18;
                                        }
                                        z7 = k0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i8 = length4;
                                        j12 = j18;
                                        q6.i.c(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        t1 t1Var2 = (t1) obj5;
                                        z7 = k0Var5.c(t1Var2) || k0Var4.c(t1Var2);
                                    }
                                    if (z7) {
                                        j0Var2.l(i26);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i8 = length4;
                                    j12 = j18;
                                }
                                j18 = j12 >> 8;
                                i25++;
                                length4 = i8;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i31 = length4;
                            if (i24 != 8) {
                                break;
                            } else {
                                length4 = i31;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i23 == length4) {
                            break;
                        }
                        i23++;
                        jArr13 = jArr4;
                    }
                }
                k0Var5.b();
                h();
                return;
            }
        }
        if (k0Var4.h()) {
            long[] jArr15 = j0Var2.f5482a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j20 = jArr15[i32];
                    if ((((~j20) << c8) & j20 & j9) != j9) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j20 & j8) < j7) {
                                int i35 = (i32 << 3) + i34;
                                Object obj6 = j0Var2.f5483b[i35];
                                Object obj7 = j0Var2.f5484c[i35];
                                if (obj7 instanceof o.k0) {
                                    o.k0 k0Var7 = (o.k0) obj7;
                                    Object[] objArr5 = k0Var7.f5490b;
                                    long[] jArr16 = k0Var7.f5489a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j10 = j20;
                                        int i36 = 0;
                                        while (true) {
                                            long j21 = jArr16[i36];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j21) << c8) & j21 & j9) != j9) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j21 & j8) < j7) {
                                                        jArr3 = jArr15;
                                                        int i39 = (i36 << 3) + i38;
                                                        j11 = j21;
                                                        if (k0Var4.c((t1) objArr6[i39])) {
                                                            k0Var7.m(i39);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j11 = j21;
                                                    }
                                                    i38++;
                                                    jArr15 = jArr3;
                                                    j21 = j11 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i37 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i36 == length7) {
                                                break;
                                            }
                                            i36++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j10 = j20;
                                    }
                                    c9 = k0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j10 = j20;
                                    q6.i.c(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    c9 = k0Var4.c((t1) obj7);
                                }
                                if (c9) {
                                    j0Var2.l(i35);
                                }
                            } else {
                                jArr2 = jArr15;
                                j10 = j20;
                            }
                            i34++;
                            j20 = j10 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i33 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i32 == length6) {
                        break;
                    }
                    i32++;
                    jArr15 = jArr;
                }
            }
            h();
            k0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f5167g) {
            try {
                e(this.f5173n);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.f5168h.f5511d.g()) {
                        u0.i iVar = this.f5183x;
                        try {
                            iVar.g(this.f5168h, this.f5184y.y());
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th2) {
                            iVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void e(n0.a aVar) {
        c cVar;
        u0.i iVar;
        u0.i iVar2;
        long[] jArr;
        int i;
        long[] jArr2;
        u0.i iVar3;
        long j7;
        char c8;
        long j8;
        int i8;
        boolean z3;
        long j9;
        n0.a aVar2 = this.f5174o;
        s sVar = this.f5184y;
        x0.b y7 = sVar.y();
        u0.i iVar4 = this.f5183x;
        iVar4.g(this.f5168h, y7);
        try {
            if (aVar.f5245b.Z()) {
                try {
                    if (aVar2.f5245b.Z() && this.f5179t == null) {
                        iVar4.b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    k1 k1Var = this.f5179t;
                    if (k1Var == null || (cVar = k1Var.f4996k) == null) {
                        cVar = this.f5165e;
                    }
                    if (k1Var == null || (iVar = k1Var.f4995j) == null) {
                        iVar = iVar4;
                    }
                    i2 e8 = this.i.e();
                    int i9 = 0;
                    try {
                        aVar.X(cVar, e8, iVar, sVar.y());
                        e8.e(true);
                        cVar.g();
                        Trace.endSection();
                        iVar4.c();
                        iVar4.d();
                        if (this.f5177r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f5177r = false;
                                o.j0 j0Var = this.f5169j;
                                long[] jArr3 = j0Var.f5482a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j10 = jArr3[i10];
                                        char c9 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8;
                                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                                            int i13 = i9;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < 128) {
                                                    c8 = c9;
                                                    int i14 = (i10 << 3) + i13;
                                                    j8 = j11;
                                                    Object obj = j0Var.f5483b[i14];
                                                    Object obj2 = j0Var.f5484c[i14];
                                                    if (obj2 instanceof o.k0) {
                                                        o.k0 k0Var = (o.k0) obj2;
                                                        Object[] objArr = k0Var.f5490b;
                                                        long[] jArr4 = k0Var.f5489a;
                                                        int i15 = i11;
                                                        int length2 = jArr4.length - 2;
                                                        i = i13;
                                                        jArr2 = jArr3;
                                                        iVar3 = iVar4;
                                                        if (length2 >= 0) {
                                                            int i16 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i16];
                                                                    j7 = j10;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j12) << c8) & j12 & j8) != j8) {
                                                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                                        for (int i18 = 0; i18 < i17; i18++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                j9 = j12;
                                                                                int i19 = (i16 << 3) + i18;
                                                                                if (!((t1) objArr[i19]).b()) {
                                                                                    k0Var.m(i19);
                                                                                }
                                                                            } else {
                                                                                j9 = j12;
                                                                            }
                                                                            j12 = j9 >> i15;
                                                                        }
                                                                        if (i17 != i15) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i16 == length2) {
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                    jArr4 = jArr5;
                                                                    j10 = j7;
                                                                    i15 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j7 = j10;
                                                        }
                                                        z3 = k0Var.g();
                                                    } else {
                                                        i = i13;
                                                        jArr2 = jArr3;
                                                        iVar3 = iVar4;
                                                        j7 = j10;
                                                        q6.i.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        z3 = !((t1) obj2).b();
                                                    }
                                                    if (z3) {
                                                        j0Var.l(i14);
                                                    }
                                                    i8 = 8;
                                                } else {
                                                    i = i13;
                                                    jArr2 = jArr3;
                                                    iVar3 = iVar4;
                                                    j7 = j10;
                                                    c8 = c9;
                                                    j8 = j11;
                                                    i8 = i11;
                                                }
                                                j10 = j7 >> i8;
                                                i13 = i + 1;
                                                i11 = i8;
                                                c9 = c8;
                                                j11 = j8;
                                                iVar4 = iVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            iVar2 = iVar4;
                                            if (i12 != i11) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            iVar2 = iVar4;
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i10++;
                                        iVar4 = iVar2;
                                        jArr3 = jArr;
                                        i9 = 0;
                                    }
                                } else {
                                    iVar2 = iVar4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            iVar2 = iVar4;
                        }
                        try {
                            if (aVar2.f5245b.Z() && this.f5179t == null) {
                                iVar2.b();
                            }
                        } finally {
                            iVar2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            e8.e(false);
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
                try {
                    if (aVar2.f5245b.Z() && this.f5179t == null) {
                        iVar4.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void f() {
        synchronized (this.f5167g) {
            try {
                if (this.f5174o.f5245b.a0()) {
                    e(this.f5174o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f5168h.f5511d.g()) {
                        u0.i iVar = this.f5183x;
                        try {
                            iVar.g(this.f5168h, this.f5184y.y());
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th2) {
                            iVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        u0.i iVar;
        synchronized (this.f5167g) {
            try {
                this.f5184y.f5093v = null;
                if (!this.f5168h.f5511d.g()) {
                    iVar = this.f5183x;
                    try {
                        iVar.g(this.f5168h, this.f5184y.y());
                        iVar.b();
                        iVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f5168h.f5511d.g()) {
                        iVar = this.f5183x;
                        try {
                            iVar.g(this.f5168h, this.f5184y.y());
                            iVar.b();
                            iVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c8;
        long j7;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i;
        long j10;
        char c9;
        long j11;
        long j12;
        int i8;
        boolean z3;
        int i9;
        long j13;
        o.j0 j0Var = this.f5172m;
        long[] jArr3 = j0Var.f5482a;
        int length = jArr3.length - 2;
        char c10 = 7;
        long j14 = -9187201950435737472L;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            long j15 = 128;
            while (true) {
                long j16 = jArr3[i11];
                j8 = 255;
                if ((((~j16) << c10) & j16 & j14) != j14) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j16 & 255) < j15) {
                            c9 = c10;
                            int i14 = (i11 << 3) + i13;
                            j11 = j14;
                            Object obj = j0Var.f5483b[i14];
                            Object obj2 = j0Var.f5484c[i14];
                            boolean z7 = obj2 instanceof o.k0;
                            o.j0 j0Var2 = this.f5169j;
                            if (z7) {
                                o.k0 k0Var = (o.k0) obj2;
                                Object[] objArr = k0Var.f5490b;
                                long[] jArr4 = k0Var.f5489a;
                                j12 = j15;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j16;
                                    int i15 = i10;
                                    int i16 = 0;
                                    while (true) {
                                        long j17 = jArr4[i16];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j17) << c9) & j17 & j11) != j11) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j17 & 255) < j12) {
                                                    i9 = i18;
                                                    int i19 = (i16 << 3) + i9;
                                                    j13 = j17;
                                                    if (!j0Var2.c((e0) objArr[i19])) {
                                                        k0Var.m(i19);
                                                    }
                                                } else {
                                                    i9 = i18;
                                                    j13 = j17;
                                                }
                                                j17 = j13 >> i15;
                                                i18 = i9 + 1;
                                            }
                                            if (i17 != i15) {
                                                break;
                                            }
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i15 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j10 = j16;
                                }
                                z3 = k0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j10 = j16;
                                j12 = j15;
                                q6.i.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                z3 = !j0Var2.c((e0) obj2);
                            }
                            if (z3) {
                                j0Var.l(i14);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j10 = j16;
                            c9 = c10;
                            j11 = j14;
                            j12 = j15;
                            i8 = i10;
                        }
                        j16 = j10 >> i8;
                        i13++;
                        i10 = i8;
                        c10 = c9;
                        j14 = j11;
                        j15 = j12;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i20 = length;
                    c8 = c10;
                    j7 = j14;
                    j9 = j15;
                    if (i12 != i10) {
                        break;
                    } else {
                        length = i20;
                    }
                } else {
                    jArr = jArr3;
                    c8 = c10;
                    j7 = j14;
                    j9 = j15;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                c10 = c8;
                j14 = j7;
                j15 = j9;
                jArr3 = jArr;
                i10 = 8;
            }
        } else {
            c8 = 7;
            j7 = -9187201950435737472L;
            j8 = 255;
            j9 = 128;
        }
        o.k0 k0Var2 = this.f5171l;
        if (!k0Var2.h()) {
            return;
        }
        Object[] objArr2 = k0Var2.f5490b;
        long[] jArr5 = k0Var2.f5489a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j18 = jArr5[i21];
            if ((((~j18) << c8) & j18 & j7) != j7) {
                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                for (int i23 = 0; i23 < i22; i23++) {
                    if ((j18 & j8) < j9) {
                        int i24 = (i21 << 3) + i23;
                        if (!(((t1) objArr2[i24]).f5124g != null)) {
                            k0Var2.m(i24);
                        }
                    }
                    j18 >>= 8;
                }
                if (i22 != 8) {
                    return;
                }
            }
            if (i21 == length3) {
                return;
            } else {
                i21++;
            }
        }
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f5167g) {
            z3 = true;
            if (this.f5185z != 1) {
                z3 = false;
            }
            if (z3) {
                this.f5185z = 0;
            }
        }
        return z3;
    }

    public final void j(p6.e eVar) {
        try {
            synchronized (this.f5167g) {
                n();
                o.j0 j0Var = this.f5176q;
                this.f5176q = h0.a.q();
                try {
                    s sVar = this.f5184y;
                    c5.n nVar = this.f5178s;
                    if (!sVar.f5077e.f5245b.Z()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    sVar.P = nVar;
                    try {
                        sVar.n(j0Var, eVar);
                    } finally {
                        sVar.P = null;
                    }
                } catch (Throwable th) {
                    this.f5176q = j0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f5168h.f5511d.g()) {
                    u0.i iVar = this.f5183x;
                    try {
                        iVar.g(this.f5168h, this.f5184y.y());
                        iVar.b();
                        iVar.a();
                    } catch (Throwable th3) {
                        iVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final k1 k(boolean z3, p6.e eVar) {
        if (this.f5179t != null) {
            p1.b("A pausable composition is in progress");
        }
        k1 k1Var = new k1(this, this.f5164d, this.f5184y, this.f5168h, eVar, z3, this.f5165e, this.f5167g);
        this.f5179t = k1Var;
        return k1Var;
    }

    public final void l() {
        u0.i iVar;
        synchronized (this.f5167g) {
            try {
                if (this.f5179t != null) {
                    p1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z3 = this.i.f4929e > 0;
                try {
                    try {
                        if (!z3) {
                            if (!this.f5168h.f5511d.g()) {
                            }
                            this.f5169j.a();
                            this.f5172m.a();
                            this.f5176q.a();
                            this.f5173n.f5245b.X();
                            this.f5174o.f5245b.X();
                            s sVar = this.f5184y;
                            sVar.E.clear();
                            sVar.f5090s.clear();
                            sVar.f5077e.f5245b.X();
                            sVar.f5093v = null;
                            this.f5185z = 1;
                        }
                        iVar.g(this.f5168h, this.f5184y.y());
                        if (z3) {
                            i2 e8 = this.i.e();
                            try {
                                e8.n(e8.f4970t, new a0.e0(9, this.f5183x, e8));
                                e8.e(true);
                                this.f5165e.g();
                                iVar.c();
                            } catch (Throwable th) {
                                e8.e(false);
                                throw th;
                            }
                        }
                        iVar.b();
                        iVar.a();
                        this.f5169j.a();
                        this.f5172m.a();
                        this.f5176q.a();
                        this.f5173n.f5245b.X();
                        this.f5174o.f5245b.X();
                        s sVar2 = this.f5184y;
                        sVar2.E.clear();
                        sVar2.f5090s.clear();
                        sVar2.f5077e.f5245b.X();
                        sVar2.f5093v = null;
                        this.f5185z = 1;
                    } catch (Throwable th2) {
                        iVar.a();
                        throw th2;
                    }
                    iVar = this.f5183x;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void m() {
        synchronized (this.f5167g) {
            try {
                if (this.f5184y.F) {
                    p1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                int i = 3;
                if (this.f5185z != 3) {
                    this.f5185z = 3;
                    int i8 = i.f4947a;
                    n0.a aVar = this.f5184y.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z3 = this.i.f4929e > 0;
                    if (z3 || !this.f5168h.f5511d.g()) {
                        u0.i iVar = this.f5183x;
                        try {
                            iVar.g(this.f5168h, this.f5184y.y());
                            if (z3) {
                                i2 e8 = this.i.e();
                                try {
                                    e8.n(e8.f4970t, new b6.j0(i, this.f5183x));
                                    e8.G();
                                    e8.e(true);
                                    this.f5165e.a();
                                    this.f5165e.g();
                                    iVar.c();
                                } catch (Throwable th) {
                                    e8.e(false);
                                    throw th;
                                }
                            }
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th2) {
                            iVar.a();
                            throw th2;
                        }
                    }
                    s sVar = this.f5184y;
                    sVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        sVar.f5074b.s(sVar);
                        sVar.E.clear();
                        sVar.f5090s.clear();
                        sVar.f5077e.f5245b.X();
                        sVar.f5093v = null;
                        sVar.f5073a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f5164d.t(this);
    }

    public final void n() {
        Object obj = b.f4876a;
        AtomicReference atomicReference = this.f5166f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                t.d("pending composition has not been applied");
                throw new a5.c();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                t.d("corrupt pendingModifications drain: " + atomicReference);
                throw new a5.c();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f5166f;
        Object andSet = atomicReference.getAndSet(null);
        if (q6.i.a(andSet, b.f4876a)) {
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
            t.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new a5.c();
        }
        t.d("corrupt pendingModifications drain: " + atomicReference);
        throw new a5.c();
    }

    public final void p() {
        d6.w wVar = d6.w.f2328d;
        AtomicReference atomicReference = this.f5166f;
        Object andSet = atomicReference.getAndSet(wVar);
        if (q6.i.a(andSet, b.f4876a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            t.d("corrupt pendingModifications drain: " + atomicReference);
            throw new a5.c();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i = this.f5185z;
        if (i != 0) {
            p1.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f5179t == null) {
            return;
        }
        p1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        o.m0 m0Var = this.f5168h;
        s sVar = this.f5184y;
        if (arrayList.size() > 0) {
            ((y0) ((c6.f) arrayList.get(0)).f1747d).getClass();
            throw null;
        }
        try {
            sVar.getClass();
            try {
                sVar.A(arrayList);
                sVar.i();
            } catch (Throwable th) {
                sVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!m0Var.f5511d.g()) {
                    u0.i iVar = this.f5183x;
                    try {
                        iVar.g(m0Var, sVar.y());
                        iVar.b();
                        iVar.a();
                    } catch (Throwable th3) {
                        iVar.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final p0 s(t1 t1Var, Object obj) {
        y yVar;
        int i = t1Var.f5119b;
        if ((i & 2) != 0) {
            t1Var.f5119b = i | 4;
        }
        a aVar = t1Var.f5120c;
        if (aVar == null || !aVar.a()) {
            return p0.f5036d;
        }
        if (this.i.f(aVar)) {
            if (t1Var.f5121d == null) {
                return p0.f5036d;
            }
            p0 u7 = u(t1Var, aVar, obj);
            if (u7 != p0.f5036d) {
                this.f5182w.r();
            }
            return u7;
        }
        synchronized (this.f5167g) {
            yVar = this.f5180u;
        }
        if (yVar != null) {
            s sVar = yVar.f5184y;
            if (sVar.F && sVar.a0(t1Var, obj)) {
                return p0.f5039g;
            }
        }
        return p0.f5036d;
    }

    public final void t() {
        y yVar;
        synchronized (this.f5167g) {
            try {
                for (Object obj : this.i.f4930f) {
                    t1 t1Var = obj instanceof t1 ? (t1) obj : null;
                    if (t1Var != null && (yVar = t1Var.f5118a) != null) {
                        yVar.s(t1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p0 u(t1 t1Var, a aVar, Object obj) {
        y yVar;
        int i;
        synchronized (this.f5167g) {
            try {
                y yVar2 = this.f5180u;
                if (yVar2 != null) {
                    f2 f2Var = this.i;
                    int i8 = this.f5181v;
                    if (f2Var.f4933j) {
                        t.c("Writer is active");
                    }
                    if (i8 < 0 || i8 >= f2Var.f4929e) {
                        t.c("Invalid group index");
                    }
                    if (f2Var.f(aVar)) {
                        int i9 = f2Var.f4928d[(i8 * 5) + 3] + i8;
                        int i10 = aVar.f4874a;
                        yVar = (i8 <= i10 && i10 < i9) ? yVar2 : null;
                    }
                    yVar2 = null;
                }
                if (yVar == null) {
                    s sVar = this.f5184y;
                    if (sVar.F && sVar.a0(t1Var, obj)) {
                        return p0.f5039g;
                    }
                    if (obj == null) {
                        this.f5176q.m(t1Var, v0.f5135h);
                    } else if (obj instanceof e0) {
                        Object g3 = this.f5176q.g(t1Var);
                        if (g3 != null) {
                            if (g3 instanceof o.k0) {
                                o.k0 k0Var = (o.k0) g3;
                                Object[] objArr = k0Var.f5490b;
                                long[] jArr = k0Var.f5489a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    loop0: while (true) {
                                        long j7 = jArr[i11];
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j7 & 255) < 128) {
                                                    i = i12;
                                                    if (objArr[(i11 << 3) + i14] == v0.f5135h) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i12;
                                                }
                                                j7 >>= i;
                                                i14++;
                                                i12 = i;
                                            }
                                            if (i13 != i12) {
                                                break;
                                            }
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else if (g3 == v0.f5135h) {
                            }
                        }
                        h0.a.i(this.f5176q, t1Var, obj);
                    } else {
                        this.f5176q.m(t1Var, v0.f5135h);
                    }
                }
                if (yVar != null) {
                    return yVar.u(t1Var, aVar, obj);
                }
                this.f5164d.k(this);
                return this.f5184y.F ? p0.f5038f : p0.f5037e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object g3 = this.f5169j.g(obj);
        if (g3 == null) {
            return;
        }
        boolean z3 = g3 instanceof o.k0;
        o.j0 j0Var = this.f5175p;
        if (!z3) {
            t1 t1Var = (t1) g3;
            if (t1Var.c(obj) == p0.f5039g) {
                h0.a.i(j0Var, obj, t1Var);
                return;
            }
            return;
        }
        o.k0 k0Var = (o.k0) g3;
        Object[] objArr = k0Var.f5490b;
        long[] jArr = k0Var.f5489a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        t1 t1Var2 = (t1) objArr[(i << 3) + i9];
                        if (t1Var2.c(obj) == p0.f5039g) {
                            h0.a.i(j0Var, obj, t1Var2);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(Set set) {
        boolean z3 = set instanceof o0.g;
        o.j0 j0Var = this.f5172m;
        o.j0 j0Var2 = this.f5169j;
        if (z3) {
            o.k0 k0Var = ((o0.g) set).f5581d;
            Object[] objArr = k0Var.f5490b;
            long[] jArr = k0Var.f5489a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j7 = jArr[i];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j7) < 128) {
                                Object obj = objArr[(i << 3) + i9];
                                if (j0Var2.c(obj) || j0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (j0Var2.c(obj2) || j0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.f5167g) {
            k1 k1Var = this.f5179t;
            boolean z3 = false;
            if (k1Var != null && k1Var.f4994h.get() != l1.f5011h) {
                k1Var.e();
                return false;
            }
            n();
            try {
                o.j0 j0Var = this.f5176q;
                this.f5176q = h0.a.q();
                try {
                    s sVar = this.f5184y;
                    c5.n nVar = this.f5178s;
                    n0.l0 l0Var = sVar.f5077e.f5245b;
                    if (!l0Var.Z()) {
                        t.c("Expected applyChanges() to have been called");
                    }
                    if (j0Var.f5486e > 0 || !sVar.f5090s.isEmpty()) {
                        sVar.P = nVar;
                        try {
                            sVar.n(j0Var, null);
                            sVar.P = null;
                            z3 = l0Var.a0();
                        } catch (Throwable th) {
                            sVar.P = null;
                            throw th;
                        }
                    }
                    if (!z3) {
                        o();
                    }
                    return z3;
                } catch (Throwable th2) {
                    this.f5176q = j0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f5168h.f5511d.g()) {
                        u0.i iVar = this.f5183x;
                        try {
                            iVar.g(this.f5168h, this.f5184y.y());
                            iVar.b();
                            iVar.a();
                        } catch (Throwable th4) {
                            iVar.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void y(o0.g gVar) {
        o0.g gVar2;
        while (true) {
            Object obj = this.f5166f.get();
            if (obj == null || obj.equals(b.f4876a)) {
                gVar2 = gVar;
            } else if (obj instanceof Set) {
                gVar2 = new Set[]{obj, gVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f5166f).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = gVar;
                gVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f5166f;
            while (!atomicReference.compareAndSet(obj, gVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f5167g) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Object obj) {
        t1 w7;
        int i;
        boolean z3;
        boolean z7;
        boolean z8;
        int i8;
        s sVar = this.f5184y;
        if (sVar.A > 0 || (w7 = sVar.w()) == null) {
            return;
        }
        boolean z9 = true;
        int i9 = w7.f5119b | 1;
        w7.f5119b = i9;
        if ((i9 & 32) == 0) {
            o.d0 d0Var = w7.f5123f;
            if (d0Var == null) {
                d0Var = new o.d0();
                w7.f5123f = d0Var;
            }
            int i10 = w7.f5122e;
            int c8 = d0Var.c(obj);
            if (c8 < 0) {
                c8 = ~c8;
                i = -1;
            } else {
                i = d0Var.f5436c[c8];
            }
            d0Var.f5435b[c8] = obj;
            d0Var.f5436c[c8] = i10;
            if (i == w7.f5122e) {
                z3 = true;
                this.f5182w.r();
                if (z3) {
                    if (obj instanceof w0.v) {
                        ((w0.v) obj).f(1);
                    }
                    h0.a.i(this.f5169j, obj, w7);
                    if (obj instanceof e0) {
                        e0 e0Var = (e0) obj;
                        d0 h8 = e0Var.h();
                        o.j0 j0Var = this.f5172m;
                        h0.a.U(j0Var, obj);
                        o.d0 d0Var2 = h8.f4892e;
                        Object[] objArr = d0Var2.f5435b;
                        long[] jArr = d0Var2.f5434a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j7 = jArr[i11];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8;
                                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        if ((j7 & 255) < 128) {
                                            i8 = i12;
                                            w0.u uVar = (w0.u) objArr[(i11 << 3) + i14];
                                            if (uVar instanceof w0.v) {
                                                z8 = true;
                                                ((w0.v) uVar).f(1);
                                            } else {
                                                z8 = true;
                                            }
                                            h0.a.i(j0Var, uVar, obj);
                                        } else {
                                            z8 = z9;
                                            i8 = i12;
                                        }
                                        j7 >>= i8;
                                        i14++;
                                        z9 = z8;
                                        i12 = i8;
                                    }
                                    z7 = z9;
                                    if (i13 != i12) {
                                        break;
                                    }
                                } else {
                                    z7 = z9;
                                }
                                if (i11 == length) {
                                    break;
                                }
                                i11++;
                                z9 = z7;
                            }
                        }
                        Object obj2 = h8.f4893f;
                        o.j0 j0Var2 = w7.f5124g;
                        if (j0Var2 == null) {
                            j0Var2 = new o.j0();
                            w7.f5124g = j0Var2;
                        }
                        j0Var2.m(e0Var, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z3 = false;
        this.f5182w.r();
        if (z3) {
        }
    }
}
