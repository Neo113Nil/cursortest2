package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfrs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfsa zzc;

    zzfrs(zzfsa zzfsaVar, long j, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzc = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzX;
        zzfsa zzfsaVar = this.zzc;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            long j = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfrm zzK = zzfsaVar.zzK();
            zzX = zzfsa.zzX(zzeaVar);
            zzI.zzi(j, zzX, zzK, zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzfsaVar.zzH());
        }
    }
}
