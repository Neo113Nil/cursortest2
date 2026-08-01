package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7929c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7930d;

    public q(float f3, float f10) {
        super(1);
        this.f7929c = f3;
        this.f7930d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f7929c, qVar.f7929c) == 0 && Float.compare(this.f7930d, qVar.f7930d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7930d) + (Float.hashCode(this.f7929c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f7929c);
        sb2.append(", y=");
        return v4.a.l(sb2, this.f7930d, ')');
    }
}
