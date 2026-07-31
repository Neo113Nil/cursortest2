package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class pc3 extends ac3<cc3> {

    /* renamed from: h, reason: collision with root package name */
    private final wa3 f10175h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ rc3 f10176i;

    pc3(rc3 rc3Var, wa3 wa3Var) {
        this.f10176i = rc3Var;
        Objects.requireNonNull(wa3Var);
        this.f10175h = wa3Var;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final /* bridge */ /* synthetic */ cc3 a() {
        cc3 zza = this.f10175h.zza();
        q43.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f10175h);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final String b() {
        return this.f10175h.toString();
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final void d(Throwable th) {
        this.f10176i.x(th);
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final /* synthetic */ void e(cc3 cc3Var) {
        this.f10176i.y(cc3Var);
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final boolean f() {
        return this.f10176i.isDone();
    }
}
