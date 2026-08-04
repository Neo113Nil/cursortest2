package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzens implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;
    private final zzbyz zzc;

    public zzens(zzgpd zzgpdVar, zzfdc zzfdcVar, zzbyz zzbyzVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
        this.zzc = zzbyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzens.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 9;
    }

    final /* synthetic */ zzent zzc() {
        return new zzent(this.zzb.zzk, this.zzc.zzl());
    }
}
