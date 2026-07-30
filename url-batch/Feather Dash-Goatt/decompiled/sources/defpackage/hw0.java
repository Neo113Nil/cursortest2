package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hw0 implements in {
    public final float a;

    public hw0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            r80.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.in
    public final float a(long j, nr nrVar) {
        return (this.a / 100.0f) * va1.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw0) && Float.compare(this.a, ((hw0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
