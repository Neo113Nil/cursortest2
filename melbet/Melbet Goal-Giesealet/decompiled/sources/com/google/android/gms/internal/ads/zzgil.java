package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgil extends zzgio implements NavigableMap {
    final /* synthetic */ zzgiu zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgil(zzgiu zzgiuVar, NavigableMap navigableMap) {
        super(zzgiuVar, navigableMap);
        Objects.requireNonNull(zzgiuVar);
        this.zzc = zzgiuVar;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.zza)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return zzb(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzgil(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.zza)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return zzb(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.zza)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return zzb(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgio, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.zza)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return zzb(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgio, com.google.android.gms.internal.ads.zzgih, com.google.android.gms.internal.ads.zzgkv, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.zza)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return zzb(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.zza)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return zzb(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgio, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgio, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzgiu zzgiuVar = this.zzc;
        Collection zzc = zzgiuVar.zzc();
        zzc.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), zzgiuVar.zza(zzc));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio, com.google.android.gms.internal.ads.zzgkv
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzh() {
        return new zzgim(this.zzc, (NavigableMap) ((SortedMap) this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    /* renamed from: zzf */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    final /* synthetic */ SortedMap zzg() {
        return (NavigableMap) ((SortedMap) this.zza);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new zzgil(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzgil(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new zzgil(this.zzc, ((NavigableMap) ((SortedMap) this.zza)).tailMap(obj, z));
    }
}
