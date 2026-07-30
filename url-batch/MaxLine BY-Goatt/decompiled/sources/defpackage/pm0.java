package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pm0 {
    public final float a;
    public final float b;
    public final long c;

    public pm0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm0)) {
            return false;
        }
        pm0 pm0Var = (pm0) obj;
        return Float.compare(this.a, pm0Var.a) == 0 && Float.compare(this.b, pm0Var.b) == 0 && this.c == pm0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + q40.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
