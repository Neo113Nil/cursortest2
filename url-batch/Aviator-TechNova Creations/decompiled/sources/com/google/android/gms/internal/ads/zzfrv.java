package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfrv implements Runnable {
    final /* synthetic */ zzfsa zza;

    zzfrv(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zza;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzI = zzfsaVar.zzI();
            Clock zzJ = zzfsaVar.zzJ();
            zzI.zzj(zzJ.currentTimeMillis(), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzH());
        }
    }
}
