package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7917c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7918d;

    public m(float f3, float f10) {
        super(3);
        this.f7917c = f3;
        this.f7918d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f7917c, mVar.f7917c) == 0 && Float.compare(this.f7918d, mVar.f7918d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7918d) + (Float.hashCode(this.f7917c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f7917c);
        sb2.append(", y=");
        return v4.a.l(sb2, this.f7918d, ')');
    }
}
