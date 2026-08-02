package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzejp implements zzdgx {
    private final Context zza;
    private final zzdpl zzb;
    private final zzffg zzc;
    private final VersionInfoParcel zzd;
    private final zzfel zze;
    private final ListenableFuture zzf;
    private final zzcej zzg;
    private final zzbja zzh;
    private final boolean zzi;
    private final zzeds zzj;

    zzejp(Context context, zzdpl zzdplVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, zzfel zzfelVar, ListenableFuture listenableFuture, zzcej zzcejVar, zzbja zzbjaVar, boolean z, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = zzdplVar;
        this.zzc = zzffgVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfelVar;
        this.zzf = listenableFuture;
        this.zzg = zzcejVar;
        this.zzh = zzbjaVar;
        this.zzi = z;
        this.zzj = zzedsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzdgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzcxd zzcxdVar) {
        zzcej zzcejVar;
        zzcej zzcejVar2;
        zzdoq zzdoqVar = (zzdoq) zzgcj.zzq(this.zzf);
        try {
            zzfel zzfelVar = this.zze;
            if (this.zzg.zzaG()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaE)).booleanValue()) {
                    final zzcej zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbjp.zzb(zza, zzdoqVar.zzg());
                    final zzdpp zzdppVar = new zzdpp();
                    zzdppVar.zza(this.zza, (View) zza);
                    zzdoqVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null);
                    zza.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzejn
                        @Override // com.google.android.gms.internal.ads.zzcfz
                        public final void zza(boolean z2, int i, String str, String str2) {
                            zzdpp.this.zzb();
                            zzcej zzcejVar3 = zza;
                            zzcejVar3.zzab();
                            zzcejVar3.zzN().zzr();
                        }
                    });
                    zzcgb zzN = zza.zzN();
                    Objects.requireNonNull(zza);
                    zzN.zzH(new zzcga() { // from class: com.google.android.gms.internal.ads.zzejo
                        @Override // com.google.android.gms.internal.ads.zzcga
                        public final void zza() {
                            zzcej.this.zzaa();
                        }
                    });
                    zzfeq zzfeqVar = zzfelVar.zzs;
                    zza.zzae(zzfeqVar.zzb, zzfeqVar.zza, null);
                    zzcejVar = zza;
                    zzcejVar.zzaq(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzu.zzp();
                    Context context2 = this.zza;
                    boolean z2 = this.zzi;
                    boolean zzI = com.google.android.gms.ads.internal.util.zzt.zzI(context2);
                    boolean zzd = !z2 ? this.zzh.zzd() : false;
                    float zza2 = !this.zzi ? this.zzh.zza() : 0.0f;
                    zzfel zzfelVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, zzI, zzd, zza2, -1, z, zzfelVar2.zzO, zzfelVar2.zzP);
                    if (zzcxdVar != null) {
                        zzcxdVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzu.zzi();
                    zzdgm zzh = zzdoqVar.zzh();
                    zzfel zzfelVar3 = this.zze;
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    int i = zzfelVar3.zzQ;
                    String str = zzfelVar3.zzB;
                    zzfeq zzfeqVar2 = zzfelVar3.zzs;
                    String str2 = zzfeqVar2.zzb;
                    String str3 = zzfeqVar2.zza;
                    zzffg zzffgVar = this.zzc;
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcejVar, i, versionInfoParcel, str, zzkVar, str2, str3, zzffgVar.zzf, zzcxdVar, zzfelVar3.zzai ? this.zzj : null), true);
                }
                zzcejVar2 = this.zzg;
            } else {
                zzcejVar2 = this.zzg;
            }
            zzcejVar = zzcejVar2;
            zzcejVar.zzaq(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            Context context22 = this.zza;
            boolean z22 = this.zzi;
            boolean zzI2 = com.google.android.gms.ads.internal.util.zzt.zzI(context22);
            if (!z22) {
            }
            if (!this.zzi) {
            }
            zzfel zzfelVar22 = this.zze;
            com.google.android.gms.ads.internal.zzk zzkVar2 = new com.google.android.gms.ads.internal.zzk(zze, zzI2, zzd, zza2, -1, z, zzfelVar22.zzO, zzfelVar22.zzP);
            if (zzcxdVar != null) {
            }
            com.google.android.gms.ads.internal.zzu.zzi();
            zzdgm zzh2 = zzdoqVar.zzh();
            zzfel zzfelVar32 = this.zze;
            VersionInfoParcel versionInfoParcel2 = this.zzd;
            int i2 = zzfelVar32.zzQ;
            String str4 = zzfelVar32.zzB;
            zzfeq zzfeqVar22 = zzfelVar32.zzs;
            String str22 = zzfeqVar22.zzb;
            String str32 = zzfeqVar22.zza;
            zzffg zzffgVar2 = this.zzc;
            if (zzfelVar32.zzai) {
            }
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh2, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcejVar, i2, versionInfoParcel2, str4, zzkVar2, str22, str32, zzffgVar2.zzf, zzcxdVar, zzfelVar32.zzai ? this.zzj : null), true);
        } catch (zzcev e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }
}
