package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzyk {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyl zzylVar) {
        zzc(zzylVar);
        this.zza.add(new zzyj(handler, zzylVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyj zzyjVar = (zzyj) it.next();
            z = zzyjVar.zzc;
            if (!z) {
                handler = zzyjVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyl zzylVar;
                        zzylVar = zzyj.this.zzb;
                        zzylVar.zzX(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzyl zzylVar) {
        zzyl zzylVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyj zzyjVar = (zzyj) it.next();
            zzylVar2 = zzyjVar.zzb;
            if (zzylVar2 == zzylVar) {
                zzyjVar.zzc();
                this.zza.remove(zzyjVar);
            }
        }
    }
}
