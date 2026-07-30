package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t02 implements p40 {
    public final float a;

    public t02(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            lh.e("The percent should be in the range of [0, 100]");
            throw null;
        }
    }

    @Override // defpackage.p40
    public final float a(long j, ca0 ca0Var) {
        return (this.a / 100.0f) * ql2.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t02) && Float.compare(this.a, ((t02) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
