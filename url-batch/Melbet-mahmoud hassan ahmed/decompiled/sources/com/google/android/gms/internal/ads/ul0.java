package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class ul0 {

    /* renamed from: a, reason: collision with root package name */
    private Context f12840a;

    /* renamed from: b, reason: collision with root package name */
    private v3.d f12841b;

    /* renamed from: c, reason: collision with root package name */
    private a3.t1 f12842c;

    /* renamed from: d, reason: collision with root package name */
    private pm0 f12843d;

    /* synthetic */ ul0(tl0 tl0Var) {
    }

    public final ul0 a(a3.t1 t1Var) {
        this.f12842c = t1Var;
        return this;
    }

    public final ul0 b(Context context) {
        Objects.requireNonNull(context);
        this.f12840a = context;
        return this;
    }

    public final ul0 c(v3.d dVar) {
        Objects.requireNonNull(dVar);
        this.f12841b = dVar;
        return this;
    }

    public final ul0 d(pm0 pm0Var) {
        this.f12843d = pm0Var;
        return this;
    }

    public final qm0 e() {
        sv3.c(this.f12840a, Context.class);
        sv3.c(this.f12841b, v3.d.class);
        sv3.c(this.f12842c, a3.t1.class);
        sv3.c(this.f12843d, pm0.class);
        return new wl0(this.f12840a, this.f12841b, this.f12842c, this.f12843d, null);
    }
}
