package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7946d;

    public v(float f3, float f10) {
        super(3);
        this.f7945c = f3;
        this.f7946d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f7945c, vVar.f7945c) == 0 && Float.compare(this.f7946d, vVar.f7946d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7946d) + (Float.hashCode(this.f7945c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f7945c);
        sb2.append(", dy=");
        return v4.a.l(sb2, this.f7946d, ')');
    }
}
