package M0;

import H2.AbstractC0080b;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f2763d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2764e;

    /* renamed from: f, reason: collision with root package name */
    public final N0.a f2765f;

    public d(float f3, float f4, N0.a aVar) {
        this.f2763d = f3;
        this.f2764e = f4;
        this.f2765f = aVar;
    }

    @Override // M0.b
    public final long D(float f3) {
        return AbstractC0157a.N(4294967296L, this.f2765f.a(f3));
    }

    @Override // M0.b
    public final float a() {
        return this.f2763d;
    }

    @Override // M0.b
    public final float a0(long j3) {
        if (m.a(l.b(j3), 4294967296L)) {
            return this.f2765f.b(l.c(j3));
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
        return Float.compare(this.f2763d, dVar.f2763d) == 0 && Float.compare(this.f2764e, dVar.f2764e) == 0 && Z1.i.a(this.f2765f, dVar.f2765f);
    }

    public final int hashCode() {
        return this.f2765f.hashCode() + AbstractC0080b.a(this.f2764e, Float.hashCode(this.f2763d) * 31, 31);
    }

    @Override // M0.b
    public final float p() {
        return this.f2764e;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f2763d + ", fontScale=" + this.f2764e + ", converter=" + this.f2765f + ')';
    }
}
