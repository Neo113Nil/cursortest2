package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzghk implements zzgcf {
    private static final byte[] zza = new byte[0];
    private static final Set zzb;
    private final zzgrr zzc;
    private final zzgcf zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzghk(zzgrr zzgrrVar, zzgcf zzgcfVar) {
        if (zzb(zzgrrVar.zzh())) {
            this.zzc = zzgrrVar;
            this.zzd = zzgcfVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + zzgrrVar.zzh() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static boolean zzb(String str) {
        return zzb.contains(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzd.zza(bArr3, zza);
            String zzh = this.zzc.zzh();
            int i2 = zzgdo.zza;
            zzgve zzgveVar = zzgve.zzb;
            return ((zzgcf) zzgdo.zzd(zzh, zzgve.zzv(zza2, 0, zza2.length), zzgcf.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
