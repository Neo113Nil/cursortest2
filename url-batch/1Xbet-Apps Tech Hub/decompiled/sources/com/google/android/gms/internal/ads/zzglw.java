package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzglw {
    private final Class zza;
    private final zzguk zzb;

    /* synthetic */ zzglw(Class cls, zzguk zzgukVar, zzglv zzglvVar) {
        this.zza = cls;
        this.zzb = zzgukVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglw)) {
            return false;
        }
        zzglw zzglwVar = (zzglw) obj;
        return zzglwVar.zza.equals(this.zza) && zzglwVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzguk zzgukVar = this.zzb;
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(zzgukVar);
    }
}
