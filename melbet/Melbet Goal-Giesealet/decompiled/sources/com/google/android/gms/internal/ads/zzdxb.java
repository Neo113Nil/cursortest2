package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdxb implements zzcyy, zzdel, zzcxg {
    private final Context zza;
    private final zzdsm zzb;

    zzdxb(Context context, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdsmVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfd)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdxb.this.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfg)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzff)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfh)).booleanValue()) {
            zzf(this.zza);
        }
    }
}
