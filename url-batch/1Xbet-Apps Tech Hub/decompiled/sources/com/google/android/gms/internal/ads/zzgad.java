package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgad extends zzgac {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    zzgad(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    final int zza(zzgag zzgagVar) {
        return this.zzb.decrementAndGet(zzgagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    final void zzb(zzgag zzgagVar, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            if (UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, zzgagVar, (Object) null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzgagVar) == null);
    }
}
