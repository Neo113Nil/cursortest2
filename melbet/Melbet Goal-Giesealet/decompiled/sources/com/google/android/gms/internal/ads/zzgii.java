package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
class zzgii implements Iterator {
    final Iterator zza;
    Collection zzb;
    Iterator zzc;
    final /* synthetic */ zzgiu zzd;

    zzgii(zzgiu zzgiuVar) {
        Objects.requireNonNull(zzgiuVar);
        this.zzd = zzgiuVar;
        this.zza = zzgiuVar.zzo().entrySet().iterator();
        this.zzb = null;
        this.zzc = zzgkh.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzc.remove();
        if (((Collection) Objects.requireNonNull(this.zzb)).isEmpty()) {
            this.zza.remove();
        }
        this.zzd.zzq(r0.zzp() - 1);
    }
}
