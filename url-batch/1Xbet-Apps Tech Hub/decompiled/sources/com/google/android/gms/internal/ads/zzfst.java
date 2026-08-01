package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfst extends zzfsp {
    final /* synthetic */ zzfsz zza;

    zzfst(zzfsz zzfszVar) {
        this.zza = zzfszVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsp
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfso zzfsoVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfso zzfsoVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfsoVar2 = this.zza.zzc;
                    zzfsoVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfsz zzfszVar = this.zza;
            iInterface = zzfszVar.zzn;
            if (iInterface != null) {
                zzfsoVar = zzfszVar.zzc;
                zzfsoVar.zzc("Unbind from service.", new Object[0]);
                zzfsz zzfszVar2 = this.zza;
                context = zzfszVar2.zzb;
                serviceConnection = zzfszVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
