package D;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f1178a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1179b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1180c;

    public A1(float f4, float f5, float f6) {
        this.f1178a = f4;
        this.f1179b = f5;
        this.f1180c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        return M0.e.a(this.f1178a, a12.f1178a) && M0.e.a(this.f1179b, a12.f1179b) && M0.e.a(this.f1180c, a12.f1180c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1180c) + AbstractC0017m.a(this.f1179b, Float.hashCode(this.f1178a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f4 = this.f1178a;
        sb.append((Object) M0.e.c(f4));
        sb.append(", right=");
        float f5 = this.f1179b;
        sb.append((Object) M0.e.c(f4 + f5));
        sb.append(", width=");
        sb.append((Object) M0.e.c(f5));
        sb.append(", contentWidth=");
        sb.append((Object) M0.e.c(this.f1180c));
        sb.append(')');
        return sb.toString();
    }
}
