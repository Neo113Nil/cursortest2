package com.google.android.gms.measurement.internal;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
final class zzhb implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzhe zzf;

    zzhb(zzhe zzheVar, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i4;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        long j4;
        char c5;
        long j5;
        zzhe zzheVar = this.zzf;
        zzht zzm = zzheVar.zzu.zzm();
        if (!zzm.zzy()) {
            Log.println(6, zzheVar.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c4 = zzheVar.zza;
        if (c4 == 0) {
            zzio zzioVar = zzheVar.zzu;
            if (zzioVar.zzf().zzD()) {
                zzioVar.zzaV();
                zzheVar.zza = 'C';
            } else {
                zzioVar.zzaV();
                zzheVar.zza = 'c';
            }
        }
        j4 = zzheVar.zzb;
        if (j4 < 0) {
            zzheVar.zzu.zzf().zzj();
            zzheVar.zzb = 119002L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        c5 = zzheVar.zza;
        j5 = zzheVar.zzb;
        String str = this.zzb;
        String str2 = "2" + charAt + c5 + j5 + StringUtils.PROCESS_POSTFIX_DELIMITER + zzhe.zzo(true, str, this.zzc, this.zzd, this.zze);
        if (str2.length() > 1024) {
            str2 = str.substring(0, 1024);
        }
        zzhq zzhqVar = zzm.zzb;
        if (zzhqVar != null) {
            zzhqVar.zzb(str2, 1L);
        }
    }
}
