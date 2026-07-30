package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgw(final byte[] bArr) {
        super(false);
        zzgv zzgvVar = new zzgv() { // from class: com.google.android.gms.internal.ads.zzgu
            @Override // com.google.android.gms.internal.ads.zzgv
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        this.zza = zzgvVar;
        zzgrc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zze;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i, min);
        this.zzd += min;
        this.zze -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        this.zzc = this.zza.zza(uri);
        long j = zzhfVar.zze;
        int length = this.zzc.length;
        if (j > length) {
            throw new zzhc(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i = (int) j;
        this.zzd = i;
        int i2 = length - i;
        this.zze = i2;
        long j2 = zzhfVar.zzf;
        if (j2 != -1) {
            this.zze = (int) Math.min(i2, j2);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
