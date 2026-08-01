package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrq extends zzfsi {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfrq(String str, String str2, zzfrp zzfrpVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsi) {
            zzfsi zzfsiVar = (zzfsi) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfsiVar.zzb()) : zzfsiVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfsiVar.zza()) : zzfsiVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsi
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsi
    public final String zzb() {
        return this.zza;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
