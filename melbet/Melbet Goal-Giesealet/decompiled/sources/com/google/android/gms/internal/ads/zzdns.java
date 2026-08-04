package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdns {
    private final zzcvq zza;
    private final zzcwz zzb;
    private final zzcxm zzc;
    private final zzcyd zzd;
    private final zzdaw zze;
    private final zzfcj zzf;
    private final zzfcm zzg;
    private final zzcmi zzh;

    public zzdns(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        this.zza = zzcvqVar;
        this.zzb = zzcwzVar;
        this.zzc = zzcxmVar;
        this.zzd = zzcydVar;
        this.zze = zzdawVar;
        this.zzf = zzfcjVar;
        this.zzg = zzfcmVar;
        this.zzh = zzcmiVar;
    }

    public final void zza(zzdnx zzdnxVar) {
        final zzcwz zzcwzVar = this.zzb;
        zzdnl zzk = zzdnxVar.zzk();
        Objects.requireNonNull(zzcwzVar);
        zzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final /* synthetic */ void zzl() {
                zzcwz.this.zzb();
            }
        });
        zzdnxVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
