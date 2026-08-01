package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084a {

    /* renamed from: a, reason: collision with root package name */
    public int f2027a;

    /* renamed from: b, reason: collision with root package name */
    public int f2028b;

    /* renamed from: c, reason: collision with root package name */
    public int f2029c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0084a.class != obj.getClass()) {
            return false;
        }
        C0084a c0084a = (C0084a) obj;
        int i = this.f2027a;
        if (i != c0084a.f2027a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2029c - this.f2028b) == 1 && this.f2029c == c0084a.f2028b && this.f2028b == c0084a.f2029c) {
            return true;
        }
        return this.f2029c == c0084a.f2029c && this.f2028b == c0084a.f2028b;
    }

    public final int hashCode() {
        return (((this.f2027a * 31) + this.f2028b) * 31) + this.f2029c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2027a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2028b);
        sb.append("c:");
        sb.append(this.f2029c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
