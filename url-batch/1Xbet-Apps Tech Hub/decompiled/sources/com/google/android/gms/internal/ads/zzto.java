package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzto implements zzwa {
    public final zzwa zza;
    final /* synthetic */ zztp zzb;
    private boolean zzc;

    public zzto(zztp zztpVar, zzwa zzwaVar) {
        this.zzb = zztpVar;
        this.zza = zzwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzkv zzkvVar, zzib zzibVar, int i) {
        zztp zztpVar = this.zzb;
        if (zztpVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzibVar.zzc(4);
            return -4;
        }
        long zzb = zztpVar.zzb();
        int zza = this.zza.zza(zzkvVar, zzibVar, i);
        if (zza != -5) {
            long j = this.zzb.zzb;
            if (j == Long.MIN_VALUE || ((zza != -4 || zzibVar.zze < j) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzibVar.zzd))) {
                return zza;
            }
            zzibVar.zzb();
            zzibVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzam zzamVar = zzkvVar.zza;
        zzamVar.getClass();
        int i2 = zzamVar.zzC;
        if (i2 == 0) {
            if (zzamVar.zzD != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzamVar.zzD : 0;
        zzak zzb2 = zzamVar.zzb();
        zzb2.zzE(i2);
        zzb2.zzF(i3);
        zzkvVar.zza = zzb2.zzac();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
