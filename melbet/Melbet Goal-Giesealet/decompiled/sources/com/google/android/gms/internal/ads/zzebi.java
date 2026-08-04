package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzebi implements zzcxg, zzcvv {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzebs zzd;

    public zzebi(zzebs zzebsVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzebsVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgG)).intValue();
            }
            if (i < intValue) {
                this.zzd.zza(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzb(true);
    }
}
