package cn.hutool.core.map;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CamelCaseLinkedMap<K, V> extends CamelCaseMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CamelCaseLinkedMap() {
        this(16);
    }

    public CamelCaseLinkedMap(int i8) {
        this(i8, 0.75f);
    }

    public CamelCaseLinkedMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CamelCaseLinkedMap(float f8, Map<? extends K, ? extends V> map) {
        this(map.size(), f8);
        putAll(map);
    }

    public CamelCaseLinkedMap(int i8, float f8) {
        super(new LinkedHashMap(i8, f8));
    }
}
