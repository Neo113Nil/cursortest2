package o;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class t implements Map.Entry, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5537d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5538e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5539f;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.f5537d = i;
        this.f5538e = obj;
        this.f5539f = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f5537d) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && q6.i.a(entry.getKey(), this.f5538e) && q6.i.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f5537d) {
        }
        return this.f5538e;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f5537d) {
        }
        return this.f5539f;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f5537d) {
            case 1:
                Object obj = this.f5538e;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f5537d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f5537d) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f5538e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
