package L0;

import A.AbstractC0017m;
import Z.AbstractC0319p;
import Z.C0323u;
import Z.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final N f3494a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3495b;

    public b(N n2, float f4) {
        this.f3494a = n2;
        this.f3495b = f4;
    }

    @Override // L0.n
    public final float a() {
        return this.f3495b;
    }

    @Override // L0.n
    public final long b() {
        int i2 = C0323u.f4548h;
        return C0323u.f4547g;
    }

    @Override // L0.n
    public final AbstractC0319p c() {
        return this.f3494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f3494a, bVar.f3494a) && Float.compare(this.f3495b, bVar.f3495b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3495b) + (this.f3494a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f3494a);
        sb.append(", alpha=");
        return AbstractC0017m.k(sb, this.f3495b, ')');
    }
}
