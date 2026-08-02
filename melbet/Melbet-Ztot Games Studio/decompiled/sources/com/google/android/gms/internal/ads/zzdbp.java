package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdbp implements zzczo {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaX)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlS)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzdo(zzfex zzfexVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaY)).booleanValue()) {
            try {
                zzfeo zzfeoVar = zzfexVar.zzb.zzb;
                this.zza = zzfeoVar.zzc;
                this.zzb = zzfeoVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }
}
