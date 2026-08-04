package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzguw extends zzgrg {
    private final zzguv zza;

    private zzguw(zzguv zzguvVar) {
        this.zza = zzguvVar;
    }

    public static zzguw zzb(zzguv zzguvVar) {
        return new zzguw(zzguvVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzguw) && ((zzguw) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzguw.class, this.zza);
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zza != zzguv.zzc;
    }

    public final zzguv zzc() {
        return this.zza;
    }
}
