package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y50 {
    public final long a;
    public final z50 b;
    public final float c;
    public final float d;
    public final boolean e;

    public y50(long j, z50 z50Var, float f, float f2, boolean z) {
        z50Var.getClass();
        this.a = j;
        this.b = z50Var;
        this.c = f;
        this.d = f2;
        this.e = z;
    }

    public static y50 a(y50 y50Var, float f, int i) {
        long j = y50Var.a;
        z50 z50Var = y50Var.b;
        if ((i & 4) != 0) {
            f = y50Var.c;
        }
        float f2 = f;
        float f3 = y50Var.d;
        boolean z = (i & 32) != 0 ? y50Var.e : true;
        z50Var.getClass();
        return new y50(j, z50Var, f2, f3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y50)) {
            return false;
        }
        y50 y50Var = (y50) obj;
        return this.a == y50Var.a && this.b == y50Var.b && Float.compare(this.c, y50Var.c) == 0 && Float.compare(0.78f, 0.78f) == 0 && Float.compare(this.d, y50Var.d) == 0 && this.e == y50Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qy0.b(this.d, qy0.b(0.78f, qy0.b(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Hazard(id=" + this.a + ", type=" + this.b + ", xProgress=" + this.c + ", laneY=0.78, speed=" + this.d + ", scored=" + this.e + ")";
    }
}
