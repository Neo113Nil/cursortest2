package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzyj implements zzyc {
    private final zzyc zza;
    private final long zzb;

    public zzyj(zzyc zzycVar, long j) {
        this.zza = zzycVar;
        this.zzb = j;
    }

    public final zzyc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i) {
        int zzd = this.zza.zzd(zzlhVar, zzihVar, i);
        if (zzd != -4) {
            return zzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
