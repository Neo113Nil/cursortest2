package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzxe extends zzafj {
    final /* synthetic */ zzxq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxe(zzxq zzxqVar, zzafy zzafyVar) {
        super(zzafyVar);
        Objects.requireNonNull(zzxqVar);
        this.zza = zzxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zzQ();
    }
}
