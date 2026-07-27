package M0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f3540d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3541e;

    public c(float f4, float f5) {
        this.f3540d = f4;
        this.f3541e = f5;
    }

    @Override // M0.b
    public final float e() {
        return this.f3540d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f3540d, cVar.f3540d) == 0 && Float.compare(this.f3541e, cVar.f3541e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3541e) + (Float.hashCode(this.f3540d) * 31);
    }

    @Override // M0.b
    public final float q() {
        return this.f3541e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f3540d);
        sb.append(", fontScale=");
        return AbstractC0017m.k(sb, this.f3541e, ')');
    }
}
