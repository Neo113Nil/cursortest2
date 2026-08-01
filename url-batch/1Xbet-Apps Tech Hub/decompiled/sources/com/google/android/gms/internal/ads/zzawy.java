package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzawy {
    final long zza;
    final String zzb;
    final int zzc;

    zzawy(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzawy)) {
            zzawy zzawyVar = (zzawy) obj;
            if (zzawyVar.zza == this.zza && zzawyVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
