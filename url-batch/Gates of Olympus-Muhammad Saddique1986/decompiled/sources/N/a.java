package N;

import g2.InterfaceC0439a;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3498d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3499e;

    public a(Object obj, Object obj2) {
        this.f3498d = obj;
        this.f3499e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && f2.j.a(entry.getKey(), this.f3498d) && f2.j.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3498d;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f3499e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3498d;
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
        sb.append(this.f3498d);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
