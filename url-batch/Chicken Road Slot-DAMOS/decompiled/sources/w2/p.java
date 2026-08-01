package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f10049c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f10050a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10051b;

    public p(float f3, float f10) {
        this.f10050a = f3;
        this.f10051b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f10050a == pVar.f10050a && this.f10051b == pVar.f10051b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10051b) + (Float.hashCode(this.f10050a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f10050a);
        sb2.append(", skewX=");
        return v4.a.l(sb2, this.f10051b, ')');
    }
}
