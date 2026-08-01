package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcoo implements zzcof {
    private final zzeft zza;

    zzcoo(zzeft zzeftVar) {
        this.zza = zzeftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjJ)).booleanValue()) {
            zzgbb.zzf(zzgas.zzu(this.zza.zza(true)), Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzcon
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zzgbb.zzh(new GetTopicsResponse(zzfwu.zzl()));
                }
            }, zzcca.zza);
        }
    }
}
