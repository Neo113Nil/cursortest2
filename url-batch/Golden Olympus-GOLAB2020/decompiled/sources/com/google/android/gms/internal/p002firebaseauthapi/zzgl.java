package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgl {
    private static final ThreadLocal<Cipher> zza = new zzgo();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static SecretKey zzb(byte[] bArr) {
        zzzi.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i4, int i5) {
        Integer zzb = zzpy.zzb();
        return (zzb == null || zzb.intValue() > 19) ? new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, i4, i5) : new IvParameterSpec(bArr, i4, i5);
    }

    public static Cipher zza() {
        return zza.get();
    }
}
