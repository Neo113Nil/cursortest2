package N0;

import b0.AbstractC0347p;
import b0.C0348q;
import b0.C0352v;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final C0348q f3532a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3533b;

    public b(C0348q c0348q, float f3) {
        this.f3532a = c0348q;
        this.f3533b = f3;
    }

    @Override // N0.m
    public final float a() {
        return this.f3533b;
    }

    @Override // N0.m
    public final long b() {
        int i3 = C0352v.f5440h;
        return C0352v.f5439g;
    }

    @Override // N0.m
    public final AbstractC0347p c() {
        return this.f3532a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f2.j.a(this.f3532a, bVar.f3532a) && Float.compare(this.f3533b, bVar.f3533b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3533b) + (this.f3532a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f3532a);
        sb.append(", alpha=");
        return A.k.i(sb, this.f3533b, ')');
    }
}
