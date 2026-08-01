package e0;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114a {

    /* renamed from: a, reason: collision with root package name */
    public int f2192a;

    /* renamed from: b, reason: collision with root package name */
    public int f2193b;

    /* renamed from: c, reason: collision with root package name */
    public int f2194c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0114a.class != obj.getClass()) {
            return false;
        }
        C0114a c0114a = (C0114a) obj;
        int i = this.f2192a;
        if (i != c0114a.f2192a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2194c - this.f2193b) == 1 && this.f2194c == c0114a.f2193b && this.f2193b == c0114a.f2194c) {
            return true;
        }
        return this.f2194c == c0114a.f2194c && this.f2193b == c0114a.f2193b;
    }

    public final int hashCode() {
        return (((this.f2192a * 31) + this.f2193b) * 31) + this.f2194c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2192a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2193b);
        sb.append("c:");
        sb.append(this.f2194c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
