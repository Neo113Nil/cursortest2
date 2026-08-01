package e0;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113a {

    /* renamed from: a, reason: collision with root package name */
    public int f2188a;

    /* renamed from: b, reason: collision with root package name */
    public int f2189b;

    /* renamed from: c, reason: collision with root package name */
    public int f2190c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0113a.class != obj.getClass()) {
            return false;
        }
        C0113a c0113a = (C0113a) obj;
        int i = this.f2188a;
        if (i != c0113a.f2188a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2190c - this.f2189b) == 1 && this.f2190c == c0113a.f2189b && this.f2189b == c0113a.f2190c) {
            return true;
        }
        return this.f2190c == c0113a.f2190c && this.f2189b == c0113a.f2189b;
    }

    public final int hashCode() {
        return (((this.f2188a * 31) + this.f2189b) * 31) + this.f2190c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2188a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2189b);
        sb.append("c:");
        sb.append(this.f2190c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
