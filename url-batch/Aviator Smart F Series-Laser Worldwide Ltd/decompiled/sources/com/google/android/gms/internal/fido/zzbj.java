package com.google.android.gms.internal.fido;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzbj extends zzbk {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbj(String str, String str2, @CheckForNull Character ch) {
        super(r0, ch);
        char[] cArr;
        zzbh zzbhVar = new zzbh(str, str2.toCharArray());
        cArr = zzbhVar.zzf;
        zzas.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
    final void zza(Appendable appendable, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        zzas.zze(0, i9, bArr.length);
        for (int i11 = i9; i11 >= 3; i11 -= 3) {
            int i12 = bArr[i10] & 255;
            int i13 = ((bArr[i10 + 1] & 255) << 8) | (i12 << 16) | (bArr[i10 + 2] & 255);
            appendable.append(this.zzb.zza(i13 >>> 18));
            appendable.append(this.zzb.zza((i13 >>> 12) & 63));
            appendable.append(this.zzb.zza((i13 >>> 6) & 63));
            appendable.append(this.zzb.zza(i13 & 63));
            i10 += 3;
        }
        if (i10 < i9) {
            zzc(appendable, bArr, i10, i9 - i10);
        }
    }
}
