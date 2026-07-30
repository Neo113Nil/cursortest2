package cn.hutool.core.map;

import cn.hutool.core.builder.Builder;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class MapBuilder<K, V> implements Builder<Map<K, V>> {
    private static final long serialVersionUID = 1;
    private final Map<K, V> map;

    public MapBuilder(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> MapBuilder<K, V> create() {
        return create(false);
    }

    public MapBuilder<K, V> clear() {
        this.map.clear();
        return this;
    }

    public String join(String str, String str2) {
        return h1.join(this.map, str, str2, new String[0]);
    }

    public String joinIgnoreNull(String str, String str2) {
        return h1.joinIgnoreNull(this.map, str, str2, new String[0]);
    }

    public Map<K, V> map() {
        return this.map;
    }

    public MapBuilder<K, V> put(K k8, V v7) {
        this.map.put(k8, v7);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.map.putAll(map);
        return this;
    }

    public static <K, V> MapBuilder<K, V> create(boolean z7) {
        return create(h1.newHashMap(z7));
    }

    @Override // cn.hutool.core.builder.Builder
    public Map<K, V> build() {
        return map();
    }

    public String join(String str, String str2, boolean z7) {
        return h1.join(this.map, str, str2, z7, new String[0]);
    }

    public MapBuilder<K, V> put(boolean z7, K k8, V v7) {
        if (z7) {
            put(k8, v7);
        }
        return this;
    }

    public static <K, V> MapBuilder<K, V> create(Map<K, V> map) {
        return new MapBuilder<>(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapBuilder<K, V> put(boolean z7, K k8, Supplier<V> supplier) {
        Object obj;
        if (z7) {
            obj = supplier.get();
            put(k8, obj);
        }
        return this;
    }
}
