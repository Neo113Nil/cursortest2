package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjb {
    private final Executor zza;
    private final zzcbs zzb;

    public zzfjb(Executor executor, zzcbs zzcbsVar) {
        this.zza = executor;
        this.zzb = zzcbsVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(final String str) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // java.lang.Runnable
            public final void run() {
                zzfjb.this.zza(str);
            }
        });
    }
}
