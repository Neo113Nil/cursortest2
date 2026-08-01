package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7947c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7948d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7949e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7950f;

    public w(float f3, float f10, float f11, float f12) {
        super(1);
        this.f7947c = f3;
        this.f7948d = f10;
        this.f7949e = f11;
        this.f7950f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f7947c, wVar.f7947c) == 0 && Float.compare(this.f7948d, wVar.f7948d) == 0 && Float.compare(this.f7949e, wVar.f7949e) == 0 && Float.compare(this.f7950f, wVar.f7950f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7950f) + n0.l.b(this.f7949e, n0.l.b(this.f7948d, Float.hashCode(this.f7947c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f7947c);
        sb2.append(", dy1=");
        sb2.append(this.f7948d);
        sb2.append(", dx2=");
        sb2.append(this.f7949e);
        sb2.append(", dy2=");
        return v4.a.l(sb2, this.f7950f, ')');
    }
}
