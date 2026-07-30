package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfxk extends zzfxq {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfxk(String str, boolean z, int i, zzfxi zzfxiVar, int i2, byte[] bArr) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxq) {
            zzfxq zzfxqVar = (zzfxq) obj;
            if (this.zzb.equals(zzfxqVar.zza())) {
                zzfxqVar.zzb();
                int i = this.zzc;
                int zzd = zzfxqVar.zzd();
                if (i == 0) {
                    throw null;
                }
                if (i == zzd) {
                    zzfxqVar.zzc();
                    int i2 = this.zzd;
                    int zze = zzfxqVar.zze();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (zze == 1) {
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
            return (i2 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = AbstractJsonLexerKt.NULL;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str2.length() + 52 + str.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str2);
        sb.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zze() {
        return this.zzd;
    }
}
