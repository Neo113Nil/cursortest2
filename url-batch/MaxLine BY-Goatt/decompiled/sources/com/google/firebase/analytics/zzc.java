package com.google.firebase.analytics;

import defpackage.dg3;
import defpackage.ee3;
import defpackage.jf3;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class zzc implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    public zzc(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        dg3 zza = this.zza.zza();
        zza.getClass();
        ee3 ee3Var = new ee3();
        zza.c(new jf3(zza, ee3Var, 6, false));
        return (Long) ee3.H(ee3Var.d(120000L), Long.class);
    }
}
