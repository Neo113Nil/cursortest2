package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class hd1 extends lg1<jd1> implements qb1, wc1 {

    /* renamed from: g, reason: collision with root package name */
    private final rr2 f6189g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f6190h;

    public hd1(Set<hi1<jd1>> set, rr2 rr2Var) {
        super(set);
        this.f6190h = new AtomicBoolean();
        this.f6189g = rr2Var;
    }

    private final void a() {
        rv rvVar;
        if (((Boolean) sw.c().b(m10.H5)).booleanValue() && this.f6190h.compareAndSet(false, true) && (rvVar = this.f6189g.f11372c0) != null && rvVar.f11426f == 3) {
            R0(new kg1() { // from class: com.google.android.gms.internal.ads.fd1
                @Override // com.google.android.gms.internal.ads.kg1
                public final void c(Object obj) {
                    hd1.this.S0((jd1) obj);
                }
            });
        }
    }

    final /* synthetic */ void S0(jd1 jd1Var) {
        jd1Var.s(this.f6189g.f11372c0);
    }

    @Override // com.google.android.gms.internal.ads.wc1
    public final void f() {
        if (this.f6189g.f11369b == 1) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        int i7 = this.f6189g.f11369b;
        if (i7 == 2 || i7 == 5 || i7 == 4 || i7 == 6 || i7 == 7) {
            a();
        }
    }
}
