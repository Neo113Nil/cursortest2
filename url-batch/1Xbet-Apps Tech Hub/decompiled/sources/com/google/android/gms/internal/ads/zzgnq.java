package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgnq extends zzgnt {
    private final int zza;
    private final int zzb;
    private final zzgno zzc;
    private final zzgnn zzd;

    /* synthetic */ zzgnq(int i, int i2, zzgno zzgnoVar, zzgnn zzgnnVar, zzgnp zzgnpVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgnoVar;
        this.zzd = zzgnnVar;
    }

    public static zzgnm zze() {
        return new zzgnm(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnq)) {
            return false;
        }
        zzgnq zzgnqVar = (zzgnq) obj;
        return zzgnqVar.zza == this.zza && zzgnqVar.zzd() == zzd() && zzgnqVar.zzc == this.zzc && zzgnqVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgnq.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        zzgnn zzgnnVar = this.zzd;
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(zzgnnVar) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zzc != zzgno.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgno zzgnoVar = this.zzc;
        if (zzgnoVar == zzgno.zzd) {
            return this.zzb;
        }
        if (zzgnoVar == zzgno.zza || zzgnoVar == zzgno.zzb || zzgnoVar == zzgno.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgnn zzf() {
        return this.zzd;
    }

    public final zzgno zzg() {
        return this.zzc;
    }
}
