package h0;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151a {

    /* renamed from: a, reason: collision with root package name */
    public int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public int f2984b;

    /* renamed from: c, reason: collision with root package name */
    public int f2985c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0151a.class != obj.getClass()) {
            return false;
        }
        C0151a c0151a = (C0151a) obj;
        int i = this.f2983a;
        if (i != c0151a.f2983a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2985c - this.f2984b) == 1 && this.f2985c == c0151a.f2984b && this.f2984b == c0151a.f2985c) {
            return true;
        }
        return this.f2985c == c0151a.f2985c && this.f2984b == c0151a.f2984b;
    }

    public final int hashCode() {
        return (((this.f2983a * 31) + this.f2984b) * 31) + this.f2985c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2983a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2984b);
        sb.append("c:");
        sb.append(this.f2985c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
