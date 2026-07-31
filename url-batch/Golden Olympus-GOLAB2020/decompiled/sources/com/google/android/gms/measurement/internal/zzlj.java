package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzlj implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ zzlw zzb;

    zzlj(zzlw zzlwVar, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = zzcyVar;
        this.zzb = zzlwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long valueOf;
        zzlw zzlwVar = this.zzb;
        zzio zzioVar = zzlwVar.zzu.zzv().zzu;
        if (!zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
            zzioVar.zzaW().zzl().zza("Analytics storage consent denied; will not get session id");
        } else if (!zzioVar.zzm().zzp(zzioVar.zzaU().currentTimeMillis()) && zzioVar.zzm().zzl.zza() != 0) {
            valueOf = Long.valueOf(zzioVar.zzm().zzl.zza());
            if (valueOf == null) {
                zzlwVar.zzu.zzw().zzY(this.zza, valueOf.longValue());
                return;
            } else {
                try {
                    this.zza.zze(null);
                    return;
                } catch (RemoteException e4) {
                    this.zzb.zzu.zzaW().zze().zzb("getSessionId failed with exception", e4);
                    return;
                }
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }
}
