package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class az1 {
    public final ja a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public az1(ja jaVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = jaVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final w72 a(w72 w72Var) {
        return w72Var.g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(boolean z, long j) {
        if (z) {
            long j2 = jw2.b;
            if (jw2.a(j, j2)) {
                return j2;
            }
        }
        int i = jw2.c;
        int i2 = this.b;
        return th2.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final w72 c(w72 w72Var) {
        float f = -this.f;
        return w72Var.g((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return d.c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof az1) {
            az1 az1Var = (az1) obj;
            if (this.a == az1Var.a && this.b == az1Var.b && this.c == az1Var.c && this.d == az1Var.d && this.e == az1Var.e && Float.compare(this.f, az1Var.f) == 0 && Float.compare(this.g, az1Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + q40.d(this.f, q40.e(this.e, q40.e(this.d, q40.e(this.c, q40.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return q40.n(sb, this.g, ')');
    }
}
