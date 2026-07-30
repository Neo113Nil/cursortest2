package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ad2 implements Map.Entry {
    public final Object m;
    public final Object n;
    public ad2 o;
    public ad2 p;

    public ad2(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad2)) {
            return false;
        }
        ad2 ad2Var = (ad2) obj;
        return this.m.equals(ad2Var.m) && this.n.equals(ad2Var.n);
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
        return this.n.hashCode() ^ this.m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.m + "=" + this.n;
    }
}
