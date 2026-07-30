package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzftb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzftc zzb;

    zzftb(zzftc zzftcVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
