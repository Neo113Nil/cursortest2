package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingScheduledExecutorService b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TimeUnit d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = delegatingScheduledExecutorService;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$schedule$2;
        ScheduledFuture lambda$schedule$5;
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                long j = this.c;
                TimeUnit timeUnit = this.d;
                lambda$schedule$2 = this.b.lambda$schedule$2((Runnable) obj, j, timeUnit, completer);
                return lambda$schedule$2;
            default:
                long j2 = this.c;
                TimeUnit timeUnit2 = this.d;
                lambda$schedule$5 = this.b.lambda$schedule$5((Callable) obj, j2, timeUnit2, completer);
                return lambda$schedule$5;
        }
    }
}
