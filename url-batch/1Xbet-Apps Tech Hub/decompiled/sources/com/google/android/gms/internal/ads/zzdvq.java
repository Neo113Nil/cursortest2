package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdvq implements zzgax {
    final /* synthetic */ zzdvs zza;

    zzdvq(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        long j;
        zzccf zzccfVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdvs zzdvsVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdvsVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzccfVar = this.zza.zze;
            zzccfVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdvs zzdvsVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            j = this.zza.zzd;
            zzdvsVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvs.zzj(zzdvq.this.zza, str);
                }
            });
        }
    }
}
