package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qu0 {
    public final x5 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public qu0(x5 x5Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = x5Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final int a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return b11.c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qu0) {
            qu0 qu0Var = (qu0) obj;
            if (this.a == qu0Var.a && this.b == qu0Var.b && this.c == qu0Var.c && this.d == qu0Var.d && this.e == qu0Var.e && Float.compare(this.f, qu0Var.f) == 0 && Float.compare(this.g, qu0Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + qy0.b(this.f, qy0.c(this.e, qy0.c(this.d, qy0.c(this.c, qy0.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
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
        return qy0.l(sb, this.g, ')');
    }
}
