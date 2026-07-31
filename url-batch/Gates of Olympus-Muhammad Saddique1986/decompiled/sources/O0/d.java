package O0;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f3728d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3729e;

    /* renamed from: f, reason: collision with root package name */
    public final P0.a f3730f;

    public d(float f3, float f4, P0.a aVar) {
        this.f3728d = f3;
        this.f3729e = f4;
        this.f3730f = aVar;
    }

    @Override // O0.b
    public final long G(float f3) {
        return O2.l.q0(4294967296L, this.f3730f.a(f3));
    }

    @Override // O0.b
    public final float a() {
        return this.f3728d;
    }

    @Override // O0.b
    public final float b0(long j3) {
        if (n.a(m.b(j3), 4294967296L)) {
            return this.f3730f.b(m.c(j3));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f3728d, dVar.f3728d) == 0 && Float.compare(this.f3729e, dVar.f3729e) == 0 && f2.j.a(this.f3730f, dVar.f3730f);
    }

    public final int hashCode() {
        return this.f3730f.hashCode() + A.k.a(this.f3729e, Float.hashCode(this.f3728d) * 31, 31);
    }

    @Override // O0.b
    public final float r() {
        return this.f3729e;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f3728d + ", fontScale=" + this.f3729e + ", converter=" + this.f3730f + ')';
    }
}
