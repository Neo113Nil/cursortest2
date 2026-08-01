package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzelg implements zzczq {
    boolean zza = false;
    final /* synthetic */ zzefy zzb;
    final /* synthetic */ zzccf zzc;
    final /* synthetic */ zzelh zzd;

    zzelg(zzelh zzelhVar, zzefy zzefyVar, zzccf zzccfVar) {
        this.zzd = zzelhVar;
        this.zzb = zzefyVar;
        this.zzc = zzccfVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfr)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzefz(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzczq
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzelh.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczq
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczq
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzelh.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzczq
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
