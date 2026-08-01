package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzedk implements zzczv, zzcyk {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzedu zzd;

    public zzedk(zzedu zzeduVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeduVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue() && !this.zzc.zzQ()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgj)).intValue();
            }
            if (i < intValue) {
                this.zzd.zzd(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzb(true);
    }
}
