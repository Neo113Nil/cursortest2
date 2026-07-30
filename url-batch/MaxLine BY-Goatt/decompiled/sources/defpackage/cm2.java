package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cm2 implements Map.Entry, Comparable {
    public final Comparable m;
    public Object n;
    public final /* synthetic */ bm2 o;

    public cm2(bm2 bm2Var, Comparable comparable, Object obj) {
        this.o = bm2Var;
        this.m = comparable;
        this.n = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.m.compareTo(((cm2) obj).m);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.m;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.n;
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
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.m;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.n;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.o.b();
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        return this.m + "=" + this.n;
    }
}
