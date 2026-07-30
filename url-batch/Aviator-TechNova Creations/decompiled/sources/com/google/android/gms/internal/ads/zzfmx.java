package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfmx {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfmy zzd;

    zzfmx(zzfmy zzfmyVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzfmyVar);
        this.zzd = zzfmyVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
