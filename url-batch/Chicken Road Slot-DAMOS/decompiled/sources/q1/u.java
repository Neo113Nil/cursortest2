package q1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f7943c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7944d;

    public u(float f3, float f10) {
        super(3);
        this.f7943c = f3;
        this.f7944d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f7943c, uVar.f7943c) == 0 && Float.compare(this.f7944d, uVar.f7944d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7944d) + (Float.hashCode(this.f7943c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f7943c);
        sb2.append(", dy=");
        return v4.a.l(sb2, this.f7944d, ')');
    }
}
