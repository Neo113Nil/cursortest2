package T;

import java.util.Collections;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final U f2710a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.I f2711b;

    static {
        W.J.G(0);
        W.J.G(1);
    }

    public V(U u4, int i4) {
        v2.a0 o = v2.I.o(Integer.valueOf(i4));
        if (!o.isEmpty() && (((Integer) Collections.min(o)).intValue() < 0 || ((Integer) Collections.max(o)).intValue() >= u4.f2705a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f2710a = u4;
        this.f2711b = v2.I.k(o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V.class == obj.getClass()) {
            V v = (V) obj;
            if (this.f2710a.equals(v.f2710a) && this.f2711b.equals(v.f2711b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2711b.hashCode() * 31) + this.f2710a.hashCode();
    }
}
