package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzftc implements Runnable {
    final /* synthetic */ zzftd zza;

    zzftc(zzftd zzftdVar) {
        Objects.requireNonNull(zzftdVar);
        this.zza = zzftdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzftd zzftdVar = this.zza;
        AtomicBoolean zzf = zzftdVar.zzf();
        float zzc = zzftdVar.zzc();
        zzf.set(false);
        if (((Float) zzftdVar.zze().getAndSet(Float.valueOf(zzc))).floatValue() != zzc) {
            zzftdVar.zzd().post(new zzftb(this, zzc));
        }
    }
}
