package t3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8772a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8774c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8775d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8776e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8777f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8778g;

    public d0(boolean z8, boolean z9, int i7, boolean z10, boolean z11, int i8, int i9) {
        this.f8772a = z8;
        this.f8773b = z9;
        this.f8774c = i7;
        this.f8775d = z10;
        this.f8776e = z11;
        this.f8777f = i8;
        this.f8778g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f8772a == d0Var.f8772a && this.f8773b == d0Var.f8773b && this.f8774c == d0Var.f8774c && this.f8775d == d0Var.f8775d && this.f8776e == d0Var.f8776e && this.f8777f == d0Var.f8777f && this.f8778g == d0Var.f8778g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8772a ? 1 : 0) * 31) + (this.f8773b ? 1 : 0)) * 31) + this.f8774c) * 923521) + (this.f8775d ? 1 : 0)) * 31) + (this.f8776e ? 1 : 0)) * 31) + this.f8777f) * 31) + this.f8778g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0.class.getSimpleName());
        sb.append("(");
        if (this.f8772a) {
            sb.append("launchSingleTop ");
        }
        if (this.f8773b) {
            sb.append("restoreState ");
        }
        int i7 = this.f8778g;
        int i8 = this.f8777f;
        if (i8 != -1 || i7 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i8));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i7));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "sb.toString()");
        return sb2;
    }
}
