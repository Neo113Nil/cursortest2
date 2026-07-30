package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzxr extends zzvy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxr(zzxu zzxuVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
