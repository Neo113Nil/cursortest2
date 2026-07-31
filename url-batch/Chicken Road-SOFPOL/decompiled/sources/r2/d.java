package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: d, reason: collision with root package name */
    public final float f6515d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6516e;

    public d(float f6, float f8) {
        this.f6515d = f6;
        this.f6516e = f8;
    }

    @Override // r2.c
    public final float b() {
        return this.f6515d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6515d, dVar.f6515d) == 0 && Float.compare(this.f6516e, dVar.f6516e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6516e) + (Float.hashCode(this.f6515d) * 31);
    }

    @Override // r2.c
    public final float i() {
        return this.f6516e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6515d);
        sb.append(", fontScale=");
        return a0.q.j(sb, this.f6516e, ')');
    }
}
