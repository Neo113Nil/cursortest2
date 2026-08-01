package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcas extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcaw zza;

    zzcas(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcbt zzcbtVar;
        Object obj;
        zzbdk zzbdkVar;
        zzcaw zzcawVar = this.zza;
        context = zzcawVar.zze;
        zzcbtVar = zzcawVar.zzf;
        zzbdi zzbdiVar = new zzbdi(context, zzcbtVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbdkVar = this.zza.zzh;
                zzbdl.zza(zzbdkVar, zzbdiVar);
            } catch (IllegalArgumentException e) {
                zzcbn.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
