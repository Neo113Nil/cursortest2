package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzua implements zzgq {
    private final zzgq zza;
    private final int zzb;
    private final zztz zzc;
    private final byte[] zzd;
    private int zze;

    public zzua(zzgq zzgqVar, int i, zztz zztzVar) {
        zzef.zzd(i > 0);
        this.zza = zzgqVar;
        this.zzb = i;
        this.zzc = zztzVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            int i4 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i5 = (this.zzd[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int zza = this.zza.zza(bArr2, i4, i6);
                        if (zza != -1) {
                            i4 += zza;
                            i6 -= zza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new zzfj(bArr2, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i, Math.min(i3, i2));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final long zzb(zzgv zzgvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
        zzhsVar.getClass();
        this.zza.zzf(zzhsVar);
    }
}
