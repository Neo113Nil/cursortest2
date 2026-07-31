package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: d, reason: collision with root package name */
    public final float f6517d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6518e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.a f6519f;

    public e(float f6, float f8, s2.a aVar) {
        this.f6517d = f6;
        this.f6518e = f8;
        this.f6519f = aVar;
    }

    @Override // r2.c
    public final float E(long j7) {
        if (p.a(n.b(j7), 4294967296L)) {
            return this.f6519f.b(n.c(j7));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // r2.c
    public final float b() {
        return this.f6517d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f6517d, eVar.f6517d) == 0 && Float.compare(this.f6518e, eVar.f6518e) == 0 && q6.i.a(this.f6519f, eVar.f6519f);
    }

    public final int hashCode() {
        return this.f6519f.hashCode() + a0.q.a(this.f6518e, Float.hashCode(this.f6517d) * 31, 31);
    }

    @Override // r2.c
    public final float i() {
        return this.f6518e;
    }

    @Override // r2.c
    public final long s(float f6) {
        return o.d0(4294967296L, this.f6519f.a(f6));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f6517d + ", fontScale=" + this.f6518e + ", converter=" + this.f6519f + ')';
    }
}
