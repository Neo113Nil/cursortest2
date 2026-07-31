package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8199a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8202d;

    public b0(int i, int i8, int i9, int i10) {
        this.f8199a = i;
        this.f8200b = i8;
        this.f8201c = i9;
        this.f8202d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f8199a == b0Var.f8199a && this.f8200b == b0Var.f8200b && this.f8201c == b0Var.f8201c && this.f8202d == b0Var.f8202d;
    }

    public final int hashCode() {
        return (((((this.f8199a * 31) + this.f8200b) * 31) + this.f8201c) * 31) + this.f8202d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f8199a);
        sb.append(", top=");
        sb.append(this.f8200b);
        sb.append(", right=");
        sb.append(this.f8201c);
        sb.append(", bottom=");
        return a0.q.k(sb, this.f8202d, ')');
    }
}
