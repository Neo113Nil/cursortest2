package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Runnable n;
    public final /* synthetic */ Object o;

    public /* synthetic */ h(Runnable runnable, Object obj, int i) {
        this.m = i;
        this.n = runnable;
        this.o = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$0;
        Object lambda$submit$02;
        switch (this.m) {
            case 0:
                lambda$submit$0 = LimitedConcurrencyExecutorService.lambda$submit$0(this.n, this.o);
                return lambda$submit$0;
            default:
                lambda$submit$02 = PausableExecutorServiceImpl.lambda$submit$0(this.n, this.o);
                return lambda$submit$02;
        }
    }
}
