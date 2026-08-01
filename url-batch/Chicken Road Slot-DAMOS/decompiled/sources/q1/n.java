package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7919c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7920d;

    public n(float f3, float f10) {
        super(3);
        this.f7919c = f3;
        this.f7920d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f7919c, nVar.f7919c) == 0 && Float.compare(this.f7920d, nVar.f7920d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7920d) + (Float.hashCode(this.f7919c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f7919c);
        sb2.append(", y=");
        return v4.a.l(sb2, this.f7920d, ')');
    }
}
