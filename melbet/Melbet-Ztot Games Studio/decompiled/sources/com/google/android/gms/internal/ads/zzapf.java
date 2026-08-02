package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzapf implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaph zzc;

    zzapf(zzaph zzaphVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaps zzapsVar;
        zzaps zzapsVar2;
        zzapsVar = this.zzc.zza;
        zzapsVar.zza(this.zza, this.zzb);
        zzaph zzaphVar = this.zzc;
        zzapsVar2 = zzaphVar.zza;
        zzapsVar2.zzb(zzaphVar.toString());
    }
}
