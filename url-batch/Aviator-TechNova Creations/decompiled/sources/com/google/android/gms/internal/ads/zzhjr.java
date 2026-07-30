package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhjr {
    public static final zzhjr zza = new zzhjq().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhjr) {
            return this.zzb.equals(((zzhjr) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
