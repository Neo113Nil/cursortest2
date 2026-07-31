package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4779b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4780c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4781d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4782e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4783f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4784g;

    public i(float f6, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f4779b = f6;
        this.f4780c = f8;
        this.f4781d = f9;
        this.f4782e = f10;
        this.f4783f = f11;
        this.f4784g = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f4779b, iVar.f4779b) == 0 && Float.compare(this.f4780c, iVar.f4780c) == 0 && Float.compare(this.f4781d, iVar.f4781d) == 0 && Float.compare(this.f4782e, iVar.f4782e) == 0 && Float.compare(this.f4783f, iVar.f4783f) == 0 && Float.compare(this.f4784g, iVar.f4784g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4784g) + a0.q.a(this.f4783f, a0.q.a(this.f4782e, a0.q.a(this.f4781d, a0.q.a(this.f4780c, Float.hashCode(this.f4779b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f4779b);
        sb.append(", y1=");
        sb.append(this.f4780c);
        sb.append(", x2=");
        sb.append(this.f4781d);
        sb.append(", y2=");
        sb.append(this.f4782e);
        sb.append(", x3=");
        sb.append(this.f4783f);
        sb.append(", y3=");
        return a0.q.j(sb, this.f4784g, ')');
    }
}
