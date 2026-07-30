package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Runnable n;
    public final /* synthetic */ DelegatingScheduledFuture.Completer o;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.m = i;
        this.n = runnable;
        this.o = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.n, this.o);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.n, this.o);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.n, this.o);
                break;
        }
    }
}
