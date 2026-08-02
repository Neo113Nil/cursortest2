package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaen extends zzabu {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaen(final zzacv zzacvVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzacvVar.zzc));
        long j3;
        Objects.requireNonNull(zzacvVar);
        zzabr zzabrVar = new zzabr() { // from class: com.google.android.gms.internal.ads.zzaek
            @Override // com.google.android.gms.internal.ads.zzabr
            public final long zza(long j4) {
                return zzacv.this.zzb(j4);
            }
        };
        zzaem zzaemVar = new zzaem(zzacvVar, i, null);
        long zza = zzacvVar.zza();
        long j4 = zzacvVar.zzj;
        int i2 = zzacvVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzacvVar.zzc) / 2) + 1;
        } else {
            int i3 = zzacvVar.zza;
            long j5 = 4096;
            if (i3 == zzacvVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzacvVar.zzg) * zzacvVar.zzh) / 8) + 64;
        }
    }
}
