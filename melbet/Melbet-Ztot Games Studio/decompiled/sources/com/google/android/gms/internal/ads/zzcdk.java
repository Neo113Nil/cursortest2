package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzcdk implements zzfs {
    private final zzfs zza;
    private final long zzb;
    private final zzfs zzc;
    private long zzd;
    private Uri zze;

    zzcdk(zzfs zzfsVar, int i, zzfs zzfsVar2) {
        this.zza = zzfsVar;
        this.zzb = i;
        this.zzc = zzfsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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

    @Override // com.google.android.gms.internal.ads.zzfs
    public final long zzb(zzfy zzfyVar) throws IOException {
        zzfy zzfyVar2;
        this.zze = zzfyVar.zza;
        long j = zzfyVar.zze;
        long j2 = this.zzb;
        zzfy zzfyVar3 = null;
        if (j >= j2) {
            zzfyVar2 = null;
        } else {
            long j3 = zzfyVar.zzf;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            zzfyVar2 = new zzfy(zzfyVar.zza, j, j4, null);
        }
        long j5 = zzfyVar.zzf;
        if (j5 == -1 || zzfyVar.zze + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzfyVar.zze);
            long j6 = zzfyVar.zzf;
            zzfyVar3 = new zzfy(zzfyVar.zza, max, j6 != -1 ? Math.min(j6, (zzfyVar.zze + j6) - this.zzb) : -1L, null);
        }
        long zzb = zzfyVar2 != null ? this.zza.zzb(zzfyVar2) : 0L;
        long zzb2 = zzfyVar3 != null ? this.zzc.zzb(zzfyVar3) : 0L;
        this.zzd = zzfyVar.zze;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        return zzfxu.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzf(zzgu zzguVar) {
    }
}
