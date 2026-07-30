package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgny implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgoa zza;

    zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            if (z) {
                zzgoaVar.zzg(System.currentTimeMillis());
                zzgoaVar.zzj(true);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zzgoaVar.zzh() > 0 && currentTimeMillis >= zzgoaVar.zzh()) {
                    zzgoaVar.zzi(currentTimeMillis - zzgoaVar.zzh());
                }
                zzgoaVar.zzj(false);
            }
        }
    }
}
