package defpackage;

import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fz2 {
    public final rp3 a;
    public final fz2 b;
    public final String c;
    public final lz1 d;
    public final lz1 e;
    public final jz1 f = new jz1(0);
    public final jz1 g = new jz1(Long.MIN_VALUE);
    public final lz1 h;
    public final fn2 i;
    public final fn2 j;
    public final lz1 k;
    public final ia0 l;

    public fz2(rp3 rp3Var, fz2 fz2Var, String str) {
        this.a = rp3Var;
        this.b = fz2Var;
        this.c = str;
        this.d = ij2.j(rp3Var.j());
        this.e = ij2.j(new dz2(rp3Var.j(), rp3Var.j()));
        Boolean bool = Boolean.FALSE;
        this.h = ij2.j(bool);
        this.i = new fn2();
        this.j = new fn2();
        this.k = ij2.j(bool);
        this.l = ij2.f(new cd(this, 1));
        rp3Var.n(this);
    }

    public final void a(Object obj, a00 a00Var, int i) {
        a00Var.Z(-1493585151);
        int i2 = (a00Var.f(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= a00Var.f(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else if (g()) {
            a00Var.X(1823992347);
            a00Var.q(false);
        } else {
            a00Var.X(1822507602);
            q(obj);
            if (Intrinsics.b(obj, this.a.j()) && this.g.h() == Long.MIN_VALUE && !((Boolean) this.h.getValue()).booleanValue()) {
                a00Var.X(1823982427);
                a00Var.q(false);
            } else {
                a00Var.X(1822738893);
                Object M = a00Var.M();
                nj njVar = sz.a;
                if (M == njVar) {
                    q00 q00Var = new q00(l41.x(h.m, a00Var));
                    a00Var.i0(q00Var);
                    M = q00Var;
                }
                a50 a50Var = ((q00) M).m;
                boolean h = ((i2 & 112) == 32) | a00Var.h(a50Var);
                Object M2 = a00Var.M();
                if (h || M2 == njVar) {
                    M2 = new ih2(8, a50Var, this);
                    a00Var.i0(M2);
                }
                l41.e(a50Var, this, (Function1) M2, a00Var);
                a00Var.q(false);
            }
            a00Var.q(false);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new l9(i, 6, this, obj);
        }
    }

    public final long b() {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ez2) fn2Var.get(i)).x.h());
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((fz2) fn2Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ez2 ez2Var = (ez2) fn2Var.get(i);
            ez2Var.r = null;
            ez2Var.q = null;
            ez2Var.u = false;
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fz2) fn2Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            if (((ez2) fn2Var.get(i)).q != null) {
                return true;
            }
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((fz2) fn2Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        fz2 fz2Var = this.b;
        return fz2Var != null ? fz2Var.e() : this.f.h();
    }

    public final cz2 f() {
        return (cz2) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(boolean z, long j) {
        jz1 jz1Var = this.g;
        long h = jz1Var.h();
        rp3 rp3Var = this.a;
        if (h == Long.MIN_VALUE) {
            jz1Var.i(j);
            ((lz1) rp3Var.m).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((lz1) rp3Var.m).getValue()).booleanValue()) {
            ((lz1) rp3Var.m).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ez2 ez2Var = (ez2) fn2Var.get(i);
            lz1 lz1Var = ez2Var.s;
            lz1 lz1Var2 = ez2Var.s;
            if (!((Boolean) lz1Var.getValue()).booleanValue()) {
                long c = z ? ez2Var.a().c() : j;
                ez2Var.f(ez2Var.a().b(c));
                ez2Var.w = ez2Var.a().f(c);
                if (ez2Var.a().g(c)) {
                    lz1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) lz1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fz2 fz2Var = (fz2) fn2Var2.get(i2);
            lz1 lz1Var3 = fz2Var.d;
            rp3 rp3Var2 = fz2Var.a;
            if (!Intrinsics.b(lz1Var3.getValue(), rp3Var2.j())) {
                fz2Var.h(z, j);
            }
            if (!Intrinsics.b(fz2Var.d.getValue(), rp3Var2.j())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        rp3 rp3Var = this.a;
        if (rp3Var instanceof ao1) {
            rp3Var.m(this.d.getValue());
        }
        o(0L);
        ((lz1) rp3Var.m).setValue(Boolean.FALSE);
        fn2 fn2Var = this.j;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ((fz2) fn2Var.get(i)).i();
        }
    }

    public final void j(float f) {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ez2 ez2Var = (ez2) fn2Var.get(i);
            ez2Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                bt2 bt2Var = ez2Var.r;
                if (bt2Var != null) {
                    ez2Var.a().h(bt2Var.c);
                    ez2Var.q = null;
                    ez2Var.r = null;
                }
                Object obj = f == -4.0f ? ez2Var.a().d : ez2Var.a().c;
                ez2Var.a().h(obj);
                ez2Var.a().i(obj);
                ez2Var.f(obj);
                ez2Var.x.i(ez2Var.a().c());
            } else {
                ez2Var.t.i(f);
            }
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fz2) fn2Var2.get(i2)).j(f);
        }
    }

    public final void k() {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ((ez2) fn2Var.get(i)).t.i(-2.0f);
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fz2) fn2Var2.get(i2)).k();
        }
    }

    public final void l(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        rp3 rp3Var = this.a;
        ((lz1) rp3Var.m).setValue(Boolean.FALSE);
        boolean g = g();
        lz1 lz1Var = this.d;
        if (!g || !Intrinsics.b(rp3Var.j(), obj) || !Intrinsics.b(lz1Var.getValue(), obj2)) {
            if (!Intrinsics.b(rp3Var.j(), obj) && (rp3Var instanceof ao1)) {
                rp3Var.m(obj);
            }
            lz1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new dz2(obj, obj2));
        }
        fn2 fn2Var = this.j;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            fz2 fz2Var = (fz2) fn2Var.get(i);
            fz2Var.getClass();
            if (fz2Var.g()) {
                fz2Var.l(fz2Var.a.j(), fz2Var.d.getValue());
            }
        }
        fn2 fn2Var2 = this.i;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ez2) fn2Var2.get(i2)).d(0L);
        }
    }

    public final void m(long j) {
        jz1 jz1Var = this.g;
        if (jz1Var.h() == Long.MIN_VALUE) {
            jz1Var.i(j);
        }
        o(j);
        this.h.setValue(Boolean.FALSE);
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ((ez2) fn2Var.get(i)).d(j);
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fz2 fz2Var = (fz2) fn2Var2.get(i2);
            if (!Intrinsics.b(fz2Var.d.getValue(), fz2Var.a.j())) {
                fz2Var.m(j);
            }
        }
    }

    public final void n(kg2 kg2Var) {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ez2 ez2Var = (ez2) fn2Var.get(i);
            lz1 lz1Var = ez2Var.v;
            if (!Intrinsics.b(ez2Var.a().c, ez2Var.a().d)) {
                ez2Var.r = ez2Var.a();
                ez2Var.q = kg2Var;
            }
            ez2Var.p.setValue(new bt2(ez2Var.z, ez2Var.m, lz1Var.getValue(), lz1Var.getValue(), ez2Var.w.c()));
            ez2Var.x.i(ez2Var.a().c());
            ez2Var.u = true;
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fz2) fn2Var2.get(i2)).n(kg2Var);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void p() {
        bt2 bt2Var;
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        for (int i = 0; i < size; i++) {
            ez2 ez2Var = (ez2) fn2Var.get(i);
            kg2 kg2Var = ez2Var.q;
            if (kg2Var != null && (bt2Var = ez2Var.r) != null) {
                long c = si1.c(kg2Var.g * kg2Var.d);
                Object b = bt2Var.b(c);
                if (ez2Var.u) {
                    ez2Var.a().i(b);
                }
                ez2Var.a().h(b);
                ez2Var.x.i(ez2Var.a().c());
                if (ez2Var.t.h() == -2.0f || ez2Var.u) {
                    ez2Var.f(b);
                } else {
                    ez2Var.d(ez2Var.A.e());
                }
                if (c >= kg2Var.g) {
                    ez2Var.q = null;
                    ez2Var.r = null;
                } else {
                    kg2Var.c = false;
                }
            }
        }
        fn2 fn2Var2 = this.j;
        int size2 = fn2Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((fz2) fn2Var2.get(i2)).p();
        }
    }

    public final void q(Object obj) {
        lz1 lz1Var = this.d;
        if (Intrinsics.b(lz1Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new dz2(lz1Var.getValue(), obj));
        rp3 rp3Var = this.a;
        if (!Intrinsics.b(rp3Var.j(), lz1Var.getValue())) {
            rp3Var.m(lz1Var.getValue());
        }
        lz1Var.setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        fn2 fn2Var = this.i;
        int size = fn2Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ez2) fn2Var.get(i)) + ", ";
        }
        return str;
    }
}
