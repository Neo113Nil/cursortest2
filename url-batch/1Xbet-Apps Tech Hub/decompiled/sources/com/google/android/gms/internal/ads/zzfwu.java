package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfwu<E> extends zzfwp<E> implements List<E>, RandomAccess {
    private static final zzfyv zza = new zzfws(zzfye.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzfwu() {
    }

    static zzfwu zzi(Object[] objArr, int i) {
        return i == 0 ? zzfye.zza : new zzfye(objArr, i);
    }

    public static zzfwu zzj(Collection collection) {
        if (!(collection instanceof zzfwp)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfyc.zzb(array, length);
            return zzi(array, length);
        }
        zzfwu zzd2 = ((zzfwp) collection).zzd();
        if (!zzd2.zzf()) {
            return zzd2;
        }
        Object[] array2 = zzd2.toArray();
        return zzi(array2, array2.length);
    }

    public static zzfwu zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfye.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfyc.zzb(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzfwu zzl() {
        return zzfye.zza;
    }

    public static zzfwu zzm(Object obj) {
        Object[] objArr = {obj};
        zzfyc.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzfwu zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfyc.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzfwu zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfyc.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzfwu zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfyc.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzfwu zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfyc.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzftt.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzftt.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    @Deprecated
    public final zzfwu zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    /* renamed from: zze */
    public final zzfyu iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfwu subList(int i, int i2) {
        zzfty.zzh(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzfye.zza : new zzfwt(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzfyv listIterator(int i) {
        zzfty.zzb(i, size(), FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new zzfws(this, i);
    }
}
