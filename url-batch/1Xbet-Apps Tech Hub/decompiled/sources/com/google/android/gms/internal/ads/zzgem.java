package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgem extends zzgdv {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgek zze;
    private final zzgej zzf;

    /* synthetic */ zzgem(int i, int i2, int i3, int i4, zzgek zzgekVar, zzgej zzgejVar, zzgel zzgelVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgekVar;
        this.zzf = zzgejVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgem)) {
            return false;
        }
        zzgem zzgemVar = (zzgem) obj;
        return zzgemVar.zza == this.zza && zzgemVar.zzb == this.zzb && zzgemVar.zzc == this.zzc && zzgemVar.zzd == this.zzd && zzgemVar.zze == this.zze && zzgemVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgem.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        zzgej zzgejVar = this.zzf;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(zzgejVar) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zze != zzgek.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgej zzf() {
        return this.zzf;
    }

    public final zzgek zzg() {
        return this.zze;
    }
}
