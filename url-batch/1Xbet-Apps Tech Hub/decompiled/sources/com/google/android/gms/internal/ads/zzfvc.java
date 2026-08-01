package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfvc implements Iterator {

    @CheckForNull
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzfvd zzc;

    zzfvc(zzfvd zzfvdVar, Iterator it) {
        this.zzc = zzfvdVar;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzfty.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        zzfvn zzfvnVar = this.zzc.zza;
        i = zzfvnVar.zzb;
        zzfvnVar.zzb = i - collection.size();
        collection.clear();
        this.zza = null;
    }
}
