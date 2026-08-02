package T;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f2775d = new e0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2777b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2778c;

    static {
        W.J.G(0);
        W.J.G(1);
        W.J.G(3);
    }

    public e0(int i4, int i5) {
        this(1.0f, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f2776a == e0Var.f2776a && this.f2777b == e0Var.f2777b && this.f2778c == e0Var.f2778c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f2778c) + ((((217 + this.f2776a) * 31) + this.f2777b) * 31);
    }

    public e0(float f4, int i4, int i5) {
        this.f2776a = i4;
        this.f2777b = i5;
        this.f2778c = f4;
    }
}
