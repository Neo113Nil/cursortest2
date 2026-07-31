package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4788b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4789c;

    public l(float f6, float f8) {
        super(3);
        this.f4788b = f6;
        this.f4789c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f4788b, lVar.f4788b) == 0 && Float.compare(this.f4789c, lVar.f4789c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4789c) + (Float.hashCode(this.f4788b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f4788b);
        sb.append(", y=");
        return a0.q.j(sb, this.f4789c, ')');
    }
}
