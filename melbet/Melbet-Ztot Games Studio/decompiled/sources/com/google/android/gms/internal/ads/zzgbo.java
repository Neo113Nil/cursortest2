package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
abstract class zzgbo extends zzgax.zzi {
    private static final zzgbk zzbd;
    private static final zzgct zzbe = new zzgct(zzgbo.class);
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgbk zzgbnVar;
        Throwable th;
        zzgbm zzgbmVar = null;
        try {
            zzgbnVar = new zzgbl(AtomicReferenceFieldUpdater.newUpdater(zzgbo.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbo.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgbnVar = new zzgbn(zzgbmVar);
            th = th2;
        }
        zzbd = zzgbnVar;
        if (th != null) {
            zzbe.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgbo(int i) {
        this.remaining = i;
    }

    final int zzA() {
        return zzbd.zza(this);
    }

    final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbd.zzb(this, null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptions);
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
