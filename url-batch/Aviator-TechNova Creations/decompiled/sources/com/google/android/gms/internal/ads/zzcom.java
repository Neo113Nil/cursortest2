package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcom implements zzefx {
    final zzikp zza;
    final zzikp zzb;
    private final zzcnp zzc;
    private final zzcom zzd = this;

    zzcom(zzcnp zzcnpVar, Context context) {
        this.zzc = zzcnpVar;
        zzehf zzc = zzehf.zzc(zzcnpVar.zzaC);
        this.zza = zzc;
        this.zzb = zzegx.zza(zzcnpVar.zzf, zzfmk.zza(), zzcnj.zza, zzcnpVar.zzaB, zzc, zzcnpVar.zzaD, zzcng.zza, zzcnpVar.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzegb zza() {
        zzcnp zzcnpVar = this.zzc;
        zzikp zzikpVar = zzcnpVar.zzl;
        zzcmc zzI = zzcnpVar.zzI();
        return zzegc.zza(zzcmj.zzd(zzcnpVar.zzI()), zzfmq.zzc(), zzfmk.zzc(), zzikf.zzc(this.zzb), zzcna.zzd(zzI), this, (zzdxz) zzikpVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzegd zzb() {
        return new zzcon(this.zzc, this.zzd, null);
    }
}
