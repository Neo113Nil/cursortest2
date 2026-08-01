package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
class zzfvh extends zzfva implements SortedMap {

    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfvn zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvh(zzfvn zzfvnVar, SortedMap sortedMap) {
        super(zzfvnVar, sortedMap);
        this.zze = zzfvnVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfvh(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfvh(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfvh(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxo
    public SortedSet zzg() {
        return new zzfvi(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfva, com.google.android.gms.internal.ads.zzfxo, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet zzg = zzg();
        this.zzd = zzg;
        return zzg;
    }
}
