package l;

import A.C0028y;
import D.x1;
import G.AbstractC0188b;
import G.C0192d;
import G.C0201h0;
import G.C0205j0;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.C0233y;
import G.K0;
import k.C0749o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f7800a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f7801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7802c;

    /* renamed from: d, reason: collision with root package name */
    public final C0205j0 f7803d;

    /* renamed from: e, reason: collision with root package name */
    public final C0205j0 f7804e;

    /* renamed from: f, reason: collision with root package name */
    public final C0201h0 f7805f;

    /* renamed from: g, reason: collision with root package name */
    public final C0201h0 f7806g;

    /* renamed from: h, reason: collision with root package name */
    public final C0205j0 f7807h;

    /* renamed from: i, reason: collision with root package name */
    public final Q.v f7808i;

    /* renamed from: j, reason: collision with root package name */
    public final Q.v f7809j;

    /* renamed from: k, reason: collision with root package name */
    public final C0205j0 f7810k;

    /* renamed from: l, reason: collision with root package name */
    public final G.F f7811l;

    public m0(t0 t0Var, m0 m0Var, String str) {
        this.f7800a = t0Var;
        this.f7801b = m0Var;
        this.f7802c = str;
        Object l4 = t0Var.l();
        G.W w4 = G.W.f2779l;
        this.f7803d = C0192d.K(l4, w4);
        this.f7804e = C0192d.K(new i0(t0Var.l(), t0Var.l()), w4);
        int i2 = AbstractC0188b.f2789b;
        this.f7805f = new C0201h0(0L);
        this.f7806g = new C0201h0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f7807h = C0192d.K(bool, w4);
        this.f7808i = new Q.v();
        this.f7809j = new Q.v();
        this.f7810k = C0192d.K(bool, w4);
        this.f7811l = C0192d.D(new C0749o(this, 1));
        t0Var.o(this);
    }

    public final void a(Object obj, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-1493585151);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(obj) : c0216p.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(this) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else if (g()) {
            c0216p.S(1823992347);
            c0216p.q(false);
        } else {
            c0216p.S(1822507602);
            q(obj);
            if (Intrinsics.a(obj, this.f7800a.l())) {
                C0201h0 c0201h0 = this.f7806g;
                if (!(((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c != Long.MIN_VALUE) && !((Boolean) this.f7807h.getValue()).booleanValue()) {
                    c0216p.S(1823982427);
                    c0216p.q(false);
                    c0216p.q(false);
                }
            }
            c0216p.S(1822738893);
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            if (I3 == w4) {
                C0233y c0233y = new C0233y(C0192d.z(kotlin.coroutines.i.f7498d, c0216p));
                c0216p.c0(c0233y);
                I3 = c0233y;
            }
            b3.c cVar = ((C0233y) I3).f2966d;
            boolean h4 = c0216p.h(cVar) | ((i4 & 112) == 32);
            Object I4 = c0216p.I();
            if (h4 || I4 == w4) {
                I4 = new C0028y(cVar, 19, this);
                c0216p.c0(I4);
            }
            C0192d.c(cVar, this, (Function1) I4, c0216p);
            c0216p.q(false);
            c0216p.q(false);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new x1(i2, 5, this, obj);
        }
    }

    public final long b() {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        long j4 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0201h0 c0201h0 = ((j0) vVar.get(i2)).f7780r;
            j4 = Math.max(j4, ((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c);
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            j4 = Math.max(j4, ((m0) vVar2.get(i4)).b());
        }
        return j4;
    }

    public final void c() {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0 j0Var = (j0) vVar.get(i2);
            j0Var.f7774l = null;
            j0Var.f7773k = null;
            j0Var.f7777o = false;
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((m0) vVar2.get(i4)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                Q.v vVar2 = this.f7809j;
                int size2 = vVar2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (!((m0) vVar2.get(i4)).d()) {
                    }
                }
                return false;
            }
            if (((j0) vVar.get(i2)).f7773k != null) {
                break;
            }
            i2++;
        }
    }

    public final long e() {
        m0 m0Var = this.f7801b;
        if (m0Var != null) {
            return m0Var.e();
        }
        C0201h0 c0201h0 = this.f7805f;
        return ((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c;
    }

    public final h0 f() {
        return (h0) this.f7804e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f7810k.getValue()).booleanValue();
    }

    public final void h(long j4, boolean z4) {
        C0201h0 c0201h0 = this.f7806g;
        long j5 = ((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c;
        t0 t0Var = this.f7800a;
        if (j5 == Long.MIN_VALUE) {
            c0201h0.d(j4);
            ((C0205j0) t0Var.f7841a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0205j0) t0Var.f7841a).getValue()).booleanValue()) {
            ((C0205j0) t0Var.f7841a).setValue(Boolean.TRUE);
        }
        this.f7807h.setValue(Boolean.FALSE);
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        boolean z5 = true;
        for (int i2 = 0; i2 < size; i2++) {
            j0 j0Var = (j0) vVar.get(i2);
            boolean booleanValue = ((Boolean) j0Var.f7775m.getValue()).booleanValue();
            C0205j0 c0205j0 = j0Var.f7775m;
            if (!booleanValue) {
                long c4 = z4 ? j0Var.b().c() : j4;
                j0Var.d(j0Var.b().b(c4));
                j0Var.f7779q = j0Var.b().g(c4);
                if (j0Var.b().f(c4)) {
                    c0205j0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0205j0.getValue()).booleanValue()) {
                z5 = false;
            }
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            m0 m0Var = (m0) vVar2.get(i4);
            Object value = m0Var.f7803d.getValue();
            t0 t0Var2 = m0Var.f7800a;
            if (!Intrinsics.a(value, t0Var2.l())) {
                m0Var.h(j4, z4);
            }
            if (!Intrinsics.a(m0Var.f7803d.getValue(), t0Var2.l())) {
                z5 = false;
            }
        }
        if (z5) {
            i();
        }
    }

    public final void i() {
        this.f7806g.d(Long.MIN_VALUE);
        t0 t0Var = this.f7800a;
        if (t0Var instanceof C0761F) {
            t0Var.n(this.f7803d.getValue());
        }
        o(0L);
        ((C0205j0) t0Var.f7841a).setValue(Boolean.FALSE);
        Q.v vVar = this.f7809j;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m0) vVar.get(i2)).i();
        }
    }

    public final void j(float f4) {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0 j0Var = (j0) vVar.get(i2);
            j0Var.getClass();
            if (f4 == -4.0f || f4 == -5.0f) {
                e0 e0Var = j0Var.f7774l;
                if (e0Var != null) {
                    j0Var.b().h(e0Var.f7739c);
                    j0Var.f7773k = null;
                    j0Var.f7774l = null;
                }
                Object obj = f4 == -4.0f ? j0Var.b().f7740d : j0Var.b().f7739c;
                j0Var.b().h(obj);
                j0Var.b().i(obj);
                j0Var.d(obj);
                j0Var.f7780r.d(j0Var.b().c());
            } else {
                j0Var.f7776n.f(f4);
            }
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((m0) vVar2.get(i4)).j(f4);
        }
    }

    public final void k() {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((j0) vVar.get(i2)).f7776n.f(-2.0f);
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((m0) vVar2.get(i4)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.f7806g.d(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        t0 t0Var = this.f7800a;
        ((C0205j0) t0Var.f7841a).setValue(bool);
        boolean g4 = g();
        C0205j0 c0205j0 = this.f7803d;
        if (!g4 || !Intrinsics.a(t0Var.l(), obj) || !Intrinsics.a(c0205j0.getValue(), obj2)) {
            if (!Intrinsics.a(t0Var.l(), obj) && (t0Var instanceof C0761F)) {
                t0Var.n(obj);
            }
            c0205j0.setValue(obj2);
            this.f7810k.setValue(Boolean.TRUE);
            this.f7804e.setValue(new i0(obj, obj2));
        }
        Q.v vVar = this.f7809j;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) vVar.get(i2);
            Intrinsics.d(m0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (m0Var.g()) {
                m0Var.l(m0Var.f7800a.l(), m0Var.f7803d.getValue());
            }
        }
        Q.v vVar2 = this.f7808i;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((j0) vVar2.get(i4)).c(0L);
        }
    }

    public final void m(long j4) {
        C0201h0 c0201h0 = this.f7806g;
        if (((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c == Long.MIN_VALUE) {
            c0201h0.d(j4);
        }
        o(j4);
        this.f7807h.setValue(Boolean.FALSE);
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((j0) vVar.get(i2)).c(j4);
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            m0 m0Var = (m0) vVar2.get(i4);
            if (!Intrinsics.a(m0Var.f7803d.getValue(), m0Var.f7800a.l())) {
                m0Var.m(j4);
            }
        }
    }

    public final void n(C0765J c0765j) {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0 j0Var = (j0) vVar.get(i2);
            if (!Intrinsics.a(j0Var.b().f7739c, j0Var.b().f7740d)) {
                j0Var.f7774l = j0Var.b();
                j0Var.f7773k = c0765j;
            }
            C0205j0 c0205j0 = j0Var.f7778p;
            j0Var.f7772j.setValue(new e0(j0Var.f7782t, j0Var.f7769d, c0205j0.getValue(), c0205j0.getValue(), j0Var.f7779q.c()));
            j0Var.f7780r.d(j0Var.b().c());
            j0Var.f7777o = true;
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((m0) vVar2.get(i4)).n(c0765j);
        }
    }

    public final void o(long j4) {
        if (this.f7801b == null) {
            this.f7805f.d(j4);
        }
    }

    public final void p() {
        e0 e0Var;
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0 j0Var = (j0) vVar.get(i2);
            C0765J c0765j = j0Var.f7773k;
            if (c0765j != null && (e0Var = j0Var.f7774l) != null) {
                long b4 = O2.c.b(c0765j.f7588g * c0765j.f7585d);
                Object b5 = e0Var.b(b4);
                if (j0Var.f7777o) {
                    j0Var.b().i(b5);
                }
                j0Var.b().h(b5);
                j0Var.f7780r.d(j0Var.b().c());
                if (j0Var.f7776n.d() == -2.0f || j0Var.f7777o) {
                    j0Var.d(b5);
                } else {
                    j0Var.c(j0Var.f7783u.e());
                }
                if (b4 >= c0765j.f7588g) {
                    j0Var.f7773k = null;
                    j0Var.f7774l = null;
                } else {
                    c0765j.f7584c = false;
                }
            }
        }
        Q.v vVar2 = this.f7809j;
        int size2 = vVar2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((m0) vVar2.get(i4)).p();
        }
    }

    public final void q(Object obj) {
        C0205j0 c0205j0 = this.f7803d;
        if (Intrinsics.a(c0205j0.getValue(), obj)) {
            return;
        }
        this.f7804e.setValue(new i0(c0205j0.getValue(), obj));
        t0 t0Var = this.f7800a;
        if (!Intrinsics.a(t0Var.l(), c0205j0.getValue())) {
            t0Var.n(c0205j0.getValue());
        }
        c0205j0.setValue(obj);
        C0201h0 c0201h0 = this.f7806g;
        if (((K0) Q.q.t(c0201h0.f2815e, c0201h0)).f2715c == Long.MIN_VALUE) {
            this.f7807h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        Q.v vVar = this.f7808i;
        int size = vVar.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ((j0) vVar.get(i2)) + ", ";
        }
        return str;
    }
}
