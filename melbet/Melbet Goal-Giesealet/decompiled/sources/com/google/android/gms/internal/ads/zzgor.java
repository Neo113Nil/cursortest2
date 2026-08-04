package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgor implements Runnable {
    final Future zza;
    final zzgoq zzb;

    zzgor(Future future, zzgoq zzgoqVar) {
        this.zza = future;
        this.zzb = zzgoqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzgpv) && (zza = zzgpw.zza((zzgpv) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgot.zzr(future));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzggy zzb = zzggz.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}
