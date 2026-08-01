package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjt implements zzdfj, zzcyx, zzdfn {
    private final zzfkh zza;
    private final zzfjw zzb;

    zzfjt(Context context, zzfkh zzfkhVar) {
        this.zza = zzfkhVar;
        this.zzb = zzfjv.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdfn
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfn
    public final void zzb() {
        if (((Boolean) zzbeo.zzd.zze()).booleanValue()) {
            zzfkh zzfkhVar = this.zza;
            zzfjw zzfjwVar = this.zzb;
            zzfjwVar.zzf(true);
            zzfkhVar.zza(zzfjwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzl() {
        if (((Boolean) zzbeo.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeo.zzd.zze()).booleanValue()) {
            zzfkh zzfkhVar = this.zza;
            zzfjw zzfjwVar = this.zzb;
            zzfjwVar.zzc(zzeVar.zza().toString());
            zzfjwVar.zzf(false);
            zzfkhVar.zza(zzfjwVar);
        }
    }
}
