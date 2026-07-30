package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ze1 extends p4 {
    public final float q;
    public final float r;
    public final int s;
    public final int t;

    public ze1(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.q = f;
        this.r = f2;
        this.s = i;
        this.t = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze1)) {
            return false;
        }
        ze1 ze1Var = (ze1) obj;
        return this.q == ze1Var.q && this.r == ze1Var.r && this.s == ze1Var.s && this.t == ze1Var.t;
    }

    public final int hashCode() {
        return qy0.c(this.t, qy0.c(this.s, qy0.b(this.r, Float.hashCode(this.q) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.q);
        sb.append(", miter=");
        sb.append(this.r);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.s;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.t;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
