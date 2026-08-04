package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgzu {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzhgg zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new zzgzt(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return zzhgg.zza(bArr);
    }

    public static final zzhgg zzb(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i] = (byte) charAt;
        }
        return zzhgg.zza(bArr);
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
