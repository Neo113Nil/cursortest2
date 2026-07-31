package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class cb3 extends db3 {

    /* renamed from: j, reason: collision with root package name */
    private final Callable f3792j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ eb3 f3793k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cb3(eb3 eb3Var, Callable callable, Executor executor) {
        super(eb3Var, executor);
        this.f3793k = eb3Var;
        Objects.requireNonNull(callable);
        this.f3792j = callable;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final Object a() {
        return this.f3792j.call();
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final String b() {
        return this.f3792j.toString();
    }

    @Override // com.google.android.gms.internal.ads.db3
    final void h(Object obj) {
        this.f3793k.w(obj);
    }
}
