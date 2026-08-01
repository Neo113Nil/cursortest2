package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfnz extends zzfnv {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzfnz(String str, boolean z, boolean z2, zzfny zzfnyVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnv) {
            zzfnv zzfnvVar = (zzfnv) obj;
            if (this.zza.equals(zzfnvVar.zzb()) && this.zzb == zzfnvVar.zzd() && this.zzc == zzfnvVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final boolean zzd() {
        return this.zzb;
    }
}
