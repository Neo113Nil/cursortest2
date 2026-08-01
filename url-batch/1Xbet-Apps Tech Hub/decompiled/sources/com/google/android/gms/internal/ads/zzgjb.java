package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgjb {
    private static final ThreadLocal zza = new zzgja();
    private final SecretKey zzb;

    public zzgjb(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!zzgjl.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgui.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2.equals("The Android Project") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Integer valueOf;
        ThreadLocal threadLocal;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        String property = System.getProperty("java.vendor");
        if (property != "The Android Project") {
            valueOf = null;
            if (property != null) {
            }
            AlgorithmParameterSpec gCMParameterSpec = (valueOf != null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
            threadLocal = zza;
            ((Cipher) threadLocal.get()).init(2, this.zzb, gCMParameterSpec);
            if (bArr3 != null && bArr3.length != 0) {
                ((Cipher) threadLocal.get()).updateAAD(bArr3);
            }
            return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
        }
        valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        if (valueOf != null) {
        }
        threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzb, gCMParameterSpec);
        if (bArr3 != null) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
    }
}
