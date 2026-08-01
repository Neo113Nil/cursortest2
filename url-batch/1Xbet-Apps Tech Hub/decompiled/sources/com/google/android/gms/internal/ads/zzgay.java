package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgay implements Runnable {
    final Future zza;
    final zzgax zzb;

    zzgay(Future future, zzgax zzgaxVar) {
        this.zza = future;
        this.zzb = zzgaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzgcd) && (zza = zzgce.zza((zzgcd) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgbb.zzp(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzftr zza = zzfts.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
