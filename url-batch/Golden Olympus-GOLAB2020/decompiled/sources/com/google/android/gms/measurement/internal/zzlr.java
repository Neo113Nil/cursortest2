package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzlr implements Runnable {
    final /* synthetic */ zzjx zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzlw zzd;

    zzlr(zzlw zzlwVar, zzjx zzjxVar, long j4, boolean z4) {
        this.zza = zzjxVar;
        this.zzb = j4;
        this.zzc = z4;
        this.zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.zzd;
        zzjx zzjxVar = this.zza;
        zzlwVar.zzaj(zzjxVar);
        zzlw.zzD(zzlwVar, zzjxVar, this.zzb, true, this.zzc);
    }
}
