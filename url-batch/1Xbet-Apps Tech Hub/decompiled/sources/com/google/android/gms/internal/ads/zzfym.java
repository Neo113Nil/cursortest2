package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfym extends zzfyd implements Serializable {
    final zzfyd zza;

    zzfym(zzfyd zzfydVar) {
        this.zza = zzfydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfym) {
            return this.zza.equals(((zzfym) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfyd
    public final zzfyd zza() {
        return this.zza;
    }
}
