package W;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f3354c = new v(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3356b;

    static {
        new v(0, 0);
        J.G(0);
        J.G(1);
    }

    public v(int i4, int i5) {
        AbstractC0124a.h((i4 == -1 || i4 >= 0) && (i5 == -1 || i5 >= 0));
        this.f3355a = i4;
        this.f3356b = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f3355a == vVar.f3355a && this.f3356b == vVar.f3356b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f3355a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f3356b;
    }

    public final String toString() {
        return this.f3355a + "x" + this.f3356b;
    }
}
