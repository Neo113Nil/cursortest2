package M0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f2761d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2762e;

    public c(float f3, float f4) {
        this.f2761d = f3;
        this.f2762e = f4;
    }

    @Override // M0.b
    public final float a() {
        return this.f2761d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f2761d, cVar.f2761d) == 0 && Float.compare(this.f2762e, cVar.f2762e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2762e) + (Float.hashCode(this.f2761d) * 31);
    }

    @Override // M0.b
    public final float p() {
        return this.f2762e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f2761d);
        sb.append(", fontScale=");
        return AbstractC0080b.j(sb, this.f2762e, ')');
    }
}
