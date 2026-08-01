package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzghb extends zzgdv {
    private final zzgha zza;

    private zzghb(zzgha zzghaVar) {
        this.zza = zzghaVar;
    }

    public static zzghb zzc(zzgha zzghaVar) {
        return new zzghb(zzghaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzghb) && ((zzghb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzghb.class, this.zza});
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zza != zzgha.zzc;
    }

    public final zzgha zzb() {
        return this.zza;
    }
}
