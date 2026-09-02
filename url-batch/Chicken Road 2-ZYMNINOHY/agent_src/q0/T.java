package q0;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final int f14879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14880b;

    public T(int i4, boolean z) {
        this.f14879a = i4;
        this.f14880b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t4 = (T) obj;
        return this.f14879a == t4.f14879a && this.f14880b == t4.f14880b;
    }

    public final int hashCode() {
        return (this.f14879a * 31) + (this.f14880b ? 1 : 0);
    }
}
