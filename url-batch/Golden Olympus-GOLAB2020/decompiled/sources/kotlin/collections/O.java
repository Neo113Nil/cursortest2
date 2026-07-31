package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class O implements N {

    /* renamed from: b, reason: collision with root package name */
    private final Map f41050b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f41051c;

    public O(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f41050b = map;
        this.f41051c = function1;
    }

    public Set a() {
        return i().entrySet();
    }

    public Set c() {
        return i().keySet();
    }

    @Override // java.util.Map
    public void clear() {
        i().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return i().containsValue(obj);
    }

    public int e() {
        return i().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return i().equals(obj);
    }

    public Collection f() {
        return i().values();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return i().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return i().hashCode();
    }

    @Override // kotlin.collections.N, kotlin.collections.G
    public Map i() {
        return this.f41050b;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // kotlin.collections.G
    public Object j(Object obj) {
        Map i4 = i();
        Object obj2 = i4.get(obj);
        return (obj2 != null || i4.containsKey(obj)) ? obj2 : this.f41051c.invoke(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return i().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        i().putAll(from);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return i().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return i().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return f();
    }
}
