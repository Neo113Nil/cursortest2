package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcnz implements zzffi {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcnp zzj;

    zzcnz(zzcnp zzcnpVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcnpVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(zzrVar);
        this.zzb = zza2;
        zzikp zza3 = zzikf.zza(zzerq.zza(zzcnpVar.zzl));
        this.zzc = zza3;
        zzikp zza4 = zzikf.zza(zzerv.zza());
        this.zzd = zza4;
        zzikp zza5 = zzikf.zza(zzdgn.zza());
        this.zze = zza5;
        this.zzf = zzikf.zza(zzffg.zza(zza, zzcnpVar.zza, zza2, zzcnpVar.zzab, zza3, zza4, zzfjm.zza(), zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzffi
    public final zzequ zza() {
        zzfff zzfffVar = (zzfff) this.zzf.zzb();
        zzerp zzerpVar = (zzerp) this.zzc.zzb();
        zzcnp zzcnpVar = this.zzj;
        zzikp zzikpVar = zzcnpVar.zzl;
        return new zzequ(this.zzg, this.zzh, this.zzi, zzfffVar, zzerpVar, zzcna.zzd(zzcnpVar.zzI()), (zzdxz) zzikpVar.zzb());
    }
}
