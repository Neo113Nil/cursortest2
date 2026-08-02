package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgcg implements Runnable {
    final Future zza;
    final zzgcf zzb;

    zzgcg(Future future, zzgcf zzgcfVar) {
        this.zza = future;
        this.zzb = zzgcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzgdm) && (zza = zzgdn.zza((zzgdm) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgcj.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfup zza = zzfuq.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
