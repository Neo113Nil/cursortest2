package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzbh {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbh(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i8 = 0; i8 < cArr.length; i8++) {
            char c8 = cArr[i8];
            boolean z7 = true;
            zzas.zzd(c8 < 128, "Non-ASCII character: %s", c8);
            if (bArr[c8] != -1) {
                z7 = false;
            }
            zzas.zzd(z7, "Duplicate character: %s", c8);
            bArr[c8] = (byte) i8;
        }
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbh) {
            zzbh zzbhVar = (zzbh) obj;
            boolean z7 = zzbhVar.zzh;
            if (Arrays.equals(this.zzf, zzbhVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i8) {
        return this.zzf[i8];
    }

    public final boolean zzb(char c8) {
        return c8 < 128 && this.zzg[c8] != -1;
    }

    private zzbh(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzbn.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i8 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i8;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i8];
            for (int i9 = 0; i9 < this.zzd; i9++) {
                zArr[zzbn.zza(i9 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (ArithmeticException e8) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e8);
        }
    }
}
