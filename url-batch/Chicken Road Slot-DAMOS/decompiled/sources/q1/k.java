package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7911c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7912d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7913e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7914f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7915h;

    public k(float f3, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f7911c = f3;
        this.f7912d = f10;
        this.f7913e = f11;
        this.f7914f = f12;
        this.g = f13;
        this.f7915h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f7911c, kVar.f7911c) == 0 && Float.compare(this.f7912d, kVar.f7912d) == 0 && Float.compare(this.f7913e, kVar.f7913e) == 0 && Float.compare(this.f7914f, kVar.f7914f) == 0 && Float.compare(this.g, kVar.g) == 0 && Float.compare(this.f7915h, kVar.f7915h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7915h) + n0.l.b(this.g, n0.l.b(this.f7914f, n0.l.b(this.f7913e, n0.l.b(this.f7912d, Float.hashCode(this.f7911c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f7911c);
        sb2.append(", y1=");
        sb2.append(this.f7912d);
        sb2.append(", x2=");
        sb2.append(this.f7913e);
        sb2.append(", y2=");
        sb2.append(this.f7914f);
        sb2.append(", x3=");
        sb2.append(this.g);
        sb2.append(", y3=");
        return v4.a.l(sb2, this.f7915h, ')');
    }
}
