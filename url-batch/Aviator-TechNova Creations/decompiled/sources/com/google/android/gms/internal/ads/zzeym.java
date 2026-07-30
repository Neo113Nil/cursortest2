package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeym implements zzfax {
    private final zzgzy zza;
    private final zzebf zzb;

    zzeym(zzgzy zzgzyVar, zzebf zzebfVar) {
        this.zza = zzgzyVar;
        this.zzb = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeym.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 23;
    }

    final /* synthetic */ zzeyn zzc() {
        zzebf zzebfVar = this.zzb;
        return new zzeyn(zzebfVar.zzg(), zzebfVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzebfVar.zzq(), zzebfVar.zzm());
    }
}
