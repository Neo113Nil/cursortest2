package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbwg implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbwi zzb;

    zzbwg(zzbwi zzbwiVar, Context context) {
        this.zzb = zzbwiVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbwf zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbwh zzbwhVar = (zzbwh) weakHashMap.get(this.zza);
        if (zzbwhVar != null) {
            if (zzbwhVar.zza + ((Long) zzbel.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
                zza = new zzbwe(this.zza, zzbwhVar.zzb).zza();
                zzbwi zzbwiVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbwiVar.zza;
                weakHashMap2.put(context, new zzbwh(zzbwiVar, zza));
                return zza;
            }
        }
        zza = new zzbwe(this.zza).zza();
        zzbwi zzbwiVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbwiVar2.zza;
        weakHashMap2.put(context2, new zzbwh(zzbwiVar2, zza));
        return zza;
    }
}
