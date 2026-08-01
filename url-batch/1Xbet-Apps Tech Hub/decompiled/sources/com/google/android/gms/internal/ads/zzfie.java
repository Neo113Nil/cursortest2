package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfie {
    public static final zzfil zza(Callable callable, Object obj, zzfim zzfimVar) {
        zzgbl zzgblVar;
        zzgblVar = zzfimVar.zzb;
        return zzb(callable, zzgblVar, obj, zzfimVar);
    }

    public static final zzfil zzb(Callable callable, zzgbl zzgblVar, Object obj, zzfim zzfimVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfim.zza;
        return new zzfil(zzfimVar, obj, listenableFuture, Collections.emptyList(), zzgblVar.zzb(callable));
    }

    public static final zzfil zzc(ListenableFuture listenableFuture, Object obj, zzfim zzfimVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfim.zza;
        return new zzfil(zzfimVar, obj, listenableFuture2, Collections.emptyList(), listenableFuture);
    }

    public static final zzfil zzd(final zzfhy zzfhyVar, zzgbl zzgblVar, Object obj, zzfim zzfimVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfhy.this.zza();
                return null;
            }
        }, zzgblVar, obj, zzfimVar);
    }
}
