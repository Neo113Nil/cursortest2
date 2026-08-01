package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgvr extends zzgvo {
    private final OutputStream zzg;

    zzgvr(OutputStream outputStream, int i) {
        super(i);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzJ(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzK(int i, boolean z) throws IOException {
        zzH(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzL(int i, zzgve zzgveVar) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgveVar.zzd());
        zzgveVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt, com.google.android.gms.internal.ads.zzgut
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzp(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzh(int i, int i2) throws IOException {
        zzH(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzi(int i) throws IOException {
        zzH(4);
        zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzj(int i, long j) throws IOException {
        zzH(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzk(long j) throws IOException {
        zzH(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzl(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
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
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzG();
        int i7 = i2 - i5;
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzr(int i, int i2) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzs(int i) throws IOException {
        zzH(5);
        zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzt(int i, long j) throws IOException {
        zzH(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final void zzu(long j) throws IOException {
        zzH(10);
        zzg(j);
    }

    public final void zzv(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzA = zzA(length);
            int i = zzA + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int zzd = zzgzv.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i > i2 - this.zzc) {
                zzG();
            }
            int zzA2 = zzA(str.length());
            int i3 = this.zzc;
            try {
                if (zzA2 == zzA) {
                    int i4 = i3 + zzA2;
                    this.zzc = i4;
                    int zzd2 = zzgzv.zzd(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    zze = (zzd2 - i3) - zzA2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgzv.zze(str);
                    zzf(zze);
                    this.zzc = zzgzv.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgzu e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzgvq(e2);
            }
        } catch (zzgzu e3) {
            zzE(str, e3);
        }
    }
}
