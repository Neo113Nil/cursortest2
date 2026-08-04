package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeft implements zzdgp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfcj zzd;
    private final zzcek zze;
    private final zzfdc zzf;
    private final zzbjo zzg;
    private final boolean zzh;
    private final zzecy zzi;
    private final zzdsm zzj;

    zzeft(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfcj zzfcjVar, zzcek zzcekVar, zzfdc zzfdcVar, boolean z, zzbjo zzbjoVar, zzecy zzecyVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfcjVar;
        this.zze = zzcekVar;
        this.zzf = zzfdcVar;
        this.zzg = zzbjoVar;
        this.zzh = z;
        this.zzi = zzecyVar;
        this.zzj = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) {
        zzdfb zzdfbVar = (zzdfb) zzgot.zzs(this.zzc);
        zzcek zzcekVar = this.zze;
        zzcekVar.zzag(true);
        boolean z2 = this.zzh;
        boolean zzc = z2 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzM = com.google.android.gms.ads.internal.util.zzs.zzM(this.zza);
        boolean z3 = z2 && this.zzg.zzd();
        float zze = z2 ? this.zzg.zze() : 0.0f;
        zzfcj zzfcjVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzM, z3, zze, -1, z, zzfcjVar.zzO, false);
        if (zzcwfVar != null) {
            zzcwfVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdge zzj = zzdfbVar.zzj();
        int i = zzfcjVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfcjVar.zzB;
        zzfco zzfcoVar = zzfcjVar.zzs;
        String str2 = zzfcoVar.zzb;
        String str3 = zzfcoVar.zza;
        zzfdc zzfdcVar = this.zzf;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcekVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfdcVar.zzg, zzcwfVar, zzfcjVar.zzb() ? this.zzi : null, zzcekVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzd;
    }
}
