package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzect implements zzdel, zzdjy, zzdct {
    private final Context zza;
    private final zzdxz zzb;

    zzect(Context context, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzdxzVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzect.this.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfC)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfB)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfD)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
