package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4786b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4787c;

    public k(float f6, float f8) {
        super(3);
        this.f4786b = f6;
        this.f4787c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f4786b, kVar.f4786b) == 0 && Float.compare(this.f4787c, kVar.f4787c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4787c) + (Float.hashCode(this.f4786b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4786b);
        sb.append(", y=");
        return a0.q.j(sb, this.f4787c, ')');
    }
}
