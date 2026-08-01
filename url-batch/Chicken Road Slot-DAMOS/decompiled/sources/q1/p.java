package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7925c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7926d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7927e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7928f;

    public p(float f3, float f10, float f11, float f12) {
        super(2);
        this.f7925c = f3;
        this.f7926d = f10;
        this.f7927e = f11;
        this.f7928f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f7925c, pVar.f7925c) == 0 && Float.compare(this.f7926d, pVar.f7926d) == 0 && Float.compare(this.f7927e, pVar.f7927e) == 0 && Float.compare(this.f7928f, pVar.f7928f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7928f) + n0.l.b(this.f7927e, n0.l.b(this.f7926d, Float.hashCode(this.f7925c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f7925c);
        sb2.append(", y1=");
        sb2.append(this.f7926d);
        sb2.append(", x2=");
        sb2.append(this.f7927e);
        sb2.append(", y2=");
        return v4.a.l(sb2, this.f7928f, ')');
    }
}
