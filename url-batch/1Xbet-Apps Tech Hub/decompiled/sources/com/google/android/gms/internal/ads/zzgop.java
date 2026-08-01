package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgop {
    public static final zzgop zza = new zzgon().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgop) {
            return this.zzb.equals(((zzgop) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
