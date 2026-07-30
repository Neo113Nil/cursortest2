package cn.hutool.core.map;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public abstract class TransMap<K, V> extends MapWrapper<K, V> {
    private static final long serialVersionUID = 1;

    public TransMap(Supplier<Map<K, V>> supplier) {
        super(supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$compute$1(BiFunction biFunction, Object obj, Object obj2) {
        Object apply;
        apply = biFunction.apply(customKey(obj), customValue(obj2));
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$computeIfPresent$0(BiFunction biFunction, Object obj, Object obj2) {
        Object apply;
        apply = biFunction.apply(customKey(obj), customValue(obj2));
        return apply;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$merge$2(BiFunction biFunction, Object obj, Object obj2) {
        Object apply;
        apply = biFunction.apply(customValue(obj), customValue(obj2));
        return apply;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V compute(K k8, final BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return (V) super.compute(customKey(k8), new BiFunction() { // from class: cn.hutool.core.map.h2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$compute$1;
                lambda$compute$1 = TransMap.this.lambda$compute$1(biFunction, obj, obj2);
                return lambda$compute$1;
            }
        });
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V computeIfAbsent(K k8, Function<? super K, ? extends V> function) {
        return (V) super.computeIfAbsent(customKey(k8), function);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V computeIfPresent(K k8, final BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return (V) super.computeIfPresent(customKey(k8), new BiFunction() { // from class: cn.hutool.core.map.g2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$computeIfPresent$0;
                lambda$computeIfPresent$0 = TransMap.this.lambda$computeIfPresent$0(biFunction, obj, obj2);
                return lambda$computeIfPresent$0;
            }
        });
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(customKey(obj));
    }

    protected abstract K customKey(Object obj);

    protected abstract V customValue(Object obj);

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V get(Object obj) {
        return (V) super.get(customKey(obj));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V getOrDefault(Object obj, V v7) {
        return (V) super.getOrDefault(customKey(obj), customValue(v7));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V merge(K k8, V v7, final BiFunction<? super V, ? super V, ? extends V> biFunction) {
        return (V) super.merge(customKey(k8), customValue(v7), new BiFunction() { // from class: cn.hutool.core.map.i2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object lambda$merge$2;
                lambda$merge$2 = TransMap.this.lambda$merge$2(biFunction, obj, obj2);
                return lambda$merge$2;
            }
        });
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V put(K k8, V v7) {
        return (V) super.put(customKey(k8), customValue(v7));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        map.forEach(new BiConsumer() { // from class: cn.hutool.core.map.f2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TransMap.this.put(obj, obj2);
            }
        });
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V putIfAbsent(K k8, V v7) {
        return (V) super.putIfAbsent(customKey(k8), customValue(v7));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(customKey(obj));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean replace(K k8, V v7, V v8) {
        return super.replace(customKey(k8), customValue(v7), customValue(v8));
    }

    public TransMap(Map<K, V> map) {
        super(map);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return super.remove(customKey(obj), customValue(obj2));
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V replace(K k8, V v7) {
        return (V) super.replace(customKey(k8), customValue(v7));
    }
}
