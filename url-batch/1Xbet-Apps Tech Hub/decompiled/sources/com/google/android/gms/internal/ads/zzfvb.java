package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
class zzfvb implements Iterator {
    final Iterator zza;

    @CheckForNull
    Object zzb;

    @CheckForNull
    Collection zzc;
    Iterator zzd;
    final /* synthetic */ zzfvn zze;

    zzfvb(zzfvn zzfvnVar) {
        Map map;
        this.zze = zzfvnVar;
        map = zzfvnVar.zza;
        this.zza = map.entrySet().iterator();
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzfxd.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.zzd.remove();
        Collection collection = this.zzc;
        collection.getClass();
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        zzfvn zzfvnVar = this.zze;
        i = zzfvnVar.zzb;
        zzfvnVar.zzb = i - 1;
    }
}
