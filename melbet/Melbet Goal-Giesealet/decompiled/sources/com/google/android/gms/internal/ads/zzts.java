package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzts implements zzwf {
    public final zzwf zza;
    final /* synthetic */ zztt zzb;
    private boolean zzc;

    public zzts(zztt zzttVar, zzwf zzwfVar) {
        Objects.requireNonNull(zzttVar);
        this.zzb = zzttVar;
        this.zza = zzwfVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zzd(zzkh zzkhVar, zzhg zzhgVar, int i) {
        zztt zzttVar = this.zzb;
        if (zzttVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzhgVar.zzg(4);
            return -4;
        }
        long zzi = zzttVar.zzi();
        int zzd = this.zza.zzd(zzkhVar, zzhgVar, i);
        if (zzd != -5) {
            long j = zzttVar.zzb;
            if (j == Long.MIN_VALUE || ((zzd != -4 || zzhgVar.zze < j) && !(zzd == -3 && zzi == Long.MIN_VALUE && !zzhgVar.zzd))) {
                return zzd;
            }
            zzhgVar.zza();
            zzhgVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        int i2 = zzuVar.zzJ;
        if (i2 == 0) {
            if (zzuVar.zzK != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = zzttVar.zzb == Long.MIN_VALUE ? zzuVar.zzK : 0;
        zzs zza = zzuVar.zza();
        zza.zzH(i2);
        zza.zzI(i3);
        zzkhVar.zzb = zza.zzM();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
