package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgys extends zzgyr {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgyu.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgyu.class, "remainingField");

    private zzgys() {
        throw null;
    }

    /* synthetic */ zzgys(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zza, zzgyuVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final int zzb(zzgyu zzgyuVar) {
        return zzb.decrementAndGet(zzgyuVar);
    }
}
