package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class da0 implements ca0 {
    public final float m;
    public final float n;

    public da0(float f, float f2) {
        this.m = f;
        this.n = f2;
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0Var = (da0) obj;
        return Float.compare(this.m, da0Var.m) == 0 && Float.compare(this.n, da0Var.n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.n) + (Float.hashCode(this.m) * 31);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.m);
        sb.append(", fontScale=");
        return q40.n(sb, this.n, ')');
    }
}
