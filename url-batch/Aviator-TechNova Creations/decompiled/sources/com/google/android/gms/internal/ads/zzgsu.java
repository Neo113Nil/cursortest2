package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
class zzgsu extends zzgss implements List {
    final /* synthetic */ zzgsv zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgsu(zzgsv zzgsvVar, Object obj, List list, zzgss zzgssVar) {
        super(zzgsvVar, obj, list, zzgssVar);
        Objects.requireNonNull(zzgsvVar);
        this.zzf = zzgsvVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgst(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zza();
        Object remove = ((List) this.zzb).remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zza();
        List subList = ((List) this.zzb).subList(i, i2);
        zzgss zzgssVar = this.zzc;
        if (zzgssVar == null) {
            zzgssVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzgssVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzgst(this, i);
    }
}
