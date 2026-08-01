package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzccy implements Runnable {
    final /* synthetic */ zzcda zza;

    zzccy(zzcda zzcdaVar) {
        this.zza = zzcdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdb zzcdbVar;
        boolean z;
        zzcdb zzcdbVar2;
        zzcdb zzcdbVar3;
        zzcda zzcdaVar = this.zza;
        zzcdbVar = zzcdaVar.zzq;
        if (zzcdbVar != null) {
            z = zzcdaVar.zzr;
            if (!z) {
                zzcdbVar3 = zzcdaVar.zzq;
                zzcdbVar3.zzg();
                this.zza.zzr = true;
            }
            zzcdbVar2 = this.zza.zzq;
            zzcdbVar2.zze();
        }
    }
}
