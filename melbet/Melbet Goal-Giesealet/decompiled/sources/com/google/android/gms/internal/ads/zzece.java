package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzece extends zzeda {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzece(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeda) {
            zzeda zzedaVar = (zzeda) obj;
            if (this.zza.equals(zzedaVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzedaVar.zzb()) : zzedaVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzedaVar.zzc()) : zzedaVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzedaVar.zzd()) : zzedaVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        int length2 = String.valueOf(valueOf).length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeda
    public final String zzd() {
        return this.zzd;
    }
}
