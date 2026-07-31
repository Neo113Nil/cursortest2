package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4790b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4791c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4792d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4793e;

    public m(float f6, float f8, float f9, float f10) {
        super(2);
        this.f4790b = f6;
        this.f4791c = f8;
        this.f4792d = f9;
        this.f4793e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f4790b, mVar.f4790b) == 0 && Float.compare(this.f4791c, mVar.f4791c) == 0 && Float.compare(this.f4792d, mVar.f4792d) == 0 && Float.compare(this.f4793e, mVar.f4793e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4793e) + a0.q.a(this.f4792d, a0.q.a(this.f4791c, Float.hashCode(this.f4790b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f4790b);
        sb.append(", y1=");
        sb.append(this.f4791c);
        sb.append(", x2=");
        sb.append(this.f4792d);
        sb.append(", y2=");
        return a0.q.j(sb, this.f4793e, ')');
    }
}
