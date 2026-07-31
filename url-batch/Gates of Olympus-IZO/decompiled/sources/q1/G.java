package q1;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6863d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6864e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6865f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6866g;

    public G(boolean z3, boolean z4, int i3, boolean z5, boolean z6, int i4, int i5) {
        this.f6860a = z3;
        this.f6861b = z4;
        this.f6862c = i3;
        this.f6863d = z5;
        this.f6864e = z6;
        this.f6865f = i4;
        this.f6866g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return this.f6860a == g3.f6860a && this.f6861b == g3.f6861b && this.f6862c == g3.f6862c && Z1.i.a(null, null) && Z1.i.a(null, null) && Z1.i.a(null, null) && this.f6863d == g3.f6863d && this.f6864e == g3.f6864e && this.f6865f == g3.f6865f && this.f6866g == g3.f6866g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f6860a ? 1 : 0) * 31) + (this.f6861b ? 1 : 0)) * 31) + this.f6862c) * 923521) + (this.f6863d ? 1 : 0)) * 31) + (this.f6864e ? 1 : 0)) * 31) + this.f6865f) * 31) + this.f6866g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(G.class.getSimpleName());
        sb.append("(");
        if (this.f6860a) {
            sb.append("launchSingleTop ");
        }
        if (this.f6861b) {
            sb.append("restoreState ");
        }
        int i3 = this.f6866g;
        int i4 = this.f6865f;
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
        Z1.i.e(sb2, "sb.toString()");
        return sb2;
    }
}
