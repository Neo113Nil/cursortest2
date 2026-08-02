package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzbvg implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvi zzb;

    zzbvg(zzbvi zzbviVar, Context context) {
        this.zza = context;
        this.zzb = zzbviVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbvf zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbvh zzbvhVar = (zzbvh) weakHashMap.get(this.zza);
        if (zzbvhVar != null) {
            if (zzbvhVar.zza + ((Long) zzbdh.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) {
                zza = new zzbve(this.zza, zzbvhVar.zzb).zza();
                zzbvi zzbviVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbviVar.zza;
                weakHashMap2.put(context, new zzbvh(zzbviVar, zza));
                return zza;
            }
        }
        zza = new zzbve(this.zza).zza();
        zzbvi zzbviVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbviVar2.zza;
        weakHashMap2.put(context2, new zzbvh(zzbviVar2, zza));
        return zza;
    }
}
