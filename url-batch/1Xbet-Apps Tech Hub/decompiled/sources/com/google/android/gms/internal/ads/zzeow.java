package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeow implements zzeuy {
    private final zzgbl zza;
    private final zzfeq zzb;
    private final zzffd zzc;

    zzeow(zzgbl zzgblVar, zzfeq zzfeqVar, zzffd zzffdVar) {
        this.zza = zzgblVar;
        this.zzb = zzfeqVar;
        this.zzc = zzffdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeow.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeox zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhi)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzffd.zza();
        }
        return new zzeox(str);
    }
}
