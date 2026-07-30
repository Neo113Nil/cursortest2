package g0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: f, reason: collision with root package name */
    public final r f3928f;

    /* renamed from: g, reason: collision with root package name */
    public final b1.b f3929g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f3930h = new AtomicReference(null);

    /* renamed from: i, reason: collision with root package name */
    public final Object f3931i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final i.a0 f3932j;

    /* renamed from: k, reason: collision with root package name */
    public final y1 f3933k;

    /* renamed from: l, reason: collision with root package name */
    public final b6.c f3934l;

    /* renamed from: m, reason: collision with root package name */
    public final i.b0 f3935m;

    /* renamed from: n, reason: collision with root package name */
    public final i.b0 f3936n;

    /* renamed from: o, reason: collision with root package name */
    public final b6.c f3937o;

    /* renamed from: p, reason: collision with root package name */
    public final h0.a f3938p;

    /* renamed from: q, reason: collision with root package name */
    public final h0.a f3939q;

    /* renamed from: r, reason: collision with root package name */
    public final b6.c f3940r;

    /* renamed from: s, reason: collision with root package name */
    public b6.c f3941s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3942t;

    /* renamed from: u, reason: collision with root package name */
    public final t0 f3943u;

    /* renamed from: v, reason: collision with root package name */
    public final p f3944v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3945w;

    public u(r rVar, b1.b bVar) {
        this.f3928f = rVar;
        this.f3929g = bVar;
        i.a0 a0Var = new i.a0(new i.b0());
        this.f3932j = a0Var;
        y1 y1Var = new y1();
        if (rVar.c()) {
            y1Var.f3983o = new i.p();
        }
        if (rVar.e()) {
            y1Var.g();
        }
        this.f3933k = y1Var;
        this.f3934l = new b6.c(22);
        this.f3935m = new i.b0();
        this.f3936n = new i.b0();
        this.f3937o = new b6.c(22);
        h0.a aVar = new h0.a();
        this.f3938p = aVar;
        h0.a aVar2 = new h0.a();
        this.f3939q = aVar2;
        this.f3940r = new b6.c(22);
        this.f3941s = new b6.c(22);
        this.f3943u = new t0(6);
        p pVar = new p(bVar, rVar, y1Var, a0Var, aVar, aVar2, this);
        rVar.k(pVar);
        this.f3944v = pVar;
        o0.a aVar3 = i.f3748a;
    }

    public final void a() {
        this.f3930h.set(null);
        this.f3938p.f4587g.U();
        this.f3939q.f4587g.U();
        i.a0 a0Var = this.f3932j;
        if (a0Var.f4718f.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (a0Var.f4718f.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = a0Var.iterator();
            while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                ((i.z) it).remove();
                u1Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void b(Object obj, boolean z8) {
        int i7;
        Object e9 = ((i.x) this.f3934l.f1394g).e(obj);
        if (e9 == null) {
            return;
        }
        boolean z9 = e9 instanceof i.b0;
        i.b0 b0Var = this.f3935m;
        i.b0 b0Var2 = this.f3936n;
        b6.c cVar = this.f3940r;
        if (!z9) {
            p1 p1Var = (p1) e9;
            if (cVar.w(obj, p1Var) || p1Var.c(obj) == 1) {
                return;
            }
            if (p1Var.f3856g == null || z8) {
                b0Var.a(p1Var);
                return;
            } else {
                b0Var2.a(p1Var);
                return;
            }
        }
        i.b0 b0Var3 = (i.b0) e9;
        Object[] objArr = b0Var3.f4722b;
        long[] jArr = b0Var3.f4721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j8 & 255) < 128) {
                        p1 p1Var2 = (p1) objArr[(i8 << 3) + i11];
                        if (!cVar.w(obj, p1Var2)) {
                            i7 = i9;
                            if (p1Var2.c(obj) != 1) {
                                if (p1Var2.f3856g == null || z8) {
                                    b0Var.a(p1Var2);
                                } else {
                                    b0Var2.a(p1Var2);
                                }
                            }
                            j8 >>= i7;
                            i11++;
                            i9 = i7;
                        }
                    }
                    i7 = i9;
                    j8 >>= i7;
                    i11++;
                    i9 = i7;
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

    public final void c(Set set, boolean z8) {
        long j8;
        long j9;
        long j10;
        char c4;
        int i7;
        long[] jArr;
        long[] jArr2;
        long j11;
        boolean c6;
        long[] jArr3;
        long j12;
        long[] jArr4;
        long[] jArr5;
        int i8;
        long j13;
        boolean z9;
        int i9;
        long j14;
        long[] jArr6;
        long[] jArr7;
        char c9;
        long j15;
        int i10;
        int i11;
        long[] jArr8;
        boolean z10 = set instanceof i0.f;
        b6.c cVar = this.f3937o;
        Object obj = null;
        int i12 = 8;
        if (z10) {
            i.b0 b0Var = ((i0.f) set).f4853f;
            Object[] objArr = b0Var.f4722b;
            long[] jArr9 = b0Var.f4721a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j8 = 128;
                j9 = 255;
                while (true) {
                    long j16 = jArr9[i13];
                    char c10 = 7;
                    j10 = -9187201950435737472L;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j16 & 255) < 128) {
                                Object obj2 = objArr[(i13 << 3) + i15];
                                c9 = c10;
                                if (obj2 instanceof p1) {
                                    ((p1) obj2).c(obj);
                                } else {
                                    b(obj2, z8);
                                    Object e9 = ((i.x) cVar.f1394g).e(obj2);
                                    if (e9 != null) {
                                        if (e9 instanceof i.b0) {
                                            i.b0 b0Var2 = (i.b0) e9;
                                            Object[] objArr2 = b0Var2.f4722b;
                                            long[] jArr10 = b0Var2.f4721a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i16 = i12;
                                                i10 = length;
                                                int i17 = 0;
                                                while (true) {
                                                    long j17 = jArr10[i17];
                                                    j15 = j16;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j17) << c9) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        int i19 = 0;
                                                        while (i19 < i18) {
                                                            if ((j17 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((e0) objArr2[(i17 << 3) + i19], z8);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j17 >>= i16;
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
                                                    j16 = j15;
                                                    jArr9 = jArr7;
                                                    i16 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j15 = j16;
                                            i10 = length;
                                            b((e0) e9, z8);
                                        }
                                        i11 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j15 = j16;
                                i10 = length;
                                i11 = 8;
                            } else {
                                jArr7 = jArr9;
                                c9 = c10;
                                j15 = j16;
                                i10 = length;
                                i11 = i12;
                            }
                            j16 = j15 >> i11;
                            i15++;
                            length = i10;
                            i12 = i11;
                            c10 = c9;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c4 = c10;
                        int i20 = length;
                        if (i14 != i12) {
                            break;
                        } else {
                            length = i20;
                        }
                    } else {
                        jArr6 = jArr9;
                        c4 = 7;
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
                j8 = 128;
                j9 = 255;
                j10 = -9187201950435737472L;
                c4 = 7;
            }
        } else {
            j8 = 128;
            j9 = 255;
            j10 = -9187201950435737472L;
            c4 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof p1) {
                    ((p1) obj3).c(null);
                } else {
                    b(obj3, z8);
                    Object e10 = ((i.x) cVar.f1394g).e(obj3);
                    if (e10 != null) {
                        if (e10 instanceof i.b0) {
                            i.b0 b0Var3 = (i.b0) e10;
                            Object[] objArr3 = b0Var3.f4722b;
                            long[] jArr12 = b0Var3.f4721a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j18 = jArr12[i7];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i7 - length3)) >>> 31);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j18 & 255) < 128) {
                                                b((e0) objArr3[(i7 << 3) + i22], z8);
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i21 != 8) {
                                            break;
                                        }
                                    }
                                    i7 = i7 != length3 ? i7 + 1 : 0;
                                }
                            }
                        } else {
                            b((e0) e10, z8);
                        }
                    }
                }
            }
        }
        b6.c cVar2 = this.f3934l;
        i.b0 b0Var4 = this.f3935m;
        if (z8) {
            i.b0 b0Var5 = this.f3936n;
            if (b0Var5.h()) {
                i.x xVar = (i.x) cVar2.f1394g;
                long[] jArr13 = xVar.f4812a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j19 = jArr13[i23];
                        if ((((~j19) << c4) & j19 & j10) != j10) {
                            int i24 = 8 - ((~(i23 - length4)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j19 & j9) < j8) {
                                    int i26 = (i23 << 3) + i25;
                                    Object obj4 = xVar.f4813b[i26];
                                    Object obj5 = xVar.f4814c[i26];
                                    if (obj5 instanceof i.b0) {
                                        i.b0 b0Var6 = (i.b0) obj5;
                                        Object[] objArr4 = b0Var6.f4722b;
                                        long[] jArr14 = b0Var6.f4721a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j13 = j19;
                                            int i27 = 0;
                                            while (true) {
                                                long j20 = jArr14[i27];
                                                jArr5 = jArr13;
                                                i8 = length4;
                                                if ((((~j20) << c4) & j20 & j10) != j10) {
                                                    int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                                    for (int i29 = 0; i29 < i28; i29 = i9 + 1) {
                                                        if ((j20 & j9) < j8) {
                                                            i9 = i29;
                                                            int i30 = (i27 << 3) + i9;
                                                            j14 = j20;
                                                            p1 p1Var = (p1) objArr4[i30];
                                                            if (b0Var5.c(p1Var) || b0Var4.c(p1Var)) {
                                                                b0Var6.k(i30);
                                                            }
                                                        } else {
                                                            i9 = i29;
                                                            j14 = j20;
                                                        }
                                                        j20 = j14 >> 8;
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
                                            j13 = j19;
                                        }
                                        z9 = b0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i8 = length4;
                                        j13 = j19;
                                        r6.k.d(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        p1 p1Var2 = (p1) obj5;
                                        z9 = b0Var5.c(p1Var2) || b0Var4.c(p1Var2);
                                    }
                                    if (z9) {
                                        xVar.h(i26);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i8 = length4;
                                    j13 = j19;
                                }
                                j19 = j13 >> 8;
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
                b0Var5.b();
                h();
                return;
            }
        }
        if (b0Var4.h()) {
            i.x xVar2 = (i.x) cVar2.f1394g;
            long[] jArr15 = xVar2.f4812a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i32 = 0;
                while (true) {
                    long j21 = jArr15[i32];
                    if ((((~j21) << c4) & j21 & j10) != j10) {
                        int i33 = 8 - ((~(i32 - length6)) >>> 31);
                        int i34 = 0;
                        while (i34 < i33) {
                            if ((j21 & j9) < j8) {
                                int i35 = (i32 << 3) + i34;
                                Object obj6 = xVar2.f4813b[i35];
                                Object obj7 = xVar2.f4814c[i35];
                                if (obj7 instanceof i.b0) {
                                    i.b0 b0Var7 = (i.b0) obj7;
                                    Object[] objArr5 = b0Var7.f4722b;
                                    long[] jArr16 = b0Var7.f4721a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j11 = j21;
                                        int i36 = 0;
                                        while (true) {
                                            long j22 = jArr16[i36];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j22) << c4) & j22 & j10) != j10) {
                                                int i37 = 8 - ((~(i36 - length7)) >>> 31);
                                                int i38 = 0;
                                                while (i38 < i37) {
                                                    if ((j22 & j9) < j8) {
                                                        jArr3 = jArr15;
                                                        int i39 = (i36 << 3) + i38;
                                                        j12 = j22;
                                                        if (b0Var4.c((p1) objArr6[i39])) {
                                                            b0Var7.k(i39);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j12 = j22;
                                                    }
                                                    i38++;
                                                    jArr15 = jArr3;
                                                    j22 = j12 >> 8;
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
                                        j11 = j21;
                                    }
                                    c6 = b0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j11 = j21;
                                    r6.k.d(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    c6 = b0Var4.c((p1) obj7);
                                }
                                if (c6) {
                                    xVar2.h(i35);
                                }
                            } else {
                                jArr2 = jArr15;
                                j11 = j21;
                            }
                            i34++;
                            j21 = j11 >> 8;
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
            b0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f3931i) {
            try {
                e(this.f3938p);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f3932j.f4718f.g()) {
                            i.a0 a0Var = this.f3932j;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!a0Var.f4718f.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = a0Var.iterator();
                                    while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                        u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                        ((i.z) it).remove();
                                        u1Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e9) {
                        a();
                        throw e9;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(h0.a aVar) {
        t tVar;
        long[] jArr;
        int i7;
        t tVar2;
        long[] jArr2;
        long j8;
        char c4;
        long j9;
        int i8;
        boolean z8;
        b1.b bVar = this.f3929g;
        h0.a aVar2 = this.f3939q;
        t tVar3 = new t(this.f3932j);
        try {
            if (aVar.f4587g.W()) {
                if (aVar2.f4587g.W()) {
                    tVar3.d();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    a2 w4 = this.f3933k.w();
                    int i9 = 0;
                    try {
                        aVar.f4587g.V(bVar, w4, tVar3);
                        w4.e(true);
                        bVar.w();
                        Trace.endSection();
                        tVar3.e();
                        ArrayList arrayList = (ArrayList) tVar3.f3894e;
                        if (!arrayList.isEmpty()) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((q6.a) arrayList.get(i10)).a();
                                }
                                arrayList.clear();
                                Trace.endSection();
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (this.f3942t) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f3942t = false;
                                i.x xVar = (i.x) this.f3934l.f1394g;
                                long[] jArr3 = xVar.f4812a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j10 = jArr3[i11];
                                        char c6 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = i9;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < 128) {
                                                    c4 = c6;
                                                    int i15 = (i11 << 3) + i14;
                                                    j9 = j11;
                                                    Object obj = xVar.f4813b[i15];
                                                    Object obj2 = xVar.f4814c[i15];
                                                    if (obj2 instanceof i.b0) {
                                                        i.b0 b0Var = (i.b0) obj2;
                                                        Object[] objArr = b0Var.f4722b;
                                                        long[] jArr4 = b0Var.f4721a;
                                                        int i16 = i12;
                                                        int length2 = jArr4.length - 2;
                                                        i7 = i14;
                                                        tVar2 = tVar3;
                                                        jArr2 = jArr3;
                                                        if (length2 >= 0) {
                                                            int i17 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i17];
                                                                    j8 = j10;
                                                                    if ((((~j12) << c4) & j12 & j9) != j9) {
                                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                int i20 = (i17 << 3) + i19;
                                                                                if (!((p1) objArr[i20]).b()) {
                                                                                    b0Var.k(i20);
                                                                                }
                                                                            }
                                                                            j12 >>= i16;
                                                                        }
                                                                        if (i18 != i16) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i17 == length2) {
                                                                        break;
                                                                    }
                                                                    i17++;
                                                                    i16 = 8;
                                                                    j10 = j8;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j8 = j10;
                                                        }
                                                        z8 = b0Var.g();
                                                    } else {
                                                        i7 = i14;
                                                        tVar2 = tVar3;
                                                        jArr2 = jArr3;
                                                        j8 = j10;
                                                        r6.k.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        z8 = !((p1) obj2).b();
                                                    }
                                                    if (z8) {
                                                        xVar.h(i15);
                                                    }
                                                    i8 = 8;
                                                } else {
                                                    i7 = i14;
                                                    tVar2 = tVar3;
                                                    jArr2 = jArr3;
                                                    j8 = j10;
                                                    c4 = c6;
                                                    j9 = j11;
                                                    i8 = i12;
                                                }
                                                j10 = j8 >> i8;
                                                i14 = i7 + 1;
                                                i12 = i8;
                                                c6 = c4;
                                                j11 = j9;
                                                tVar3 = tVar2;
                                                jArr3 = jArr2;
                                            }
                                            tVar = tVar3;
                                            jArr = jArr3;
                                            if (i13 != i12) {
                                                break;
                                            }
                                        } else {
                                            tVar = tVar3;
                                            jArr = jArr3;
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                        tVar3 = tVar;
                                        jArr3 = jArr;
                                        i9 = 0;
                                    }
                                } else {
                                    tVar = tVar3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            tVar = tVar3;
                        }
                        if (aVar2.f4587g.W()) {
                            tVar.d();
                        }
                    } catch (Throwable th4) {
                        try {
                            w4.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (aVar2.f4587g.W()) {
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (aVar2.f4587g.W()) {
                tVar3.d();
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f3931i) {
            try {
                if (this.f3939q.f4587g.X()) {
                    e(this.f3939q);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f3932j.f4718f.g()) {
                            i.a0 a0Var = this.f3932j;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!a0Var.f4718f.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = a0Var.iterator();
                                    while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                        u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                        ((i.z) it).remove();
                                        u1Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e9) {
                        a();
                        throw e9;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f3931i) {
            try {
                this.f3944v.f3840u = null;
                if (!this.f3932j.f4718f.g()) {
                    i.a0 a0Var = this.f3932j;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!a0Var.f4718f.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = a0Var.iterator();
                            while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                ((i.z) it).remove();
                                u1Var.b();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f3932j.f4718f.g()) {
                            i.a0 a0Var2 = this.f3932j;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!a0Var2.f4718f.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = a0Var2.iterator();
                                    while (((y6.g) ((i.z) it2).f4832h).hasNext()) {
                                        u1 u1Var2 = (u1) ((y6.g) ((i.z) it2).f4832h).next();
                                        ((i.z) it2).remove();
                                        u1Var2.b();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e9) {
                        a();
                        throw e9;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c4;
        long j8;
        long j9;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i7;
        long j11;
        char c6;
        long j12;
        long j13;
        int i8;
        boolean z8;
        int i9;
        long j14;
        i.x xVar = (i.x) this.f3937o.f1394g;
        long[] jArr3 = xVar.f4812a;
        int length = jArr3.length - 2;
        char c9 = 7;
        long j15 = -9187201950435737472L;
        int i10 = 8;
        if (length >= 0) {
            int i11 = 0;
            long j16 = 128;
            while (true) {
                long j17 = jArr3[i11];
                j9 = 255;
                if ((((~j17) << c9) & j17 & j15) != j15) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j17 & 255) < j16) {
                            c6 = c9;
                            int i14 = (i11 << 3) + i13;
                            j12 = j15;
                            Object obj = xVar.f4813b[i14];
                            Object obj2 = xVar.f4814c[i14];
                            boolean z9 = obj2 instanceof i.b0;
                            b6.c cVar = this.f3934l;
                            if (z9) {
                                i.b0 b0Var = (i.b0) obj2;
                                Object[] objArr = b0Var.f4722b;
                                long[] jArr4 = b0Var.f4721a;
                                j13 = j16;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j11 = j17;
                                    int i15 = i10;
                                    int i16 = 0;
                                    while (true) {
                                        long j18 = jArr4[i16];
                                        jArr2 = jArr3;
                                        i7 = length;
                                        if ((((~j18) << c6) & j18 & j12) != j12) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j18 & 255) < j13) {
                                                    i9 = i18;
                                                    int i19 = (i16 << 3) + i9;
                                                    j14 = j18;
                                                    if (!((i.x) cVar.f1394g).b((e0) objArr[i19])) {
                                                        b0Var.k(i19);
                                                    }
                                                } else {
                                                    i9 = i18;
                                                    j14 = j18;
                                                }
                                                j18 = j14 >> i15;
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
                                        length = i7;
                                        i15 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i7 = length;
                                    j11 = j17;
                                }
                                z8 = b0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i7 = length;
                                j11 = j17;
                                j13 = j16;
                                r6.k.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                z8 = !((i.x) cVar.f1394g).b((e0) obj2);
                            }
                            if (z8) {
                                xVar.h(i14);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr3;
                            i7 = length;
                            j11 = j17;
                            c6 = c9;
                            j12 = j15;
                            j13 = j16;
                            i8 = i10;
                        }
                        j17 = j11 >> i8;
                        i13++;
                        i10 = i8;
                        c9 = c6;
                        j15 = j12;
                        j16 = j13;
                        jArr3 = jArr2;
                        length = i7;
                    }
                    jArr = jArr3;
                    int i20 = length;
                    c4 = c9;
                    j8 = j15;
                    j10 = j16;
                    if (i12 != i10) {
                        break;
                    } else {
                        length = i20;
                    }
                } else {
                    jArr = jArr3;
                    c4 = c9;
                    j8 = j15;
                    j10 = j16;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                c9 = c4;
                j15 = j8;
                j16 = j10;
                jArr3 = jArr;
                i10 = 8;
            }
        } else {
            c4 = 7;
            j8 = -9187201950435737472L;
            j9 = 255;
            j10 = 128;
        }
        i.b0 b0Var2 = this.f3936n;
        if (!b0Var2.h()) {
            return;
        }
        Object[] objArr2 = b0Var2.f4722b;
        long[] jArr5 = b0Var2.f4721a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j19 = jArr5[i21];
            if ((((~j19) << c4) & j19 & j8) != j8) {
                int i22 = 8 - ((~(i21 - length3)) >>> 31);
                for (int i23 = 0; i23 < i22; i23++) {
                    if ((j19 & j9) < j10) {
                        int i24 = (i21 << 3) + i23;
                        if (!(((p1) objArr2[i24]).f3856g != null)) {
                            b0Var2.k(i24);
                        }
                    }
                    j19 >>= 8;
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

    public final void i(o0.a aVar) {
        try {
            synchronized (this.f3931i) {
                m();
                b6.c cVar = this.f3941s;
                this.f3941s = new b6.c(22);
                try {
                    this.f3943u.getClass();
                    this.f3928f.getClass();
                    p pVar = this.f3944v;
                    if (!pVar.f3824e.f4587g.W()) {
                        d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    pVar.n(cVar, aVar);
                } catch (Exception e9) {
                    this.f3941s = cVar;
                    throw e9;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f3932j.f4718f.g()) {
                    i.a0 a0Var = this.f3932j;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!a0Var.f4718f.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = a0Var.iterator();
                            while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                ((i.z) it).remove();
                                u1Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e10) {
                a();
                throw e10;
            }
        }
    }

    public final void j(o0.a aVar) {
        if (this.f3945w) {
            d.S("The composition is disposed");
            throw null;
        }
        this.f3928f.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f3931i) {
            try {
                boolean z8 = this.f3933k.f3975g > 0;
                try {
                    if (!z8) {
                        if (!this.f3932j.f4718f.g()) {
                        }
                        ((i.x) this.f3934l.f1394g).a();
                        ((i.x) this.f3937o.f1394g).a();
                        ((i.x) this.f3941s.f1394g).a();
                        this.f3938p.f4587g.U();
                        this.f3939q.f4587g.U();
                        p pVar = this.f3944v;
                        pVar.D.f3153f.clear();
                        pVar.f3837r.clear();
                        pVar.f3824e.f4587g.U();
                        pVar.f3840u = null;
                    }
                    t tVar = new t(this.f3932j);
                    if (z8) {
                        a2 w4 = this.f3933k.w();
                        try {
                            d.A(w4, tVar);
                            w4.e(true);
                            this.f3929g.w();
                            tVar.e();
                        } catch (Throwable th) {
                            w4.e(false);
                            throw th;
                        }
                    }
                    tVar.d();
                    Trace.endSection();
                    ((i.x) this.f3934l.f1394g).a();
                    ((i.x) this.f3937o.f1394g).a();
                    ((i.x) this.f3941s.f1394g).a();
                    this.f3938p.f4587g.U();
                    this.f3939q.f4587g.U();
                    p pVar2 = this.f3944v;
                    pVar2.D.f3153f.clear();
                    pVar2.f3837r.clear();
                    pVar2.f3824e.f4587g.U();
                    pVar2.f3840u = null;
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
        synchronized (this.f3931i) {
            try {
                p pVar = this.f3944v;
                if (pVar.E) {
                    d.S("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f3945w) {
                    this.f3945w = true;
                    o0.a aVar = i.f3749b;
                    h0.a aVar2 = pVar.K;
                    if (aVar2 != null) {
                        e(aVar2);
                    }
                    boolean z8 = this.f3933k.f3975g > 0;
                    if (z8 || !this.f3932j.f4718f.g()) {
                        t tVar = new t(this.f3932j);
                        if (z8) {
                            a2 w4 = this.f3933k.w();
                            try {
                                d.N(w4, tVar);
                                w4.e(true);
                                this.f3929g.b();
                                this.f3929g.w();
                                tVar.e();
                            } catch (Throwable th) {
                                w4.e(false);
                                throw th;
                            }
                        }
                        tVar.d();
                    }
                    p pVar2 = this.f3944v;
                    pVar2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        pVar2.f3821b.n(pVar2);
                        pVar2.D.f3153f.clear();
                        pVar2.f3837r.clear();
                        pVar2.f3824e.f4587g.U();
                        pVar2.f3840u = null;
                        pVar2.f3820a.b();
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
        this.f3928f.o(this);
    }

    public final void m() {
        Object obj = d.f3706g;
        AtomicReference atomicReference = this.f3930h;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f3930h;
        Object andSet = atomicReference.getAndSet(null);
        if (r6.k.a(andSet, d.f3706g)) {
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
            d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) {
        i.a0 a0Var = this.f3932j;
        if (arrayList.size() > 0) {
            ((x0) ((d6.j) arrayList.get(0)).f2618f).getClass();
            throw null;
        }
        d.O(true);
        try {
            p pVar = this.f3944v;
            pVar.getClass();
            try {
                pVar.y(arrayList);
                pVar.i();
            } catch (Throwable th) {
                pVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!a0Var.f4718f.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!a0Var.f4718f.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = a0Var.iterator();
                            while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                ((i.z) it).remove();
                                u1Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e9) {
                a();
                throw e9;
            }
        }
    }

    public final int p(p1 p1Var, Object obj) {
        int P;
        int i7 = p1Var.f3850a;
        if ((i7 & 2) != 0) {
            p1Var.f3850a = i7 | 4;
        }
        c cVar = p1Var.f3852c;
        if (cVar != null && cVar.a()) {
            y1 y1Var = this.f3933k;
            y1Var.getClass();
            if (!(cVar.a() && (P = d.P(y1Var.f3981m, cVar.f3695a, y1Var.f3975g)) >= 0 && r6.k.a(y1Var.f3981m.get(P), cVar))) {
                synchronized (this.f3931i) {
                }
                return 1;
            }
            if (p1Var.f3853d != null) {
                synchronized (this.f3931i) {
                    try {
                        p pVar = this.f3944v;
                        if (pVar.E && pVar.W(p1Var, obj)) {
                            return 4;
                        }
                        this.f3943u.getClass();
                        this.f3928f.getClass();
                        if (obj == null) {
                            ((i.x) this.f3941s.f1394g).i(p1Var, t0.f3902j);
                        } else if (obj instanceof e0) {
                            Object e9 = ((i.x) this.f3941s.f1394g).e(p1Var);
                            if (e9 != null) {
                                if (e9 instanceof i.b0) {
                                    i.b0 b0Var = (i.b0) e9;
                                    Object[] objArr = b0Var.f4722b;
                                    long[] jArr = b0Var.f4721a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        loop0: while (true) {
                                            long j8 = jArr[i8];
                                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                for (int i10 = 0; i10 < i9; i10++) {
                                                    if ((255 & j8) < 128 && objArr[(i8 << 3) + i10] == t0.f3902j) {
                                                        break loop0;
                                                    }
                                                    j8 >>= 8;
                                                }
                                                if (i9 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i8 == length) {
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                } else if (e9 == t0.f3902j) {
                                }
                            }
                            this.f3941s.n(p1Var, obj);
                        } else {
                            ((i.x) this.f3941s.f1394g).i(p1Var, t0.f3902j);
                        }
                        this.f3928f.i(this);
                        return this.f3944v.E ? 3 : 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return 1;
    }

    public final void q() {
        u uVar;
        synchronized (this.f3931i) {
            try {
                for (Object obj : this.f3933k.f3976h) {
                    p1 p1Var = obj instanceof p1 ? (p1) obj : null;
                    if (p1Var != null && (uVar = p1Var.f3851b) != null) {
                        uVar.p(p1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object e9 = ((i.x) this.f3934l.f1394g).e(obj);
        if (e9 == null) {
            return;
        }
        boolean z8 = e9 instanceof i.b0;
        b6.c cVar = this.f3940r;
        if (!z8) {
            p1 p1Var = (p1) e9;
            if (p1Var.c(obj) == 4) {
                cVar.n(obj, p1Var);
                return;
            }
            return;
        }
        i.b0 b0Var = (i.b0) e9;
        Object[] objArr = b0Var.f4722b;
        long[] jArr = b0Var.f4721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j8) < 128) {
                        p1 p1Var2 = (p1) objArr[(i7 << 3) + i9];
                        if (p1Var2.c(obj) == 4) {
                            cVar.n(obj, p1Var2);
                        }
                    }
                    j8 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Set set) {
        boolean z8 = set instanceof i0.f;
        b6.c cVar = this.f3937o;
        b6.c cVar2 = this.f3934l;
        if (z8) {
            i.b0 b0Var = ((i0.f) set).f4853f;
            Object[] objArr = b0Var.f4722b;
            long[] jArr = b0Var.f4721a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                loop0: while (true) {
                    long j8 = jArr[i7];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j8) < 128) {
                                Object obj = objArr[(i7 << 3) + i9];
                                if (((i.x) cVar2.f1394g).b(obj) || ((i.x) cVar.f1394g).b(obj)) {
                                    break loop0;
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (((i.x) cVar2.f1394g).b(obj2) || ((i.x) cVar.f1394g).b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean t() {
        boolean B;
        synchronized (this.f3931i) {
            try {
                m();
                try {
                    b6.c cVar = this.f3941s;
                    this.f3941s = new b6.c(22);
                    try {
                        this.f3943u.getClass();
                        this.f3928f.getClass();
                        B = this.f3944v.B(cVar);
                        if (!B) {
                            n();
                        }
                    } catch (Exception e9) {
                        this.f3941s = cVar;
                        throw e9;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f3932j.f4718f.g()) {
                            i.a0 a0Var = this.f3932j;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!a0Var.f4718f.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = a0Var.iterator();
                                    while (((y6.g) ((i.z) it).f4832h).hasNext()) {
                                        u1 u1Var = (u1) ((y6.g) ((i.z) it).f4832h).next();
                                        ((i.z) it).remove();
                                        u1Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        a();
                        throw e10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    public final void u(i0.f fVar) {
        Object obj;
        boolean z8;
        i0.f fVar2;
        do {
            obj = this.f3930h.get();
            z8 = true;
            if (obj == null ? true : obj.equals(d.f3706g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f3930h).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f3930h;
            while (true) {
                if (atomicReference.compareAndSet(obj, fVar2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z8 = false;
                    break;
                }
            }
        } while (!z8);
        if (obj == null) {
            synchronized (this.f3931i) {
                n();
            }
        }
    }

    public final void v(Object obj) {
        p1 v5;
        boolean z8;
        boolean z9;
        int i7;
        int i8;
        p pVar = this.f3944v;
        if (pVar.f3845z <= 0 && (v5 = pVar.v()) != null) {
            boolean z10 = true;
            int i9 = v5.f3850a | 1;
            v5.f3850a = i9;
            if ((i9 & 32) == 0) {
                i.u uVar = v5.f3855f;
                if (uVar == null) {
                    uVar = new i.u();
                    v5.f3855f = uVar;
                }
                int i10 = v5.f3854e;
                int b9 = uVar.b(obj);
                if (b9 < 0) {
                    b9 = ~b9;
                    i8 = -1;
                } else {
                    i8 = uVar.f4800c[b9];
                }
                uVar.f4799b[b9] = obj;
                uVar.f4800c[b9] = i10;
                if (i8 == v5.f3854e) {
                    return;
                }
            }
            if (obj instanceof q0.v) {
                ((q0.v) obj).d(1);
            }
            this.f3934l.n(obj, v5);
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                d0 f9 = e0Var.f();
                b6.c cVar = this.f3937o;
                cVar.x(obj);
                i.u uVar2 = f9.f3711e;
                Object[] objArr = uVar2.f4799b;
                long[] jArr = uVar2.f4798a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j8 = jArr[i11];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j8 & 255) < 128) {
                                    i7 = i12;
                                    q0.u uVar3 = (q0.u) objArr[(i11 << 3) + i14];
                                    if (uVar3 instanceof q0.v) {
                                        z9 = true;
                                        ((q0.v) uVar3).d(1);
                                    } else {
                                        z9 = true;
                                    }
                                    cVar.n(uVar3, obj);
                                } else {
                                    z9 = z10;
                                    i7 = i12;
                                }
                                j8 >>= i7;
                                i14++;
                                z10 = z9;
                                i12 = i7;
                            }
                            z8 = z10;
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z8 = z10;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z10 = z8;
                    }
                }
                Object obj2 = f9.f3712f;
                i.x xVar = v5.f3856g;
                if (xVar == null) {
                    xVar = new i.x();
                    v5.f3856g = xVar;
                }
                xVar.i(e0Var, obj2);
            }
        }
    }

    public final void w(Object obj) {
        synchronized (this.f3931i) {
            try {
                r(obj);
                Object e9 = ((i.x) this.f3937o.f1394g).e(obj);
                if (e9 != null) {
                    if (e9 instanceof i.b0) {
                        i.b0 b0Var = (i.b0) e9;
                        Object[] objArr = b0Var.f4722b;
                        long[] jArr = b0Var.f4721a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j8 = jArr[i7];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((255 & j8) < 128) {
                                            r((e0) objArr[(i7 << 3) + i9]);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i8 != 8) {
                                        break;
                                    }
                                }
                                if (i7 == length) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        r((e0) e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
