package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgzk implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzgzl zzb;

    zzgzk(zzgzl zzgzlVar) {
        zzgxe zzgxeVar;
        this.zzb = zzgzlVar;
        zzgxeVar = zzgzlVar.zza;
        this.zza = zzgxeVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
