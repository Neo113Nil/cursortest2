package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4794b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4795c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4796d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4797e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4798f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4799g;

    public n(float f6, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f4794b = f6;
        this.f4795c = f8;
        this.f4796d = f9;
        this.f4797e = f10;
        this.f4798f = f11;
        this.f4799g = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f4794b, nVar.f4794b) == 0 && Float.compare(this.f4795c, nVar.f4795c) == 0 && Float.compare(this.f4796d, nVar.f4796d) == 0 && Float.compare(this.f4797e, nVar.f4797e) == 0 && Float.compare(this.f4798f, nVar.f4798f) == 0 && Float.compare(this.f4799g, nVar.f4799g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4799g) + a0.q.a(this.f4798f, a0.q.a(this.f4797e, a0.q.a(this.f4796d, a0.q.a(this.f4795c, Float.hashCode(this.f4794b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f4794b);
        sb.append(", dy1=");
        sb.append(this.f4795c);
        sb.append(", dx2=");
        sb.append(this.f4796d);
        sb.append(", dy2=");
        sb.append(this.f4797e);
        sb.append(", dx3=");
        sb.append(this.f4798f);
        sb.append(", dy3=");
        return a0.q.j(sb, this.f4799g, ')');
    }
}
