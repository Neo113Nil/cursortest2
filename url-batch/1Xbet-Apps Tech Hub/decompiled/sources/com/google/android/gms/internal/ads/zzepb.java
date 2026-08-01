package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzepb implements zzeuy {
    private final ListenableFuture zza;
    private final Executor zzb;

    public zzepb(ListenableFuture listenableFuture, Executor executor) {
        this.zza = listenableFuture;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzn(this.zza, new zzgai() { // from class: com.google.android.gms.internal.ads.zzepa
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                final String str = (String) obj;
                return zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzeoz
                    @Override // com.google.android.gms.internal.ads.zzeux
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.zzb);
    }
}
