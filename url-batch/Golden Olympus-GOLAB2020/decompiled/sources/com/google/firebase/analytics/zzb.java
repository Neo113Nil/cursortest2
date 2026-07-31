package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzff;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzb implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzff zzffVar;
        zzffVar = this.zza.zzb;
        return zzffVar.zzl();
    }
}
