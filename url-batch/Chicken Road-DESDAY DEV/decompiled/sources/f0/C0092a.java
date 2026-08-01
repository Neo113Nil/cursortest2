package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092a {

    /* renamed from: a, reason: collision with root package name */
    public int f2093a;

    /* renamed from: b, reason: collision with root package name */
    public int f2094b;

    /* renamed from: c, reason: collision with root package name */
    public int f2095c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0092a.class != obj.getClass()) {
            return false;
        }
        C0092a c0092a = (C0092a) obj;
        int i = this.f2093a;
        if (i != c0092a.f2093a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2095c - this.f2094b) == 1 && this.f2095c == c0092a.f2094b && this.f2094b == c0092a.f2095c) {
            return true;
        }
        return this.f2095c == c0092a.f2095c && this.f2094b == c0092a.f2094b;
    }

    public final int hashCode() {
        return (((this.f2093a * 31) + this.f2094b) * 31) + this.f2095c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2093a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2094b);
        sb.append("c:");
        sb.append(this.f2095c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
