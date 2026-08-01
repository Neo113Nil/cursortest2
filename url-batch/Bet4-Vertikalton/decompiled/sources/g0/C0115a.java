package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115a {

    /* renamed from: a, reason: collision with root package name */
    public int f2321a;

    /* renamed from: b, reason: collision with root package name */
    public int f2322b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2323c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115a)) {
            return false;
        }
        C0115a c0115a = (C0115a) obj;
        int i = this.f2321a;
        if (i != c0115a.f2321a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.f2322b) == 1 && this.d == c0115a.f2322b && this.f2322b == c0115a.d) {
            return true;
        }
        if (this.d != c0115a.d || this.f2322b != c0115a.f2322b) {
            return false;
        }
        Object obj2 = this.f2323c;
        if (obj2 != null) {
            if (!obj2.equals(c0115a.f2323c)) {
                return false;
            }
        } else if (c0115a.f2323c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f2321a * 31) + this.f2322b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2321a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2322b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.f2323c);
        sb.append("]");
        return sb.toString();
    }
}
