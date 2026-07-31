package androidx.compose.animation;

import a0.q;
import j0.l;
import m0.h1;
import m0.n;
import m0.p2;
import m0.s;
import m0.t1;
import m0.z0;
import p6.c;
import p6.e;
import p6.f;
import q.c0;
import q.d0;
import q.f0;
import q.g0;
import q.h0;
import q.m0;
import q.n0;
import q.r;
import q.t;
import q.u;
import q.v;
import q.v0;
import q.w;
import q.y;
import r.d;
import r.e0;
import r.f1;
import r.l1;
import r.m1;
import r.o1;
import r.p1;
import r.r1;
import r2.o;
import w1.g;
import w1.h;
import w1.i;
import y0.j;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {
    public static final void a(l1 l1Var, c cVar, m mVar, m0 m0Var, n0 n0Var, e eVar, u0.c cVar2, s sVar, int i) {
        int i8;
        int i9;
        int i10;
        l1 l1Var2;
        v0 v0Var;
        v0 v0Var2;
        Object obj;
        boolean z3;
        f1 f1Var;
        f1 f1Var2;
        boolean z7;
        boolean z8;
        f1 f1Var3;
        n0 n0Var2;
        m0 m0Var2;
        boolean z9;
        sVar.W(1912839215);
        if ((i & 6) == 0) {
            i8 = (sVar.f(l1Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.f(m0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= sVar.f(n0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i8 |= sVar.h(eVar) ? 131072 : 65536;
        }
        int i11 = i8 | 1572864;
        if ((12582912 & i) == 0) {
            i11 |= sVar.h(cVar2) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if (sVar.N(i12 & 1, (4793491 & i12) != 4793490)) {
            h1 h1Var = l1Var.f6349d;
            p1 p1Var = l1Var.f6346a;
            if (((Boolean) cVar.i(h1Var.getValue())).booleanValue() || ((Boolean) cVar.i(p1Var.b())).booleanValue() || l1Var.g() || l1Var.d()) {
                sVar.V(-232323267);
                int i13 = i12 & 14;
                int i14 = i13 | 48;
                int i15 = i14 & 14;
                boolean z10 = ((i15 ^ 6) > 4 && sVar.f(l1Var)) || (i14 & 6) == 4;
                Object K = sVar.K();
                boolean z11 = z10;
                Object obj2 = n.f5019a;
                if (z11 || K == obj2) {
                    K = p1Var.b();
                    sVar.f0(K);
                }
                if (l1Var.g()) {
                    K = p1Var.b();
                }
                sVar.V(1844425648);
                c0 d8 = d(l1Var, cVar, K, sVar);
                sVar.p(false);
                Object value = l1Var.f6349d.getValue();
                sVar.V(1844425648);
                c0 d9 = d(l1Var, cVar, value, sVar);
                sVar.p(false);
                int i16 = i15 | 3072;
                l lVar = o1.f6382a;
                int i17 = (i16 & 14) ^ 6;
                boolean z12 = (i17 > 4 && sVar.f(l1Var)) || (i16 & 6) == 4;
                Object K2 = sVar.K();
                if (z12 || K2 == obj2) {
                    e0 e0Var = new e0(d8);
                    i9 = i16;
                    StringBuilder sb = new StringBuilder();
                    i10 = i12;
                    sb.append(l1Var.f6348c);
                    sb.append(" > EnterExitTransition");
                    K2 = new l1(e0Var, l1Var, sb.toString());
                    sVar.f0(K2);
                } else {
                    i9 = i16;
                    i10 = i12;
                }
                l1 l1Var3 = (l1) K2;
                boolean f6 = ((i17 > 4 && sVar.f(l1Var)) || (i9 & 6) == 4) | sVar.f(l1Var3);
                Object K3 = sVar.K();
                if (f6 || K3 == obj2) {
                    K3 = new a0.v0(13, l1Var, l1Var3);
                    sVar.f0(K3);
                }
                m0.b.d(l1Var3, (c) K3, sVar);
                if (l1Var.g()) {
                    l1Var3.k(d8, d9);
                } else {
                    l1Var3.p(d9);
                    l1Var3.f6355k.setValue(Boolean.FALSE);
                }
                Object t3 = m0.b.t(eVar, sVar);
                p1 p1Var2 = l1Var3.f6346a;
                p1 p1Var3 = l1Var3.f6346a;
                h1 h1Var2 = l1Var3.f6349d;
                Object g3 = eVar.g(p1Var2.b(), h1Var2.getValue());
                boolean f8 = sVar.f(l1Var3) | sVar.f(t3);
                Object K4 = sVar.K();
                g6.c cVar3 = null;
                if (f8 || K4 == obj2) {
                    K4 = new b0.c(l1Var3, t3, cVar3, 8);
                    sVar.f0(K4);
                }
                e eVar2 = (e) K4;
                Object K5 = sVar.K();
                if (K5 == obj2) {
                    K5 = m0.b.q(g3);
                    sVar.f0(K5);
                }
                z0 z0Var = (z0) K5;
                boolean h8 = sVar.h(eVar2);
                Object K6 = sVar.K();
                if (h8 || K6 == obj2) {
                    K6 = new p2(eVar2, z0Var, null, 0);
                    sVar.f0(K6);
                }
                m0.b.f(c6.m.f1757a, sVar, (e) K6);
                Object b8 = p1Var3.b();
                c0 c0Var = c0.f5808f;
                if (b8 == c0Var && h1Var2.getValue() == c0Var && ((Boolean) z0Var.getValue()).booleanValue()) {
                    sVar.V(-230155437);
                    z9 = false;
                    sVar.p(false);
                } else {
                    sVar.V(-231293261);
                    boolean z13 = i13 == 4;
                    Object K7 = sVar.K();
                    if (z13 || K7 == obj2) {
                        K7 = new y();
                        sVar.f0(K7);
                    }
                    y yVar = (y) K7;
                    r1 r1Var = h0.f5842a;
                    Object K8 = sVar.K();
                    if (K8 == obj2) {
                        K8 = f0.f5830e;
                        sVar.f0(K8);
                    }
                    p6.a aVar = (p6.a) K8;
                    boolean f9 = sVar.f(l1Var3);
                    Object K9 = sVar.K();
                    if (f9 || K9 == obj2) {
                        K9 = m0.b.q(m0Var);
                        sVar.f0(K9);
                    }
                    z0 z0Var2 = (z0) K9;
                    Object b9 = p1Var3.b();
                    Object value2 = h1Var2.getValue();
                    c0 c0Var2 = c0.f5807e;
                    if (b9 == value2 && p1Var3.b() == c0Var2) {
                        if (l1Var3.g()) {
                            z0Var2.setValue(m0Var);
                        } else {
                            z0Var2.setValue(m0.f5873b);
                        }
                    } else if (h1Var2.getValue() == c0Var2) {
                        z0Var2.setValue(((m0) z0Var2.getValue()).a(m0Var));
                    }
                    m0 m0Var3 = (m0) z0Var2.getValue();
                    boolean f10 = sVar.f(l1Var3);
                    Object K10 = sVar.K();
                    if (f10 || K10 == obj2) {
                        K10 = m0.b.q(n0Var);
                        sVar.f0(K10);
                    }
                    z0 z0Var3 = (z0) K10;
                    if (p1Var3.b() == h1Var2.getValue() && p1Var3.b() == c0Var2) {
                        if (l1Var3.g()) {
                            z0Var3.setValue(n0Var);
                        } else {
                            z0Var3.setValue(n0.f5878b);
                        }
                    } else if (h1Var2.getValue() != c0Var2) {
                        z0Var3.setValue(((n0) z0Var3.getValue()).a(n0Var));
                    }
                    n0 n0Var3 = (n0) z0Var3.getValue();
                    v0 v0Var3 = m0Var3.f5874a;
                    v0 v0Var4 = n0Var3.f5880a;
                    boolean z14 = (v0Var3.f5921b == null && v0Var4.f5921b == null) ? false : true;
                    sVar.V(133944080);
                    sVar.p(false);
                    if (z14) {
                        sVar.V(134035871);
                        r1 r1Var2 = d.f6269q;
                        Object K11 = sVar.K();
                        if (K11 == obj2) {
                            K11 = "Built-in shrink/expand";
                            sVar.f0("Built-in shrink/expand");
                        }
                        l1Var2 = l1Var3;
                        v0Var = v0Var3;
                        v0Var2 = v0Var4;
                        obj = obj2;
                        z3 = true;
                        f1 a8 = o1.a(l1Var2, r1Var2, (String) K11, sVar, 384, 0);
                        sVar.p(false);
                        f1Var = a8;
                    } else {
                        l1Var2 = l1Var3;
                        v0Var = v0Var3;
                        v0Var2 = v0Var4;
                        obj = obj2;
                        z3 = true;
                        sVar.V(134146695);
                        sVar.p(false);
                        f1Var = null;
                    }
                    if (z14) {
                        sVar.V(134220321);
                        r1 r1Var3 = d.f6268p;
                        Object K12 = sVar.K();
                        if (K12 == obj) {
                            K12 = "Built-in InterruptionHandlingOffset";
                            sVar.f0("Built-in InterruptionHandlingOffset");
                        }
                        f1 a9 = o1.a(l1Var2, r1Var3, (String) K12, sVar, 384, 0);
                        sVar.p(false);
                        f1Var2 = a9;
                    } else {
                        sVar.V(134390727);
                        sVar.p(false);
                        f1Var2 = null;
                    }
                    boolean z15 = !z14;
                    r1 r1Var4 = d.f6262j;
                    if ((v0Var.f5920a == null && v0Var2.f5920a == null) ? false : z3) {
                        sVar.V(-703859581);
                        Object K13 = sVar.K();
                        if (K13 == obj) {
                            K13 = "Built-in alpha";
                            sVar.f0("Built-in alpha");
                        }
                        String str = (String) K13;
                        z7 = z15;
                        f1Var3 = o1.a(l1Var2, r1Var4, str, sVar, 384, 0);
                        z8 = false;
                        sVar.p(false);
                    } else {
                        z7 = z15;
                        z8 = false;
                        sVar.V(-703690136);
                        sVar.p(false);
                        f1Var3 = null;
                    }
                    sVar.V(-703453048);
                    sVar.p(z8);
                    sVar.V(-703203064);
                    sVar.p(z8);
                    boolean h9 = sVar.h(f1Var3) | sVar.f(m0Var3) | sVar.f(n0Var3) | sVar.h(null) | sVar.f(l1Var2) | sVar.h(null);
                    Object K14 = sVar.K();
                    if (h9 || K14 == obj) {
                        n0Var2 = n0Var3;
                        m0Var2 = m0Var3;
                        K14 = new d0(f1Var3, null, l1Var2, m0Var2, n0Var2, null);
                        sVar.f0(K14);
                    } else {
                        n0Var2 = n0Var3;
                        m0Var2 = m0Var3;
                    }
                    d0 d0Var = (d0) K14;
                    boolean g7 = sVar.g(z7) | sVar.f(aVar);
                    Object K15 = sVar.K();
                    if (g7 || K15 == obj) {
                        K15 = new g0(z7, aVar);
                        sVar.f0(K15);
                    }
                    j jVar = j.f8705a;
                    m d10 = androidx.compose.ui.graphics.a.a(jVar, (c) K15).d(new EnterExitTransitionElement(l1Var2, f1Var, f1Var2, m0Var2, n0Var2, aVar, d0Var));
                    sVar.V(-7429769);
                    sVar.p(false);
                    m d11 = mVar.d(d10.d(jVar));
                    Object K16 = sVar.K();
                    if (K16 == obj) {
                        K16 = new r(yVar);
                        sVar.f0(K16);
                    }
                    r rVar = (r) K16;
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l3 = sVar.l();
                    m a02 = o.a0(sVar, d11);
                    i.f7684c.getClass();
                    p6.a aVar2 = h.f7675b;
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(aVar2);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(rVar, sVar, h.f7678e);
                    m0.b.u(l3, sVar, h.f7677d);
                    g gVar = h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        q.n(hashCode, sVar, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar, h.f7676c);
                    cVar2.d(yVar, sVar, Integer.valueOf((i10 >> 18) & 112));
                    sVar.p(z3);
                    z9 = false;
                    sVar.p(false);
                }
                sVar.p(z9);
            } else {
                sVar.V(-230149485);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new q.s(l1Var, cVar, mVar, m0Var, n0Var, eVar, cVar2, i);
        }
    }

    public static final void b(boolean z3, m mVar, m0 m0Var, n0 n0Var, String str, u0.c cVar, s sVar, int i) {
        m mVar2;
        String str2;
        sVar.W(1799879339);
        int i8 = i | (sVar.g(z3) ? 32 : 16) | 196992;
        if (sVar.N(i8 & 1, (599185 & i8) != 599184)) {
            Boolean valueOf = Boolean.valueOf(z3);
            int i9 = ((i8 >> 3) & 14) | 48;
            l lVar = o1.f6382a;
            Object K = sVar.K();
            m0.v0 v0Var = n.f5019a;
            if (K == v0Var) {
                K = new l1(new e0(valueOf), null, "AnimatedVisibility");
                sVar.f0(K);
            }
            l1 l1Var = (l1) K;
            l1Var.a(valueOf, sVar, (i9 & 14) | 48);
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = new m1(l1Var, 1);
                sVar.f0(K2);
            }
            m0.b.d(l1Var, (c) K2, sVar);
            Object K3 = sVar.K();
            if (K3 == v0Var) {
                K3 = t.f5905f;
                sVar.f0(K3);
            }
            c(l1Var, (c) K3, m0Var, n0Var, cVar, sVar, 224688);
            mVar2 = j.f8705a;
            str2 = "AnimatedVisibility";
        } else {
            sVar.Q();
            mVar2 = mVar;
            str2 = str;
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new u(z3, mVar2, m0Var, n0Var, str2, cVar, i);
        }
    }

    public static final void c(l1 l1Var, c cVar, m0 m0Var, n0 n0Var, u0.c cVar2, s sVar, int i) {
        int i8;
        m0 m0Var2;
        n0 n0Var2;
        u0.c cVar3;
        sVar.W(1706321816);
        if ((i & 6) == 0) {
            i8 = (sVar.f(l1Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.f(j.f8705a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            m0Var2 = m0Var;
            i8 |= sVar.f(m0Var2) ? 2048 : 1024;
        } else {
            m0Var2 = m0Var;
        }
        if ((i & 24576) == 0) {
            n0Var2 = n0Var;
            i8 |= sVar.f(n0Var2) ? 16384 : 8192;
        } else {
            n0Var2 = n0Var;
        }
        if ((i & 196608) == 0) {
            cVar3 = cVar2;
            i8 |= sVar.h(cVar3) ? 131072 : 65536;
        } else {
            cVar3 = cVar2;
        }
        if (sVar.N(i8 & 1, (74899 & i8) != 74898)) {
            int i9 = i8 & 112;
            int i10 = i8 & 14;
            boolean z3 = (i9 == 32) | (i10 == 4);
            Object K = sVar.K();
            m0.v0 v0Var = n.f5019a;
            if (z3 || K == v0Var) {
                K = new v(cVar, l1Var);
                sVar.f0(K);
            }
            m b8 = androidx.compose.ui.layout.a.b((f) K);
            Object K2 = sVar.K();
            if (K2 == v0Var) {
                K2 = q.h.f5840g;
                sVar.f0(K2);
            }
            a(l1Var, cVar, b8, m0Var2, n0Var2, (e) K2, cVar3, sVar, ((i8 << 6) & 29360128) | 196608 | i10 | i9 | (i8 & 7168) | (57344 & i8));
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new w(l1Var, cVar, m0Var, n0Var, cVar2, i);
        }
    }

    public static final c0 d(l1 l1Var, c cVar, Object obj, s sVar) {
        sVar.R(-422486105, 0, l1Var, null);
        boolean g3 = l1Var.g();
        p1 p1Var = l1Var.f6346a;
        c0 c0Var = c0.f5806d;
        c0 c0Var2 = c0.f5808f;
        c0 c0Var3 = c0.f5807e;
        if (g3) {
            sVar.V(-212146657);
            sVar.p(false);
            if (((Boolean) cVar.i(obj)).booleanValue()) {
                c0Var = c0Var3;
            } else if (((Boolean) cVar.i(p1Var.b())).booleanValue()) {
                c0Var = c0Var2;
            }
        } else {
            sVar.V(-211872524);
            Object K = sVar.K();
            if (K == n.f5019a) {
                K = m0.b.q(Boolean.FALSE);
                sVar.f0(K);
            }
            z0 z0Var = (z0) K;
            if (((Boolean) cVar.i(p1Var.b())).booleanValue()) {
                z0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.i(obj)).booleanValue()) {
                c0Var = c0Var3;
            } else if (((Boolean) z0Var.getValue()).booleanValue()) {
                c0Var = c0Var2;
            }
            sVar.p(false);
        }
        sVar.p(false);
        return c0Var;
    }
}
