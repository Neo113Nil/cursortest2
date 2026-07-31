package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class H implements G {

    /* renamed from: b, reason: collision with root package name */
    private final Map f41043b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f41044c;

    public H(Map map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f41043b = map;
        this.f41044c = function1;
    }

    public Set a() {
        return i().entrySet();
    }

    public Set c() {
        return i().keySet();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // kotlin.collections.G
    public Map i() {
        return this.f41043b;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // kotlin.collections.G
    public Object j(Object obj) {
        Map i4 = i();
        Object obj2 = i4.get(obj);
        return (obj2 != null || i4.containsKey(obj)) ? obj2 : this.f41044c.invoke(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
