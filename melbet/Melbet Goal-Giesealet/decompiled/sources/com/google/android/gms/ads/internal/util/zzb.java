package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbzh;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzbzh.zza.submit(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
