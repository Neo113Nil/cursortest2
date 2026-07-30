package cn.hutool.core.map.multi;

import cn.hutool.core.collection.a1;
import cn.hutool.core.collection.k0;
import cn.hutool.core.map.multi.r;
import cn.hutool.core.util.e0;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class AbsTable implements r {
    private Set<r.a> cellSet;
    private Collection<Object> values;

    private static class SimpleCell<R, C, V> implements r.a, Serializable {
        private static final long serialVersionUID = 1;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        SimpleCell(R r8, C c8, V v7) {
            this.rowKey = r8;
            this.columnKey = c8;
            this.value = v7;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r.a)) {
                return false;
            }
            r.a aVar = (r.a) obj;
            return e0.equal(this.rowKey, aVar.getRowKey()) && e0.equal(this.columnKey, aVar.getColumnKey()) && e0.equal(this.value, aVar.getValue());
        }

        @Override // cn.hutool.core.map.multi.r.a
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // cn.hutool.core.map.multi.r.a
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // cn.hutool.core.map.multi.r.a
        public V getValue() {
            return this.value;
        }

        public int hashCode() {
            return Objects.hash(this.rowKey, this.columnKey, this.value);
        }

        public String toString() {
            return "(" + this.rowKey + SystemInfoUtil.COMMA + this.columnKey + ")=" + this.value;
        }
    }

    private class b implements Iterator {
        Iterator<Map.Entry<Object, Object>> columnIterator;
        Map.Entry<Object, Map<Object, Object>> rowEntry;
        final Iterator<Map.Entry<Object, Map<Object, Object>>> rowIterator;

        private b() {
            this.rowIterator = AbsTable.this.rowMap().entrySet().iterator();
            this.columnIterator = k0.empty();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.columnIterator.remove();
            if (this.rowEntry.getValue().isEmpty()) {
                this.rowIterator.remove();
            }
        }

        @Override // java.util.Iterator
        public r.a next() {
            if (!this.columnIterator.hasNext()) {
                Map.Entry<Object, Map<Object, Object>> next = this.rowIterator.next();
                this.rowEntry = next;
                this.columnIterator = next.getValue().entrySet().iterator();
            }
            Map.Entry<Object, Object> next2 = this.columnIterator.next();
            return new SimpleCell(this.rowEntry.getKey(), next2.getKey(), next2.getValue());
        }
    }

    private class c extends AbstractSet {
        private c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbsTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof r.a)) {
                return false;
            }
            r.a aVar = (r.a) obj;
            Map row = AbsTable.this.getRow(aVar.getRowKey());
            if (row != null) {
                return e0.equals(row.get(aVar.getColumnKey()), aVar.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<r.a> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            r.a aVar = (r.a) obj;
            AbsTable.this.remove(aVar.getRowKey(), aVar.getColumnKey());
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbsTable.this.size();
        }
    }

    private class d extends AbstractCollection {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbsTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbsTable.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new a1(AbsTable.this.cellSet().iterator(), new Function() { // from class: cn.hutool.core.map.multi.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((r.a) obj).getValue();
                }
            });
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbsTable.this.size();
        }
    }

    @Override // cn.hutool.core.map.multi.r
    public Set<r.a> cellSet() {
        Set<r.a> set = this.cellSet;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.cellSet = cVar;
        return cVar;
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ void clear();

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return q.a(this);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ List columnKeys() {
        return q.b(this);
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ Map columnMap();

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return q.c(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return q.d(this, obj);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return q.e(this, obj);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return q.f(this, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return cellSet().equals(((r) obj).cellSet());
        }
        return false;
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ void forEach(m.a aVar) {
        q.g(this, aVar);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return q.h(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Map getColumn(Object obj) {
        return q.i(this, obj);
    }

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Map getRow(Object obj) {
        return q.j(this, obj);
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ boolean isEmpty();

    @Override // java.lang.Iterable
    public Iterator<r.a> iterator() {
        return new b();
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ Object put(Object obj, Object obj2, Object obj3);

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ void putAll(r rVar) {
        q.k(this, rVar);
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ Object remove(Object obj, Object obj2);

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return q.l(this);
    }

    @Override // cn.hutool.core.map.multi.r
    public abstract /* synthetic */ Map rowMap();

    @Override // cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ int size() {
        return q.m(this);
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // cn.hutool.core.map.multi.r
    public Collection<Object> values() {
        Collection<Object> collection = this.values;
        if (collection != null) {
            return collection;
        }
        d dVar = new d();
        this.values = dVar;
        return dVar;
    }
}
