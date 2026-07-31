package l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: b, reason: collision with root package name */
    public final float f4801b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4802c;

    public p(float f6, float f8) {
        super(3);
        this.f4801b = f6;
        this.f4802c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f4801b, pVar.f4801b) == 0 && Float.compare(this.f4802c, pVar.f4802c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4802c) + (Float.hashCode(this.f4801b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f4801b);
        sb.append(", dy=");
        return a0.q.j(sb, this.f4802c, ')');
    }
}
