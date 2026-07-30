package l2;

import z0.q;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final q f5861a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5862b;

    public b(q qVar, float f9) {
        this.f5861a = qVar;
        this.f5862b = f9;
    }

    @Override // l2.m
    public final float a() {
        return this.f5862b;
    }

    @Override // l2.m
    public final long b() {
        int i7 = u.f10058h;
        return u.f10057g;
    }

    @Override // l2.m
    public final z0.p c() {
        return this.f5861a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return r6.k.a(this.f5861a, bVar.f5861a) && Float.compare(this.f5862b, bVar.f5862b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5862b) + (this.f5861a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f5861a);
        sb.append(", alpha=");
        return a0.m.k(sb, this.f5862b, ')');
    }
}
