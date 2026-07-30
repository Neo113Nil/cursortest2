package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Runnable n;

    public /* synthetic */ g(Runnable runnable, int i) {
        this.m = i;
        this.n = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$1;
        Object lambda$submit$12;
        int i = this.m;
        Runnable runnable = this.n;
        switch (i) {
            case 0:
                lambda$submit$1 = LimitedConcurrencyExecutorService.lambda$submit$1(runnable);
                return lambda$submit$1;
            default:
                lambda$submit$12 = PausableExecutorServiceImpl.lambda$submit$1(runnable);
                return lambda$submit$12;
        }
    }
}
