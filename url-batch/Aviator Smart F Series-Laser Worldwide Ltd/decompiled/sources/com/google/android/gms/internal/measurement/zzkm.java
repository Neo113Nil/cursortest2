package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkm {
    private final Object zza;
    private final int zzb;

    zzkm(Object obj, int i8) {
        this.zza = obj;
        this.zzb = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        return this.zza == zzkmVar.zza && this.zzb == zzkmVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
