package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdxw implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzdxw(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzasi zzasiVar = (zzasi) this.zza.zzb();
        final Context zza = ((zzciw) this.zzb).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        ListenableFuture zzb = zzgblVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzasi.this.zzc().zzg(zza);
            }
        });
        zzhdx.zzb(zzb);
        return zzb;
    }
}
