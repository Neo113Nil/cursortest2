package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggq extends zzgdv {
    private final int zza;
    private final zzggo zzb;

    /* synthetic */ zzggq(int i, zzggo zzggoVar, zzggp zzggpVar) {
        this.zza = i;
        this.zzb = zzggoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggq)) {
            return false;
        }
        zzggq zzggqVar = (zzggq) obj;
        return zzggqVar.zza == this.zza && zzggqVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzggq.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zzb != zzggo.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggo zzc() {
        return this.zzb;
    }
}
