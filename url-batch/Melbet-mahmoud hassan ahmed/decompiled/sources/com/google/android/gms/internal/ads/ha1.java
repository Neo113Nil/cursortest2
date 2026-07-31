package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ha1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6144a;

    /* renamed from: b, reason: collision with root package name */
    private final ks2 f6145b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f6146c;

    /* renamed from: d, reason: collision with root package name */
    private final fs2 f6147d;

    /* synthetic */ ha1(fa1 fa1Var, ga1 ga1Var) {
        Context context;
        ks2 ks2Var;
        Bundle bundle;
        fs2 fs2Var;
        context = fa1Var.f5058a;
        this.f6144a = context;
        ks2Var = fa1Var.f5059b;
        this.f6145b = ks2Var;
        bundle = fa1Var.f5060c;
        this.f6146c = bundle;
        fs2Var = fa1Var.f5061d;
        this.f6147d = fs2Var;
    }

    final Context a(Context context) {
        return this.f6144a;
    }

    final Bundle b() {
        return this.f6146c;
    }

    final fa1 c() {
        fa1 fa1Var = new fa1();
        fa1Var.c(this.f6144a);
        fa1Var.f(this.f6145b);
        fa1Var.d(this.f6146c);
        return fa1Var;
    }

    final fs2 d() {
        return this.f6147d;
    }

    final ks2 e() {
        return this.f6145b;
    }
}
