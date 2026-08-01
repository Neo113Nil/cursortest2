package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhy {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    private final zzhx zzj;

    public zzhy() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = zzfs.zza >= 24 ? new zzhx(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i) {
        if (i == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i;
    }

    public final void zzc(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i2;
        this.zzg = i3;
        this.zzh = i4;
        this.zzi.numSubSamples = i;
        this.zzi.numBytesOfClearData = iArr;
        this.zzi.numBytesOfEncryptedData = iArr2;
        this.zzi.key = bArr;
        this.zzi.iv = bArr2;
        this.zzi.mode = i2;
        if (zzfs.zza >= 24) {
            zzhx zzhxVar = this.zzj;
            zzhxVar.getClass();
            zzhx.zza(zzhxVar, i3, i4);
        }
    }
}
