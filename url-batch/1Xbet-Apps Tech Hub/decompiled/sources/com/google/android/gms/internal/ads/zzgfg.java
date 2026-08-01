package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgfg extends zzgdv {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfe zzd;

    /* synthetic */ zzgfg(int i, int i2, int i3, zzgfe zzgfeVar, zzgff zzgffVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfg)) {
            return false;
        }
        zzgfg zzgfgVar = (zzgfg) obj;
        if (zzgfgVar.zza == this.zza && zzgfgVar.zzb == this.zzb) {
            int i = zzgfgVar.zzc;
            if (zzgfgVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zzd != zzgfe.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgfe zzd() {
        return this.zzd;
    }
}
