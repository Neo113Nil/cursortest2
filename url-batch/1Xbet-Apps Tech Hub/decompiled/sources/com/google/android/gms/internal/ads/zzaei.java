package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaei extends zzabq {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaei(final zzacr zzacrVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzacrVar.zzc));
        long j3;
        zzabn zzabnVar = new zzabn() { // from class: com.google.android.gms.internal.ads.zzaef
            @Override // com.google.android.gms.internal.ads.zzabn
            public final long zza(long j4) {
                return zzacr.this.zzb(j4);
            }
        };
        zzaeh zzaehVar = new zzaeh(zzacrVar, i, null);
        long zza = zzacrVar.zza();
        long j4 = zzacrVar.zzj;
        int i2 = zzacrVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzacrVar.zzc) / 2) + 1;
        } else {
            int i3 = zzacrVar.zza;
            long j5 = 4096;
            if (i3 == zzacrVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzacrVar.zzg) * zzacrVar.zzh) / 8) + 64;
        }
    }
}
