package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7888c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7889d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7890e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7891f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7892h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7893i;

    public i(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
        super(3);
        this.f7888c = f3;
        this.f7889d = f10;
        this.f7890e = f11;
        this.f7891f = z10;
        this.g = z11;
        this.f7892h = f12;
        this.f7893i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f7888c, iVar.f7888c) == 0 && Float.compare(this.f7889d, iVar.f7889d) == 0 && Float.compare(this.f7890e, iVar.f7890e) == 0 && this.f7891f == iVar.f7891f && this.g == iVar.g && Float.compare(this.f7892h, iVar.f7892h) == 0 && Float.compare(this.f7893i, iVar.f7893i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7893i) + n0.l.b(this.f7892h, n0.l.d(n0.l.d(n0.l.b(this.f7890e, n0.l.b(this.f7889d, Float.hashCode(this.f7888c) * 31, 31), 31), 31, this.f7891f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f7888c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f7889d);
        sb2.append(", theta=");
        sb2.append(this.f7890e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f7891f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.g);
        sb2.append(", arcStartX=");
        sb2.append(this.f7892h);
        sb2.append(", arcStartY=");
        return v4.a.l(sb2, this.f7893i, ')');
    }
}
