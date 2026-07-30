package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcsm implements zzboh {
    final /* synthetic */ zzcsn zza;

    zzcsm(zzcsn zzcsnVar) {
        Objects.requireNonNull(zzcsnVar);
        this.zza = zzcsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        zzcsn zzcsnVar = this.zza;
        if (zzcsnVar.zze(map)) {
            zzcsnVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcsm.this.zza.zzg().zzm();
                }
            });
        }
    }
}
