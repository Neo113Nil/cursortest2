package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfyg extends zzfwz {
    private final transient zzfwx zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzfyg(zzfwx zzfwxVar, Object[] objArr, int i, int i2) {
        this.zza = zzfwxVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp
    /* renamed from: zze */
    public final zzfyu iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    final zzfwu zzi() {
        return new zzfyf(this);
    }
}
