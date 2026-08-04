package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdoc {
    private final zzcvq zza;
    private final zzcwz zzb;
    private final zzcxm zzc;
    private final zzcyd zzd;
    private final zzdaw zze;
    private final zzddx zzf;
    private final zzdsm zzg;
    private final zzfjv zzh;
    private final zzecn zzi;
    private final zzcmi zzj;

    zzdoc(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, zzddx zzddxVar, zzdsm zzdsmVar, zzfjv zzfjvVar, zzecn zzecnVar, zzcmi zzcmiVar) {
        this.zza = zzcvqVar;
        this.zzb = zzcwzVar;
        this.zzc = zzcxmVar;
        this.zzd = zzcydVar;
        this.zze = zzdawVar;
        this.zzf = zzddxVar;
        this.zzg = zzdsmVar;
        this.zzh = zzfjvVar;
        this.zzi = zzecnVar;
        this.zzj = zzcmiVar;
    }

    public final void zza(zzdod zzdodVar, zzcek zzcekVar) {
        zzdoa zzb = zzdodVar.zzb();
        final zzcwz zzcwzVar = this.zzb;
        Objects.requireNonNull(zzcwzVar);
        zzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdob
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final /* synthetic */ void zzl() {
                zzcwz.this.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkW)).booleanValue() || zzcekVar == null || zzcekVar.zzP() == null) {
            return;
        }
        zzcgi zzP = zzcekVar.zzP();
        zzcmi zzcmiVar = this.zzj;
        zzecn zzecnVar = this.zzi;
        zzP.zzd(zzcmiVar, zzecnVar, this.zzh);
        zzP.zze(zzcmiVar, zzecnVar, this.zzg);
    }
}
