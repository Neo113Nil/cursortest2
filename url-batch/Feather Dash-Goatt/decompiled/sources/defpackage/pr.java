package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pr implements nr {
    public final float d;
    public final float e;
    public final q20 g;

    public pr(float f, float f2, q20 q20Var) {
        this.d = f;
        this.e = f2;
        this.g = q20Var;
    }

    @Override // defpackage.nr
    public final float A(long j) {
        if (xh1.a(wh1.b(j), 4294967296L)) {
            return this.g.b(wh1.c(j));
        }
        dd0.j("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return Float.compare(this.d, prVar.d) == 0 && Float.compare(this.e, prVar.e) == 0 && this.g.equals(prVar.g);
    }

    @Override // defpackage.nr
    public final float f() {
        return this.e;
    }

    public final int hashCode() {
        return this.g.hashCode() + qy0.b(this.e, Float.hashCode(this.d) * 31, 31);
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d;
    }

    @Override // defpackage.nr
    public final long p(float f) {
        return t80.E(this.g.a(f), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.g + ')';
    }
}
