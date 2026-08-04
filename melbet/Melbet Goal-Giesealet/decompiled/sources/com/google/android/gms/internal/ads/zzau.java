package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzau {
    public static final zzau zza = new zzau(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzau(float f, float f2) {
        zzghc.zza(f > 0.0f);
        zzghc.zza(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzau zzauVar = (zzau) obj;
            if (this.zzb == zzauVar.zzb && this.zzc == zzauVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + 527) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        String str = zzeo.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j) {
        return j * this.zzd;
    }
}
