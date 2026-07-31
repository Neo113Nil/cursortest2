package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* loaded from: classes.dex */
final class zzmb implements zzlo {
    private final zzyl zza;
    private final zzli zzb;

    private zzmb(zzli zzliVar, zzyl zzylVar) {
        this.zzb = zzliVar;
        this.zza = zzylVar;
    }

    static zzmb zza(zzyl zzylVar) {
        int i4 = zzma.zza[zzylVar.ordinal()];
        if (i4 == 1) {
            return new zzmb(new zzli("HmacSha256"), zzyl.NIST_P256);
        }
        if (i4 == 2) {
            return new zzmb(new zzli("HmacSha384"), zzyl.NIST_P384);
        }
        if (i4 == 3) {
            return new zzmb(new zzli("HmacSha512"), zzyl.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzylVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza(byte[] bArr, zzlr zzlrVar) {
        ECPrivateKey zza = zzyi.zza(this.zza, zzlrVar.zza().zzb());
        zzyl zzylVar = this.zza;
        byte[] zza2 = zzyi.zza(zza, zzyi.zza(zzyi.zza(zzylVar), zzyk.UNCOMPRESSED, bArr));
        byte[] zza3 = zzyc.zza(bArr, zzlrVar.zzb().zzb());
        byte[] zza4 = zzlu.zza(zza());
        zzli zzliVar = this.zzb;
        return zzliVar.zza(null, zza2, "eae_prk", zza3, "shared_secret", zza4, zzliVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] zza() {
        int i4 = zzma.zza[this.zza.ordinal()];
        if (i4 == 1) {
            return zzlu.zzc;
        }
        if (i4 == 2) {
            return zzlu.zzd;
        }
        if (i4 == 3) {
            return zzlu.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
