package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gb1 implements Map.Entry, Comparable {
    public final Comparable d;
    public Object e;
    public final /* synthetic */ fb1 g;

    public gb1(fb1 fb1Var, Comparable comparable, Object obj) {
        this.g = fb1Var;
        this.d = comparable;
        this.e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.d.compareTo(((gb1) obj).d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.d;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.e;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.e;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.g.b();
        Object obj2 = this.e;
        this.e = obj;
        return obj2;
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
