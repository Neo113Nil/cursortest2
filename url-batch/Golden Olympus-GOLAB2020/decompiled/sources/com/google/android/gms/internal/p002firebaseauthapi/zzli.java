package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class zzli implements zzlp {
    private final String zza;

    zzli(String str) {
        this.zza = str;
    }

    final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        switch (str) {
            case "HmacSha256":
                return zzlu.zzf;
            case "HmacSha384":
                return zzlu.zzg;
            case "HmacSha512":
                return zzlu.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i4) {
        Mac zza = zzym.zzb.zza(this.zza);
        if (i4 > zza.getMacLength() * KotlinVersion.MAX_COMPONENT_VALUE) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i4];
        zza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i5 = 1;
        int i6 = 0;
        while (true) {
            zza.update(bArr4);
            zza.update(bArr2);
            zza.update((byte) i5);
            bArr4 = zza.doFinal();
            if (bArr4.length + i6 >= i4) {
                System.arraycopy(bArr4, 0, bArr3, i6, i4 - i6);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
            i6 += bArr4.length;
            i5++;
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzym.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        }
        return zza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i4) {
        return zza(zza(zzlu.zza(str, bArr2, bArr4), null), zzlu.zza(str2, bArr3, bArr4, i4), i4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i4) {
        return zza(bArr, zzlu.zza(str, bArr2, bArr3, i4), i4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlu.zza(str, bArr2, bArr3), bArr);
    }
}
