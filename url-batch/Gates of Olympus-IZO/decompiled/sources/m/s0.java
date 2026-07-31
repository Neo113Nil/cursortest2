package m;

import F.V0;
import I.AbstractC0085b;
import I.C0089d;
import I.C0098h0;
import I.C0102j0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0130y;
import I.L0;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f5841a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f5842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5843c;

    /* renamed from: d, reason: collision with root package name */
    public final C0102j0 f5844d;

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f5845e;

    /* renamed from: f, reason: collision with root package name */
    public final C0098h0 f5846f;

    /* renamed from: g, reason: collision with root package name */
    public final C0098h0 f5847g;

    /* renamed from: h, reason: collision with root package name */
    public final C0102j0 f5848h;

    /* renamed from: i, reason: collision with root package name */
    public final S.t f5849i;

    /* renamed from: j, reason: collision with root package name */
    public final S.t f5850j;

    /* renamed from: k, reason: collision with root package name */
    public final C0102j0 f5851k;

    /* renamed from: l, reason: collision with root package name */
    public final I.G f5852l;

    public s0(w0 w0Var, s0 s0Var, String str) {
        this.f5841a = w0Var;
        this.f5842b = s0Var;
        this.f5843c = str;
        Object a3 = w0Var.a();
        I.X x3 = I.X.f2228i;
        this.f5844d = C0089d.J(a3, x3);
        this.f5845e = C0089d.J(new n0(w0Var.a(), w0Var.a()), x3);
        int i3 = AbstractC0085b.f2235b;
        this.f5846f = new C0098h0(0L);
        this.f5847g = new C0098h0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f5848h = C0089d.J(bool, x3);
        this.f5849i = new S.t();
        this.f5850j = new S.t();
        this.f5851k = C0089d.J(bool, x3);
        this.f5852l = C0089d.D(new l.p(this, 1));
        w0Var.d(this);
    }

    public final void a(Object obj, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-1493585151);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0113p.f(obj) : c0113p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(this) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else if (g()) {
            c0113p.Q(1823992347);
            c0113p.p(false);
        } else {
            c0113p.Q(1822507602);
            q(obj);
            if (Z1.i.a(obj, this.f5841a.a())) {
                C0098h0 c0098h0 = this.f5847g;
                if (!(((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c != Long.MIN_VALUE) && !((Boolean) this.f5848h.getValue()).booleanValue()) {
                    c0113p.Q(1823982427);
                    c0113p.p(false);
                    c0113p.p(false);
                }
            }
            c0113p.Q(1822738893);
            Object G3 = c0113p.G();
            I.X x3 = C0105l.f2272a;
            if (G3 == x3) {
                C0130y c0130y = new C0130y(C0089d.z(c0113p));
                c0113p.a0(c0130y);
                G3 = c0130y;
            }
            p2.c cVar = ((C0130y) G3).f2402d;
            boolean h3 = c0113p.h(cVar) | ((i4 & 112) == 32);
            Object G4 = c0113p.G();
            if (h3 || G4 == x3) {
                G4 = new F.D0(cVar, 15, this);
                c0113p.a0(G4);
            }
            C0089d.d(cVar, this, (Y1.c) G4, c0113p);
            c0113p.p(false);
            c0113p.p(false);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 5, this, obj);
        }
    }

    public final long b() {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0098h0 c0098h0 = ((o0) tVar.get(i3)).f5824o;
            j3 = Math.max(j3, ((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c);
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            j3 = Math.max(j3, ((s0) tVar2.get(i4)).b());
        }
        return j3;
    }

    public final void c() {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            o0 o0Var = (o0) tVar.get(i3);
            o0Var.f5818i = null;
            o0Var.f5817h = null;
            o0Var.f5821l = false;
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((s0) tVar2.get(i4)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                S.t tVar2 = this.f5850j;
                int size2 = tVar2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (!((s0) tVar2.get(i4)).d()) {
                    }
                }
                return false;
            }
            if (((o0) tVar.get(i3)).f5817h != null) {
                break;
            }
            i3++;
        }
    }

    public final long e() {
        s0 s0Var = this.f5842b;
        if (s0Var != null) {
            return s0Var.e();
        }
        C0098h0 c0098h0 = this.f5846f;
        return ((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c;
    }

    public final m0 f() {
        return (m0) this.f5845e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f5851k.getValue()).booleanValue();
    }

    public final void h(long j3, boolean z3) {
        C0098h0 c0098h0 = this.f5847g;
        long j4 = ((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c;
        w0 w0Var = this.f5841a;
        if (j4 == Long.MIN_VALUE) {
            c0098h0.g(j3);
            ((C0102j0) w0Var.f5876a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0102j0) w0Var.f5876a).getValue()).booleanValue()) {
            ((C0102j0) w0Var.f5876a).setValue(Boolean.TRUE);
        }
        this.f5848h.setValue(Boolean.FALSE);
        S.t tVar = this.f5849i;
        int size = tVar.size();
        boolean z4 = true;
        for (int i3 = 0; i3 < size; i3++) {
            o0 o0Var = (o0) tVar.get(i3);
            boolean booleanValue = ((Boolean) o0Var.f5819j.getValue()).booleanValue();
            C0102j0 c0102j0 = o0Var.f5819j;
            if (!booleanValue) {
                long c3 = z3 ? o0Var.b().c() : j3;
                o0Var.d(o0Var.b().b(c3));
                o0Var.f5823n = o0Var.b().g(c3);
                if (o0Var.b().f(c3)) {
                    c0102j0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0102j0.getValue()).booleanValue()) {
                z4 = false;
            }
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            s0 s0Var = (s0) tVar2.get(i4);
            Object value = s0Var.f5844d.getValue();
            w0 w0Var2 = s0Var.f5841a;
            if (!Z1.i.a(value, w0Var2.a())) {
                s0Var.h(j3, z3);
            }
            if (!Z1.i.a(s0Var.f5844d.getValue(), w0Var2.a())) {
                z4 = false;
            }
        }
        if (z4) {
            i();
        }
    }

    public final void i() {
        this.f5847g.g(Long.MIN_VALUE);
        w0 w0Var = this.f5841a;
        if (w0Var instanceof C0585J) {
            w0Var.c(this.f5844d.getValue());
        }
        o(0L);
        ((C0102j0) w0Var.f5876a).setValue(Boolean.FALSE);
        S.t tVar = this.f5850j;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((s0) tVar.get(i3)).i();
        }
    }

    public final void j(float f3) {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            o0 o0Var = (o0) tVar.get(i3);
            o0Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                j0 j0Var = o0Var.f5818i;
                if (j0Var != null) {
                    o0Var.b().h(j0Var.f5779c);
                    o0Var.f5817h = null;
                    o0Var.f5818i = null;
                }
                Object obj = f3 == -4.0f ? o0Var.b().f5780d : o0Var.b().f5779c;
                o0Var.b().h(obj);
                o0Var.b().i(obj);
                o0Var.d(obj);
                o0Var.f5824o.g(o0Var.b().c());
            } else {
                o0Var.f5820k.h(f3);
            }
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((s0) tVar2.get(i4)).j(f3);
        }
    }

    public final void k() {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o0) tVar.get(i3)).f5820k.h(-2.0f);
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((s0) tVar2.get(i4)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f5847g.g(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        w0 w0Var = this.f5841a;
        ((C0102j0) w0Var.f5876a).setValue(bool);
        boolean g3 = g();
        C0102j0 c0102j0 = this.f5844d;
        if (!g3 || !Z1.i.a(w0Var.a(), obj) || !Z1.i.a(c0102j0.getValue(), obj2)) {
            if (!Z1.i.a(w0Var.a(), obj) && (w0Var instanceof C0585J)) {
                w0Var.c(obj);
            }
            c0102j0.setValue(obj2);
            this.f5851k.setValue(Boolean.TRUE);
            this.f5845e.setValue(new n0(obj, obj2));
        }
        S.t tVar = this.f5850j;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            s0 s0Var = (s0) tVar.get(i3);
            Z1.i.d(s0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (s0Var.g()) {
                s0Var.l(s0Var.f5841a.a(), s0Var.f5844d.getValue());
            }
        }
        S.t tVar2 = this.f5849i;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((o0) tVar2.get(i4)).c(0L);
        }
    }

    public final void m(long j3) {
        C0098h0 c0098h0 = this.f5847g;
        if (((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c == Long.MIN_VALUE) {
            c0098h0.g(j3);
        }
        o(j3);
        this.f5848h.setValue(Boolean.FALSE);
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o0) tVar.get(i3)).c(j3);
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            s0 s0Var = (s0) tVar2.get(i4);
            if (!Z1.i.a(s0Var.f5844d.getValue(), s0Var.f5841a.a())) {
                s0Var.m(j3);
            }
        }
    }

    public final void n(N n3) {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            o0 o0Var = (o0) tVar.get(i3);
            if (!Z1.i.a(o0Var.b().f5779c, o0Var.b().f5780d)) {
                o0Var.f5818i = o0Var.b();
                o0Var.f5817h = n3;
            }
            C0102j0 c0102j0 = o0Var.f5822m;
            o0Var.f5816g.setValue(new j0(o0Var.f5825q, o0Var.f5813d, c0102j0.getValue(), c0102j0.getValue(), o0Var.f5823n.c()));
            o0Var.f5824o.g(o0Var.b().c());
            o0Var.f5821l = true;
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((s0) tVar2.get(i4)).n(n3);
        }
    }

    public final void o(long j3) {
        if (this.f5842b == null) {
            this.f5846f.g(j3);
        }
    }

    public final void p() {
        j0 j0Var;
        S.t tVar = this.f5849i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            o0 o0Var = (o0) tVar.get(i3);
            N n3 = o0Var.f5817h;
            if (n3 != null && (j0Var = o0Var.f5818i) != null) {
                long N3 = M1.B.N(n3.f5609g * n3.f5606d);
                Object b2 = j0Var.b(N3);
                if (o0Var.f5821l) {
                    o0Var.b().i(b2);
                }
                o0Var.b().h(b2);
                o0Var.f5824o.g(o0Var.b().c());
                if (o0Var.f5820k.g() == -2.0f || o0Var.f5821l) {
                    o0Var.d(b2);
                } else {
                    o0Var.c(o0Var.f5826r.e());
                }
                if (N3 >= n3.f5609g) {
                    o0Var.f5817h = null;
                    o0Var.f5818i = null;
                } else {
                    n3.f5605c = false;
                }
            }
        }
        S.t tVar2 = this.f5850j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((s0) tVar2.get(i4)).p();
        }
    }

    public final void q(Object obj) {
        C0102j0 c0102j0 = this.f5844d;
        if (Z1.i.a(c0102j0.getValue(), obj)) {
            return;
        }
        this.f5845e.setValue(new n0(c0102j0.getValue(), obj));
        w0 w0Var = this.f5841a;
        if (!Z1.i.a(w0Var.a(), c0102j0.getValue())) {
            w0Var.c(c0102j0.getValue());
        }
        c0102j0.setValue(obj);
        C0098h0 c0098h0 = this.f5847g;
        if (((L0) S.q.t(c0098h0.f2261e, c0098h0)).f2162c == Long.MIN_VALUE) {
            this.f5848h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        S.t tVar = this.f5849i;
        int size = tVar.size();
        String str = "Transition animation values: ";
        for (int i3 = 0; i3 < size; i3++) {
            str = str + ((o0) tVar.get(i3)) + ", ";
        }
        return str;
    }
}
