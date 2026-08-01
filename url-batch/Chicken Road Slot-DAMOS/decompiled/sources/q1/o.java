package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7921c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7922d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7923e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7924f;

    public o(float f3, float f10, float f11, float f12) {
        super(1);
        this.f7921c = f3;
        this.f7922d = f10;
        this.f7923e = f11;
        this.f7924f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f7921c, oVar.f7921c) == 0 && Float.compare(this.f7922d, oVar.f7922d) == 0 && Float.compare(this.f7923e, oVar.f7923e) == 0 && Float.compare(this.f7924f, oVar.f7924f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7924f) + n0.l.b(this.f7923e, n0.l.b(this.f7922d, Float.hashCode(this.f7921c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f7921c);
        sb2.append(", y1=");
        sb2.append(this.f7922d);
        sb2.append(", x2=");
        sb2.append(this.f7923e);
        sb2.append(", y2=");
        return v4.a.l(sb2, this.f7924f, ')');
    }
}
