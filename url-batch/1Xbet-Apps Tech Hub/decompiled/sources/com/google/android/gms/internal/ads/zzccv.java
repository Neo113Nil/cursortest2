package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzccv implements Runnable {
    final /* synthetic */ zzcda zza;

    zzccv(zzcda zzcdaVar) {
        this.zza = zzcdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdb zzcdbVar;
        zzcdb zzcdbVar2;
        zzcda zzcdaVar = this.zza;
        zzcdbVar = zzcdaVar.zzq;
        if (zzcdbVar != null) {
            zzcdbVar2 = zzcdaVar.zzq;
            zzcdbVar2.zzh();
        }
    }
}
