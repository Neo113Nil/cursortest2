package cn.hutool.core.map.multi;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface r extends Iterable {

    public interface a {
        Object getColumnKey();

        Object getRowKey();

        Object getValue();
    }

    Set<a> cellSet();

    void clear();

    Set<Object> columnKeySet();

    List<Object> columnKeys();

    Map<Object, Map<Object, Object>> columnMap();

    boolean contains(Object obj, Object obj2);

    boolean containsColumn(Object obj);

    boolean containsRow(Object obj);

    boolean containsValue(Object obj);

    void forEach(m.a aVar);

    Object get(Object obj, Object obj2);

    Map<Object, Object> getColumn(Object obj);

    Map<Object, Object> getRow(Object obj);

    boolean isEmpty();

    Object put(Object obj, Object obj2, Object obj3);

    void putAll(r rVar);

    Object remove(Object obj, Object obj2);

    Set<Object> rowKeySet();

    Map<Object, Map<Object, Object>> rowMap();

    int size();

    Collection<Object> values();
}
