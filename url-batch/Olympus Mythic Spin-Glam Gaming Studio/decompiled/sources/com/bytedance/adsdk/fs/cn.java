package com.bytedance.adsdk.fs;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes11.dex */
abstract class cn<K, V> {
    cn<K, V>.fs fs;

    cn() {
    }

    protected abstract Map<K, V> fs();

    protected abstract int zmn();

    protected abstract int zmn(Object obj);

    protected abstract Object zmn(int i, int i2);

    protected abstract void zmn(int i);

    protected abstract void zn();

    final class zmn<T> implements Iterator<T> {
        boolean fb = false;
        int fs;
        final int zmn;
        int zn;

        zmn(int i) {
            this.zmn = i;
            this.fs = cn.this.zmn();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.zn < this.fs;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) cn.this.zmn(this.zn, this.zmn);
            this.zn++;
            this.fb = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.fb) {
                throw new IllegalStateException();
            }
            int i = this.zn - 1;
            this.zn = i;
            this.fs--;
            this.fb = false;
            cn.this.zmn(i);
        }
    }

    final class fs implements Set<K> {
        fs() {
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
            cn.this.zn();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return cn.this.zmn(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return cn.zmn(cn.this.fs(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return cn.this.zmn() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new zmn(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int zmn = cn.this.zmn(obj);
            if (zmn < 0) {
                return false;
            }
            cn.this.zmn(zmn);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return cn.fs(cn.this.fs(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return cn.zn(cn.this.fs(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return cn.this.zmn();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return cn.this.fs(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) cn.this.zmn(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return cn.zmn(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int zmn = cn.this.zmn() - 1; zmn >= 0; zmn--) {
                Object zmn2 = cn.this.zmn(zmn, 0);
                i += zmn2 == null ? 0 : zmn2.hashCode();
            }
            return i;
        }
    }

    public static <K, V> boolean zmn(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean fs(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean zn(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] fs(int i) {
        int zmn2 = zmn();
        Object[] objArr = new Object[zmn2];
        for (int i2 = 0; i2 < zmn2; i2++) {
            objArr[i2] = zmn(i2, i);
        }
        return objArr;
    }

    public <T> T[] zmn(T[] tArr, int i) {
        int zmn2 = zmn();
        if (tArr.length < zmn2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), zmn2));
        }
        for (int i2 = 0; i2 < zmn2; i2++) {
            tArr[i2] = zmn(i2, i);
        }
        if (tArr.length > zmn2) {
            tArr[zmn2] = null;
        }
        return tArr;
    }

    public static <T> boolean zmn(Set<T> set, Object obj) {
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

    public Set<K> fb() {
        if (this.fs == null) {
            this.fs = new fs();
        }
        return this.fs;
    }
}
