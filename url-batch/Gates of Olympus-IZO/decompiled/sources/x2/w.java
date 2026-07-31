package x2;

import D1.E;
import a2.InterfaceC0184a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class w extends k implements Map<String, k>, InterfaceC0184a {
    public static final v Companion = new v();
    private final Map<String, k> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(Map<String, ? extends k> map) {
        super(null);
        Z1.i.f(map, "content");
        this.content = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(Map.Entry entry) {
        Z1.i.f(entry, "<destruct>");
        String str = (String) entry.getKey();
        k kVar = (k) entry.getValue();
        StringBuilder sb = new StringBuilder();
        y2.l.a(sb, str);
        sb.append(':');
        sb.append(kVar);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k compute(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k computeIfAbsent(String str, Function<? super String, ? extends k> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k computeIfPresent(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(String str) {
        Z1.i.f(str, "key");
        return this.content.containsKey(str);
    }

    public boolean containsValue(k kVar) {
        Z1.i.f(kVar, "value");
        return this.content.containsValue(kVar);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, k>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Z1.i.a(this.content, obj);
    }

    public k get(String str) {
        Z1.i.f(str, "key");
        return this.content.get(str);
    }

    public Set<Map.Entry<String, k>> getEntries() {
        return this.content.entrySet();
    }

    public Set<String> getKeys() {
        return this.content.keySet();
    }

    public int getSize() {
        return this.content.size();
    }

    public Collection<k> getValues() {
        return this.content.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k merge(String str, k kVar, BiFunction<? super k, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k put(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends k> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k putIfAbsent(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public k remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ k replace(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return M1.l.r0(this.content.entrySet(), ",", "{", "}", new E(7), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<k> values() {
        return getValues();
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public k compute2(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public k computeIfAbsent2(String str, Function<? super String, ? extends k> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public k computeIfPresent2(String str, BiFunction<? super String, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof k) {
            return containsValue((k) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public k merge2(String str, k kVar, BiFunction<? super k, ? super k, ? extends k> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public k put2(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public k putIfAbsent2(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public k replace2(String str, k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public final /* bridge */ k get2(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, k kVar, k kVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(String str, k kVar, k kVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
