package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117a {

    /* renamed from: a, reason: collision with root package name */
    public int f2362a;

    /* renamed from: b, reason: collision with root package name */
    public int f2363b;

    /* renamed from: c, reason: collision with root package name */
    public int f2364c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0117a)) {
            return false;
        }
        C0117a c0117a = (C0117a) obj;
        int i = this.f2362a;
        if (i != c0117a.f2362a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2364c - this.f2363b) == 1 && this.f2364c == c0117a.f2363b && this.f2363b == c0117a.f2364c) {
            return true;
        }
        return this.f2364c == c0117a.f2364c && this.f2363b == c0117a.f2363b;
    }

    public final int hashCode() {
        return (((this.f2362a * 31) + this.f2363b) * 31) + this.f2364c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2362a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2363b);
        sb.append("c:");
        sb.append(this.f2364c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
