package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzent implements zzeob {
    final /* synthetic */ zzenu zza;

    zzent(zzenu zzenuVar) {
        this.zza = zzenuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdgx zzdgxVar;
        zzdgx zzdgxVar2 = (zzdgx) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdgxVar2;
            zzdgxVar = this.zza.zzj;
            zzdgxVar.zzj();
        }
    }
}
