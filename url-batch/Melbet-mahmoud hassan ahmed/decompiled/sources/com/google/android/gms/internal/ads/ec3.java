package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
final class ec3 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Executor f4565f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ga3 f4566g;

    ec3(Executor executor, ga3 ga3Var) {
        this.f4565f = executor;
        this.f4566g = ga3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f4565f.execute(runnable);
        } catch (RejectedExecutionException e7) {
            this.f4566g.x(e7);
        }
    }
}
