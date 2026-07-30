package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgvb extends zzgws {
    final /* synthetic */ zzgvc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvb(zzgvc zzgvcVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgvcVar);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
