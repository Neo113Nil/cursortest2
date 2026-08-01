package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfk {
    public static final zzfk zza = new zzfk(-1, -1);
    public static final zzfk zzb = new zzfk(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfk(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzef.zzd(z);
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfk) {
            zzfk zzfkVar = (zzfk) obj;
            if (this.zzc == zzfkVar.zzc && this.zzd == zzfkVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        return ((i >>> 16) | (i << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
