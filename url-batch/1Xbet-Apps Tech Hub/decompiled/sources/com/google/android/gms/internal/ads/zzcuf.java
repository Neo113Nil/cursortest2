package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcuf implements zzgax {
    final /* synthetic */ zzgax zza;
    final /* synthetic */ zzcug zzb;

    zzcuf(zzcug zzcugVar, zzgax zzgaxVar) {
        this.zzb = zzcugVar;
        this.zza = zzgaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // java.lang.Runnable
            public final void run() {
                zzcug.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // java.lang.Runnable
            public final void run() {
                zzcug.this.zzd();
            }
        });
        this.zza.zzb((zzctr) obj);
    }
}
