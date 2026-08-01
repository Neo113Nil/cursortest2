package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzemr implements zzeob {
    final /* synthetic */ zzems zza;

    zzemr(zzems zzemsVar) {
        this.zza = zzemsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeob
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrp zzcrpVar;
        zzcrp zzcrpVar2;
        zzcrp zzcrpVar3;
        zzcrp zzcrpVar4 = (zzcrp) obj;
        synchronized (this.zza) {
            zzems zzemsVar = this.zza;
            zzcrpVar = zzemsVar.zzi;
            if (zzcrpVar != null) {
                zzcrpVar3 = zzemsVar.zzi;
                zzcrpVar3.zzb();
            }
            this.zza.zzi = zzcrpVar4;
            zzcrpVar2 = this.zza.zzi;
            zzcrpVar2.zzj();
        }
    }
}
