package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzazq {
    final long zza;
    final String zzb;
    final int zzc;

    zzazq(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazq)) {
            return false;
        }
        zzazq zzazqVar = (zzazq) obj;
        return zzazqVar.zza == this.zza && zzazqVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
