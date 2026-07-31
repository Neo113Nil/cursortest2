package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzic implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhn zzc;

    zzic(zzhn zzhnVar, zzbd zzbdVar, String str) {
        this.zza = zzbdVar;
        this.zzb = str;
        this.zzc = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzc.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzc.zza;
        zzncVar2.zza(this.zza, this.zzb);
    }
}
