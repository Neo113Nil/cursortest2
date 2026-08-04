package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzdxd implements zzgob {
    static final /* synthetic */ zzdxd zza = new zzdxd();

    private /* synthetic */ zzdxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        Throwable th = executionException;
        if (cause != null) {
            th = executionException.getCause();
        }
        return zzgot.zzc(th);
    }
}
