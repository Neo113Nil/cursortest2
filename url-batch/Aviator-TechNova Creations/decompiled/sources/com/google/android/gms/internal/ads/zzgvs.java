package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgvs extends zzgvr {
    final /* synthetic */ zzgvt zza;

    zzgvs(zzgvt zzgvtVar, int i) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public final zzgva zza() {
        return new zzgvv(this.zza.zza(), new zzgvq(2));
    }
}
