package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgjk implements zzgcf {
    private static final ThreadLocal zza = new zzgjj();
    private static final boolean zzb;
    private final SecretKey zzc;

    static {
        boolean z;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        zzb = z;
    }

    public zzgjk(byte[] bArr) throws GeneralSecurityException {
        zzgui.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (zzb) {
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } else {
            if (!zzguh.zza()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzc, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
    }
}
