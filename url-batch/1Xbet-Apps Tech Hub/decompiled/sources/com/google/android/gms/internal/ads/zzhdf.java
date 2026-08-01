package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzhdf implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhdg zzb;

    zzhdf(zzhdg zzhdgVar) {
        this.zzb = zzhdgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhdg zzhdgVar = this.zzb;
            zzhdgVar.zza.add(zzhdgVar.zzb.next());
            return next();
        }
        zzhdg zzhdgVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzhdgVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
