package l0;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class a implements Map.Entry, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f5742f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5743g;

    public a(Object obj, Object obj2) {
        this.f5742f = obj;
        this.f5743g = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && r6.k.a(entry.getKey(), this.f5742f) && r6.k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5742f;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f5743g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5742f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5742f);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
