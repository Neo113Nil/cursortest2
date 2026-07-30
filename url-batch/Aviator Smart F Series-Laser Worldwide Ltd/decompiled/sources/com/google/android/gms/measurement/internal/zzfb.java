package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzfb implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfc zzb;

    zzfb(zzfc zzfcVar, boolean z7) {
        this.zzb = zzfcVar;
        this.zza = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlgVar = this.zzb.zzb;
        zzlgVar.zzJ(this.zza);
    }
}
