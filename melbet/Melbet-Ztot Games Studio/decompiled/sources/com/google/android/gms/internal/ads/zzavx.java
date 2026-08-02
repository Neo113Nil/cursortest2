package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzavx implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzavy zza;

    zzavx(zzavy zzavyVar) {
        this.zza = zzavyVar;
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
        zzavy zzavyVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzavyVar.zzc;
        if (j > 0) {
            zzavy zzavyVar2 = this.zza;
            j2 = zzavyVar2.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzavyVar2.zzc;
                zzavyVar2.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
