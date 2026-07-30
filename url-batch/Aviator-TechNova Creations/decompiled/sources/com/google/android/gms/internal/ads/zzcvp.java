package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcvp implements zzbde {
    private final zzcjl zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    zzcvp(zzcjl zzcjlVar, Executor executor) {
        this.zza = zzcjlVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized void zzdj(zzbdd zzbddVar) {
        final zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzob)).booleanValue()) {
                if (zzbddVar.zzj) {
                    if (!Boolean.TRUE.equals(this.zzc.getAndSet(true))) {
                        Executor executor = this.zzb;
                        Objects.requireNonNull(zzcjlVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvo
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcjl.this.onResume();
                            }
                        });
                    }
                } else {
                    if (!Boolean.FALSE.equals(this.zzc.getAndSet(false))) {
                        Executor executor2 = this.zzb;
                        Objects.requireNonNull(zzcjlVar);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvn
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcjl.this.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
