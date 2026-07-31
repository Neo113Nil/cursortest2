package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class qc3 extends ac3 {

    /* renamed from: h, reason: collision with root package name */
    private final Callable f10647h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ rc3 f10648i;

    qc3(rc3 rc3Var, Callable callable) {
        this.f10648i = rc3Var;
        Objects.requireNonNull(callable);
        this.f10647h = callable;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final Object a() {
        return this.f10647h.call();
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final String b() {
        return this.f10647h.toString();
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final void d(Throwable th) {
        this.f10648i.x(th);
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final void e(Object obj) {
        this.f10648i.w(obj);
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final boolean f() {
        return this.f10648i.isDone();
    }
}
