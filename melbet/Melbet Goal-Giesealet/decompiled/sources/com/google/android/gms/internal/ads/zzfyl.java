package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfyl {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzc) {
            if (zza == null) {
                zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zza;
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzfyk {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zza2 = zzfva.zza(str, false);
            int length2 = zza2.length;
            if (length2 <= 16) {
                throw new zzfyk();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(zza2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new zzfyk(e);
        }
    }

    public final String zzb(byte[] bArr, String str) throws zzfyk, UnsupportedEncodingException {
        return new String(zza(bArr, str), "UTF-8");
    }
}
