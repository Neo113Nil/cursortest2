package l1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f5824a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5825b;

    public s(float f3, float f10) {
        this.f5824a = f3;
        this.f5825b = f10;
    }

    public final float[] a() {
        float f3 = this.f5824a;
        float f10 = this.f5825b;
        return new float[]{f3 / f10, 1.0f, ((1.0f - f3) - f10) / f10};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f5824a, sVar.f5824a) == 0 && Float.compare(this.f5825b, sVar.f5825b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5825b) + (Float.hashCode(this.f5824a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f5824a);
        sb2.append(", y=");
        return v4.a.l(sb2, this.f5825b, ')');
    }
}
