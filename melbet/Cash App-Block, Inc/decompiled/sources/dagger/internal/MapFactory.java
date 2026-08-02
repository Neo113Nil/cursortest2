package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MapFactory implements Factory {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Map contributingMap;

    static {
        InstanceFactory.create(Collections.EMPTY_MAP);
    }

    public MapFactory(LinkedHashMap linkedHashMap) {
        this.contributingMap = Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Map map = this.contributingMap;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((Provider) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
