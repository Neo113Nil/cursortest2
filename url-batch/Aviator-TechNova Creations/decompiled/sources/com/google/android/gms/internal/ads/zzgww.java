package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgww extends zzgwz {
    final char[] zza;

    private zzgww(zzgwv zzgwvVar) {
        super(zzgwvVar, null);
        this.zza = new char[512];
        zzgrc.zza(zzgwvVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgwvVar.zza(i >>> 4);
            this.zza[i | 256] = zzgwvVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzgrc.zzo(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new zzgwy(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zzgwv zzgwvVar = this.zzb;
            bArr[i2] = (byte) (zzgwvVar.zzc(charSequence.charAt(i + 1)) | (zzgwvVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    final zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgww(zzgwvVar);
    }

    zzgww(String str, String str2) {
        this(new zzgwv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
