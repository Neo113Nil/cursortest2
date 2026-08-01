package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmr extends zzgnt {
    private final int zza;
    private final int zzb;
    private final zzgmp zzc;

    /* synthetic */ zzgmr(int i, int i2, zzgmp zzgmpVar, zzgmq zzgmqVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgmpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmr)) {
            return false;
        }
        zzgmr zzgmrVar = (zzgmr) obj;
        return zzgmrVar.zza == this.zza && zzgmrVar.zzd() == zzd() && zzgmrVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgmr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zzc != zzgmp.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgmp zzgmpVar = this.zzc;
        if (zzgmpVar == zzgmp.zzd) {
            return this.zzb;
        }
        if (zzgmpVar == zzgmp.zza || zzgmpVar == zzgmp.zzb || zzgmpVar == zzgmp.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgmp zze() {
        return this.zzc;
    }
}
