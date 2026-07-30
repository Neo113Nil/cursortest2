package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s91 {
    public static final s91 d = new s91(0.0f, la0.d(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public s91(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91Var = (s91) obj;
        return hi.c(this.a, s91Var.a) && wq0.b(this.b, s91Var.b) && this.c == s91Var.c;
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Float.hashCode(this.c) + qy0.e(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        qy0.r(this.a, sb, ", offset=");
        sb.append((Object) wq0.g(this.b));
        sb.append(", blurRadius=");
        return qy0.l(sb, this.c, ')');
    }
}
