package m4;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class c<K, V> extends d<K, V> implements v<K, V> {
    protected c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // m4.f, m4.z
    public Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override // m4.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // m4.d, m4.z
    public boolean put(K k7, V v6) {
        return super.put(k7, v6);
    }

    @Override // m4.d
    <E> Collection<E> u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // m4.d
    Collection<V> v(K k7, Collection<V> collection) {
        return w(k7, (List) collection, null);
    }
}
