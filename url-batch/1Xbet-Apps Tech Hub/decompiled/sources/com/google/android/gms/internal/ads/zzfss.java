package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfss extends zzfsp {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfsp zzb;
    final /* synthetic */ zzfsz zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfss(zzfsz zzfszVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfsp zzfspVar) {
        super(taskCompletionSource);
        this.zzc = zzfszVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfspVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsp
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfso zzfsoVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfsz.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfsoVar = this.zzc.zzc;
                zzfsoVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfsz.zzp(this.zzc, this.zzb);
        }
    }
}
