package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzedi {
    private final zzede zza;
    private final zzgbl zzb;

    public zzedi(zzede zzedeVar, zzgbl zzgblVar) {
        this.zza = zzedeVar;
        this.zzb = zzgblVar;
    }

    public final void zza(zzfhx zzfhxVar) {
        final zzede zzedeVar = this.zza;
        zzgbb.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzede.this.getWritableDatabase();
            }
        }), new zzedh(this, zzfhxVar), this.zzb);
    }
}
