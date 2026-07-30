package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcok implements zzfgy {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    final zzikp zzf;
    final zzikp zzg;
    private final zzcnp zzh;

    zzcok(zzcnp zzcnpVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcnpVar;
        zzikg zza = zzikh.zza(context);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(zzrVar);
        this.zzb = zza2;
        zzikg zza3 = zzikh.zza(str);
        this.zzc = zza3;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzikp zza4 = zzikf.zza(zzerq.zza(zzikpVar));
        this.zzd = zza4;
        zzikp zza5 = zzikf.zza(zzfhw.zza(zzcnpVar.zzbw));
        this.zze = zza5;
        zzikp zza6 = zzikf.zza(zzfgw.zza(zza, zzcnpVar.zza, zzcnpVar.zzab, zza4, zza5, zzfjm.zza()));
        this.zzf = zza6;
        this.zzg = zzikf.zza(zzery.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcnpVar.zzi, zzcnpVar.zzae, zzikpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfgy
    public final zzerx zza() {
        return (zzerx) this.zzg.zzb();
    }
}
