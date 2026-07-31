package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        char[] cArr;
        this.zza = new char[UserVerificationMethods.USER_VERIFY_NONE];
        cArr = zzcdVar.zzf;
        zzap.zzc(cArr.length == 16);
        for (int i4 = 0; i4 < 256; i4++) {
            this.zza[i4] = zzcdVar.zza(i4 >>> 4);
            this.zza[i4 | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzcdVar.zza(i4 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    final void zzb(Appendable appendable, byte[] bArr, int i4, int i5) {
        zzap.zze(0, i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = bArr[i6] & 255;
            appendable.append(this.zza[i7]);
            appendable.append(this.zza[i7 | UserVerificationMethods.USER_VERIFY_HANDPRINT]);
        }
    }

    zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
