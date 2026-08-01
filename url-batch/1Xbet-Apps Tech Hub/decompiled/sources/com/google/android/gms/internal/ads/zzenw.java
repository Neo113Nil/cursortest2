package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzenw implements zzeob {
    final /* synthetic */ zzenx zza;

    zzenw(zzenx zzenxVar) {
        this.zza = zzenxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzctr) obj).zzl();
            ((zzctr) obj).zzj();
        }
    }
}
