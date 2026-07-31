package L0;

import H2.AbstractC0080b;
import b0.AbstractC0259J;
import b0.C0284q;
import b0.C0288u;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final C0284q f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2673b;

    public b(C0284q c0284q, float f3) {
        this.f2672a = c0284q;
        this.f2673b = f3;
    }

    @Override // L0.j
    public final float a() {
        return this.f2673b;
    }

    @Override // L0.j
    public final long b() {
        int i3 = C0288u.f4297g;
        return C0288u.f4296f;
    }

    @Override // L0.j
    public final AbstractC0259J c() {
        return this.f2672a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Z1.i.a(this.f2672a, bVar.f2672a) && Float.compare(this.f2673b, bVar.f2673b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2673b) + (this.f2672a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.f2672a);
        sb.append(", alpha=");
        return AbstractC0080b.j(sb, this.f2673b, ')');
    }
}
