package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
class zzfvm extends zzfvk implements List {
    final /* synthetic */ zzfvn zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfvm(zzfvn zzfvnVar, Object obj, @CheckForNull List list, zzfvk zzfvkVar) {
        super(zzfvnVar, obj, list, zzfvkVar);
        this.zzf = zzfvnVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfvn zzfvnVar = this.zzf;
        i2 = zzfvnVar.zzb;
        zzfvnVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzfvn zzfvnVar = this.zzf;
        i2 = zzfvnVar.zzb;
        zzfvnVar.zzb = i2 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfvl(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfvn zzfvnVar = this.zzf;
        i2 = zzfvnVar.zzb;
        zzfvnVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        zzfvk zzfvkVar = this.zzc;
        if (zzfvkVar == null) {
            zzfvkVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfvkVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfvl(this, i);
    }
}
