package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tl implements ll {
    public int A;
    public Function2 B;
    public final ml d;
    public final mk1 e;
    public final AtomicReference g = new AtomicReference(null);
    public final Object h = new Object();
    public final yn0 i;
    public final ab1 j;
    public final vn0 k;
    public final wn0 l;
    public final wn0 m;
    public final vn0 n;
    public final dg o;
    public final dg p;
    public final vn0 q;
    public vn0 r;
    public boolean s;
    public na1 t;
    public cw0 u;
    public tl v;
    public int w;
    public final s40 x;
    public final i21 y;
    public final hl z;

    public tl(ml mlVar, mk1 mk1Var) {
        this.d = mlVar;
        this.e = mk1Var;
        yn0 yn0Var = new yn0(new wn0());
        this.i = yn0Var;
        ab1 ab1Var = new ab1();
        if (mlVar.d()) {
            ab1Var.o = new en0();
        }
        if (mlVar.f()) {
            ab1Var.b();
        }
        this.j = ab1Var;
        this.k = gb0.k();
        this.l = new wn0();
        this.m = new wn0();
        this.n = gb0.k();
        dg dgVar = new dg();
        this.o = dgVar;
        dg dgVar2 = new dg();
        this.p = dgVar2;
        this.q = gb0.k();
        this.r = gb0.k();
        s40 s40Var = new s40(14, mlVar);
        this.x = s40Var;
        this.y = new i21();
        hl hlVar = new hl(mk1Var, mlVar, ab1Var, yn0Var, dgVar, dgVar2, s40Var, this);
        mlVar.p(hlVar);
        this.z = hlVar;
        hk hkVar = op.b;
    }

    public final void A(Object obj) {
        synchronized (this.h) {
            try {
                v(obj);
                Object g = this.n.g(obj);
                if (g != null) {
                    if (g instanceof wn0) {
                        wn0 wn0Var = (wn0) g;
                        Object[] objArr = wn0Var.b;
                        long[] jArr = wn0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((xr) objArr[(i << 3) + i3]);
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
                        v((xr) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Function2 function2) {
        boolean i = i();
        q();
        ml mlVar = this.d;
        if (!i) {
            this.B = function2;
            mlVar.a(this, function2);
            return;
        }
        hl hlVar = this.z;
        hlVar.z = 100;
        hlVar.y = true;
        this.B = function2;
        mlVar.a(this, function2);
        hlVar.s();
    }

    public final void a() {
        this.g.set(null);
        this.o.a.z();
        this.p.a.z();
        yn0 yn0Var = this.i;
        if (yn0Var.d.g()) {
            return;
        }
        i21 i21Var = this.y;
        try {
            i21Var.g(yn0Var, this.z.z());
            i21Var.b();
        } finally {
            i21Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object g = this.k.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof wn0;
        wn0 wn0Var = this.l;
        wn0 wn0Var2 = this.m;
        vn0 vn0Var = this.q;
        if (!z2) {
            i11 i11Var = (i11) g;
            if (gb0.I(vn0Var, obj, i11Var) || i11Var.b(obj) == wa0.d) {
                return;
            }
            if (i11Var.g == null || z) {
                wn0Var.a(i11Var);
                return;
            } else {
                wn0Var2.a(i11Var);
                return;
            }
        }
        wn0 wn0Var3 = (wn0) g;
        Object[] objArr = wn0Var3.b;
        long[] jArr = wn0Var3.a;
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
                        i11 i11Var2 = (i11) objArr[(i << 3) + i3];
                        if (!gb0.I(vn0Var, obj, i11Var2) && i11Var2.b(obj) != wa0.d) {
                            if (i11Var2.g == null || z) {
                                wn0Var.a(i11Var2);
                            } else {
                                wn0Var2.a(i11Var2);
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
        int i;
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
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof s61;
        vn0 vn0Var = this.n;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            wn0 wn0Var = ((s61) set).d;
            Object[] objArr = wn0Var.b;
            long[] jArr10 = wn0Var.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c3 = c4;
                                if (obj2 instanceof i11) {
                                    ((i11) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object g = vn0Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof wn0) {
                                            wn0 wn0Var2 = (wn0) g;
                                            Object[] objArr2 = wn0Var2.b;
                                            long[] jArr11 = wn0Var2.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((xr) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            b((xr) g, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
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
                if (obj3 instanceof i11) {
                    ((i11) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object g2 = vn0Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof wn0) {
                            wn0 wn0Var3 = (wn0) g2;
                            Object[] objArr3 = wn0Var3.b;
                            long[] jArr13 = wn0Var3.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((xr) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((xr) g2, z);
                        }
                    }
                }
            }
        }
        vn0 vn0Var2 = this.k;
        wn0 wn0Var4 = this.l;
        if (z) {
            wn0 wn0Var5 = this.m;
            if (wn0Var5.h()) {
                long[] jArr14 = vn0Var2.a;
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
                                    Object obj4 = vn0Var2.b[i18];
                                    Object obj5 = vn0Var2.c[i18];
                                    if (obj5 instanceof wn0) {
                                        wn0 wn0Var6 = (wn0) obj5;
                                        Object[] objArr4 = wn0Var6.b;
                                        long[] jArr15 = wn0Var6.a;
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
                                                            i11 i11Var = (i11) objArr5[i22];
                                                            if (wn0Var5.c(i11Var) || wn0Var4.c(i11Var)) {
                                                                wn0Var6.m(i22);
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
                                        z2 = wn0Var6.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        i11 i11Var2 = (i11) obj5;
                                        z2 = wn0Var5.c(i11Var2) || wn0Var4.c(i11Var2);
                                    }
                                    if (z2) {
                                        vn0Var2.l(i18);
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
                wn0Var5.b();
                h();
                return;
            }
        }
        if (wn0Var4.h()) {
            long[] jArr17 = vn0Var2.a;
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
                                Object obj6 = vn0Var2.b[i26];
                                Object obj7 = vn0Var2.c[i26];
                                if (obj7 instanceof wn0) {
                                    wn0 wn0Var7 = (wn0) obj7;
                                    Object[] objArr6 = wn0Var7.b;
                                    long[] jArr18 = wn0Var7.a;
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
                                                        if (wn0Var4.c((i11) objArr7[i30])) {
                                                            wn0Var7.m(i30);
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
                                    c2 = wn0Var7.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = wn0Var4.c((i11) obj7);
                                }
                                if (c2) {
                                    vn0Var2.l(i26);
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
            wn0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.h) {
            try {
                e(this.o);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.i.d.g()) {
                        i21 i21Var = this.y;
                        try {
                            i21Var.g(this.i, this.z.z());
                            i21Var.b();
                            i21Var.a();
                        } catch (Throwable th2) {
                            i21Var.a();
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

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #9 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x007d, B:31:0x008a, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(dg dgVar) {
        b9 b9Var;
        i21 i21Var;
        db1 e;
        i21 i21Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        i21 i21Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        dg dgVar2 = this.p;
        hl hlVar = this.z;
        rl z2 = hlVar.z();
        i21 i21Var4 = this.y;
        i21Var4.g(this.i, z2);
        try {
            if (dgVar.a.B()) {
                try {
                    if (dgVar2.a.B() && this.u == null) {
                        i21Var4.b();
                    }
                    return;
                } finally {
                }
            }
            cw0 cw0Var = this.u;
            if (cw0Var == null || (b9Var = cw0Var.l) == null) {
                b9Var = this.e;
            }
            try {
                Trace.beginSection(b9Var.equals(cw0Var != null ? cw0Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    cw0 cw0Var2 = this.u;
                    try {
                        try {
                            if (cw0Var2 != null) {
                                i21Var = cw0Var2.k;
                                if (i21Var == null) {
                                }
                                e = this.j.e();
                                int i3 = 0;
                                dgVar.z(b9Var, e, i21Var, hlVar.z());
                                e.e(true);
                                b9Var.e();
                                Trace.endSection();
                                i21Var4.c();
                                i21Var4.d();
                                if (this.s) {
                                    i21Var2 = i21Var4;
                                } else {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.s = false;
                                        vn0 vn0Var = this.k;
                                        long[] jArr3 = vn0Var.a;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = vn0Var.b[i8];
                                                            Object obj2 = vn0Var.c[i8];
                                                            if (obj2 instanceof wn0) {
                                                                wn0 wn0Var = (wn0) obj2;
                                                                Object[] objArr = wn0Var.b;
                                                                long[] jArr4 = wn0Var.a;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                i21Var3 = i21Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((i11) objArr[i13]).a()) {
                                                                                            wn0Var.m(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = wn0Var.g();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                i21Var3 = i21Var4;
                                                                j = j4;
                                                                obj2.getClass();
                                                                z = !((i11) obj2).a();
                                                            }
                                                            if (z) {
                                                                vn0Var.l(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            i21Var3 = i21Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        i21Var4 = i21Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    i21Var2 = i21Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    i21Var2 = i21Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                i21Var4 = i21Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            i21Var2 = i21Var4;
                                        }
                                        h();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (dgVar2.a.B() && this.u == null) {
                                    i21Var2.b();
                                }
                                return;
                            }
                            if (dgVar2.a.B()) {
                                i21Var2.b();
                            }
                            return;
                        } finally {
                            i21Var2.a();
                        }
                        dgVar.z(b9Var, e, i21Var, hlVar.z());
                        e.e(true);
                        b9Var.e();
                        Trace.endSection();
                        i21Var4.c();
                        i21Var4.d();
                        if (this.s) {
                        }
                    } catch (Throwable th3) {
                        try {
                            e.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    i21Var = i21Var4;
                    e = this.j.e();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (dgVar2.a.B() && this.u == null) {
                        i21Var4.b();
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
        synchronized (this.h) {
            try {
                if (this.p.a.C()) {
                    e(this.p);
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.d.g()) {
                        i21 i21Var = this.y;
                        try {
                            i21Var.g(this.i, this.z.z());
                            i21Var.b();
                            i21Var.a();
                        } catch (Throwable th2) {
                            i21Var.a();
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
        i21 i21Var;
        synchronized (this.h) {
            try {
                this.z.v = null;
                if (!this.i.d.g()) {
                    i21Var = this.y;
                    try {
                        i21Var.g(this.i, this.z.z());
                        i21Var.b();
                        i21Var.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.i.d.g()) {
                        i21Var = this.y;
                        try {
                            i21Var.g(this.i, this.z.z());
                            i21Var.b();
                            i21Var.a();
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
        vn0 vn0Var = this.n;
        long[] jArr3 = vn0Var.a;
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
                            Object obj = vn0Var.b[i10];
                            Object obj2 = vn0Var.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof wn0;
                            j5 = j8;
                            vn0 vn0Var2 = this.k;
                            if (z2) {
                                wn0 wn0Var = (wn0) obj2;
                                Object[] objArr = wn0Var.b;
                                long[] jArr4 = wn0Var.a;
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
                                                    if (!vn0Var2.c((xr) objArr[i15])) {
                                                        wn0Var.m(i15);
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
                                z = wn0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !vn0Var2.c((xr) obj2);
                            }
                            if (z) {
                                vn0Var.l(i10);
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
        wn0 wn0Var2 = this.m;
        if (!wn0Var2.h()) {
            return;
        }
        Object[] objArr2 = wn0Var2.b;
        long[] jArr5 = wn0Var2.a;
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
                        if (((i11) objArr2[i20]).g == null) {
                            wn0Var2.m(i20);
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
        synchronized (this.h) {
            z = true;
            if (this.A != 1) {
                z = false;
            }
            if (z) {
                this.A = 0;
            }
        }
        return z;
    }

    public final void j(Function2 function2) {
        try {
            synchronized (this.h) {
                n();
                vn0 vn0Var = this.r;
                this.r = gb0.k();
                try {
                    hl hlVar = this.z;
                    na1 na1Var = this.t;
                    if (!hlVar.e.a.B()) {
                        kl.a("Expected applyChanges() to have been called");
                    }
                    hlVar.P = na1Var;
                    try {
                        hlVar.n(vn0Var, function2);
                    } finally {
                        hlVar.P = null;
                    }
                } catch (Throwable th) {
                    this.r = vn0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.i.d.g()) {
                    i21 i21Var = this.y;
                    try {
                        i21Var.g(this.i, this.z.z());
                        i21Var.b();
                        i21Var.a();
                    } catch (Throwable th3) {
                        i21Var.a();
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

    public final cw0 k(boolean z, Function2 function2) {
        if (this.u != null) {
            cy0.b("A pausable composition is in progress");
        }
        cw0 cw0Var = new cw0(this, this.d, this.z, this.i, function2, z, this.e, this.h);
        this.u = cw0Var;
        return cw0Var;
    }

    public final void l() {
        i21 i21Var;
        synchronized (this.h) {
            try {
                if (this.u != null) {
                    cy0.b("Deactivate is not supported while pausable composition is in progress");
                }
                int i = 0;
                boolean z = this.j.e > 0;
                try {
                    try {
                        if (!z) {
                            if (!this.i.d.g()) {
                            }
                            this.k.a();
                            this.n.a();
                            this.r.a();
                            this.o.a.z();
                            this.p.a.z();
                            hl hlVar = this.z;
                            hlVar.E.clear();
                            hlVar.s.clear();
                            hlVar.e.a.z();
                            hlVar.v = null;
                            this.A = 1;
                        }
                        i21Var.g(this.i, this.z.z());
                        if (z) {
                            db1 e = this.j.e();
                            try {
                                e.n(e.t, new il(this.y, i, e));
                                e.e(true);
                                this.e.e();
                                i21Var.c();
                            } catch (Throwable th) {
                                e.e(false);
                                throw th;
                            }
                        }
                        i21Var.b();
                        i21Var.a();
                        this.k.a();
                        this.n.a();
                        this.r.a();
                        this.o.a.z();
                        this.p.a.z();
                        hl hlVar2 = this.z;
                        hlVar2.E.clear();
                        hlVar2.s.clear();
                        hlVar2.e.a.z();
                        hlVar2.v = null;
                        this.A = 1;
                    } catch (Throwable th2) {
                        i21Var.a();
                        throw th2;
                    }
                    i21Var = this.y;
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
        synchronized (this.h) {
            try {
                if (this.z.F) {
                    cy0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.A != 3) {
                    this.A = 3;
                    this.B = op.c;
                    dg dgVar = this.z.L;
                    if (dgVar != null) {
                        e(dgVar);
                    }
                    int i = 0;
                    boolean z = this.j.e > 0;
                    if (z || !this.i.d.g()) {
                        i21 i21Var = this.y;
                        try {
                            i21Var.g(this.i, this.z.z());
                            if (z) {
                                db1 e = this.j.e();
                                try {
                                    e.n(e.t, new jl(i, this.y));
                                    e.H();
                                    e.e(true);
                                    this.e.k();
                                    this.e.e();
                                    i21Var.c();
                                } catch (Throwable th) {
                                    e.e(false);
                                    throw th;
                                }
                            }
                            i21Var.b();
                            i21Var.a();
                        } catch (Throwable th2) {
                            i21Var.a();
                            throw th2;
                        }
                    }
                    hl hlVar = this.z;
                    hlVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        hlVar.b.u(hlVar);
                        hlVar.E.clear();
                        hlVar.s.clear();
                        hlVar.e.a.z();
                        hlVar.v = null;
                        hlVar.a.k();
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
        this.d.v(this);
    }

    public final void n() {
        Object obj = uq1.c;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                kl.b("pending composition has not been applied");
                throw new kc0();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                kl.b("corrupt pendingModifications drain: " + atomicReference);
                throw new kc0();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.a(andSet, uq1.c)) {
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
        if (andSet != null) {
            kl.b("corrupt pendingModifications drain: " + atomicReference);
            throw new kc0();
        }
        if (this.u == null) {
            kl.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        rv rvVar = rv.d;
        AtomicReference atomicReference = this.g;
        Object andSet = atomicReference.getAndSet(rvVar);
        if (Intrinsics.a(andSet, uq1.c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            kl.b("corrupt pendingModifications drain: " + atomicReference);
            throw new kc0();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i = this.A;
        if (i != 0) {
            cy0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.u == null) {
            return;
        }
        cy0.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        yn0 yn0Var = this.i;
        hl hlVar = this.z;
        if (arrayList.size() > 0) {
            ((xm0) ((Pair) arrayList.get(0)).d).getClass();
            kl.a("Check failed");
        }
        try {
            hlVar.getClass();
            try {
                hlVar.B(arrayList);
                hlVar.i();
            } catch (Throwable th) {
                hlVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!yn0Var.d.g()) {
                    i21 i21Var = this.y;
                    try {
                        i21Var.g(yn0Var, hlVar.z());
                        i21Var.b();
                        i21Var.a();
                    } catch (Throwable th3) {
                        i21Var.a();
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

    public final wa0 s(i11 i11Var, Object obj) {
        tl tlVar;
        int i = i11Var.b;
        if ((i & 2) != 0) {
            i11Var.b = i | 4;
        }
        d3 d3Var = i11Var.c;
        if (d3Var == null || !d3Var.a()) {
            return wa0.d;
        }
        if (this.j.f(d3Var)) {
            if (i11Var.d == null) {
                return wa0.d;
            }
            wa0 u = u(i11Var, d3Var, obj);
            if (u != wa0.d) {
                this.x.n();
            }
            return u;
        }
        synchronized (this.h) {
            tlVar = this.v;
        }
        if (tlVar != null) {
            hl hlVar = tlVar.z;
            if (hlVar.F && hlVar.c0(i11Var, obj)) {
                return wa0.h;
            }
        }
        return wa0.d;
    }

    public final void t() {
        tl tlVar;
        synchronized (this.h) {
            try {
                for (Object obj : this.j.g) {
                    i11 i11Var = obj instanceof i11 ? (i11) obj : null;
                    if (i11Var != null && (tlVar = i11Var.a) != null) {
                        tlVar.s(i11Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wa0 u(i11 i11Var, d3 d3Var, Object obj) {
        tl tlVar;
        int i;
        synchronized (this.h) {
            try {
                tl tlVar2 = this.v;
                if (tlVar2 != null) {
                    ab1 ab1Var = this.j;
                    int i2 = this.w;
                    if (ab1Var.k) {
                        kl.a("Writer is active");
                    }
                    if (i2 < 0 || i2 >= ab1Var.e) {
                        kl.a("Invalid group index");
                    }
                    if (ab1Var.f(d3Var)) {
                        int i3 = ab1Var.d[(i2 * 5) + 3] + i2;
                        int i4 = d3Var.a;
                        tlVar = (i2 <= i4 && i4 < i3) ? tlVar2 : null;
                    }
                    tlVar2 = null;
                }
                if (tlVar == null) {
                    hl hlVar = this.z;
                    if (hlVar.F && hlVar.c0(i11Var, obj)) {
                        return wa0.h;
                    }
                    if (obj == null) {
                        this.r.m(i11Var, a60.n);
                    } else {
                        boolean z = obj instanceof xr;
                        vn0 vn0Var = this.r;
                        if (z) {
                            Object g = vn0Var.g(i11Var);
                            if (g != null) {
                                if (g instanceof wn0) {
                                    wn0 wn0Var = (wn0) g;
                                    Object[] objArr = wn0Var.b;
                                    long[] jArr = wn0Var.a;
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
                                                        if (objArr[(i5 << 3) + i8] == a60.n) {
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
                                } else if (g == a60.n) {
                                }
                            }
                            gb0.f(this.r, i11Var, obj);
                        } else {
                            vn0Var.m(i11Var, a60.n);
                        }
                    }
                }
                if (tlVar != null) {
                    return tlVar.u(i11Var, d3Var, obj);
                }
                this.d.l(this);
                return this.z.F ? wa0.g : wa0.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object g = this.k.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof wn0;
        vn0 vn0Var = this.q;
        if (!z) {
            i11 i11Var = (i11) g;
            if (i11Var.b(obj) == wa0.h) {
                gb0.f(vn0Var, obj, i11Var);
                return;
            }
            return;
        }
        wn0 wn0Var = (wn0) g;
        Object[] objArr = wn0Var.b;
        long[] jArr = wn0Var.a;
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
                        i11 i11Var2 = (i11) objArr[(i << 3) + i3];
                        if (i11Var2.b(obj) == wa0.h) {
                            gb0.f(vn0Var, obj, i11Var2);
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
    public final boolean w(Set set) {
        boolean z = set instanceof s61;
        vn0 vn0Var = this.n;
        vn0 vn0Var2 = this.k;
        if (z) {
            wn0 wn0Var = ((s61) set).d;
            Object[] objArr = wn0Var.b;
            long[] jArr = wn0Var.a;
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
                                if (vn0Var2.c(obj) || vn0Var.c(obj)) {
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
                if (vn0Var2.c(obj2) || vn0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.h) {
            cw0 cw0Var = this.u;
            boolean z = false;
            if (cw0Var != null && (cw0Var.h.get() != ew0.i || cw0Var.i != t90.l())) {
                AtomicReference atomicReference = cw0Var.h;
                ew0 ew0Var = ew0.j;
                ew0 ew0Var2 = ew0.h;
                while (!atomicReference.compareAndSet(ew0Var, ew0Var2) && atomicReference.get() == ew0Var) {
                }
                cw0Var.l.a.a(9);
                return false;
            }
            n();
            try {
                vn0 vn0Var = this.r;
                this.r = gb0.k();
                try {
                    hl hlVar = this.z;
                    na1 na1Var = this.t;
                    bt0 bt0Var = hlVar.e.a;
                    if (!bt0Var.B()) {
                        kl.a("Expected applyChanges() to have been called");
                    }
                    if (vn0Var.e > 0 || !hlVar.s.isEmpty()) {
                        hlVar.P = na1Var;
                        try {
                            hlVar.n(vn0Var, null);
                            hlVar.P = null;
                            z = bt0Var.C();
                        } catch (Throwable th) {
                            hlVar.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.r = vn0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.i.d.g()) {
                        i21 i21Var = this.y;
                        try {
                            i21Var.g(this.i, this.z.z());
                            i21Var.b();
                            i21Var.a();
                        } catch (Throwable th4) {
                            i21Var.a();
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
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void y(s61 s61Var) {
        s61 s61Var2;
        while (true) {
            Object obj = this.g.get();
            if (obj == null || obj.equals(uq1.c)) {
                s61Var2 = s61Var;
            } else if (obj instanceof Set) {
                s61Var2 = new Set[]{obj, s61Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.g).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = s61Var;
                s61Var2 = copyOf;
            }
            AtomicReference atomicReference = this.g;
            while (!atomicReference.compareAndSet(obj, s61Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.h) {
                    o();
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
    public final void z(Object obj) {
        i11 x;
        int i;
        boolean z;
        int i2;
        hl hlVar = this.z;
        if (hlVar.A > 0 || (x = hlVar.x()) == null) {
            return;
        }
        int i3 = x.b | 1;
        x.b = i3;
        if ((i3 & 32) == 0) {
            ln0 ln0Var = x.f;
            if (ln0Var == null) {
                ln0Var = new ln0();
                x.f = ln0Var;
            }
            int i4 = x.e;
            int c = ln0Var.c(obj);
            if (c < 0) {
                c = ~c;
                i = -1;
            } else {
                i = ln0Var.c[c];
            }
            ln0Var.b[c] = obj;
            ln0Var.c[c] = i4;
            if (i == x.e) {
                z = true;
                this.x.n();
                if (z) {
                    if (obj instanceof he1) {
                        ((he1) obj).g(1);
                    }
                    gb0.f(this.k, obj, x);
                    if (obj instanceof xr) {
                        xr xrVar = (xr) obj;
                        wr i5 = xrVar.i();
                        vn0 vn0Var = this.n;
                        gb0.J(vn0Var, obj);
                        ln0 ln0Var2 = i5.e;
                        Object[] objArr = ln0Var2.b;
                        long[] jArr = ln0Var2.a;
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
                                            ge1 ge1Var = (ge1) objArr[(i6 << 3) + i9];
                                            i2 = i7;
                                            if (ge1Var instanceof he1) {
                                                ((he1) ge1Var).g(1);
                                            }
                                            gb0.f(vn0Var, ge1Var, obj);
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
                        vn0 vn0Var2 = x.g;
                        if (vn0Var2 == null) {
                            vn0Var2 = new vn0();
                            x.g = vn0Var2;
                        }
                        vn0Var2.m(xrVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.x.n();
        if (z) {
        }
    }
}
