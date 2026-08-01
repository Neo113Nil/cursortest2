package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcue implements zzgax {
    final /* synthetic */ zzgax zza;
    final /* synthetic */ zzcug zzb;

    zzcue(zzcug zzcugVar, zzgax zzgaxVar) {
        this.zzb = zzcugVar;
        this.zza = zzgaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // java.lang.Runnable
            public final void run() {
                zzcug.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcug.zzb(this.zzb, ((zzctz) obj).zza, this.zza);
    }
}
