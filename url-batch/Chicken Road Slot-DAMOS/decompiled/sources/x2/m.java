package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements y2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f10333a;

    public m(float f3) {
        this.f10333a = f3;
    }

    @Override // y2.a
    public final float a(float f3) {
        return f3 / this.f10333a;
    }

    @Override // y2.a
    public final float b(float f3) {
        return f3 * this.f10333a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f10333a, ((m) obj).f10333a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10333a);
    }

    public final String toString() {
        return v4.a.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f10333a, ')');
    }
}
