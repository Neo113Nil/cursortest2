package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: f, reason: collision with root package name */
    public final float f6309f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6310g;

    /* renamed from: h, reason: collision with root package name */
    public final n2.a f6311h;

    public d(float f9, float f10, n2.a aVar) {
        this.f6309f = f9;
        this.f6310g = f10;
        this.f6311h = aVar;
    }

    @Override // m2.b
    public final float G(long j8) {
        if (n.a(m.b(j8), 4294967296L)) {
            return this.f6311h.b(m.c(j8));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // m2.b
    public final float a() {
        return this.f6309f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6309f, dVar.f6309f) == 0 && Float.compare(this.f6310g, dVar.f6310g) == 0 && r6.k.a(this.f6311h, dVar.f6311h);
    }

    public final int hashCode() {
        return this.f6311h.hashCode() + a0.m.a(this.f6310g, Float.hashCode(this.f6309f) * 31, 31);
    }

    @Override // m2.b
    public final float m() {
        return this.f6310g;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f6309f + ", fontScale=" + this.f6310g + ", converter=" + this.f6311h + ')';
    }

    @Override // m2.b
    public final long w(float f9) {
        return r4.a.O(4294967296L, this.f6311h.a(f9));
    }
}
