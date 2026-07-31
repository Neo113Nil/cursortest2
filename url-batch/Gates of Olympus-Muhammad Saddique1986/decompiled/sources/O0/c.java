package O0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f3726d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3727e;

    public c(float f3, float f4) {
        this.f3726d = f3;
        this.f3727e = f4;
    }

    @Override // O0.b
    public final float a() {
        return this.f3726d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f3726d, cVar.f3726d) == 0 && Float.compare(this.f3727e, cVar.f3727e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3727e) + (Float.hashCode(this.f3726d) * 31);
    }

    @Override // O0.b
    public final float r() {
        return this.f3727e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f3726d);
        sb.append(", fontScale=");
        return A.k.i(sb, this.f3727e, ')');
    }
}
