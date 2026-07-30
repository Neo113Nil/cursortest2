package c0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f1454a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1455b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1456c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1457d;

    public f(float f9, float f10, float f11, float f12) {
        this.f1454a = f9;
        this.f1455b = f10;
        this.f1456c = f11;
        this.f1457d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1454a == fVar.f1454a && this.f1455b == fVar.f1455b && this.f1456c == fVar.f1456c && this.f1457d == fVar.f1457d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1457d) + a0.m.a(this.f1456c, a0.m.a(this.f1455b, Float.hashCode(this.f1454a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f1454a);
        sb.append(", focusedAlpha=");
        sb.append(this.f1455b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f1456c);
        sb.append(", pressedAlpha=");
        return a0.m.k(sb, this.f1457d, ')');
    }
}
