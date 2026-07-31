package com.google.android.recaptcha.internal;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzke(String str, String str2, Character ch) {
        super(r0, ch);
        char[] cArr;
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        cArr = zzkdVar.zzf;
        zzjf.zza(cArr.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf("Invalid input length " + zze.length());
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < zze.length()) {
            int i6 = i5 + 1;
            int zzb = (this.zza.zzb(zze.charAt(i4)) << 18) | (this.zza.zzb(zze.charAt(i4 + 1)) << 12);
            bArr[i5] = (byte) (zzb >>> 16);
            int i7 = i4 + 2;
            if (i7 < zze.length()) {
                int i8 = i4 + 3;
                int zzb2 = zzb | (this.zza.zzb(zze.charAt(i7)) << 6);
                int i9 = i5 + 2;
                bArr[i6] = (byte) ((zzb2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i8 < zze.length()) {
                    i4 += 4;
                    i5 += 3;
                    bArr[i9] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i8))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i5 = i9;
                    i4 = i8;
                }
            } else {
                i4 = i7;
                i5 = i6;
            }
        }
        return i5;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final void zzb(Appendable appendable, byte[] bArr, int i4, int i5) {
        int i6 = 0;
        zzjf.zzd(0, i5, bArr.length);
        for (int i7 = i5; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i6] & 255;
            int i9 = ((bArr[i6 + 1] & 255) << 8) | (i8 << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zza.zza(i9 >>> 18));
            appendable.append(this.zza.zza((i9 >>> 12) & 63));
            appendable.append(this.zza.zza((i9 >>> 6) & 63));
            appendable.append(this.zza.zza(i9 & 63));
            i6 += 3;
        }
        if (i6 < i5) {
            zzf(appendable, bArr, i6, i5 - i6);
        }
    }
}
