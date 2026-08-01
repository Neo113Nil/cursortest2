package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091a {

    /* renamed from: a, reason: collision with root package name */
    public int f2160a;

    /* renamed from: b, reason: collision with root package name */
    public int f2161b;

    /* renamed from: c, reason: collision with root package name */
    public int f2162c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0091a.class != obj.getClass()) {
            return false;
        }
        C0091a c0091a = (C0091a) obj;
        int i = this.f2160a;
        if (i != c0091a.f2160a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2162c - this.f2161b) == 1 && this.f2162c == c0091a.f2161b && this.f2161b == c0091a.f2162c) {
            return true;
        }
        return this.f2162c == c0091a.f2162c && this.f2161b == c0091a.f2161b;
    }

    public final int hashCode() {
        return (((this.f2160a * 31) + this.f2161b) * 31) + this.f2162c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2160a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2161b);
        sb.append("c:");
        sb.append(this.f2162c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
