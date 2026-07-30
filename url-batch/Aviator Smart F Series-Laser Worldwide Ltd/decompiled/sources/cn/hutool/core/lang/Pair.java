package cn.hutool.core.lang;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public class Pair<K, V> extends f.a implements Serializable {
    private static final long serialVersionUID = 1;
    protected K key;
    protected V value;

    public Pair(K k8, V v7) {
        this.key = k8;
        this.value = v7;
    }

    public static <K, V> Pair<K, V> of(K k8, V v7) {
        return new Pair<>(k8, v7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(getKey(), pair.getKey()) && Objects.equals(getValue(), pair.getValue());
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hashCode(this.key) ^ Objects.hashCode(this.value);
    }

    public String toString() {
        return "Pair [key=" + this.key + ", value=" + this.value + "]";
    }
}
