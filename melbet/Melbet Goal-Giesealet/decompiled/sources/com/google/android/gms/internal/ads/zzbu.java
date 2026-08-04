package com.google.android.gms.internal.ads;

import com.facebook.imageutils.JfifUtil;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbu {
    public static final zzbu zza = new zzbu(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbu(int i, int i2, float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbu) {
            zzbu zzbuVar = (zzbu) obj;
            if (this.zzb == zzbuVar.zzb && this.zzc == zzbuVar.zzc && this.zzd == zzbuVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb + JfifUtil.MARKER_EOI) * 31) + this.zzc) * 31) + Float.floatToRawIntBits(this.zzd);
    }
}
