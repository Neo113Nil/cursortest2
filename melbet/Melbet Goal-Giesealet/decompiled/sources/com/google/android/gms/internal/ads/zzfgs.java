package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfgs {
    public static final zzfgy zza(ListenableFuture listenableFuture, Object obj, zzfgz zzfgzVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfgz.zza;
        return new zzfgy(zzfgzVar, obj, null, listenableFuture2, Collections.emptyList(), listenableFuture, null);
    }

    public static final zzfgy zzb(Callable callable, Object obj, zzfgz zzfgzVar) {
        return zzc(callable, zzfgzVar.zze(), obj, zzfgzVar);
    }

    public static final zzfgy zzc(Callable callable, zzgpd zzgpdVar, Object obj, zzfgz zzfgzVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfgz.zza;
        return new zzfgy(zzfgzVar, obj, null, listenableFuture, Collections.emptyList(), zzgpdVar.submit(callable), null);
    }

    public static final zzfgy zzd(final zzfgn zzfgnVar, zzgpd zzgpdVar, Object obj, zzfgz zzfgzVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfgn.this.zza();
                return null;
            }
        }, zzgpdVar, obj, zzfgzVar);
    }
}
