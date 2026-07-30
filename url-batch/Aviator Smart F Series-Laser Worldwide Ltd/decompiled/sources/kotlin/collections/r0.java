package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class r0 implements q0 {

    /* renamed from: default, reason: not valid java name */
    private final f6.l f6default;
    private final Map<Object, Object> map;

    public r0(Map<Object, Object> map, f6.l lVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(map, "map");
        kotlin.jvm.internal.s.checkNotNullParameter(lVar, "default");
        this.map = map;
        this.f6default = lVar;
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        return getMap().entrySet();
    }

    public Set<Object> getKeys() {
        return getMap().keySet();
    }

    @Override // kotlin.collections.q0, kotlin.collections.h0
    public Map<Object, Object> getMap() {
        return this.map;
    }

    @Override // kotlin.collections.q0, kotlin.collections.h0
    public Object getOrImplicitDefault(Object obj) {
        Map<Object, Object> map = getMap();
        Object obj2 = map.get(obj);
        return (obj2 != null || map.containsKey(obj)) ? obj2 : this.f6default.invoke(obj);
    }

    public int getSize() {
        return getMap().size();
    }

    public Collection<Object> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return getMap().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> from) {
        kotlin.jvm.internal.s.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return getMap().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
