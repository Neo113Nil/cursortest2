package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfnd {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfnd(zzfnm zzfnmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfnl zza(Callable callable) {
        List list = this.zzc;
        zzgzn zzp = zzgzo.zzp(list);
        ListenableFuture zza = zzp.zza(zzfnc.zza, zzcei.zzg);
        zzfnm zzfnmVar = this.zza;
        return new zzfnl(zzfnmVar, this.zzb, null, zza, list, zzp.zza(callable, zzfnmVar.zze()), null);
    }
}
