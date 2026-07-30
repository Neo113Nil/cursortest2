package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzqo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzhx implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzij zzb;

    zzhx(zzij zzijVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzijVar;
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
        zzko zzu = this.zzb.zzt.zzu();
        zzqo.zzc();
        if (!zzu.zzt.zzf().zzs(null, zzeh.zzau)) {
            zzu.zzt.zzaA().zzl().zza("getSessionId has been disabled.");
        } else if (!zzu.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
            zzu.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get session id");
        } else if (!zzu.zzt.zzm().zzk(zzu.zzt.zzax().currentTimeMillis()) && zzu.zzt.zzm().zzk.zza() != 0) {
            l = Long.valueOf(zzu.zzt.zzm().zzk.zza());
            if (l == null) {
                this.zzb.zzt.zzv().zzV(this.zza, l.longValue());
                return;
            }
            try {
                this.zza.zze(null);
                return;
            } catch (RemoteException e) {
                this.zzb.zzt.zzaA().zzd().zzb("getSessionId failed with exception", e);
                return;
            }
        }
        l = null;
        if (l == null) {
        }
    }
}
