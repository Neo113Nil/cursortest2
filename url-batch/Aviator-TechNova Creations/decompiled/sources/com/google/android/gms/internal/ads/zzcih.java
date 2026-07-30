package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcih implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    zzcih(zzhb zzhbVar, int i, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
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

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        Uri uri;
        zzhf zzhfVar2;
        Uri uri2 = zzhfVar.zza;
        this.zze = uri2;
        long j = zzhfVar.zze;
        long j2 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j >= j2) {
            uri = uri2;
            zzhfVar2 = null;
        } else {
            long j3 = zzhfVar.zzf;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            uri = uri2;
            zzhfVar2 = new zzhf(uri, j, j4, null);
        }
        long j5 = zzhfVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzhfVar3 = new zzhf(uri, Math.max(j2, j), j5 != -1 ? Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long zzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long zzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return zzgui.zza();
    }
}
