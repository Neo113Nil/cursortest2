package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcpm implements zzcwm {
    private final zzcek zza;
    private final zzdsm zzb;
    private final zzfcj zzc;

    zzcpm(zzcek zzcekVar, zzdsm zzdsmVar, zzfcj zzfcjVar) {
        this.zza = zzcekVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || (zzcekVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcekVar.zzE()) ? "0" : "1";
        zzdsl zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
