package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzrl {
    public final int zza;
    public final zzuk zzb;
    private final CopyOnWriteArrayList zzc;

    public zzrl() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzrl(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzuk zzukVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzukVar;
    }

    public final zzrl zza(int i, zzuk zzukVar) {
        return new zzrl(this.zzc, 0, zzukVar);
    }

    public final void zzb(Handler handler, zzrm zzrmVar) {
        this.zzc.add(new zzrk(handler, zzrmVar));
    }

    public final void zzc(zzrm zzrmVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzrk zzrkVar = (zzrk) it.next();
            if (zzrkVar.zzb == zzrmVar) {
                this.zzc.remove(zzrkVar);
            }
        }
    }
}
