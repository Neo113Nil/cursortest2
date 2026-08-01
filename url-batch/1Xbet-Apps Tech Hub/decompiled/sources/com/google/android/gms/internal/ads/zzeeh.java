package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeeh extends zzefc {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzeeh(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, String str, String str2, zzeeg zzeegVar) {
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
        if (obj instanceof zzefc) {
            zzefc zzefcVar = (zzefc) obj;
            if (this.zza.equals(zzefcVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzefcVar.zzb()) : zzefcVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzefcVar.zzc()) : zzefcVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzefcVar.zzd()) : zzefcVar.zzd() == null)) {
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
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        return "OfflineUtilsParams{activity=" + this.zza.toString() + ", adOverlay=" + String.valueOf(zzlVar) + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzefc
    public final String zzd() {
        return this.zzd;
    }
}
