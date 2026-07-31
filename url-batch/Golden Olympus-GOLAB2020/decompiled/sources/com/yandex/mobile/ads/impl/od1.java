package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class od1 implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private r70 f29995a;

    /* renamed from: b, reason: collision with root package name */
    private n22 f29996b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29997c;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Mb
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = od1.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f29995a = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        if (this.f29995a == null) {
            throw new IllegalStateException();
        }
        if (this.f29996b == null) {
            lz lzVar = (lz) q70Var;
            if (!a(lzVar)) {
                throw wf1.a("Failed to determine bitstream type", (Exception) null);
            }
            lzVar.c();
        }
        if (!this.f29997c) {
            p52 a4 = this.f29995a.a(0, 1);
            this.f29995a.a();
            this.f29996b.a(this.f29995a, a4);
            this.f29997c = true;
        }
        return this.f29996b.a((lz) q70Var, hj1Var);
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        n22 n22Var = this.f29996b;
        if (n22Var != null) {
            n22Var.a(j4, j5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        try {
            return a((lz) q70Var);
        } catch (wf1 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] a() {
        return new p70[]{new od1()};
    }

    private boolean a(lz lzVar) {
        qd1 qd1Var = new qd1();
        if (qd1Var.a(lzVar, true) && (qd1Var.f30740a & 2) == 2) {
            int min = Math.min(qd1Var.f30744e, 8);
            sf1 sf1Var = new sf1(min);
            lzVar.b(sf1Var.c(), 0, min, false);
            sf1Var.e(0);
            if (sf1Var.a() >= 5 && sf1Var.t() == 127 && sf1Var.v() == 1179402563) {
                this.f29996b = new nb0();
            } else {
                sf1Var.e(0);
                try {
                    if (vi2.a(1, sf1Var, true)) {
                        this.f29996b = new ui2();
                    }
                } catch (wf1 unused) {
                }
                sf1Var.e(0);
                if (ze1.b(sf1Var)) {
                    this.f29996b = new ze1();
                }
            }
            return true;
        }
        return false;
    }
}
