package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcqd implements zzbkd {
    final /* synthetic */ zzcqg zza;

    zzcqd(zzcqg zzcqgVar) {
        this.zza = zzcqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcqg.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqc
                @Override // java.lang.Runnable
                public final void run() {
                    zzcql zzcqlVar;
                    zzcqlVar = zzcqd.this.zza.zzd;
                    zzcqlVar.zzg();
                }
            });
        }
    }
}
