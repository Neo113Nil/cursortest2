package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgvx {
    private final Object zza;
    private final int zzb;

    zzgvx(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgvx)) {
            return false;
        }
        zzgvx zzgvxVar = (zzgvx) obj;
        return this.zza == zzgvxVar.zza && this.zzb == zzgvxVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
