package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfji {
    public final String zza;
    public final String zzb;

    public zzfji(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfji)) {
            return false;
        }
        zzfji zzfjiVar = (zzfji) obj;
        return this.zza.equals(zzfjiVar.zza) && this.zzb.equals(zzfjiVar.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
