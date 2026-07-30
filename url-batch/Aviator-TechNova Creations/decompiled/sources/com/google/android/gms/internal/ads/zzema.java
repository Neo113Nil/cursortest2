package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzema implements zzdmc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfir zzd;
    private final zzcjl zze;
    private final zzfjk zzf;
    private final zzbok zzg;
    private final boolean zzh;
    private final zzejf zzi;
    private final zzdxz zzj;

    zzema(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfirVar;
        this.zze = zzcjlVar;
        this.zzf = zzfjkVar;
        this.zzg = zzbokVar;
        this.zzh = z;
        this.zzi = zzejfVar;
        this.zzj = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        zzdko zzdkoVar = (zzdko) zzgzo.zzt(this.zzc);
        zzcjl zzcjlVar = this.zze;
        zzcjlVar.zzag(true);
        boolean z2 = this.zzh;
        boolean zzc = z2 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
        boolean z3 = z2 && this.zzg.zzd();
        float zze = z2 ? this.zzg.zze() : 0.0f;
        zzfir zzfirVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzN, z3, zze, -1, z, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzj = zzdkoVar.zzj();
        int i = zzfirVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str2 = zzfiwVar.zzb;
        String str3 = zzfiwVar.zza;
        zzfjk zzfjkVar = this.zzf;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfjkVar.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzi : null, zzcjlVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzd;
    }
}
