package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfmc implements Runnable {
    final /* synthetic */ zzfmd zza;

    zzfmc(zzfmd zzfmdVar) {
        Objects.requireNonNull(zzfmdVar);
        this.zza = zzfmdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmd zzfmdVar = this.zza;
        AtomicBoolean zzf = zzfmdVar.zzf();
        float zzc = zzfmdVar.zzc();
        zzf.set(false);
        if (((Float) zzfmdVar.zze().getAndSet(Float.valueOf(zzc))).floatValue() != zzc) {
            zzfmdVar.zzd().post(new zzfmb(this, zzc));
        }
    }
}
