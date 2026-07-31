package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class wy0 implements hx1 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f13964a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13965b;

    /* renamed from: c, reason: collision with root package name */
    private n80 f13966c;

    /* synthetic */ wy0(b01 b01Var, vy0 vy0Var) {
        this.f13964a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final /* synthetic */ hx1 a(Context context) {
        Objects.requireNonNull(context);
        this.f13965b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final /* synthetic */ hx1 b(n80 n80Var) {
        Objects.requireNonNull(n80Var);
        this.f13966c = n80Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final ix1 c() {
        sv3.c(this.f13965b, Context.class);
        sv3.c(this.f13966c, n80.class);
        return new yy0(this.f13964a, this.f13965b, this.f13966c, null);
    }
}
