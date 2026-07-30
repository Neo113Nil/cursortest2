package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzewz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzewz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzewz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewz(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzh;
        zzexx zzb = ((zzexz) this.zza).zzb();
        Context zza = ((zzcmj) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(zza)) {
                zzh = zzgup.zzi(zzb);
                zziko.zzb(zzh);
                return zzh;
            }
        }
        zzh = zzgup.zzh();
        zziko.zzb(zzh);
        return zzh;
    }
}
