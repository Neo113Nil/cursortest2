package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgfy extends zzgdv {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgfw zzd;

    /* synthetic */ zzgfy(int i, int i2, int i3, zzgfw zzgfwVar, zzgfx zzgfxVar) {
        this.zza = i;
        this.zzd = zzgfwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfy)) {
            return false;
        }
        zzgfy zzgfyVar = (zzgfy) obj;
        if (zzgfyVar.zza == this.zza) {
            int i = zzgfyVar.zzb;
            int i2 = zzgfyVar.zzc;
            if (zzgfyVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgfy.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final boolean zza() {
        return this.zzd != zzgfw.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgfw zzc() {
        return this.zzd;
    }
}
