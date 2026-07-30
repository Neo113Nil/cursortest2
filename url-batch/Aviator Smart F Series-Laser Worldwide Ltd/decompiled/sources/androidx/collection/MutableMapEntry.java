package androidx.collection;

import g6.g;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, g.a {
    private final int index;
    private final Object[] keys;
    private final Object[] values;

    public MutableMapEntry(Object[] keys, Object[] values, int i8) {
        s.checkNotNullParameter(keys, "keys");
        s.checkNotNullParameter(values, "values");
        this.keys = keys;
        this.values = values;
        this.index = i8;
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return (K) this.keys[this.index];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return (V) this.values[this.index];
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v7) {
        Object[] objArr = this.values;
        int i8 = this.index;
        V v8 = (V) objArr[i8];
        objArr[i8] = v7;
        return v8;
    }
}
