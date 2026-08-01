package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbyz extends zzbzt {
    private final Clock zzb;
    private final zzbyz zzc = this;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;
    private final zzhec zzi;
    private final zzhec zzj;
    private final zzhec zzk;

    /* synthetic */ zzbyz(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbzs zzbzsVar, zzbyy zzbyyVar) {
        this.zzb = clock;
        zzhdp zza = zzhdq.zza(context);
        this.zzd = zza;
        zzhdp zza2 = zzhdq.zza(zzgVar);
        this.zze = zza2;
        zzhdp zza3 = zzhdq.zza(zzbzsVar);
        this.zzf = zza3;
        this.zzg = zzhdo.zzc(new zzbyr(zza, zza2, zza3));
        zzhdp zza4 = zzhdq.zza(clock);
        this.zzh = zza4;
        zzhec zzc = zzhdo.zzc(new zzbyt(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbyv zzbyvVar = new zzbyv(zza4, zzc);
        this.zzj = zzbyvVar;
        this.zzk = zzhdo.zzc(new zzbzy(zza, zzbyvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    final zzbyq zza() {
        return (zzbyq) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    final zzbyu zzb() {
        return new zzbyu(this.zzb, (zzbys) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    final zzbzx zzc() {
        return (zzbzx) this.zzk.zzb();
    }
}
