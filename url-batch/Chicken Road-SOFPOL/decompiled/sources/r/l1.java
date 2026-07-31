package r;

import m0.l2;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f6347b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6348c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.h1 f6349d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.h1 f6350e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.f1 f6351f = new m0.f1(0);

    /* renamed from: g, reason: collision with root package name */
    public final m0.f1 f6352g = new m0.f1(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final m0.h1 f6353h;
    public final w0.p i;

    /* renamed from: j, reason: collision with root package name */
    public final w0.p f6354j;

    /* renamed from: k, reason: collision with root package name */
    public final m0.h1 f6355k;

    /* renamed from: l, reason: collision with root package name */
    public final m0.e0 f6356l;

    public l1(p1 p1Var, l1 l1Var, String str) {
        this.f6346a = p1Var;
        this.f6347b = l1Var;
        this.f6348c = str;
        this.f6349d = m0.b.q(p1Var.b());
        this.f6350e = m0.b.q(new h1(p1Var.b(), p1Var.b()));
        Boolean bool = Boolean.FALSE;
        this.f6353h = m0.b.q(bool);
        this.i = new w0.p();
        this.f6354j = new w0.p();
        this.f6355k = m0.b.q(bool);
        this.f6356l = m0.b.n(new d1(this, 1));
        p1Var.e(this);
    }

    public final void a(Object obj, m0.s sVar, int i) {
        int i8;
        sVar.W(-1493585151);
        if ((i & 6) == 0) {
            i8 = ((i & 8) == 0 ? sVar.f(obj) : sVar.h(obj) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.f(this) ? 32 : 16;
        }
        if (!sVar.N(i8 & 1, (i8 & 19) != 18)) {
            sVar.Q();
        } else if (g()) {
            sVar.V(467781377);
            sVar.p(false);
        } else {
            sVar.V(466120769);
            p(obj);
            int i9 = i8 & 112;
            boolean z3 = i9 == 32;
            Object K = sVar.K();
            m0.v0 v0Var = m0.n.f5019a;
            if (z3 || K == v0Var) {
                K = m0.b.n(new d1(this, 0));
                sVar.f0(K);
            }
            if (((Boolean) ((t2) K).getValue()).booleanValue()) {
                sVar.V(466528884);
                Object K2 = sVar.K();
                if (K2 == v0Var) {
                    K2 = m0.b.l(sVar);
                    sVar.f0(K2);
                }
                a7.u uVar = (a7.u) K2;
                boolean h8 = sVar.h(uVar) | (i9 == 32);
                Object K3 = sVar.K();
                if (h8 || K3 == v0Var) {
                    K3 = new a0.v0(12, uVar, this);
                    sVar.f0(K3);
                }
                m0.b.c(uVar, this, (p6.c) K3, sVar);
                sVar.p(false);
            } else {
                sVar.V(467771457);
                sVar.p(false);
            }
            sVar.p(false);
        }
        m0.t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.i0(i, 5, this, obj);
        }
    }

    public final long b() {
        w0.p pVar = this.i;
        int size = pVar.size();
        long j7 = 0;
        for (int i = 0; i < size; i++) {
            m0.f1 f1Var = ((i1) pVar.get(i)).f6321o;
            j7 = Math.max(j7, ((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c);
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            j7 = Math.max(j7, ((l1) pVar2.get(i8)).b());
        }
        return j7;
    }

    public final void c() {
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) pVar.get(i);
            i1Var.i = null;
            i1Var.f6315h = null;
            i1Var.f6318l = false;
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((l1) pVar2.get(i8)).c();
        }
    }

    public final boolean d() {
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            if (((i1) pVar.get(i)).f6315h != null) {
                return true;
            }
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((l1) pVar2.get(i8)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        l1 l1Var = this.f6347b;
        if (l1Var != null) {
            return l1Var.e();
        }
        m0.f1 f1Var = this.f6351f;
        return ((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c;
    }

    public final g1 f() {
        return (g1) this.f6350e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f6355k.getValue()).booleanValue();
    }

    public final void h(long j7, boolean z3) {
        m0.f1 f1Var = this.f6352g;
        long j8 = ((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c;
        p1 p1Var = this.f6346a;
        if (j8 == Long.MIN_VALUE) {
            f1Var.g(j7);
            ((m0.h1) p1Var.f6389a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((m0.h1) p1Var.f6389a).getValue()).booleanValue()) {
            ((m0.h1) p1Var.f6389a).setValue(Boolean.TRUE);
        }
        this.f6353h.setValue(Boolean.FALSE);
        w0.p pVar = this.i;
        int size = pVar.size();
        boolean z7 = true;
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) pVar.get(i);
            m0.h1 h1Var = i1Var.f6316j;
            m0.h1 h1Var2 = i1Var.f6316j;
            if (!((Boolean) h1Var.getValue()).booleanValue()) {
                long c8 = z3 ? i1Var.a().c() : j7;
                i1Var.c(i1Var.a().b(c8));
                i1Var.f6320n = i1Var.a().f(c8);
                if (i1Var.a().g(c8)) {
                    h1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) h1Var2.getValue()).booleanValue()) {
                z7 = false;
            }
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            l1 l1Var = (l1) pVar2.get(i8);
            m0.h1 h1Var3 = l1Var.f6349d;
            p1 p1Var2 = l1Var.f6346a;
            if (!q6.i.a(h1Var3.getValue(), p1Var2.b())) {
                l1Var.h(j7, z3);
            }
            if (!q6.i.a(l1Var.f6349d.getValue(), p1Var2.b())) {
                z7 = false;
            }
        }
        if (z7) {
            i();
        }
    }

    public final void i() {
        this.f6352g.g(Long.MIN_VALUE);
        p1 p1Var = this.f6346a;
        if (p1Var instanceof e0) {
            ((e0) p1Var).d(this.f6349d.getValue());
        }
        n(0L);
        ((m0.h1) p1Var.f6389a).setValue(Boolean.FALSE);
        w0.p pVar = this.f6354j;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((l1) pVar.get(i)).i();
        }
    }

    public final void j(float f6) {
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) pVar.get(i);
            i1Var.getClass();
            if (f6 == -4.0f || f6 == -5.0f) {
                c1 c1Var = i1Var.i;
                if (c1Var != null) {
                    i1Var.a().h(c1Var.f6248c);
                    i1Var.f6315h = null;
                    i1Var.i = null;
                }
                Object obj = f6 == -4.0f ? i1Var.a().f6249d : i1Var.a().f6248c;
                i1Var.a().h(obj);
                i1Var.a().i(obj);
                i1Var.c(obj);
                i1Var.f6321o.g(i1Var.a().c());
            } else {
                i1Var.f6317k.h(f6);
            }
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((l1) pVar2.get(i8)).j(f6);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f6352g.g(Long.MIN_VALUE);
        p1 p1Var = this.f6346a;
        ((m0.h1) p1Var.f6389a).setValue(Boolean.FALSE);
        boolean g3 = g();
        m0.h1 h1Var = this.f6349d;
        if (!g3 || !q6.i.a(p1Var.b(), obj) || !q6.i.a(h1Var.getValue(), obj2)) {
            if (!q6.i.a(p1Var.b(), obj) && (p1Var instanceof e0)) {
                ((e0) p1Var).d(obj);
            }
            h1Var.setValue(obj2);
            this.f6355k.setValue(Boolean.TRUE);
            this.f6350e.setValue(new h1(obj, obj2));
        }
        w0.p pVar = this.f6354j;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            l1 l1Var = (l1) pVar.get(i);
            q6.i.c(l1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (l1Var.g()) {
                l1Var.k(l1Var.f6346a.b(), l1Var.f6349d.getValue());
            }
        }
        w0.p pVar2 = this.i;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((i1) pVar2.get(i8)).b(0L);
        }
    }

    public final void l(long j7) {
        m0.f1 f1Var = this.f6352g;
        if (((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c == Long.MIN_VALUE) {
            f1Var.g(j7);
        }
        n(j7);
        this.f6353h.setValue(Boolean.FALSE);
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((i1) pVar.get(i)).b(j7);
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            l1 l1Var = (l1) pVar2.get(i8);
            if (!q6.i.a(l1Var.f6349d.getValue(), l1Var.f6346a.b())) {
                l1Var.l(j7);
            }
        }
    }

    public final void m(l0 l0Var) {
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) pVar.get(i);
            m0.h1 h1Var = i1Var.f6319m;
            if (!q6.i.a(i1Var.a().f6248c, i1Var.a().f6249d)) {
                i1Var.i = i1Var.a();
                i1Var.f6315h = l0Var;
            }
            i1Var.f6314g.setValue(new c1(i1Var.f6323q, i1Var.f6311d, h1Var.getValue(), h1Var.getValue(), i1Var.f6320n.c()));
            i1Var.f6321o.g(i1Var.a().c());
            i1Var.f6318l = true;
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((l1) pVar2.get(i8)).m(l0Var);
        }
    }

    public final void n(long j7) {
        if (this.f6347b == null) {
            this.f6351f.g(j7);
        }
    }

    public final void o() {
        c1 c1Var;
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            i1 i1Var = (i1) pVar.get(i);
            l0 l0Var = i1Var.f6315h;
            if (l0Var != null && (c1Var = i1Var.i) != null) {
                long C = s6.a.C(l0Var.f6344g * l0Var.f6341d);
                Object b8 = c1Var.b(C);
                if (i1Var.f6318l) {
                    i1Var.a().i(b8);
                }
                i1Var.a().h(b8);
                i1Var.f6321o.g(i1Var.a().c());
                if (i1Var.f6317k.g() == -2.0f || i1Var.f6318l) {
                    i1Var.c(b8);
                } else {
                    i1Var.b(i1Var.f6324r.e());
                }
                if (C >= l0Var.f6344g) {
                    i1Var.f6315h = null;
                    i1Var.i = null;
                } else {
                    l0Var.f6340c = false;
                }
            }
        }
        w0.p pVar2 = this.f6354j;
        int size2 = pVar2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((l1) pVar2.get(i8)).o();
        }
    }

    public final void p(Object obj) {
        m0.h1 h1Var = this.f6349d;
        if (q6.i.a(h1Var.getValue(), obj)) {
            return;
        }
        this.f6350e.setValue(new h1(h1Var.getValue(), obj));
        p1 p1Var = this.f6346a;
        if (!q6.i.a(p1Var.b(), h1Var.getValue())) {
            p1Var.d(h1Var.getValue());
        }
        h1Var.setValue(obj);
        m0.f1 f1Var = this.f6352g;
        if (((l2) w0.m.t(f1Var.f4927e, f1Var)).f5014c == Long.MIN_VALUE) {
            this.f6353h.setValue(Boolean.TRUE);
        }
        w0.p pVar = this.i;
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            ((i1) pVar.get(i)).f6317k.h(-2.0f);
        }
    }

    public final String toString() {
        w0.p pVar = this.i;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((i1) pVar.get(i)) + ", ";
        }
        return str;
    }
}
