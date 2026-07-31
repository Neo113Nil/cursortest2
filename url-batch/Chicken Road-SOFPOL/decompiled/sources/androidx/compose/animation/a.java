package androidx.compose.animation;

import a0.q;
import d6.l;
import java.util.ListIterator;
import m0.h1;
import m0.n;
import m0.s;
import m0.t1;
import m0.z0;
import o.j0;
import o.r0;
import p6.c;
import q.b0;
import q.f;
import q.o;
import q.p;
import q6.i;
import r.d;
import r.f1;
import r.l1;
import r.o1;
import r.p1;
import u0.h;
import w1.g;
import w1.x0;
import y0.e;
import y0.j;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f455a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f456b = 0;

    static {
        long j7 = Integer.MIN_VALUE;
        f455a = (j7 & 4294967295L) | (j7 << 32);
    }

    public static final void a(l1 l1Var, m mVar, c cVar, e eVar, c cVar2, u0.c cVar3, s sVar, int i) {
        int i8;
        c cVar4;
        s sVar2;
        p1 p1Var;
        p pVar;
        w0.p pVar2;
        final p pVar3;
        final f1 f1Var;
        c cVar5 = cVar;
        sVar.W(511725103);
        if ((i & 6) == 0) {
            i8 = (sVar.f(l1Var) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= sVar.h(cVar5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= sVar.f(eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= sVar.h(cVar2) ? 16384 : 8192;
        }
        u0.c cVar6 = cVar3;
        if ((196608 & i) == 0) {
            i8 |= sVar.h(cVar6) ? 131072 : 65536;
        }
        if (sVar.N(i8 & 1, (74899 & i8) != 74898)) {
            int i9 = i8 & 14;
            boolean z3 = i9 == 4;
            Object K = sVar.K();
            Object obj = n.f5019a;
            if (z3 || K == obj) {
                K = new p(l1Var, eVar);
                sVar.f0(K);
            }
            p pVar4 = (p) K;
            boolean z7 = i9 == 4;
            Object K2 = sVar.K();
            Object obj2 = K2;
            if (z7 || K2 == obj) {
                Object[] objArr = {l1Var.f6346a.b()};
                w0.p pVar5 = new w0.p();
                pVar5.addAll(l.R(objArr));
                sVar.f0(pVar5);
                obj2 = pVar5;
            }
            w0.p pVar6 = (w0.p) obj2;
            boolean z8 = i9 == 4;
            Object K3 = sVar.K();
            if (z8 || K3 == obj) {
                long[] jArr = r0.f5528a;
                K3 = new j0();
                sVar.f0(K3);
            }
            j0 j0Var = (j0) K3;
            p1 p1Var2 = l1Var.f6346a;
            h1 h1Var = l1Var.f6349d;
            if (!pVar6.contains(p1Var2.b())) {
                pVar6.clear();
                pVar6.add(p1Var2.b());
            }
            if (i.a(p1Var2.b(), h1Var.getValue())) {
                if (pVar6.size() != 1 || !i.a(pVar6.get(0), p1Var2.b())) {
                    pVar6.clear();
                    pVar6.add(p1Var2.b());
                }
                if (j0Var.f5486e != 1 || j0Var.c(p1Var2.b())) {
                    j0Var.a();
                }
                pVar4.f5887b = eVar;
            }
            if (i.a(p1Var2.b(), h1Var.getValue()) || pVar6.contains(h1Var.getValue())) {
                p1Var = p1Var2;
            } else {
                ListIterator listIterator = pVar6.listIterator();
                int i10 = 0;
                while (true) {
                    e6.a aVar = (e6.a) listIterator;
                    p1Var = p1Var2;
                    if (!aVar.hasNext()) {
                        i10 = -1;
                        break;
                    } else {
                        if (i.a(cVar2.i(aVar.next()), cVar2.i(h1Var.getValue()))) {
                            break;
                        }
                        i10++;
                        p1Var2 = p1Var;
                    }
                }
                if (i10 == -1) {
                    pVar6.add(h1Var.getValue());
                } else {
                    pVar6.set(i10, h1Var.getValue());
                }
            }
            if (j0Var.c(h1Var.getValue()) && j0Var.c(p1Var.b())) {
                sVar.V(1969054067);
                sVar.p(false);
                cVar4 = cVar5;
                pVar = pVar4;
            } else {
                sVar.V(1966468977);
                j0Var.a();
                int size = pVar6.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = pVar6.get(i11);
                    j0Var.m(obj3, h.d(-23915175, new f(l1Var, obj3, cVar5, pVar4, pVar6, cVar6), sVar));
                    i11++;
                    cVar5 = cVar5;
                    cVar6 = cVar3;
                }
                cVar4 = cVar5;
                pVar = pVar4;
                sVar.p(false);
            }
            boolean f6 = sVar.f(l1Var.f()) | sVar.f(pVar);
            Object K4 = sVar.K();
            if (f6 || K4 == obj) {
                K4 = (b0) cVar4.i(pVar);
                sVar.f0(K4);
            }
            b0 b0Var = (b0) K4;
            l1 l1Var2 = pVar.f5886a;
            boolean f8 = sVar.f(pVar);
            Object K5 = sVar.K();
            if (f8 || K5 == obj) {
                K5 = m0.b.q(Boolean.FALSE);
                sVar.f0(K5);
            }
            z0 z0Var = (z0) K5;
            final z0 t3 = m0.b.t(b0Var.f5804d, sVar);
            if (i.a(l1Var2.f6346a.b(), l1Var2.f6349d.getValue())) {
                z0Var.setValue(Boolean.FALSE);
            } else if (t3.getValue() != null) {
                z0Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) z0Var.getValue()).booleanValue();
            m mVar2 = j.f8705a;
            if (booleanValue) {
                sVar.V(1353180665);
                p pVar7 = pVar;
                pVar2 = pVar6;
                sVar2 = sVar;
                pVar3 = pVar7;
                f1Var = o1.a(pVar7.f5886a, d.f6269q, null, sVar2, 0, 2);
                boolean f9 = sVar2.f(f1Var);
                Object K6 = sVar2.K();
                if (f9 || K6 == obj) {
                    K6 = androidx.compose.ui.graphics.a.c(mVar2, 0.0f, 0.0f, 0.0f, null, 520191);
                    sVar2.f0(K6);
                }
                mVar2 = (m) K6;
                sVar2.p(false);
            } else {
                pVar2 = pVar6;
                sVar2 = sVar;
                pVar3 = pVar;
                sVar2.V(1353446707);
                sVar2.p(false);
                f1Var = null;
            }
            m d8 = mVar.d(mVar2.d(new x0(f1Var, t3, pVar3) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* renamed from: a, reason: collision with root package name */
                public final f1 f445a;

                /* renamed from: b, reason: collision with root package name */
                public final z0 f446b;

                /* renamed from: c, reason: collision with root package name */
                public final p f447c;

                {
                    this.f445a = f1Var;
                    this.f446b = t3;
                    this.f447c = pVar3;
                }

                public final boolean equals(Object obj4) {
                    if (!(obj4 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj4;
                    return i.a(animatedContentTransitionScopeImpl$SizeModifierElement.f445a, this.f445a) && animatedContentTransitionScopeImpl$SizeModifierElement.f446b.equals(this.f446b);
                }

                @Override // w1.x0
                public final y0.l f() {
                    o oVar = new o();
                    oVar.f5881r = this.f445a;
                    oVar.f5882s = this.f446b;
                    oVar.f5883t = this.f447c;
                    oVar.f5884u = a.f455a;
                    return oVar;
                }

                @Override // w1.x0
                public final void g(y0.l lVar) {
                    o oVar = (o) lVar;
                    oVar.f5881r = this.f445a;
                    oVar.f5882s = this.f446b;
                    oVar.f5883t = this.f447c;
                }

                public final int hashCode() {
                    int hashCode = this.f447c.hashCode() * 31;
                    f1 f1Var2 = this.f445a;
                    return this.f446b.hashCode() + ((hashCode + (f1Var2 != null ? f1Var2.hashCode() : 0)) * 31);
                }
            }));
            Object K7 = sVar2.K();
            if (K7 == obj) {
                K7 = new q.j(pVar3);
                sVar2.f0(K7);
            }
            q.j jVar = (q.j) K7;
            int hashCode = Long.hashCode(sVar2.T);
            m0.o1 l3 = sVar2.l();
            m a02 = r2.o.a0(sVar2, d8);
            w1.i.f7684c.getClass();
            p6.a aVar2 = w1.h.f7675b;
            sVar2.Y();
            if (sVar2.S) {
                sVar2.k(aVar2);
            } else {
                sVar2.i0();
            }
            m0.b.u(jVar, sVar2, w1.h.f7678e);
            m0.b.u(l3, sVar2, w1.h.f7677d);
            g gVar = w1.h.f7679f;
            if (sVar2.S || !i.a(sVar2.K(), Integer.valueOf(hashCode))) {
                q.n(hashCode, sVar2, hashCode, gVar);
            }
            m0.b.u(a02, sVar2, w1.h.f7676c);
            sVar2.V(-860173498);
            int size2 = pVar2.size();
            int i12 = 0;
            while (i12 < size2) {
                w0.p pVar8 = pVar2;
                Object obj4 = pVar8.get(i12);
                sVar2.R(-2026002954, 0, cVar2.i(obj4), null);
                p6.e eVar2 = (p6.e) j0Var.g(obj4);
                if (eVar2 == null) {
                    sVar2.V(1618454323);
                } else {
                    sVar2.V(-2026001778);
                    eVar2.g(sVar2, 0);
                }
                sVar2.p(false);
                sVar2.p(false);
                i12++;
                pVar2 = pVar8;
            }
            sVar2.p(false);
            sVar2.p(true);
        } else {
            cVar4 = cVar5;
            sVar2 = sVar;
            sVar2.Q();
        }
        t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new q.g(l1Var, mVar, cVar4, eVar, cVar2, cVar3, i);
        }
    }
}
