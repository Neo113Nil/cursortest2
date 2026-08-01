package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087a {

    /* renamed from: a, reason: collision with root package name */
    public int f2135a;

    /* renamed from: b, reason: collision with root package name */
    public int f2136b;

    /* renamed from: c, reason: collision with root package name */
    public int f2137c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0087a.class != obj.getClass()) {
            return false;
        }
        C0087a c0087a = (C0087a) obj;
        int i = this.f2135a;
        if (i != c0087a.f2135a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2137c - this.f2136b) == 1 && this.f2137c == c0087a.f2136b && this.f2136b == c0087a.f2137c) {
            return true;
        }
        return this.f2137c == c0087a.f2137c && this.f2136b == c0087a.f2136b;
    }

    public final int hashCode() {
        return (((this.f2135a * 31) + this.f2136b) * 31) + this.f2137c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2135a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2136b);
        sb.append("c:");
        sb.append(this.f2137c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
