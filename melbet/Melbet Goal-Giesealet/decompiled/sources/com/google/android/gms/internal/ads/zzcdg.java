package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcdg implements zzga {
    private final zzga zza;
    private final long zzb;
    private final zzga zzc;
    private long zzd;
    private Uri zze;

    zzcdg(zzga zzgaVar, int i, zzga zzgaVar2) {
        this.zza = zzgaVar;
        this.zzb = i;
        this.zzc = zzgaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzi
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
        if (j < j2) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza2;
        this.zzd += zza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Uri uri;
        zzge zzgeVar2;
        Uri uri2 = zzgeVar.zza;
        this.zze = uri2;
        long j = zzgeVar.zze;
        long j2 = this.zzb;
        zzge zzgeVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzgeVar2 = null;
        } else {
            long j3 = zzgeVar.zzf;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            uri = uri2;
            zzgeVar2 = new zzge(uri, j, j4, null);
        }
        long j5 = zzgeVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzgeVar3 = new zzge(uri, Math.max(j2, j), j5 != -1 ? Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long zzb = zzgeVar2 != null ? this.zza.zzb(zzgeVar2) : 0L;
        long zzb2 = zzgeVar3 != null ? this.zzc.zzb(zzgeVar3) : 0L;
        this.zzd = j;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        return zzgkc.zza();
    }
}
