package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcfw implements zzgq {
    private final zzgq zza;
    private final long zzb;
    private final zzgq zzc;
    private long zzd;
    private Uri zze;

    zzcfw(zzgq zzgqVar, int i, zzgq zzgqVar2) {
        this.zza = zzgqVar;
        this.zzb = i;
        this.zzc = zzgqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza2;
        this.zzd += zza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) throws IOException {
        zzgv zzgvVar2;
        this.zze = zzgvVar.zza;
        long j = this.zzb;
        long j2 = zzgvVar.zzf;
        zzgv zzgvVar3 = null;
        if (j2 >= j) {
            zzgvVar2 = null;
        } else {
            long j3 = zzgvVar.zzg;
            long j4 = j - j2;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            zzgvVar2 = new zzgv(zzgvVar.zza, null, j2, j2, j4, null, 0);
        }
        long j5 = zzgvVar.zzg;
        if (j5 == -1 || zzgvVar.zzf + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzgvVar.zzf);
            long j6 = zzgvVar.zzg;
            zzgvVar3 = new zzgv(zzgvVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzgvVar.zzf + j6) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzgvVar2 != null ? this.zza.zzb(zzgvVar2) : 0L;
        long zzb2 = zzgvVar3 != null ? this.zzc.zzb(zzgvVar3) : 0L;
        this.zzd = zzgvVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Map zze() {
        return zzfwx.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
    }
}
