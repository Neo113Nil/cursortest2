package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class zzwk {
    private final ConcurrentHashMap<zzwl, List<Throwable>> zzbnc = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzbnd = new ReferenceQueue<>();

    zzwk() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.zzbnd.poll();
            if (poll == null) {
                return this.zzbnc.get(new zzwl(th, null));
            }
            this.zzbnc.remove(poll);
        }
    }
}
