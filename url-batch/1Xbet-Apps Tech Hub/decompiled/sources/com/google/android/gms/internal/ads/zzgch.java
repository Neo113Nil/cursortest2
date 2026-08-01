package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgch {
    private final OutputStream zza;

    private zzgch(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgch zzb(OutputStream outputStream) {
        return new zzgch(outputStream);
    }

    public final void zza(zzgrz zzgrzVar) throws IOException {
        try {
            zzgrzVar.zzaw(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
