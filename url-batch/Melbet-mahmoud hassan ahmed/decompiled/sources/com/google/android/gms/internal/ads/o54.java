package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o54 extends d54<Void> {

    /* renamed from: j, reason: collision with root package name */
    private final v54 f9522j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f9523k;

    /* renamed from: l, reason: collision with root package name */
    private final hh0 f9524l;

    /* renamed from: m, reason: collision with root package name */
    private final pf0 f9525m;

    /* renamed from: n, reason: collision with root package name */
    private m54 f9526n;

    /* renamed from: o, reason: collision with root package name */
    private l54 f9527o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9528p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9529q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9530r;

    public o54(v54 v54Var, boolean z6) {
        boolean z7;
        this.f9522j = v54Var;
        if (z6) {
            v54Var.q();
            z7 = true;
        } else {
            z7 = false;
        }
        this.f9523k = z7;
        this.f9524l = new hh0();
        this.f9525m = new pf0();
        v54Var.A();
        this.f9526n = m54.q(v54Var.C());
    }

    private final Object D(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.f9526n.f8427e;
        if (obj2 == null || !obj.equals(m54.f8425f)) {
            return obj;
        }
        obj3 = this.f9526n.f8427e;
        return obj3;
    }

    private final void E(long j7) {
        l54 l54Var = this.f9527o;
        int a7 = this.f9526n.a(l54Var.f7830f.f5772a);
        if (a7 == -1) {
            return;
        }
        m54 m54Var = this.f9526n;
        pf0 pf0Var = this.f9525m;
        m54Var.d(a7, pf0Var, false);
        long j8 = pf0Var.f10219d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        l54Var.r(j7);
    }

    @Override // com.google.android.gms.internal.ads.v54
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final l54 h(s54 s54Var, g94 g94Var, long j7) {
        l54 l54Var = new l54(s54Var, g94Var, j7, null);
        l54Var.u(this.f9522j);
        if (this.f9529q) {
            l54Var.q(s54Var.c(D(s54Var.f5772a)));
        } else {
            this.f9527o = l54Var;
            if (!this.f9528p) {
                this.f9528p = true;
                z(null, this.f9522j);
            }
        }
        return l54Var;
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final zo C() {
        return this.f9522j.C();
    }

    public final ei0 F() {
        return this.f9526n;
    }

    @Override // com.google.android.gms.internal.ads.v54
    public final void j(r54 r54Var) {
        ((l54) r54Var).t();
        if (r54Var == this.f9527o) {
            this.f9527o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v44
    public final void s(vt1 vt1Var) {
        super.s(vt1Var);
        if (this.f9523k) {
            return;
        }
        this.f9528p = true;
        z(null, this.f9522j);
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v44
    public final void u() {
        this.f9529q = false;
        this.f9528p = false;
        super.u();
    }

    @Override // com.google.android.gms.internal.ads.d54
    protected final /* bridge */ /* synthetic */ s54 w(Void r22, s54 s54Var) {
        Object obj;
        Object obj2;
        Object obj3 = s54Var.f5772a;
        obj = this.f9526n.f8427e;
        if (obj != null) {
            obj2 = this.f9526n.f8427e;
            if (obj2.equals(obj3)) {
                obj3 = m54.f8425f;
            }
        }
        return s54Var.c(obj3);
    }

    @Override // com.google.android.gms.internal.ads.d54, com.google.android.gms.internal.ads.v54
    public final void x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // com.google.android.gms.internal.ads.d54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ void y(Void r12, v54 v54Var, ei0 ei0Var) {
        long j7;
        l54 l54Var;
        s54 s54Var = null;
        if (this.f9529q) {
            this.f9526n = this.f9526n.p(ei0Var);
            l54 l54Var2 = this.f9527o;
            if (l54Var2 != null) {
                E(l54Var2.m());
            }
        } else if (ei0Var.o()) {
            this.f9526n = this.f9530r ? this.f9526n.p(ei0Var) : m54.r(ei0Var, hh0.f6244o, m54.f8425f);
        } else {
            ei0Var.e(0, this.f9524l, 0L);
            Object obj = this.f9524l.f6248a;
            l54 l54Var3 = this.f9527o;
            if (l54Var3 != null) {
                long p7 = l54Var3.p();
                this.f9526n.n(this.f9527o.f7830f.f5772a, this.f9525m);
                this.f9526n.e(0, this.f9524l, 0L);
                if (p7 != 0) {
                    j7 = p7;
                    Pair<Object, Long> l7 = ei0Var.l(this.f9524l, this.f9525m, 0, j7);
                    Object obj2 = l7.first;
                    long longValue = ((Long) l7.second).longValue();
                    this.f9526n = !this.f9530r ? this.f9526n.p(ei0Var) : m54.r(ei0Var, obj, obj2);
                    l54Var = this.f9527o;
                    if (l54Var != null) {
                        E(longValue);
                        s54 s54Var2 = l54Var.f7830f;
                        s54Var = s54Var2.c(D(s54Var2.f5772a));
                    }
                }
            }
            j7 = 0;
            Pair<Object, Long> l72 = ei0Var.l(this.f9524l, this.f9525m, 0, j7);
            Object obj22 = l72.first;
            long longValue2 = ((Long) l72.second).longValue();
            this.f9526n = !this.f9530r ? this.f9526n.p(ei0Var) : m54.r(ei0Var, obj, obj22);
            l54Var = this.f9527o;
            if (l54Var != null) {
            }
        }
        this.f9530r = true;
        this.f9529q = true;
        t(this.f9526n);
        if (s54Var != null) {
            l54 l54Var4 = this.f9527o;
            Objects.requireNonNull(l54Var4);
            l54Var4.q(s54Var);
        }
    }
}
