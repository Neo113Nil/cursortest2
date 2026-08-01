package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeuv implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;

    zzeuv(zzgbl zzgblVar, Context context) {
        this.zza = zzgblVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuv.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeux zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzge));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzeux() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
