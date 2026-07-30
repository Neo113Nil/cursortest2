package com.google.android.gms.internal.measurement;

import com.jieli.jl_audio_decode.constant.ErrorCode;

/* loaded from: classes3.dex */
final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzkf(byte[] bArr, int i8, int i9) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b8) {
        try {
            byte[] bArr = this.zzc;
            int i8 = this.zze;
            this.zze = i8 + 1;
            bArr[i8] = b8;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e8);
        }
    }

    public final void zzc(byte[] bArr, int i8, int i9) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i9);
            this.zze += i9;
        } catch (IndexOutOfBoundsException e8) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i9)), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i8, boolean z7) {
        zzq(i8 << 3);
        zzb(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i8, zzka zzkaVar) {
        zzq((i8 << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i8, int i9) {
        zzq((i8 << 3) | 5);
        zzg(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i8) {
        try {
            byte[] bArr = this.zzc;
            int i9 = this.zze;
            bArr[i9] = (byte) (i8 & 255);
            bArr[i9 + 1] = (byte) ((i8 >> 8) & 255);
            bArr[i9 + 2] = (byte) ((i8 >> 16) & 255);
            this.zze = i9 + 4;
            bArr[i9 + 3] = (byte) ((i8 >> 24) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i8, long j8) {
        zzq((i8 << 3) | 1);
        zzi(j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j8) {
        try {
            byte[] bArr = this.zzc;
            int i8 = this.zze;
            bArr[i8] = (byte) (((int) j8) & 255);
            bArr[i8 + 1] = (byte) (((int) (j8 >> 8)) & 255);
            bArr[i8 + 2] = (byte) (((int) (j8 >> 16)) & 255);
            bArr[i8 + 3] = (byte) (((int) (j8 >> 24)) & 255);
            bArr[i8 + 4] = (byte) (((int) (j8 >> 32)) & 255);
            bArr[i8 + 5] = (byte) (((int) (j8 >> 40)) & 255);
            bArr[i8 + 6] = (byte) (((int) (j8 >> 48)) & 255);
            this.zze = i8 + 8;
            bArr[i8 + 7] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i8, int i9) {
        zzq(i8 << 3);
        zzk(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i8) {
        if (i8 >= 0) {
            zzq(i8);
        } else {
            zzs(i8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i8, int i9) {
        zzc(bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i8, String str) {
        zzq((i8 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i8 = this.zze;
        try {
            int zzx = zzki.zzx(str.length() * 3);
            int zzx2 = zzki.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i9 = this.zze;
                this.zze = zznz.zzb(str, bArr, i9, this.zzd - i9);
                return;
            }
            int i10 = i8 + zzx2;
            this.zze = i10;
            int zzb = zznz.zzb(str, this.zzc, i10, this.zzd - i10);
            this.zze = i8;
            zzq((zzb - i8) - zzx2);
            this.zze = zzb;
        } catch (zzny e8) {
            this.zze = i8;
            zzB(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new zzkg(e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i8, int i9) {
        zzq((i8 << 3) | i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i8, int i9) {
        zzq(i8 << 3);
        zzq(i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i8) {
        while ((i8 & ErrorCode.ERR_OUTPUT_EXCEPTION) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i9 = this.zze;
                this.zze = i9 + 1;
                bArr[i9] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e8);
            }
        }
        byte[] bArr2 = this.zzc;
        int i10 = this.zze;
        this.zze = i10 + 1;
        bArr2[i10] = (byte) i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i8, long j8) {
        zzq(i8 << 3);
        zzs(j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j8) {
        boolean z7;
        z7 = zzki.zzd;
        if (z7 && this.zzd - this.zze >= 10) {
            while ((j8 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i8 = this.zze;
                this.zze = i8 + 1;
                zznu.zzn(bArr, i8, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i9 = this.zze;
            this.zze = i9 + 1;
            zznu.zzn(bArr2, i9, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr3[i10] = (byte) ((((int) j8) & 127) | 128);
                j8 >>>= 7;
            } catch (IndexOutOfBoundsException e8) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e8);
            }
        }
        byte[] bArr4 = this.zzc;
        int i11 = this.zze;
        this.zze = i11 + 1;
        bArr4[i11] = (byte) j8;
    }
}
