package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zziba {
    private final Object zza;
    private final int zzb;

    zziba(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziba)) {
            return false;
        }
        zziba zzibaVar = (zziba) obj;
        return this.zza == zzibaVar.zza && this.zzb == zzibaVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
