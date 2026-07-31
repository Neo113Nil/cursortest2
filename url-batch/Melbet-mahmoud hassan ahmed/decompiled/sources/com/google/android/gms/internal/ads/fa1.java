package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class fa1 {

    /* renamed from: a, reason: collision with root package name */
    private Context f5058a;

    /* renamed from: b, reason: collision with root package name */
    private ks2 f5059b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f5060c;

    /* renamed from: d, reason: collision with root package name */
    private fs2 f5061d;

    public final fa1 c(Context context) {
        this.f5058a = context;
        return this;
    }

    public final fa1 d(Bundle bundle) {
        this.f5060c = bundle;
        return this;
    }

    public final fa1 e(fs2 fs2Var) {
        this.f5061d = fs2Var;
        return this;
    }

    public final fa1 f(ks2 ks2Var) {
        this.f5059b = ks2Var;
        return this;
    }

    public final ha1 g() {
        return new ha1(this, null);
    }
}
