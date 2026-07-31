package com.google.android.gms.internal.play_billing;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzez extends zzfc {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzez(byte[] bArr, int i4, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
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
                throw new zzfa(i4, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }

    public final void zzc(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, i4, this.zzc, this.zze, i5);
            this.zze += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfa(this.zze, this.zzd, i5, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzd(int i4, boolean z4) {
        zzu(i4 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zze(byte[] bArr, int i4, int i5) {
        zzu(i5);
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzf(int i4, zzev zzevVar) {
        zzu((i4 << 3) | 2);
        zzg(zzevVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzg(zzev zzevVar) {
        zzu(zzevVar.zze());
        zzevVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzh(int i4, int i5) {
        zzu((i4 << 3) | 5);
        zzi(i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzi(int i4) {
        int i5 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.zze = i5 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfa(i5, this.zzd, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzj(int i4, long j4) {
        zzu((i4 << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzk(long j4) {
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
            throw new zzfa(i4, this.zzd, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzl(int i4, int i5) {
        zzu(i4 << 3);
        zzm(i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzm(int i4) {
        if (i4 >= 0) {
            zzu(i4);
        } else {
            zzw(i4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzn(zzhb zzhbVar) {
        zzu(zzhbVar.zzn());
        zzhbVar.zzD(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzo(int i4, zzhb zzhbVar) {
        zzu(11);
        zzt(2, i4);
        zzu(26);
        zzn(zzhbVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzp(int i4, zzev zzevVar) {
        zzu(11);
        zzt(2, i4);
        zzf(3, zzevVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzq(int i4, String str) {
        zzu((i4 << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzr(String str) {
        int i4 = this.zze;
        try {
            int zzy = zzfc.zzy(str.length() * 3);
            int zzy2 = zzfc.zzy(str.length());
            if (zzy2 != zzy) {
                zzu(zzin.zzb(str));
                byte[] bArr = this.zzc;
                int i5 = this.zze;
                this.zze = zzin.zza(str, bArr, i5, this.zzd - i5);
                return;
            }
            int i6 = i4 + zzy2;
            this.zze = i6;
            int zza = zzin.zza(str, this.zzc, i6, this.zzd - i6);
            this.zze = i4;
            zzu((zza - i4) - zzy2);
            this.zze = zza;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzfa(e4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzs(int i4, int i5) {
        zzu((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzt(int i4, int i5) {
        zzu(i4 << 3);
        zzu(i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzu(int i4) {
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
                    throw new zzfa(i6, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e5) {
                indexOutOfBoundsException = e5;
                throw new zzfa(i6, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i5 = i6 + 1;
        this.zzc[i6] = (byte) i4;
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzv(int i4, long j4) {
        zzu(i4 << 3);
        zzw(j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfc
    public final void zzw(long j4) {
        boolean z4;
        int i4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.zze;
        z4 = zzfc.zzc;
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
                        throw new zzfa(i6, this.zzd, 1, indexOutOfBoundsException);
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
                throw new zzfa(i6, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j4 & (-128)) != 0) {
                zzii.zzn(this.zzc, i5, (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j4 >>>= 7;
                i5++;
            }
            i4 = i5 + 1;
            zzii.zzn(this.zzc, i5, (byte) j4);
        }
        this.zze = i4;
    }
}
