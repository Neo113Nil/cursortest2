package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfic {
    final /* synthetic */ zzfim zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfic(zzfim zzfimVar, Object obj, List list, zzfib zzfibVar) {
        this.zza = zzfimVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfil zza(Callable callable) {
        zzgbl zzgblVar;
        zzgba zzb = zzgbb.zzb(this.zzc);
        ListenableFuture zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfia
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcca.zzf);
        zzgblVar = this.zza.zzb;
        ListenableFuture zza2 = zzb.zza(callable, zzgblVar);
        return new zzfil(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
