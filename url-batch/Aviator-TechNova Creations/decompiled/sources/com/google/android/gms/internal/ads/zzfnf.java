package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfnf {
    public static final zzfnl zza(ListenableFuture listenableFuture, Object obj, zzfnm zzfnmVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfnm.zza;
        return new zzfnl(zzfnmVar, obj, null, listenableFuture2, Collections.emptyList(), listenableFuture, null);
    }

    public static final zzfnl zzb(Callable callable, Object obj, zzfnm zzfnmVar) {
        return zzc(callable, zzfnmVar.zze(), obj, zzfnmVar);
    }

    public static final zzfnl zzc(Callable callable, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfnm.zza;
        return new zzfnl(zzfnmVar, obj, null, listenableFuture, Collections.emptyList(), zzgzyVar.submit(callable), null);
    }

    public static final zzfnl zzd(final zzfna zzfnaVar, zzgzy zzgzyVar, Object obj, zzfnm zzfnmVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfne
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfna.this.zza();
                return null;
            }
        }, zzgzyVar, obj, zzfnmVar);
    }
}
