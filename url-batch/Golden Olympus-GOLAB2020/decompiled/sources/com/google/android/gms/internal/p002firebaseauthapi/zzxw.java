package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxw implements zzbe {
    private static final zzij.zza zza = zzij.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzxz();
    private static final ThreadLocal<Cipher> zzc = new zzxy();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzxw(byte[] bArr, int i4, byte[] bArr2) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i4 != 12 && i4 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzh = i4;
        zzzi.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzg = secretKeySpec;
        Cipher cipher = zzb.get();
        cipher.init(1, secretKeySpec);
        byte[] zza2 = zza(cipher.doFinal(new byte[16]));
        this.zzd = zza2;
        this.zze = zza(zza2);
        this.zzf = bArr2;
    }

    public static zzbe zza(zzdf zzdfVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (zzdfVar.zzc().zzd() == 16) {
            return new zzxw(zzdfVar.zze().zza(zzbl.zza()), zzdfVar.zzc().zzb(), zzdfVar.zzd().zzb());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + zzdfVar.zzc().zzd());
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i4 = this.zzh;
        if (length > (length2 - i4) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i4 + bArr.length + 16);
        byte[] zza2 = zzpp.zza(this.zzh);
        System.arraycopy(zza2, 0, copyOf, this.zzf.length, this.zzh);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] zza3 = zza(cipher, 0, zza2, 0, zza2.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] zza4 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(zza3));
        cipher2.doFinal(bArr, 0, bArr.length, copyOf, this.zzf.length + this.zzh);
        byte[] zza5 = zza(cipher, 2, copyOf, this.zzf.length + this.zzh, bArr.length);
        int length3 = this.zzf.length + bArr.length + this.zzh;
        for (int i5 = 0; i5 < 16; i5++) {
            copyOf[length3 + i5] = (byte) ((zza4[i5] ^ zza3[i5]) ^ zza5[i5]);
        }
        return copyOf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 >= 0) {
            if (zzpy.zza(bArr3, bArr)) {
                Cipher cipher = zzb.get();
                cipher.init(1, this.zzg);
                byte[] zza2 = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
                byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
                byte[] zza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
                byte[] zza4 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
                int length3 = bArr.length - 16;
                byte b4 = 0;
                for (int i4 = 0; i4 < 16; i4++) {
                    b4 = (byte) (b4 | (((bArr[length3 + i4] ^ zza3[i4]) ^ zza2[i4]) ^ zza4[i4]));
                }
                if (b4 == 0) {
                    Cipher cipher2 = zzc.get();
                    cipher2.init(1, this.zzg, new IvParameterSpec(zza2));
                    return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i4 = 0;
        while (i4 < 15) {
            int i5 = i4 + 1;
            bArr2[i4] = (byte) ((bArr[i4] << 1) ^ ((bArr[i5] & 255) >>> 7));
            i4 = i5;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i4, byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i4;
        if (i6 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i7 = 0;
        while (i6 - i7 > 16) {
            for (int i8 = 0; i8 < 16; i8++) {
                bArr4[i8] = (byte) (bArr4[i8] ^ bArr[(i5 + i7) + i8]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i7 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i5, i5 + i6);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzd);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zze, 16);
            for (int i9 = 0; i9 < copyOfRange.length; i9++) {
                copyOf[i9] = (byte) (copyOf[i9] ^ copyOfRange[i9]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
            copyOfRange = copyOf;
        }
        zzc(bArr4, copyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }
}
