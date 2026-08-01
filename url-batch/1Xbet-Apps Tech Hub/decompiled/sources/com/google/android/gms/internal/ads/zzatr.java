package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzatr implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzats zza;

    zzatr(zzats zzatsVar) {
        this.zza = zzatsVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzats zzatsVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzatsVar.zzc;
        if (j > 0) {
            zzats zzatsVar2 = this.zza;
            j2 = zzatsVar2.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzatsVar2.zzc;
                zzatsVar2.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
