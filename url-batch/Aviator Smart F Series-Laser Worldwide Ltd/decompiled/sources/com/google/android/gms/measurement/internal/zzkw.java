package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzkw implements Runnable {
    final /* synthetic */ zzlh zza;
    final /* synthetic */ zzlg zzb;

    zzkw(zzlg zzlgVar, zzlh zzlhVar) {
        this.zzb = zzlgVar;
        this.zza = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
