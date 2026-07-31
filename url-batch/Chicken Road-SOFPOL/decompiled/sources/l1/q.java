package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4803b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4804c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4805d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4806e;

    public q(float f6, float f8, float f9, float f10) {
        super(2);
        this.f4803b = f6;
        this.f4804c = f8;
        this.f4805d = f9;
        this.f4806e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f4803b, qVar.f4803b) == 0 && Float.compare(this.f4804c, qVar.f4804c) == 0 && Float.compare(this.f4805d, qVar.f4805d) == 0 && Float.compare(this.f4806e, qVar.f4806e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4806e) + a0.q.a(this.f4805d, a0.q.a(this.f4804c, Float.hashCode(this.f4803b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f4803b);
        sb.append(", dy1=");
        sb.append(this.f4804c);
        sb.append(", dx2=");
        sb.append(this.f4805d);
        sb.append(", dy2=");
        return a0.q.j(sb, this.f4806e, ')');
    }
}
