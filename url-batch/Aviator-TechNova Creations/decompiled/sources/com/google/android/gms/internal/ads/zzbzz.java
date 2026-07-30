package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbzz implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcab zzb;

    zzbzz(zzcab zzcabVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzcabVar);
        this.zzb = zzcabVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzy zza;
        zzcab zzcabVar = this.zzb;
        WeakHashMap zzb = zzcabVar.zzb();
        Context context = this.zza;
        zzcaa zzcaaVar = (zzcaa) zzb.get(context);
        if (zzcaaVar != null) {
            if (zzcaaVar.zza + ((Long) zzbit.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zza = new zzbzx(context, zzcaaVar.zzb).zza();
                zzcabVar.zzb().put(context, new zzcaa(zzcabVar, zza));
                return zza;
            }
        }
        zza = new zzbzx(context).zza();
        zzcabVar.zzb().put(context, new zzcaa(zzcabVar, zza));
        return zza;
    }
}
