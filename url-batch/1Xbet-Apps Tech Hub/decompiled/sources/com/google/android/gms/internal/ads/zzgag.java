package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzp;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzgag extends zzfzp.zzi {
    private static final zzgac zzbb;
    private static final Logger zzbc = Logger.getLogger(zzgag.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgac zzgafVar;
        Throwable th;
        zzgae zzgaeVar = null;
        try {
            zzgafVar = new zzgad(AtomicReferenceFieldUpdater.newUpdater(zzgag.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgag.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzgafVar = new zzgaf(zzgaeVar);
            th = e;
        }
        zzbb = zzgafVar;
        if (th != null) {
            zzbc.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgag(int i) {
        this.remaining = i;
    }

    final int zzA() {
        return zzbb.zza(this);
    }

    final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbb.zzb(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
