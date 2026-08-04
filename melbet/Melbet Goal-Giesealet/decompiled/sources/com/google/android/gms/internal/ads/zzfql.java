package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfql extends zzfqr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfql(String str, boolean z, int i, zzfqi zzfqiVar, zzfqj zzfqjVar, int i2, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqr) {
            zzfqr zzfqrVar = (zzfqr) obj;
            if (this.zzb.equals(zzfqrVar.zza())) {
                zzfqrVar.zzb();
                int i = this.zzc;
                int zze = zzfqrVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == zze) {
                    zzfqrVar.zzc();
                    zzfqrVar.zzd();
                    int i2 = this.zzd;
                    int zzf = zzfqrVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final zzfqj zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqr
    public final int zzf() {
        return this.zzd;
    }
}
