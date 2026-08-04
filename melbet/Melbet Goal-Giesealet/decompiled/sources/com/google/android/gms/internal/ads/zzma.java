package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzma extends IllegalStateException {
    public final int zza;

    public zzma(int i) {
        super(i != 0 ? "Player stuck buffering with no progress" : "Player stuck buffering and not loading");
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((zzma) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }
}
