package b6;

import android.content.Context;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import j0.n2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m0.t2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final u0.c f1356a = new u0.c(-941232542, false, new j(0));

    /* renamed from: b, reason: collision with root package name */
    public static final u0.c f1357b = new u0.c(971460509, false, new j(1));

    /* renamed from: c, reason: collision with root package name */
    public static final u0.c f1358c = new u0.c(-1552692586, false, new j(2));

    /* renamed from: d, reason: collision with root package name */
    public static final u0.c f1359d = new u0.c(53039815, false, new j(3));

    /* renamed from: e, reason: collision with root package name */
    public static final u0.c f1360e = new u0.c(-583572400, false, new j(4));

    /* renamed from: f, reason: collision with root package name */
    public static final u0.c f1361f = new u0.c(602264123, false, new j(5));

    /* renamed from: g, reason: collision with root package name */
    public static final u0.c f1362g = new u0.c(1085271744, false, new a0.w0(4));

    /* renamed from: h, reason: collision with root package name */
    public static final u0.c f1363h = new u0.c(-543915190, false, new j(6));
    public static final u0.c i = new u0.c(1617614983, false, new l());

    /* renamed from: j, reason: collision with root package name */
    public static final u0.c f1364j = new u0.c(-1717240637, false, new a0.w0(5));

    /* renamed from: k, reason: collision with root package name */
    public static final u0.c f1365k = new u0.c(1581919706, false, new j(7));

    /* renamed from: l, reason: collision with root package name */
    public static final u0.c f1366l = new u0.c(184541361, false, new j(8));

    /* renamed from: m, reason: collision with root package name */
    public static final u0.c f1367m = new u0.c(-552686882, false, new j(9));

    /* renamed from: n, reason: collision with root package name */
    public static final u0.c f1368n = new u0.c(76732192, false, new j(10));

    public static final void A(y0.m mVar, u0.c cVar, m0.s sVar, int i8) {
        y0.m mVar2;
        d0.d dVar;
        m0.z0 z0Var;
        Float valueOf = Float.valueOf(0.0f);
        sVar.W(-1679711445);
        int i9 = i8 | 6;
        if (sVar.N(i9 & 1, (i9 & 19) != 18)) {
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(valueOf);
                sVar.f0(K);
            }
            m0.z0 z0Var2 = (m0.z0) K;
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = m0.b.q(valueOf);
                sVar.f0(K2);
            }
            m0.z0 z0Var3 = (m0.z0) K2;
            Object K3 = sVar.K();
            if (K3 == v0Var) {
                K3 = m0.b.q(d6.u.f2326d);
                sVar.f0(K3);
            }
            m0.z0 z0Var4 = (m0.z0) K3;
            Object K4 = sVar.K();
            g6.c cVar2 = null;
            if (K4 == v0Var) {
                K4 = new a2(z0Var4, null, 0);
                sVar.f0(K4);
            }
            m0.b.f(c6.m.f1757a, sVar, (p6.e) K4);
            Float valueOf2 = Float.valueOf(((Number) r.d.d(r.d.k("snowfall", sVar), 0.0f, 1.0f, r.d.j(r.d.m(16000, 2, r.u.f6438b), r.j0.f6325d), "time", sVar, 29112).f6216f.getValue()).floatValue());
            Object K5 = sVar.K();
            if (K5 == v0Var) {
                b0.c cVar3 = new b0.c(z0Var4, z0Var3, z0Var2, cVar2, 3);
                z0Var = z0Var2;
                dVar = null;
                sVar.f0(cVar3);
                K5 = cVar3;
            } else {
                dVar = null;
                z0Var = z0Var2;
            }
            m0.b.f(valueOf2, sVar, (p6.e) K5);
            u1.e0 d8 = x.k.d(y0.b.f8681d, false);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            FillElement fillElement = androidx.compose.foundation.layout.a.f503b;
            y0.m a02 = r2.o.a0(sVar, fillElement);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            y0.m a8 = androidx.compose.foundation.a.a(fillElement, new f1.b0(s6.a.y(new f1.s(f1.p.c(4280171103L)), new f1.s(f1.p.c(4280961647L)), new f1.s(f1.p.c(4280171103L))), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L)), dVar, 6);
            Object K6 = sVar.K();
            if (K6 == v0Var) {
                K6 = new c0(z0Var, z0Var3, z0Var4);
                sVar.f0(K6);
            }
            r2.r.a(a8, (p6.c) K6, sVar, 54);
            cVar.g(sVar, 6);
            sVar.p(true);
            mVar2 = y0.j.f8705a;
        } else {
            sVar.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i8, 5, mVar2, cVar);
        }
    }

    public static final void B(String str, String str2, List list, i iVar, p6.c cVar, y0.m mVar, m0.s sVar, int i8) {
        long b8;
        q6.i.e(cVar, "onItemDropped");
        sVar.W(-891253887);
        int i9 = i8 | (sVar.h(list) ? 256 : 128);
        if (sVar.N(i9 & 1, (66707 & i9) != 66706)) {
            int ordinal = iVar.ordinal();
            if (ordinal == 0) {
                b8 = f1.s.b(f1.p.c(4280391411L), 0.2f);
            } else if (ordinal == 1) {
                b8 = f1.s.b(f1.p.c(4278238420L), 0.2f);
            } else {
                if (ordinal != 2) {
                    throw new a5.c();
                }
                b8 = f1.s.b(f1.p.c(4283215696L), 0.2f);
            }
            j0.m.d(mVar, d0.e.a(20), j0.m.j(b8, sVar, 0), j0.m.k(62, 2), u0.h.d(1629920335, new d0(list, str2, str, 1), sVar), sVar, 196614, 16);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new m0(str, str2, list, iVar, cVar, mVar, i8, 0);
        }
    }

    public static final void C(h0 h0Var, p6.c cVar, y0.m mVar, m0.s sVar, int i8) {
        final p6.c cVar2;
        y0.m mVar2;
        w1.y yVar;
        boolean z3;
        final m0.z0 z0Var;
        m0.s sVar2 = sVar;
        q6.i.e(h0Var, "item");
        q6.i.e(cVar, "onDrop");
        sVar2.W(-434730917);
        int i9 = i8 | (sVar2.f(h0Var) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16) | 384;
        if (sVar2.N(i9 & 1, (i9 & 147) != 146)) {
            Object K = sVar2.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(Boolean.FALSE);
                sVar2.f0(K);
            }
            m0.z0 z0Var2 = (m0.z0) K;
            t2 a8 = r.f.a(((Boolean) z0Var2.getValue()).booleanValue() ? 1.15f : 1.0f, r.d.l(0.5f, 0.0f, null, 6), "scale", sVar, 3120, 20);
            r.f.a(((Boolean) z0Var2.getValue()).booleanValue() ? 5.0f : 0.0f, r.d.l(0.0f, 0.0f, null, 7), "rotation", sVar, 3120, 20);
            x.q a9 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.j jVar = y0.j.f8705a;
            y0.m a02 = r2.o.a0(sVar, jVar);
            w1.i.f7684c.getClass();
            w1.y yVar2 = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar2);
            } else {
                sVar.i0();
            }
            w1.g gVar = w1.h.f7678e;
            m0.b.u(a9, sVar, gVar);
            w1.g gVar2 = w1.h.f7677d;
            m0.b.u(l3, sVar, gVar2);
            w1.g gVar3 = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar3);
            }
            w1.g gVar4 = w1.h.f7676c;
            m0.b.u(a02, sVar, gVar4);
            y0.m D = s6.a.D(androidx.compose.foundation.layout.a.j(70), ((Number) a8.getValue()).floatValue());
            u2 u2Var = j0.c0.f3599a;
            float f6 = 16;
            y0.m d8 = androidx.compose.foundation.a.a(D, w5.f.l(s6.a.y(new f1.s(f1.s.b(((j0.b0) sVar.j(u2Var)).f3571p, 0.9f)), new f1.s(f1.s.b(((j0.b0) sVar.j(u2Var)).f3559c, 0.3f)))), d0.e.a(f6), 4).d(new BorderModifierNodeElement((float) 2.5d, w5.f.l(s6.a.y(new f1.s(((j0.b0) sVar.j(u2Var)).f3555a), new f1.s(((j0.b0) sVar.j(u2Var)).f3562f))), d0.e.a(f6)));
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = new a0.c0(z0Var2, 3);
                sVar.f0(K2);
            }
            y0.m d9 = androidx.compose.foundation.a.d(d8, (p6.a) K2);
            u1.e0 d10 = x.k.d(y0.b.f8685h, false);
            int hashCode2 = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a03 = r2.o.a0(sVar, d9);
            sVar.Y();
            if (sVar.S) {
                yVar = yVar2;
                sVar.k(yVar);
            } else {
                yVar = yVar2;
                sVar.i0();
            }
            m0.b.u(d10, sVar, gVar);
            m0.b.u(l7, sVar, gVar2);
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar, gVar4);
            w1.y yVar3 = yVar;
            n2.b(h0Var.f1332a, null, 0L, r2.o.Q(36), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
            sVar2 = sVar;
            sVar2.p(true);
            if (((Boolean) z0Var2.getValue()).booleanValue()) {
                sVar2.V(1217343125);
                x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 12));
                x.l0 a10 = x.k0.a(x.i.g(10), y0.b.f8689m, sVar2, 6);
                int hashCode3 = Long.hashCode(sVar2.T);
                m0.o1 l8 = sVar2.l();
                y0.m a04 = r2.o.a0(sVar2, jVar);
                sVar2.Y();
                if (sVar2.S) {
                    sVar2.k(yVar3);
                } else {
                    sVar2.i0();
                }
                m0.b.u(a10, sVar2, gVar);
                m0.b.u(l8, sVar2, gVar2);
                if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                    a0.q.n(hashCode3, sVar2, hashCode3, gVar3);
                }
                m0.b.u(a04, sVar2, gVar4);
                int i10 = i9 & 112;
                boolean z7 = i10 == 32;
                Object K3 = sVar2.K();
                if (z7 || K3 == v0Var) {
                    final int i11 = 0;
                    cVar2 = cVar;
                    z0Var = z0Var2;
                    K3 = new p6.a() { // from class: b6.t0
                        @Override // p6.a
                        public final Object b() {
                            switch (i11) {
                                case 0:
                                    cVar2.i(i.f1336d);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                case 1:
                                    cVar2.i(i.f1337e);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    cVar2.i(i.f1338f);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    };
                    sVar2.f0(K3);
                } else {
                    cVar2 = cVar;
                    z0Var = z0Var2;
                }
                g("🧥", "Clothing", i.f1336d, (p6.a) K3, sVar2, 438);
                boolean z8 = i10 == 32;
                Object K4 = sVar2.K();
                if (z8 || K4 == v0Var) {
                    final int i12 = 1;
                    K4 = new p6.a() { // from class: b6.t0
                        @Override // p6.a
                        public final Object b() {
                            switch (i12) {
                                case 0:
                                    cVar2.i(i.f1336d);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                case 1:
                                    cVar2.i(i.f1337e);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    cVar2.i(i.f1338f);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    };
                    sVar2.f0(K4);
                }
                g("⛷️", "Items", i.f1337e, (p6.a) K4, sVar2, 438);
                boolean z9 = i10 == 32;
                Object K5 = sVar2.K();
                if (z9 || K5 == v0Var) {
                    final int i13 = 2;
                    K5 = new p6.a() { // from class: b6.t0
                        @Override // p6.a
                        public final Object b() {
                            switch (i13) {
                                case 0:
                                    cVar2.i(i.f1336d);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                case 1:
                                    cVar2.i(i.f1337e);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                                default:
                                    cVar2.i(i.f1338f);
                                    z0Var.setValue(Boolean.FALSE);
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    };
                    sVar2.f0(K5);
                }
                g("🎄", "Decor", i.f1338f, (p6.a) K5, sVar2, 438);
                sVar2.p(true);
                z3 = false;
            } else {
                cVar2 = cVar;
                z3 = false;
                sVar2.V(1199793777);
            }
            sVar2.p(z3);
            sVar2.p(true);
            mVar2 = jVar;
        } else {
            cVar2 = cVar;
            sVar2.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new c(h0Var, cVar2, mVar2, i8, 1);
        }
    }

    public static final void D(final String str, final String str2, final String str3, final String str4, final List list, y0.m mVar, m0.s sVar, int i8) {
        q6.i.e(str2, "value");
        sVar.W(-1865783359);
        int i9 = i8 | (sVar.f(str2) ? 32 : 16) | (sVar.f(mVar) ? 131072 : 65536);
        if (sVar.N(i9 & 1, (74899 & i9) != 74898)) {
            j0.m.d(mVar, d0.e.a(20), j0.m.j(f1.s.f2703g, sVar, 6), j0.m.k(62, 4), u0.h.d(-61898061, new p6.f() { // from class: b6.a1
                @Override // p6.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    int i10;
                    boolean z3;
                    m0.s sVar2 = (m0.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    q6.i.e((x.r) obj, "$this$Card");
                    if (sVar2.N(intValue & 1, (intValue & 17) != 16)) {
                        y0.j jVar = y0.j.f8705a;
                        float f6 = 20;
                        y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.a.d(jVar, 1.0f), new f1.b0(list, 0L, 9187343241974906880L), d0.e.a(f6), 4), f6);
                        u1.e0 d8 = x.k.d(y0.b.f8681d, false);
                        int hashCode = Long.hashCode(sVar2.T);
                        m0.o1 l3 = sVar2.l();
                        y0.m a02 = r2.o.a0(sVar2, g3);
                        w1.i.f7684c.getClass();
                        w1.y yVar = w1.h.f7675b;
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        w1.g gVar = w1.h.f7678e;
                        m0.b.u(d8, sVar2, gVar);
                        w1.g gVar2 = w1.h.f7677d;
                        m0.b.u(l3, sVar2, gVar2);
                        w1.g gVar3 = w1.h.f7679f;
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                            a0.q.n(hashCode, sVar2, hashCode, gVar3);
                        }
                        w1.g gVar4 = w1.h.f7676c;
                        m0.b.u(a02, sVar2, gVar4);
                        y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                        x.q a8 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar2, 48);
                        int hashCode2 = Long.hashCode(sVar2.T);
                        m0.o1 l7 = sVar2.l();
                        y0.m a03 = r2.o.a0(sVar2, d9);
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        m0.b.u(a8, sVar2, gVar);
                        m0.b.u(l7, sVar2, gVar2);
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                            a0.q.n(hashCode2, sVar2, hashCode2, gVar3);
                        }
                        m0.b.u(a03, sVar2, gVar4);
                        n2.b(str4, null, 0L, r2.o.Q(36), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262126);
                        x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 8));
                        x.l0 a9 = x.k0.a(x.i.f8224d, y0.b.f8691o, sVar2, 54);
                        int hashCode3 = Long.hashCode(sVar2.T);
                        m0.o1 l8 = sVar2.l();
                        y0.m a04 = r2.o.a0(sVar2, jVar);
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        m0.b.u(a9, sVar2, gVar);
                        m0.b.u(l8, sVar2, gVar2);
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                            a0.q.n(hashCode3, sVar2, hashCode3, gVar3);
                        }
                        m0.b.u(a04, sVar2, gVar4);
                        long Q = r2.o.Q(28);
                        j2.k kVar = j2.k.f3997h;
                        u2 u2Var = j0.c0.f3599a;
                        n2.b(str2, null, ((j0.b0) sVar2.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                        m0.s sVar3 = sVar2;
                        String str5 = str3;
                        if (str5.length() > 0) {
                            sVar3.V(-142088462);
                            i10 = 4;
                            n2.b(str5, androidx.compose.foundation.layout.a.i(4), f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.6f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24624, 0, 262120);
                            sVar3 = sVar3;
                            z3 = false;
                        } else {
                            i10 = 4;
                            z3 = false;
                            sVar3.V(-152580753);
                        }
                        sVar3.p(z3);
                        sVar3.p(true);
                        x.v0.a(sVar3, androidx.compose.foundation.layout.a.e(jVar, i10));
                        m0.s sVar4 = sVar3;
                        n2.b(str, null, f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.8f), r2.o.Q(14), null, j2.k.f3996g, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597440, 0, 262058);
                        sVar4.p(true);
                        sVar4.p(true);
                    } else {
                        sVar2.Q();
                    }
                    return c6.m.f1757a;
                }
            }, sVar), sVar, ((i9 >> 15) & 14) | 196608, 16);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new m0(str, str2, str3, str4, list, mVar, i8);
        }
    }

    public static final x0 E(int i8) {
        i iVar = i.f1336d;
        h0 h0Var = new h0("🧣", iVar);
        h0 h0Var2 = new h0("🧤", iVar);
        h0 h0Var3 = new h0("🧥", iVar);
        h0 h0Var4 = new h0("👢", iVar);
        h0 h0Var5 = new h0("🎩", iVar);
        h0 h0Var6 = new h0("🧦", iVar);
        h0 h0Var7 = new h0("🧢", iVar);
        h0 h0Var8 = new h0("🩱", iVar);
        h0 h0Var9 = new h0("🧵", iVar);
        h0 h0Var10 = new h0("🧶", iVar);
        i iVar2 = i.f1337e;
        h0 h0Var11 = new h0("⛷️", iVar2);
        h0 h0Var12 = new h0("🏂", iVar2);
        h0 h0Var13 = new h0("☃️", iVar2);
        h0 h0Var14 = new h0("❄️", iVar2);
        h0 h0Var15 = new h0("🌨️", iVar2);
        h0 h0Var16 = new h0("🏔️", iVar2);
        h0 h0Var17 = new h0("⛄", iVar2);
        h0 h0Var18 = new h0("🛷", iVar2);
        h0 h0Var19 = new h0("🎿", iVar2);
        h0 h0Var20 = new h0("🧊", iVar2);
        i iVar3 = i.f1338f;
        i iVar4 = iVar3;
        List y7 = s6.a.y(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, new h0("🎄", iVar3), new h0("🎅", iVar3), new h0("🎁", iVar3), new h0("🕯️", iVar3), new h0("🌟", iVar3), new h0("🎀", iVar3), new h0("🎊", iVar3), new h0("🎉", iVar3), new h0("🔔", iVar3), new h0("❄️", iVar3));
        int i9 = i8 <= 5 ? i8 + 3 : i8 <= 10 ? ((i8 - 5) * 2) + 8 : i8 + 8;
        if (i9 > 30) {
            i9 = 30;
        }
        List i02 = d6.m.i0(y7);
        Collections.shuffle(i02);
        ArrayList arrayList = new ArrayList();
        int i10 = i9 / 3;
        int i11 = i9 % 3;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) i02;
        int size = arrayList3.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList3.get(i13);
            i13++;
            if (((h0) obj).f1333b == iVar) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(d6.m.e0((i11 > 0 ? 1 : 0) + i10, arrayList2));
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            if (((h0) obj2).f1333b == iVar2) {
                arrayList4.add(obj2);
            }
        }
        arrayList.addAll(d6.m.e0((i11 <= 1 ? 0 : 1) + i10, arrayList4));
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            i iVar5 = iVar4;
            if (((h0) obj3).f1333b == iVar5) {
                arrayList5.add(obj3);
            }
            iVar4 = iVar5;
        }
        arrayList.addAll(d6.m.e0(i10, arrayList5));
        List i03 = d6.m.i0(arrayList);
        Collections.shuffle(i03);
        List g02 = d6.m.g0(i03);
        d6.u uVar = d6.u.f2326d;
        return new x0(i8, i03, g02, uVar, uVar, uVar, false, 0, 0);
    }

    public static final void a(a aVar, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        long b8;
        q6.i.e(aVar, "achievement");
        boolean z3 = aVar.f1252f;
        sVar.W(660121536);
        int i9 = (sVar.f(aVar) ? 4 : 2) | i8 | 48;
        if (sVar.N(i9 & 1, (i9 & 19) != 18)) {
            t2 a8 = r.f.a(z3 ? 1.0f : 0.95f, r.d.l(0.5f, 0.0f, null, 6), "scale", sVar, 3120, 20);
            mVar2 = y0.j.f8705a;
            y0.m D = s6.a.D(androidx.compose.foundation.layout.a.d(mVar2, 1.0f), ((Number) a8.getValue()).floatValue());
            d0.d a9 = d0.e.a(18);
            if (z3) {
                sVar.V(-974028859);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3559c, 0.4f);
                sVar.p(false);
            } else {
                sVar.V(-973930930);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.5f);
                sVar.p(false);
            }
            j0.m.d(D, a9, j0.m.j(b8, sVar, 0), j0.m.k(62, z3 ? 6 : 2), u0.h.d(2009161778, new a7.g(1, aVar), sVar), sVar, 196608, 16);
        } else {
            sVar.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i8, 1, aVar, mVar2);
        }
    }

    public static final void b(String str, ArrayList arrayList, y0.m mVar, m0.s sVar, int i8) {
        m0.s sVar2;
        sVar.W(55299807);
        int i9 = i8 | (sVar.h(arrayList) ? 32 : 16);
        if (sVar.N(i9 & 1, (i9 & 147) != 146)) {
            x.q a8 = x.o.a(x.i.g(12), y0.b.f8692p, sVar, 6);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, mVar);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            n2.b(str, androidx.compose.foundation.layout.a.h(y0.j.f8705a, 4, 0.0f, 2), ((j0.b0) sVar.j(j0.c0.f3599a)).f3570o, r2.o.Q(20), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597494, 0, 262056);
            sVar2 = sVar;
            sVar2.V(-185688862);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a((a) obj, null, sVar2, 0);
            }
            sVar2.p(false);
            sVar2.p(true);
        } else {
            sVar2 = sVar;
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new c(str, arrayList, mVar, i8, 0);
        }
    }

    public static final void c(w wVar, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        final int i9;
        m0.s sVar2 = sVar;
        sVar2.W(413489000);
        int i10 = (sVar2.h(wVar) ? 4 : 2) | i8 | 48;
        if (sVar2.N(i10 & 1, (i10 & 19) != 18)) {
            m0.z0 j7 = m0.b.j(wVar.f1490c, 1, null, sVar2, 48, 2);
            m0.z0 j8 = m0.b.j(wVar.f1491d, 0, null, sVar, 48, 2);
            int intValue = ((Number) m0.b.j(wVar.f1494g, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) m0.b.j(wVar.f1493f, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) m0.b.j(wVar.f1492e, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) j8.getValue()).intValue();
            b bVar = b.f1265g;
            a aVar = new a("first_steps", "First Steps", "Complete the onboarding", "👣", bVar, true);
            boolean z3 = ((Number) j7.getValue()).intValue() >= 1;
            b bVar2 = b.f1262d;
            a aVar2 = new a("level_1", "Getting Started", "Complete level 1", "🎯", bVar2, z3);
            a aVar3 = new a("level_5", "Halfway Hero", "Complete level 5", "⭐", bVar2, ((Number) j7.getValue()).intValue() >= 5);
            a aVar4 = new a("level_10", "Midnight Master", "Complete level 10", "🏆", bVar2, ((Number) j7.getValue()).intValue() >= 10);
            a aVar5 = new a("level_15", "Elite Player", "Complete level 15", "👑", bVar2, ((Number) j7.getValue()).intValue() >= 15);
            a aVar6 = new a("level_20", "Winter Sort Master", "Complete all 20 levels", "🎊", bVar2, ((Number) j7.getValue()).intValue() >= 20);
            boolean z7 = intValue >= 10;
            b bVar3 = b.f1263e;
            a aVar7 = new a("quiz_beginner", "Quiz Beginner", "Score 10 points in quizzes", "📝", bVar3, z7);
            a aVar8 = new a("quiz_expert", "Quiz Expert", "Score 25 points in quizzes", "🎓", bVar3, intValue >= 25);
            a aVar9 = new a("quiz_master", "Quiz Master", "Score maximum points in all quizzes", "🏅", bVar3, intValue >= 40);
            b bVar4 = b.f1264f;
            List y7 = s6.a.y(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a("explorer", "Winter Explorer", "Read all encyclopedia articles", "📚", bVar4, false), new a("perfectionist", "Perfectionist", "Complete a level without mistakes", "💎", bVar2, false), new a("speed_demon", "Speed Demon", "Complete 5 levels in one session", "⚡", bVar2, false));
            if (y7.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it = y7.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (((a) it.next()).f1252f && (i11 = i11 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                i9 = i11;
            }
            final int size = y7.size();
            int i12 = (int) ((i9 / size) * 100);
            float f6 = 16;
            y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar)), f6);
            x.q a8 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar, 6);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            y0.j jVar = y0.j.f8705a;
            y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
            d0.d a9 = d0.e.a(24);
            u2 u2Var = j0.c0.f3599a;
            b bVar5 = bVar;
            b bVar6 = bVar2;
            b bVar7 = bVar3;
            b bVar8 = bVar4;
            j0.m.d(d8, a9, j0.m.j(f1.s.b(((j0.b0) sVar.j(u2Var)).f3559c, 0.3f), sVar, 0), null, u0.h.d(1763425104, new p6.f() { // from class: b6.e
                @Override // p6.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    m0.s sVar3 = (m0.s) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    q6.i.e((x.r) obj, "$this$Card");
                    if (sVar3.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                        y0.j jVar2 = y0.j.f8705a;
                        y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 24);
                        x.q a10 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar3, 48);
                        int hashCode2 = Long.hashCode(sVar3.T);
                        m0.o1 l7 = sVar3.l();
                        y0.m a03 = r2.o.a0(sVar3, g7);
                        w1.i.f7684c.getClass();
                        w1.y yVar2 = w1.h.f7675b;
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar2);
                        } else {
                            sVar3.i0();
                        }
                        m0.b.u(a10, sVar3, w1.h.f7678e);
                        m0.b.u(l7, sVar3, w1.h.f7677d);
                        w1.g gVar2 = w1.h.f7679f;
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode2))) {
                            a0.q.n(hashCode2, sVar3, hashCode2, gVar2);
                        }
                        m0.b.u(a03, sVar3, w1.h.f7676c);
                        n2.b("🏆", null, 0L, r2.o.Q(64), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24582, 0, 262126);
                        float f8 = 8;
                        x.v0.a(sVar3, androidx.compose.foundation.layout.a.e(jVar2, f8));
                        long Q = r2.o.Q(32);
                        j2.k kVar = j2.k.f3997h;
                        u2 u2Var2 = j0.c0.f3599a;
                        n2.b("Achievements", null, ((j0.b0) sVar3.j(u2Var2)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597446, 0, 262058);
                        x.v0.a(sVar3, androidx.compose.foundation.layout.a.e(jVar2, f8));
                        n2.b(i9 + " / " + size + " Unlocked", null, f1.s.b(((j0.b0) sVar3.j(u2Var2)).f3570o, 0.8f), r2.o.Q(18), null, j2.k.f3996g, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597440, 0, 262058);
                        sVar3.p(true);
                    } else {
                        sVar3.Q();
                    }
                    return c6.m.f1757a;
                }
            }, sVar), sVar, 196614, 24);
            mVar2 = jVar;
            j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar.j(u2Var)).f3571p, 0.7f), sVar, 0), j0.m.k(62, 4), u0.h.d(-1177823097, new f(i9, size, i12, 0), sVar), sVar, 196614, 16);
            sVar2 = sVar;
            ArrayList arrayList = new ArrayList();
            for (Object obj : y7) {
                b bVar9 = bVar6;
                if (((a) obj).f1251e == bVar9) {
                    arrayList.add(obj);
                }
                bVar6 = bVar9;
            }
            b("🎮 Game Achievements", arrayList, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar2, 390);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : y7) {
                b bVar10 = bVar7;
                if (((a) obj2).f1251e == bVar10) {
                    arrayList2.add(obj2);
                }
                bVar7 = bVar10;
            }
            b("📝 Quiz Achievements", arrayList2, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar2, 390);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : y7) {
                b bVar11 = bVar8;
                if (((a) obj3).f1251e == bVar11) {
                    arrayList3.add(obj3);
                }
                bVar8 = bVar11;
            }
            b("📚 Exploration Achievements", arrayList3, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar2, 390);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : y7) {
                b bVar12 = bVar5;
                if (((a) obj4).f1251e == bVar12) {
                    arrayList4.add(obj4);
                }
                bVar5 = bVar12;
            }
            b("⭐ Milestone Achievements", arrayList4, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar2, 390);
            sVar2.p(true);
        } else {
            sVar2.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new g(wVar, mVar2, i8, 0);
        }
    }

    public static final void d(w wVar, m0.s sVar, int i8) {
        m0.s sVar2;
        sVar.W(-167803941);
        int i9 = (sVar.h(wVar) ? 4 : 2) | i8;
        if (sVar.N(i9 & 1, (i9 & 3) != 2)) {
            sVar2 = sVar;
            if (((Boolean) m0.b.j(wVar.f1489b, Boolean.TRUE, null, sVar2, 48, 2).getValue()).booleanValue()) {
                sVar2.V(294908123);
                boolean h8 = sVar2.h(wVar);
                Object K = sVar2.K();
                if (h8 || K == m0.n.f5019a) {
                    K = new androidx.lifecycle.m0(2, wVar);
                    sVar2.f0(K);
                }
                s((p6.a) K, null, sVar2, 0);
                sVar2.p(false);
            } else {
                sVar2.V(295204421);
                e(wVar, null, sVar2, i9 & 14);
                sVar2.p(false);
            }
        } else {
            sVar2 = sVar;
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new b1(wVar, i8);
        }
    }

    public static final void e(w wVar, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        sVar.W(412981787);
        int i9 = (sVar.h(wVar) ? 4 : 2) | i8 | 48;
        if (sVar.N(i9 & 1, (i9 & 19) != 18)) {
            Context context = (Context) sVar.j(x1.k0.f8488b);
            Object[] copyOf = Arrays.copyOf(new o4.y[0], 0);
            a0.a0 a0Var = new a0.a0(21, new g2.v(10), new a0.t(17, context));
            boolean h8 = sVar.h(context);
            Object K = sVar.K();
            if (h8 || K == m0.n.f5019a) {
                K = new androidx.lifecycle.m0(9, context);
                sVar.f0(K);
            }
            o4.t tVar = (o4.t) v0.j.c(copyOf, a0Var, (p6.a) K, sVar, 0, 4);
            o4.d dVar = (o4.d) m0.b.j(new d7.x(tVar.f5685b.f6608z), null, null, sVar, 48, 2).getValue();
            o4.o oVar = dVar != null ? dVar.f5621e : null;
            m0.z0 j7 = m0.b.j(wVar.f1490c, 1, null, sVar, 48, 2);
            u0.c d8 = u0.h.d(-1139165514, new a0.e0(3, oVar, tVar), sVar);
            u0.c d9 = u0.h.d(1049803948, new d0(tVar, wVar, j7, 2), sVar);
            mVar2 = y0.j.f8705a;
            j0.d2.a(mVar2, null, d8, null, null, 0, 0L, 0L, null, d9, sVar, 805306758);
        } else {
            sVar.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new g(wVar, mVar2, i8, 1);
        }
    }

    public static final void f(h hVar, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        q6.i.e(hVar, "article");
        sVar.W(1574419858);
        int i9 = (sVar.f(hVar) ? 4 : 2) | i8 | 48;
        if (sVar.N(i9 & 1, (i9 & 19) != 18)) {
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(Boolean.FALSE);
                sVar.f0(K);
            }
            m0.z0 z0Var = (m0.z0) K;
            mVar2 = y0.j.f8705a;
            y0.m d8 = androidx.compose.foundation.layout.a.d(mVar2, 1.0f);
            d0.d a8 = d0.e.a(20);
            j0.w j7 = j0.m.j(f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.7f), sVar, 0);
            j0.x k3 = j0.m.k(62, 4);
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = new a0.c0(z0Var, 1);
                sVar.f0(K2);
            }
            j0.m.c((p6.a) K2, d8, false, a8, j7, k3, u0.h.d(-750259961, new a0(0, hVar, z0Var), sVar), sVar, 100663302, 196);
        } else {
            sVar.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i8, 2, hVar, mVar2);
        }
    }

    public static final void g(String str, String str2, i iVar, p6.a aVar, m0.s sVar, int i8) {
        q6.i.e(aVar, "onClick");
        sVar.W(-1155563799);
        int i9 = (sVar.h(aVar) ? 2048 : 1024) | i8;
        if (sVar.N(i9 & 1, (i9 & 1043) != 1042)) {
            j0.m.c(aVar, androidx.compose.foundation.layout.a.m(y0.j.f8705a, 70), false, d0.e.a(14), j0.m.j(f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3559c, 0.6f), sVar, 0), j0.m.k(62, 4), u0.h.d(1741815892, new a0(1, str, str2), sVar), sVar, ((i9 >> 9) & 14) | 100663344, 196);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.b0(str, str2, iVar, aVar, i8);
        }
    }

    public static final void h(y0.m mVar, m0.s sVar, int i8) {
        m0.s sVar2;
        sVar.W(-1680130230);
        int i9 = i8 | 6;
        if (sVar.N(i9 & 1, (i9 & 3) != 2)) {
            List y7 = s6.a.y(new h("The Science of Snowflakes", "❄️", "Snowflakes are one of nature's most beautiful and intricate creations. Each snowflake is a unique ice crystal that forms when water vapor in the atmosphere freezes directly into ice, bypassing the liquid phase. This process is called deposition.\n\nThe classic six-sided structure of snowflakes comes from the hexagonal crystal structure of ice. As water molecules freeze, they arrange themselves in a hexagonal pattern, which is why snowflakes always have six sides or six-fold symmetry.\n\nThe shape and complexity of a snowflake depend on temperature and humidity. At temperatures around -2°C (28°F), simple plate-like crystals form. As the temperature drops to around -5°C (23°F), columns and needles appear. At -15°C (5°F), the classic dendritic (branching) snowflakes form, creating the intricate patterns we most associate with snowflakes.\n\nNo two snowflakes are exactly alike because each one experiences slightly different conditions as it falls through the atmosphere. The path it takes, the temperature variations, and the humidity levels all contribute to its unique shape. However, snowflakes can be very similar, especially if they form under nearly identical conditions.\n\nWilson Bentley, known as \"Snowflake Bentley,\" was the first person to photograph snowflakes in 1885. He captured over 5,000 images of snowflakes, proving their incredible diversity and beauty."), new h("Winter Solstice", "🌅", "The Winter Solstice marks the shortest day and longest night of the year in the Northern Hemisphere. It occurs around December 21st or 22nd each year, when the North Pole is tilted farthest away from the Sun.\n\nThis astronomical event has been celebrated by cultures around the world for thousands of years. Ancient peoples understood that after the solstice, days would gradually grow longer, symbolizing the return of light and the promise of spring.\n\nIn ancient Rome, the festival of Saturnalia was held around the solstice, a time of feasting, gift-giving, and role reversals. The Norse celebrated Yule, a 12-day festival that included burning a Yule log and feasting. Many of these traditions influenced modern Christmas celebrations.\n\nStonehenge in England is aligned with the winter solstice sunset, suggesting its builders understood this celestial event. Similarly, Newgrange in Ireland is aligned with the winter solstice sunrise, where sunlight illuminates the inner chamber only on this special day.\n\nToday, many people still celebrate the solstice with festivals, bonfires, and gatherings. It's a time to reflect on the past year, embrace the darkness, and look forward to the returning light. The solstice reminds us of the cyclical nature of life and the importance of both light and darkness."), new h("Arctic Wildlife", "🐧", "The Arctic is home to some of the world's most remarkable and resilient wildlife, perfectly adapted to survive in one of the harshest environments on Earth.\n\nPolar bears are the largest land carnivores and are uniquely adapted to Arctic life. Their thick fur and layer of blubber provide insulation, while their large paws act like snowshoes, distributing their weight on thin ice. Polar bears are excellent swimmers and can travel long distances in search of seals, their primary food source.\n\nArctic foxes change color with the seasons - white in winter for camouflage in snow, and brown or gray in summer. They have the warmest fur of any mammal, with fur even on the soles of their feet. These clever animals follow polar bears to scavenge leftover kills.\n\nPenguins, though often associated with the Arctic, actually live in the Southern Hemisphere. However, the Arctic has its own flightless bird - the Great Auk, which went extinct in the 19th century. The Arctic is home to many seabirds like puffins, guillemots, and kittiwakes.\n\nSeals are crucial to the Arctic ecosystem. Ringed seals create breathing holes in the ice and build snow caves for their pups. Harp seals migrate in massive groups, and bearded seals use their whiskers to find food in murky waters.\n\nWhales, including belugas, narwhals, and bowhead whales, navigate the Arctic's icy waters. Belugas are known as \"canaries of the sea\" for their vocalizations, while narwhals have a long tusk that's actually an elongated tooth.\n\nClimate change poses significant threats to Arctic wildlife, as melting ice affects hunting grounds, migration patterns, and food availability. Conservation efforts are crucial to protect these magnificent creatures and their fragile ecosystem."), new h("History of Skiing", "⛷️", "Skiing has a rich and ancient history, evolving from a practical means of transportation to a beloved winter sport enjoyed by millions worldwide.\n\nThe earliest evidence of skiing dates back over 8,000 years. Rock carvings in Norway depict people on skis, suggesting that skiing was used for hunting and transportation in prehistoric times. The word \"ski\" comes from the Old Norse word \"skíð,\" meaning \"split piece of wood.\"\n\nIn Scandinavia, skiing was essential for survival during long, harsh winters. People used skis to hunt, travel between settlements, and deliver messages. The Sami people of northern Scandinavia developed sophisticated ski techniques and equipment, using different types of skis for different purposes - one long ski for gliding and one shorter one for pushing.\n\nMilitary use of skis dates back centuries. Norwegian ski troops were legendary, and during World War II, ski warfare played important roles in several campaigns. The Finnish army used skis effectively during the Winter War against the Soviet Union.\n\nModern recreational skiing began in the mid-19th century in Norway. Sondre Norheim, known as the \"father of modern skiing,\" developed the first bindings that allowed skiers to turn and jump. He organized the first ski competitions in Telemark, Norway, in 1866.\n\nAlpine skiing (downhill) developed in the Alps in the early 20th century. Sir Arnold Lunn organized the first slalom race in 1922 in Switzerland. The sport gained popularity after the 1936 Winter Olympics in Garmisch-Partenkirchen, Germany.\n\nToday, skiing includes alpine skiing, cross-country skiing, freestyle skiing, ski jumping, and more. The sport has become a major industry, with ski resorts around the world attracting millions of visitors each year. Modern technology has made skiing more accessible and enjoyable, with improved equipment, grooming, and safety measures."), new h("Ice Formation and Glaciers", "🧊", "Ice is one of the most fascinating forms of water, and glaciers represent some of the most impressive natural formations on Earth.\n\nIce forms when water molecules slow down and arrange themselves into a crystalline structure. This happens at 0°C (32°F) at sea level, but the exact freezing point can vary with pressure and the presence of impurities. Pure water can sometimes remain liquid below freezing in a state called supercooling.\n\nGlaciers are massive, slow-moving rivers of ice that form over many years. They begin as snow that accumulates faster than it melts. Over time, the weight of new snow compresses the layers beneath, turning them into firn (granular ice) and eventually into solid glacial ice.\n\nThere are two main types of glaciers: alpine glaciers, which form in mountain valleys, and continental glaciers, which cover vast areas. The largest glaciers are found in Antarctica and Greenland, where ice sheets can be several kilometers thick.\n\nGlaciers are incredibly powerful forces of nature. They carve out valleys, create fjords, and shape entire landscapes. As glaciers move, they pick up rocks and debris, which act like sandpaper, grinding down the land beneath them.\n\nToday, glaciers are retreating worldwide due to climate change. This melting contributes to sea-level rise and affects global water supplies. Many glaciers that have existed for thousands of years are disappearing, which has profound implications for ecosystems and human communities that depend on glacial meltwater.\n\nScientists study glaciers to understand climate history. Ice cores drilled from glaciers contain trapped air bubbles and particles that reveal information about past climates, atmospheric composition, and even volcanic eruptions from centuries ago."), new h("Winter Sports and Activities", "🏂", "Winter transforms the landscape into a playground for countless sports and activities that celebrate the cold season.\n\nIce skating has been practiced for thousands of years, originally as a means of transportation across frozen waterways. Today, it includes figure skating, speed skating, and ice hockey. The first ice skates were made from animal bones, and modern skates evolved from these primitive designs.\n\nIce hockey originated in Canada in the 19th century and has become one of the most popular winter sports worldwide. The fast-paced game requires skill, speed, and teamwork. The Stanley Cup, awarded to the NHL champion, is one of the oldest professional sports trophies.\n\nCurling, often called \"chess on ice,\" is a strategic sport where players slide stones across ice toward a target. It requires precision, strategy, and teamwork. The sport has been part of the Winter Olympics since 1998 and has a dedicated following.\n\nSnowboarding emerged in the 1960s as an alternative to skiing. It combines elements of surfing, skateboarding, and skiing. The sport has evolved to include various disciplines like halfpipe, slopestyle, and big air, making its Olympic debut in 1998.\n\nSledding and tobogganing are simple pleasures that have been enjoyed for centuries. From wooden sleds to modern snow tubes, sliding down hills brings joy to people of all ages. The physics of sledding involves gravity, friction, and momentum.\n\nIce fishing is a popular winter activity in cold climates. Anglers drill holes through ice to catch fish, often using specialized equipment and shelters. This practice requires knowledge of ice safety and fish behavior in cold water.\n\nWinter sports not only provide recreation but also promote physical fitness, mental well-being, and appreciation for the natural world. They bring communities together and create lasting memories of the winter season."), new h("Winter Weather Phenomena", "🌨️", "Winter brings a variety of fascinating weather phenomena that create both beauty and challenges.\n\nBlizzards are severe winter storms characterized by strong winds, heavy snowfall, and reduced visibility. To be classified as a blizzard, winds must exceed 35 mph (56 km/h) and visibility must be reduced to less than a quarter mile. These storms can be extremely dangerous, causing transportation disruptions and power outages.\n\nIce storms occur when freezing rain falls and coats everything in a layer of ice. While beautiful, these storms can be devastating, causing tree branches to break, power lines to fall, and roads to become extremely dangerous. The weight of ice can cause significant damage to structures and vegetation.\n\nFrost forms when water vapor in the air directly freezes onto surfaces. This creates intricate patterns on windows, leaves, and other surfaces. Hoar frost, which forms on cold, clear nights, creates feathery, crystalline structures that are particularly beautiful.\n\nSnow squalls are intense, short-lived bursts of heavy snow accompanied by strong winds. Unlike blizzards, snow squalls typically last less than an hour but can cause sudden whiteout conditions that are extremely dangerous for drivers.\n\nLake-effect snow occurs when cold air moves over warmer lake water, picking up moisture and creating heavy snowfall downwind of the lake. This phenomenon is common around the Great Lakes in North America and can produce several feet of snow in a single event.\n\nThundersnow is a rare phenomenon where thunderstorms occur during winter storms. The combination of thunder, lightning, and heavy snow creates a dramatic and unusual weather event. This typically happens when there's strong atmospheric instability combined with cold temperatures.\n\nUnderstanding these winter weather phenomena helps us prepare for and appreciate the power and beauty of winter weather. Meteorologists use advanced technology to predict these events, helping keep communities safe."));
            float f6 = 16;
            y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar)), f6);
            x.q a8 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar, 6);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            y0.j jVar = y0.j.f8705a;
            sVar2 = sVar;
            j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3559c, 0.3f), sVar, 0), null, f1356a, sVar2, 196614, 24);
            o(sVar2, 0);
            sVar2.V(-1467674243);
            Iterator it = y7.iterator();
            while (it.hasNext()) {
                f((h) it.next(), null, sVar2, 0);
            }
            sVar2.p(false);
            sVar2.p(true);
            mVar = jVar;
        } else {
            sVar2 = sVar;
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new y(mVar, i8, 0);
        }
    }

    public static final void i(m0.s sVar, int i8) {
        m0.s sVar2 = sVar;
        sVar2.W(-1365993612);
        if (sVar2.N(i8 & 1, i8 != 0)) {
            y0.m b8 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.f503b, f1.s.b(f1.s.f2701e, 0.1f), f1.p.f2693a);
            u1.e0 d8 = x.k.d(y0.b.f8685h, false);
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            y0.m a02 = r2.o.a0(sVar2, b8);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            m0.b.u(d8, sVar2, w1.h.f7678e);
            m0.b.u(l3, sVar2, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar2, hashCode, gVar);
            }
            m0.b.u(a02, sVar2, w1.h.f7676c);
            n2.b("❌ Wrong Category!", null, f1.p.c(4294198070L), r2.o.Q(24), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597830, 0, 262058);
            sVar2 = sVar;
            sVar2.p(true);
        } else {
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new a0.w0(i8, 8);
        }
    }

    public static final void j(final e2 e2Var, final boolean z3, final p6.a aVar, m0.s sVar, final int i8) {
        long b8;
        q6.i.e(aVar, "onClick");
        sVar.W(-1114025512);
        int i9 = (sVar.h(e2Var) ? 4 : 2) | i8 | (sVar.g(z3) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.N(i9 & 1, (i9 & 147) != 146)) {
            y0.m D = s6.a.D(androidx.compose.foundation.layout.a.m(y0.j.f8705a, 100), ((Number) r.f.a(z3 ? 1.1f : 1.0f, r.d.l(0.5f, 0.0f, null, 6), "scale", sVar, 3120, 20).getValue()).floatValue());
            d0.d a8 = d0.e.a(16);
            if (z3) {
                sVar.V(-721176650);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3555a, 0.3f);
                sVar.p(false);
            } else {
                sVar.V(-721087370);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.6f);
                sVar.p(false);
            }
            j0.m.c(aVar, D, false, a8, j0.m.j(b8, sVar, 0), j0.m.k(62, z3 ? 8 : 2), u0.h.d(215300163, new a7.g(2, e2Var), sVar), sVar, 100663296 | ((i9 >> 6) & 14), 196);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(z3, aVar, i8) { // from class: b6.z

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f1516e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ p6.a f1517f;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(1);
                    k.j(e2.this, this.f1516e, this.f1517f, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final void k(w wVar, int i8, y0.m mVar, m0.s sVar, int i9) {
        y0.m mVar2;
        m0.s sVar2;
        m0.v0 v0Var;
        w1.g gVar;
        w1.g gVar2;
        w1.g gVar3;
        w1.y yVar;
        m0.z0 z0Var;
        y0.j jVar;
        x0 x0Var;
        m0.z0 z0Var2;
        a7.u uVar;
        m0.z0 z0Var3;
        float f6;
        ?? r9;
        m0.s sVar3;
        y0.j jVar2;
        a7.u uVar2;
        m0.z0 z0Var4;
        m0.z0 z0Var5;
        final m0.z0 z0Var6;
        w wVar2;
        final m0.z0 z0Var7;
        x0 x0Var2;
        List list;
        List list2;
        final x0 x0Var3;
        m0.z0 z0Var8;
        y0.j jVar3;
        m0.z0 z0Var9;
        m0.s sVar4;
        final m0.z0 z0Var10;
        x0 x0Var4;
        m0.z0 z0Var11;
        boolean z3;
        y0.j jVar4;
        m0.v0 v0Var2;
        w1.g gVar4;
        m0.z0 z0Var12;
        m0.z0 z0Var13;
        m0.z0 z0Var14;
        m0.z0 z0Var15;
        m0.s sVar5;
        w wVar3 = wVar;
        m0.s sVar6 = sVar;
        sVar6.W(723157295);
        int i10 = (sVar6.h(wVar3) ? 4 : 2) | i9 | (sVar6.d(i8) ? 32 : 16) | 384;
        if (sVar6.N(i10 & 1, (i10 & 147) != 146)) {
            Object K = sVar6.K();
            m0.v0 v0Var3 = m0.n.f5019a;
            if (K == v0Var3) {
                K = m0.b.l(sVar6);
                sVar6.f0(K);
            }
            a7.u uVar3 = (a7.u) K;
            Object K2 = sVar6.K();
            if (K2 == v0Var3) {
                K2 = m0.b.q(null);
                sVar6.f0(K2);
            }
            m0.z0 z0Var16 = (m0.z0) K2;
            Object K3 = sVar6.K();
            if (K3 == v0Var3) {
                K3 = m0.b.q(null);
                sVar6.f0(K3);
            }
            m0.z0 z0Var17 = (m0.z0) K3;
            Object K4 = sVar6.K();
            if (K4 == v0Var3) {
                K4 = m0.b.q(Boolean.FALSE);
                sVar6.f0(K4);
            }
            m0.z0 z0Var18 = (m0.z0) K4;
            Object K5 = sVar6.K();
            if (K5 == v0Var3) {
                K5 = m0.b.q(Boolean.FALSE);
                sVar6.f0(K5);
            }
            m0.z0 z0Var19 = (m0.z0) K5;
            Object K6 = sVar6.K();
            if (K6 == v0Var3) {
                K6 = m0.b.q(Boolean.FALSE);
                sVar6.f0(K6);
            }
            m0.z0 z0Var20 = (m0.z0) K6;
            Integer num = (Integer) z0Var16.getValue();
            y0.j jVar5 = y0.j.f8705a;
            if (num == null) {
                sVar6.V(23533769);
                Object K7 = sVar6.K();
                if (K7 == v0Var3) {
                    K7 = new a0.v0(2, z0Var16, z0Var17);
                    sVar6.f0(K7);
                }
                r(i8, (p6.c) K7, sVar6, ((i10 >> 3) & 14) | 48);
                sVar6.p(false);
                jVar3 = jVar5;
                sVar5 = sVar6;
            } else {
                sVar6.V(24035442);
                x0 x0Var5 = (x0) z0Var17.getValue();
                if (x0Var5 == null) {
                    sVar6.p(false);
                    m0.t1 r7 = sVar6.r();
                    if (r7 != null) {
                        r7.f5121d = new k0(wVar3, i8, i9);
                        return;
                    }
                    return;
                }
                float f8 = 16;
                y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar6)), f8);
                x.q a8 = x.o.a(x.i.g(f8), y0.b.f8693q, sVar6, 54);
                int hashCode = Long.hashCode(sVar6.T);
                m0.o1 l3 = sVar6.l();
                y0.m a02 = r2.o.a0(sVar6, g3);
                w1.i.f7684c.getClass();
                w1.y yVar2 = w1.h.f7675b;
                sVar6.Y();
                if (sVar6.S) {
                    sVar6.k(yVar2);
                } else {
                    sVar6.i0();
                }
                w1.g gVar5 = w1.h.f7678e;
                m0.b.u(a8, sVar6, gVar5);
                w1.g gVar6 = w1.h.f7677d;
                m0.b.u(l3, sVar6, gVar6);
                w1.g gVar7 = w1.h.f7679f;
                if (sVar6.S || !q6.i.a(sVar6.K(), Integer.valueOf(hashCode))) {
                    a0.q.n(hashCode, sVar6, hashCode, gVar7);
                }
                w1.g gVar8 = w1.h.f7676c;
                m0.b.u(a02, sVar6, gVar8);
                y0.m d8 = androidx.compose.foundation.layout.a.d(jVar5, 1.0f);
                x.b bVar = x.i.f8225e;
                y0.d dVar = y0.b.f8690n;
                x.l0 a9 = x.k0.a(bVar, dVar, sVar6, 54);
                int hashCode2 = Long.hashCode(sVar6.T);
                m0.o1 l7 = sVar6.l();
                y0.m a03 = r2.o.a0(sVar6, d8);
                sVar6.Y();
                if (sVar6.S) {
                    sVar6.k(yVar2);
                } else {
                    sVar6.i0();
                }
                m0.b.u(a9, sVar6, gVar5);
                m0.b.u(l7, sVar6, gVar6);
                if (sVar6.S || !q6.i.a(sVar6.K(), Integer.valueOf(hashCode2))) {
                    a0.q.n(hashCode2, sVar6, hashCode2, gVar7);
                }
                m0.b.u(a03, sVar6, gVar8);
                Object K8 = sVar6.K();
                if (K8 == v0Var3) {
                    K8 = new a0.c0(z0Var16, 2);
                    sVar6.f0(K8);
                }
                float f9 = 12;
                j0.m.b((p6.a) K8, androidx.compose.foundation.layout.a.j(48), false, d0.e.a(f9), null, null, null, null, f1357b, sVar, 805306422, 500);
                m0.s sVar7 = sVar;
                float f10 = 8;
                y0.m h8 = androidx.compose.foundation.layout.a.h(x.m0.a(x.m0.f8248a, jVar5), f10, 0.0f, 2);
                d0.d a10 = d0.e.a(f8);
                u2 u2Var = j0.c0.f3599a;
                j0.m.d(h8, a10, j0.m.j(f1.s.b(((j0.b0) sVar7.j(u2Var)).f3559c, 0.3f), sVar7, 0), null, u0.h.d(-2116917601, new a7.g(4, x0Var5), sVar7), sVar7, 196608, 24);
                sVar7.p(true);
                if (x0Var5.f1501c.isEmpty()) {
                    v0Var = v0Var3;
                    gVar = gVar6;
                    gVar2 = gVar7;
                    gVar3 = gVar5;
                    yVar = yVar2;
                    z0Var = z0Var18;
                    jVar = jVar5;
                    x0Var = x0Var5;
                    z0Var2 = z0Var17;
                    uVar = uVar3;
                    z0Var3 = z0Var20;
                    f6 = f9;
                    r9 = 0;
                    sVar7.V(-1440537031);
                    sVar3 = sVar7;
                } else {
                    sVar7.V(-1433276862);
                    j0.m.d(androidx.compose.foundation.layout.a.d(jVar5, 1.0f), d0.e.a(f8), j0.m.j(f1.s.b(((j0.b0) sVar7.j(u2Var)).f3564h, 0.3f), sVar7, 0), null, f1358c, sVar7, 196614, 24);
                    y0.m h9 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.a.d(jVar5, 1.0f), 0.0f, f10, 1);
                    x.f g7 = x.i.g(f10);
                    boolean h10 = sVar7.h(x0Var5) | sVar7.h(uVar3) | sVar7.h(wVar3);
                    Object K9 = sVar7.K();
                    if (h10 || K9 == v0Var3) {
                        z3 = false;
                        jVar4 = jVar5;
                        x0Var = x0Var5;
                        uVar = uVar3;
                        v0Var2 = v0Var3;
                        gVar4 = gVar6;
                        z0Var12 = z0Var18;
                        o0 o0Var = new o0(x0Var, uVar, wVar3, z0Var20, z0Var17, z0Var19, z0Var12);
                        wVar3 = wVar3;
                        z0Var13 = z0Var20;
                        z0Var14 = z0Var17;
                        z0Var15 = z0Var19;
                        sVar7.f0(o0Var);
                        K9 = o0Var;
                    } else {
                        z3 = false;
                        jVar4 = jVar5;
                        x0Var = x0Var5;
                        uVar = uVar3;
                        z0Var13 = z0Var20;
                        v0Var2 = v0Var3;
                        gVar4 = gVar6;
                        z0Var14 = z0Var17;
                        z0Var12 = z0Var18;
                        z0Var15 = z0Var19;
                    }
                    z0Var3 = z0Var13;
                    v0Var = v0Var2;
                    gVar3 = gVar5;
                    z0Var2 = z0Var14;
                    gVar = gVar4;
                    yVar = yVar2;
                    f6 = f9;
                    r9 = z3;
                    z0Var = z0Var12;
                    jVar = jVar4;
                    z0Var19 = z0Var15;
                    gVar2 = gVar7;
                    r2.o.c(221190, 462, sVar, (p6.c) K9, null, null, g7, null, dVar, h9, null, false);
                    sVar3 = sVar;
                }
                sVar3.p(r9);
                y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                x.q a11 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar3, 6);
                int hashCode3 = Long.hashCode(sVar3.T);
                m0.o1 l8 = sVar3.l();
                y0.m a04 = r2.o.a0(sVar3, d9);
                sVar3.Y();
                if (sVar3.S) {
                    sVar3.k(yVar);
                } else {
                    sVar3.i0();
                }
                m0.b.u(a11, sVar3, gVar3);
                m0.b.u(l8, sVar3, gVar);
                if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode3))) {
                    a0.q.n(hashCode3, sVar3, hashCode3, gVar2);
                }
                m0.b.u(a04, sVar3, gVar8);
                List list3 = x0Var.f1502d;
                boolean h11 = sVar3.h(x0Var) | sVar3.h(uVar) | sVar3.h(wVar3);
                Object K10 = sVar3.K();
                m0.v0 v0Var4 = v0Var;
                if (h11 || K10 == v0Var4) {
                    m0.z0 z0Var21 = z0Var3;
                    jVar2 = jVar;
                    m0.z0 z0Var22 = z0Var2;
                    m0.z0 z0Var23 = z0Var19;
                    m0.z0 z0Var24 = z0Var;
                    o0 o0Var2 = new o0(x0Var, uVar, z0Var21, z0Var22, z0Var23, wVar3, z0Var24, 1);
                    uVar2 = uVar;
                    z0Var4 = z0Var21;
                    z0Var5 = z0Var22;
                    z0Var6 = z0Var23;
                    wVar2 = wVar3;
                    z0Var7 = z0Var24;
                    sVar3.f0(o0Var2);
                    K10 = o0Var2;
                } else {
                    z0Var4 = z0Var3;
                    uVar2 = uVar;
                    wVar2 = wVar3;
                    jVar2 = jVar;
                    z0Var5 = z0Var2;
                    z0Var6 = z0Var19;
                    z0Var7 = z0Var;
                }
                x0 x0Var6 = x0Var;
                B("Winter Clothing", "🧥", list3, i.f1336d, (p6.c) K10, androidx.compose.foundation.layout.a.d(jVar2, 1.0f), sVar3, 199734);
                List list4 = x0Var6.f1503e;
                boolean h12 = sVar3.h(x0Var6) | sVar3.h(uVar2) | sVar3.h(wVar2);
                Object K11 = sVar3.K();
                if (h12 || K11 == v0Var4) {
                    x0Var2 = x0Var6;
                    list = list4;
                    a7.u uVar4 = uVar2;
                    o0 o0Var3 = new o0(x0Var2, uVar4, z0Var4, z0Var5, z0Var6, wVar, z0Var7, 2);
                    wVar2 = wVar;
                    sVar3.f0(o0Var3);
                    K11 = o0Var3;
                } else {
                    x0Var2 = x0Var6;
                    list = list4;
                }
                x0 x0Var7 = x0Var2;
                B("Winter Items", "⛷️", list, i.f1337e, (p6.c) K11, androidx.compose.foundation.layout.a.d(jVar2, 1.0f), sVar3, 199734);
                List list5 = x0Var7.f1504f;
                boolean h13 = sVar3.h(x0Var7) | sVar3.h(uVar2) | sVar3.h(wVar2);
                Object K12 = sVar3.K();
                if (h13 || K12 == v0Var4) {
                    m0.z0 z0Var25 = z0Var4;
                    list2 = list5;
                    a7.u uVar5 = uVar2;
                    o0 o0Var4 = new o0(x0Var7, uVar5, z0Var25, z0Var5, z0Var6, wVar, z0Var7, 3);
                    x0Var3 = x0Var7;
                    z0Var8 = z0Var25;
                    sVar3.f0(o0Var4);
                    K12 = o0Var4;
                } else {
                    x0Var3 = x0Var7;
                    z0Var8 = z0Var4;
                    list2 = list5;
                }
                m0.s sVar8 = sVar3;
                B("Xmas Decorations", "🎄", list2, i.f1338f, (p6.c) K12, androidx.compose.foundation.layout.a.d(jVar2, 1.0f), sVar8, 199734);
                sVar8.p(true);
                if (((Boolean) z0Var7.getValue()).booleanValue()) {
                    sVar8.V(-1430600818);
                    int i11 = x0Var3.f1499a;
                    boolean h14 = sVar8.h(x0Var3);
                    Object K13 = sVar8.K();
                    if (h14 || K13 == v0Var4) {
                        jVar3 = jVar2;
                        final m0.z0 z0Var26 = z0Var5;
                        z0Var10 = z0Var16;
                        p6.a aVar = new p6.a() { // from class: b6.q0
                            @Override // p6.a
                            public final Object b() {
                                int i12 = x0.this.f1499a;
                                if (i12 < 20) {
                                    z0Var10.setValue(Integer.valueOf(i12 + 1));
                                    z0Var26.setValue(k.E(i12 + 1));
                                    Boolean bool = Boolean.FALSE;
                                    z0Var7.setValue(bool);
                                    z0Var6.setValue(bool);
                                }
                                return c6.m.f1757a;
                            }
                        };
                        x0Var4 = x0Var3;
                        z0Var11 = z0Var7;
                        z0Var9 = z0Var6;
                        sVar8.f0(aVar);
                        K13 = aVar;
                    } else {
                        jVar3 = jVar2;
                        x0Var4 = x0Var3;
                        z0Var11 = z0Var7;
                        z0Var9 = z0Var6;
                        z0Var10 = z0Var16;
                    }
                    p6.a aVar2 = (p6.a) K13;
                    Object K14 = sVar8.K();
                    if (K14 == v0Var4) {
                        K14 = new b0.a(z0Var11, z0Var9, z0Var10, 1);
                        sVar8.f0(K14);
                    }
                    q(i11, x0Var4, aVar2, (p6.a) K14, sVar8, 3072);
                    sVar4 = sVar8;
                } else {
                    m0.s sVar9 = sVar8;
                    jVar3 = jVar2;
                    z0Var9 = z0Var6;
                    sVar9.V(-1440537031);
                    sVar4 = sVar9;
                }
                sVar4.p(r9);
                if (((Boolean) z0Var9.getValue()).booleanValue()) {
                    sVar4.V(-1429816890);
                    u(sVar4, r9);
                } else {
                    sVar4.V(-1440537031);
                }
                sVar4.p(r9);
                if (((Boolean) z0Var8.getValue()).booleanValue()) {
                    sVar4.V(-1429686070);
                    i(sVar4, r9);
                } else {
                    sVar4.V(-1440537031);
                }
                sVar4.p(r9);
                sVar4.p(true);
                sVar4.p(r9);
                sVar5 = sVar4;
            }
            mVar2 = jVar3;
            sVar2 = sVar5;
        } else {
            sVar6.Q();
            mVar2 = mVar;
            sVar2 = sVar6;
        }
        m0.t1 r8 = sVar2.r();
        if (r8 != null) {
            r8.f5121d = new i0(wVar, i8, mVar2, i9, 1);
        }
    }

    public static final void l(x0 x0Var, a7.u uVar, m0.z0 z0Var, m0.z0 z0Var2, m0.z0 z0Var3, w wVar, m0.z0 z0Var4, h0 h0Var, i iVar) {
        i iVar2;
        boolean z3;
        x0 a8;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = x0Var.f1505g;
        List list = x0Var.f1504f;
        List list2 = x0Var.f1503e;
        List list3 = x0Var.f1502d;
        if (z10) {
            return;
        }
        boolean z11 = h0Var.f1333b == iVar;
        i iVar3 = i.f1338f;
        i iVar4 = i.f1337e;
        i iVar5 = i.f1336d;
        g6.c cVar = null;
        if (z11) {
            List list4 = x0Var.f1501c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list4) {
                if (!q6.i.a((h0) obj, h0Var)) {
                    arrayList.add(obj);
                }
            }
            z3 = true;
            if (iVar == iVar5) {
                list3 = d6.m.a0(list3, h0Var);
            }
            if (iVar == iVar4) {
                list2 = d6.m.a0(list2, h0Var);
            }
            if (iVar == iVar3) {
                list = d6.m.a0(list, h0Var);
            }
            iVar2 = iVar5;
            a8 = x0.a(x0Var, arrayList, list3, list2, list, 0, x0Var.i + 1, 195);
        } else {
            iVar2 = iVar5;
            z3 = true;
            z0Var.setValue(Boolean.TRUE);
            a7.x.n(uVar, null, new a0.p0(z0Var, cVar, 1), 3);
            a8 = x0.a(x0Var, null, null, null, null, x0Var.f1506h + 1, 0, 383);
        }
        z0Var2.setValue(a8);
        if (z11 && a8.f1501c.isEmpty()) {
            List list5 = a8.f1504f;
            List list6 = a8.f1503e;
            List list7 = a8.f1502d;
            if (!list7.isEmpty()) {
                Iterator it = list7.iterator();
                while (it.hasNext()) {
                    if (((h0) it.next()).f1333b != iVar2) {
                        z7 = false;
                        break;
                    }
                }
            }
            z7 = z3;
            if (!list6.isEmpty()) {
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    if (((h0) it2.next()).f1333b != iVar4) {
                        z8 = false;
                        break;
                    }
                }
            }
            z8 = z3;
            if (!list5.isEmpty()) {
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    if (((h0) it3.next()).f1333b != iVar3) {
                        z9 = false;
                        break;
                    }
                }
            }
            z9 = z3;
            boolean z12 = list5.size() + (list6.size() + list7.size()) == a8.f1500b.size() ? z3 : false;
            if (z7 && z8 && z9 && z12) {
                x0 x0Var2 = a8;
                z0Var2.setValue(x0.a(x0Var2, null, null, null, null, 0, 0, 447));
                z0Var3.setValue(Boolean.TRUE);
                a7.x.n(uVar, null, new b0.c(x0Var2, wVar, z0Var4, cVar, 1), 3);
            }
        }
    }

    public static final void m(w wVar, p6.a aVar, p6.a aVar2, p6.a aVar3, p6.a aVar4, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        int i9;
        int i10;
        m0.s sVar2 = sVar;
        q6.i.e(aVar, "onNavigateToGame");
        q6.i.e(aVar2, "onNavigateToEncyclopedia");
        q6.i.e(aVar3, "onNavigateToQuiz");
        q6.i.e(aVar4, "onNavigateToAchievements");
        sVar2.W(-1752082590);
        int i11 = i8 | (sVar2.h(wVar) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(aVar2) ? 256 : 128) | (sVar2.h(aVar3) ? 2048 : 1024) | (sVar2.h(aVar4) ? 16384 : 8192) | 196608;
        if (sVar2.N(i11 & 1, (i11 & 74899) != 74898)) {
            m0.z0 j7 = m0.b.j(wVar.f1490c, 1, null, sVar2, 48, 2);
            m0.z0 j8 = m0.b.j(wVar.f1491d, 0, null, sVar, 48, 2);
            int intValue = ((Number) m0.b.j(wVar.f1494g, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) m0.b.j(wVar.f1493f, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) m0.b.j(wVar.f1492e, 0, null, sVar, 48, 2).getValue()).intValue() + ((Number) j8.getValue()).intValue();
            List y7 = s6.a.y(Boolean.valueOf(((Number) j7.getValue()).intValue() >= 1), Boolean.valueOf(((Number) j7.getValue()).intValue() >= 5), Boolean.valueOf(((Number) j7.getValue()).intValue() >= 10), Boolean.valueOf(((Number) j7.getValue()).intValue() >= 15), Boolean.valueOf(((Number) j7.getValue()).intValue() >= 20));
            List y8 = s6.a.y(Boolean.valueOf(intValue >= 10), Boolean.valueOf(intValue >= 25), Boolean.valueOf(intValue >= 40));
            if (y7.isEmpty()) {
                i9 = 0;
            } else {
                Iterator it = y7.iterator();
                i9 = 0;
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue() && (i9 = i9 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (y8.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it2 = y8.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    if (((Boolean) it2.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            int i12 = i9 + i10 + 1;
            float f6 = 12;
            float f8 = 20;
            y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar)), f8);
            x.q a8 = x.o.a(x.i.g(f8), y0.b.f8692p, sVar, 6);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            w1.g gVar = w1.h.f7678e;
            m0.b.u(a8, sVar, gVar);
            w1.g gVar2 = w1.h.f7677d;
            m0.b.u(l3, sVar, gVar2);
            w1.g gVar3 = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar3);
            }
            w1.g gVar4 = w1.h.f7676c;
            m0.b.u(a02, sVar, gVar4);
            y0.j jVar = y0.j.f8705a;
            j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(24), j0.m.j(f1.s.f2703g, sVar, 6), j0.m.k(62, 0), f1363h, sVar, 196614, 16);
            y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
            x.l0 a9 = x.k0.a(x.i.g(f6), y0.b.f8689m, sVar, 6);
            int hashCode2 = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a03 = r2.o.a0(sVar, d8);
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a9, sVar, gVar);
            m0.b.u(l7, sVar, gVar2);
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar, gVar4);
            String valueOf = String.valueOf(((Number) j7.getValue()).intValue());
            List y9 = s6.a.y(new f1.s(f1.s.b(f1.p.c(4280391411L), 0.3f)), new f1.s(f1.s.b(f1.p.c(4278238420L), 0.2f)));
            x.m0 m0Var = x.m0.f8248a;
            D("Level", valueOf, "/ 20", "🎮", y9, x.m0.a(m0Var, jVar), sVar, 28038);
            D("Quiz Score", String.valueOf(intValue), "/ 40", "📝", s6.a.y(new f1.s(f1.s.b(f1.p.c(4283215696L), 0.3f)), new f1.s(f1.s.b(f1.p.c(4287349578L), 0.2f))), x.m0.a(m0Var, jVar), sVar, 28038);
            sVar.p(true);
            y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
            d0.d a10 = d0.e.a(f8);
            u2 u2Var = j0.c0.f3599a;
            float f9 = 4;
            j0.m.c(aVar4, d9, false, a10, j0.m.j(f1.s.b(((j0.b0) sVar.j(u2Var)).f3564h, 0.4f), sVar, 0), j0.m.k(62, f9), u0.h.d(-1732111036, new p0(i12, 1), sVar), sVar, ((i11 >> 12) & 14) | 100663344, 196);
            n2.b("Quick Access", androidx.compose.foundation.layout.a.h(jVar, f9, 0.0f, 2), ((j0.b0) sVar.j(u2Var)).f3570o, r2.o.Q(22), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597494, 0, 262056);
            mVar2 = jVar;
            v("Winter Sort Game", "Sort items into categories", "🎮", s6.a.y(new f1.s(f1.s.b(f1.p.c(4280391411L), 0.2f)), new f1.s(f1.s.b(f1.p.c(4278238420L), 0.15f))), aVar, androidx.compose.foundation.layout.a.d(jVar, 1.0f), sVar, ((i11 << 9) & 57344) | 200118);
            v("Encyclopedia", "Learn about winter", "📚", s6.a.y(new f1.s(f1.s.b(f1.p.c(4288423856L), 0.2f)), new f1.s(f1.s.b(f1.p.c(4293467747L), 0.15f))), aVar2, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar, ((i11 << 6) & 57344) | 200118);
            v("Quiz", "Test your knowledge", "📝", s6.a.y(new f1.s(f1.s.b(f1.p.c(4283215696L), 0.2f)), new f1.s(f1.s.b(f1.p.c(4287349578L), 0.15f))), aVar3, androidx.compose.foundation.layout.a.d(mVar2, 1.0f), sVar, ((i11 << 3) & 57344) | 200118);
            sVar2 = sVar;
            sVar2.p(true);
        } else {
            sVar2.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new m0(wVar, aVar, aVar2, aVar3, aVar4, mVar2, i8, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Throwable] */
    public static final void n(List list, int i8, p6.c cVar, m0.s sVar, int i9) {
        Iterator it;
        int i10;
        y0.j jVar;
        float f6;
        boolean z3;
        int i11 = i8;
        m0.s sVar2 = sVar;
        q6.i.e(cVar, "onPageChange");
        sVar2.W(1379500495);
        int i12 = 32;
        int i13 = i9 | (sVar2.h(list) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16);
        if (sVar2.N(i13 & 1, (i13 & 147) != 146)) {
            Object K = sVar2.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(Float.valueOf(0.0f));
                sVar2.f0(K);
            }
            m0.z0 z0Var = (m0.z0) K;
            y0.j jVar2 = y0.j.f8705a;
            float f8 = 1.0f;
            y0.m e8 = androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 400);
            boolean h8 = ((i13 & 112) == 32) | sVar2.h(list);
            Object K2 = sVar2.K();
            if (h8 || K2 == v0Var) {
                K2 = new j1(i11, cVar, list, z0Var);
                sVar2.f0(K2);
            }
            q1.f fVar = q1.q.f6022a;
            r.t tVar = null;
            int i14 = 6;
            y0.m d8 = e8.d(new SuspendPointerInputElement(c6.m.f1757a, null, (PointerInputEventHandler) K2, 6));
            u1.e0 d9 = x.k.d(y0.b.f8685h, false);
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            y0.m a02 = r2.o.a0(sVar2, d8);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            m0.b.u(d9, sVar2, w1.h.f7678e);
            m0.b.u(l3, sVar2, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar2, hashCode, gVar);
            }
            m0.b.u(a02, sVar2, w1.h.f7676c);
            sVar2.V(-949829731);
            Iterator it2 = list.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    ?? r28 = tVar;
                    s6.a.J();
                    throw r28;
                }
                g1 g1Var = (g1) next;
                int i17 = i14;
                r.t tVar2 = tVar;
                t2 a8 = r.f.a(i15 == i11 ? f8 : 0.0f, r.d.m(300, i14, tVar), "alpha", sVar2, 3120, 20);
                if (((Number) a8.getValue()).floatValue() > 0.0f) {
                    sVar2.V(-1850881109);
                    y0.m d10 = androidx.compose.foundation.layout.a.d(jVar2, f8);
                    float floatValue = ((Number) a8.getValue()).floatValue();
                    if (floatValue != f8) {
                        d10 = androidx.compose.ui.graphics.a.c(d10, 0.0f, 0.0f, floatValue, null, 520187);
                    }
                    float f9 = i12;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(d10, f9);
                    x.q a9 = x.o.a(x.i.f8224d, y0.b.f8693q, sVar2, 54);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l7 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, g3);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a9, sVar2, w1.h.f7678e);
                    m0.b.u(l7, sVar2, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar2);
                    }
                    m0.b.u(a03, sVar2, w1.h.f7676c);
                    i10 = i12;
                    f6 = f8;
                    it = it2;
                    jVar = jVar2;
                    n2.b(g1Var.f1326a, null, 0L, r2.o.Q(120), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
                    x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, f9));
                    String str = g1Var.f1327b;
                    long Q = r2.o.Q(28);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b(str, null, ((j0.b0) sVar.j(u2Var)).f3570o, Q, null, kVar, 0L, new q2.k(3), 0L, 0, false, 0, 0, null, sVar, 1597440, 0, 261034);
                    x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, 16));
                    n2.b(g1Var.f1328c, null, f1.s.b(((j0.b0) sVar.j(u2Var)).f3570o, 0.8f), r2.o.Q(16), null, null, 0L, new q2.k(3), r2.o.Q(24), 0, false, 0, 0, null, sVar, 24576, 48, 259050);
                    sVar2 = sVar;
                    sVar2.p(true);
                    z3 = false;
                } else {
                    it = it2;
                    i10 = i12;
                    jVar = jVar2;
                    f6 = f8;
                    z3 = false;
                    sVar2.V(-1857383328);
                }
                sVar2.p(z3);
                jVar2 = jVar;
                i15 = i16;
                tVar = tVar2;
                i14 = i17;
                i12 = i10;
                f8 = f6;
                it2 = it;
                i11 = i8;
            }
            sVar2.p(false);
            sVar2.p(true);
        } else {
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new i0(list, i8, cVar, i9, 2);
        }
    }

    public static final void o(m0.s sVar, int i8) {
        m0.s sVar2;
        sVar.W(-106706699);
        if (sVar.N(i8 & 1, i8 != 0)) {
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(null);
                sVar.f0(K);
            }
            m0.z0 z0Var = (m0.z0) K;
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = m0.b.q(null);
                sVar.f0(K2);
            }
            sVar2 = sVar;
            j0.m.d(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3564h, 0.4f), sVar, 0), j0.m.k(62, 6), u0.h.d(1476280131, new b0(s6.a.y(new e2("Snow", "❄️", s6.a.y("Snow is actually colorless and transparent! It appears white because it reflects all colors of light.", "The largest snowflake ever recorded was 15 inches wide and 8 inches thick, falling in Montana in 1887.", "It takes about 1 million cloud droplets to form a single snowflake.", "Snow can fall at speeds of 1-4 mph, but individual flakes can drift much slower.", "Some snowflakes can have up to 200 ice crystals in them.")), new e2("Animals", "🐻", s6.a.y("Polar bears have black skin under their white fur to absorb heat from the sun.", "Arctic foxes can survive temperatures as low as -58°F (-50°C).", "Penguins can hold their breath for up to 20 minutes underwater.", "Reindeer eyes change color from gold in summer to blue in winter to see better in the dark.", "Snow leopards can jump up to 50 feet in a single leap.")), new e2("Science", "🔬", s6.a.y("Ice is less dense than water, which is why it floats. This is crucial for aquatic life.", "The coldest temperature ever recorded on Earth was -128.6°F (-89.2°C) in Antarctica.", "A single cubic foot of snow can contain up to 1 billion individual snowflakes.", "Ice can form in 15 different crystal structures, but only one is stable at Earth's surface.", "The speed of sound is faster in ice than in water or air.")), new e2("History", "📜", s6.a.y("The first Winter Olympics were held in Chamonix, France, in 1924.", "Ice skating was invented over 4,000 years ago in Finland using animal bones.", "The word 'blizzard' was first used in 1870 to describe a severe snowstorm.", "The coldest winter in recorded history was the winter of 1607-1608 in Europe.", "Snowmen have been built for thousands of years - the first documented snowman was in 1380.")), new e2("Culture", "🎄", s6.a.y("The tradition of Christmas trees started in Germany in the 16th century.", "In Japan, people build elaborate snow sculptures during the Sapporo Snow Festival.", "The Inuit people have over 50 words for different types of snow.", "In Russia, people celebrate Maslenitsa, a week-long festival marking the end of winter.", "The first artificial snow was made in 1950 using a snow gun at a ski resort."))), z0Var, (m0.z0) K2), sVar), sVar2, 196614, 16);
        } else {
            sVar2 = sVar;
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new a0.w0(i8, 6);
        }
    }

    public static final void p(final int i8, final boolean z3, final p6.a aVar, final y0.m mVar, m0.s sVar, final int i9) {
        long b8;
        q6.i.e(aVar, "onClick");
        sVar.W(-588548655);
        int i10 = i9 | (sVar.d(i8) ? 4 : 2) | (sVar.g(z3) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.f(mVar) ? 2048 : 1024);
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            y0.m D = s6.a.D(androidx.compose.foundation.layout.a.e(mVar, 70), ((Number) r.f.a(1.0f, r.d.l(0.5f, 0.0f, null, 6), "scale", sVar, 3126, 20).getValue()).floatValue());
            d0.d a8 = d0.e.a(16);
            if (!z3) {
                sVar.V(1340445955);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.3f);
                sVar.p(false);
            } else if (i8 % 5 == 0) {
                sVar.V(1340448227);
                sVar.p(false);
                b8 = f1.s.b(f1.p.c(4294951175L), 0.3f);
            } else {
                sVar.V(1340451459);
                b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3559c, 0.5f);
                sVar.p(false);
            }
            j0.m.c(aVar, D, z3, a8, j0.m.j(b8, sVar, 0), j0.m.k(62, z3 ? 4 : 0), u0.h.d(-1990034042, new p6.f() { // from class: b6.l0
                @Override // p6.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    m0.s sVar2;
                    boolean z7;
                    m0.s sVar3 = (m0.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    q6.i.e((x.r) obj, "$this$Card");
                    if (sVar3.N(intValue & 1, (intValue & 17) != 16)) {
                        u1.e0 d8 = x.k.d(y0.b.f8685h, false);
                        int hashCode = Long.hashCode(sVar3.T);
                        m0.o1 l3 = sVar3.l();
                        y0.m a02 = r2.o.a0(sVar3, androidx.compose.foundation.layout.a.f503b);
                        w1.i.f7684c.getClass();
                        w1.y yVar = w1.h.f7675b;
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar);
                        } else {
                            sVar3.i0();
                        }
                        w1.g gVar = w1.h.f7678e;
                        m0.b.u(d8, sVar3, gVar);
                        w1.g gVar2 = w1.h.f7677d;
                        m0.b.u(l3, sVar3, gVar2);
                        w1.g gVar3 = w1.h.f7679f;
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode))) {
                            a0.q.n(hashCode, sVar3, hashCode, gVar3);
                        }
                        w1.g gVar4 = w1.h.f7676c;
                        m0.b.u(a02, sVar3, gVar4);
                        if (z3) {
                            sVar3.V(1266303795);
                            x.q a9 = x.o.a(x.i.f8224d, y0.b.f8693q, sVar3, 54);
                            int hashCode2 = Long.hashCode(sVar3.T);
                            m0.o1 l7 = sVar3.l();
                            y0.m a03 = r2.o.a0(sVar3, y0.j.f8705a);
                            sVar3.Y();
                            if (sVar3.S) {
                                sVar3.k(yVar);
                            } else {
                                sVar3.i0();
                            }
                            m0.b.u(a9, sVar3, gVar);
                            m0.b.u(l7, sVar3, gVar2);
                            if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode2))) {
                                a0.q.n(hashCode2, sVar3, hashCode2, gVar3);
                            }
                            m0.b.u(a03, sVar3, gVar4);
                            int i11 = i8;
                            if (i11 % 5 == 0) {
                                sVar3.V(1468351898);
                                z7 = false;
                                n2.b("⭐", null, 0L, r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24582, 0, 262126);
                                sVar3 = sVar3;
                            } else {
                                z7 = false;
                                sVar3.V(1453306885);
                            }
                            sVar3.p(z7);
                            m0.s sVar4 = sVar3;
                            n2.b(String.valueOf(i11), null, ((j0.b0) sVar3.j(j0.c0.f3599a)).f3572q, r2.o.Q(20), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597440, 0, 262058);
                            sVar2 = sVar4;
                            sVar2.p(true);
                            sVar2.p(z7);
                        } else {
                            sVar3.V(1266853177);
                            n2.b("🔒", null, 0L, r2.o.Q(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24582, 0, 262126);
                            sVar2 = sVar3;
                            sVar2.p(false);
                        }
                        sVar2.p(true);
                    } else {
                        sVar3.Q();
                    }
                    return c6.m.f1757a;
                }
            }, sVar), sVar, ((i10 >> 6) & 14) | 100663296 | ((i10 << 3) & 896), 192);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(i8, z3, aVar, mVar, i9) { // from class: b6.n0

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f1394d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f1395e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ p6.a f1396f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ y0.m f1397g;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(1);
                    k.p(this.f1394d, this.f1395e, this.f1396f, this.f1397g, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void q(int i8, x0 x0Var, p6.a aVar, p6.a aVar2, m0.s sVar, int i9) {
        q6.i.e(aVar, "onNextLevel");
        q6.i.e(aVar2, "onClose");
        sVar.W(-1697415052);
        int i10 = i9 | (sVar.d(i8) ? 4 : 2) | (sVar.h(x0Var) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            j0.m.a(aVar2, u0.h.d(-1313591620, new i0(i8, aVar, aVar2), sVar), null, u0.h.d(2033323710, new j0(0, aVar2), sVar), f1362g, u0.h.d(611245761, new k0(i8, x0Var), sVar), d0.e.a(24), 0L, 0L, 0L, 0L, 0.0f, null, sVar, 1772598);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.y(i8, x0Var, aVar, aVar2, i9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (q6.i.a(r6.K(), java.lang.Integer.valueOf(r4)) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final int i8, final p6.c cVar, m0.s sVar, final int i9) {
        boolean z3;
        m0.s sVar2 = sVar;
        q6.i.e(cVar, "onLevelSelected");
        sVar2.W(722115655);
        int i10 = (i9 & 6) == 0 ? i9 | (sVar2.d(i8) ? 4 : 2) : i9;
        if ((i9 & 48) == 0) {
            i10 |= sVar2.h(cVar) ? 32 : 16;
        }
        int i11 = i10;
        if (sVar2.N(i11 & 1, (i11 & 19) != 18)) {
            y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar2)), 24);
            x.q a8 = x.o.a(x.i.g(16), y0.b.f8693q, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            y0.m a02 = r2.o.a0(sVar2, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            w1.g gVar = w1.h.f7678e;
            m0.b.u(a8, sVar2, gVar);
            w1.g gVar2 = w1.h.f7677d;
            m0.b.u(l3, sVar2, gVar2);
            w1.g gVar3 = w1.h.f7679f;
            if (sVar2.S) {
                z3 = true;
            } else {
                z3 = true;
            }
            a0.q.n(hashCode, sVar2, hashCode, gVar3);
            w1.g gVar4 = w1.h.f7676c;
            m0.b.u(a02, sVar2, gVar4);
            y0.j jVar = y0.j.f8705a;
            j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar2.j(j0.c0.f3599a)).f3559c, 0.3f), sVar2, 0), null, u0.h.d(-639522257, new p0(i8, 0), sVar2), sVar2, 196614, 24);
            sVar2 = sVar2;
            x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 8));
            y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
            float f6 = 12;
            x.q a9 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar2, 6);
            int hashCode2 = Long.hashCode(sVar2.T);
            m0.o1 l7 = sVar2.l();
            y0.m a03 = r2.o.a0(sVar2, d8);
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            m0.b.u(a9, sVar2, gVar);
            m0.b.u(l7, sVar2, gVar2);
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar2, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar2, gVar4);
            sVar2.V(1397700870);
            for (int i12 = 0; i12 < 5; i12++) {
                y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                x.l0 a10 = x.k0.a(x.i.g(f6), y0.b.f8689m, sVar2, 6);
                int hashCode3 = Long.hashCode(sVar2.T);
                m0.o1 l8 = sVar2.l();
                y0.m a04 = r2.o.a0(sVar2, d9);
                w1.i.f7684c.getClass();
                w1.y yVar2 = w1.h.f7675b;
                sVar2.Y();
                if (sVar2.S) {
                    sVar2.k(yVar2);
                } else {
                    sVar2.i0();
                }
                m0.b.u(a10, sVar2, w1.h.f7678e);
                m0.b.u(l8, sVar2, w1.h.f7677d);
                w1.g gVar5 = w1.h.f7679f;
                if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                    a0.q.n(hashCode3, sVar2, hashCode3, gVar5);
                }
                m0.b.u(a04, sVar2, w1.h.f7676c);
                sVar2.V(1693450722);
                for (int i13 = 0; i13 < 4; i13++) {
                    final int i14 = (i12 * 4) + i13 + 1;
                    final boolean z7 = i14 <= i8 ? z3 : false;
                    boolean g7 = sVar2.g(z7) | ((i11 & 112) == 32 ? z3 : false) | sVar2.d(i14);
                    Object K = sVar2.K();
                    if (g7 || K == m0.n.f5019a) {
                        K = new p6.a() { // from class: b6.r0
                            @Override // p6.a
                            public final Object b() {
                                if (z7) {
                                    cVar.i(Integer.valueOf(i14));
                                }
                                return c6.m.f1757a;
                            }
                        };
                        sVar2.f0(K);
                    }
                    p(i14, z7, (p6.a) K, x.m0.a(x.m0.f8248a, jVar), sVar2, 0);
                }
                sVar2.p(false);
                sVar2.p(z3);
            }
            boolean z8 = z3;
            sVar2.p(false);
            sVar2.p(z8);
            sVar2.p(z8);
        } else {
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: b6.s0
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int w7 = m0.b.w(i9 | 1);
                    k.r(i8, cVar, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void s(p6.a aVar, y0.m mVar, m0.s sVar, int i8) {
        y0.m mVar2;
        m0.z0 z0Var;
        boolean z3;
        p6.a aVar2 = aVar;
        m0.s sVar2 = sVar;
        q6.i.e(aVar2, "onGetStarted");
        sVar2.W(135463542);
        int i9 = (sVar2.h(aVar2) ? 4 : 2) | i8 | 48;
        if (sVar2.N(i9 & 1, (i9 & 19) != 18)) {
            List y7 = s6.a.y(new g1("🎮", "Winter Sort Game", "Sort winter items into categories and progress through 10 challenging levels!"), new g1("📚", "Learn & Explore", "Discover fascinating articles about snowflakes, winter solstice, arctic wildlife, and skiing history."), new g1("❓", "Test Your Knowledge", "Take quizzes to test what you've learned and track your progress."), new g1("📊", "Track Progress", "Monitor your game levels and quiz scores as you master winter knowledge!"));
            Object K = sVar2.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = m0.b.q(0);
                sVar2.f0(K);
            }
            m0.z0 z0Var2 = (m0.z0) K;
            x.q a8 = x.o.a(x.i.f8224d, y0.b.f8693q, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            y0.m a02 = r2.o.a0(sVar2, androidx.compose.foundation.layout.a.f503b);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            w1.g gVar = w1.h.f7678e;
            m0.b.u(a8, sVar2, gVar);
            w1.g gVar2 = w1.h.f7677d;
            m0.b.u(l3, sVar2, gVar2);
            w1.g gVar3 = w1.h.f7679f;
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar2, hashCode, gVar3);
            }
            w1.g gVar4 = w1.h.f7676c;
            m0.b.u(a02, sVar2, gVar4);
            int intValue = ((Number) z0Var2.getValue()).intValue();
            Object K2 = sVar2.K();
            if (K2 == v0Var) {
                K2 = new a0.t(5, z0Var2);
                sVar2.f0(K2);
            }
            n(y7, intValue, (p6.c) K2, sVar2, 384);
            float f6 = 32;
            mVar2 = y0.j.f8705a;
            x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(mVar2, f6));
            t(y7.size(), ((Number) z0Var2.getValue()).intValue(), sVar2, 0);
            x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(mVar2, f6));
            y0.m d8 = androidx.compose.foundation.layout.a.d(mVar2, 0.8f);
            x.l0 a9 = x.k0.a(x.i.f8225e, y0.b.f8690n, sVar2, 54);
            int hashCode2 = Long.hashCode(sVar2.T);
            m0.o1 l7 = sVar2.l();
            y0.m a03 = r2.o.a0(sVar2, d8);
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            m0.b.u(a9, sVar2, gVar);
            m0.b.u(l7, sVar2, gVar2);
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar2, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar2, gVar4);
            if (((Number) z0Var2.getValue()).intValue() > 0) {
                sVar2.V(6192855);
                Object K3 = sVar2.K();
                if (K3 == v0Var) {
                    K3 = new a0.c0(z0Var2, 4);
                    sVar2.f0(K3);
                }
                p6.a aVar3 = (p6.a) K3;
                z0Var = z0Var2;
                j0.m.f(1572870, null, null, sVar2, aVar3, null, false);
                z3 = false;
                sVar2.p(false);
            } else {
                z0Var = z0Var2;
                z3 = false;
                sVar2.V(6553695);
                x.v0.a(sVar2, androidx.compose.foundation.layout.a.j(48));
                sVar2.p(false);
            }
            int intValue2 = ((Number) z0Var.getValue()).intValue();
            int size = y7.size() - 1;
            x.m0 m0Var = x.m0.f8248a;
            if (intValue2 < size) {
                sVar2.V(6736533);
                Object K4 = sVar2.K();
                if (K4 == v0Var) {
                    K4 = new a0.c0(z0Var, 5);
                    sVar2.f0(K4);
                }
                float f8 = 16;
                y0.m h8 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.a.e(x.m0.a(m0Var, mVar2), 56), f8, 0.0f, 2);
                d0.d a10 = d0.e.a(f8);
                x.g0 g0Var = j0.o.f3805a;
                j0.m.b((p6.a) K4, h8, false, a10, j0.o.a(((j0.b0) sVar2.j(j0.c0.f3599a)).f3555a, sVar2), null, null, null, f1365k, sVar, 805306374, 484);
                sVar2 = sVar;
                sVar2.p(z3);
                aVar2 = aVar;
            } else {
                boolean z7 = z3;
                sVar2.V(7641268);
                float f9 = 16;
                y0.m h9 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.a.e(x.m0.a(m0Var, mVar2), 56), f9, 0.0f, 2);
                d0.d a11 = d0.e.a(f9);
                x.g0 g0Var2 = j0.o.f3805a;
                aVar2 = aVar;
                j0.m.b(aVar2, h9, false, a11, j0.o.a(((j0.b0) sVar2.j(j0.c0.f3599a)).f3565j, sVar2), null, null, null, f1366l, sVar2, (i9 & 14) | 805306368, 484);
                sVar2 = sVar2;
                sVar2.p(z7);
            }
            sVar2.p(true);
            sVar2.p(true);
        } else {
            sVar2.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new a0.e0(i8, 4, aVar2, mVar2);
        }
    }

    public static final void t(final int i8, final int i9, m0.s sVar, final int i10) {
        long b8;
        sVar.W(1232057336);
        int i11 = (sVar.d(i8) ? 4 : 2) | i10 | (sVar.d(i9) ? 32 : 16);
        if (sVar.N(i11 & 1, (i11 & 19) != 18)) {
            float f6 = 8;
            x.l0 a8 = x.k0.a(x.i.g(f6), y0.b.f8690n, sVar, 54);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.j jVar = y0.j.f8705a;
            y0.m a02 = r2.o.a0(sVar, jVar);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            sVar.V(-1967649683);
            int i12 = 0;
            while (i12 < i8) {
                boolean z3 = i12 == i9;
                y0.m m7 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.a.e(jVar, f6), ((Number) r.f.a(z3 ? 24.0f : 8.0f, r.d.m(300, 6, null), "width", sVar, 3120, 20).getValue()).floatValue());
                if (z3) {
                    sVar.V(-152353468);
                    b8 = ((j0.b0) sVar.j(j0.c0.f3599a)).f3565j;
                    sVar.p(false);
                } else {
                    sVar.V(-152257523);
                    b8 = f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3570o, 0.3f);
                    sVar.p(false);
                }
                x.k.a(androidx.compose.foundation.a.b(m7, b8, d0.e.a(4)), sVar, 0);
                i12++;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new p6.e(i8, i9, i10) { // from class: b6.h1

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f1334d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f1335e;

                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int w7 = m0.b.w(1);
                    k.t(this.f1334d, this.f1335e, (m0.s) obj, w7);
                    return c6.m.f1757a;
                }
            };
        }
    }

    public static final void u(m0.s sVar, int i8) {
        m0.s sVar2 = sVar;
        sVar2.W(39176822);
        if (sVar2.N(i8 & 1, i8 != 0)) {
            Object K = sVar2.K();
            Object obj = K;
            if (K == m0.n.f5019a) {
                ArrayList arrayList = new ArrayList(30);
                for (int i9 = 0; i9 < 30; i9++) {
                    arrayList.add(Float.valueOf(t6.e.f6924d.a()));
                }
                sVar2.f0(arrayList);
                obj = arrayList;
            }
            r.c0 k3 = r.d.k("particles", sVar2);
            int i10 = 0;
            m0.s sVar3 = sVar2;
            for (Object obj2 : (List) obj) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s6.a.J();
                    throw null;
                }
                ((Number) obj2).floatValue();
                t6.d dVar = t6.e.f6924d;
                float a8 = (dVar.a() * 400.0f) - 200.0f;
                r.q qVar = r.u.f6437a;
                r.q1 m7 = r.d.m(1000, 2, qVar);
                r.j0 j0Var = r.j0.f6326e;
                r.c0 c0Var = k3;
                r.d.d(c0Var, 0.0f, a8, r.d.j(m7, j0Var), a0.q.h("offsetX", i10), sVar3, 4152);
                m0.s sVar4 = sVar;
                r.d.d(c0Var, 0.0f, (dVar.a() * 400.0f) - 200.0f, r.d.j(r.d.m(1000, 2, qVar), j0Var), a0.q.h("offsetY", i10), sVar4, 4152);
                r.d.d(c0Var, 1.0f, 0.0f, r.d.j(r.d.m(1000, 6, null), j0Var), a0.q.h("alpha", i10), sVar4, 4536);
                k3 = c0Var;
                i10 = i11;
                sVar3 = sVar4;
            }
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.w0(i8, 7);
        }
    }

    public static final void v(final String str, final String str2, final String str3, final List list, p6.a aVar, y0.m mVar, m0.s sVar, int i8) {
        int i9;
        q6.i.e(aVar, "onClick");
        sVar.W(1613164832);
        if ((i8 & 6) == 0) {
            i9 = (sVar.f(str) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= sVar.f(str3) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= sVar.h(list) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i9 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i9 |= sVar.f(mVar) ? 131072 : 65536;
        }
        if (sVar.N(i9 & 1, (74899 & i9) != 74898)) {
            int i10 = i9 >> 12;
            j0.m.c(aVar, mVar, false, d0.e.a(20), j0.m.j(f1.s.f2703g, sVar, 6), j0.m.k(62, 4), u0.h.d(1222879755, new p6.f() { // from class: b6.y0
                @Override // p6.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    m0.s sVar2 = (m0.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    q6.i.e((x.r) obj, "$this$Card");
                    if (sVar2.N(intValue & 1, (intValue & 17) != 16)) {
                        y0.j jVar = y0.j.f8705a;
                        float f6 = 20;
                        y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.a.d(jVar, 1.0f), new f1.b0(list, 0L, 9187343241974906880L), d0.e.a(f6), 4), f6);
                        u1.e0 d8 = x.k.d(y0.b.f8681d, false);
                        int hashCode = Long.hashCode(sVar2.T);
                        m0.o1 l3 = sVar2.l();
                        y0.m a02 = r2.o.a0(sVar2, g3);
                        w1.i.f7684c.getClass();
                        w1.y yVar = w1.h.f7675b;
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        w1.g gVar = w1.h.f7678e;
                        m0.b.u(d8, sVar2, gVar);
                        w1.g gVar2 = w1.h.f7677d;
                        m0.b.u(l3, sVar2, gVar2);
                        w1.g gVar3 = w1.h.f7679f;
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                            a0.q.n(hashCode, sVar2, hashCode, gVar3);
                        }
                        w1.g gVar4 = w1.h.f7676c;
                        m0.b.u(a02, sVar2, gVar4);
                        y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                        x.l0 a8 = x.k0.a(x.i.g(16), y0.b.f8690n, sVar2, 54);
                        int hashCode2 = Long.hashCode(sVar2.T);
                        m0.o1 l7 = sVar2.l();
                        y0.m a03 = r2.o.a0(sVar2, d9);
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        m0.b.u(a8, sVar2, gVar);
                        m0.b.u(l7, sVar2, gVar2);
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                            a0.q.n(hashCode2, sVar2, hashCode2, gVar3);
                        }
                        m0.b.u(a03, sVar2, gVar4);
                        n2.b(str3, null, 0L, r2.o.Q(40), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262126);
                        y0.m a9 = x.m0.a(x.m0.f8248a, jVar);
                        x.q a10 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar2, 0);
                        int hashCode3 = Long.hashCode(sVar2.T);
                        m0.o1 l8 = sVar2.l();
                        y0.m a04 = r2.o.a0(sVar2, a9);
                        sVar2.Y();
                        if (sVar2.S) {
                            sVar2.k(yVar);
                        } else {
                            sVar2.i0();
                        }
                        m0.b.u(a10, sVar2, gVar);
                        m0.b.u(l8, sVar2, gVar2);
                        if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                            a0.q.n(hashCode3, sVar2, hashCode3, gVar3);
                        }
                        m0.b.u(a04, sVar2, gVar4);
                        long Q = r2.o.Q(20);
                        j2.k kVar = j2.k.f3997h;
                        u2 u2Var = j0.c0.f3599a;
                        n2.b(str, null, ((j0.b0) sVar2.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                        x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 4));
                        n2.b(str2, null, f1.s.b(((j0.b0) sVar2.j(u2Var)).f3572q, 0.7f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262122);
                        sVar2.p(true);
                        j0.u0.a(s6.a.p(), "Navigate", androidx.compose.foundation.layout.a.j(28), ((j0.b0) sVar2.j(u2Var)).f3555a, sVar2, 432, 0);
                        sVar2.p(true);
                        sVar2.p(true);
                    } else {
                        sVar2.Q();
                    }
                    return c6.m.f1757a;
                }
            }, sVar), sVar, (i10 & 14) | 100663296 | (i10 & 112), 196);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new z0(str, str2, str3, list, aVar, mVar, i8);
        }
    }

    public static final void w(final k1 k1Var, final int i8, p6.a aVar, y0.m mVar, m0.s sVar, int i9) {
        q6.i.e(k1Var, "quiz");
        q6.i.e(aVar, "onClick");
        sVar.W(90056784);
        int i10 = i9 | (sVar.h(k1Var) ? 4 : 2) | (sVar.d(i8) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            j0.m.c(aVar, mVar, false, d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.7f), sVar, 0), j0.m.k(62, 4), u0.h.d(2060344261, new p6.f() { // from class: b6.s1
                @Override // p6.f
                public final Object d(Object obj, Object obj2, Object obj3) {
                    w1.g gVar;
                    boolean z3;
                    m0.s sVar2;
                    m0.s sVar3 = (m0.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    q6.i.e((x.r) obj, "$this$Card");
                    if (sVar3.N(intValue & 1, (intValue & 17) != 16)) {
                        y0.j jVar = y0.j.f8705a;
                        y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 20);
                        x.b bVar = x.i.f8225e;
                        y0.d dVar = y0.b.f8690n;
                        x.l0 a8 = x.k0.a(bVar, dVar, sVar3, 54);
                        int hashCode = Long.hashCode(sVar3.T);
                        m0.o1 l3 = sVar3.l();
                        y0.m a02 = r2.o.a0(sVar3, g3);
                        w1.i.f7684c.getClass();
                        w1.y yVar = w1.h.f7675b;
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar);
                        } else {
                            sVar3.i0();
                        }
                        w1.g gVar2 = w1.h.f7678e;
                        m0.b.u(a8, sVar3, gVar2);
                        w1.g gVar3 = w1.h.f7677d;
                        m0.b.u(l3, sVar3, gVar3);
                        w1.g gVar4 = w1.h.f7679f;
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode))) {
                            a0.q.n(hashCode, sVar3, hashCode, gVar4);
                        }
                        w1.g gVar5 = w1.h.f7676c;
                        m0.b.u(a02, sVar3, gVar5);
                        x.l0 a9 = x.k0.a(x.i.g(16), dVar, sVar3, 54);
                        int hashCode2 = Long.hashCode(sVar3.T);
                        m0.o1 l7 = sVar3.l();
                        y0.m a03 = r2.o.a0(sVar3, jVar);
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar);
                        } else {
                            sVar3.i0();
                        }
                        m0.b.u(a9, sVar3, gVar2);
                        m0.b.u(l7, sVar3, gVar3);
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode2))) {
                            a0.q.n(hashCode2, sVar3, hashCode2, gVar4);
                        }
                        m0.b.u(a03, sVar3, gVar5);
                        k1 k1Var2 = k1.this;
                        String str = k1Var2.f1374c;
                        List list = k1Var2.f1375d;
                        n2.b(str, null, 0L, r2.o.Q(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24576, 0, 262126);
                        x.g gVar6 = x.i.f8223c;
                        x.q a10 = x.o.a(gVar6, y0.b.f8692p, sVar3, 0);
                        int hashCode3 = Long.hashCode(sVar3.T);
                        m0.o1 l8 = sVar3.l();
                        y0.m a04 = r2.o.a0(sVar3, jVar);
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar);
                        } else {
                            sVar3.i0();
                        }
                        m0.b.u(a10, sVar3, gVar2);
                        m0.b.u(l8, sVar3, gVar3);
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode3))) {
                            gVar = gVar4;
                            a0.q.n(hashCode3, sVar3, hashCode3, gVar);
                        } else {
                            gVar = gVar4;
                        }
                        m0.b.u(a04, sVar3, gVar5);
                        String str2 = k1Var2.f1373b;
                        long Q = r2.o.Q(20);
                        j2.k kVar = j2.k.f3997h;
                        u2 u2Var = j0.c0.f3599a;
                        w1.g gVar7 = gVar;
                        n2.b(str2, null, ((j0.b0) sVar3.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597440, 0, 262058);
                        n2.b(list.size() + " questions", null, f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.7f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24576, 0, 262122);
                        sVar3.p(true);
                        sVar3.p(true);
                        x.q a11 = x.o.a(gVar6, y0.b.f8694r, sVar3, 48);
                        int hashCode4 = Long.hashCode(sVar3.T);
                        m0.o1 l9 = sVar3.l();
                        y0.m a05 = r2.o.a0(sVar3, jVar);
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar);
                        } else {
                            sVar3.i0();
                        }
                        m0.b.u(a11, sVar3, gVar2);
                        m0.b.u(l9, sVar3, gVar3);
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode4))) {
                            a0.q.n(hashCode4, sVar3, hashCode4, gVar7);
                        }
                        m0.b.u(a05, sVar3, gVar5);
                        int i11 = i8;
                        if (i11 > 0) {
                            sVar3.V(1631216764);
                            n2.b(a0.q.i("Best: ", i11, "/", list.size()), null, ((j0.b0) sVar3.j(u2Var)).f3555a, r2.o.Q(16), null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597440, 0, 262058);
                            sVar2 = sVar3;
                            sVar2.p(false);
                            z3 = true;
                        } else {
                            sVar3.V(1631521339);
                            z3 = true;
                            n2.b("Not taken", null, f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.5f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24582, 0, 262122);
                            sVar2 = sVar3;
                            sVar2.p(false);
                        }
                        sVar2.p(z3);
                        sVar2.p(z3);
                    } else {
                        sVar3.Q();
                    }
                    return c6.m.f1757a;
                }
            }, sVar), sVar, ((i10 >> 6) & 14) | 100663344, 196);
        } else {
            sVar.Q();
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new a0.y(k1Var, i8, aVar, mVar, i9);
        }
    }

    public static final void x(final k1 k1Var, final int i8, final int i9, final p6.a aVar, final p6.a aVar2, final w wVar, final y0.m mVar, m0.s sVar, final int i10) {
        int i11;
        m0.s sVar2 = sVar;
        q6.i.e(aVar, "onRetry");
        q6.i.e(aVar2, "onBack");
        sVar2.W(-1167489750);
        if ((i10 & 48) == 0) {
            i11 = (sVar2.d(i8) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= sVar2.d(i9) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= sVar2.h(aVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= sVar2.h(aVar2) ? 16384 : 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= sVar2.f(mVar) ? 1048576 : 524288;
        }
        int i12 = i11;
        if (sVar2.N(i12 & 1, (i12 & 533649) != 533648)) {
            int i13 = (i8 * 100) / i9;
            String str = i13 >= 90 ? "🎉" : i13 >= 70 ? "😊" : i13 >= 50 ? "👍" : "💪";
            float f6 = 24;
            y0.m g3 = androidx.compose.foundation.layout.a.g(mVar.d(androidx.compose.foundation.layout.a.f503b), f6);
            x.q a8 = x.o.a(x.i.f8224d, y0.b.f8693q, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            y0.m a02 = r2.o.a0(sVar2, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(yVar);
            } else {
                sVar2.i0();
            }
            w1.g gVar = w1.h.f7678e;
            m0.b.u(a8, sVar2, gVar);
            w1.g gVar2 = w1.h.f7677d;
            m0.b.u(l3, sVar2, gVar2);
            w1.g gVar3 = w1.h.f7679f;
            if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar2, hashCode, gVar3);
            }
            w1.g gVar4 = w1.h.f7676c;
            m0.b.u(a02, sVar2, gVar4);
            n2.b(str, null, 0L, r2.o.Q(80), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
            y0.j jVar = y0.j.f8705a;
            x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, f6));
            long Q = r2.o.Q(28);
            j2.k kVar = j2.k.f3997h;
            u2 u2Var = j0.c0.f3599a;
            n2.b("Quiz Complete!", null, ((j0.b0) sVar.j(u2Var)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
            float f8 = 16;
            x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, f8));
            j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar.j(u2Var)).f3559c, 0.3f), sVar, 0), null, u0.h.d(1088240706, new f(i8, i9, i13, 1), sVar), sVar, 196614, 24);
            x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, 32));
            y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
            x.l0 a9 = x.k0.a(x.i.g(12), y0.b.f8689m, sVar, 6);
            int hashCode2 = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a03 = r2.o.a0(sVar, d8);
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a9, sVar, gVar);
            m0.b.u(l7, sVar, gVar2);
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar, gVar4);
            x.m0 m0Var = x.m0.f8248a;
            j0.m.h(aVar2, x.m0.a(m0Var, jVar), false, d0.e.a(f8), null, null, null, sVar, ((i12 >> 12) & 14) | 805306368);
            j0.m.b(aVar, x.m0.a(m0Var, jVar), false, d0.e.a(f8), null, null, null, null, f1368n, sVar, 805306368 | ((i12 >> 9) & 14), 500);
            sVar2 = sVar;
            sVar2.p(true);
            sVar2.p(true);
        } else {
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new p6.e() { // from class: b6.q1
                @Override // p6.e
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.x(k1.this, i8, i9, aVar, aVar2, wVar, mVar, (m0.s) obj, m0.b.w(i10 | 1));
                    return c6.m.f1757a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0619, code lost:
    
        if (q6.i.a(r5.K(), java.lang.Integer.valueOf(r7)) == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(w wVar, y0.m mVar, m0.s sVar, int i8) {
        final w wVar2;
        y0.m mVar2;
        Integer num;
        int i9;
        float f6;
        boolean z3;
        final m0.z0 z0Var;
        final m0.z0 z0Var2;
        final m0.z0 z0Var3;
        int i10;
        p6.a aVar;
        long b8;
        m0.s sVar2 = sVar;
        sVar2.W(1725508550);
        int i11 = i8 | (sVar2.h(wVar) ? 4 : 2) | 48;
        if (sVar2.N(i11 & 1, (i11 & 19) != 18)) {
            Object K = sVar2.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                num = 0;
                i9 = i11;
                K = s6.a.y(new k1(1, "The Science of Snowflakes", "❄️", s6.a.y(new l1("What is the process called when water vapor freezes directly into ice?", s6.a.y("Deposition", "Sublimation", "Condensation", "Evaporation"), 0), new l1("Why do snowflakes always have six sides?", s6.a.y("Because of hexagonal crystal structure", "Random chance", "Gravity", "Wind patterns"), 0), new l1("At what temperature do classic dendritic snowflakes form?", s6.a.y("Around -15°C (5°F)", "Around 0°C (32°F)", "Around -30°C (-22°F)", "Around -5°C (23°F)"), 0), new l1("Who was the first person to photograph snowflakes?", s6.a.y("Wilson Bentley", "Albert Einstein", "Marie Curie", "Charles Darwin"), 0), new l1("What shape do snowflakes form at around -2°C?", s6.a.y("Simple plate-like crystals", "Columns", "Needles", "Dendritic branches"), 0), new l1("Are any two snowflakes exactly alike?", s6.a.y("No, each experiences different conditions", "Yes, many are identical", "Only in laboratories", "Only in Antarctica"), 0), new l1("What determines a snowflake's shape?", s6.a.y("Temperature and humidity", "Only temperature", "Only humidity", "Wind speed"), 0), new l1("How many images of snowflakes did Wilson Bentley capture?", s6.a.y("Over 5,000", "About 100", "Over 10,000", "About 1,000"), 0), new l1("What forms at temperatures around -5°C?", s6.a.y("Columns and needles", "Plates", "Dendritic branches", "Simple crystals"), 0), new l1("What is the six-fold symmetry of snowflakes called?", s6.a.y("Hexagonal symmetry", "Pentagonal symmetry", "Octagonal symmetry", "Triangular symmetry"), 0))), new k1(2, "Winter Solstice", "🌅", s6.a.y(new l1("When does the Winter Solstice occur in the Northern Hemisphere?", s6.a.y("Around December 21st or 22nd", "December 25th", "January 1st", "December 15th"), 0), new l1("What does the Winter Solstice mark?", s6.a.y("Shortest day and longest night", "Longest day and shortest night", "Equal day and night", "Beginning of spring"), 0), new l1("What ancient Roman festival was held around the solstice?", s6.a.y("Saturnalia", "Olympia", "Bacchanalia", "Lupercalia"), 0), new l1("What is the name of the Norse winter festival?", s6.a.y("Yule", "Odin", "Thor", "Loki"), 0), new l1("Which ancient site is aligned with the winter solstice sunset?", s6.a.y("Stonehenge", "Pyramids of Giza", "Machu Picchu", "Easter Island"), 0), new l1("Which Irish site is aligned with the winter solstice sunrise?", s6.a.y("Newgrange", "Dublin Castle", "Blarney Castle", "Cliffs of Moher"), 0), new l1("What happens after the Winter Solstice?", s6.a.y("Days gradually grow longer", "Days gradually grow shorter", "Days stay the same", "Weather gets colder"), 0), new l1("How long was the traditional Yule festival?", s6.a.y("12 days", "3 days", "7 days", "1 day"), 0), new l1("What does the Winter Solstice symbolize?", s6.a.y("Return of light and promise of spring", "Beginning of winter", "End of the year", "Coldest time"), 0), new l1("What is the North Pole's position during Winter Solstice?", s6.a.y("Tilted farthest from the Sun", "Tilted closest to the Sun", "Directly facing the Sun", "Perpendicular to the Sun"), 0))), new k1(3, "Arctic Wildlife", "🐧", s6.a.y(new l1("What is the primary food source for polar bears?", s6.a.y("Seals", "Fish", "Penguins", "Arctic foxes"), 0), new l1("What color is an Arctic fox in winter?", s6.a.y("White", "Brown", "Gray", "Black"), 0), new l1("Which Arctic whale is known as the 'canary of the sea'?", s6.a.y("Beluga", "Narwhal", "Bowhead", "Orca"), 0), new l1("What unique feature do narwhals have?", s6.a.y("Long tusk (elongated tooth)", "Two heads", "No fins", "Blue color"), 0), new l1("Do penguins live in the Arctic?", s6.a.y("No, they live in the Southern Hemisphere", "Yes, they are common", "Only in zoos", "Only in Antarctica"), 0), new l1("What do ringed seals create in the ice?", s6.a.y("Breathing holes and snow caves", "Nests", "Tunnels", "Food storage"), 0), new l1("What do Arctic foxes use to find food?", s6.a.y("They follow polar bears", "Echolocation", "Infrared vision", "Sonar"), 0), new l1("What is the warmest fur of any mammal?", s6.a.y("Arctic fox", "Polar bear", "Seal", "Whale"), 0), new l1("What do polar bears' large paws act like?", s6.a.y("Snowshoes", "Fins", "Claws", "Paddles"), 0), new l1("What major threat faces Arctic wildlife today?", s6.a.y("Climate change", "Overhunting", "Pollution", "All of the above"), 3))), new k1(4, "History of Skiing", "⛷️", s6.a.y(new l1("How old is the earliest evidence of skiing?", s6.a.y("Over 8,000 years", "About 1,000 years", "About 500 years", "About 2,000 years"), 0), new l1("What does the word 'ski' mean in Old Norse?", s6.a.y("Split piece of wood", "Snow runner", "Ice glider", "Winter tool"), 0), new l1("Who is known as the 'father of modern skiing'?", s6.a.y("Sondre Norheim", "Arnold Lunn", "Hannes Schneider", "Emil Zátopek"), 0), new l1("Where did modern recreational skiing begin?", s6.a.y("Norway", "Switzerland", "Austria", "Sweden"), 0), new l1("When did Sondre Norheim organize the first ski competitions?", s6.a.y("1866", "1900", "1920", "1950"), 0), new l1("Who organized the first slalom race?", s6.a.y("Sir Arnold Lunn", "Sondre Norheim", "Hannibal", "Napoleon"), 0), new l1("Where did alpine skiing develop?", s6.a.y("The Alps", "Scandinavia", "North America", "Japan"), 0), new l1("What did the Sami people use for skiing?", s6.a.y("One long ski and one shorter one", "Two identical skis", "One ski only", "Three skis"), 0), new l1("When was the first slalom race organized?", s6.a.y("1922", "1900", "1936", "1950"), 0), new l1("What type of skiing includes freestyle and ski jumping?", s6.a.y("All types of skiing", "Only alpine", "Only cross-country", "Only recreational"), 0))));
                sVar2.f0(K);
            } else {
                num = 0;
                i9 = i11;
            }
            List list = (List) K;
            Object K2 = sVar2.K();
            if (K2 == v0Var) {
                K2 = m0.b.q(null);
                sVar2.f0(K2);
            }
            m0.z0 z0Var4 = (m0.z0) K2;
            Object K3 = sVar2.K();
            if (K3 == v0Var) {
                K3 = m0.b.q(num);
                sVar2.f0(K3);
            }
            final m0.z0 z0Var5 = (m0.z0) K3;
            Object K4 = sVar2.K();
            if (K4 == v0Var) {
                K4 = m0.b.q(null);
                sVar2.f0(K4);
            }
            m0.z0 z0Var6 = (m0.z0) K4;
            Object K5 = sVar2.K();
            if (K5 == v0Var) {
                K5 = m0.b.q(num);
                sVar2.f0(K5);
            }
            m0.z0 z0Var7 = (m0.z0) K5;
            Object K6 = sVar2.K();
            if (K6 == v0Var) {
                K6 = m0.b.q(Boolean.FALSE);
                sVar2.f0(K6);
            }
            final m0.z0 z0Var8 = (m0.z0) K6;
            Object K7 = sVar2.K();
            if (K7 == v0Var) {
                K7 = m0.b.l(sVar2);
                sVar2.f0(K7);
            }
            final a7.u uVar = (a7.u) K7;
            k1 k1Var = (k1) z0Var4.getValue();
            y0.j jVar = y0.j.f8705a;
            if (k1Var == null) {
                sVar2.V(-1837832840);
                Object K8 = sVar2.K();
                if (K8 == v0Var) {
                    t1 t1Var = new t1(z0Var4, z0Var5, z0Var6, z0Var7, z0Var8, 0);
                    sVar2.f0(t1Var);
                    K8 = t1Var;
                }
                z(list, (p6.c) K8, wVar, jVar, sVar2, ((i9 << 6) & 896) | 3120);
                sVar2 = sVar2;
                sVar2.p(false);
                wVar2 = wVar;
                mVar2 = jVar;
            } else {
                sVar2.V(-1837255465);
                final k1 k1Var2 = (k1) z0Var4.getValue();
                q6.i.b(k1Var2);
                List list2 = k1Var2.f1375d;
                if (((Boolean) z0Var8.getValue()).booleanValue()) {
                    sVar2.V(-1837372211);
                    int intValue = ((Number) z0Var7.getValue()).intValue();
                    int size = list2.size();
                    Object K9 = sVar2.K();
                    if (K9 == v0Var) {
                        K9 = new a0.c0(z0Var4, 6);
                        sVar2.f0(K9);
                    }
                    p6.a aVar2 = (p6.a) K9;
                    Object K10 = sVar2.K();
                    if (K10 == v0Var) {
                        K10 = new a0.c0(z0Var4, 7);
                        sVar2.f0(K10);
                    }
                    x(k1Var2, intValue, size, aVar2, (p6.a) K10, wVar, jVar, sVar2, 1600512 | ((i9 << 15) & 458752));
                    sVar2 = sVar2;
                    z3 = false;
                    sVar2.p(false);
                    wVar2 = wVar;
                    mVar2 = jVar;
                } else {
                    sVar2.V(-1836769385);
                    l1 l1Var = (l1) list2.get(((Number) z0Var5.getValue()).intValue());
                    float f8 = 16;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(androidx.compose.foundation.layout.a.f503b, r2.o.j0(sVar2)), f8);
                    x.q a8 = x.o.a(x.i.g(f8), y0.b.f8693q, sVar2, 54);
                    m0.z0 z0Var9 = z0Var6;
                    int hashCode = Long.hashCode(sVar2.T);
                    m0.o1 l3 = sVar2.l();
                    y0.m a02 = r2.o.a0(sVar2, g3);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar);
                    } else {
                        sVar2.i0();
                    }
                    w1.g gVar = w1.h.f7678e;
                    m0.b.u(a8, sVar2, gVar);
                    w1.g gVar2 = w1.h.f7677d;
                    m0.b.u(l3, sVar2, gVar2);
                    w1.g gVar3 = w1.h.f7679f;
                    if (sVar2.S) {
                        f6 = f8;
                    } else {
                        f6 = f8;
                    }
                    a0.q.n(hashCode, sVar2, hashCode, gVar3);
                    w1.g gVar4 = w1.h.f7676c;
                    m0.b.u(a02, sVar2, gVar4);
                    y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                    d0.d a9 = d0.e.a(f6);
                    u2 u2Var = j0.c0.f3599a;
                    j0.w j7 = j0.m.j(f1.s.b(((j0.b0) sVar2.j(u2Var)).f3559c, 0.3f), sVar2, 0);
                    final int i12 = 1;
                    m0.v0 v0Var2 = v0Var;
                    float f9 = 1.0f;
                    m0.z0 z0Var10 = z0Var7;
                    j0.m.d(d8, a9, j7, null, u0.h.d(1595665654, new p6.f() { // from class: b6.p1
                        @Override // p6.f
                        public final Object d(Object obj, Object obj2, Object obj3) {
                            switch (i12) {
                                case 0:
                                    m0.s sVar3 = (m0.s) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    q6.i.e((x.m0) obj, "$this$Button");
                                    if (sVar3.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        n2.b(((Number) z0Var5.getValue()).intValue() < k1Var2.f1375d.size() - 1 ? "Next Question" : "See Results", null, 0L, r2.o.Q(18), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597440, 0, 262062);
                                    } else {
                                        sVar3.Q();
                                    }
                                    break;
                                default:
                                    m0.s sVar4 = (m0.s) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    q6.i.e((x.r) obj, "$this$Card");
                                    if (sVar4.N(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), 16);
                                        x.l0 a10 = x.k0.a(x.i.f8225e, y0.b.f8690n, sVar4, 54);
                                        int hashCode2 = Long.hashCode(sVar4.T);
                                        m0.o1 l7 = sVar4.l();
                                        y0.m a03 = r2.o.a0(sVar4, g7);
                                        w1.i.f7684c.getClass();
                                        w1.y yVar2 = w1.h.f7675b;
                                        sVar4.Y();
                                        if (sVar4.S) {
                                            sVar4.k(yVar2);
                                        } else {
                                            sVar4.i0();
                                        }
                                        m0.b.u(a10, sVar4, w1.h.f7678e);
                                        m0.b.u(l7, sVar4, w1.h.f7677d);
                                        w1.g gVar5 = w1.h.f7679f;
                                        if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode2))) {
                                            a0.q.n(hashCode2, sVar4, hashCode2, gVar5);
                                        }
                                        m0.b.u(a03, sVar4, w1.h.f7676c);
                                        k1 k1Var3 = k1Var2;
                                        String str = k1Var3.f1374c + " " + k1Var3.f1373b;
                                        long Q = r2.o.Q(18);
                                        j2.k kVar = j2.k.f3997h;
                                        u2 u2Var2 = j0.c0.f3599a;
                                        n2.b(str, null, ((j0.b0) sVar4.j(u2Var2)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597440, 0, 262058);
                                        n2.b(a0.q.i("Question ", ((Number) z0Var5.getValue()).intValue() + 1, "/", k1Var3.f1375d.size()), null, f1.s.b(((j0.b0) sVar4.j(u2Var2)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24576, 0, 262122);
                                        sVar4.p(true);
                                    } else {
                                        sVar4.Q();
                                    }
                                    break;
                            }
                            return c6.m.f1757a;
                        }
                    }, sVar2), sVar2, 196614, 24);
                    j0.m.d(androidx.compose.foundation.layout.a.d(jVar, 1.0f), d0.e.a(20), j0.m.j(f1.s.b(((j0.b0) sVar2.j(u2Var)).f3571p, 0.8f), sVar2, 0), null, u0.h.d(-1345582547, new a7.g(5, l1Var), sVar2), sVar2, 196614, 24);
                    x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 8));
                    y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                    x.q a10 = x.o.a(x.i.g(12), y0.b.f8692p, sVar2, 6);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l7 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, d9);
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a10, sVar2, gVar);
                    m0.b.u(l7, sVar2, gVar2);
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar3);
                    }
                    m0.b.u(a03, sVar2, gVar4);
                    sVar2.V(-1035275200);
                    final int i13 = 0;
                    for (Object obj : l1Var.f1379b) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            s6.a.J();
                            throw null;
                        }
                        final String str = (String) obj;
                        Integer num2 = (Integer) z0Var9.getValue();
                        final boolean z7 = num2 != null && num2.intValue() == i13;
                        final boolean z8 = i13 == l1Var.f1380c;
                        boolean d10 = sVar2.d(i13) | sVar2.g(z8);
                        Object K11 = sVar2.K();
                        m0.v0 v0Var3 = v0Var2;
                        if (d10 || K11 == v0Var3) {
                            z0Var2 = z0Var9;
                            z0Var3 = z0Var10;
                            K11 = new p6.a() { // from class: b6.m1
                                @Override // p6.a
                                public final Object b() {
                                    z0Var2.setValue(Integer.valueOf(i13));
                                    if (z8) {
                                        m0.z0 z0Var11 = z0Var3;
                                        z0Var11.setValue(Integer.valueOf(((Number) z0Var11.getValue()).intValue() + 1));
                                    }
                                    return c6.m.f1757a;
                                }
                            };
                            sVar2.f0(K11);
                        } else {
                            z0Var2 = z0Var9;
                            z0Var3 = z0Var10;
                        }
                        p6.a aVar3 = (p6.a) K11;
                        y0.m d11 = androidx.compose.foundation.layout.a.d(jVar, f9);
                        boolean z9 = z8;
                        d0.d a11 = d0.e.a(f6);
                        if (z7 && z9) {
                            sVar2.V(-182651097);
                            b8 = ((j0.b0) sVar2.j(j0.c0.f3599a)).f3555a;
                            i10 = 0;
                            sVar2.p(false);
                        } else {
                            i10 = 0;
                            if (z7) {
                                sVar2.V(-182648411);
                                b8 = ((j0.b0) sVar2.j(j0.c0.f3599a)).f3578w;
                                sVar2.p(false);
                            } else {
                                sVar2.V(-182645710);
                                aVar = aVar3;
                                b8 = f1.s.b(((j0.b0) sVar2.j(j0.c0.f3599a)).f3571p, 0.6f);
                                sVar2.p(false);
                                p6.a aVar4 = aVar;
                                z0Var9 = z0Var2;
                                z0Var10 = z0Var3;
                                j0.m.c(aVar4, d11, false, a11, j0.m.j(b8, sVar2, i10), null, u0.h.d(279160725, new p6.f() { // from class: b6.n1
                                    @Override // p6.f
                                    public final Object d(Object obj2, Object obj3, Object obj4) {
                                        long j8;
                                        m0.s sVar3 = (m0.s) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        q6.i.e((x.r) obj2, "$this$Card");
                                        if (sVar3.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), 20);
                                            long Q = r2.o.Q(16);
                                            if (z7) {
                                                sVar3.V(1985499582);
                                                j8 = ((j0.b0) sVar3.j(j0.c0.f3599a)).f3557b;
                                                sVar3.p(false);
                                            } else {
                                                sVar3.V(1985502142);
                                                j8 = ((j0.b0) sVar3.j(j0.c0.f3599a)).f3572q;
                                                sVar3.p(false);
                                            }
                                            n2.b(str, g7, j8, Q, null, null, 0L, new q2.k(3), 0L, 0, false, 0, 0, null, sVar3, 24624, 0, 261096);
                                        } else {
                                            sVar3.Q();
                                        }
                                        return c6.m.f1757a;
                                    }
                                }, sVar2), sVar, 100663344, 228);
                                sVar2 = sVar;
                                i13 = i14;
                                v0Var2 = v0Var3;
                                f9 = 1.0f;
                            }
                        }
                        aVar = aVar3;
                        p6.a aVar42 = aVar;
                        z0Var9 = z0Var2;
                        z0Var10 = z0Var3;
                        j0.m.c(aVar42, d11, false, a11, j0.m.j(b8, sVar2, i10), null, u0.h.d(279160725, new p6.f() { // from class: b6.n1
                            @Override // p6.f
                            public final Object d(Object obj2, Object obj3, Object obj4) {
                                long j8;
                                m0.s sVar3 = (m0.s) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                q6.i.e((x.r) obj2, "$this$Card");
                                if (sVar3.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), 20);
                                    long Q = r2.o.Q(16);
                                    if (z7) {
                                        sVar3.V(1985499582);
                                        j8 = ((j0.b0) sVar3.j(j0.c0.f3599a)).f3557b;
                                        sVar3.p(false);
                                    } else {
                                        sVar3.V(1985502142);
                                        j8 = ((j0.b0) sVar3.j(j0.c0.f3599a)).f3572q;
                                        sVar3.p(false);
                                    }
                                    n2.b(str, g7, j8, Q, null, null, 0L, new q2.k(3), 0L, 0, false, 0, 0, null, sVar3, 24624, 0, 261096);
                                } else {
                                    sVar3.Q();
                                }
                                return c6.m.f1757a;
                            }
                        }, sVar2), sVar, 100663344, 228);
                        sVar2 = sVar;
                        i13 = i14;
                        v0Var2 = v0Var3;
                        f9 = 1.0f;
                    }
                    m0.s sVar3 = sVar2;
                    m0.v0 v0Var4 = v0Var2;
                    sVar3.p(false);
                    sVar3.p(true);
                    float f10 = f6;
                    x.v0.a(sVar3, androidx.compose.foundation.layout.a.e(jVar, f10));
                    if (((Integer) z0Var9.getValue()) != null) {
                        sVar3.V(-1368728941);
                        wVar2 = wVar;
                        boolean h8 = sVar3.h(k1Var2) | sVar3.h(uVar) | sVar3.h(wVar2);
                        Object K12 = sVar3.K();
                        if (h8 || K12 == v0Var4) {
                            final m0.z0 z0Var11 = z0Var9;
                            final m0.z0 z0Var12 = z0Var10;
                            p6.a aVar5 = new p6.a() { // from class: b6.o1
                                @Override // p6.a
                                public final Object b() {
                                    m0.z0 z0Var13 = z0Var5;
                                    int intValue2 = ((Number) z0Var13.getValue()).intValue();
                                    k1 k1Var3 = k1.this;
                                    g6.c cVar = null;
                                    if (intValue2 < k1Var3.f1375d.size() - 1) {
                                        z0Var13.setValue(Integer.valueOf(((Number) z0Var13.getValue()).intValue() + 1));
                                        z0Var11.setValue(null);
                                    } else {
                                        z0Var8.setValue(Boolean.TRUE);
                                        a7.x.n(uVar, null, new b0.c(wVar2, k1Var3, z0Var12, cVar, 2), 3);
                                    }
                                    return c6.m.f1757a;
                                }
                            };
                            z0Var = z0Var5;
                            sVar3.f0(aVar5);
                            K12 = aVar5;
                        } else {
                            z0Var = z0Var5;
                        }
                        final int i15 = 0;
                        mVar2 = jVar;
                        j0.m.b((p6.a) K12, androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 56), false, d0.e.a(f10), null, null, null, null, u0.h.d(-1830524081, new p6.f() { // from class: b6.p1
                            @Override // p6.f
                            public final Object d(Object obj2, Object obj22, Object obj3) {
                                switch (i15) {
                                    case 0:
                                        m0.s sVar32 = (m0.s) obj22;
                                        int intValue2 = ((Integer) obj3).intValue();
                                        q6.i.e((x.m0) obj2, "$this$Button");
                                        if (sVar32.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            n2.b(((Number) z0Var.getValue()).intValue() < k1Var2.f1375d.size() - 1 ? "Next Question" : "See Results", null, 0L, r2.o.Q(18), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar32, 1597440, 0, 262062);
                                        } else {
                                            sVar32.Q();
                                        }
                                        break;
                                    default:
                                        m0.s sVar4 = (m0.s) obj22;
                                        int intValue3 = ((Integer) obj3).intValue();
                                        q6.i.e((x.r) obj2, "$this$Card");
                                        if (sVar4.N(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), 16);
                                            x.l0 a102 = x.k0.a(x.i.f8225e, y0.b.f8690n, sVar4, 54);
                                            int hashCode22 = Long.hashCode(sVar4.T);
                                            m0.o1 l72 = sVar4.l();
                                            y0.m a032 = r2.o.a0(sVar4, g7);
                                            w1.i.f7684c.getClass();
                                            w1.y yVar2 = w1.h.f7675b;
                                            sVar4.Y();
                                            if (sVar4.S) {
                                                sVar4.k(yVar2);
                                            } else {
                                                sVar4.i0();
                                            }
                                            m0.b.u(a102, sVar4, w1.h.f7678e);
                                            m0.b.u(l72, sVar4, w1.h.f7677d);
                                            w1.g gVar5 = w1.h.f7679f;
                                            if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode22))) {
                                                a0.q.n(hashCode22, sVar4, hashCode22, gVar5);
                                            }
                                            m0.b.u(a032, sVar4, w1.h.f7676c);
                                            k1 k1Var3 = k1Var2;
                                            String str2 = k1Var3.f1374c + " " + k1Var3.f1373b;
                                            long Q = r2.o.Q(18);
                                            j2.k kVar = j2.k.f3997h;
                                            u2 u2Var2 = j0.c0.f3599a;
                                            n2.b(str2, null, ((j0.b0) sVar4.j(u2Var2)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597440, 0, 262058);
                                            n2.b(a0.q.i("Question ", ((Number) z0Var.getValue()).intValue() + 1, "/", k1Var3.f1375d.size()), null, f1.s.b(((j0.b0) sVar4.j(u2Var2)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24576, 0, 262122);
                                            sVar4.p(true);
                                        } else {
                                            sVar4.Q();
                                        }
                                        break;
                                }
                                return c6.m.f1757a;
                            }
                        }, sVar3), sVar3, 805306416, 500);
                        sVar2 = sVar3;
                        z3 = false;
                    } else {
                        wVar2 = wVar;
                        sVar2 = sVar3;
                        mVar2 = jVar;
                        z3 = false;
                        sVar2.V(-1375766530);
                    }
                    sVar2.p(z3);
                    sVar2.p(true);
                    sVar2.p(z3);
                }
                sVar2.p(z3);
            }
        } else {
            wVar2 = wVar;
            sVar2.Q();
            mVar2 = mVar;
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new g(wVar2, mVar2, i8, 2);
        }
    }

    public static final void z(List list, p6.c cVar, w wVar, y0.m mVar, m0.s sVar, int i8) {
        m0.s sVar2 = sVar;
        q6.i.e(list, "quizzes");
        q6.i.e(cVar, "onQuizSelected");
        sVar2.W(-2066616197);
        int i9 = (i8 & 6) == 0 ? (sVar2.h(list) ? 4 : 2) | i8 : i8;
        if ((i8 & 48) == 0) {
            i9 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= sVar2.h(wVar) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= sVar2.f(mVar) ? 2048 : 1024;
        }
        int i10 = i9;
        if (sVar2.N(i10 & 1, (i10 & 1171) != 1170)) {
            List y7 = s6.a.y(Integer.valueOf(((Number) m0.b.j(wVar.f1491d, 0, null, sVar2, 48, 2).getValue()).intValue()), Integer.valueOf(((Number) m0.b.j(wVar.f1492e, 0, null, sVar, 48, 2).getValue()).intValue()), Integer.valueOf(((Number) m0.b.j(wVar.f1493f, 0, null, sVar, 48, 2).getValue()).intValue()), Integer.valueOf(((Number) m0.b.j(wVar.f1494g, 0, null, sVar, 48, 2).getValue()).intValue()));
            float f6 = 16;
            y0.m g3 = androidx.compose.foundation.layout.a.g(r2.o.x0(mVar.d(androidx.compose.foundation.layout.a.f503b), r2.o.j0(sVar)), f6);
            x.q a8 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar, 6);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, g3);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(a8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            long Q = r2.o.Q(28);
            j2.k kVar = j2.k.f3997h;
            u2 u2Var = j0.c0.f3599a;
            n2.b("Winter Quizzes", null, ((j0.b0) sVar.j(u2Var)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
            n2.b("Test your knowledge about winter!", null, f1.s.b(((j0.b0) sVar.j(u2Var)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24582, 0, 262122);
            sVar2 = sVar;
            y0.j jVar = y0.j.f8705a;
            x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar, 8));
            sVar2.V(-121893395);
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    s6.a.J();
                    throw null;
                }
                k1 k1Var = (k1) obj;
                int intValue = ((Number) y7.get(i11)).intValue();
                boolean h8 = ((i10 & 112) == 32) | sVar2.h(k1Var);
                Object K = sVar2.K();
                if (h8 || K == m0.n.f5019a) {
                    K = new a0.z0(3, cVar, k1Var);
                    sVar2.f0(K);
                }
                m0.s sVar3 = sVar2;
                w(k1Var, intValue, (p6.a) K, androidx.compose.foundation.layout.a.d(jVar, 1.0f), sVar3, 3072);
                sVar2 = sVar3;
                i11 = i12;
            }
            sVar2.p(false);
            sVar2.p(true);
        } else {
            sVar2.Q();
        }
        m0.t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new r1(list, cVar, wVar, mVar, i8, 0);
        }
    }
}
