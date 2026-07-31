package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xs0 extends ts0 {
    public xs0(tq0 tq0Var) {
        super(tq0Var);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final boolean t(String str) {
        String e7 = bo0.e(str);
        tq0 tq0Var = this.f12369h.get();
        if (tq0Var != null && e7 != null) {
            tq0Var.B(e7, this);
        }
        io0.g("VideoStreamNoopCache is doing nothing.");
        h(str, e7, "noop", "Noop cache is a noop.");
        return false;
    }
}
