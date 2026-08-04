package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzblg implements Runnable {
    final /* synthetic */ zzblj zza;

    zzblg(zzblj zzbljVar) {
        Objects.requireNonNull(zzbljVar);
        this.zza = zzbljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
