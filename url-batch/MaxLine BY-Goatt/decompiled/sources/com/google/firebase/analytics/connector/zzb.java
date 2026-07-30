package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final /* synthetic */ class zzb implements Executor {
    static final /* synthetic */ zzb zza = new zzb();

    private /* synthetic */ zzb() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
