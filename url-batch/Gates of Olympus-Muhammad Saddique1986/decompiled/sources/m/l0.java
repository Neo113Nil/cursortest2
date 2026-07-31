package m;

import B.C0022x;
import F.v1;
import I.AbstractC0139b;
import I.C0143d;
import I.C0152h0;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.C0184y;
import I.K0;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import l.C0589o;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f6836a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f6837b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6838c;

    /* renamed from: d, reason: collision with root package name */
    public final C0156j0 f6839d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f6840e;

    /* renamed from: f, reason: collision with root package name */
    public final C0152h0 f6841f;

    /* renamed from: g, reason: collision with root package name */
    public final C0152h0 f6842g;

    /* renamed from: h, reason: collision with root package name */
    public final C0156j0 f6843h;

    /* renamed from: i, reason: collision with root package name */
    public final S.t f6844i;

    /* renamed from: j, reason: collision with root package name */
    public final S.t f6845j;

    /* renamed from: k, reason: collision with root package name */
    public final C0156j0 f6846k;

    /* renamed from: l, reason: collision with root package name */
    public final I.F f6847l;

    public l0(s0 s0Var, l0 l0Var, String str) {
        this.f6836a = s0Var;
        this.f6837b = l0Var;
        this.f6838c = str;
        Object a3 = s0Var.a();
        I.W w2 = I.W.f2783i;
        this.f6839d = C0143d.K(a3, w2);
        this.f6840e = C0143d.K(new h0(s0Var.a(), s0Var.a()), w2);
        int i3 = AbstractC0139b.f2792b;
        this.f6841f = new C0152h0(0L);
        this.f6842g = new C0152h0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f6843h = C0143d.K(bool, w2);
        this.f6844i = new S.t();
        this.f6845j = new S.t();
        this.f6846k = C0143d.K(bool, w2);
        this.f6847l = C0143d.D(new C0589o(this, 1));
        s0Var.d(this);
    }

    public final void a(Object obj, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1493585151);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0167p.f(obj) : c0167p.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(this) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else if (g()) {
            c0167p.Q(1823992347);
            c0167p.p(false);
        } else {
            c0167p.Q(1822507602);
            q(obj);
            if (f2.j.a(obj, this.f6836a.a())) {
                C0152h0 c0152h0 = this.f6842g;
                if (!(((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c != Long.MIN_VALUE) && !((Boolean) this.f6843h.getValue()).booleanValue()) {
                    c0167p.Q(1823982427);
                    c0167p.p(false);
                    c0167p.p(false);
                }
            }
            c0167p.Q(1822738893);
            Object G3 = c0167p.G();
            I.W w2 = C0159l.f2829a;
            if (G3 == w2) {
                C0184y c0184y = new C0184y(C0143d.z(c0167p));
                c0167p.a0(c0184y);
                G3 = c0184y;
            }
            v2.c cVar = ((C0184y) G3).f2968d;
            boolean h3 = c0167p.h(cVar) | ((i4 & 112) == 32);
            Object G4 = c0167p.G();
            if (h3 || G4 == w2) {
                G4 = new C0022x(cVar, 21, this);
                c0167p.a0(G4);
            }
            C0143d.d(cVar, this, (InterfaceC0424c) G4, c0167p);
            c0167p.p(false);
            c0167p.p(false);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new v1(i3, 4, this, obj);
        }
    }

    public final long b() {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0152h0 c0152h0 = ((i0) tVar.get(i3)).f6817o;
            j3 = Math.max(j3, ((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c);
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            j3 = Math.max(j3, ((l0) tVar2.get(i4)).b());
        }
        return j3;
    }

    public final void c() {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) tVar.get(i3);
            i0Var.f6811i = null;
            i0Var.f6810h = null;
            i0Var.f6814l = false;
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((l0) tVar2.get(i4)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                S.t tVar2 = this.f6845j;
                int size2 = tVar2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (!((l0) tVar2.get(i4)).d()) {
                    }
                }
                return false;
            }
            if (((i0) tVar.get(i3)).f6810h != null) {
                break;
            }
            i3++;
        }
    }

    public final long e() {
        l0 l0Var = this.f6837b;
        if (l0Var != null) {
            return l0Var.e();
        }
        C0152h0 c0152h0 = this.f6841f;
        return ((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c;
    }

    public final g0 f() {
        return (g0) this.f6840e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f6846k.getValue()).booleanValue();
    }

    public final void h(long j3, boolean z3) {
        C0152h0 c0152h0 = this.f6842g;
        long j4 = ((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c;
        s0 s0Var = this.f6836a;
        if (j4 == Long.MIN_VALUE) {
            c0152h0.g(j3);
            ((C0156j0) s0Var.f6877a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0156j0) s0Var.f6877a).getValue()).booleanValue()) {
            ((C0156j0) s0Var.f6877a).setValue(Boolean.TRUE);
        }
        this.f6843h.setValue(Boolean.FALSE);
        S.t tVar = this.f6844i;
        int size = tVar.size();
        boolean z4 = true;
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) tVar.get(i3);
            boolean booleanValue = ((Boolean) i0Var.f6812j.getValue()).booleanValue();
            C0156j0 c0156j0 = i0Var.f6812j;
            if (!booleanValue) {
                long c2 = z3 ? i0Var.b().c() : j3;
                i0Var.d(i0Var.b().b(c2));
                i0Var.f6816n = i0Var.b().g(c2);
                if (i0Var.b().f(c2)) {
                    c0156j0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0156j0.getValue()).booleanValue()) {
                z4 = false;
            }
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            l0 l0Var = (l0) tVar2.get(i4);
            Object value = l0Var.f6839d.getValue();
            s0 s0Var2 = l0Var.f6836a;
            if (!f2.j.a(value, s0Var2.a())) {
                l0Var.h(j3, z3);
            }
            if (!f2.j.a(l0Var.f6839d.getValue(), s0Var2.a())) {
                z4 = false;
            }
        }
        if (z4) {
            i();
        }
    }

    public final void i() {
        this.f6842g.g(Long.MIN_VALUE);
        s0 s0Var = this.f6836a;
        if (s0Var instanceof C0610F) {
            s0Var.c(this.f6839d.getValue());
        }
        o(0L);
        ((C0156j0) s0Var.f6877a).setValue(Boolean.FALSE);
        S.t tVar = this.f6845j;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((l0) tVar.get(i3)).i();
        }
    }

    public final void j(float f3) {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) tVar.get(i3);
            i0Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                d0 d0Var = i0Var.f6811i;
                if (d0Var != null) {
                    i0Var.b().h(d0Var.f6769c);
                    i0Var.f6810h = null;
                    i0Var.f6811i = null;
                }
                Object obj = f3 == -4.0f ? i0Var.b().f6770d : i0Var.b().f6769c;
                i0Var.b().h(obj);
                i0Var.b().i(obj);
                i0Var.d(obj);
                i0Var.f6817o.g(i0Var.b().c());
            } else {
                i0Var.f6813k.h(f3);
            }
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((l0) tVar2.get(i4)).j(f3);
        }
    }

    public final void k() {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((i0) tVar.get(i3)).f6813k.h(-2.0f);
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((l0) tVar2.get(i4)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f6842g.g(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        s0 s0Var = this.f6836a;
        ((C0156j0) s0Var.f6877a).setValue(bool);
        boolean g3 = g();
        C0156j0 c0156j0 = this.f6839d;
        if (!g3 || !f2.j.a(s0Var.a(), obj) || !f2.j.a(c0156j0.getValue(), obj2)) {
            if (!f2.j.a(s0Var.a(), obj) && (s0Var instanceof C0610F)) {
                s0Var.c(obj);
            }
            c0156j0.setValue(obj2);
            this.f6846k.setValue(Boolean.TRUE);
            this.f6840e.setValue(new h0(obj, obj2));
        }
        S.t tVar = this.f6845j;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            l0 l0Var = (l0) tVar.get(i3);
            f2.j.d(l0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (l0Var.g()) {
                l0Var.l(l0Var.f6836a.a(), l0Var.f6839d.getValue());
            }
        }
        S.t tVar2 = this.f6844i;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((i0) tVar2.get(i4)).c(0L);
        }
    }

    public final void m(long j3) {
        C0152h0 c0152h0 = this.f6842g;
        if (((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c == Long.MIN_VALUE) {
            c0152h0.g(j3);
        }
        o(j3);
        this.f6843h.setValue(Boolean.FALSE);
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((i0) tVar.get(i3)).c(j3);
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            l0 l0Var = (l0) tVar2.get(i4);
            if (!f2.j.a(l0Var.f6839d.getValue(), l0Var.f6836a.a())) {
                l0Var.m(j3);
            }
        }
    }

    public final void n(C0614J c0614j) {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) tVar.get(i3);
            if (!f2.j.a(i0Var.b().f6769c, i0Var.b().f6770d)) {
                i0Var.f6811i = i0Var.b();
                i0Var.f6810h = c0614j;
            }
            C0156j0 c0156j0 = i0Var.f6815m;
            i0Var.f6809g.setValue(new d0(i0Var.f6819q, i0Var.f6806d, c0156j0.getValue(), c0156j0.getValue(), i0Var.f6816n.c()));
            i0Var.f6817o.g(i0Var.b().c());
            i0Var.f6814l = true;
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((l0) tVar2.get(i4)).n(c0614j);
        }
    }

    public final void o(long j3) {
        if (this.f6837b == null) {
            this.f6841f.g(j3);
        }
    }

    public final void p() {
        d0 d0Var;
        S.t tVar = this.f6844i;
        int size = tVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            i0 i0Var = (i0) tVar.get(i3);
            C0614J c0614j = i0Var.f6810h;
            if (c0614j != null && (d0Var = i0Var.f6811i) != null) {
                long R2 = AbstractC0508a.R(c0614j.f6626g * c0614j.f6623d);
                Object b3 = d0Var.b(R2);
                if (i0Var.f6814l) {
                    i0Var.b().i(b3);
                }
                i0Var.b().h(b3);
                i0Var.f6817o.g(i0Var.b().c());
                if (i0Var.f6813k.g() == -2.0f || i0Var.f6814l) {
                    i0Var.d(b3);
                } else {
                    i0Var.c(i0Var.f6820r.e());
                }
                if (R2 >= c0614j.f6626g) {
                    i0Var.f6810h = null;
                    i0Var.f6811i = null;
                } else {
                    c0614j.f6622c = false;
                }
            }
        }
        S.t tVar2 = this.f6845j;
        int size2 = tVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((l0) tVar2.get(i4)).p();
        }
    }

    public final void q(Object obj) {
        C0156j0 c0156j0 = this.f6839d;
        if (f2.j.a(c0156j0.getValue(), obj)) {
            return;
        }
        this.f6840e.setValue(new h0(c0156j0.getValue(), obj));
        s0 s0Var = this.f6836a;
        if (!f2.j.a(s0Var.a(), c0156j0.getValue())) {
            s0Var.c(c0156j0.getValue());
        }
        c0156j0.setValue(obj);
        C0152h0 c0152h0 = this.f6842g;
        if (((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c == Long.MIN_VALUE) {
            this.f6843h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        S.t tVar = this.f6844i;
        int size = tVar.size();
        String str = "Transition animation values: ";
        for (int i3 = 0; i3 < size; i3++) {
            str = str + ((i0) tVar.get(i3)) + ", ";
        }
        return str;
    }
}
