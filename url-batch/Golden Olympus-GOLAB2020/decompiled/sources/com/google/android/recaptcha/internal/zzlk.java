package com.google.android.recaptcha.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzlk(byte[] bArr, int i4, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i5;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b4) {
        try {
            byte[] bArr = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr[i4] = b4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i5)), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i4, boolean z4) {
        zzt(i4 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i4, zzle zzleVar) {
        zzt((i4 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i4, int i5) {
        zzt((i4 << 3) | 5);
        zzg(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i4) {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i5 + 2;
            this.zzd = i7;
            bArr[i6] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i5 + 3;
            this.zzd = i8;
            bArr[i7] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzd = i5 + 4;
            bArr[i8] = (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i4, long j4) {
        zzt((i4 << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j4) {
        try {
            byte[] bArr = this.zzb;
            int i4 = this.zzd;
            int i5 = i4 + 1;
            this.zzd = i5;
            bArr[i4] = (byte) (((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i4 + 2;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i4 + 3;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i4 + 4;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i9 = i4 + 5;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i10 = i4 + 6;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i11 = i4 + 7;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzd = i4 + 8;
            bArr[i11] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i4, int i5) {
        zzt(i4 << 3);
        zzk(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i4) {
        if (i4 >= 0) {
            zzt(i4);
        } else {
            zzv(i4);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i4, int i5) {
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    final void zzm(int i4, zzoi zzoiVar, zzow zzowVar) {
        zzt((i4 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i4, zzoi zzoiVar) {
        zzt(11);
        zzs(2, i4);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i4, zzle zzleVar) {
        zzt(11);
        zzs(2, i4);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i4, String str) {
        zzt((i4 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i4 = this.zzd;
        try {
            int zzA = zzln.zzA(str.length() * 3);
            int zzA2 = zzln.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i5, this.zzc - i5);
                return;
            }
            int i6 = i4 + zzA2;
            this.zzd = i6;
            int zzb = zzpv.zzb(str, this.zzb, i6, this.zzc - i6);
            this.zzd = i4;
            zzt((zzb - i4) - zzA2);
            this.zzd = zzb;
        } catch (zzpu e4) {
            this.zzd = i4;
            zzD(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzll(e5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i4, int i5) {
        zzt((i4 << 3) | i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i4, int i5) {
        zzt(i4 << 3);
        zzt(i5);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i4) {
        while ((i4 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr[i5] = (byte) ((i4 | UserVerificationMethods.USER_VERIFY_PATTERN) & KotlinVersion.MAX_COMPONENT_VALUE);
                i4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        bArr2[i6] = (byte) i4;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i4, long j4) {
        zzt(i4 << 3);
        zzv(j4);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j4) {
        boolean z4;
        z4 = zzln.zzc;
        if (!z4 || this.zzc - this.zzd < 10) {
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    bArr[i4] = (byte) ((((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            byte[] bArr2 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr2[i5] = (byte) j4;
            return;
        }
        while (true) {
            int i6 = (int) j4;
            if ((j4 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                zzps.zzn(bArr3, i7, (byte) i6);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            zzps.zzn(bArr4, i8, (byte) ((i6 | UserVerificationMethods.USER_VERIFY_PATTERN) & KotlinVersion.MAX_COMPONENT_VALUE));
            j4 >>>= 7;
        }
    }
}
