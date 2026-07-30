package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ha implements Set {
    public final /* synthetic */ ka rtx2ld2ELZv4;

    public ha(ka kaVar) {
        this.rtx2ld2ELZv4 = kaVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.rtx2ld2ELZv4.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.rtx2ld2ELZv4.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.rtx2ld2ELZv4.OPXfSBeufaJ8(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        ka kaVar = this.rtx2ld2ELZv4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (kaVar.wdg6QnbFHrFF == set.size()) {
                return kaVar.OPXfSBeufaJ8(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = 0;
        for (int i2 = kaVar.wdg6QnbFHrFF - 1; i2 >= 0; i2--) {
            Object e9gEMXR7LXtO = kaVar.e9gEMXR7LXtO(i2);
            i += e9gEMXR7LXtO == null ? 0 : e9gEMXR7LXtO.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ga(this.rtx2ld2ELZv4, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ka kaVar = this.rtx2ld2ELZv4;
        int TSizfFm2Yiuu = kaVar.TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu < 0) {
            return false;
        }
        kaVar.a92UlCVFR9N8(TSizfFm2Yiuu);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.rtx2ld2ELZv4.wdg6QnbFHrFF(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(kaVar.e9gEMXR7LXtO(i2))) {
                kaVar.a92UlCVFR9N8(i2);
            }
        }
        return i != kaVar.wdg6QnbFHrFF;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.rtx2ld2ELZv4.wdg6QnbFHrFF;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = kaVar.e9gEMXR7LXtO(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = kaVar.e9gEMXR7LXtO(i2);
        }
        return objArr;
    }
}
