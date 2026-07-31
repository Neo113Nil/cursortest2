package b0;

import H2.AbstractC0080b;

/* renamed from: b0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262M {

    /* renamed from: d, reason: collision with root package name */
    public static final C0262M f4239d = new C0262M(AbstractC0259J.c(4278190080L), 0, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final long f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4242c;

    public C0262M(long j3, long j4, float f3) {
        this.f4240a = j3;
        this.f4241b = j4;
        this.f4242c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0262M)) {
            return false;
        }
        C0262M c0262m = (C0262M) obj;
        return C0288u.c(this.f4240a, c0262m.f4240a) && a0.c.b(this.f4241b, c0262m.f4241b) && this.f4242c == c0262m.f4242c;
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Float.hashCode(this.f4242c) + AbstractC0080b.d(Long.hashCode(this.f4240a) * 31, 31, this.f4241b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0080b.q(this.f4240a, sb, ", offset=");
        sb.append((Object) a0.c.j(this.f4241b));
        sb.append(", blurRadius=");
        return AbstractC0080b.j(sb, this.f4242c, ')');
    }
}
