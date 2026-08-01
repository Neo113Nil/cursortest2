package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfim {
    private static final ListenableFuture zza = zzgbb.zzh(null);
    private final zzgbl zzb;
    private final ScheduledExecutorService zzc;
    private final zzfin zzd;

    public zzfim(zzgbl zzgblVar, ScheduledExecutorService scheduledExecutorService, zzfin zzfinVar) {
        this.zzb = zzgblVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfinVar;
    }

    public final zzfic zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfic(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public final zzfil zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzfil(this, obj, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract String zzf(Object obj);
}
