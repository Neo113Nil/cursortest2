package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ja implements Collection {
    public final /* synthetic */ ka rtx2ld2ELZv4;

    public ja(ka kaVar) {
        this.rtx2ld2ELZv4 = kaVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.rtx2ld2ELZv4.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.rtx2ld2ELZv4.PxuCJdSBwIXG(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ga(this.rtx2ld2ELZv4, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ka kaVar = this.rtx2ld2ELZv4;
        int PxuCJdSBwIXG = kaVar.PxuCJdSBwIXG(obj);
        if (PxuCJdSBwIXG < 0) {
            return false;
        }
        kaVar.a92UlCVFR9N8(PxuCJdSBwIXG);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(kaVar.rtx2ld2ELZv4(i2))) {
                kaVar.a92UlCVFR9N8(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(kaVar.rtx2ld2ELZv4(i2))) {
                kaVar.a92UlCVFR9N8(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.rtx2ld2ELZv4.wdg6QnbFHrFF;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = kaVar.rtx2ld2ELZv4(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ka kaVar = this.rtx2ld2ELZv4;
        int i = kaVar.wdg6QnbFHrFF;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = kaVar.rtx2ld2ELZv4(i2);
        }
        return objArr;
    }
}
