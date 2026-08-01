package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090a {

    /* renamed from: a, reason: collision with root package name */
    public int f2092a;

    /* renamed from: b, reason: collision with root package name */
    public int f2093b;

    /* renamed from: c, reason: collision with root package name */
    public int f2094c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0090a.class != obj.getClass()) {
            return false;
        }
        C0090a c0090a = (C0090a) obj;
        int i = this.f2092a;
        if (i != c0090a.f2092a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2094c - this.f2093b) == 1 && this.f2094c == c0090a.f2093b && this.f2093b == c0090a.f2094c) {
            return true;
        }
        return this.f2094c == c0090a.f2094c && this.f2093b == c0090a.f2093b;
    }

    public final int hashCode() {
        return (((this.f2092a * 31) + this.f2093b) * 31) + this.f2094c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2092a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2093b);
        sb.append("c:");
        sb.append(this.f2094c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
