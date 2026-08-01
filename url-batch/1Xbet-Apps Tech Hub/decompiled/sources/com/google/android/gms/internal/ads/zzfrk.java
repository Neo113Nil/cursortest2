package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfrk extends zzfsd {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* synthetic */ zzfrk(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, zzfrj zzfrjVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i3;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsd) {
            zzfsd zzfsdVar = (zzfsd) obj;
            if (this.zza.equals(zzfsdVar.zze())) {
                zzfsdVar.zzk();
                String str = this.zzb;
                if (str != null ? str.equals(zzfsdVar.zzg()) : zzfsdVar.zzg() == null) {
                    if (this.zzc == zzfsdVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfsdVar.zza())) {
                        zzfsdVar.zzb();
                        zzfsdVar.zzi();
                        if (this.zze == zzfsdVar.zzd()) {
                            zzfsdVar.zzh();
                            String str2 = this.zzf;
                            if (str2 != null ? str2.equals(zzfsdVar.zzf()) : zzfsdVar.zzf() == null) {
                                zzfsdVar.zzj();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = (((((((hashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i = this.zze;
        String str2 = this.zzf;
        return ((((hashCode2 * 583896283) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.zza.toString() + ", stableSessionToken=false, appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final int zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final IBinder zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    public final boolean zzk() {
        return false;
    }
}
