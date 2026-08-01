package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzwq {
    public final long zza;
    public final long zzb;

    public zzwq(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwq)) {
            return false;
        }
        zzwq zzwqVar = (zzwq) obj;
        return this.zza == zzwqVar.zza && this.zzb == zzwqVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
