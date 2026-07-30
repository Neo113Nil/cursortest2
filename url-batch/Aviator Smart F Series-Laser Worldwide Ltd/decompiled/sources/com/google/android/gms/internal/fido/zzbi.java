package com.google.android.gms.internal.fido;

/* loaded from: classes3.dex */
final class zzbi extends zzbk {
    final char[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbi(String str, String str2) {
        super(r4, null);
        char[] cArr;
        zzbh zzbhVar = new zzbh("base16()", "0123456789ABCDEF".toCharArray());
        this.zza = new char[512];
        cArr = zzbhVar.zzf;
        zzas.zzc(cArr.length == 16);
        for (int i8 = 0; i8 < 256; i8++) {
            this.zza[i8] = zzbhVar.zza(i8 >>> 4);
            this.zza[i8 | 256] = zzbhVar.zza(i8 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
    final void zza(Appendable appendable, byte[] bArr, int i8, int i9) {
        zzas.zze(0, i9, bArr.length);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = bArr[i10] & 255;
            appendable.append(this.zza[i11]);
            appendable.append(this.zza[i11 | 256]);
        }
    }
}
