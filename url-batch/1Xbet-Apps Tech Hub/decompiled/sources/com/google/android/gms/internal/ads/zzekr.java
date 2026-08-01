package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzekr implements zzdig {
    private final Context zza;
    private final zzdqu zzb;
    private final zzfeq zzc;
    private final zzcbt zzd;
    private final zzfdu zze;
    private final ListenableFuture zzf;
    private final zzcgv zzg;
    private final zzbkf zzh;
    private final boolean zzi;
    private final zzefa zzj;

    zzekr(Context context, zzdqu zzdquVar, zzfeq zzfeqVar, zzcbt zzcbtVar, zzfdu zzfduVar, ListenableFuture listenableFuture, zzcgv zzcgvVar, zzbkf zzbkfVar, boolean z, zzefa zzefaVar) {
        this.zza = context;
        this.zzb = zzdquVar;
        this.zzc = zzfeqVar;
        this.zzd = zzcbtVar;
        this.zze = zzfduVar;
        this.zzf = listenableFuture;
        this.zzg = zzcgvVar;
        this.zzh = zzbkfVar;
        this.zzi = z;
        this.zzj = zzefaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzdig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
        zzcgv zzcgvVar;
        zzcgv zzcgvVar2;
        zzdpz zzdpzVar = (zzdpz) zzgbb.zzq(this.zzf);
        try {
            zzfdu zzfduVar = this.zze;
            if (this.zzg.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaL)).booleanValue()) {
                    final zzcgv zza = this.zzb.zza(this.zzc.zze, null, null);
                    zzbku.zzb(zza, zzdpzVar.zzg());
                    final zzdqy zzdqyVar = new zzdqy();
                    zzdqyVar.zza(this.zza, (View) zza);
                    zzdpzVar.zzl().zzi(zza, true, this.zzi ? this.zzh : null);
                    zza.zzN().zzA(new zzcig() { // from class: com.google.android.gms.internal.ads.zzekp
                        @Override // com.google.android.gms.internal.ads.zzcig
                        public final void zza(boolean z2, int i, String str, String str2) {
                            zzdqy.this.zzb();
                            zzcgv zzcgvVar3 = zza;
                            zzcgvVar3.zzY();
                            zzcgvVar3.zzN().zzq();
                        }
                    });
                    zza.zzN().zzG(new zzcih() { // from class: com.google.android.gms.internal.ads.zzekq
                        @Override // com.google.android.gms.internal.ads.zzcih
                        public final void zza() {
                            zzcgv.this.zzX();
                        }
                    });
                    zzfea zzfeaVar = zzfduVar.zzt;
                    zza.zzab(zzfeaVar.zzb, zzfeaVar.zza, null);
                    zzcgvVar = zza;
                    zzcgvVar.zzan(true);
                    boolean zze = !this.zzi ? this.zzh.zze(false) : false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    Context context2 = this.zza;
                    boolean z2 = this.zzi;
                    boolean zzH = com.google.android.gms.ads.internal.util.zzt.zzH(context2);
                    boolean zzd = !z2 ? this.zzh.zzd() : false;
                    float zza2 = !this.zzi ? this.zzh.zza() : 0.0f;
                    zzfdu zzfduVar2 = this.zze;
                    com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzH, zzd, zza2, -1, z, zzfduVar2.zzP, zzfduVar2.zzQ);
                    if (zzcyuVar != null) {
                        zzcyuVar.zzf();
                    }
                    com.google.android.gms.ads.internal.zzt.zzi();
                    zzdhv zzh = zzdpzVar.zzh();
                    zzfdu zzfduVar3 = this.zze;
                    zzcbt zzcbtVar = this.zzd;
                    int i = zzfduVar3.zzR;
                    String str = zzfduVar3.zzC;
                    zzfea zzfeaVar2 = zzfduVar3.zzt;
                    String str2 = zzfeaVar2.zzb;
                    String str3 = zzfeaVar2.zza;
                    zzfeq zzfeqVar = this.zzc;
                    com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcgvVar, i, zzcbtVar, str, zzjVar, str2, str3, zzfeqVar.zzf, zzcyuVar, zzfduVar3.zzaj ? this.zzj : null), true);
                }
                zzcgvVar2 = this.zzg;
            } else {
                zzcgvVar2 = this.zzg;
            }
            zzcgvVar = zzcgvVar2;
            zzcgvVar.zzan(true);
            if (!this.zzi) {
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            Context context22 = this.zza;
            boolean z22 = this.zzi;
            boolean zzH2 = com.google.android.gms.ads.internal.util.zzt.zzH(context22);
            if (!z22) {
            }
            float zza22 = !this.zzi ? this.zzh.zza() : 0.0f;
            zzfdu zzfduVar22 = this.zze;
            com.google.android.gms.ads.internal.zzj zzjVar2 = new com.google.android.gms.ads.internal.zzj(zze, zzH2, zzd, zza22, -1, z, zzfduVar22.zzP, zzfduVar22.zzQ);
            if (zzcyuVar != null) {
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzdhv zzh2 = zzdpzVar.zzh();
            zzfdu zzfduVar32 = this.zze;
            zzcbt zzcbtVar2 = this.zzd;
            int i2 = zzfduVar32.zzR;
            String str4 = zzfduVar32.zzC;
            zzfea zzfeaVar22 = zzfduVar32.zzt;
            String str22 = zzfeaVar22.zzb;
            String str32 = zzfeaVar22.zza;
            zzfeq zzfeqVar2 = this.zzc;
            if (zzfduVar32.zzaj) {
            }
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh2, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcgvVar, i2, zzcbtVar2, str4, zzjVar2, str22, str32, zzfeqVar2.zzf, zzcyuVar, zzfduVar32.zzaj ? this.zzj : null), true);
        } catch (zzchg e) {
            zzcbn.zzh("", e);
        }
    }
}
