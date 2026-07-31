package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzhv implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzhn zzb;

    zzhv(zzhn zzhnVar, zzae zzaeVar) {
        this.zza = zzaeVar;
        this.zzb = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zznc zzncVar3;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        if (this.zza.zzc.zza() == null) {
            zzncVar3 = this.zzb.zza;
            zzncVar3.zza(this.zza);
        } else {
            zzncVar2 = this.zzb.zza;
            zzncVar2.zzb(this.zza);
        }
    }
}
