package h0;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119a {

    /* renamed from: a, reason: collision with root package name */
    public int f2451a;

    /* renamed from: b, reason: collision with root package name */
    public int f2452b;

    /* renamed from: c, reason: collision with root package name */
    public int f2453c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0119a)) {
            return false;
        }
        C0119a c0119a = (C0119a) obj;
        int i = this.f2451a;
        if (i != c0119a.f2451a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2453c - this.f2452b) == 1 && this.f2453c == c0119a.f2452b && this.f2452b == c0119a.f2453c) {
            return true;
        }
        return this.f2453c == c0119a.f2453c && this.f2452b == c0119a.f2452b;
    }

    public final int hashCode() {
        return (((this.f2451a * 31) + this.f2452b) * 31) + this.f2453c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2451a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2452b);
        sb.append("c:");
        sb.append(this.f2453c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
