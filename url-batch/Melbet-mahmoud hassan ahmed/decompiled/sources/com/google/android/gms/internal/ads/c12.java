package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class c12 implements td1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f3693f;

    /* renamed from: g, reason: collision with root package name */
    private final pm0 f3694g;

    c12(Context context, pm0 pm0Var) {
        this.f3693f = context;
        this.f3694g = pm0Var;
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
        if (TextUtils.isEmpty(ds2Var.f4313b.f3934b.f12949d)) {
            return;
        }
        this.f3694g.u(this.f3693f, ds2Var.f4312a.f2953a.f7618d);
        this.f3694g.q(this.f3693f, ds2Var.f4313b.f3934b.f12949d);
    }
}
