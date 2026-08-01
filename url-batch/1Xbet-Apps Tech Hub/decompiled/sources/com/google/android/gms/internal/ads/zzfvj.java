package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
class zzfvj implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfvk zzc;

    zzfvj(zzfvk zzfvkVar) {
        this.zzc = zzfvkVar;
        this.zzb = zzfvkVar.zzb;
        Collection collection = zzfvkVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    zzfvj(zzfvk zzfvkVar, Iterator it) {
        this.zzc = zzfvkVar;
        this.zzb = zzfvkVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zza.remove();
        zzfvn zzfvnVar = this.zzc.zze;
        i = zzfvnVar.zzb;
        zzfvnVar.zzb = i - 1;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
