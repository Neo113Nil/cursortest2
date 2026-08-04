package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeii implements zzdgp {
    private final Context zza;
    private final zzdpi zzb;
    private final zzfdc zzc;
    private final VersionInfoParcel zzd;
    private final zzfcj zze;
    private final ListenableFuture zzf;
    private final zzcek zzg;
    private final zzbjo zzh;
    private final boolean zzi;
    private final zzecy zzj;
    private final zzdsg zzk;
    private final zzdsm zzl;

    zzeii(Context context, zzdpi zzdpiVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, ListenableFuture listenableFuture, zzcek zzcekVar, zzbjo zzbjoVar, boolean z, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdpiVar;
        this.zzc = zzfdcVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfcjVar;
        this.zzf = listenableFuture;
        this.zzg = zzcekVar;
        this.zzh = zzbjoVar;
        this.zzi = z;
        this.zzj = zzecyVar;
        this.zzk = zzdsgVar;
        this.zzl = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) {
        zzdon zzdonVar = (zzdon) zzgot.zzs(this.zzf);
        try {
            zzfcj zzfcjVar = this.zze;
            final zzcek zzcekVar = this.zzg;
            if (zzcekVar.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbc)).booleanValue()) {
                    zzcekVar = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbke.zzb(zzcekVar, zzdonVar.zzk());
                    final zzdpm zzdpmVar = new zzdpm();
                    zzdpmVar.zza(this.zza, zzcekVar.zzE());
                    zzdonVar.zzl().zzi(zzcekVar, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzeih
                        @Override // com.google.android.gms.internal.ads.zzcgg
                        public final /* synthetic */ void zza(boolean z2, int i, String str, String str2) {
                            zzdpm.this.zzb();
                            zzcek zzcekVar2 = zzcekVar;
                            zzcekVar2.zzJ();
                            zzcekVar2.zzP().zzq();
                        }
                    });
                    zzcgi zzP = zzcekVar.zzP();
                    Objects.requireNonNull(zzcekVar);
                    zzP.zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzeig
                        @Override // com.google.android.gms.internal.ads.zzcgh
                        public final /* synthetic */ void zza() {
                            zzcek.this.zzI();
                        }
                    });
                    zzfco zzfcoVar = zzfcjVar.zzs;
                    zzcekVar.zzau(zzfcoVar.zzb, zzfcoVar.zza, null);
                }
            }
            zzcek zzcekVar2 = zzcekVar;
            zzcekVar2.zzag(true);
            boolean z2 = this.zzi;
            boolean z3 = false;
            boolean zzc = z2 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zzM = com.google.android.gms.ads.internal.util.zzs.zzM(this.zza);
            if (z2 && this.zzh.zzd()) {
                z3 = true;
            }
            float zze = z2 ? this.zzh.zze() : 0.0f;
            zzfcj zzfcjVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, zzM, z3, zze, -1, z, zzfcjVar2.zzO, zzfcjVar2.zzP);
            if (zzcwfVar != null) {
                zzcwfVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdge zzj = zzdonVar.zzj();
            int i = zzfcjVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfcjVar2.zzB;
            zzfco zzfcoVar2 = zzfcjVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcekVar2, i, versionInfoParcel, str, zzlVar, zzfcoVar2.zzb, zzfcoVar2.zza, this.zzc.zzg, zzcwfVar, zzfcjVar2.zzb() ? this.zzj : null, zzcekVar2.zzn()), true, this.zzl);
        } catch (zzcez e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zze;
    }
}
