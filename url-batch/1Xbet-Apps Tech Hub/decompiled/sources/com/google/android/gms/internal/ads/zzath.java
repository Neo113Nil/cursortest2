package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzath implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzatj zzb;

    zzath(zzatj zzatjVar, int i, boolean z) {
        this.zzb = zzatjVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqd zzaqdVar;
        int i = this.zza;
        zzatj zzatjVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzatjVar.zza.getPackageManager().getPackageInfo(zzatjVar.zza.getPackageName(), 0);
            Context context = zzatjVar.zza;
            zzaqdVar = zzfob.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaqdVar = null;
        }
        this.zzb.zzm = zzaqdVar;
        if (this.zza < 4) {
            if (zzaqdVar != null && zzaqdVar.zzaj() && !zzaqdVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaqdVar.zzak() && zzaqdVar.zzf().zze() && zzaqdVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
