package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzclu implements zzduz {
    private final Context zza;
    private final zzblb zzb;
    private final zzckm zzc;
    private final zzclu zzd = this;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;

    /* synthetic */ zzclu(zzckm zzckmVar, Context context, zzblb zzblbVar, zzclt zzcltVar) {
        this.zzc = zzckmVar;
        this.zza = context;
        this.zzb = zzblbVar;
        zzhdp zza = zzhdq.zza(this);
        this.zze = zza;
        zzhdp zza2 = zzhdq.zza(zzblbVar);
        this.zzf = zza2;
        zzduv zzduvVar = new zzduv(zza2);
        this.zzg = zzduvVar;
        this.zzh = zzhdo.zzc(new zzdux(zza, zzduvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzduz
    public final zzduq zzb() {
        return new zzclo(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzduz
    public final zzduw zzd() {
        return (zzduw) this.zzh.zzb();
    }
}
