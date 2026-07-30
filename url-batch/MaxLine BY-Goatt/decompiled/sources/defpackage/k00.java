package defpackage;

import android.os.Trace;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k00 implements c00 {
    public boolean A;
    public k00 B;
    public int C;
    public final ar0 D;
    public final q82 E;
    public final a00 F;
    public int G;
    public Function2 H;
    public final d00 m;
    public final t13 n;
    public final AtomicReference o = new AtomicReference(null);
    public final Object p = new Object();
    public final wn1 q;
    public final wl2 r;
    public final tn1 s;
    public final un1 t;
    public final un1 u;
    public final tn1 v;
    public final et w;
    public final et x;
    public final tn1 y;
    public tn1 z;

    public k00(d00 d00Var, t13 t13Var) {
        this.m = d00Var;
        this.n = t13Var;
        wn1 wn1Var = new wn1(new un1());
        this.q = wn1Var;
        wl2 wl2Var = new wl2();
        if (d00Var.c()) {
            wl2Var.w = new zm1();
        }
        if (d00Var.e()) {
            wl2Var.b();
        }
        this.r = wl2Var;
        this.s = z71.k();
        this.t = new un1();
        this.u = new un1();
        this.v = z71.k();
        et etVar = new et();
        this.w = etVar;
        et etVar2 = new et();
        this.x = etVar2;
        this.y = z71.k();
        this.z = z71.k();
        ar0 ar0Var = new ar0(14, d00Var);
        this.D = ar0Var;
        this.E = new q82();
        a00 a00Var = new a00(t13Var, d00Var, wl2Var, wn1Var, etVar, etVar2, ar0Var, this);
        d00Var.m(a00Var);
        this.F = a00Var;
        my myVar = ty.a;
    }

    public final void A(Function2 function2) {
        boolean i = i();
        p();
        d00 d00Var = this.m;
        if (!i) {
            this.H = function2;
            d00Var.a(this, function2);
            return;
        }
        a00 a00Var = this.F;
        a00Var.z = 100;
        a00Var.y = true;
        this.H = function2;
        d00Var.a(this, function2);
        a00Var.u();
    }

    public final void a() {
        this.o.set(null);
        this.w.s.U();
        this.x.s.U();
        wn1 wn1Var = this.q;
        if (wn1Var.m.g()) {
            return;
        }
        q82 q82Var = this.E;
        try {
            q82Var.e(wn1Var, this.F.A());
            q82Var.b();
        } finally {
            q82Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object g = this.s.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof un1;
        un1 un1Var = this.t;
        un1 un1Var2 = this.u;
        tn1 tn1Var = this.y;
        if (!z2) {
            n72 n72Var = (n72) g;
            if (z71.M(tn1Var, obj, n72Var) || n72Var.b(obj) == y41.m) {
                return;
            }
            if (n72Var.g == null || z) {
                un1Var.a(n72Var);
                return;
            } else {
                un1Var2.a(n72Var);
                return;
            }
        }
        un1 un1Var3 = (un1) g;
        Object[] objArr = un1Var3.b;
        long[] jArr = un1Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        n72 n72Var2 = (n72) objArr[(i << 3) + i3];
                        if (!z71.M(tn1Var, obj, n72Var2) && n72Var2.b(obj) != y41.m) {
                            if (n72Var2.g == null || z) {
                                un1Var.a(n72Var2);
                            } else {
                                un1Var2.a(n72Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
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

    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i;
        int i2;
        long[] jArr9;
        boolean z3 = set instanceof qe2;
        tn1 tn1Var = this.v;
        Object obj = null;
        int i3 = 8;
        if (z3) {
            un1 un1Var = ((qe2) set).m;
            Object[] objArr = un1Var.b;
            long[] jArr10 = un1Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c3 = c4;
                                if (obj2 instanceof n72) {
                                    ((n72) obj2).b(obj);
                                    jArr8 = jArr10;
                                    j8 = j9;
                                    i = length;
                                } else {
                                    b(obj2, z);
                                    Object g = tn1Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof un1) {
                                            un1 un1Var2 = (un1) g;
                                            Object[] objArr2 = un1Var2.b;
                                            long[] jArr11 = un1Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((ia0) objArr2[(i8 << 3) + i10], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            b((ia0) g, z);
                                        }
                                        Unit unit = Unit.a;
                                    }
                                    jArr8 = jArr10;
                                    j8 = j9;
                                    i = length;
                                    Unit unit2 = Unit.a;
                                }
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof n72) {
                    ((n72) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object g2 = tn1Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof un1) {
                            un1 un1Var3 = (un1) g2;
                            Object[] objArr3 = un1Var3.b;
                            long[] jArr13 = un1Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((ia0) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length3) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        } else {
                            b((ia0) g2, z);
                        }
                    }
                    Unit unit3 = Unit.a;
                }
            }
        }
        tn1 tn1Var2 = this.s;
        un1 un1Var4 = this.t;
        if (z) {
            un1 un1Var5 = this.u;
            if (un1Var5.h()) {
                long[] jArr14 = tn1Var2.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = tn1Var2.b[i18];
                                    Object obj5 = tn1Var2.c[i18];
                                    if (obj5 instanceof un1) {
                                        un1 un1Var6 = (un1) obj5;
                                        Object[] objArr4 = un1Var6.b;
                                        long[] jArr15 = un1Var6.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            n72 n72Var = (n72) objArr5[i22];
                                                            if (un1Var5.c(n72Var) || un1Var4.c(n72Var)) {
                                                                un1Var6.l(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = un1Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        n72 n72Var2 = (n72) obj5;
                                        z2 = un1Var5.c(n72Var2) || un1Var4.c(n72Var2);
                                    }
                                    if (z2) {
                                        tn1Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                un1Var5.b();
                h();
                return;
            }
        }
        if (un1Var4.h()) {
            long[] jArr17 = tn1Var2.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = tn1Var2.b[i26];
                                Object obj7 = tn1Var2.c[i26];
                                if (obj7 instanceof un1) {
                                    un1 un1Var7 = (un1) obj7;
                                    Object[] objArr6 = un1Var7.b;
                                    long[] jArr18 = un1Var7.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (un1Var4.c((n72) objArr7[i30])) {
                                                            un1Var7.l(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = un1Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = un1Var4.c((n72) obj7);
                                }
                                if (c2) {
                                    tn1Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            h();
            un1Var4.b();
        }
    }

    public final void d() {
        synchronized (this.p) {
            try {
                e(this.w);
                n();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.q.m.g()) {
                        q82 q82Var = this.E;
                        try {
                            q82Var.e(this.q, this.F.A());
                            q82Var.b();
                            q82Var.a();
                        } catch (Throwable th2) {
                            q82Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x01e3 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #5 {all -> 0x01e7, blocks: (B:143:0x01db, B:145:0x01e3), top: B:142:0x01db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(et etVar) {
        q82 q82Var;
        long[] jArr;
        int i;
        long[] jArr2;
        q82 q82Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        int i3;
        et etVar2 = this.x;
        a00 a00Var = this.F;
        i00 A = a00Var.A();
        q82 q82Var3 = this.E;
        q82Var3.e(this.q, A);
        try {
            if (etVar.s.W()) {
                try {
                    if (etVar2.s.W()) {
                        q82Var3.b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    t13 t13Var = this.n;
                    zl2 d = this.r.d();
                    int i4 = 0;
                    try {
                        etVar.U(t13Var, d, q82Var3, a00Var.A());
                        Unit unit = Unit.a;
                        d.e(true);
                        t13Var.g();
                        Trace.endSection();
                        q82Var3.c();
                        eo1 eo1Var = q82Var3.g;
                        if (eo1Var.o != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = eo1Var.m;
                                int i5 = eo1Var.o;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((Function0) objArr[i6]).invoke();
                                }
                                eo1Var.g();
                                Unit unit2 = Unit.a;
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.A) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.A = false;
                                tn1 tn1Var = this.s;
                                long[] jArr3 = tn1Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr3[i7];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8;
                                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                                            int i10 = i4;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i11 = (i7 << 3) + i10;
                                                    j2 = j4;
                                                    Object obj = tn1Var.b[i11];
                                                    Object obj2 = tn1Var.c[i11];
                                                    if (obj2 instanceof un1) {
                                                        un1 un1Var = (un1) obj2;
                                                        Object[] objArr2 = un1Var.b;
                                                        long[] jArr4 = un1Var.a;
                                                        int i12 = i8;
                                                        int length2 = jArr4.length - 2;
                                                        if (length2 >= 0) {
                                                            jArr2 = jArr3;
                                                            q82Var2 = q82Var3;
                                                            int i13 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i13];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                        int i15 = 0;
                                                                        while (i15 < i14) {
                                                                            if ((j5 & 255) < 128) {
                                                                                i3 = i10;
                                                                                int i16 = (i13 << 3) + i15;
                                                                                if (!((n72) objArr2[i16]).a()) {
                                                                                    un1Var.l(i16);
                                                                                }
                                                                            } else {
                                                                                i3 = i10;
                                                                            }
                                                                            j5 >>= i12;
                                                                            i15++;
                                                                            i10 = i3;
                                                                        }
                                                                        i = i10;
                                                                        if (i14 != i12) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        i = i10;
                                                                    }
                                                                    if (i13 == length2) {
                                                                        break;
                                                                    }
                                                                    i13++;
                                                                    j3 = j;
                                                                    i10 = i;
                                                                    i12 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i = i10;
                                                            jArr2 = jArr3;
                                                            q82Var2 = q82Var3;
                                                            j = j3;
                                                        }
                                                        z = un1Var.g();
                                                    } else {
                                                        i = i10;
                                                        jArr2 = jArr3;
                                                        q82Var2 = q82Var3;
                                                        j = j3;
                                                        obj2.getClass();
                                                        z = !((n72) obj2).a();
                                                    }
                                                    if (z) {
                                                        tn1Var.l(i11);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i10;
                                                    jArr2 = jArr3;
                                                    q82Var2 = q82Var3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i8;
                                                }
                                                j3 = j >> i2;
                                                i8 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                q82Var3 = q82Var2;
                                                jArr3 = jArr2;
                                                i10 = i + 1;
                                            }
                                            jArr = jArr3;
                                            q82Var = q82Var3;
                                            if (i9 != i8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            q82Var = q82Var3;
                                        }
                                        if (i7 == length) {
                                            break;
                                        }
                                        i7++;
                                        q82Var3 = q82Var;
                                        jArr3 = jArr;
                                        i4 = 0;
                                    }
                                } else {
                                    q82Var = q82Var3;
                                }
                                h();
                                Unit unit3 = Unit.a;
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            q82Var = q82Var3;
                        }
                        try {
                            if (etVar2.s.W()) {
                                q82Var.b();
                            }
                        } finally {
                            q82Var.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            d.e(false);
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
                    if (etVar2.s.W()) {
                        q82Var3.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (etVar2.s.W()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.p) {
            try {
                if (this.x.s.X()) {
                    e(this.x);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.q.m.g()) {
                        q82 q82Var = this.E;
                        try {
                            q82Var.e(this.q, this.F.A());
                            q82Var.b();
                            q82Var.a();
                        } catch (Throwable th2) {
                            q82Var.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    this.a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        q82 q82Var;
        synchronized (this.p) {
            try {
                this.F.v = null;
                if (!this.q.m.g()) {
                    q82Var = this.E;
                    try {
                        q82Var.e(this.q, this.F.A());
                        q82Var.b();
                        q82Var.a();
                    } finally {
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.q.m.g()) {
                        q82Var = this.E;
                        try {
                            q82Var.e(this.q, this.F.A());
                            q82Var.b();
                            q82Var.a();
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
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        tn1 tn1Var = this.v;
        long[] jArr3 = tn1Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = tn1Var.b[i10];
                            Object obj2 = tn1Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof un1;
                            j5 = j8;
                            tn1 tn1Var2 = this.s;
                            if (z2) {
                                un1 un1Var = (un1) obj2;
                                Object[] objArr = un1Var.b;
                                long[] jArr4 = un1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!tn1Var2.c((ia0) objArr[i15])) {
                                                        un1Var.l(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = un1Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !tn1Var2.c((ia0) obj2);
                            }
                            if (z) {
                                tn1Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        un1 un1Var2 = this.u;
        if (!un1Var2.h()) {
            return;
        }
        Object[] objArr2 = un1Var2.b;
        long[] jArr5 = un1Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((n72) objArr2[i20]).g == null) {
                            un1Var2.l(i20);
                        }
                    }
                    j11 >>= 8;
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

    public final boolean i() {
        boolean z;
        synchronized (this.p) {
            z = true;
            if (this.G != 1) {
                z = false;
            }
            if (z) {
                this.G = 0;
            }
        }
        return z;
    }

    public final void j(Function2 function2) {
        try {
            synchronized (this.p) {
                m();
                tn1 tn1Var = this.z;
                this.z = z71.k();
                try {
                    a00 a00Var = this.F;
                    if (!a00Var.e.s.W()) {
                        b00.c("Expected applyChanges() to have been called");
                    }
                    try {
                        a00Var.o(tn1Var, function2);
                        a00Var.P = null;
                        Unit unit = Unit.a;
                    } finally {
                        a00Var.P = null;
                    }
                } catch (Throwable th) {
                    this.z = tn1Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.q.m.g()) {
                    q82 q82Var = this.E;
                    try {
                        q82Var.e(this.q, this.F.A());
                        q82Var.b();
                        q82Var.a();
                    } catch (Throwable th3) {
                        q82Var.a();
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
        q82 q82Var;
        synchronized (this.p) {
            try {
                boolean z = this.r.n > 0;
                try {
                    try {
                        if (!z) {
                            if (!this.q.m.g()) {
                            }
                            this.s.a();
                            this.v.a();
                            this.z.a();
                            this.w.s.U();
                            this.x.s.U();
                            a00 a00Var = this.F;
                            a00Var.E.clear();
                            a00Var.s.clear();
                            a00Var.e.s.U();
                            a00Var.v = null;
                            this.G = 1;
                            Unit unit = Unit.a;
                        }
                        q82Var.e(this.q, this.F.A());
                        if (z) {
                            zl2 d = this.r.d();
                            try {
                                d.n(d.t, new ss(2, this.E, d));
                                Unit unit2 = Unit.a;
                                d.e(true);
                                this.n.g();
                                q82Var.c();
                            } catch (Throwable th) {
                                d.e(false);
                                throw th;
                            }
                        }
                        q82Var.b();
                        q82Var.a();
                        Unit unit3 = Unit.a;
                        this.s.a();
                        this.v.a();
                        this.z.a();
                        this.w.s.U();
                        this.x.s.U();
                        a00 a00Var2 = this.F;
                        a00Var2.E.clear();
                        a00Var2.s.clear();
                        a00Var2.e.s.U();
                        a00Var2.v = null;
                        this.G = 1;
                        Unit unit4 = Unit.a;
                    } catch (Throwable th2) {
                        q82Var.a();
                        throw th2;
                    }
                    q82Var = this.E;
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
        synchronized (this.p) {
            try {
                if (this.F.F) {
                    v32.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.G != 3) {
                    this.G = 3;
                    this.H = ty.b;
                    et etVar = this.F.L;
                    if (etVar != null) {
                        e(etVar);
                    }
                    int i = 1;
                    boolean z = this.r.n > 0;
                    if (z || !this.q.m.g()) {
                        q82 q82Var = this.E;
                        try {
                            q82Var.e(this.q, this.F.A());
                            if (z) {
                                zl2 d = this.r.d();
                                try {
                                    d.n(d.t, new ia(i, this.E));
                                    d.G();
                                    Unit unit = Unit.a;
                                    d.e(true);
                                    this.n.e();
                                    this.n.g();
                                    q82Var.c();
                                } catch (Throwable th) {
                                    d.e(false);
                                    throw th;
                                }
                            }
                            q82Var.b();
                            q82Var.a();
                        } catch (Throwable th2) {
                            q82Var.a();
                            throw th2;
                        }
                    }
                    a00 a00Var = this.F;
                    a00Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        a00Var.b.p(a00Var);
                        a00Var.E.clear();
                        a00Var.s.clear();
                        a00Var.e.s.U();
                        a00Var.v = null;
                        a00Var.a.e();
                        Unit unit2 = Unit.a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                Unit unit3 = Unit.a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.m.q(this);
    }

    public final void m() {
        Object obj = bd3.d;
        AtomicReference atomicReference = this.o;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                b00.d("pending composition has not been applied");
                throw new k81();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                b00.d("corrupt pendingModifications drain: " + atomicReference);
                throw new k81();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.o;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.b(andSet, bd3.d)) {
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
            b00.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new k81();
        }
        b00.d("corrupt pendingModifications drain: " + atomicReference);
        throw new k81();
    }

    public final void o() {
        fh0 fh0Var = fh0.m;
        AtomicReference atomicReference = this.o;
        Object andSet = atomicReference.getAndSet(fh0Var);
        if (Intrinsics.b(andSet, bd3.d) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            b00.d("corrupt pendingModifications drain: " + atomicReference);
            throw new k81();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i = this.G;
        if (i == 0) {
            return;
        }
        v32.b(i != 1 ? i != 2 ? i != 3 ? BuildConfig.FLAVOR : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        wn1 wn1Var = this.q;
        a00 a00Var = this.F;
        if (arrayList.size() > 0) {
            ((lm1) ((Pair) arrayList.get(0)).m).getClass();
            b00.c("Check failed");
        }
        try {
            a00Var.getClass();
            try {
                a00Var.C(arrayList);
                a00Var.i();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                a00Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!wn1Var.m.g()) {
                    q82 q82Var = this.E;
                    try {
                        q82Var.e(wn1Var, a00Var.A());
                        q82Var.b();
                        q82Var.a();
                    } catch (Throwable th3) {
                        q82Var.a();
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

    public final y41 r(n72 n72Var, Object obj) {
        k00 k00Var;
        int i = n72Var.b;
        if ((i & 2) != 0) {
            n72Var.b = i | 4;
        }
        m6 m6Var = n72Var.c;
        if (m6Var == null || !m6Var.a()) {
            return y41.m;
        }
        if (this.r.e(m6Var)) {
            if (n72Var.d == null) {
                return y41.m;
            }
            y41 t = t(n72Var, m6Var, obj);
            if (t != y41.m) {
                this.D.s();
            }
            return t;
        }
        synchronized (this.p) {
            k00Var = this.B;
        }
        if (k00Var != null) {
            a00 a00Var = k00Var.F;
            if (a00Var.F && a00Var.d0(n72Var, obj)) {
                return y41.p;
            }
        }
        return y41.m;
    }

    public final void s() {
        k00 k00Var;
        synchronized (this.p) {
            try {
                for (Object obj : this.r.o) {
                    n72 n72Var = obj instanceof n72 ? (n72) obj : null;
                    if (n72Var != null && (k00Var = n72Var.a) != null) {
                        k00Var.r(n72Var, null);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final y41 t(n72 n72Var, m6 m6Var, Object obj) {
        k00 k00Var;
        int i;
        synchronized (this.p) {
            try {
                k00 k00Var2 = this.B;
                if (k00Var2 != null) {
                    wl2 wl2Var = this.r;
                    int i2 = this.C;
                    if (wl2Var.s) {
                        b00.c("Writer is active");
                    }
                    if (i2 < 0 || i2 >= wl2Var.n) {
                        b00.c("Invalid group index");
                    }
                    if (wl2Var.e(m6Var)) {
                        int i3 = wl2Var.m[(i2 * 5) + 3] + i2;
                        int i4 = m6Var.a;
                        k00Var = (i2 <= i4 && i4 < i3) ? k00Var2 : null;
                    }
                    k00Var2 = null;
                }
                if (k00Var == null) {
                    a00 a00Var = this.F;
                    if (a00Var.F && a00Var.d0(n72Var, obj)) {
                        return y41.p;
                    }
                    if (obj == null) {
                        this.z.m(n72Var, by1.r);
                    } else {
                        boolean z = obj instanceof ia0;
                        tn1 tn1Var = this.z;
                        if (z) {
                            Object g = tn1Var.g(n72Var);
                            if (g != null) {
                                if (g instanceof un1) {
                                    un1 un1Var = (un1) g;
                                    Object[] objArr = un1Var.b;
                                    long[] jArr = un1Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8;
                                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                int i8 = 0;
                                                while (i8 < i7) {
                                                    if ((j & 255) < 128) {
                                                        i = i6;
                                                        if (objArr[(i5 << 3) + i8] == by1.r) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i = i6;
                                                    }
                                                    j >>= i;
                                                    i8++;
                                                    i6 = i;
                                                }
                                                if (i7 != i6) {
                                                    break;
                                                }
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else if (g == by1.r) {
                                }
                            }
                            z71.d(this.z, n72Var, obj);
                        } else {
                            tn1Var.m(n72Var, by1.r);
                        }
                    }
                }
                if (k00Var != null) {
                    return k00Var.t(n72Var, m6Var, obj);
                }
                this.m.j(this);
                return this.F.F ? y41.o : y41.n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g = this.s.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof un1;
        tn1 tn1Var = this.y;
        if (!z) {
            n72 n72Var = (n72) g;
            if (n72Var.b(obj) == y41.p) {
                z71.d(tn1Var, obj, n72Var);
                return;
            }
            return;
        }
        un1 un1Var = (un1) g;
        Object[] objArr = un1Var.b;
        long[] jArr = un1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        n72 n72Var2 = (n72) objArr[(i << 3) + i3];
                        if (n72Var2.b(obj) == y41.p) {
                            z71.d(tn1Var, obj, n72Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
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
    public final boolean v(Set set) {
        boolean z = set instanceof qe2;
        tn1 tn1Var = this.v;
        tn1 tn1Var2 = this.s;
        if (z) {
            un1 un1Var = ((qe2) set).m;
            Object[] objArr = un1Var.b;
            long[] jArr = un1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (tn1Var2.c(obj) || tn1Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
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
                if (tn1Var2.c(obj2) || tn1Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean X;
        synchronized (this.p) {
            m();
            try {
                tn1 tn1Var = this.z;
                this.z = z71.k();
                try {
                    a00 a00Var = this.F;
                    rw1 rw1Var = a00Var.e.s;
                    if (!rw1Var.W()) {
                        b00.c("Expected applyChanges() to have been called");
                    }
                    if (tn1Var.e > 0 || !a00Var.s.isEmpty()) {
                        try {
                            a00Var.o(tn1Var, null);
                            a00Var.P = null;
                            X = rw1Var.X();
                        } finally {
                            a00Var.P = null;
                        }
                    } else {
                        X = false;
                    }
                    if (!X) {
                        n();
                    }
                } catch (Throwable th) {
                    this.z = tn1Var;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.q.m.g()) {
                        q82 q82Var = this.E;
                        try {
                            q82Var.e(this.q, this.F.A());
                            q82Var.b();
                            q82Var.a();
                        } catch (Throwable th3) {
                            q82Var.a();
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
        return X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void x(qe2 qe2Var) {
        qe2 qe2Var2;
        while (true) {
            Object obj = this.o.get();
            if (obj == null || obj.equals(bd3.d)) {
                qe2Var2 = qe2Var;
            } else if (obj instanceof Set) {
                qe2Var2 = new Set[]{obj, qe2Var};
            } else {
                if (!(obj instanceof Object[])) {
                    b71.w(this.o, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = qe2Var;
                qe2Var2 = copyOf;
            }
            AtomicReference atomicReference = this.o;
            while (!atomicReference.compareAndSet(obj, qe2Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.p) {
                    n();
                    Unit unit = Unit.a;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Object obj) {
        n72 y;
        int i;
        boolean z;
        int i2;
        a00 a00Var = this.F;
        if (a00Var.A > 0 || (y = a00Var.y()) == null) {
            return;
        }
        int i3 = y.b | 1;
        y.b = i3;
        if ((i3 & 32) == 0) {
            hn1 hn1Var = y.f;
            if (hn1Var == null) {
                hn1Var = new hn1();
                y.f = hn1Var;
            }
            int i4 = y.e;
            int c = hn1Var.c(obj);
            if (c < 0) {
                c = ~c;
                i = -1;
            } else {
                i = hn1Var.c[c];
            }
            hn1Var.b[c] = obj;
            hn1Var.c[c] = i4;
            if (i == y.e) {
                z = true;
                this.D.s();
                if (z) {
                    if (obj instanceof zo2) {
                        ((zo2) obj).g(1);
                    }
                    z71.d(this.s, obj, y);
                    if (obj instanceof ia0) {
                        ia0 ia0Var = (ia0) obj;
                        ha0 i5 = ia0Var.i();
                        tn1 tn1Var = this.v;
                        z71.N(tn1Var, obj);
                        hn1 hn1Var2 = i5.e;
                        Object[] objArr = hn1Var2.b;
                        long[] jArr = hn1Var2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            yo2 yo2Var = (yo2) objArr[(i6 << 3) + i9];
                                            i2 = i7;
                                            if (yo2Var instanceof zo2) {
                                                ((zo2) yo2Var).g(1);
                                            }
                                            z71.d(tn1Var, yo2Var, obj);
                                        } else {
                                            i2 = i7;
                                        }
                                        j >>= i2;
                                        i9++;
                                        i7 = i2;
                                    }
                                    if (i8 != i7) {
                                        break;
                                    }
                                }
                                if (i6 == length) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                        Object obj2 = i5.f;
                        tn1 tn1Var2 = y.g;
                        if (tn1Var2 == null) {
                            tn1Var2 = new tn1();
                            y.g = tn1Var2;
                        }
                        tn1Var2.m(ia0Var, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.D.s();
        if (z) {
        }
    }

    public final void z(Object obj) {
        synchronized (this.p) {
            try {
                u(obj);
                Object g = this.v.g(obj);
                if (g != null) {
                    if (g instanceof un1) {
                        un1 un1Var = (un1) g;
                        Object[] objArr = un1Var.b;
                        long[] jArr = un1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((ia0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
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
                        u((ia0) g);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
