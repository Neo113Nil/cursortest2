package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7955c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7956d;

    public y(float f3, float f10) {
        super(1);
        this.f7955c = f3;
        this.f7956d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f7955c, yVar.f7955c) == 0 && Float.compare(this.f7956d, yVar.f7956d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7956d) + (Float.hashCode(this.f7955c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f7955c);
        sb2.append(", dy=");
        return v4.a.l(sb2, this.f7956d, ')');
    }
}
