package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgcj implements zzgcd {
    private final int zza;
    private final byte[] zzb;

    zzgcj(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
