package cn.hutool.core.map;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CaseInsensitiveMap<K, V> extends FuncKeyMap<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CaseInsensitiveMap() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$eea40c49$1(Object obj) {
        return obj instanceof CharSequence ? obj.toString().toLowerCase() : obj;
    }

    public CaseInsensitiveMap(int i8) {
        this(i8, 0.75f);
    }

    public CaseInsensitiveMap(Map<? extends K, ? extends V> map) {
        this(0.75f, map);
    }

    public CaseInsensitiveMap(float f8, Map<? extends K, ? extends V> map) {
        this(map.size(), f8);
        putAll(map);
    }

    public CaseInsensitiveMap(int i8, float f8) {
        this(MapBuilder.create(new HashMap(i8, f8)));
    }

    CaseInsensitiveMap(MapBuilder<K, V> mapBuilder) {
        super(mapBuilder.build(), cn.hutool.core.collection.v0.a(new e()));
    }
}
