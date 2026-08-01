package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzewp implements zzeuy {
    private final Context zza;
    private final String zzb;
    private final zzgbl zzc;

    public zzewp(zzbwc zzbwcVar, Context context, String str, zzgbl zzgblVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewq(new JSONObject());
            }
        });
    }
}
