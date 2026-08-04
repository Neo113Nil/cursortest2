package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgdu implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgdw zza;

    zzgdu(zzgdw zzgdwVar) {
        Objects.requireNonNull(zzgdwVar);
        this.zza = zzgdwVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgdw zzgdwVar = this.zza;
        synchronized (zzgdwVar) {
            if (z) {
                zzgdwVar.zzg(System.currentTimeMillis());
                zzgdwVar.zzj(true);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zzgdwVar.zzh() > 0 && currentTimeMillis >= zzgdwVar.zzh()) {
                    zzgdwVar.zzi(currentTimeMillis - zzgdwVar.zzh());
                }
                zzgdwVar.zzj(false);
            }
        }
    }
}
