package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzesy implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final int zzc;

    zzesy(zzgzy zzgzyVar, zzfjk zzfjkVar, zzfka zzfkaVar, int i) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzesy.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 5;
    }

    final /* synthetic */ zzesz zzc() {
        List asList;
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhW)).booleanValue()) {
            zzfjk zzfjkVar = this.zzb;
            if (this.zzc != 2) {
                String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhY)).booleanValue()) {
                    asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhZ)).split(","));
                } else {
                    asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(","));
                }
                if (asList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(zzc))) {
                    str = zzfka.zza();
                }
            }
        }
        return new zzesz(str);
    }
}
