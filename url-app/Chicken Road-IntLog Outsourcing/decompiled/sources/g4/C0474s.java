package g4;

/* renamed from: g4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474s {

    /* renamed from: a, reason: collision with root package name */
    public final int f5753a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5754b;

    public C0474s(int i2, Object obj) {
        this.f5753a = i2;
        this.f5754b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0474s)) {
            return false;
        }
        C0474s c0474s = (C0474s) obj;
        return this.f5753a == c0474s.f5753a && kotlin.jvm.internal.i.a(this.f5754b, c0474s.f5754b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f5753a) * 31;
        Object obj = this.f5754b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5753a + ", value=" + this.f5754b + ')';
    }
}
