package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dp3 implements Map.Entry, Comparable {
    public final Comparable m;
    public Object n;
    public final /* synthetic */ cp3 o;

    public dp3(cp3 cp3Var, Comparable comparable, Object obj) {
        this.o = cp3Var;
        this.m = comparable;
        this.n = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.m.compareTo(((dp3) obj).m);
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
    public final /* synthetic */ Object getKey() {
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
        this.o.f();
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.m);
        String valueOf2 = String.valueOf(this.n);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
