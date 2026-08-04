package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzwm implements zzwf {
    private final zzwf zza;
    private final long zzb;

    public zzwm(zzwf zzwfVar, long j) {
        this.zza = zzwfVar;
        this.zzb = j;
    }

    public final zzwf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zzd(zzkh zzkhVar, zzhg zzhgVar, int i) {
        int zzd = this.zza.zzd(zzkhVar, zzhgVar, i);
        if (zzd != -4) {
            return zzd;
        }
        zzhgVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j) {
        return this.zza.zze(j - this.zzb);
    }
}
