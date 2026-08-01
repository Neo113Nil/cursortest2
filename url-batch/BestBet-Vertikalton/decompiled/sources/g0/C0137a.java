package g0;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137a {

    /* renamed from: a, reason: collision with root package name */
    public int f2794a;

    /* renamed from: b, reason: collision with root package name */
    public int f2795b;

    /* renamed from: c, reason: collision with root package name */
    public int f2796c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137a)) {
            return false;
        }
        C0137a c0137a = (C0137a) obj;
        int i = this.f2794a;
        if (i != c0137a.f2794a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2796c - this.f2795b) == 1 && this.f2796c == c0137a.f2795b && this.f2795b == c0137a.f2796c) {
            return true;
        }
        return this.f2796c == c0137a.f2796c && this.f2795b == c0137a.f2795b;
    }

    public final int hashCode() {
        return (((this.f2794a * 31) + this.f2795b) * 31) + this.f2796c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2794a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2795b);
        sb.append("c:");
        sb.append(this.f2796c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
