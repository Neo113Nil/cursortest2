package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzcqw implements zzaxw {
    private final zzcej zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcqw(zzcej zzcejVar, Executor executor) {
        this.zza = zzcejVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final synchronized void zzdp(zzaxv zzaxvVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlF)).booleanValue()) {
                if (zzaxvVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        final zzcej zzcejVar = this.zza;
                        Objects.requireNonNull(zzcejVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcej.this.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaxvVar.zzj) {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        final zzcej zzcejVar2 = this.zza;
                        Objects.requireNonNull(zzcejVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcej.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
