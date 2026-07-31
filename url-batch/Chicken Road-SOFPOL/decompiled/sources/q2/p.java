package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f6061c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f6062a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6063b;

    public p(float f6, float f8) {
        this.f6062a = f6;
        this.f6063b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6062a == pVar.f6062a && this.f6063b == pVar.f6063b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6063b) + (Float.hashCode(this.f6062a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f6062a);
        sb.append(", skewX=");
        return a0.q.j(sb, this.f6063b, ')');
    }
}
