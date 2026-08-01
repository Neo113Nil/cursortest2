package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
abstract class IP<K, V> {
    IP<K, V>.icD icD;

    protected abstract Map<K, V> icD();

    protected abstract int pvs();

    protected abstract int pvs(Object obj);

    protected abstract Object pvs(int i, int i2);

    protected abstract void pvs(int i);

    protected abstract void vG();

    IP() {
    }

    /* compiled from: MapCollections.java */
    final class pvs<T> implements Iterator<T> {
        boolean Jd = false;
        int icD;
        final int pvs;
        int vG;

        pvs(int i) {
            this.pvs = i;
            this.icD = IP.this.pvs();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.vG < this.icD;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) IP.this.pvs(this.vG, this.pvs);
            this.vG++;
            this.Jd = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.Jd) {
                throw new IllegalStateException();
            }
            int i = this.vG - 1;
            this.vG = i;
            this.icD--;
            this.Jd = false;
            IP.this.pvs(i);
        }
    }

    /* compiled from: MapCollections.java */
    final class icD implements Set<K> {
        icD() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            IP.this.vG();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return IP.this.pvs(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return IP.pvs(IP.this.icD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return IP.this.pvs() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new pvs(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int pvs = IP.this.pvs(obj);
            if (pvs < 0) {
                return false;
            }
            IP.this.pvs(pvs);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return IP.icD(IP.this.icD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return IP.vG(IP.this.icD(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return IP.this.pvs();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return IP.this.icD(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) IP.this.pvs(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return IP.pvs(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int pvs = IP.this.pvs() - 1; pvs >= 0; pvs--) {
                Object pvs2 = IP.this.pvs(pvs, 0);
                i += pvs2 == null ? 0 : pvs2.hashCode();
            }
            return i;
        }
    }

    public static <K, V> boolean pvs(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean icD(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean vG(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] icD(int i) {
        int pvs2 = pvs();
        Object[] objArr = new Object[pvs2];
        for (int i2 = 0; i2 < pvs2; i2++) {
            objArr[i2] = pvs(i2, i);
        }
        return objArr;
    }

    public <T> T[] pvs(T[] tArr, int i) {
        int pvs2 = pvs();
        if (tArr.length < pvs2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), pvs2));
        }
        for (int i2 = 0; i2 < pvs2; i2++) {
            tArr[i2] = pvs(i2, i);
        }
        if (tArr.length > pvs2) {
            tArr[pvs2] = null;
        }
        return tArr;
    }

    public static <T> boolean pvs(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<K> Jd() {
        if (this.icD == null) {
            this.icD = new icD();
        }
        return this.icD;
    }
}
