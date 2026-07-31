package com.google.android.gms.internal.measurement;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzlh extends zzlk {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlh(byte[] bArr, int i4, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzb(byte b4) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.zze;
        try {
            int i5 = i4 + 1;
            try {
                this.zzc[i4] = b4;
                this.zze = i5;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i4 = i5;
                throw new zzli(i4, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }

    public final void zzc(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i5);
            this.zze += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzli(this.zze, this.zzd, i5, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzd(int i4, boolean z4) {
        zzt(i4 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zze(int i4, zzld zzldVar) {
        zzt((i4 << 3) | 2);
        zzt(zzldVar.zzd());
        zzldVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzf(int i4, int i5) {
        zzt((i4 << 3) | 5);
        zzg(i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzg(int i4) {
        int i5 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.zze = i5 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzli(i5, this.zzd, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzh(int i4, long j4) {
        zzt((i4 << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzi(long j4) {
        int i4 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i4] = (byte) j4;
            bArr[i4 + 1] = (byte) (j4 >> 8);
            bArr[i4 + 2] = (byte) (j4 >> 16);
            bArr[i4 + 3] = (byte) (j4 >> 24);
            bArr[i4 + 4] = (byte) (j4 >> 32);
            bArr[i4 + 5] = (byte) (j4 >> 40);
            bArr[i4 + 6] = (byte) (j4 >> 48);
            bArr[i4 + 7] = (byte) (j4 >> 56);
            this.zze = i4 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzli(i4, this.zzd, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzj(int i4, int i5) {
        zzt(i4 << 3);
        zzk(i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzk(int i4) {
        if (i4 >= 0) {
            zzt(i4);
        } else {
            zzv(i4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzl(byte[] bArr, int i4, int i5) {
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    final void zzm(int i4, zznh zznhVar, zzns zznsVar) {
        zzt((i4 << 3) | 2);
        zzt(((zzko) zznhVar).zzca(zznsVar));
        zznsVar.zzi(zznhVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzn(int i4, zznh zznhVar) {
        zzt(11);
        zzs(2, i4);
        zzt(26);
        zzt(zznhVar.zzcf());
        zznhVar.zzcB(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzo(int i4, zzld zzldVar) {
        zzt(11);
        zzs(2, i4);
        zze(3, zzldVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzp(int i4, String str) {
        zzt((i4 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i4 = this.zze;
        try {
            int zzz = zzlk.zzz(str.length() * 3);
            int zzz2 = zzlk.zzz(str.length());
            if (zzz2 != zzz) {
                zzt(zzoo.zzc(str));
                byte[] bArr = this.zzc;
                int i5 = this.zze;
                this.zze = zzoo.zzb(str, bArr, i5, this.zzd - i5);
                return;
            }
            int i6 = i4 + zzz2;
            this.zze = i6;
            int zzb = zzoo.zzb(str, this.zzc, i6, this.zzd - i6);
            this.zze = i4;
            zzt((zzb - i4) - zzz2);
            this.zze = zzb;
        } catch (zzon e4) {
            this.zze = i4;
            zzC(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzli(e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzr(int i4, int i5) {
        zzt((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzs(int i4, int i5) {
        zzt(i4 << 3);
        zzt(i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzt(int i4) {
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.zze;
        while ((i4 & (-128)) != 0) {
            try {
                i5 = i6 + 1;
                try {
                    this.zzc[i6] = (byte) (i4 | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i4 >>>= 7;
                    i6 = i5;
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                    i6 = i5;
                    throw new zzli(i6, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e5) {
                indexOutOfBoundsException = e5;
                throw new zzli(i6, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i5 = i6 + 1;
        this.zzc[i6] = (byte) i4;
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzu(int i4, long j4) {
        zzt(i4 << 3);
        zzv(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlk
    public final void zzv(long j4) {
        boolean z4;
        int i4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zze;
        z4 = zzlk.zzd;
        if (!z4 || this.zzd - i5 < 10) {
            int i6 = i5;
            while ((j4 & (-128)) != 0) {
                try {
                    int i7 = i6 + 1;
                    try {
                        this.zzc[i6] = (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j4 >>>= 7;
                        i6 = i7;
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i6 = i7;
                        throw new zzli(i6, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                }
            }
            i4 = i6 + 1;
            try {
                this.zzc[i6] = (byte) j4;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i4;
                throw new zzli(i6, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j4 & (-128)) != 0) {
                zzol.zzn(this.zzc, i5, (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j4 >>>= 7;
                i5++;
            }
            i4 = i5 + 1;
            zzol.zzn(this.zzc, i5, (byte) j4);
        }
        this.zze = i4;
    }
}
