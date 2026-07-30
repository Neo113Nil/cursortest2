package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yn {
    public final float a;

    public yn(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, u81 u81Var) {
        float f = (i2 - i) / 2.0f;
        u81 u81Var2 = u81.m;
        float f2 = this.a;
        if (u81Var != u81Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn) && Float.compare(this.a, ((yn) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return q40.n(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
