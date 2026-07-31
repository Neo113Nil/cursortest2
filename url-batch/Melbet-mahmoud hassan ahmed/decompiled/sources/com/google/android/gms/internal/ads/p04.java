package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class p04 {

    /* renamed from: a, reason: collision with root package name */
    private final pf0 f9977a;

    /* renamed from: b, reason: collision with root package name */
    private e73<s54> f9978b = e73.w();

    /* renamed from: c, reason: collision with root package name */
    private i73<s54, ei0> f9979c = i73.d();

    /* renamed from: d, reason: collision with root package name */
    private s54 f9980d;

    /* renamed from: e, reason: collision with root package name */
    private s54 f9981e;

    /* renamed from: f, reason: collision with root package name */
    private s54 f9982f;

    public p04(pf0 pf0Var) {
        this.f9977a = pf0Var;
    }

    private static s54 j(ub0 ub0Var, e73<s54> e73Var, s54 s54Var, pf0 pf0Var) {
        ei0 o7 = ub0Var.o();
        int f7 = ub0Var.f();
        Object f8 = o7.o() ? null : o7.f(f7);
        int b7 = (ub0Var.l() || o7.o()) ? -1 : o7.d(f7, pf0Var, false).b(nz3.c(ub0Var.j()));
        for (int i7 = 0; i7 < e73Var.size(); i7++) {
            s54 s54Var2 = e73Var.get(i7);
            if (m(s54Var2, f8, ub0Var.l(), ub0Var.b(), ub0Var.d(), b7)) {
                return s54Var2;
            }
        }
        if (e73Var.isEmpty() && s54Var != null) {
            if (m(s54Var, f8, ub0Var.l(), ub0Var.b(), ub0Var.d(), b7)) {
                return s54Var;
            }
        }
        return null;
    }

    private final void k(h73<s54, ei0> h73Var, s54 s54Var, ei0 ei0Var) {
        if (s54Var == null) {
            return;
        }
        if (ei0Var.a(s54Var.f5772a) != -1) {
            h73Var.a(s54Var, ei0Var);
            return;
        }
        ei0 ei0Var2 = this.f9979c.get(s54Var);
        if (ei0Var2 != null) {
            h73Var.a(s54Var, ei0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        k(r0, r3.f9980d, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r3.f9978b.contains(r3.f9980d) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (com.google.android.gms.internal.ads.m43.a(r3.f9980d, r3.f9982f) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void l(ei0 ei0Var) {
        h73<s54, ei0> h73Var = new h73<>();
        if (this.f9978b.isEmpty()) {
            k(h73Var, this.f9981e, ei0Var);
            if (!m43.a(this.f9982f, this.f9981e)) {
                k(h73Var, this.f9982f, ei0Var);
            }
            if (!m43.a(this.f9980d, this.f9981e)) {
            }
        } else {
            for (int i7 = 0; i7 < this.f9978b.size(); i7++) {
                k(h73Var, this.f9978b.get(i7), ei0Var);
            }
        }
        this.f9979c = h73Var.c();
    }

    private static boolean m(s54 s54Var, Object obj, boolean z6, int i7, int i8, int i9) {
        if (!s54Var.f5772a.equals(obj)) {
            return false;
        }
        if (z6) {
            if (s54Var.f5773b != i7 || s54Var.f5774c != i8) {
                return false;
            }
        } else if (s54Var.f5773b != -1 || s54Var.f5776e != i9) {
            return false;
        }
        return true;
    }

    public final ei0 a(s54 s54Var) {
        return this.f9979c.get(s54Var);
    }

    public final s54 b() {
        return this.f9980d;
    }

    public final s54 c() {
        s54 next;
        s54 s54Var;
        if (this.f9978b.isEmpty()) {
            return null;
        }
        e73<s54> e73Var = this.f9978b;
        if (!(e73Var instanceof List)) {
            Iterator<s54> it = e73Var.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            s54Var = next;
        } else {
            if (e73Var.isEmpty()) {
                throw new NoSuchElementException();
            }
            s54Var = e73Var.get(e73Var.size() - 1);
        }
        return s54Var;
    }

    public final s54 d() {
        return this.f9981e;
    }

    public final s54 e() {
        return this.f9982f;
    }

    public final void g(ub0 ub0Var) {
        this.f9980d = j(ub0Var, this.f9978b, this.f9981e, this.f9977a);
    }

    public final void h(List<s54> list, s54 s54Var, ub0 ub0Var) {
        this.f9978b = e73.u(list);
        if (!list.isEmpty()) {
            this.f9981e = list.get(0);
            Objects.requireNonNull(s54Var);
            this.f9982f = s54Var;
        }
        if (this.f9980d == null) {
            this.f9980d = j(ub0Var, this.f9978b, this.f9981e, this.f9977a);
        }
        l(ub0Var.o());
    }

    public final void i(ub0 ub0Var) {
        this.f9980d = j(ub0Var, this.f9978b, this.f9981e, this.f9977a);
        l(ub0Var.o());
    }
}
