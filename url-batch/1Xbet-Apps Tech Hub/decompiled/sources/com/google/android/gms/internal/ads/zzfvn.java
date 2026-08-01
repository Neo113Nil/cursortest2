package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzfvn extends zzfvq implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfvn(Map map) {
        zzfty.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(zzfvn zzfvnVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfvnVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfvnVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    final Collection zzf() {
        return new zzfvp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    final Iterator zzg() {
        return new zzfux(this);
    }

    final List zzh(Object obj, List list, @CheckForNull zzfvk zzfvkVar) {
        return list instanceof RandomAccess ? new zzfvg(this, obj, list, zzfvkVar) : new zzfvm(this, obj, list, zzfvkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    Map zzj() {
        throw null;
    }

    final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfve(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfvh(this, (SortedMap) map) : new zzfva(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    Set zzl() {
        throw null;
    }

    final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfvf(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfvi(this, (SortedMap) map) : new zzfvd(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq, com.google.android.gms.internal.ads.zzfxq
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection zza = zza();
        if (!zza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, zza);
        return true;
    }
}
