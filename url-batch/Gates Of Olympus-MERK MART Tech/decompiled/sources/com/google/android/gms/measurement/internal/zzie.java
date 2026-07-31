package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzie implements Runnable {
    private final /* synthetic */ zzno zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhn zzc;

    zzie(zzhn zzhnVar, zzno zznoVar, zzo zzoVar) {
        this.zza = zznoVar;
        this.zzb = zzoVar;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zznc zzncVar3;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        if (this.zza.zza() == null) {
            zzncVar3 = this.zzc.zza;
            zzncVar3.zza(this.zza.zza, this.zzb);
        } else {
            zzncVar2 = this.zzc.zza;
            zzncVar2.zza(this.zza, this.zzb);
        }
    }
}
