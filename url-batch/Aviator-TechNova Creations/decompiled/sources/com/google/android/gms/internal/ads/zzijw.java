package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzijw implements Iterator {
    int zza = 0;
    final /* synthetic */ zzijx zzb;

    zzijw(zzijx zzijxVar) {
        this.zzb = zzijxVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        zzijx zzijxVar = this.zzb;
        return i < zzijxVar.zza.size() || zzijxVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zza;
        zzijx zzijxVar = this.zzb;
        List list = zzijxVar.zza;
        if (i >= list.size()) {
            list.add(zzijxVar.zzb.next());
            return next();
        }
        int i2 = this.zza;
        this.zza = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
