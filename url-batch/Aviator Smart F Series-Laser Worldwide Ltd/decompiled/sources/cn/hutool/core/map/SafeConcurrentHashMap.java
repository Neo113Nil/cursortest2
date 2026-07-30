package cn.hutool.core.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public class SafeConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
    private static final long serialVersionUID = 1;

    public SafeConcurrentHashMap() {
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public V computeIfAbsent(K k8, Function<? super K, ? extends V> function) {
        return cn.hutool.core.util.c0.IS_JDK8 ? (V) h1.computeIfAbsentForJdk8(this, k8, function) : (V) super.computeIfAbsent(k8, function);
    }

    public SafeConcurrentHashMap(int i8) {
        super(i8);
    }

    public SafeConcurrentHashMap(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public SafeConcurrentHashMap(int i8, float f8) {
        super(i8, f8);
    }

    public SafeConcurrentHashMap(int i8, float f8, int i9) {
        super(i8, f8, i9);
    }
}
