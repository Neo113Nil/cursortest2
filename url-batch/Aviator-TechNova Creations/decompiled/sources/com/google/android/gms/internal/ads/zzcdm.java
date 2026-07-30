package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcdm {
    public final ListenableFuture zza(Context context, int i) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
            zzcei.zza.execute(new zzcdl(this, context, zzcenVar));
        }
        return zzcenVar;
    }
}
