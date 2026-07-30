package f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f3225c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3226d;

    public n(float f9, float f10) {
        super(3);
        this.f3225c = f9;
        this.f3226d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f3225c, nVar.f3225c) == 0 && Float.compare(this.f3226d, nVar.f3226d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3226d) + (Float.hashCode(this.f3225c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f3225c);
        sb.append(", y=");
        return a0.m.k(sb, this.f3226d, ')');
    }
}
