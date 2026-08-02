package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfiv {
    public static final zzfjc zza(Callable callable, Object obj, zzfjd zzfjdVar) {
        zzgcu zzgcuVar;
        zzgcuVar = zzfjdVar.zzb;
        return zzb(callable, zzgcuVar, obj, zzfjdVar);
    }

    public static final zzfjc zzb(Callable callable, zzgcu zzgcuVar, Object obj, zzfjd zzfjdVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfjd.zza;
        return new zzfjc(zzfjdVar, obj, listenableFuture, Collections.emptyList(), zzgcuVar.zzb(callable));
    }

    public static final zzfjc zzc(ListenableFuture listenableFuture, Object obj, zzfjd zzfjdVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfjd.zza;
        return new zzfjc(zzfjdVar, obj, listenableFuture2, Collections.emptyList(), listenableFuture);
    }

    public static final zzfjc zzd(final zzfip zzfipVar, zzgcu zzgcuVar, Object obj, zzfjd zzfjdVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfiu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfip.this.zza();
                return null;
            }
        }, zzgcuVar, obj, zzfjdVar);
    }
}
