package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrh extends zzfrs {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfrh(String str, String str2, zzfrg zzfrgVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrs) {
            zzfrs zzfrsVar = (zzfrs) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfrsVar.zzb()) : zzfrsVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfrsVar.zza()) : zzfrsVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
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
