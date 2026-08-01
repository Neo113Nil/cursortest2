package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbny implements zzccj {
    final /* synthetic */ zzboa zza;

    zzbny(zzboa zzboaVar) {
        this.zza = zzboaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbof zzbofVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbofVar = this.zza.zzb;
        zzbofVar.zzd();
    }
}
