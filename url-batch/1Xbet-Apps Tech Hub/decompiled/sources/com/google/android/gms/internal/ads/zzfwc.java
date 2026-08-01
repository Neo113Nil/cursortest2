package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfwc extends AbstractCollection {
    final /* synthetic */ zzfwd zza;

    zzfwc(zzfwd zzfwdVar) {
        this.zza = zzfwdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfwd zzfwdVar = this.zza;
        Map zzj = zzfwdVar.zzj();
        return zzj != null ? zzj.values().iterator() : new zzfvw(zzfwdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
