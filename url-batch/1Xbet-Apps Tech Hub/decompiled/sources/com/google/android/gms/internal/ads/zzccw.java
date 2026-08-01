package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzccw implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcda zzc;

    zzccw(zzcda zzcdaVar, int i, int i2) {
        this.zzc = zzcdaVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdb zzcdbVar;
        zzcdb zzcdbVar2;
        zzcda zzcdaVar = this.zzc;
        zzcdbVar = zzcdaVar.zzq;
        if (zzcdbVar != null) {
            int i = this.zza;
            int i2 = this.zzb;
            zzcdbVar2 = zzcdaVar.zzq;
            zzcdbVar2.zzj(i, i2);
        }
    }
}
