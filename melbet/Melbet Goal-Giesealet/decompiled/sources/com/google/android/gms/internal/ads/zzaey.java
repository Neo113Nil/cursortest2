package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaey extends zzacg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaey(final zzadh zzadhVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r5, Math.max(6, zzadhVar.zzc));
        long j3;
        Objects.requireNonNull(zzadhVar);
        zzacd zzacdVar = new zzacd() { // from class: com.google.android.gms.internal.ads.zzaew
            @Override // com.google.android.gms.internal.ads.zzacd
            public final /* synthetic */ long zza(long j4) {
                return zzadh.this.zzb(j4);
            }
        };
        zzaex zzaexVar = new zzaex(zzadhVar, i, null);
        long zza = zzadhVar.zza();
        long j4 = zzadhVar.zzj;
        int i2 = zzadhVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzadhVar.zzc) / 2) + 1;
        } else {
            int i3 = zzadhVar.zza;
            long j5 = 4096;
            if (i3 == zzadhVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * zzadhVar.zzg) * zzadhVar.zzh) / 8);
        }
    }
}
