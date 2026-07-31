package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzkt implements Runnable {
    private final /* synthetic */ zzks zza;

    zzkt(zzks zzksVar) {
        this.zza = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzks zzksVar = this.zza;
        zzkpVar = zzksVar.zzh;
        zzksVar.zza = zzkpVar;
    }
}
