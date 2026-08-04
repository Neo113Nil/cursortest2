package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfmb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfmc zzb;

    zzfmb(zzfmc zzfmcVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfmcVar);
        this.zzb = zzfmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
