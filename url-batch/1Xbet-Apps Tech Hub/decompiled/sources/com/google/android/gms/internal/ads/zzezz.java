package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzezz implements zzeob {
    final /* synthetic */ zzfaa zza;

    zzezz(zzfaa zzfaaVar) {
        this.zza = zzfaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezs zzezsVar;
        zzezs zzezsVar2;
        zzdtp zzdtpVar;
        zzcrj zzcrjVar = (zzcrj) obj;
        synchronized (this.zza) {
            zzcrj zzcrjVar2 = this.zza.zza;
            if (zzcrjVar2 != null) {
                zzcrjVar2.zzb();
            }
            zzfaa zzfaaVar = this.zza;
            zzfaaVar.zza = zzcrjVar;
            zzcrjVar.zzc(zzfaaVar);
            zzfaa zzfaaVar2 = this.zza;
            zzezsVar = zzfaaVar2.zzg;
            zzezsVar2 = zzfaaVar2.zzg;
            zzdtpVar = zzfaaVar2.zzi;
            zzezsVar.zzk(new zzcrk(zzcrjVar, zzfaaVar2, zzezsVar2, zzdtpVar));
            zzcrjVar.zzj();
        }
    }
}
