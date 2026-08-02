package v2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i0 extends Z implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Z f15646a;

    public i0(Z z) {
        this.f15646a = z;
    }

    @Override // v2.Z
    public final Z a() {
        return this.f15646a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15646a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            return this.f15646a.equals(((i0) obj).f15646a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15646a.hashCode();
    }

    public final String toString() {
        return this.f15646a + ".reverse()";
    }
}
