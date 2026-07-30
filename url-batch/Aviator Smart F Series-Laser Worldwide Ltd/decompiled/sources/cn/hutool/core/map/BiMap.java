package cn.hutool.core.map;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public class BiMap<K, V> extends MapWrapper<K, V> {
    private static final long serialVersionUID = 1;
    private Map<V, K> inverse;

    public BiMap(Map<K, V> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putAll$0(Object obj, Object obj2) {
        this.inverse.put(obj2, obj);
    }

    private void resetInverseMap() {
        if (this.inverse != null) {
            this.inverse = null;
        }
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void clear() {
        super.clear();
        this.inverse = null;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V compute(K k8, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        V v7 = (V) super.compute(k8, biFunction);
        resetInverseMap();
        return v7;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V computeIfAbsent(K k8, Function<? super K, ? extends V> function) {
        V v7 = (V) super.computeIfAbsent(k8, function);
        resetInverseMap();
        return v7;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V computeIfPresent(K k8, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        V v7 = (V) super.computeIfPresent(k8, biFunction);
        resetInverseMap();
        return v7;
    }

    public Map<V, K> getInverse() {
        if (this.inverse == null) {
            this.inverse = h1.inverse(getRaw());
        }
        return this.inverse;
    }

    public K getKey(V v7) {
        return getInverse().get(v7);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V merge(K k8, V v7, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        V v8 = (V) super.merge(k8, v7, biFunction);
        resetInverseMap();
        return v8;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V put(K k8, V v7) {
        Map<V, K> map = this.inverse;
        if (map != null) {
            map.put(v7, k8);
        }
        return (V) super.put(k8, v7);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        super.putAll(map);
        if (this.inverse != null) {
            map.forEach(new BiConsumer() { // from class: cn.hutool.core.map.c
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    BiMap.this.lambda$putAll$0(obj, obj2);
                }
            });
        }
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V putIfAbsent(K k8, V v7) {
        Map<V, K> map = this.inverse;
        if (map != null) {
            map.putIfAbsent(v7, k8);
        }
        return (V) super.putIfAbsent(k8, v7);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V remove(Object obj) {
        V v7 = (V) super.remove(obj);
        Map<V, K> map = this.inverse;
        if (map != null && v7 != null) {
            map.remove(v7);
        }
        return v7;
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        Map<V, K> map;
        boolean remove;
        if (super.remove(obj, obj2) && (map = this.inverse) != null) {
            remove = map.remove(obj2, obj);
            if (remove) {
                return true;
            }
        }
        return false;
    }
}
