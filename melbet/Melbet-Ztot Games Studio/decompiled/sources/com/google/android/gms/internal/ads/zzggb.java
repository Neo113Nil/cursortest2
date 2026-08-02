package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzggb extends zzgex {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfz zzd;

    /* synthetic */ zzggb(int i, int i2, int i3, zzgfz zzgfzVar, zzgga zzggaVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfzVar;
    }

    public static zzgfy zzd() {
        return new zzgfy(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggb)) {
            return false;
        }
        zzggb zzggbVar = (zzggb) obj;
        if (zzggbVar.zza == this.zza && zzggbVar.zzb == this.zzb) {
            int i = zzggbVar.zzc;
            if (zzggbVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzggb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final boolean zza() {
        return this.zzd != zzgfz.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgfz zze() {
        return this.zzd;
    }
}
