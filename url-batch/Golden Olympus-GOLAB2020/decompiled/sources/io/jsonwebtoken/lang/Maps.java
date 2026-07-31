package io.jsonwebtoken.lang;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Maps {

    private static class HashMapBuilder<K, V> implements MapBuilder<K, V> {
        private final Map<K, V> data;

        private HashMapBuilder() {
            this.data = new HashMap();
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public MapBuilder and(K k4, V v4) {
            this.data.put(k4, v4);
            return this;
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public Map<K, V> build() {
            return java.util.Collections.unmodifiableMap(this.data);
        }
    }

    public interface MapBuilder<K, V> {
        MapBuilder and(K k4, V v4);

        Map<K, V> build();
    }

    private Maps() {
    }

    public static <K, V> MapBuilder<K, V> of(K k4, V v4) {
        return new HashMapBuilder().and(k4, v4);
    }
}
