package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzany implements zzanx {
    private final zzacx zza;
    private final zzaeb zzb;
    private final zzaob zzc;
    private final zzu zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzany(zzacx zzacxVar, zzaeb zzaebVar, zzaob zzaobVar, String str, int i) throws zzas {
        this.zza = zzacxVar;
        this.zzb = zzaebVar;
        this.zzc = zzaobVar;
        int i2 = zzaobVar.zzb * zzaobVar.zze;
        int i3 = zzaobVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw zzas.zzb(sb.toString(), null);
        }
        int i5 = zzaobVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzs zzsVar = new zzs();
        zzsVar.zzl("audio/wav");
        zzsVar.zzm(str);
        zzsVar.zzh(i6);
        zzsVar.zzi(i6);
        zzsVar.zzn(max);
        zzsVar.zzE(zzaobVar.zzb);
        zzsVar.zzF(zzaobVar.zzc);
        zzsVar.zzG(i);
        this.zzd = zzsVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(int i, long j) {
        this.zza.zzw(new zzaoe(this.zzc, 1, i, j));
        this.zzb.zzu(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final boolean zzc(zzacv zzacvVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zzy = this.zzb.zzy(zzacvVar, (int) Math.min(i2 - i, j2), true);
            if (zzy == -1) {
                j2 = 0;
            } else {
                this.zzg += zzy;
                j2 -= zzy;
            }
        }
        zzaob zzaobVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaobVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long zzt = this.zzf + zzeo.zzt(this.zzh, 1000000L, zzaobVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzx(zzt, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
