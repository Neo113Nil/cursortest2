package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzexx implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    zzexx(zzgzy zzgzyVar, Context context) {
        this.zzb = zzgzyVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzexx.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzexy zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzexy(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
