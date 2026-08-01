package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgit extends zzgdv {
    private final zzgis zza;

    private zzgit(zzgis zzgisVar) {
        this.zza = zzgisVar;
    }

    public static zzgit zzc(zzgis zzgisVar) {
        return new zzgit(zzgisVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgit) && ((zzgit) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgit.class, this.zza});
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zza != zzgis.zzc;
    }

    public final zzgis zzb() {
        return this.zza;
    }
}
