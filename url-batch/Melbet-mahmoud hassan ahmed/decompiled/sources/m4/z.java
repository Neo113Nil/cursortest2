package m4;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface z<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    boolean put(K k7, V v6);

    int size();

    Collection<V> values();
}
