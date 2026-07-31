package t1;

/* renamed from: t1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8841c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8842d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8843e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8844f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8845g;

    public C1016D(boolean z3, boolean z4, int i3, boolean z5, boolean z6, int i4, int i5) {
        this.f8839a = z3;
        this.f8840b = z4;
        this.f8841c = i3;
        this.f8842d = z5;
        this.f8843e = z6;
        this.f8844f = i4;
        this.f8845g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1016D)) {
            return false;
        }
        C1016D c1016d = (C1016D) obj;
        return this.f8839a == c1016d.f8839a && this.f8840b == c1016d.f8840b && this.f8841c == c1016d.f8841c && f2.j.a(null, null) && f2.j.a(null, null) && f2.j.a(null, null) && this.f8842d == c1016d.f8842d && this.f8843e == c1016d.f8843e && this.f8844f == c1016d.f8844f && this.f8845g == c1016d.f8845g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8839a ? 1 : 0) * 31) + (this.f8840b ? 1 : 0)) * 31) + this.f8841c) * 923521) + (this.f8842d ? 1 : 0)) * 31) + (this.f8843e ? 1 : 0)) * 31) + this.f8844f) * 31) + this.f8845g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1016D.class.getSimpleName());
        sb.append("(");
        if (this.f8839a) {
            sb.append("launchSingleTop ");
        }
        if (this.f8840b) {
            sb.append("restoreState ");
        }
        int i3 = this.f8845g;
        int i4 = this.f8844f;
        if (i4 != -1 || i3 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
