package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzboe implements zzccj {
    final /* synthetic */ zzbof zza;

    zzboe(zzbof zzbofVar) {
        this.zza = zzbofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbnb zzbnbVar = (zzbnb) obj;
        zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                zzbnb zzbnbVar2 = zzbnbVar;
                zzbnbVar2.zzr("/result", zzbkc.zzo);
                zzbnbVar2.zzc();
            }
        });
    }
}
