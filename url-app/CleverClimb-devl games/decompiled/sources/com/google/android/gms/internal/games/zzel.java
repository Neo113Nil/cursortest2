package com.google.android.gms.internal.games;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zzel {
    private final AtomicReference<zzej> zzkw = new AtomicReference<>();

    public final void flush() {
        zzej zzejVar = this.zzkw.get();
        if (zzejVar != null) {
            zzejVar.flush();
        }
    }

    public final void zza(String str, int i) {
        zzej zzejVar = this.zzkw.get();
        if (zzejVar == null) {
            zzejVar = zzbe();
            if (!this.zzkw.compareAndSet(null, zzejVar)) {
                zzejVar = this.zzkw.get();
            }
        }
        zzejVar.zzg(str, i);
    }

    protected abstract zzej zzbe();
}
