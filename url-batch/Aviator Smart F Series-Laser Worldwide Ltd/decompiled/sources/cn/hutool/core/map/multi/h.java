package cn.hutool.core.map.multi;

import cn.hutool.core.builder.Builder;
import cn.hutool.core.collection.a1;
import cn.hutool.core.collection.k0;
import cn.hutool.core.collection.w;
import cn.hutool.core.map.h1;
import cn.hutool.core.map.multi.h;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class h extends AbsTable {
    final Builder<? extends Map<Object, Object>> columnBuilder;
    private Set<Object> columnKeySet;
    private Map<Object, Map<Object, Object>> columnMap;
    final Map<Object, Map<Object, Object>> raw;

    private class b extends AbstractMap {
        final Object columnKey;

        private class a extends AbstractSet {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<Object, Object>> iterator() {
                return new C0008b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<Object, Object>> it = h.this.raw.values().iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(b.this.columnKey)) {
                        i8++;
                    }
                }
                return i8;
            }
        }

        /* renamed from: cn.hutool.core.map.multi.h$b$b, reason: collision with other inner class name */
        private class C0008b extends w {
            final Iterator<Map.Entry<Object, Map<Object, Object>>> iterator;

            /* renamed from: cn.hutool.core.map.multi.h$b$b$a */
            class a extends cn.hutool.core.map.a {
                final /* synthetic */ Map.Entry val$entry;

                a(Map.Entry entry) {
                    this.val$entry = entry;
                }

                @Override // java.util.Map.Entry
                public Object getKey() {
                    return this.val$entry.getKey();
                }

                @Override // java.util.Map.Entry
                public Object getValue() {
                    return ((Map) this.val$entry.getValue()).get(b.this.columnKey);
                }

                @Override // cn.hutool.core.map.a, java.util.Map.Entry
                public Object setValue(Object obj) {
                    return ((Map) this.val$entry.getValue()).put(b.this.columnKey, obj);
                }
            }

            private C0008b() {
                this.iterator = h.this.raw.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // cn.hutool.core.collection.w
            public Map.Entry<Object, Object> computeNext() {
                while (this.iterator.hasNext()) {
                    Map.Entry<Object, Map<Object, Object>> next = this.iterator.next();
                    if (next.getValue().containsKey(b.this.columnKey)) {
                        return new a(next);
                    }
                }
                return null;
            }
        }

        b(Object obj) {
            this.columnKey = obj;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Object>> entrySet() {
            return new a();
        }
    }

    private class c extends w {
        Iterator<Map.Entry<Object, Object>> entryIterator;
        final Iterator<Map<Object, Object>> mapIterator;
        final Map<Object, Object> seen;

        private c() {
            this.seen = h.this.columnBuilder.build();
            this.mapIterator = h.this.raw.values().iterator();
            this.entryIterator = k0.empty();
        }

        @Override // cn.hutool.core.collection.w
        protected Object computeNext() {
            while (true) {
                if (this.entryIterator.hasNext()) {
                    Map.Entry<Object, Object> next = this.entryIterator.next();
                    if (!this.seen.containsKey(next.getKey())) {
                        this.seen.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.mapIterator.hasNext()) {
                        return null;
                    }
                    this.entryIterator = this.mapIterator.next().entrySet().iterator();
                }
            }
        }
    }

    private class d extends AbstractSet {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k0.size((Iterator<?>) iterator());
        }
    }

    private class e extends AbstractMap {
        private e() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<Object, Map<Object, Object>>> entrySet() {
            return new f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f extends AbstractSet {
        private final Set<Object> columnKeySet;

        private f() {
            this.columnKeySet = h.this.columnKeySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Map.Entry lambda$iterator$0(Object obj) {
            return h1.entry(obj, h.this.getColumn(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Map<Object, Object>>> iterator() {
            return new a1(this.columnKeySet.iterator(), new Function() { // from class: cn.hutool.core.map.multi.i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry lambda$iterator$0;
                    lambda$iterator$0 = h.f.this.lambda$iterator$0(obj);
                    return lambda$iterator$0;
                }
            });
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.columnKeySet.size();
        }
    }

    public h() {
        this(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$put$0(Object obj) {
        return this.columnBuilder.build();
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public void clear() {
        this.raw.clear();
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Set<Object> columnKeySet() {
        Set<Object> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        d dVar = new d();
        this.columnKeySet = dVar;
        return dVar;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public List<Object> columnKeys() {
        Collection<Map<Object, Object>> values = this.raw.values();
        final ArrayList arrayList = new ArrayList(values.size() * 16);
        Iterator<Map<Object, Object>> it = values.iterator();
        while (it.hasNext()) {
            it.next().forEach(new BiConsumer() { // from class: cn.hutool.core.map.multi.e
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    arrayList.add(obj);
                }
            });
        }
        return arrayList;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Map<Object, Map<Object, Object>> columnMap() {
        Map<Object, Map<Object, Object>> map = this.columnMap;
        if (map != null) {
            return map;
        }
        e eVar = new e();
        this.columnMap = eVar;
        return eVar;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return q.c(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<Object, Object> map : this.raw.values()) {
            if (map != null && map.containsKey(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return q.e(this, obj);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return q.f(this, obj);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ void forEach(m.a aVar) {
        q.g(this, aVar);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return q.h(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Map<Object, Object> getColumn(Object obj) {
        return new b(obj);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Map getRow(Object obj) {
        return q.j(this, obj);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public boolean isEmpty() {
        return this.raw.isEmpty();
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Object put(Object obj, Object obj2, Object obj3) {
        Object computeIfAbsent;
        computeIfAbsent = this.raw.computeIfAbsent(obj, new Function() { // from class: cn.hutool.core.map.multi.g
            @Override // java.util.function.Function
            public final Object apply(Object obj4) {
                Map lambda$put$0;
                lambda$put$0 = h.this.lambda$put$0(obj4);
                return lambda$put$0;
            }
        });
        return ((Map) computeIfAbsent).put(obj2, obj3);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ void putAll(r rVar) {
        q.k(this, rVar);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Object remove(Object obj, Object obj2) {
        Map row = getRow(obj);
        if (row == null) {
            return null;
        }
        Object remove = row.remove(obj2);
        if (row.isEmpty()) {
            this.raw.remove(obj);
        }
        return remove;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return q.l(this);
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public Map<Object, Map<Object, Object>> rowMap() {
        return this.raw;
    }

    @Override // cn.hutool.core.map.multi.AbsTable, cn.hutool.core.map.multi.r
    public /* bridge */ /* synthetic */ int size() {
        return q.m(this);
    }

    public h(boolean z7) {
        this(h1.newHashMap(z7), new cn.hutool.core.map.multi.f(z7));
    }

    public h(Map<Object, Map<Object, Object>> map) {
        this(map, new cn.hutool.core.map.multi.d());
    }

    public h(Map<Object, Map<Object, Object>> map, Builder<? extends Map<Object, Object>> builder) {
        this.raw = map;
        this.columnBuilder = builder == null ? new cn.hutool.core.map.multi.d() : builder;
    }
}
