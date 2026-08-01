package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejy {
    private zzejp zza;

    zzejy() {
    }

    private zzejy(zzejp zzejpVar) {
        this.zza = zzejpVar;
    }

    public static zzejy zzb(zzejp zzejpVar) {
        return new zzejy(zzejpVar);
    }

    public final zzejp zza(Clock clock, zzejr zzejrVar, zzega zzegaVar, zzfla zzflaVar) {
        zzejp zzejpVar = this.zza;
        return zzejpVar != null ? zzejpVar : new zzejp(clock, zzejrVar, zzegaVar, zzflaVar);
    }
}
