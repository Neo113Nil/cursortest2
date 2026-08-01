package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgvp extends zzgvt {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgvp(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzK(int i, boolean z) throws IOException {
        zzs(i << 3);
        zzJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzL(int i, zzgve zzgveVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgveVar.zzd());
        zzgveVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt, com.google.android.gms.internal.ads.zzgut
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzh(int i, int i2) throws IOException {
        zzs((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zzc = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzj(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzk(long j) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zzc = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzl(int i, int i2) throws IOException {
        zzs(i << 3);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    final void zzn(int i, zzgxw zzgxwVar, zzgyp zzgypVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzgun) zzgxwVar).zzat(zzgypVar));
        zzgypVar.zzm(zzgxwVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzA = zzA(str.length() * 3);
            int zzA2 = zzA(str.length());
            if (zzA2 != zzA) {
                zzs(zzgzv.zze(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzgzv.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + zzA2;
            this.zzc = i3;
            int zzd = zzgzv.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzs((zzd - i) - zzA2);
            this.zzc = zzd;
        } catch (zzgzu e) {
            this.zzc = i;
            zzE(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgvq(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzr(int i, int i2) throws IOException {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzt(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzJ(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzs(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        byte[] bArr2 = this.zza;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzu(long j) throws IOException {
        boolean z;
        z = zzgvt.zzb;
        if (!z || this.zzb - this.zzc < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i = this.zzc;
                    this.zzc = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgvq(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
                }
            }
            byte[] bArr2 = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzgzq.zzq(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzgzq.zzq(bArr4, i5, (byte) ((i3 & 127) | 128));
            j >>>= 7;
        }
    }
}
