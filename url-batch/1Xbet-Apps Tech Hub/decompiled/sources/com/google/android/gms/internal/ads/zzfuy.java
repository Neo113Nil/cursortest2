package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfuy extends zzfxl {
    final /* synthetic */ zzfva zza;

    zzfuy(zzfva zzfvaVar) {
        this.zza = zzfvaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfvt.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfuz(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfxl, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfva zzfvaVar = this.zza;
        zzfvn.zzo(zzfvaVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    final Map zza() {
        return this.zza;
    }
}
