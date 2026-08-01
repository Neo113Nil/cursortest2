package h0;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114a {

    /* renamed from: a, reason: collision with root package name */
    public int f2447a;

    /* renamed from: b, reason: collision with root package name */
    public int f2448b;

    /* renamed from: c, reason: collision with root package name */
    public int f2449c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0114a.class != obj.getClass()) {
            return false;
        }
        C0114a c0114a = (C0114a) obj;
        int i = this.f2447a;
        if (i != c0114a.f2447a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2449c - this.f2448b) == 1 && this.f2449c == c0114a.f2448b && this.f2448b == c0114a.f2449c) {
            return true;
        }
        return this.f2449c == c0114a.f2449c && this.f2448b == c0114a.f2448b;
    }

    public final int hashCode() {
        return (((this.f2447a * 31) + this.f2448b) * 31) + this.f2449c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2447a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2448b);
        sb.append("c:");
        sb.append(this.f2449c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
