package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfdk implements zzeob {
    final /* synthetic */ zzfdl zza;

    zzfdk(zzfdl zzfdlVar) {
        this.zza = zzfdlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpy zzdpyVar;
        zzfei zzfeiVar;
        synchronized (this.zza) {
            this.zza.zzi = (zzdpy) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdo)).booleanValue()) {
                zzfej zzd = ((zzdpy) obj).zzd();
                zzfeiVar = this.zza.zzd;
                zzd.zza = zzfeiVar;
            }
            zzdpyVar = this.zza.zzi;
            zzdpyVar.zzj();
        }
    }
}
