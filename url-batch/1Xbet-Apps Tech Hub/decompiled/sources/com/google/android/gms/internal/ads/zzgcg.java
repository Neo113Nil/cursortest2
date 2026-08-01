package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgcg {
    private final InputStream zza;

    private zzgcg(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgcg zzb(byte[] bArr) {
        return new zzgcg(new ByteArrayInputStream(bArr));
    }

    public final zzgrz zza() throws IOException {
        try {
            return zzgrz.zzg(this.zza, zzgvy.zza());
        } finally {
            this.zza.close();
        }
    }
}
