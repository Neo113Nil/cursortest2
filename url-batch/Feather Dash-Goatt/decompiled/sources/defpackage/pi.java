package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class pi {
    public final String a;
    public final long b;
    public final int c;

    public pi(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            dd0.e("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            dd0.e("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pi piVar = (pi) obj;
        if (this.c == piVar.c && this.a.equals(piVar.a)) {
            return uq1.D(this.b, piVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, pi piVar);

    public int hashCode() {
        return qy0.e(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = this.b;
        sb.append((Object) (uq1.D(j, 12884901888L) ? "Rgb" : uq1.D(j, 12884901889L) ? "Xyz" : uq1.D(j, 12884901890L) ? "Lab" : uq1.D(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
