package N;

import a2.InterfaceC0184a;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2816d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2817e;

    public a(Object obj, Object obj2) {
        this.f2816d = obj;
        this.f2817e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Z1.i.a(entry.getKey(), this.f2816d) && Z1.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2816d;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f2817e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2816d;
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
        sb.append(this.f2816d);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
