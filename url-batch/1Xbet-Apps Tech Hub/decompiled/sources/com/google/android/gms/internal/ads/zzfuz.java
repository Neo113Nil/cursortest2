package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfuz implements Iterator {
    final Iterator zza;

    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzfva zzc;

    zzfuz(zzfva zzfvaVar) {
        this.zzc = zzfvaVar;
        this.zza = zzfvaVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        zzfty.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfvn zzfvnVar = this.zzc.zzb;
        i = zzfvnVar.zzb;
        zzfvnVar.zzb = i - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
