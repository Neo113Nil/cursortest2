package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
/* loaded from: classes4.dex */
final class zzd implements Callable<Long> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        zzdq zzdqVar;
        zzdqVar = this.zza.zzb;
        return zzdqVar.zzc();
    }

    zzd(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
