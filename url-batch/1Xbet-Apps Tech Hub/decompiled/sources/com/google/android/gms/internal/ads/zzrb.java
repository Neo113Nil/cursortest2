package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzrb implements zzps {
    final /* synthetic */ zzrc zza;

    /* synthetic */ zzrb(zzrc zzrcVar, zzra zzraVar) {
        this.zza = zzrcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zza(Exception exc) {
        zzpn zzpnVar;
        zzez.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzpnVar = this.zza.zzc;
        zzpnVar.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzps
    public final void zzb() {
        zzly zzlyVar;
        zzly zzlyVar2;
        zzrc zzrcVar = this.zza;
        zzlyVar = zzrcVar.zzl;
        if (zzlyVar != null) {
            zzlyVar2 = zzrcVar.zzl;
            zzlyVar2.zzb();
        }
    }
}
