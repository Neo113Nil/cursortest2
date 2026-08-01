package n0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements n {
    public final s.h0 A;
    public s.h0 B;
    public boolean C;
    public q D;
    public int E;
    public final l.d F;
    public final c6.q G;
    public final i0 H;
    public int I;
    public Function2 J;

    /* renamed from: d, reason: collision with root package name */
    public final o f6777d;

    /* renamed from: e, reason: collision with root package name */
    public final a1.n f6778e;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f6779i = new AtomicReference(null);

    /* renamed from: r, reason: collision with root package name */
    public final Object f6780r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public final s.k0 f6781s;

    /* renamed from: t, reason: collision with root package name */
    public final q0.h f6782t;

    /* renamed from: u, reason: collision with root package name */
    public final s.h0 f6783u;

    /* renamed from: v, reason: collision with root package name */
    public final s.i0 f6784v;

    /* renamed from: w, reason: collision with root package name */
    public final s.i0 f6785w;

    /* renamed from: x, reason: collision with root package name */
    public final s.h0 f6786x;

    /* renamed from: y, reason: collision with root package name */
    public final r0.a f6787y;

    /* renamed from: z, reason: collision with root package name */
    public final r0.a f6788z;

    public q(o oVar, a1.n nVar) {
        this.f6777d = oVar;
        this.f6778e = nVar;
        s.k0 k0Var = new s.k0(new s.i0());
        this.f6781s = k0Var;
        q0.h hVar = new q0.h();
        if (oVar.c()) {
            hVar.f7756y = new s.w();
        }
        if (oVar.e()) {
            hVar.c();
        }
        this.f6782t = hVar;
        this.f6783u = z4.w.k();
        this.f6784v = new s.i0();
        this.f6785w = new s.i0();
        this.f6786x = z4.w.k();
        r0.a aVar = new r0.a();
        this.f6787y = aVar;
        r0.a aVar2 = new r0.a();
        this.f6788z = aVar2;
        this.A = z4.w.k();
        this.B = z4.w.k();
        l.d dVar = new l.d(10, oVar);
        this.F = dVar;
        this.G = new c6.q();
        i0 i0Var = new i0(nVar, oVar, q0.j.d(hVar), k0Var, aVar, aVar2, dVar, this);
        oVar.n(i0Var);
        this.H = i0Var;
        this.J = h.f6685a;
    }

    public final void a() {
        this.f6779i.set(null);
        this.f6787y.f8082a.i0();
        this.f6788z.f8082a.i0();
        s.k0 k0Var = this.f6781s;
        if (k0Var.f8341d.g()) {
            return;
        }
        c6.q qVar = this.G;
        try {
            qVar.m(k0Var, this.H.z());
            qVar.b();
        } finally {
            qVar.a();
        }
    }

    public final void b(Object obj, boolean z10) {
        int i3;
        Object g = this.f6783u.g(obj);
        if (g == null) {
            return;
        }
        boolean z11 = g instanceof s.i0;
        s.i0 i0Var = this.f6784v;
        s.i0 i0Var2 = this.f6785w;
        s.h0 h0Var = this.A;
        if (!z11) {
            s1 s1Var = (s1) g;
            if (z4.w.J(h0Var, obj, s1Var) || s1Var.b(obj) == o0.f6765d) {
                return;
            }
            if (s1Var.g == null || z10) {
                i0Var.a(s1Var);
                return;
            } else {
                i0Var2.a(s1Var);
                return;
            }
        }
        s.i0 i0Var3 = (s.i0) g;
        Object[] objArr = i0Var3.f8320b;
        long[] jArr = i0Var3.f8319a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j) < 128) {
                        s1 s1Var2 = (s1) objArr[(i10 << 3) + i13];
                        if (!z4.w.J(h0Var, obj, s1Var2)) {
                            i3 = i11;
                            if (s1Var2.b(obj) != o0.f6765d) {
                                if (s1Var2.g == null || z10) {
                                    i0Var.a(s1Var2);
                                } else {
                                    i0Var2.a(s1Var2);
                                }
                            }
                            j >>= i3;
                            i13++;
                            i11 = i3;
                        }
                    }
                    i3 = i11;
                    j >>= i3;
                    i13++;
                    i11 = i3;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(Set set, boolean z10) {
        long j;
        long j3;
        long j10;
        char c10;
        int i3;
        long[] jArr;
        long[] jArr2;
        long j11;
        boolean c11;
        long[] jArr3;
        long j12;
        long[] jArr4;
        long[] jArr5;
        int i10;
        long j13;
        boolean z11;
        int i11;
        long j14;
        long[] jArr6;
        long[] jArr7;
        char c12;
        long j15;
        int i12;
        int i13;
        long[] jArr8;
        boolean z12 = set instanceof o0.h;
        s.h0 h0Var = this.f6786x;
        Object obj = null;
        int i14 = 8;
        if (z12) {
            s.i0 i0Var = ((o0.h) set).f7331d;
            Object[] objArr = i0Var.f8320b;
            long[] jArr9 = i0Var.f8319a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j = 128;
                j3 = 255;
                while (true) {
                    long j16 = jArr9[i15];
                    char c13 = 7;
                    j10 = -9187201950435737472L;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j16 & 255) < 128) {
                                Object obj2 = objArr[(i15 << 3) + i17];
                                c12 = c13;
                                if (obj2 instanceof s1) {
                                    ((s1) obj2).b(obj);
                                } else {
                                    b(obj2, z10);
                                    Object g = h0Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof s.i0) {
                                            s.i0 i0Var2 = (s.i0) g;
                                            Object[] objArr2 = i0Var2.f8320b;
                                            long[] jArr10 = i0Var2.f8319a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = i14;
                                                i12 = length;
                                                int i19 = 0;
                                                while (true) {
                                                    long j17 = jArr10[i19];
                                                    j15 = j16;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j17) << c12) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((j17 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((y) objArr2[(i19 << 3) + i21], z10);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j17 >>= i18;
                                                            i21++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i20 != i18) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i19 == length2) {
                                                        break;
                                                    }
                                                    i19++;
                                                    jArr10 = jArr11;
                                                    j16 = j15;
                                                    jArr9 = jArr7;
                                                    i18 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j15 = j16;
                                            i12 = length;
                                            b((y) g, z10);
                                        }
                                        i13 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j15 = j16;
                                i12 = length;
                                i13 = 8;
                            } else {
                                jArr7 = jArr9;
                                c12 = c13;
                                j15 = j16;
                                i12 = length;
                                i13 = i14;
                            }
                            j16 = j15 >> i13;
                            i17++;
                            length = i12;
                            i14 = i13;
                            c13 = c12;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c10 = c13;
                        int i22 = length;
                        if (i16 != i14) {
                            break;
                        } else {
                            length = i22;
                        }
                    } else {
                        jArr6 = jArr9;
                        c10 = 7;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    jArr9 = jArr6;
                    obj = null;
                    i14 = 8;
                }
            } else {
                j = 128;
                j3 = 255;
                j10 = -9187201950435737472L;
                c10 = 7;
            }
        } else {
            j = 128;
            j3 = 255;
            j10 = -9187201950435737472L;
            c10 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof s1) {
                    ((s1) obj3).b(null);
                } else {
                    b(obj3, z10);
                    Object g2 = h0Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof s.i0) {
                            s.i0 i0Var3 = (s.i0) g2;
                            Object[] objArr3 = i0Var3.f8320b;
                            long[] jArr12 = i0Var3.f8319a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j18 = jArr12[i3];
                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i23 = 8 - ((~(i3 - length3)) >>> 31);
                                        for (int i24 = 0; i24 < i23; i24++) {
                                            if ((j18 & 255) < 128) {
                                                b((y) objArr3[(i3 << 3) + i24], z10);
                                            }
                                            j18 >>= 8;
                                        }
                                        if (i23 != 8) {
                                            break;
                                        }
                                    }
                                    i3 = i3 != length3 ? i3 + 1 : 0;
                                }
                            }
                        } else {
                            b((y) g2, z10);
                        }
                    }
                }
            }
        }
        s.h0 h0Var2 = this.f6783u;
        s.i0 i0Var4 = this.f6784v;
        if (z10) {
            s.i0 i0Var5 = this.f6785w;
            if (i0Var5.h()) {
                long[] jArr13 = h0Var2.f8312a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j19 = jArr13[i25];
                        if ((((~j19) << c10) & j19 & j10) != j10) {
                            int i26 = 8 - ((~(i25 - length4)) >>> 31);
                            int i27 = 0;
                            while (i27 < i26) {
                                if ((j19 & j3) < j) {
                                    int i28 = (i25 << 3) + i27;
                                    Object obj4 = h0Var2.f8313b[i28];
                                    Object obj5 = h0Var2.f8314c[i28];
                                    if (obj5 instanceof s.i0) {
                                        s.i0 i0Var6 = (s.i0) obj5;
                                        Object[] objArr4 = i0Var6.f8320b;
                                        long[] jArr14 = i0Var6.f8319a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j13 = j19;
                                            int i29 = 0;
                                            while (true) {
                                                long j20 = jArr14[i29];
                                                jArr5 = jArr13;
                                                i10 = length4;
                                                if ((((~j20) << c10) & j20 & j10) != j10) {
                                                    int i30 = 8 - ((~(i29 - length5)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31 = i11 + 1) {
                                                        if ((j20 & j3) < j) {
                                                            i11 = i31;
                                                            int i32 = (i29 << 3) + i11;
                                                            j14 = j20;
                                                            s1 s1Var = (s1) objArr4[i32];
                                                            if (i0Var5.c(s1Var) || i0Var4.c(s1Var)) {
                                                                i0Var6.l(i32);
                                                            }
                                                        } else {
                                                            i11 = i31;
                                                            j14 = j20;
                                                        }
                                                        j20 = j14 >> 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length5) {
                                                    break;
                                                }
                                                i29++;
                                                length4 = i10;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i10 = length4;
                                            j13 = j19;
                                        }
                                        z11 = i0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i10 = length4;
                                        j13 = j19;
                                        obj5.getClass();
                                        s1 s1Var2 = (s1) obj5;
                                        z11 = i0Var5.c(s1Var2) || i0Var4.c(s1Var2);
                                    }
                                    if (z11) {
                                        h0Var2.l(i28);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i10 = length4;
                                    j13 = j19;
                                }
                                j19 = j13 >> 8;
                                i27++;
                                length4 = i10;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i33 = length4;
                            if (i26 != 8) {
                                break;
                            } else {
                                length4 = i33;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i25 == length4) {
                            break;
                        }
                        i25++;
                        jArr13 = jArr4;
                    }
                }
                i0Var5.b();
                h();
                return;
            }
        }
        if (i0Var4.h()) {
            long[] jArr15 = h0Var2.f8312a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i34 = 0;
                while (true) {
                    long j21 = jArr15[i34];
                    if ((((~j21) << c10) & j21 & j10) != j10) {
                        int i35 = 8 - ((~(i34 - length6)) >>> 31);
                        int i36 = 0;
                        while (i36 < i35) {
                            if ((j21 & j3) < j) {
                                int i37 = (i34 << 3) + i36;
                                Object obj6 = h0Var2.f8313b[i37];
                                Object obj7 = h0Var2.f8314c[i37];
                                if (obj7 instanceof s.i0) {
                                    s.i0 i0Var7 = (s.i0) obj7;
                                    Object[] objArr5 = i0Var7.f8320b;
                                    long[] jArr16 = i0Var7.f8319a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j11 = j21;
                                        int i38 = 0;
                                        while (true) {
                                            long j22 = jArr16[i38];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j22) << c10) & j22 & j10) != j10) {
                                                int i39 = 8 - ((~(i38 - length7)) >>> 31);
                                                int i40 = 0;
                                                while (i40 < i39) {
                                                    if ((j22 & j3) < j) {
                                                        jArr3 = jArr15;
                                                        int i41 = (i38 << 3) + i40;
                                                        j12 = j22;
                                                        if (i0Var4.c((s1) objArr6[i41])) {
                                                            i0Var7.l(i41);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j12 = j22;
                                                    }
                                                    i40++;
                                                    jArr15 = jArr3;
                                                    j22 = j12 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i39 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i38 == length7) {
                                                break;
                                            }
                                            i38++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j11 = j21;
                                    }
                                    c11 = i0Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j11 = j21;
                                    obj7.getClass();
                                    c11 = i0Var4.c((s1) obj7);
                                }
                                if (c11) {
                                    h0Var2.l(i37);
                                }
                            } else {
                                jArr2 = jArr15;
                                j11 = j21;
                            }
                            i36++;
                            j21 = j11 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i35 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i34 == length6) {
                        break;
                    }
                    i34++;
                    jArr15 = jArr;
                }
            }
            h();
            i0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f6780r) {
            try {
                e(this.f6787y);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.f6781s.f8341d.g()) {
                        c6.q qVar = this.G;
                        try {
                            qVar.m(this.f6781s, this.H.z());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
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

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e0 A[Catch: all -> 0x01e4, TRY_LEAVE, TryCatch #1 {all -> 0x01e4, blocks: (B:133:0x01d8, B:135:0x01e0), top: B:132:0x01d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(r0.a aVar) {
        c6.q qVar;
        long[] jArr;
        int i3;
        long[] jArr2;
        c6.q qVar2;
        long j;
        char c10;
        long j3;
        int i10;
        boolean z10;
        r0.a aVar2 = this.f6788z;
        i0 i0Var = this.H;
        c1.f z11 = i0Var.z();
        c6.q qVar3 = this.G;
        qVar3.m(this.f6781s, z11);
        try {
            if (aVar.f8082a.k0()) {
                try {
                    if (aVar2.f8082a.k0()) {
                        qVar3.b();
                    }
                    return;
                } finally {
                }
            }
            a1.n nVar = this.f6778e;
            try {
                Trace.beginSection(nVar.equals(null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    q0.h hVar = this.f6782t;
                    c1.f z12 = i0Var.z();
                    q0.k f3 = q0.j.d(hVar).f();
                    int i11 = 0;
                    try {
                        aVar.i0(nVar, f3, qVar3, z12);
                        f3.e(true);
                        nVar.f();
                        Trace.endSection();
                        qVar3.c();
                        o0.e eVar = (o0.e) qVar3.g;
                        if (eVar.f7319i != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = eVar.f7317d;
                                int i12 = eVar.f7319i;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ((Function0) objArr[i13]).invoke();
                                }
                                eVar.g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.C) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.C = false;
                                s.h0 h0Var = this.f6783u;
                                long[] jArr3 = h0Var.f8312a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j10 = jArr3[i14];
                                        char c11 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = i11;
                                            while (i17 < i16) {
                                                if ((j10 & 255) < 128) {
                                                    c10 = c11;
                                                    int i18 = (i14 << 3) + i17;
                                                    j3 = j11;
                                                    Object obj = h0Var.f8313b[i18];
                                                    Object obj2 = h0Var.f8314c[i18];
                                                    if (obj2 instanceof s.i0) {
                                                        s.i0 i0Var2 = (s.i0) obj2;
                                                        Object[] objArr2 = i0Var2.f8320b;
                                                        long[] jArr4 = i0Var2.f8319a;
                                                        int i19 = i15;
                                                        int length2 = jArr4.length - 2;
                                                        i3 = i17;
                                                        jArr2 = jArr3;
                                                        qVar2 = qVar3;
                                                        if (length2 >= 0) {
                                                            int i20 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i20];
                                                                    j = j10;
                                                                    if ((((~j12) << c10) & j12 & j3) != j3) {
                                                                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                                                        for (int i22 = 0; i22 < i21; i22++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                int i23 = (i20 << 3) + i22;
                                                                                if (!((s1) objArr2[i23]).a()) {
                                                                                    i0Var2.l(i23);
                                                                                }
                                                                            }
                                                                            j12 >>= i19;
                                                                        }
                                                                        if (i21 != i19) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i20 == length2) {
                                                                        break;
                                                                    }
                                                                    i20++;
                                                                    i19 = 8;
                                                                    j10 = j;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j10;
                                                        }
                                                        z10 = i0Var2.g();
                                                    } else {
                                                        i3 = i17;
                                                        jArr2 = jArr3;
                                                        qVar2 = qVar3;
                                                        j = j10;
                                                        obj2.getClass();
                                                        z10 = !((s1) obj2).a();
                                                    }
                                                    if (z10) {
                                                        h0Var.l(i18);
                                                    }
                                                    i10 = 8;
                                                } else {
                                                    i3 = i17;
                                                    jArr2 = jArr3;
                                                    qVar2 = qVar3;
                                                    j = j10;
                                                    c10 = c11;
                                                    j3 = j11;
                                                    i10 = i15;
                                                }
                                                j10 = j >> i10;
                                                i17 = i3 + 1;
                                                i15 = i10;
                                                c11 = c10;
                                                j11 = j3;
                                                qVar3 = qVar2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            qVar = qVar3;
                                            if (i16 != i15) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            qVar = qVar3;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        qVar3 = qVar;
                                        jArr3 = jArr;
                                        i11 = 0;
                                    }
                                } else {
                                    qVar = qVar3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            qVar = qVar3;
                        }
                        try {
                            if (aVar2.f8082a.k0()) {
                                qVar.b();
                            }
                        } finally {
                            qVar.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            f3.e(false);
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
                    if (aVar2.f8082a.k0()) {
                        qVar3.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (aVar2.f8082a.k0()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f6780r) {
            try {
                r0.a aVar = this.f6788z;
                aVar.getClass();
                if (!aVar.f8082a.k0()) {
                    e(this.f6788z);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f6781s.f8341d.g()) {
                        c6.q qVar = this.G;
                        try {
                            qVar.m(this.f6781s, this.H.z());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
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
        c6.q qVar;
        synchronized (this.f6780r) {
            try {
                this.H.f6717v = null;
                if (!this.f6781s.f8341d.g()) {
                    qVar = this.G;
                    try {
                        qVar.m(this.f6781s, this.H.z());
                        qVar.b();
                        qVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f6781s.f8341d.g()) {
                        qVar = this.G;
                        try {
                            qVar.m(this.f6781s, this.H.z());
                            qVar.b();
                            qVar.a();
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
        char c10;
        long j;
        long j3;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i3;
        long j11;
        char c11;
        long j12;
        long j13;
        int i10;
        boolean z10;
        int i11;
        long j14;
        s.h0 h0Var = this.f6786x;
        long[] jArr3 = h0Var.f8312a;
        int length = jArr3.length - 2;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            long j16 = 128;
            while (true) {
                long j17 = jArr3[i13];
                j3 = 255;
                if ((((~j17) << c12) & j17 & j15) != j15) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j17 & 255) < j16) {
                            c11 = c12;
                            int i16 = (i13 << 3) + i15;
                            j12 = j15;
                            Object obj = h0Var.f8313b[i16];
                            Object obj2 = h0Var.f8314c[i16];
                            boolean z11 = obj2 instanceof s.i0;
                            s.h0 h0Var2 = this.f6783u;
                            if (z11) {
                                s.i0 i0Var = (s.i0) obj2;
                                Object[] objArr = i0Var.f8320b;
                                long[] jArr4 = i0Var.f8319a;
                                j13 = j16;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j11 = j17;
                                    int i17 = i12;
                                    int i18 = 0;
                                    while (true) {
                                        long j18 = jArr4[i18];
                                        jArr2 = jArr3;
                                        i3 = length;
                                        if ((((~j18) << c11) & j18 & j12) != j12) {
                                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j18 & 255) < j13) {
                                                    i11 = i20;
                                                    int i21 = (i18 << 3) + i11;
                                                    j14 = j18;
                                                    if (!h0Var2.c((y) objArr[i21])) {
                                                        i0Var.l(i21);
                                                    }
                                                } else {
                                                    i11 = i20;
                                                    j14 = j18;
                                                }
                                                j18 = j14 >> i17;
                                                i20 = i11 + 1;
                                            }
                                            if (i19 != i17) {
                                                break;
                                            }
                                        }
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        jArr3 = jArr2;
                                        length = i3;
                                        i17 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i3 = length;
                                    j11 = j17;
                                }
                                z10 = i0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i3 = length;
                                j11 = j17;
                                j13 = j16;
                                obj2.getClass();
                                z10 = !h0Var2.c((y) obj2);
                            }
                            if (z10) {
                                h0Var.l(i16);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i3 = length;
                            j11 = j17;
                            c11 = c12;
                            j12 = j15;
                            j13 = j16;
                            i10 = i12;
                        }
                        j17 = j11 >> i10;
                        i15++;
                        i12 = i10;
                        c12 = c11;
                        j15 = j12;
                        j16 = j13;
                        jArr3 = jArr2;
                        length = i3;
                    }
                    jArr = jArr3;
                    int i22 = length;
                    c10 = c12;
                    j = j15;
                    j10 = j16;
                    if (i14 != i12) {
                        break;
                    } else {
                        length = i22;
                    }
                } else {
                    jArr = jArr3;
                    c10 = c12;
                    j = j15;
                    j10 = j16;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c12 = c10;
                j15 = j;
                j16 = j10;
                jArr3 = jArr;
                i12 = 8;
            }
        } else {
            c10 = 7;
            j = -9187201950435737472L;
            j3 = 255;
            j10 = 128;
        }
        s.i0 i0Var2 = this.f6785w;
        if (!i0Var2.h()) {
            return;
        }
        Object[] objArr2 = i0Var2.f8320b;
        long[] jArr5 = i0Var2.f8319a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i23 = 0;
        while (true) {
            long j19 = jArr5[i23];
            if ((((~j19) << c10) & j19 & j) != j) {
                int i24 = 8 - ((~(i23 - length3)) >>> 31);
                for (int i25 = 0; i25 < i24; i25++) {
                    if ((j19 & j3) < j10) {
                        int i26 = (i23 << 3) + i25;
                        if (!(((s1) objArr2[i26]).g != null)) {
                            i0Var2.l(i26);
                        }
                    }
                    j19 >>= 8;
                }
                if (i24 != 8) {
                    return;
                }
            }
            if (i23 == length3) {
                return;
            } else {
                i23++;
            }
        }
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f6780r) {
            z10 = true;
            if (this.I != 1) {
                z10 = false;
            }
            if (z10) {
                this.I = 0;
            }
        }
        return z10;
    }

    public final void j(Function2 function2) {
        try {
            synchronized (this.f6780r) {
                m();
                s.h0 h0Var = this.B;
                this.B = z4.w.k();
                try {
                    i0 i0Var = this.H;
                    if (!i0Var.f6702e.f8082a.k0()) {
                        m.a("Expected applyChanges() to have been called");
                    }
                    i0Var.P = null;
                    try {
                        i0Var.n(h0Var, function2);
                    } finally {
                        i0Var.P = null;
                    }
                } catch (Throwable th) {
                    this.B = h0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f6781s.f8341d.g()) {
                    c6.q qVar = this.G;
                    try {
                        qVar.m(this.f6781s, this.H.z());
                        qVar.b();
                        qVar.a();
                    } catch (Throwable th3) {
                        qVar.a();
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

    public final void k() {
        c6.q qVar;
        synchronized (this.f6780r) {
            try {
                boolean z10 = this.f6782t.f7747e == 0;
                try {
                    try {
                        if (z10) {
                            if (!this.f6781s.f8341d.g()) {
                            }
                            this.f6783u.a();
                            this.f6786x.a();
                            this.B.a();
                            this.f6787y.f8082a.i0();
                            this.f6788z.f8082a.i0();
                            i0 i0Var = this.H;
                            i0Var.E.clear();
                            i0Var.f6714s.clear();
                            i0Var.f6702e.f8082a.i0();
                            i0Var.f6717v = null;
                            this.I = 1;
                        }
                        qVar.m(this.f6781s, this.H.z());
                        if (!z10) {
                            q0.h hVar = this.f6782t;
                            c6.q qVar2 = this.G;
                            q0.k f3 = hVar.f();
                            try {
                                f3.n(f3.f7777t, new b0.u(4, qVar2, f3));
                                f3.e(true);
                                this.f6778e.f();
                                qVar.c();
                            } catch (Throwable th) {
                                f3.e(false);
                                throw th;
                            }
                        }
                        qVar.b();
                        qVar.a();
                        this.f6783u.a();
                        this.f6786x.a();
                        this.B.a();
                        this.f6787y.f8082a.i0();
                        this.f6788z.f8082a.i0();
                        i0 i0Var2 = this.H;
                        i0Var2.E.clear();
                        i0Var2.f6714s.clear();
                        i0Var2.f6702e.f8082a.i0();
                        i0Var2.f6717v = null;
                        this.I = 1;
                    } catch (Throwable th2) {
                        qVar.a();
                        throw th2;
                    }
                    qVar = this.G;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f6780r) {
            try {
                if (this.H.F) {
                    n1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.I != 3) {
                    this.I = 3;
                    this.J = h.f6686b;
                    r0.a aVar = this.H.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z10 = this.f6782t.f7747e == 0;
                    if (!z10 || !this.f6781s.f8341d.g()) {
                        c6.q qVar = this.G;
                        try {
                            qVar.m(this.f6781s, this.H.z());
                            if (!z10) {
                                q0.h hVar = this.f6782t;
                                c6.q qVar2 = this.G;
                                q0.k f3 = hVar.f();
                                try {
                                    f3.n(f3.f7777t, new b1.y(2, qVar2));
                                    f3.H();
                                    f3.e(true);
                                    this.f6778e.n();
                                    this.f6778e.f();
                                    qVar.c();
                                } catch (Throwable th) {
                                    f3.e(false);
                                    throw th;
                                }
                            }
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th2) {
                            qVar.a();
                            throw th2;
                        }
                    }
                    i0 i0Var = this.H;
                    i0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        i0Var.f6699b.r(i0Var);
                        i0Var.E.clear();
                        i0Var.f6714s.clear();
                        i0Var.f6702e.f8082a.i0();
                        i0Var.f6717v = null;
                        i0Var.f6698a.n();
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
        this.f6777d.s(this);
    }

    public final void m() {
        Object obj = h.f6687c;
        AtomicReference atomicReference = this.f6779i;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                m.b("pending composition has not been applied");
                throw new hd.d();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                m.b("corrupt pendingModifications drain: " + atomicReference);
                throw new hd.d();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f6779i;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.a(andSet, h.f6687c)) {
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
            m.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            return;
        }
        m.b("corrupt pendingModifications drain: " + atomicReference);
        throw new hd.d();
    }

    public final void o() {
        kotlin.collections.l0 l0Var = kotlin.collections.l0.f5576d;
        AtomicReference atomicReference = this.f6779i;
        Object andSet = atomicReference.getAndSet(l0Var);
        if (Intrinsics.a(andSet, h.f6687c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            m.b("corrupt pendingModifications drain: " + atomicReference);
            throw new hd.d();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i3 = this.I;
        if (i3 == 0) {
            return;
        }
        n1.b(i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        s.k0 k0Var = this.f6781s;
        i0 i0Var = this.H;
        if (arrayList.size() > 0) {
            ((u0) ((Pair) arrayList.get(0)).f5552d).getClass();
            throw null;
        }
        try {
            i0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    i0Var.B(arrayList);
                    i0Var.i();
                } catch (Throwable th) {
                    i0Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!k0Var.f8341d.g()) {
                    c6.q qVar = this.G;
                    try {
                        qVar.m(k0Var, i0Var.z());
                        qVar.b();
                        qVar.a();
                    } catch (Throwable th3) {
                        qVar.a();
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

    public final o0 r(s1 s1Var, Object obj) {
        q qVar;
        int i3 = s1Var.f6810b;
        if ((i3 & 2) != 0) {
            s1Var.f6810b = i3 | 4;
        }
        q0.b bVar = s1Var.f6811c;
        if (bVar == null || !bVar.a()) {
            return o0.f6765d;
        }
        q0.h hVar = this.f6782t;
        hVar.getClass();
        q0.b bVar2 = s1Var.f6811c;
        if (bVar2 != null && hVar.g(i7.a.l(bVar2))) {
            if (s1Var.f6812d == null) {
                return o0.f6765d;
            }
            o0 s3 = s(s1Var, bVar, obj);
            if (s3 != o0.f6765d) {
                this.F.p();
            }
            return s3;
        }
        synchronized (this.f6780r) {
            qVar = this.D;
        }
        if (qVar != null) {
            i0 i0Var = qVar.H;
            if (i0Var.F && i0Var.b0(s1Var, obj)) {
                return o0.f6768r;
            }
        }
        return o0.f6765d;
    }

    public final o0 s(s1 s1Var, q0.b bVar, Object obj) {
        q qVar;
        synchronized (this.f6780r) {
            try {
                q qVar2 = this.D;
                if (qVar2 != null) {
                    q0.h hVar = this.f6782t;
                    int i3 = this.E;
                    if (hVar.f7752u) {
                        m.a("Writer is active");
                    }
                    if (i3 < 0 || i3 >= hVar.f7747e) {
                        m.a("Invalid group index");
                    }
                    q0.b l10 = i7.a.l(bVar);
                    if (hVar.g(l10)) {
                        int i10 = hVar.f7746d[(i3 * 5) + 3] + i3;
                        int i11 = l10.f7722a;
                        qVar = (i3 <= i11 && i11 < i10) ? qVar2 : null;
                    }
                    qVar2 = null;
                }
                if (qVar == null) {
                    i0 i0Var = this.H;
                    if (i0Var.F && i0Var.b0(s1Var, obj)) {
                        return o0.f6768r;
                    }
                    if (obj == null) {
                        this.B.m(s1Var, e.f6662t);
                    } else {
                        boolean z10 = obj instanceof y;
                        s.h0 h0Var = this.B;
                        if (z10) {
                            Object g = h0Var.g(s1Var);
                            if (g != null) {
                                if (g instanceof s.i0) {
                                    s.i0 i0Var2 = (s.i0) g;
                                    Object[] objArr = i0Var2.f8320b;
                                    long[] jArr = i0Var2.f8319a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i12 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i12];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                                for (int i14 = 0; i14 < i13; i14++) {
                                                    if ((255 & j) < 128 && objArr[(i12 << 3) + i14] == e.f6662t) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i13 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i12 == length) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                } else if (g == e.f6662t) {
                                }
                            }
                            z4.w.e(this.B, s1Var, obj);
                        } else {
                            h0Var.m(s1Var, e.f6662t);
                        }
                    }
                }
                if (qVar != null) {
                    return qVar.s(s1Var, bVar, obj);
                }
                this.f6777d.k(this);
                return this.H.F ? o0.f6767i : o0.f6766e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(Object obj) {
        Object g = this.f6783u.g(obj);
        if (g == null) {
            return;
        }
        boolean z10 = g instanceof s.i0;
        s.h0 h0Var = this.A;
        if (!z10) {
            s1 s1Var = (s1) g;
            if (s1Var.b(obj) == o0.f6768r) {
                z4.w.e(h0Var, obj, s1Var);
                return;
            }
            return;
        }
        s.i0 i0Var = (s.i0) g;
        Object[] objArr = i0Var.f8320b;
        long[] jArr = i0Var.f8319a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        s1 s1Var2 = (s1) objArr[(i3 << 3) + i11];
                        if (s1Var2.b(obj) == o0.f6768r) {
                            z4.w.e(h0Var, obj, s1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(Set set) {
        boolean z10 = set instanceof o0.h;
        s.h0 h0Var = this.f6786x;
        s.h0 h0Var2 = this.f6783u;
        if (z10) {
            s.i0 i0Var = ((o0.h) set).f7331d;
            Object[] objArr = i0Var.f8320b;
            long[] jArr = i0Var.f8319a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i3 << 3) + i11];
                                if (h0Var2.c(obj) || h0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
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
                if (h0Var2.c(obj2) || h0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        boolean z10;
        synchronized (this.f6780r) {
            m();
            try {
                s.h0 h0Var = this.B;
                this.B = z4.w.k();
                try {
                    i0 i0Var = this.H;
                    r0.k0 k0Var = i0Var.f6702e.f8082a;
                    if (!k0Var.k0()) {
                        m.a("Expected applyChanges() to have been called");
                    }
                    if (h0Var.f8316e > 0 || !i0Var.f6714s.isEmpty()) {
                        i0Var.P = null;
                        try {
                            i0Var.n(h0Var, null);
                            i0Var.P = null;
                            z10 = !k0Var.k0();
                        } catch (Throwable th) {
                            i0Var.P = null;
                            throw th;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        n();
                    }
                } catch (Throwable th2) {
                    this.B = h0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f6781s.f8341d.g()) {
                        c6.q qVar = this.G;
                        try {
                            qVar.m(this.f6781s, this.H.z());
                            qVar.b();
                            qVar.a();
                        } catch (Throwable th4) {
                            qVar.a();
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
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void w(o0.h hVar) {
        o0.h hVar2;
        while (true) {
            Object obj = this.f6779i.get();
            if (obj == null || obj.equals(h.f6687c)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    te.a1.h(this.f6779i, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = hVar;
                hVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f6779i;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f6780r) {
                    n();
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
    public final void x(Object obj) {
        s1 x10;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        i0 i0Var = this.H;
        if (i0Var.A > 0 || (x10 = i0Var.x()) == null) {
            return;
        }
        boolean z13 = true;
        int i11 = x10.f6810b | 1;
        x10.f6810b = i11;
        if ((i11 & 32) == 0) {
            s.c0 c0Var = x10.f6814f;
            if (c0Var == null) {
                c0Var = new s.c0();
                x10.f6814f = c0Var;
            }
            int i12 = x10.f6813e;
            int b10 = c0Var.b(obj);
            if (b10 < 0) {
                b10 = ~b10;
                i3 = -1;
            } else {
                i3 = c0Var.f8279c[b10];
            }
            c0Var.f8278b[b10] = obj;
            c0Var.f8279c[b10] = i12;
            if (i3 == x10.f6813e) {
                z10 = true;
                this.F.p();
                if (z10) {
                    if (obj instanceof b1.g0) {
                        ((b1.g0) obj).g(1);
                    }
                    z4.w.e(this.f6783u, obj, x10);
                    if (obj instanceof y) {
                        y yVar = (y) obj;
                        x i13 = yVar.i();
                        s.h0 h0Var = this.f6786x;
                        z4.w.K(h0Var, obj);
                        s.c0 c0Var2 = i13.f6842e;
                        Object[] objArr = c0Var2.f8278b;
                        long[] jArr = c0Var2.f8277a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j = jArr[i14];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        if ((j & 255) < 128) {
                                            i10 = i15;
                                            b1.f0 f0Var = (b1.f0) objArr[(i14 << 3) + i17];
                                            if (f0Var instanceof b1.g0) {
                                                z12 = true;
                                                ((b1.g0) f0Var).g(1);
                                            } else {
                                                z12 = true;
                                            }
                                            z4.w.e(h0Var, f0Var, obj);
                                        } else {
                                            z12 = z13;
                                            i10 = i15;
                                        }
                                        j >>= i10;
                                        i17++;
                                        z13 = z12;
                                        i15 = i10;
                                    }
                                    z11 = z13;
                                    if (i16 != i15) {
                                        break;
                                    }
                                } else {
                                    z11 = z13;
                                }
                                if (i14 == length) {
                                    break;
                                }
                                i14++;
                                z13 = z11;
                            }
                        }
                        Object obj2 = i13.f6843f;
                        s.h0 h0Var2 = x10.g;
                        if (h0Var2 == null) {
                            h0Var2 = new s.h0();
                            x10.g = h0Var2;
                        }
                        h0Var2.m(yVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        this.F.p();
        if (z10) {
        }
    }

    public final void y(Object obj) {
        synchronized (this.f6780r) {
            try {
                t(obj);
                Object g = this.f6786x.g(obj);
                if (g != null) {
                    if (g instanceof s.i0) {
                        s.i0 i0Var = (s.i0) g;
                        Object[] objArr = i0Var.f8320b;
                        long[] jArr = i0Var.f8319a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((255 & j) < 128) {
                                            t((y) objArr[(i3 << 3) + i11]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i10 != 8) {
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
                        t((y) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Function2 function2) {
        boolean i3 = i();
        p();
        o oVar = this.f6777d;
        if (!i3) {
            this.J = function2;
            oVar.a(this, function2);
            return;
        }
        i0 i0Var = this.H;
        i0Var.f6721z = 0;
        i0Var.f6720y = true;
        this.J = function2;
        oVar.a(this, function2);
        i0Var.s();
    }
}
