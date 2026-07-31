package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import c2.j;
import c2.l;
import c5.x;
import c6.k;
import d2.h;
import d2.i;
import d2.n;
import d2.q;
import d2.s;
import d6.u;
import e0.c;
import g2.a0;
import g2.i0;
import g2.v;
import j2.d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import l1.e;
import m0.b;
import m0.o1;
import m0.t1;
import o.j0;
import r2.o;
import u1.s0;
import w0.f;
import w1.d1;
import w1.g;
import w1.r;
import x1.b1;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f0a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2c = true;

    /* renamed from: d, reason: collision with root package name */
    public static Field f3d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f4e;

    /* renamed from: f, reason: collision with root package name */
    public static e f5f;

    /* renamed from: g, reason: collision with root package name */
    public static e f6g;

    /* renamed from: h, reason: collision with root package name */
    public static e f7h;
    public static e i;

    /* renamed from: j, reason: collision with root package name */
    public static e f8j;

    public static String A(long j7) {
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i8) == Float.intBitsToFloat(i9)) {
            return "CornerRadius.circular(" + s6.a.L(Float.intBitsToFloat(i8)) + ')';
        }
        return "CornerRadius.elliptical(" + s6.a.L(Float.intBitsToFloat(i8)) + ", " + s6.a.L(Float.intBitsToFloat(i9)) + ')';
    }

    public static final double B(long j7) {
        return ((j7 >>> 11) * 2048) + (j7 & 2047);
    }

    public static final void C(n nVar, int i8, j jVar) {
        n nVar2;
        o0.e eVar = new o0.e(new n[16]);
        List i9 = nVar.i(false, false);
        while (true) {
            eVar.c(eVar.f5580f, i9);
            while (true) {
                int i10 = eVar.f5580f;
                if (i10 == 0) {
                    return;
                }
                nVar2 = (n) eVar.k(i10 - 1);
                boolean e8 = q.e(nVar2);
                d2.j jVar2 = nVar2.f2159d;
                j0 j0Var = jVar2.f2150d;
                if (!e8 && !j0Var.c(s.i)) {
                    d1 d8 = nVar2.d();
                    if (d8 == null) {
                        throw a0.q.f("Expected semantics node to have a coordinator.");
                    }
                    r2.j V = h0.a.V(s0.e(d8));
                    if (V.f6524a < V.f6526c && V.f6525b < V.f6527d) {
                        Object g3 = jVar2.f2150d.g(i.f2129e);
                        if (g3 == null) {
                            g3 = null;
                        }
                        p6.e eVar2 = (p6.e) g3;
                        Object g7 = j0Var.g(s.f2207u);
                        h hVar = (h) (g7 != null ? g7 : null);
                        if (eVar2 != null && hVar != null && ((Number) hVar.f2124b.b()).floatValue() > 0.0f) {
                            int i11 = i8 + 1;
                            jVar.i(new l(nVar2, i11, V, d8));
                            C(nVar2, i11, jVar);
                        }
                    }
                }
            }
            i9 = nVar2.i(false, false);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:99|(25:152|153|(1:155)|103|104|(1:150)(1:108)|109|(10:114|115|116|117|118|(1:120)(1:134)|121|(1:133)|125|126)|137|138|139|140|141|142|143|115|116|117|118|(0)(0)|121|(1:123)|133|125|126)|101|(24:151|104|(1:106)|148|150|109|(12:111|114|115|116|117|118|(0)(0)|121|(0)|133|125|126)|137|138|139|140|141|142|143|115|116|117|118|(0)(0)|121|(0)|133|125|126)|103|104|(0)|148|150|109|(0)|137|138|139|140|141|142|143|115|116|117|118|(0)(0)|121|(0)|133|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01f0, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5 A[Catch: RejectedExecutionException -> 0x019a, TryCatch #2 {RejectedExecutionException -> 0x019a, blocks: (B:153:0x0193, B:104:0x01a3, B:106:0x01b5, B:109:0x01c2, B:111:0x01d3, B:137:0x01db, B:148:0x01bb, B:101:0x019c), top: B:152:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3 A[Catch: RejectedExecutionException -> 0x019a, TryCatch #2 {RejectedExecutionException -> 0x019a, blocks: (B:153:0x0193, B:104:0x01a3, B:106:0x01b5, B:109:0x01c2, B:111:0x01d3, B:137:0x01db, B:148:0x01bb, B:101:0x019c), top: B:152:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final m mVar, final i0 i0Var, final int i8, final boolean z3, final int i9, final int i10, m0.s sVar, final int i11) {
        int i12;
        d dVar;
        boolean z7;
        int hashCode;
        boolean z8;
        boolean d8;
        Object K;
        Object obj;
        sVar.W(-1040751001);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(mVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(i0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.d(i8) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.d(i9) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.d(i10) ? 8388608 : 4194304;
        }
        int i13 = i12 | 100663296;
        if ((805306368 & i11) == 0) {
            i13 |= (1073741824 & i11) == 0 ? sVar.f(null) : sVar.h(null) ? 536870912 : 268435456;
        }
        if (sVar.N(i13 & 1, (306783379 & i13) != 306783378)) {
            if (!(i10 > 0 && i9 > 0)) {
                w.a.a("both minLines " + i10 + " and maxLines " + i9 + " must be greater than zero");
            }
            if (!(i10 <= i9)) {
                w.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i9);
            }
            if (sVar.j(g0.a.f2806a) != null) {
                throw new ClassCastException();
            }
            sVar.V(356926143);
            sVar.p(false);
            final d dVar2 = (d) sVar.j(b1.f8372k);
            int i14 = ((i13 >> 3) & 112) | (i13 & 14);
            Executor executor = (Executor) sVar.j(c.f2447a);
            if (executor != null) {
                int length = str.length();
                if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                    if (c.f2448b == null) {
                        c.f2448b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = c.f2448b;
                    q6.i.b(bool);
                    if (bool.booleanValue()) {
                        sVar.V(1254328095);
                        final r2.l lVar = (r2.l) sVar.j(b1.f8375n);
                        final r2.c cVar = (r2.c) sVar.j(b1.f8370h);
                        if (((i14 & 112) ^ 48) > 32) {
                            try {
                                if (!sVar.f(i0Var)) {
                                }
                                z8 = true;
                                d8 = ((((i14 & 14) ^ 6) <= 4 && sVar.f(str)) || (i14 & 6) == 4) | z8 | sVar.d(lVar.ordinal()) | sVar.f(cVar) | sVar.h(dVar2);
                                K = sVar.K();
                            } catch (RejectedExecutionException unused) {
                                dVar = dVar2;
                            }
                            if (!d8 && K != m0.n.f5019a) {
                                obj = K;
                                dVar = dVar2;
                                executor.execute((Runnable) obj);
                                z7 = false;
                                sVar.p(false);
                                sVar.V(357887763);
                                sVar.p(z7);
                                m d9 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
                                hashCode = Long.hashCode(sVar.T);
                                m a02 = o.a0(sVar, d9);
                                o1 l3 = sVar.l();
                                w1.i.f7684c.getClass();
                                p6.a aVar = w1.h.f7675b;
                                sVar.Y();
                                if (sVar.S) {
                                    sVar.i0();
                                } else {
                                    sVar.k(aVar);
                                }
                                b.u(e0.d.f2449a, sVar, w1.h.f7678e);
                                b.u(l3, sVar, w1.h.f7677d);
                                b.u(a02, sVar, w1.h.f7676c);
                                g gVar = w1.h.f7679f;
                                if (!sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                                    a0.q.n(hashCode, sVar, hashCode, gVar);
                                }
                                sVar.p(true);
                            }
                            obj = new Runnable() { // from class: e0.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    w0.b C;
                                    i0 i0Var2 = i0.this;
                                    r2.l lVar2 = lVar;
                                    String str2 = str;
                                    r2.c cVar2 = cVar;
                                    j2.d dVar3 = dVar2;
                                    Trace.beginSection("BackgroundTextMeasurement");
                                    try {
                                        f k3 = w0.m.k();
                                        w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
                                        if (bVar == null || (C = bVar.C(null, null)) == null) {
                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                        }
                                        try {
                                            f j7 = C.j();
                                            try {
                                                i0 e8 = a0.e(i0Var2, lVar2);
                                                u uVar = u.f2326d;
                                                new n2.c(str2, e8, uVar, uVar, dVar3, cVar2).b();
                                                C.w().d();
                                            } finally {
                                                f.q(j7);
                                            }
                                        } finally {
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            };
                            dVar = dVar2;
                            sVar.f0(obj);
                            executor.execute((Runnable) obj);
                            z7 = false;
                            sVar.p(false);
                            sVar.V(357887763);
                            sVar.p(z7);
                            m d92 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
                            hashCode = Long.hashCode(sVar.T);
                            m a022 = o.a0(sVar, d92);
                            o1 l32 = sVar.l();
                            w1.i.f7684c.getClass();
                            p6.a aVar2 = w1.h.f7675b;
                            sVar.Y();
                            if (sVar.S) {
                            }
                            b.u(e0.d.f2449a, sVar, w1.h.f7678e);
                            b.u(l32, sVar, w1.h.f7677d);
                            b.u(a022, sVar, w1.h.f7676c);
                            g gVar2 = w1.h.f7679f;
                            if (!sVar.S) {
                            }
                            a0.q.n(hashCode, sVar, hashCode, gVar2);
                            sVar.p(true);
                        }
                        if ((i14 & 48) != 32) {
                            z8 = false;
                            d8 = ((((i14 & 14) ^ 6) <= 4 && sVar.f(str)) || (i14 & 6) == 4) | z8 | sVar.d(lVar.ordinal()) | sVar.f(cVar) | sVar.h(dVar2);
                            K = sVar.K();
                            if (!d8) {
                                obj = K;
                                dVar = dVar2;
                                executor.execute((Runnable) obj);
                                z7 = false;
                                sVar.p(false);
                                sVar.V(357887763);
                                sVar.p(z7);
                                m d922 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
                                hashCode = Long.hashCode(sVar.T);
                                m a0222 = o.a0(sVar, d922);
                                o1 l322 = sVar.l();
                                w1.i.f7684c.getClass();
                                p6.a aVar22 = w1.h.f7675b;
                                sVar.Y();
                                if (sVar.S) {
                                }
                                b.u(e0.d.f2449a, sVar, w1.h.f7678e);
                                b.u(l322, sVar, w1.h.f7677d);
                                b.u(a0222, sVar, w1.h.f7676c);
                                g gVar22 = w1.h.f7679f;
                                if (!sVar.S) {
                                }
                                a0.q.n(hashCode, sVar, hashCode, gVar22);
                                sVar.p(true);
                            }
                            obj = new Runnable() { // from class: e0.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    w0.b C;
                                    i0 i0Var2 = i0.this;
                                    r2.l lVar2 = lVar;
                                    String str2 = str;
                                    r2.c cVar2 = cVar;
                                    j2.d dVar3 = dVar2;
                                    Trace.beginSection("BackgroundTextMeasurement");
                                    try {
                                        f k3 = w0.m.k();
                                        w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
                                        if (bVar == null || (C = bVar.C(null, null)) == null) {
                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                        }
                                        try {
                                            f j7 = C.j();
                                            try {
                                                i0 e8 = a0.e(i0Var2, lVar2);
                                                u uVar = u.f2326d;
                                                new n2.c(str2, e8, uVar, uVar, dVar3, cVar2).b();
                                                C.w().d();
                                            } finally {
                                                f.q(j7);
                                            }
                                        } finally {
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            };
                            dVar = dVar2;
                            sVar.f0(obj);
                            executor.execute((Runnable) obj);
                            z7 = false;
                            sVar.p(false);
                            sVar.V(357887763);
                            sVar.p(z7);
                            m d9222 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
                            hashCode = Long.hashCode(sVar.T);
                            m a02222 = o.a0(sVar, d9222);
                            o1 l3222 = sVar.l();
                            w1.i.f7684c.getClass();
                            p6.a aVar222 = w1.h.f7675b;
                            sVar.Y();
                            if (sVar.S) {
                            }
                            b.u(e0.d.f2449a, sVar, w1.h.f7678e);
                            b.u(l3222, sVar, w1.h.f7677d);
                            b.u(a02222, sVar, w1.h.f7676c);
                            g gVar222 = w1.h.f7679f;
                            if (!sVar.S) {
                            }
                            a0.q.n(hashCode, sVar, hashCode, gVar222);
                            sVar.p(true);
                        }
                        z8 = true;
                        d8 = ((((i14 & 14) ^ 6) <= 4 && sVar.f(str)) || (i14 & 6) == 4) | z8 | sVar.d(lVar.ordinal()) | sVar.f(cVar) | sVar.h(dVar2);
                        K = sVar.K();
                        if (!d8) {
                        }
                        obj = new Runnable() { // from class: e0.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                w0.b C;
                                i0 i0Var2 = i0.this;
                                r2.l lVar2 = lVar;
                                String str2 = str;
                                r2.c cVar2 = cVar;
                                j2.d dVar3 = dVar2;
                                Trace.beginSection("BackgroundTextMeasurement");
                                try {
                                    f k3 = w0.m.k();
                                    w0.b bVar = k3 instanceof w0.b ? (w0.b) k3 : null;
                                    if (bVar == null || (C = bVar.C(null, null)) == null) {
                                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                    }
                                    try {
                                        f j7 = C.j();
                                        try {
                                            i0 e8 = a0.e(i0Var2, lVar2);
                                            u uVar = u.f2326d;
                                            new n2.c(str2, e8, uVar, uVar, dVar3, cVar2).b();
                                            C.w().d();
                                        } finally {
                                            f.q(j7);
                                        }
                                    } finally {
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        };
                        dVar = dVar2;
                        sVar.f0(obj);
                        executor.execute((Runnable) obj);
                        z7 = false;
                        sVar.p(false);
                        sVar.V(357887763);
                        sVar.p(z7);
                        m d92222 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
                        hashCode = Long.hashCode(sVar.T);
                        m a022222 = o.a0(sVar, d92222);
                        o1 l32222 = sVar.l();
                        w1.i.f7684c.getClass();
                        p6.a aVar2222 = w1.h.f7675b;
                        sVar.Y();
                        if (sVar.S) {
                        }
                        b.u(e0.d.f2449a, sVar, w1.h.f7678e);
                        b.u(l32222, sVar, w1.h.f7677d);
                        b.u(a022222, sVar, w1.h.f7676c);
                        g gVar2222 = w1.h.f7679f;
                        if (!sVar.S) {
                        }
                        a0.q.n(hashCode, sVar, hashCode, gVar2222);
                        sVar.p(true);
                    }
                }
                dVar = dVar2;
                z7 = false;
            } else {
                dVar = dVar2;
                z7 = false;
            }
            sVar.V(1255196839);
            sVar.p(z7);
            sVar.V(357887763);
            sVar.p(z7);
            m d922222 = mVar.d(new TextStringSimpleElement(str, i0Var, dVar, i8, z3, i9, i10));
            hashCode = Long.hashCode(sVar.T);
            m a0222222 = o.a0(sVar, d922222);
            o1 l322222 = sVar.l();
            w1.i.f7684c.getClass();
            p6.a aVar22222 = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
            }
            b.u(e0.d.f2449a, sVar, w1.h.f7678e);
            b.u(l322222, sVar, w1.h.f7677d);
            b.u(a0222222, sVar, w1.h.f7676c);
            g gVar22222 = w1.h.f7679f;
            if (!sVar.S) {
            }
            a0.q.n(hashCode, sVar, hashCode, gVar22222);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: e0.a
                @Override // p6.e
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.a.a(str, mVar, i0Var, i8, z3, i9, i10, (m0.s) obj2, m0.b.w(i11 | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final e1.c b(long j7, long j8) {
        int i8 = (int) (j7 >> 32);
        int i9 = (int) (j7 & 4294967295L);
        return new e1.c(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i9));
    }

    public static final boolean c(b1.g gVar, long j7) {
        if (!gVar.f8706d.f8718q) {
            return false;
        }
        r rVar = w1.f.u(gVar).F.f7597c;
        if (!rVar.Q.f8718q) {
            return false;
        }
        long O0 = rVar.O0(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (O0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (O0 & 4294967295L));
        long j8 = gVar.f1060t;
        float f6 = ((int) (j8 >> 32)) + intBitsToFloat;
        float f8 = ((int) (j8 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f6) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f8;
    }

    public static final String d(Object[] objArr, int i8, int i9, d6.g gVar) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i8 + i10];
            if (obj == gVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final m f(m mVar, f1.i0 i0Var) {
        return androidx.compose.ui.graphics.a.c(mVar, 0.0f, 0.0f, 0.0f, i0Var, 518143);
    }

    public static int g(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(a1.h hVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        d2.o oVar;
        n nVar;
        p6.c cVar;
        int size = longSparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            long keyAt = longSparseArray.keyAt(i8);
            ViewTranslationResponse s5 = a1.c.s(longSparseArray.get(keyAt));
            if (s5 != null && value != null && text != null && (oVar = (d2.o) hVar.g().b((int) keyAt)) != null && (nVar = oVar.f2163a) != null) {
                Object g3 = nVar.f2159d.f2150d.g(i.f2134k);
                if (g3 == null) {
                    g3 = null;
                }
                d2.a aVar = (d2.a) g3;
                if (aVar != null && (cVar = (p6.c) aVar.f2109b) != null) {
                }
            }
        }
    }

    public static final boolean i(long j7, long j8) {
        return j7 == j8;
    }

    public static g6.f j(g6.f fVar, g6.g gVar) {
        q6.i.e(gVar, "key");
        if (q6.i.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final long k(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static Intent l(Context context, ComponentName componentName) {
        String m7 = m(context, componentName);
        if (m7 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m7);
        return m(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String m(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b5.a.a();
        }
        try {
            if (f1b == null) {
                f0a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1b.invoke(null, Long.valueOf(f0a))).booleanValue();
        } catch (Exception e8) {
            if (!(e8 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e8);
                return false;
            }
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean p(byte b8) {
        return b8 > -65;
    }

    public static c6.d q(c6.e eVar, p6.a aVar) {
        c6.l lVar = c6.l.f1756a;
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return new k(aVar);
        }
        if (ordinal == 1) {
            c6.j jVar = new c6.j();
            jVar.f1751d = aVar;
            jVar.f1752e = lVar;
            return jVar;
        }
        if (ordinal != 2) {
            throw new a5.c();
        }
        c6.n nVar = new c6.n();
        nVar.f1758d = aVar;
        nVar.f1759e = lVar;
        return nVar;
    }

    public static k r(p6.a aVar) {
        q6.i.e(aVar, "initializer");
        return new k(aVar);
    }

    public static g6.h s(g6.f fVar, g6.g gVar) {
        q6.i.e(gVar, "key");
        return q6.i.a(fVar.getKey(), gVar) ? g6.i.f3046d : fVar;
    }

    public static g6.h v(g6.f fVar, g6.h hVar) {
        q6.i.e(hVar, "context");
        return hVar == g6.i.f3046d ? fVar : (g6.h) hVar.g(fVar, new v(9));
    }

    public static e4.b w(MappedByteBuffer mappedByteBuffer) {
        long j7;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i8 = duplicate.getShort() & 65535;
        if (i8 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                j7 = -1;
                break;
            }
            int i10 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j7 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i10) {
                break;
            }
            i9++;
        }
        if (j7 != -1) {
            duplicate.position(duplicate.position() + ((int) (j7 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j8 = duplicate.getInt() & 4294967295L;
            for (int i11 = 0; i11 < j8; i11++) {
                int i12 = duplicate.getInt();
                long j9 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i12 || 1701669481 == i12) {
                    duplicate.position((int) (j9 + j7));
                    e4.b bVar = new e4.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f2491g = duplicate;
                    bVar.f2488d = position;
                    int i13 = position - duplicate.getInt(position);
                    bVar.f2489e = i13;
                    bVar.f2490f = ((ByteBuffer) bVar.f2491g).getShort(i13);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void x(Object[] objArr, int i8, int i9) {
        q6.i.e(objArr, "<this>");
        while (i8 < i9) {
            objArr[i8] = null;
            i8++;
        }
    }

    public abstract void D(byte[] bArr, int i8, int i9);

    public float n(View view) {
        if (f2c) {
            try {
                return c5.a0.a(view);
            } catch (NoSuchMethodError unused) {
                f2c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void t(Throwable th);

    public abstract void u(x xVar);

    public void y(View view, float f6) {
        if (f2c) {
            try {
                c5.a0.b(view, f6);
                return;
            } catch (NoSuchMethodError unused) {
                f2c = false;
            }
        }
        view.setAlpha(f6);
    }

    public void z(View view, int i8) {
        if (!f4e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f3d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f4e = true;
        }
        Field field = f3d;
        if (field != null) {
            try {
                f3d.setInt(view, i8 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
