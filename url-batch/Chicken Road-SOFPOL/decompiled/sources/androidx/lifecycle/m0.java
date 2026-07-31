package androidx.lifecycle;

import a0.z0;
import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import m0.h1;
import m0.u1;
import m0.y1;
import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f840e;

    public /* synthetic */ m0(int i, Object obj) {
        this.f839d = i;
        this.f840e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [g6.c] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p6.a
    public final Object b() {
        a7.f w7;
        boolean z3;
        w0.s sVar;
        boolean z7;
        w0.s sVar2;
        w0.s sVar3;
        int i;
        int i8 = 2;
        boolean z8 = true;
        int i9 = 0;
        switch (this.f839d) {
            case 0:
                return l0.f((x0) this.f840e);
            case 1:
                File file = (File) ((z0) this.f840e).b();
                String name = file.getName();
                q6.i.d(name, "getName(...)");
                String str = "";
                int lastIndexOf = name.lastIndexOf(46, y6.j.b0(name));
                if (lastIndexOf != -1) {
                    str = name.substring(lastIndexOf + 1, name.length());
                    q6.i.d(str, "substring(...)");
                }
                if (str.equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    q6.i.d(absoluteFile, "getAbsoluteFile(...)");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                b6.w wVar = (b6.w) this.f840e;
                h7.e eVar = a7.d0.f249a;
                a7.x.n(a7.x.a(f7.n.f2795a), null, new a0.p0(wVar, (g6.c) r5, 2), 3);
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                f0.g gVar = (f0.g) this.f840e;
                gVar.B = null;
                w1.f.n(gVar);
                w1.f.m(gVar);
                w1.f.l(gVar);
                return Boolean.TRUE;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                w1.f.l((i0.a) this.f840e);
                return c6.m.f1757a;
            case 5:
                float floatValue = ((Number) ((p6.a) this.f840e).b()).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    floatValue = 1.0f;
                }
                return Float.valueOf(floatValue);
            case 6:
                y1 y1Var = (y1) this.f840e;
                synchronized (y1Var.f5189b) {
                    w7 = y1Var.w();
                    if (((u1) y1Var.f5206t.getValue()).compareTo(u1.f5127e) <= 0) {
                        Throwable th = y1Var.f5191d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (w7 != null) {
                    ((a7.h) w7).k(c6.m.f1757a);
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                r4.c cVar = ((o4.d) this.f840e).f5626k;
                if (!cVar.i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (cVar.f6571j.f871c == p.f847d) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                v0 b8 = w5.f.b(cVar.f6563a, (t0) cVar.f6574m.getValue(), 4);
                q6.e a8 = q6.t.a(r4.b.class);
                c5.x xVar = (c5.x) b8.f868a;
                String x7 = m.a.x(a8);
                if (x7 != null) {
                    return ((r4.b) xVar.n(a8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(x7))).f6562b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                p2.b bVar = (p2.b) this.f840e;
                h1 h1Var = bVar.f5734f;
                if (((e1.e) h1Var.getValue()).f2469a == 9205357640488583168L || e1.e.c(((e1.e) h1Var.getValue()).f2469a)) {
                    return null;
                }
                return bVar.f5732d.B(((e1.e) h1Var.getValue()).f2469a);
            case x.v0.f8304b /* 9 */:
                return h0.a.x((Context) this.f840e);
            case x.v0.f8306d /* 10 */:
                return Float.valueOf(r.d.i(((a7.u) this.f840e).h()));
            case 11:
                r.s0 s0Var = (r.s0) this.f840e;
                l1 l1Var = s0Var.f6421e;
                s0Var.f6422f = l1Var != null ? ((Number) l1Var.f6356l.getValue()).longValue() : 0L;
                return c6.m.f1757a;
            case 12:
                return new o4.m((String) this.f840e);
            case 13:
                t.v0 v0Var = (t.v0) this.f840e;
                t.k kVar = (t.k) w1.f.i(v0Var, t.q0.f6842a);
                v0Var.C = kVar;
                v0Var.D = kVar != null ? new t.j(kVar.f6797a, kVar.f6798b, kVar.f6799c, kVar.f6800d) : 0;
                return c6.m.f1757a;
            case 14:
                Object s5 = ((c7.g) this.f840e).s();
                return (u.d0) (s5 instanceof c7.i ? null : s5);
            case x.v0.f8308f /* 15 */:
                v0.b bVar2 = (v0.b) this.f840e;
                v0.i iVar = bVar2.f7428d;
                Object obj = bVar2.f7431g;
                if (obj != null) {
                    return iVar.c(bVar2, obj);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 16:
                v0.h hVar = (v0.h) this.f840e;
                Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
                hVar.f7444e.e(j7);
                if (j7.isEmpty()) {
                    return null;
                }
                return j7;
            case 17:
                w0.s sVar4 = (w0.s) this.f840e;
                while (true) {
                    synchronized (sVar4.f7565g) {
                        try {
                            if (sVar4.f7561c) {
                                z3 = z8;
                                sVar = sVar4;
                            } else {
                                sVar4.f7561c = z8;
                                try {
                                    o0.e eVar2 = sVar4.f7564f;
                                    Object[] objArr = eVar2.f5578d;
                                    int i10 = eVar2.f5580f;
                                    int i11 = i9;
                                    while (i11 < i10) {
                                        try {
                                            w0.r rVar = (w0.r) objArr[i11];
                                            o.k0 k0Var = rVar.f7554g;
                                            p6.c cVar2 = rVar.f7548a;
                                            Object[] objArr2 = k0Var.f5490b;
                                            long[] jArr = k0Var.f5489a;
                                            int length = jArr.length - i8;
                                            boolean z9 = z8;
                                            if (length >= 0) {
                                                int i12 = i9;
                                                while (true) {
                                                    long j8 = jArr[i12];
                                                    sVar3 = sVar4;
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8;
                                                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                                                        int i15 = 0;
                                                        while (i15 < i14) {
                                                            if ((j8 & 255) < 128) {
                                                                i = i13;
                                                                try {
                                                                    cVar2.i(objArr2[(i12 << 3) + i15]);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    sVar2 = sVar3;
                                                                    z7 = 0;
                                                                    sVar2.f7561c = z7;
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i = i13;
                                                            }
                                                            j8 >>= i;
                                                            i15++;
                                                            i13 = i;
                                                        }
                                                        if (i14 != i13) {
                                                        }
                                                    }
                                                    if (i12 != length) {
                                                        i12++;
                                                        sVar4 = sVar3;
                                                    }
                                                }
                                            } else {
                                                sVar3 = sVar4;
                                            }
                                            k0Var.b();
                                            i11++;
                                            z8 = z9;
                                            sVar4 = sVar3;
                                            i8 = 2;
                                            i9 = 0;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            sVar3 = sVar4;
                                        }
                                    }
                                    z3 = z8;
                                    sVar = sVar4;
                                    sVar.f7561c = i9;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z7 = i9;
                                    sVar2 = sVar4;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (!sVar.a()) {
                        return c6.m.f1757a;
                    }
                    sVar4 = sVar;
                    z8 = z3;
                    i8 = 2;
                    i9 = 0;
                }
            case 18:
                x4.f fVar = (x4.f) this.f840e;
                fVar.g().a(new x4.b(fVar, i9));
                return c6.m.f1757a;
            case 19:
                return this.f840e;
            default:
                File file2 = (File) this.f840e;
                synchronized (y3.e0.f8860d) {
                    y3.e0.f8859c.remove(file2.getAbsolutePath());
                }
                return c6.m.f1757a;
        }
    }
}
