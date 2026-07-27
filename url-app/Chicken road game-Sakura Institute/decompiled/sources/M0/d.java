package M0;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public final float f3542d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3543e;

    /* renamed from: i, reason: collision with root package name */
    public final N0.a f3544i;

    public d(float f4, float f5, N0.a aVar) {
        this.f3542d = f4;
        this.f3543e = f5;
        this.f3544i = aVar;
    }

    @Override // M0.b
    public final long I(float f4) {
        return u3.l.p0(this.f3544i.a(f4), 4294967296L);
    }

    @Override // M0.b
    public final float e() {
        return this.f3542d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f3542d, dVar.f3542d) == 0 && Float.compare(this.f3543e, dVar.f3543e) == 0 && Intrinsics.a(this.f3544i, dVar.f3544i);
    }

    public final int hashCode() {
        return this.f3544i.hashCode() + AbstractC0017m.a(this.f3543e, Float.hashCode(this.f3542d) * 31, 31);
    }

    @Override // M0.b
    public final float j0(long j4) {
        if (n.a(m.b(j4), 4294967296L)) {
            return this.f3544i.b(m.c(j4));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // M0.b
    public final float q() {
        return this.f3543e;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f3542d + ", fontScale=" + this.f3543e + ", converter=" + this.f3544i + ')';
    }
}
