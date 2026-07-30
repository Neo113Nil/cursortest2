package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzezu implements zzfax {
    private final String zza;
    private final int zzb;

    zzezu(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzezv(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 31;
    }
}
