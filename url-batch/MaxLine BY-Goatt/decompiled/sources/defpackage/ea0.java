package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ea0 implements ca0 {
    public final float m;
    public final float n;
    public final cq0 o;

    public ea0(float f, float f2, cq0 cq0Var) {
        this.m = f;
        this.n = f2;
        this.o = cq0Var;
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return mi2.n(4294967296L, this.o.a(f));
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        if (tw2.a(sw2.b(j), 4294967296L)) {
            return this.o.b(sw2.c(j));
        }
        lh.g("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return Float.compare(this.m, ea0Var.m) == 0 && Float.compare(this.n, ea0Var.n) == 0 && this.o.equals(ea0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + q40.d(this.n, Float.hashCode(this.m) * 31, 31);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.n;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.m + ", fontScale=" + this.n + ", converter=" + this.o + ')';
    }
}
