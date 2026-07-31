package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class g21 implements rb1 {

    /* renamed from: f, reason: collision with root package name */
    private final at2 f5417f;

    public g21(at2 at2Var) {
        this.f5417f = at2Var;
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void f(Context context) {
        try {
            this.f5417f.w();
            if (context != null) {
                this.f5417f.u(context);
            }
        } catch (ps2 e7) {
            io0.h("Cannot invoke onResume for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void r(Context context) {
        try {
            this.f5417f.v();
        } catch (ps2 e7) {
            io0.h("Cannot invoke onPause for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void y(Context context) {
        try {
            this.f5417f.j();
        } catch (ps2 e7) {
            io0.h("Cannot invoke onDestroy for the mediation adapter.", e7);
        }
    }
}
