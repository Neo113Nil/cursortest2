package f0;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084a {

    /* renamed from: a, reason: collision with root package name */
    public int f2024a;

    /* renamed from: b, reason: collision with root package name */
    public int f2025b;

    /* renamed from: c, reason: collision with root package name */
    public int f2026c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0084a.class != obj.getClass()) {
            return false;
        }
        C0084a c0084a = (C0084a) obj;
        int i = this.f2024a;
        if (i != c0084a.f2024a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f2026c - this.f2025b) == 1 && this.f2026c == c0084a.f2025b && this.f2025b == c0084a.f2026c) {
            return true;
        }
        return this.f2026c == c0084a.f2026c && this.f2025b == c0084a.f2025b;
    }

    public final int hashCode() {
        return (((this.f2024a * 31) + this.f2025b) * 31) + this.f2026c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f2024a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f2025b);
        sb.append("c:");
        sb.append(this.f2026c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
