package L;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a implements Map.Entry, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3455d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3456e;

    public a(Object obj, Object obj2) {
        this.f3455d = obj;
        this.f3456e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.a(entry.getKey(), this.f3455d) && Intrinsics.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3455d;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f3456e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3455d;
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
        sb.append(this.f3455d);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
