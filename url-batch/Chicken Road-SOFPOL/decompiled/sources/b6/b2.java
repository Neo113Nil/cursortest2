package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1275c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1276d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1277e;

    public b2(float f6, float f8, float f9, float f10, float f11) {
        this.f1273a = f6;
        this.f1274b = f8;
        this.f1275c = f9;
        this.f1276d = f10;
        this.f1277e = f11;
    }

    public static b2 a(b2 b2Var, float f6, float f8, int i) {
        if ((i & 1) != 0) {
            f6 = b2Var.f1273a;
        }
        return new b2(f6, f8, b2Var.f1275c, b2Var.f1276d, b2Var.f1277e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Float.compare(this.f1273a, b2Var.f1273a) == 0 && Float.compare(this.f1274b, b2Var.f1274b) == 0 && Float.compare(this.f1275c, b2Var.f1275c) == 0 && Float.compare(this.f1276d, b2Var.f1276d) == 0 && Float.compare(this.f1277e, b2Var.f1277e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1277e) + a0.q.a(this.f1276d, a0.q.a(this.f1275c, a0.q.a(this.f1274b, Float.hashCode(this.f1273a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Snowflake(x=" + this.f1273a + ", y=" + this.f1274b + ", size=" + this.f1275c + ", speed=" + this.f1276d + ", opacity=" + this.f1277e + ")";
    }
}
