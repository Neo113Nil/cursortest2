package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m implements s2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6532a;

    public m(float f6) {
        this.f6532a = f6;
    }

    @Override // s2.a
    public final float a(float f6) {
        return f6 / this.f6532a;
    }

    @Override // s2.a
    public final float b(float f6) {
        return f6 * this.f6532a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f6532a, ((m) obj).f6532a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6532a);
    }

    public final String toString() {
        return a0.q.j(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6532a, ')');
    }
}
