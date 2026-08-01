package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7951c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7952d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7953e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7954f;

    public x(float f3, float f10, float f11, float f12) {
        super(2);
        this.f7951c = f3;
        this.f7952d = f10;
        this.f7953e = f11;
        this.f7954f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f7951c, xVar.f7951c) == 0 && Float.compare(this.f7952d, xVar.f7952d) == 0 && Float.compare(this.f7953e, xVar.f7953e) == 0 && Float.compare(this.f7954f, xVar.f7954f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7954f) + n0.l.b(this.f7953e, n0.l.b(this.f7952d, Float.hashCode(this.f7951c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f7951c);
        sb2.append(", dy1=");
        sb2.append(this.f7952d);
        sb2.append(", dx2=");
        sb2.append(this.f7953e);
        sb2.append(", dy2=");
        return v4.a.l(sb2, this.f7954f, ')');
    }
}
