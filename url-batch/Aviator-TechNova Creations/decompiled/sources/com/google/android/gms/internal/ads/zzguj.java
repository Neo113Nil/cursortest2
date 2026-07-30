package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzguj extends zzgwt {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgun zzd;

    zzguj(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzd = zzgunVar;
        this.zza = zzgunVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzguv.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgub) entry.getValue()).iterator();
        }
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(this.zzb), this.zzc.next());
    }
}
