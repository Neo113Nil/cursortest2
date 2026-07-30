package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfbd implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    zzfbd(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return ((Boolean) zzbiw.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbd.this.zzc();
            }
        }) : zzgzo.zza(new zzfbe(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 59;
    }

    final /* synthetic */ zzfbe zzc() {
        Context context = this.zza;
        return new zzfbe(zzbgp.zzc(context), zzbgp.zzd(context));
    }
}
