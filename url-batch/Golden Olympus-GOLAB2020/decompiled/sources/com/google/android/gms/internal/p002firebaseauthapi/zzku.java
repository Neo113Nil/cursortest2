package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zzku implements zzll {
    private final int zza;

    zzku(int i4) {
        if (i4 == 16 || i4 == 32) {
            this.zza = i4;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i4);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzc() {
        int i4 = this.zza;
        if (i4 == 16) {
            return zzlu.zzi;
        }
        if (i4 == 32) {
            return zzlu.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i4, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhk(bArr).zza(bArr2, bArr3, i4, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }
}
