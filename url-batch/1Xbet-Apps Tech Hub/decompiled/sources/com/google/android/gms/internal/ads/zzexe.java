package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexe implements zzeuy {
    final zzgbl zza;
    final Context zzb;
    final zzaye zzc;

    public zzexe(zzaye zzayeVar, zzgbl zzgblVar, Context context) {
        this.zzc = zzayeVar;
        this.zza = zzgblVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzexf(new JSONObject());
            }
        });
    }
}
