package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class zzyg {
    private ECPrivateKey zza;

    public zzyg(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i4, zzyk zzykVar) {
        byte[] zza = zzyc.zza(bArr, zzyi.zza(this.zza, zzyi.zza(this.zza.getParams(), zzykVar, bArr)));
        Mac zza2 = zzym.zzb.zza(str);
        if (i4 > zza2.getMacLength() * KotlinVersion.MAX_COMPONENT_VALUE) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], str));
        } else {
            zza2.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i4];
        zza2.init(new SecretKeySpec(zza2.doFinal(zza), str));
        byte[] bArr5 = new byte[0];
        int i5 = 1;
        int i6 = 0;
        while (true) {
            zza2.update(bArr5);
            zza2.update(bArr3);
            zza2.update((byte) i5);
            bArr5 = zza2.doFinal();
            if (bArr5.length + i6 >= i4) {
                System.arraycopy(bArr5, 0, bArr4, i6, i4 - i6);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i6, bArr5.length);
            i6 += bArr5.length;
            i5++;
        }
    }
}
