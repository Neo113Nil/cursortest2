package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ DelegatingScheduledExecutorService n;
    public final /* synthetic */ Runnable o;
    public final /* synthetic */ DelegatingScheduledFuture.Completer p;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.m = i;
        this.n = delegatingScheduledExecutorService;
        this.o = runnable;
        this.p = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        DelegatingScheduledFuture.Completer completer = this.p;
        Runnable runnable = this.o;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.n;
        switch (i) {
            case 0:
                delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
                break;
            case 1:
                delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
                break;
            default:
                delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
                break;
        }
    }
}
