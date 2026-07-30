package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzevg implements zzfax {
    private final zzffr zza;

    zzevg(zzffr zzffrVar) {
        this.zza = zzffrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        zzffr zzffrVar = this.zza;
        if (zzffrVar == null) {
            return zzgzo.zza(new zzevf(null));
        }
        String zza = zzffrVar.zza();
        return Strings.isEmptyOrWhitespace(zza) ? zzgzo.zza(new zzevf(null)) : zzgzo.zza(new zzevf(zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 15;
    }
}
