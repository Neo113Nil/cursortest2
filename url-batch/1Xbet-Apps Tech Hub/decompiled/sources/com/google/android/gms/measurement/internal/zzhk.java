package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzpa;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes2.dex */
final class zzhk implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzhx zzb;

    zzhk(zzhx zzhxVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzhxVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l;
        zzkc zzu = this.zzb.zzt.zzu();
        zzpa.zzc();
        if (!zzu.zzt.zzf().zzs(null, zzdu.zzau)) {
            zzu.zzt.zzay().zzl().zza("getSessionId has been disabled.");
        } else if (!zzu.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            zzu.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get session id");
        } else if (!zzu.zzt.zzm().zzk(zzu.zzt.zzav().currentTimeMillis()) && zzu.zzt.zzm().zzk.zza() != 0) {
            l = Long.valueOf(zzu.zzt.zzm().zzk.zza());
            if (l == null) {
                this.zzb.zzt.zzv().zzU(this.zza, l.longValue());
                return;
            }
            try {
                this.zza.zze(null);
                return;
            } catch (RemoteException e) {
                this.zzb.zzt.zzay().zzd().zzb("getSessionId failed with exception", e);
                return;
            }
        }
        l = null;
        if (l == null) {
        }
    }
}
