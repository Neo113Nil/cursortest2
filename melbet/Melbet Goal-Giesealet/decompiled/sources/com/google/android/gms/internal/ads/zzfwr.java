package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfwr {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    zzfwr(zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzgea zzgeaVar) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = zzhprVar3;
        this.zzd = zzgeaVar;
    }

    final /* synthetic */ zzgea zza() {
        return this.zzd;
    }

    final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture zzd = zzd(i);
        return (!z || i == 2) ? zzd : (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(zzd), Throwable.class, zzfwq.zza, zzgpk.zza()), new zzfwp(this), zzgpk.zza());
    }

    final /* synthetic */ ListenableFuture zzc(int i) {
        return zzd(2);
    }

    private final ListenableFuture zzd(int i) {
        zzfwn zzfwnVar;
        int i2 = i - 1;
        if (i2 == 1) {
            zzfwnVar = (zzfwn) this.zza.zzb();
        } else if (i2 == 2) {
            zzfwnVar = (zzfwn) this.zzb.zzb();
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException();
            }
            zzfwnVar = (zzfwn) this.zzc.zzb();
        }
        return zzgot.zzk(zzfwnVar.zzb(), zzggt.zza(zzfwnVar), zzgpk.zza());
    }
}
