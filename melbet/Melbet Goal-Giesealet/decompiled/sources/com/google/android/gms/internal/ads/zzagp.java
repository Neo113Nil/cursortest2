package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzagp {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagp(long j, long j2, int i) {
        zzghc.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagp zzagpVar = (zzagp) obj;
            if (this.zza == zzagpVar.zza && this.zzb == zzagpVar.zzb && this.zzc == zzagpVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzeo.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
