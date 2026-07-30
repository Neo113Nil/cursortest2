package t;

import cn.hutool.core.lang.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class g0 {
    public static final Set<Collector.Characteristics> CH_ID;
    public static final Set<Collector.Characteristics> CH_NOID;

    static {
        Collector.Characteristics characteristics;
        characteristics = Collector.Characteristics.IDENTITY_FINISH;
        CH_ID = Collections.unmodifiableSet(EnumSet.of(characteristics));
        CH_NOID = Collections.emptySet();
    }

    public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(final Function<? super T, ? extends K> function, Supplier<M> supplier, Collector<? super T, A, D> collector) {
        final Supplier supplier2;
        final BiConsumer accumulator;
        BinaryOperator combiner;
        Set characteristics;
        Collector.Characteristics characteristics2;
        final Function finisher;
        supplier2 = collector.supplier();
        accumulator = collector.accumulator();
        BiConsumer biConsumer = new BiConsumer() { // from class: t.c0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.lambda$groupingBy$3(function, supplier2, accumulator, (Map) obj, obj2);
            }
        };
        combiner = collector.combiner();
        BinaryOperator mapMerger = mapMerger(combiner);
        characteristics = collector.characteristics();
        characteristics2 = Collector.Characteristics.IDENTITY_FINISH;
        if (characteristics.contains(characteristics2)) {
            return new i0(supplier, biConsumer, mapMerger, CH_ID);
        }
        finisher = collector.finisher();
        return new i0(supplier, biConsumer, mapMerger, new Function() { // from class: t.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map lambda$groupingBy$5;
                lambda$groupingBy$5 = g0.lambda$groupingBy$5(finisher, (Map) obj);
                return lambda$groupingBy$5;
            }
        }, CH_NOID);
    }

    public static <T> Collector<T, ?, String> joining(CharSequence charSequence) {
        return joining(charSequence, new Function() { // from class: t.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$groupingBy$3(Function function, final Supplier supplier, BiConsumer biConsumer, Map map, Object obj) {
        Object computeIfAbsent;
        computeIfAbsent = map.computeIfAbsent(l0.ofNullable(obj).map(function).orElse(null), new Function() { // from class: t.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Object lambda$null$2;
                lambda$null$2 = g0.lambda$null$2(supplier, obj2);
                return lambda$null$2;
            }
        });
        biConsumer.accept(computeIfAbsent, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$groupingBy$5(final Function function, Map map) {
        map.replaceAll(new BiFunction() { // from class: t.s
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$null$4;
                lambda$null$4 = g0.lambda$null$4(function, obj, obj2);
                return lambda$null$4;
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$joining$1(Function function, StringJoiner stringJoiner, Object obj) {
        Object apply;
        apply = function.apply(obj);
        stringJoiner.add((CharSequence) apply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$mapMerger$7(BinaryOperator binaryOperator, Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.merge(entry.getKey(), entry.getValue(), binaryOperator);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$null$11(Object obj) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$12(Map map, Object obj, List list) {
        Object computeIfAbsent;
        computeIfAbsent = map.computeIfAbsent(obj, new Function() { // from class: t.x
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                List lambda$null$11;
                lambda$null$11 = g0.lambda$null$11(obj2);
                return lambda$null$11;
            }
        });
        ((List) computeIfAbsent).addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$null$2(Supplier supplier, Object obj) {
        Object obj2;
        obj2 = supplier.get();
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$null$4(Function function, Object obj, Object obj2) {
        Object apply;
        apply = function.apply(obj2);
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$null$8(Object obj) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$9(Map map, Object obj, Object obj2) {
        Object computeIfAbsent;
        computeIfAbsent = map.computeIfAbsent(obj, new Function() { // from class: t.r
            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                List lambda$null$8;
                lambda$null$8 = g0.lambda$null$8(obj3);
                return lambda$null$8;
            }
        });
        ((List) computeIfAbsent).add(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$reduceListMap$10(Supplier supplier, Map map) {
        Object obj;
        obj = supplier.get();
        final Map map2 = (Map) obj;
        map.forEach(new BiConsumer() { // from class: t.z
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                g0.lambda$null$9(map2, obj2, obj3);
            }
        });
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$reduceListMap$13(final Map map, Map map2) {
        map2.forEach(new BiConsumer() { // from class: t.u
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.lambda$null$12(map, obj, (List) obj2);
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toMap$6(Function function, Function function2, Map map, Object obj) {
        map.put(l0.ofNullable(obj).map(function).get(), l0.ofNullable(obj).map(function2).get());
    }

    public static <K, V, M extends Map<K, V>> BinaryOperator<M> mapMerger(final BinaryOperator<V> binaryOperator) {
        return new BinaryOperator() { // from class: t.f0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Map lambda$mapMerger$7;
                lambda$mapMerger$7 = g0.lambda$mapMerger$7(binaryOperator, (Map) obj, (Map) obj2);
                return lambda$mapMerger$7;
            }
        };
    }

    public static <K, V> Collector<Map<K, V>, ?, Map<K, List<V>>> reduceListMap() {
        return reduceListMap(new t());
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator) {
        return toMap(function, function2, binaryOperator, new t());
    }

    public static <T> Collector<T, ?, String> joining(CharSequence charSequence, Function<T, ? extends CharSequence> function) {
        return joining(charSequence, "", "", function);
    }

    public static <K, V, R extends Map<K, List<V>>> Collector<Map<K, V>, ?, R> reduceListMap(final Supplier<R> supplier) {
        Object obj;
        Collector<Map<K, V>, ?, R> reducing;
        obj = supplier.get();
        reducing = Collectors.reducing(obj, new Function() { // from class: t.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Map lambda$reduceListMap$10;
                lambda$reduceListMap$10 = g0.lambda$reduceListMap$10(supplier, (Map) obj2);
                return lambda$reduceListMap$10;
            }
        }, new BinaryOperator() { // from class: t.b0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Map lambda$reduceListMap$13;
                lambda$reduceListMap$13 = g0.lambda$reduceListMap$13((Map) obj2, (Map) obj3);
                return lambda$reduceListMap$13;
            }
        });
        return reducing;
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new i0(supplier, new BiConsumer() { // from class: t.w
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.lambda$toMap$6(function, function2, (Map) obj, obj2);
            }
        }, mapMerger(binaryOperator), CH_ID);
    }

    public static <T> Collector<T, ?, String> joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final Function<T, ? extends CharSequence> function) {
        return new i0(new Supplier() { // from class: t.n
            @Override // java.util.function.Supplier
            public final Object get() {
                StringJoiner a8;
                a8 = d.a(charSequence, charSequence2, charSequence3);
                return a8;
            }
        }, new BiConsumer() { // from class: t.o
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g0.lambda$joining$1(function, (StringJoiner) obj, obj2);
            }
        }, new BinaryOperator() { // from class: t.p
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                StringJoiner merge;
                merge = ((StringJoiner) obj).merge((StringJoiner) obj2);
                return merge;
            }
        }, new Function() { // from class: t.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String stringJoiner;
                stringJoiner = ((StringJoiner) obj).toString();
                return stringJoiner;
            }
        }, Collections.emptySet());
    }

    public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> function, Collector<? super T, A, D> collector) {
        return groupingBy(function, new t(), collector);
    }

    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> function) {
        Collector list;
        list = Collectors.toList();
        return groupingBy(function, list);
    }

    public static <T, K, R, C extends Collection<R>, M extends Map<K, C>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> function, Function<? super T, ? extends R> function2, Supplier<C> supplier, Supplier<M> supplier2) {
        Collector collection;
        Collector mapping;
        collection = Collectors.toCollection(supplier);
        mapping = Collectors.mapping(function2, collection);
        return groupingBy(function, supplier2, mapping);
    }

    public static <T, K, R, C extends Collection<R>> Collector<T, ?, Map<K, C>> groupingBy(Function<? super T, ? extends K> function, Function<? super T, ? extends R> function2, Supplier<C> supplier) {
        return groupingBy(function, function2, supplier, new t());
    }

    public static <T, K, R> Collector<T, ?, Map<K, List<R>>> groupingBy(Function<? super T, ? extends K> function, Function<? super T, ? extends R> function2) {
        return groupingBy(function, function2, new Supplier() { // from class: t.y
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }, new t());
    }
}
