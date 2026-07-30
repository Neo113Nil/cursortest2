package com.google.firebase.analytics;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzef;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class zzb implements Callable {
    final /* synthetic */ FirebaseAnalytics zza;

    zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() {
        zzef zzefVar;
        zzefVar = this.zza.zzb;
        return zzefVar.zzl();
    }
}
