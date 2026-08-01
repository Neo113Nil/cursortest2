package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095a {

    /* renamed from: a, reason: collision with root package name */
    public int f2212a;

    /* renamed from: b, reason: collision with root package name */
    public int f2213b;

    /* renamed from: c, reason: collision with root package name */
    public int f2214c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0095a.class != obj.getClass()) {
            return false;
        }
        C0095a c0095a = (C0095a) obj;
        int i = this.f2212a;
        if (i != c0095a.f2212a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2214c - this.f2213b) == 1 && this.f2214c == c0095a.f2213b && this.f2213b == c0095a.f2214c) {
            return true;
        }
        return this.f2214c == c0095a.f2214c && this.f2213b == c0095a.f2213b;
    }

    public final int hashCode() {
        return (((this.f2212a * 31) + this.f2213b) * 31) + this.f2214c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2212a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2213b);
        sb.append("c:");
        sb.append(this.f2214c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
