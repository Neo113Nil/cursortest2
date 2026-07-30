package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class c0 implements s {
    private final boolean allowOverrideParent;
    private final Map<Object, b> nodes = new LinkedHashMap();

    public static class a implements Map.Entry {
        private final k2 entryNode;

        a(k2 k2Var) {
            this.entryNode = k2Var;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.entryNode.getKey();
        }

        @Override // java.util.Map.Entry
        public k2 getValue() {
            return this.entryNode;
        }

        @Override // java.util.Map.Entry
        public k2 setValue(k2 k2Var) {
            throw new UnsupportedOperationException();
        }
    }

    public static class b implements k2 {
        private final Map<Object, b> children;
        private final Object key;
        private b parent;
        private b root;
        private Object value;
        private int weight;

        public b(b bVar, Object obj) {
            this(bVar, obj, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addChild$8(b bVar, b bVar2) {
            Object obj = bVar2.key;
            cn.hutool.core.lang.q.notEquals(obj, bVar.key, "circular reference between [{}] and [{}]!", obj, this.key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addChild$9(Integer num, b bVar) {
            bVar.root = getRoot();
            bVar.weight = num.intValue() + getWeight() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getChild$11(Integer num, b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$getChild$12(Object obj, Integer num, b bVar) {
            return bVar.equalsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getChildren$13(Map map, Integer num, b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getParent$4(b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$getParent$5(Object obj, b bVar) {
            return bVar.equalsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getRoot$2(b bVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$getRoot$3(b bVar) {
            return !bVar.hasParent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$null$0(b bVar) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$removeDeclaredChild$10(b bVar, Integer num, b bVar2) {
            bVar2.root = bVar;
            bVar2.weight = num.intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$traverseChildNodes$7(Integer num, b bVar) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Predicate lambda$traverseParentNodes$1(Predicate predicate) {
            return new Predicate() { // from class: cn.hutool.core.map.g0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$null$0;
                    lambda$null$0 = c0.b.lambda$null$0((c0.b) obj);
                    return lambda$null$0;
                }
            };
        }

        void addChild(final b bVar) {
            if (containsChild(bVar.key)) {
                return;
            }
            traverseParentNodes(true, new Consumer() { // from class: cn.hutool.core.map.j0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c0.b.this.lambda$addChild$8(bVar, (c0.b) obj);
                }
            }, null);
            bVar.parent = this;
            bVar.traverseChildNodes(true, new BiConsumer() { // from class: cn.hutool.core.map.k0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    c0.b.this.lambda$addChild$9((Integer) obj, (c0.b) obj2);
                }
            }, null);
            this.children.put(bVar.key, bVar);
        }

        void clear() {
            this.root = null;
            this.children.clear();
            this.parent = null;
        }

        @Override // cn.hutool.core.map.k2
        public /* bridge */ /* synthetic */ boolean containsChild(Object obj) {
            return j2.a(this, obj);
        }

        @Override // cn.hutool.core.map.k2
        public /* bridge */ /* synthetic */ boolean containsParent(Object obj) {
            return j2.b(this, obj);
        }

        b copy(Object obj) {
            b bVar = new b(this.parent, this.key, cn.hutool.core.util.e0.defaultIfNull(obj, this.value));
            bVar.children.putAll(this.children);
            return bVar;
        }

        @Override // cn.hutool.core.map.k2, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass().equals(obj.getClass()) || cn.hutool.core.util.p.isAssignable(getClass(), obj.getClass())) {
                return false;
            }
            return cn.hutool.core.util.e0.equals(getKey(), ((k2) obj).getKey());
        }

        public boolean equalsKey(Object obj) {
            return cn.hutool.core.util.e0.equal(getKey(), obj);
        }

        @Override // cn.hutool.core.map.k2
        public void forEachChild(boolean z7, final Consumer<k2> consumer) {
            traverseChildNodes(z7, new BiConsumer() { // from class: cn.hutool.core.map.n0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    cn.hutool.core.collection.z.a(consumer, (c0.b) obj2);
                }
            }, null);
        }

        @Override // cn.hutool.core.map.k2
        public Map<Object, k2> getChildren() {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            traverseChildNodes(false, new BiConsumer() { // from class: cn.hutool.core.map.m0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    c0.b.lambda$getChildren$13(linkedHashMap, (Integer) obj, (c0.b) obj2);
                }
            }, null);
            return linkedHashMap;
        }

        @Override // cn.hutool.core.map.k2
        public Map<Object, k2> getDeclaredChildren() {
            return new LinkedHashMap(this.children);
        }

        @Override // cn.hutool.core.map.k2
        public b getDeclaredParent() {
            return this.parent;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // cn.hutool.core.map.k2
        public int getWeight() {
            return this.weight;
        }

        @Override // cn.hutool.core.map.k2
        public /* bridge */ /* synthetic */ boolean hasChildren() {
            return j2.c(this);
        }

        @Override // cn.hutool.core.map.k2
        public /* bridge */ /* synthetic */ boolean hasParent() {
            return j2.d(this);
        }

        @Override // cn.hutool.core.map.k2, java.util.Map.Entry
        public int hashCode() {
            return Objects.hash(getKey());
        }

        public boolean isRoot() {
            return getRoot() == this;
        }

        void removeDeclaredChild(Object obj) {
            final b bVar = this.children.get(obj);
            if (cn.hutool.core.util.e0.isNull(bVar)) {
                return;
            }
            this.children.remove(obj);
            bVar.parent = null;
            bVar.traverseChildNodes(true, new BiConsumer() { // from class: cn.hutool.core.map.f0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    c0.b.lambda$removeDeclaredChild$10(c0.b.this, (Integer) obj2, (c0.b) obj3);
                }
            }, null);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value = getValue();
            this.value = obj;
            return value;
        }

        b traverseChildNodes(boolean z7, BiConsumer<Integer, b> biConsumer, BiPredicate<Integer, b> biPredicate) {
            boolean test;
            BiPredicate a8 = d0.a(cn.hutool.core.util.e0.defaultIfNull(biPredicate, new BiPredicate() { // from class: cn.hutool.core.map.q0
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    boolean lambda$traverseChildNodes$7;
                    lambda$traverseChildNodes$7 = c0.b.lambda$traverseChildNodes$7((Integer) obj, (c0.b) obj2);
                    return lambda$traverseChildNodes$7;
                }
            }));
            LinkedList newLinkedList = CollUtil.newLinkedList(CollUtil.newArrayList(this));
            int i8 = !z7 ? 1 : 0;
            b bVar = null;
            while (!newLinkedList.isEmpty()) {
                List<b> list = (List) newLinkedList.removeFirst();
                ArrayList arrayList = new ArrayList();
                for (b bVar2 : list) {
                    if (z7) {
                        biConsumer.accept(Integer.valueOf(i8), bVar2);
                        test = a8.test(Integer.valueOf(i8), bVar2);
                        if (test) {
                            return bVar2;
                        }
                    } else {
                        z7 = true;
                    }
                    CollUtil.addAll((Collection) arrayList, (Iterable) bVar2.children.values());
                }
                if (!arrayList.isEmpty()) {
                    newLinkedList.addLast(arrayList);
                }
                bVar = (b) CollUtil.getLast(arrayList);
                i8++;
            }
            return bVar;
        }

        b traverseParentNodes(boolean z7, Consumer<b> consumer, Predicate<b> predicate) {
            boolean test;
            Predicate a8 = cn.hutool.core.annotation.r0.a(cn.hutool.core.util.e0.defaultIfNull(predicate, (Function<Predicate<b>, ? extends Predicate<b>>) new Function() { // from class: cn.hutool.core.map.l0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Predicate lambda$traverseParentNodes$1;
                    lambda$traverseParentNodes$1 = c0.b.lambda$traverseParentNodes$1((Predicate) obj);
                    return lambda$traverseParentNodes$1;
                }
            }));
            b bVar = z7 ? this : this.parent;
            while (cn.hutool.core.util.e0.isNotNull(bVar)) {
                consumer.accept(bVar);
                test = a8.test(bVar);
                if (test) {
                    break;
                }
                bVar = bVar.parent;
            }
            return bVar;
        }

        public b(b bVar, Object obj, Object obj2) {
            this.parent = bVar;
            this.key = obj;
            this.value = obj2;
            this.children = new LinkedHashMap();
            if (cn.hutool.core.util.e0.isNull(bVar)) {
                this.root = this;
                this.weight = 0;
            } else {
                bVar.addChild(this);
                this.weight = bVar.weight + 1;
                this.root = bVar.root;
            }
        }

        @Override // cn.hutool.core.map.k2
        public b getChild(final Object obj) {
            return traverseChildNodes(false, new BiConsumer() { // from class: cn.hutool.core.map.o0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    c0.b.lambda$getChild$11((Integer) obj2, (c0.b) obj3);
                }
            }, new BiPredicate() { // from class: cn.hutool.core.map.p0
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj2, Object obj3) {
                    boolean lambda$getChild$12;
                    lambda$getChild$12 = c0.b.lambda$getChild$12(obj, (Integer) obj2, (c0.b) obj3);
                    return lambda$getChild$12;
                }
            });
        }

        @Override // cn.hutool.core.map.k2
        public b getParent(final Object obj) {
            return traverseParentNodes(false, new Consumer() { // from class: cn.hutool.core.map.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    c0.b.lambda$getParent$4((c0.b) obj2);
                }
            }, new Predicate() { // from class: cn.hutool.core.map.i0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    boolean lambda$getParent$5;
                    lambda$getParent$5 = c0.b.lambda$getParent$5(obj, (c0.b) obj2);
                    return lambda$getParent$5;
                }
            });
        }

        @Override // cn.hutool.core.map.k2
        public b getRoot() {
            if (cn.hutool.core.util.e0.isNotNull(this.root)) {
                return this.root;
            }
            b traverseParentNodes = traverseParentNodes(true, new Consumer() { // from class: cn.hutool.core.map.r0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    c0.b.lambda$getRoot$2((c0.b) obj);
                }
            }, new Predicate() { // from class: cn.hutool.core.map.e0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean lambda$getRoot$3;
                    lambda$getRoot$3 = c0.b.lambda$getRoot$3((c0.b) obj);
                    return lambda$getRoot$3;
                }
            });
            this.root = traverseParentNodes;
            return traverseParentNodes;
        }
    }

    public c0(boolean z7) {
        this.allowOverrideParent = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$linkNodes$3(k2 k2Var, k2 k2Var2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$linkNodes$4(Object obj) {
        return new b(null, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$putLinkedNodes$1(Object obj, Object obj2, k2 k2Var, k2 k2Var2) {
        k2Var.setValue(obj);
        k2Var2.setValue(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$remove$0(b bVar, Object obj, k2 k2Var) {
        bVar.addChild((b) k2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map.Entry<Object, k2> wrap(Map.Entry<Object, b> entry) {
        return new a(entry.getValue());
    }

    @Override // cn.hutool.core.map.s, java.util.Map
    public void clear() {
        this.nodes.values().forEach(new Consumer() { // from class: cn.hutool.core.map.x
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((c0.b) obj).clear();
            }
        });
        this.nodes.clear();
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ boolean containsChildNode(Object obj, Object obj2) {
        return r.a(this, obj, obj2);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.nodes.containsKey(obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ boolean containsParentNode(Object obj, Object obj2) {
        return r.b(this, obj, obj2);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.nodes.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, k2>> entrySet() {
        Stream stream;
        Stream map;
        Collector set;
        Object collect;
        stream = this.nodes.entrySet().stream();
        map = stream.map(new Function() { // from class: cn.hutool.core.map.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry wrap;
                wrap = c0.this.wrap((Map.Entry) obj);
                return wrap;
            }
        });
        set = Collectors.toSet();
        collect = map.collect(set);
        return (Set) collect;
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ Collection getChildNodes(Object obj) {
        return r.c(this, obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ Collection getDeclaredChildNodes(Object obj) {
        return r.d(this, obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ k2 getDeclaredParentNode(Object obj) {
        return r.e(this, obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ Object getNodeValue(Object obj) {
        return r.f(this, obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ k2 getParentNode(Object obj, Object obj2) {
        return r.g(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ k2 getRootNode(Object obj) {
        return r.h(this, obj);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ Set getTreeNodes(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.nodes.isEmpty();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return this.nodes.keySet();
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ void linkNodes(Object obj, Object obj2) {
        r.j(this, obj, obj2);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ k2 put(Object obj, k2 k2Var) {
        return r.k(this, obj, k2Var);
    }

    @Override // cn.hutool.core.map.s, java.util.Map
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        r.m(this, map);
    }

    @Override // cn.hutool.core.map.s
    public /* bridge */ /* synthetic */ void putAllNode(Collection collection, Function function, Function function2, boolean z7) {
        r.n(this, collection, function, function2, z7);
    }

    @Override // cn.hutool.core.map.s
    public void putLinkedNodes(Object obj, final Object obj2, Object obj3, final Object obj4) {
        linkNodes(obj, obj3, new BiConsumer() { // from class: cn.hutool.core.map.v
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj5, Object obj6) {
                c0.lambda$putLinkedNodes$1(obj2, obj4, (k2) obj5, (k2) obj6);
            }
        });
    }

    @Override // java.util.Map
    public int size() {
        return this.nodes.size();
    }

    @Override // cn.hutool.core.map.s
    public void unlinkNode(Object obj, Object obj2) {
        b bVar = this.nodes.get(obj2);
        if (!cn.hutool.core.util.e0.isNull(bVar) && bVar.hasParent()) {
            bVar.getDeclaredParent().removeDeclaredChild(bVar.getKey());
        }
    }

    @Override // java.util.Map
    public Collection<k2> values() {
        return new ArrayList(this.nodes.values());
    }

    @Override // java.util.Map
    public k2 get(Object obj) {
        return this.nodes.get(obj);
    }

    @Override // cn.hutool.core.map.s
    public void linkNodes(Object obj, Object obj2, BiConsumer<k2, k2> biConsumer) {
        Object computeIfAbsent;
        BiConsumer a8 = t.a(cn.hutool.core.util.e0.defaultIfNull(biConsumer, new BiConsumer() { // from class: cn.hutool.core.map.y
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj3, Object obj4) {
                c0.lambda$linkNodes$3((k2) obj3, (k2) obj4);
            }
        }));
        computeIfAbsent = this.nodes.computeIfAbsent(obj, new Function() { // from class: cn.hutool.core.map.z
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                c0.b lambda$linkNodes$4;
                lambda$linkNodes$4 = c0.lambda$linkNodes$4(obj3);
                return lambda$linkNodes$4;
            }
        });
        b bVar = (b) computeIfAbsent;
        b bVar2 = this.nodes.get(obj2);
        if (cn.hutool.core.util.e0.isNull(bVar2)) {
            b bVar3 = new b(bVar, obj2);
            a8.accept(bVar, bVar3);
            this.nodes.put(obj2, bVar3);
        } else {
            if (cn.hutool.core.util.e0.equals(bVar, bVar2.getDeclaredParent())) {
                a8.accept(bVar, bVar2);
                return;
            }
            if (!bVar2.hasParent()) {
                bVar.addChild(bVar2);
            } else {
                if (!this.allowOverrideParent) {
                    throw new IllegalArgumentException(cn.hutool.core.text.l.format("[{}] has been used as child of [{}], can not be overwrite as child of [{}]", bVar2.getKey(), bVar2.getDeclaredParent().getKey(), obj));
                }
                bVar2.getDeclaredParent().removeDeclaredChild(bVar2.getKey());
                bVar.addChild(bVar2);
            }
            a8.accept(bVar, bVar2);
        }
    }

    @Override // cn.hutool.core.map.s, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        Object put;
        put = put(obj, (k2) obj2);
        return put;
    }

    @Override // cn.hutool.core.map.s
    public void putLinkedNodes(Object obj, Object obj2, final Object obj3) {
        linkNodes(obj, obj2, new BiConsumer() { // from class: cn.hutool.core.map.w
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj4, Object obj5) {
                ((k2) obj5).setValue(obj3);
            }
        });
    }

    @Override // cn.hutool.core.map.s
    public b putNode(Object obj, Object obj2) {
        b bVar = this.nodes.get(obj);
        if (cn.hutool.core.util.e0.isNotNull(bVar)) {
            Object value = bVar.getValue();
            bVar.setValue(obj2);
            return bVar.copy(value);
        }
        this.nodes.put(obj, new b(null, obj, obj2));
        return null;
    }

    @Override // cn.hutool.core.map.s, java.util.Map
    public k2 remove(Object obj) {
        b remove = this.nodes.remove(obj);
        if (cn.hutool.core.util.e0.isNull(remove)) {
            return null;
        }
        if (remove.hasParent()) {
            final b declaredParent = remove.getDeclaredParent();
            Map<Object, k2> children = remove.getChildren();
            declaredParent.removeDeclaredChild(remove.getKey());
            remove.clear();
            children.forEach(new BiConsumer() { // from class: cn.hutool.core.map.a0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    c0.lambda$remove$0(c0.b.this, obj2, (k2) obj3);
                }
            });
        }
        return remove;
    }
}
