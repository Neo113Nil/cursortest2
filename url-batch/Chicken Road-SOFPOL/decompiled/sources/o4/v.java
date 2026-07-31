package o4;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5692b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5693c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5694d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5695e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5696f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5697g;

    public v(boolean z3, boolean z7, int i, boolean z8, boolean z9, int i8, int i9) {
        this.f5691a = z3;
        this.f5692b = z7;
        this.f5693c = i;
        this.f5694d = z8;
        this.f5695e = z9;
        this.f5696f = i8;
        this.f5697g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f5691a == vVar.f5691a && this.f5692b == vVar.f5692b && this.f5693c == vVar.f5693c && this.f5694d == vVar.f5694d && this.f5695e == vVar.f5695e && this.f5696f == vVar.f5696f && this.f5697g == vVar.f5697g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f5691a ? 1 : 0) * 31) + (this.f5692b ? 1 : 0)) * 31) + this.f5693c) * 923521) + (this.f5694d ? 1 : 0)) * 31) + (this.f5695e ? 1 : 0)) * 31) + this.f5696f) * 31) + this.f5697g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(v.class.getSimpleName());
        sb.append("(");
        if (this.f5691a) {
            sb.append("launchSingleTop ");
        }
        if (this.f5692b) {
            sb.append("restoreState ");
        }
        int i = this.f5697g;
        int i8 = this.f5696f;
        if (i8 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i8));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
