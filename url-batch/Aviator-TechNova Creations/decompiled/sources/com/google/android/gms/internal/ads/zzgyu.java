package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzgyu extends zzgyh.zzf {
    private static final zzgyr zzbn;
    private static final zzgzw zzbo = new zzgzw(zzgyu.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgyr zzgytVar;
        byte[] bArr = null;
        try {
            zzgytVar = new zzgys(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgytVar = new zzgyt(bArr);
        }
        zzbn = zzgytVar;
        if (th != null) {
            zzbo.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgyu(int i) {
        this.remainingField = i;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbn.zza(this, null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    final int zzC() {
        return zzbn.zzb(this);
    }

    abstract void zzf(Set set);
}
