package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7937c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7938d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7939e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7940f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7941h;

    public s(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f7937c = f3;
        this.f7938d = f10;
        this.f7939e = f11;
        this.f7940f = f12;
        this.g = f13;
        this.f7941h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f7937c, sVar.f7937c) == 0 && Float.compare(this.f7938d, sVar.f7938d) == 0 && Float.compare(this.f7939e, sVar.f7939e) == 0 && Float.compare(this.f7940f, sVar.f7940f) == 0 && Float.compare(this.g, sVar.g) == 0 && Float.compare(this.f7941h, sVar.f7941h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7941h) + n0.l.b(this.g, n0.l.b(this.f7940f, n0.l.b(this.f7939e, n0.l.b(this.f7938d, Float.hashCode(this.f7937c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f7937c);
        sb2.append(", dy1=");
        sb2.append(this.f7938d);
        sb2.append(", dx2=");
        sb2.append(this.f7939e);
        sb2.append(", dy2=");
        sb2.append(this.f7940f);
        sb2.append(", dx3=");
        sb2.append(this.g);
        sb2.append(", dy3=");
        return v4.a.l(sb2, this.f7941h, ')');
    }
}
