package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmd {
    public static final Charset zza = Charset.forName(Key.STRING_CHARSET_NAME);

    public static final zzguk zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgmc("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzguk.zzb(bArr);
    }
}
