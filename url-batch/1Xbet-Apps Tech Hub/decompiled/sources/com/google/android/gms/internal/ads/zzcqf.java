package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcqf implements zzbkd {
    final /* synthetic */ zzcqg zza;

    zzcqf(zzcqg zzcqgVar) {
        this.zza = zzcqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcqg.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
                @Override // java.lang.Runnable
                public final void run() {
                    zzcql zzcqlVar;
                    zzcqlVar = zzcqf.this.zza.zzd;
                    zzcqlVar.zzj();
                }
            });
        }
    }
}
