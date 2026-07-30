package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j51 implements Map.Entry {
    public final Object d;
    public final wg0 e;
    public j51 g;
    public j51 h;

    public j51(ug0 ug0Var, wg0 wg0Var) {
        this.d = ug0Var;
        this.e = wg0Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j51) {
            j51 j51Var = (j51) obj;
            return this.d.equals(j51Var.d) && this.e == j51Var.e;
        }
        return false;
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
        return this.e.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.e;
    }
}
