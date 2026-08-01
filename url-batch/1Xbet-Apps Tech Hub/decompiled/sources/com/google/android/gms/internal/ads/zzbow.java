package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbow implements zzcch {
    final /* synthetic */ zzccf zza;
    final /* synthetic */ zzboa zzb;

    zzbow(zzboy zzboyVar, zzccf zzccfVar, zzboa zzboaVar) {
        this.zza = zzccfVar;
        this.zzb = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzboj("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
